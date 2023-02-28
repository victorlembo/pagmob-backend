package com.example.cittamobi;

import java.util.List;

public class Service {
    private String routeCode;
    private String routeMnemonic;
    private int companyId;
    private int stopId;
    private int serviceId;
    private String serviceMnemonic;
    private String predictionType;
    private int activeVehicles;
    private int scheduledVehicles;
    private List<Message> messages;
    private List<Vehicle> vehicles;
    private boolean hasRealTime;
    
	public String getRouteCode() {
		return routeCode;
	}
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}
	public String getRouteMnemonic() {
		return routeMnemonic;
	}
	public void setRouteMnemonic(String routeMnemonic) {
		this.routeMnemonic = routeMnemonic;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getStopId() {
		return stopId;
	}
	public void setStopId(int stopId) {
		this.stopId = stopId;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceMnemonic() {
		return serviceMnemonic;
	}
	public void setServiceMnemonic(String serviceMnemonic) {
		this.serviceMnemonic = serviceMnemonic;
	}
	public String getPredictionType() {
		return predictionType;
	}
	public void setPredictionType(String predictionType) {
		this.predictionType = predictionType;
	}
	public int getActiveVehicles() {
		return activeVehicles;
	}
	public void setActiveVehicles(int activeVehicles) {
		this.activeVehicles = activeVehicles;
	}
	public int getScheduledVehicles() {
		return scheduledVehicles;
	}
	public void setScheduledVehicles(int scheduledVehicles) {
		this.scheduledVehicles = scheduledVehicles;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public boolean isHasRealTime() {
		return hasRealTime;
	}
	public void setHasRealTime(boolean hasRealTime) {
		this.hasRealTime = hasRealTime;
	}


    
    
    
    
}
