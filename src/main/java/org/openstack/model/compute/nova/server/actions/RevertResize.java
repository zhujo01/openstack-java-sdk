package org.openstack.model.compute.nova.server.actions;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.openstack.model.common.JsonRootElement;
import org.openstack.model.compute.ServerAction;

@XmlRootElement(name="revertResize")
@JsonRootElement("revertResize")
public class RevertResize implements Serializable, ServerAction {

}
