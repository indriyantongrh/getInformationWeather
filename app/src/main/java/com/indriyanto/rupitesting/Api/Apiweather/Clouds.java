package com.indriyanto.rupitesting.Api.Apiweather;


import com.google.gson.annotations.SerializedName;


public class Clouds{

	@SerializedName("all")
	private int all;

	public void setAll(int all){
		this.all = all;
	}

	public int getAll(){
		return all;
	}
}