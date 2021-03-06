/*******************************************************************************
 * 	Copyright 2017 HuaWei Tld                                     
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
package org.openstack4j.model.loadbalance;

import org.openstack4j.model.ModelEntity;

public interface HealthCheckCreate extends ModelEntity {

	/**
	 * @return listener id
	 */
	String getListenerId();

	/**
	 * @return health check protocol
	 */
	String getHealthCheckProtocol();

	/**
	 * @return health check uri
	 */
	String getHealthCheckUri();

	/**
	 * @return health check connect port
	 */
	Integer getHealthCheckConnectPort();

	/**
	 * @return healthy threshold
	 */
	Integer getHealthyThreshold();

	/**
	 * @return unhealthy threshold
	 */
	Integer getUnhealthyThreshold();

	/**
	 * @return health check timeout
	 */
	Integer getHealthCheckTimeout();

	/**
	 * @return health check interval
	 */
	Integer getHealthCheckInterval();

}
