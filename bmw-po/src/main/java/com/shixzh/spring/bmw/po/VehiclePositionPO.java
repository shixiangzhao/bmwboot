package com.shixzh.spring.bmw.po;

/**
 * @author: ZhaoShixiang <br>
 * @date: 2018/11/8 10:44
 */
public class VehiclePositionPO {

    private long timestamp;
    private double latitude;
    private double longitude;
    private int heading;
    private String session;

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

    @Override
    public String toString() {
        return "ViheclePositionPO{" +
                "timestamp=" + timestamp +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", heading=" + heading +
                ", session='" + session + '\'' +
                '}';
    }
}