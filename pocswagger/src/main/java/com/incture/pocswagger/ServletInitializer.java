package com.incture.pocswagger;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PocswaggerApplication.class);
	}
//	
//	protected String[] getServletMappings() {
//		return new String[] { "/swaggerpoc/*" };
//	}

}
