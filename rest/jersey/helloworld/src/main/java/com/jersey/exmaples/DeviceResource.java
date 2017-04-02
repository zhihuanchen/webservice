package com.jersey.exmaples;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.jersey.exmaples.dao.DeviceDao;
import com.jersey.exmaples.resource.Device;

@Path("device")
public class DeviceResource {
	 private final DeviceDao deviceDao;

	    public DeviceResource() {
	        deviceDao = new DeviceDao();
	    }

	    @GET
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public Device get(@QueryParam("ip") final String deviceIp) {
	        Device result = null;
	        if (deviceIp != null) {
	            result = deviceDao.getDevice(deviceIp);
	        }
	        return result;
	    }

	    @PUT
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public Device put(final Device device) {
	        Device result = null;
	        if (device != null) {
	            result = deviceDao.updateDevice(device);
	        }
	        return result;
	    }
}
