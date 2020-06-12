package kr.co.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import kr.co.dto.MemberInfoDTO;

@Mapper
public interface MemberInfoMapper {
	
	@Insert("INSERT INTO member_info(no, top, bottoms, price, completion, take_out) "
			+ "VALUES(#{no}, #{top}, #{bottoms}, #{price}, "
			+ "#{completion}, #{take_out})")
	public void insertMember_info(MemberInfoDTO dto);
	
}
