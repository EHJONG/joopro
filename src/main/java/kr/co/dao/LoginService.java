package kr.co.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.dto.LoginDTO;

@Service
public interface LoginService {
	public void insertMember(LoginDTO dto);
	
	public boolean checkId(String id);
	
	public String checkPw(String id);
}
