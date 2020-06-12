package kr.co.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	@Select("SELECT * FROM member WHERE name = #{name}")
	public List<MemberDTO> listMember(MemberDTO dto);

	@Insert("INSERT INTO member(name) VALUES(#{name})")
	public void insertMemberName(String name);
	
	@Select("SELECT COUNT(*) FROM member WHERE name = #{name}")
	public boolean existMember(String name);
		
}
