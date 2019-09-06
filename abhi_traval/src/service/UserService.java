package service;

import java.util.ArrayList;

import Dao.AdminDao;
import Dao.UserDao;
import entity.Service;

public class UserService {

	public static ArrayList<Service> searchservice(Service service) {
		
		return UserDao.searchService(service);
	}
	
	
	
	//  this method dependent on admindao class
	
	public static Service selectSerice(String sid) {
	  return AdminDao.searchByServiceNumber(sid);
	}
	
	
	
	
	
	
	
	
}
