package kr.co.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import kr.co.dto.LoginDTO;

@Mapper
public interface LoginMapper {
	
	@Insert("insert into login(id, pw) values(#{id}, #{pw})")
	public void insertMember(LoginDTO loginDto);

}
