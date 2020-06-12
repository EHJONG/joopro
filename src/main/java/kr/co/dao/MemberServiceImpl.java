package kr.co.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.dto.MemberDTO;
import kr.co.mapper.MemberMapper;

@Repository
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper mapper;
	
	@Override
	public void insertMemberName(String name) {
		mapper.insertMemberName(name);
	}
	
	@Override
	public List<MemberDTO> listMember(MemberDTO dto) {
		return mapper.listMember(dto);
	}
	
	@Override
	public boolean existMember(String name) {
		return mapper.existMember(name);
	}
}
