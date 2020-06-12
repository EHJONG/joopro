package kr.co.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.dto.MemberDTO;

@Service
public interface MemberService {
	
	public void insertMemberName(String name);
	
	public List<MemberDTO> listMember(MemberDTO dto);

	public boolean existMember(String name);

}
