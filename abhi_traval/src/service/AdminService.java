package service;

import java.util.ArrayList;

import Dao.AdminDao;
import entity.Administrator;
import entity.Feedback;
import entity.Service;

public class AdminService {



		public static int adminRegistration(Administrator administrator) {
			
		return AdminDao.adminRegistration(administrator);
		
	}
		
		
		public static int adminLogin(Administrator administrator) {
			return AdminDao.adminLogin(administrator);
		}
		
		
		public static int feedback(Feedback feedback) {
			return AdminDao.feedback(feedback);
		}
		
		
		
		public static ArrayList<Feedback> viewFeedback() {
         return AdminDao.viewFeedback();
		}
		
		
		public static int addService(Service service) {
			return AdminDao.addService(service);
		}
		
		
		public static ArrayList<Service> schedules() {
			return AdminDao.schedules();
		}
		
		

		public static Service searchByServiceNumber(String sid) {
			return AdminDao.searchByServiceNumber(sid);
		}

		
		public static int update(Service service) {
				return	AdminDao.update(service);
		}

}
