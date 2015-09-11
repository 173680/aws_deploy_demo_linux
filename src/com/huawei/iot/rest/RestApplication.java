package com.huawei.iot.rest;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication extends ResourceConfig {
	public RestApplication() {  
	     //���������ڵİ�·��  
	     packages("com.huawei.iot.resource");  
	     //ע��JSONת����  
	     register(CrossDomainFilter.class);
	     register(JacksonJsonProvider.class);
	   
	    }  
}
