package org.openstack.model.compute.nova.server.actions;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.openstack.model.common.JsonRootElement;
import org.openstack.model.compute.Metadata;
import org.openstack.model.compute.ServerAction;
import org.openstack.model.compute.nova.NovaServerForCreate;

@XmlRootElement(name="rebuild")
@XmlAccessorType(XmlAccessType.NONE)
@JsonRootElement("rebuild")
public class RebuildAction implements Serializable, ServerAction {

	@XmlAttribute
	private String name;
	
	@XmlAttribute(name="auto_disk_config")
	private String autoDiskConfig;
	
	@XmlElement
	private Metadata metadata;
	
	@XmlElementWrapper(name = "personality")
	@XmlElement(name = "file")
	private List<NovaServerForCreate.File> personality;
	
	@XmlElement
	private String imageRef;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutoDiskConfig() {
		return autoDiskConfig;
	}

	public void setAutoDiskConfig(String autoDiskConfig) {
		this.autoDiskConfig = autoDiskConfig;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public List<NovaServerForCreate.File> getPersonality() {
		return personality;
	}

	public void setPersonality(List<NovaServerForCreate.File> personality) {
		this.personality = personality;
	}

	public String getImageRef() {
		return imageRef;
	}

	public void setImageRef(String imageRef) {
		this.imageRef = imageRef;
	}

}
