package com._05_30;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resq) throws IOException{
		String idStr = req.getParameter("id");
		String pwStr = req.getParameter("pw");
		String action = req.getParameter("action");
		System.out.println(action);
		LoginService ls = new LoginService();
		boolean isLogin = ls.login(idStr, pwStr);	
		String result = idStr;
		if(isLogin){
			result += "님 로그인에 성공 하셨습니다.";
		}else{
			result += "님 로그인에 실패 하셨습니다.";
		}
		doProcess(resq, result);
		
	/*	RegisterEntity reg = new RegisterEntity(idStr, pwStr);		
		String result = Register.tryRegister(reg);		
		doProcess(resq, result);*/
				
		/*RegisterEntity reg = new RegisterEntity(idStr, pwStr);		
		List<RegisterEntity> list = Register.tryRegisters(reg);
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i).toString();
		}
		
		doProcess(resq, result);*/
	}
	
	public void dePost(HttpServletRequest req, HttpServletResponse reqs) throws IOException{
		
	}

	
	public void doProcess(HttpServletResponse resq, String writeStr) throws IOException {
		resq.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resq.getWriter();
		out.println(writeStr);
	}
}