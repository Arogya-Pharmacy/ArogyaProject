package com.arogya.dao;

import java.util.List;

import com.arogya.entity.Entity;


public interface Dao {
	boolean check(Entity entity);
	boolean register(Entity entity);
	

}