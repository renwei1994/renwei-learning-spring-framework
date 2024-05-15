package com.renwei.populateBean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class JiaZhou1 {
	@Autowired
	private Map<String, School> maps;

	public Map<String, School> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, School> maps) {
		this.maps = maps;
	}

}

