package com.ipru.icm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipru.icm.entity.ICM;
import com.ipru.icm.repository.ICMRepository;

@Service
public class ICMServiceImpl implements ICMService {

	@Autowired
	private ICMRepository iCMRepository;
	
	@Override
	public void saveICM(ICM icm) {
		iCMRepository.save(icm);
	}

	@Override
	public ICM getICM(int icmId) {
		Optional<ICM> icm = iCMRepository.findById(icmId);
		if(icm.isPresent())
			return icm.get();
		return null;
	}

}
