package org.openstack4j.openstack.loadbalance.domain;

import org.openstack4j.model.ModelEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ELBJob implements ModelEntity {

	private static final long serialVersionUID = -9066246275462546075L;
	
	@JsonProperty
	private String uri;
	
	@JsonProperty("job_id")
	private String jobId;
}
