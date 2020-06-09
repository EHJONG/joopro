package kr.co.dao;

import org.springframework.stereotype.Service;

import kr.co.dto.LoginDTO;

@Service
public interface LoginService {
	public void insertMember(LoginDTO dto);
}
