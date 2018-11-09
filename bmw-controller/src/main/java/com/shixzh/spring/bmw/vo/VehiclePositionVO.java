package com.shixzh.spring.bmw.vo;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/6 11:04
 */
public class VehiclePositionVO {

    private long timestamp;
    private double latitude;
    private double longitude;
    private int heading;
    private String session;

    public VehiclePositionVO(long timestamp, String session) {
        this.timestamp = timestamp;
        this.session = session;
    }

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

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}