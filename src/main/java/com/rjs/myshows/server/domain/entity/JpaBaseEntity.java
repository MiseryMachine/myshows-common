package com.rjs.myshows.server.domain.entity;

import javax.persistence.*;

import com.rjs.myshows.server.domain.BaseElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class JpaBaseEntity extends BaseElement<Long> {
	protected JpaBaseEntity() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@Override
	public Long getElementId() {
		return super.getElementId();
	}

	@Override
	public void setElementId(Long elementId) {
		super.setElementId(elementId);
	}
}
