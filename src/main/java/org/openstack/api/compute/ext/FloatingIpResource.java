package org.openstack.api.compute.ext;

import java.util.Map;

import javax.ws.rs.client.Target;
import javax.ws.rs.core.MediaType;

import org.openstack.api.common.Resource;
import org.openstack.model.compute.FloatingIp;
import org.openstack.model.compute.nova.NovaConsole;
import org.openstack.model.compute.nova.floatingip.NovaFloatingIp;

/**
 * FloatingIpResource Support
 * 
 * @author sp
 *
 */
public class FloatingIpResource extends Resource {

	public FloatingIpResource(Target target) {
		super(target);
	}
	
	public FloatingIp get(Map<String, Object> properties) {
		return target.request(MediaType.APPLICATION_JSON).get(NovaFloatingIp.class);
	}
	
	public void delete() {
		 target.request().delete();	
	}

}
