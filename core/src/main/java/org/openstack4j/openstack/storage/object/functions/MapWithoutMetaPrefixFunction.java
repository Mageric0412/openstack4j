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
package org.openstack4j.openstack.storage.object.functions;

import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;

/**
 * Transforms a Swift Metadata Map into a Map without the meta prefix as key values
 * 
 * @author Jeremy Unruh
 */
public class MapWithoutMetaPrefixFunction implements Function<Map<String, String>, Map<String, String>> {

    public static final MapWithoutMetaPrefixFunction INSTANCE = new MapWithoutMetaPrefixFunction();
    
    @Override
    public Map<String, String> apply(Map<String, String> input) {
        ImmutableMap.Builder<String, String> metadata = ImmutableMap.builder();
        for (String key : input.keySet()) {
        	  if (key == null) {
        	  	continue;
        	  }
            int idx = key.indexOf("-Meta-");
            if (idx > -1) {
                metadata.put(key.substring(idx + 6), input.get(key));
            }
            if (key.indexOf("X-") > -1) {
                metadata.put(key, input.get(key));
            }
        }
        return metadata.build();
    }
    

}
