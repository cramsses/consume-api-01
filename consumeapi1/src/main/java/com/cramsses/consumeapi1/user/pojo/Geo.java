package com.cramsses.consumeapi1.user.pojo;

public class Geo {
 private String lat;
 private String lng;
 
 public String getLat() {
  return lat;
 }
 public void setLat(String lat) {
  this.lat = lat;
 }
 public String getLng() {
  return lng;
 }
 @Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Geo [lat=");
	builder.append(lat);
	builder.append(", lng=");
	builder.append(lng);
	builder.append("]");
	return builder.toString();
}
public void setLng(String lng) {
  this.lng = lng;
 }
}