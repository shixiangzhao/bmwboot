package com.shixzh.spring.bmw.dto;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/8 10:44
 */
public class VehiclePositionDTO {

    private long timestamp;
    private double latitude;
    private double longitude;
    private int heading;
    private String sessionId;
    private String vehicleId;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "VehiclePositionDTO{" +
                "timestamp=" + timestamp +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", heading=" + heading +
                ", sessionId='" + sessionId + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                '}';
    }
}