package kr.co.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.dao.LoginDAO;
import kr.co.dto.LoginDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private LoginDAO dao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}

	// 회원 가입 로직
	@PostMapping("go")
	public String go(LoginDTO dto) {
		// password는 비밀번호 해시 값
		String password = BCrypt.hashpw(dto.getPw(), BCrypt.gensalt());
		// 해시 된 문자열을 dto의 Pw로 초기화
		dto.setPw(password);
		// DB에 dto 정보 저장
		dao.insertMember(dto);
		return "go";
	}

	// 로그인 창만 뛰어줌 
	@PostMapping("login")
	public String login() {
		return "login";
	}

	// 로그인 기능 로직
	@PostMapping("login_success")
	public String login_success(LoginDTO dto, Model model, HttpSession session) {
		// chck는 디비에 아이디가 있는 경우 true , 없을 시 false
		boolean chck = dao.checkId(dto.getId());
		if (!chck) {
			// model에 msg를 담아서 뷰 단으로 넘긴다.
			model.addAttribute("msg", "아이디가 없습니다");
			return "login";
		}
		System.out.println("dto.getPw() : "+dto.getPw());
		
		// 뷰 단에서 입력 한 id의 pw가 맞는지 체크 한다. 맞을 시 true, 틀릴시 false
		// dto.getPw()는 뷰단에서 입력한 pw , dao.checkPw(dto.getId()))는 뷰 단에서 입력한 id값의 pw를 가져오는 역할을 한다. 
		if (BCrypt.checkpw(dto.getPw(), dao.checkPw(dto.getId()))) {
			session.setAttribute("login", dto.getId());
			return "login_success";
		} else {
			// 비밀번호가 틀릴 시 view layer로 not_found_pw 메세지를 넘긴다. 
			model.addAttribute("not_found_pw", "비밀번호가 틀렸습니다");
			return "login";
		}
	}
}
