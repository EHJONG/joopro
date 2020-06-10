package kr.co.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.dto.LoginDTO;
import kr.co.mapper.LoginMapper;
import lombok.Setter;

@Repository
public class LoginDAO implements LoginService{
	
	@Setter(onMethod_ = @Autowired)
	LoginMapper mapper;
	
	@Override
	public void insertMember(LoginDTO dto) {
		System.out.println("1");
		mapper.insertMember(dto);
	}
	
	@Override
	public boolean checkId(String id) {
		return mapper.checkId(id);
	}
	
	@Override
	public String checkPw(String id) {
		return mapper.checkPw(id);
	}
}
