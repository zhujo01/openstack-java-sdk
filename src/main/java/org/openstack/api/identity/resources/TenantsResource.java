package org.openstack.api.identity.resources;

import javax.ws.rs.client.Target;
import javax.ws.rs.core.MediaType;

import org.openstack.api.common.Resource;
import org.openstack.model.identity.TenantList;
import org.openstack.model.identity.keystone.KeystoneTenantList;

public class TenantsResource extends Resource {

	public TenantsResource(Target target) {
		super(target);
	}
	
	public TenantList get() {
		return target.request(MediaType.APPLICATION_JSON).get(KeystoneTenantList.class);
	}

}
