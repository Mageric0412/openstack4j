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
package org.openstack4j.model.heat;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.heat.builder.StackCreateBuilder;

/**
 * This interface describes the model of a {@link Stack}, before it is sent to
 * the server for creation
 * 
 * @author Matthias Reisser
 * 
 */
public interface StackCreate extends BaseStackCreateUpdate, Buildable<StackCreateBuilder> {

	boolean getDisableRollback();
	
	/**
     * Returns the name of the stack to create
     * 
     * @return the name of the stack to create
     */
    String getName();
}
