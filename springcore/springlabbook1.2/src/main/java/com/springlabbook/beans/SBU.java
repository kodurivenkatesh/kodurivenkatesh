package com.springlabbook.beans;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	@Value("${sbuId}")
	private String sbuId;
	@Value("${sbuName}")
	private String sbuName;
	@Value("${sbuHead}")
	private  String sbuHead;
	
	public SBU()
	{
		
	}
	
	public SBU(String sbuName, String sbuHead)
	{
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;	
	}

	public String getSbuId() {
		return sbuId;
	}

	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

}

