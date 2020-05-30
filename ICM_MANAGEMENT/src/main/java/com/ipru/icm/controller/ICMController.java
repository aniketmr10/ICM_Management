package com.ipru.icm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ipru.icm.entity.Cases;
import com.ipru.icm.entity.ICM;
import com.ipru.icm.service.ICMService;

@RestController
public class ICMController {
	
	@Autowired
	private ICMService iCMService;
	
	/*
	 * @RequestMapping("/add") public void addICM() { ICM i = new ICM();
	 * i.setDescription("T50"); i.setRole("developer"); i.setAssignee("Aniket");
	 * i.setAssigned("Sunil");
	 * 
	 * List<Cases> cases = new ArrayList<Cases>(); Cases c1 = new Cases();
	 * c1.setDescription("PPT not working"); c1.setStatus("open"); cases.add(c1);
	 * Cases c2 = new Cases(); c2.setDescription("Fund not loading");
	 * c2.setStatus("close"); cases.add(c2); i.setCases(cases);
	 * iCMService.saveICM(i); }
	 */
	
	@PostMapping("add")
	public void addICM(@RequestBody ICM icm) {
		iCMService.saveICM(icm);
	}
	
	@RequestMapping("/get/{id}")
	public ICM getICM(@PathVariable("id")int id) {
		ICM icm = iCMService.getICM(id);
		return icm;
	}
}
