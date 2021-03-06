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
package org.openstack4j.sample.scaling;

import java.util.List;

import org.openstack4j.model.scaling.ScalingQuota;
import org.openstack4j.sample.AbstractSample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ASQuotasSample extends AbstractSample {

	private static final Logger logger = LoggerFactory.getLogger(ASQuotasSample.class);

	@Test
	public void testListAutoScalingQuotas() {
		String groupId = "6e42cf82-8157-41eb-a2bc-784f18fa9c2a";
		List<? extends ScalingQuota> all = osclient.autoScaling().quotas().list();
		logger.info("{}", all);

		List<? extends ScalingQuota> list = osclient.autoScaling().quotas().list(groupId);
		logger.info("{}", list);
	}
}
