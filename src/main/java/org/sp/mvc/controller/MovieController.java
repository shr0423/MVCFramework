package org.sp.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sp.mvc.model.blood.BloodManager;
import org.sp.mvc.model.movie.MovieManager;

//혈액형요청을 전담하여 처리하는 하위컨트롤러
public class MovieController implements Controller{
	MovieManager manager;
	
	//일시키기(3단계)
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//파라미터 꺼내기
		String movie=request.getParameter("movie");
		
		manager=new MovieManager();
		String msg=manager.getAdvice(movie);
		
		//4단계)결과페이지로 가져갈 데이터 저장
		request.setAttribute("msg", msg);
		
		
		
		
	}
	@Override
	public String getViewKey() {
		
		return "movieView";
	}
}
