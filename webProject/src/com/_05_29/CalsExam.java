package com._05_29;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com._05_29.cal.Calc;
import com._05_29.cal.CalcParam;

/*
 * HttpServlet를 상속 받으면 java EE에서 제공해 주는 Class이다.
 * jsp기본 적으로 doPost와 doProcess가 자동으로 만들어 준다. 그렇기 때문에 '.jsp'파일에서 '.getParamater'함수를 이용할 수 있던 것이다.
 * */
public class CalsExam extends HttpServlet{
	
	/*	쉽게 생각하면 
		input값을 받고 넘겨주는 부분이 doGet/doPost부분 
		input값 가지고 조작 즉 print해주든 DB에 넣든 그런 부분이 doProcess이다.
	 */
	private static final long serialVersionUID = 1L;
	
	//서버로 요청이 GET 방식으로 올때 해당 함수로 간다.
	//길이 제한, URL에 표시
	//HttpServletRequest 서버에서 요청을 받는 것
	//HttpServletResponse 서버에서 응답을 내보내는 것
	//MVC 하려면 연산을 여기서 하면 안되겟징~
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		try {
			String inputNum1 = req.getParameter("inputNum1");
			String inputNum2 = req.getParameter("inputNum2");
			String operator = req.getParameter("operator");
			
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			
			CalcParam calcP = new CalcParam(num1, num2, operator);
			Calc cal = new Calc(calcP);
			cal.calculate();
			doProcess(resp, String.valueOf(calcP.getResult()));
		} catch (Exception e) {
			e.printStackTrace();			
			doProcess(resp, e.getMessage());
		}
	}
	
	//서버로 요청이 POST 방식으로 올때 해당 함수로 간다.
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String writeStr = "";
		UserController ul = new UserController(req);
		writeStr = ul.doAction();
		doProcess(resp, writeStr);
	}
	
	//응답 값 내보내는 함수
	public void doProcess(HttpServletResponse resp, String writeStr) throws IOException{
		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resp.getWriter();
		out.println(writeStr);
	}

}
