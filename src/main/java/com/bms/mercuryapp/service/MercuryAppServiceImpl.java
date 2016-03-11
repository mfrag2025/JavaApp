package com.bms.mercuryapp.service;

/**
 * @author d.kumar.samantaray
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.mercuryapp.dao.MercuryAppDAO;

@Service("mercuryService")
public class MercuryAppServiceImpl implements MercuryAppService{

	@Autowired
	MercuryAppDAO mercuryAppDAO;
	
	public String getUserService(){
		System.out.println("Hey It's Service layer getUserService method ..");
		mercuryAppDAO.getUserDao();
		return null;
	}

	public String searchByJobIdService(String jobId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
