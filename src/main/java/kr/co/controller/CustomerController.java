package kr.co.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.dao.MemberServiceImpl;
import kr.co.dto.MemberDTO;

@RequestMapping("/customer/*")
@Controller
public class CustomerController {
	
	@Autowired
	private MemberServiceImpl impl;
	
	@PostMapping("/register")
	public String member(@RequestParam(value = "name", required =false)String name) {
		impl.insertMemberName(name);
		return "member";
	}
	
//	손님 검색 로직
	@GetMapping("/search")
	public String search(MemberDTO dto, Model model) {
		System.out.println("name : "+dto.getName());
		System.out.println("impl : "+impl.existMember(dto.getName()));
		if(!impl.existMember(dto.getName())) {
			model.addAttribute("not_exist_name", "이름이 없습니다.");
			return "login_success";
		}
		
		List<MemberDTO> list = impl.listMember(dto);
		model.addAttribute("list", list);
		return "search";
	}
	
}
