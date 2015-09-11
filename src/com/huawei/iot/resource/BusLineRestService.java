package com.huawei.iot.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.huawei.iot.service.BusLineService;
import com.huawei.iot.util.RestResult;

@Path("/smartbus")
public class BusLineRestService {


	//@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
	//@Produces("text/plain;charset=UTF-8")
	@GET
	@Consumes("application/json;charset=UTF-8")
	@Produces("application/json;charset=UTF-8")
	public RestResult getAllLines() {
		RestResult result = new RestResult();
		result.setCode(RestResult.FAILED);
		result.setDescription("fail to post empty datas");
		
		List resultList = BusLineService.getAllLines();
		if(null == resultList || resultList.size() == 0){
			return result;
		}
		result.setCode(RestResult.SUCCESS);
		result.setData(resultList);
		result.setDescription("Success to update datas");
		return result;
	}
}
