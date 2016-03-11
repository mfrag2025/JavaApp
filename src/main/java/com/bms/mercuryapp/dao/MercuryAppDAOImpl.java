package com.bms.mercuryapp.dao;

/**
 * @author d.kumar.samantaray
 *
 */
import org.springframework.stereotype.Repository;

@Repository("merquryDao")
public class MercuryAppDAOImpl implements MercuryAppDAO{

	
	public String getUserDao(){
		System.out.println("Hey It's DAO layer getUserDAO method ..");
		boolean flag = false;
		String userName = "";
		String password = "";
		if (userName.equals("") && password.equals("")){
			flag = true;
		}
		//return flag;
		return null;
	}

	public String searchByJobIdDAO(String jobId) {
		// TODO Auto-generated method stub
		return null;
	}
}
