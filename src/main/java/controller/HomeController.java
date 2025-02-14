package controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sql;

	@GetMapping("/home")
	public String home() {
		return "home- " + sql.selectOne("sql.test");
	}
	
}