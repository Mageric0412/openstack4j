/*******************************************************************************
 * 	Copyright 2017 HuaWei TLD and OTC                                    
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
package org.openstack4j.openstack.key.management.domain;

import org.openstack4j.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author QianBiao.NG
 * @date   2017-07-13 10:06:50
 */
public class KeyWrap implements ModelEntity {

	private static final long serialVersionUID = 1L;

	@JsonProperty("key_info")
	private Key key;
	
	public KeyWrap() {
	}

	public KeyWrap(Key key) {
		this.key = key;
	}

	public Key getKey() {
		return key;
	}
}
