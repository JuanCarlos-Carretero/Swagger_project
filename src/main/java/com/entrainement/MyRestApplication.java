package com.entrainement;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.entrainement.rest.Resources;

import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;

@ApplicationPath("/api")
public class MyRestApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();

		resources.add(Resources.class);

		resources.add(OpenApiResource.class);

		return resources;
	}
}