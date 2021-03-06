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
package org.openstack4j.api.sahara;

import java.util.List;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.sahara.Cluster;
import org.openstack4j.model.sahara.NodeGroup;

/**
 * Sahara Data Processing Operations
 * 
 * @author Ekasit Kijsipongse
 */
public interface ClusterService extends RestService {

	/**
	 * List all clusters
	 * 
	 * @return list of images or empty
	 */
	List<? extends Cluster> list();

	/**
	 * Get a cluster by ID
	 * @param clusterId the cluster identifier
	 * @return the cluster or null if not found
	 */
	Cluster get(String clusterId);

	/**
	 * Create a new cluster
	 * 
	 * @param cluster the cluster to create
	 * @return the created cluster
	 */
	Cluster create(Cluster cluster);

	/**
	 * Delete the specified cluster 
	 * 
	 * @param clusterId the cluster identifier
	 * @return the action response
	 */
	ActionResponse delete(String clusterId);

	/**
	 * Resize a node group in the specified cluster 
	 * 
	 * @param clusterId the cluster identifier
	 * @param groupName the name of the node group
	 * @param count the number of instances in the node group
	 * @return the updated cluster
	 */
	Cluster resizeNodeGroup(String clusterId, String groupName, int count);

	/**
	 * Add a new node group in the specified cluster 
	 * 
	 * @param clusterId the cluster identifier
	 * @param nodeGroup the new node group
	 * @return the updated cluster
	 */
	Cluster addNodeGroup(String clusterId, NodeGroup nodeGroup);

	/**
	 * 
	 * Expand a cluster
	 * 
	 * @param clusterId the cluster identifier
	 * @param amount	 specify the node amount to expand 
	 * @return
	 */
	ActionResponse expand(String clusterId, int amount);

	/**
	 * 
	 * Reduce a cluster
	 * 
	 * @param clusterId the cluster identifier
	 * @param amount	 specify the node amount to reduce 
	 * @param includes  the instance(id) list to be reduced
	 * @param excludes  the instance(id) list should not be reduced
	 * @return the action response
	 */
	ActionResponse reduce(String clusterId, int amount, List<String> includes, List<String> excludes);

}
