/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package org.openstack4j.model.common.header;

/**
 * A Range is used to get portions of data by using one or more range specifications.
 * 
 * @author Jeremy Unruh
 */
public class Range implements HeaderOption {

    static final String RANGE_HEADER_NAME = "Range";
    static final String RANGE_HEADER_VALUE_PREFIX = "bytes=";
    
    protected long offset;
    protected long length;
    
    Range(long offset, long length) {
        this.offset = offset;
        this.length = length;
    }

    /**
     * Return only the last N bytes of data
     * 
     * @param lastBytes the last N bytes to return
     * @return the range object
     */
    public static Range last(long lastBytes) {
        return new Range(-1, lastBytes);
    }
    
    /**
     * Return only bytes starting from 0 to {@code maxBytes} of data
     * 
     * @param maxBytes the max bytes to download
     * @return the range object
     */
    public static Range first(long maxBytes) {
        return new Range(0, maxBytes);
    }
    
    /**
     * Return all bytes after the specified {@code offset} of data
     * 
     * @param offset the starting pointer
     * @return the range object
     */
    public static Range startAt(long offset) {
        return new Range(offset, -1);
    }
    
    /**
     * Return bytes only from {@code offset} in bytes to the specified {@code lastByte}
     * 
     * @param offset the starting pointer
     * @param lastByte the last byte
     * @return the range object
     */
    public static Range from(long offset, long lastByte) {
        return new Range(offset, lastByte);
    }

    @Override
    public HeaderNameValue toHeader() {
        return new HeaderNameValue(RANGE_HEADER_NAME, RANGE_HEADER_VALUE_PREFIX + value());
    }
    
    public String value() {
        return (offset >= 0 ? Long.toString(offset) : "") +
                "-" +
               (length >= 0 ? Long.toString(length) : "");
    }
}
