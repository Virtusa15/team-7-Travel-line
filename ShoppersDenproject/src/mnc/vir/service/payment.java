package mnc.vir.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mnc.vir.bean.item;
import mnc.vir.bean.paymentproduct;
import mnc.vir.dao.paymentdao;
import mnc.vir.utility.Order;


public class payment extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 PrintWriter p=res.getWriter();
		int ct=0;
		paymentdao pd=new paymentdao();
		paymentproduct pp=new paymentproduct();
		HttpSession session = req.getSession();
		Order o=(Order)session.getAttribute("order");
		String user = (String) session.getAttribute("uname");
		ArrayList<item> list=(ArrayList)o.getCartDetails();
		for(item i:list){
			++ct;
		pp.setUid(user);
		pp.setName(i.getIname());
		pp.setCost(i.getCost());
		ct=pd.insert(pp);
		}
		p.println("<body style='color:red;text-align:center'><br>");
		p.println(" <font size='8'>Successfully Your Details submitted</font><br>");
		p.println("  <font size='8'>We will Deliver with in 2 days to Given Address</font><br>");
		p.println(" <font size='8'>Thank You</font>");
		p.println("</body>");
	}

}
