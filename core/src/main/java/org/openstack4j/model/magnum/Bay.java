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
package org.openstack4j.model.magnum;

import java.util.List;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.openstack.common.GenericLink;

public interface Bay extends ModelEntity, Buildable<BayBuilder> {
	/**
	 * Gets status
	 * 
	 * @return status
	 */
	String getStatus();

	/**
	 * Gets uuid
	 * 
	 * @return uuid
	 */
	String getUuid();

	/**
	 * Gets links
	 * 
	 * @return links
	 */
	List<GenericLink> getLinks();

	/**
	 * Gets stackId
	 * 
	 * @return stackId
	 */
	String getStackId();

	/**
	 * Gets createdAt
	 * 
	 * @return createdAt
	 */
	String getCreatedAt();

	/**
	 * Gets apiAddress
	 * 
	 * @return apiAddress
	 */
	String getApiAddress();

	/**
	 * Gets discoveryUrl
	 * 
	 * @return discoveryUrl
	 */
	String getDiscoveryUrl();

	/**
	 * Gets updatedAt
	 * 
	 * @return updatedAt
	 */
	String getUpdatedAt();

	/**
	 * Gets masterCount
	 * 
	 * @return masterCount
	 */
	Integer getMasterCount();

	/**
	 * Gets coeVersion
	 * 
	 * @return coeVersion
	 */
	String getCoeVersion();

	/**
	 * Gets baymodelId
	 * 
	 * @return baymodelId
	 */
	String getBaymodelId();

	/**
	 * Gets masterAddresses
	 * 
	 * @return masterAddresses
	 */
	List<String> getMasterAddresses();

	/**
	 * Gets nodeCount
	 * 
	 * @return nodeCount
	 */
	Integer getNodeCount();

	/**
	 * Gets nodeAddresses
	 * 
	 * @return nodeAddresses
	 */
	List<String> getNodeAddresses();

	/**
	 * Gets statusReason
	 * 
	 * @return statusReason
	 */
	String getStatusReason();

	/**
	 * Gets bayCreateTimeout
	 * 
	 * @return bayCreateTimeout
	 */
	String getBayCreateTimeout();

	/**
	 * Gets name
	 * 
	 * @return name
	 */
	String getName();

}
