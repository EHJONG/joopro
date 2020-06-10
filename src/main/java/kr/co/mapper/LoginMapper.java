package kr.co.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.dto.LoginDTO;

@Mapper
public interface LoginMapper {
	
	@Insert("insert into login(id, pw) values(#{id}, #{pw})")
	public void insertMember(LoginDTO loginDto);

	@Select("select count(*) from login where id = #{id}")
	public boolean checkId(String id);
	
	// 입력 한 id의 pw를 확인 한다
	@Select("SELECT pw FROM login where id = #{id}")
	public String checkPw(String id);
}
