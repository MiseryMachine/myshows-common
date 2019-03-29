package com.rjs.myshows.server.domain.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import com.rjs.myshows.server.domain.entity.ShowEntity;

@Component
public class ShowResourceAssembler extends ResourceAssemblerSupport<ShowEntity, ShowResource> {
	public ShowResourceAssembler() {
		super(ShowEntity.class, ShowResource.class);
	}

	@Override
	public ShowResource<Long> toResource(ShowEntity showEntity) {
		return new ShowResource<>(showEntity);
	}
}
