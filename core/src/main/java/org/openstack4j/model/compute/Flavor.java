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
/*
 * 
 */
package org.openstack4j.model.compute;

import java.util.List;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.common.Link;
import org.openstack4j.model.compute.builder.FlavorBuilder;

/**
 * An OpenStack Flavor which is a template used for configuration against running Instances
 * 
 * @author Jeremy Unruh
 */
public interface Flavor extends ModelEntity, Buildable<FlavorBuilder> {

	/**
	 * @return the id for this flavor
	 */
	String getId();
	
	/**
	 * @return the descriptive name of the flavor
	 */
	String getName();
	
	/**
	 * @return the Memory in MB for the flavor
	 */
	int getRam();
	
	/**
	 * @return the Number of VCPUs for the flavor
	 */
	int getVcpus();
	
	/**
	 * @return the size of the local disk in GB
	 */
	int getDisk();
	
	/**
	 * @return the Swap space in MB
	 */
	int getSwap();
	
	/**
	 * @return the RX/TX factor
	 */
	float getRxtxFactor();
	
	/**
	 * Gets the ephemeral.
	 *
	 * @return the ephemeral
	 */
	int getEphemeral();
	
	/**
	 * Gets the rxtx quota.
	 *
	 * @return the rxtx quota
	 */
	int getRxtxQuota();
	
	/**
	 * Gets the rxtx cap.
	 *
	 * @return the rxtx cap
	 */
	int getRxtxCap();
	
	/**
	 * Checks if is public.
	 *
	 * @return true, if is public
	 */
	Boolean isPublic();
	
	/**
	 * Checks if is disabled.
	 *
	 * @return true, if is disabled
	 */
	Boolean isDisabled();
	
	/**
	 * Gets the links.
	 *
	 * @return the links
	 */
	List<? extends Link> getLinks();
	
}
