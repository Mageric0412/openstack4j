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
package org.openstack4j.model.common.functions;

import org.openstack4j.model.common.IdEntity;

import com.google.common.base.Function;

/**
 * A function which transforms an IdEntity into a String identifier
 * 
 * @author Jeremy Unruh
 */
public class IdEntityToString implements Function<IdEntity, String> {

    public static final IdEntityToString INSTANCE = new IdEntityToString();
    
    @Override
    public String apply(IdEntity input) {
        return input.getId();
    }

}
