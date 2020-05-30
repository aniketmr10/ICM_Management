package com.ipru.icm.service;

import com.ipru.icm.entity.ICM;

public interface ICMService {
	public void saveICM(ICM icm);
	public ICM getICM(int icmId);
}
