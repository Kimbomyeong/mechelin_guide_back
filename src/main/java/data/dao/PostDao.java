package data.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import data.dto.PostDto;

@Repository
public class PostDao extends SqlSessionDaoSupport implements PostDaoInter {

	@Override
	public void insertPost(PostDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().insert("insertOfPost", dto);
	}
	/*
	 * 유저가 게시글 삭제를 눌렀을때 실행되는 메소드
	 */
	@Override
	public void deleteUserPost(int id) {
		// TODO Auto-generated method stub
		getSqlSession().update("deleteUserOfPost", id);
	}
	/*
	 * 관리자가 게시글 삭제를 눌렀을때 실행되는 메소드
	 */
	@Override
	public void deleteAdminPost(int id) {
		// TODO Auto-generated method stub
		getSqlSession().delete("deleteAdminOfPost", id);
	}
	/*
	 * 좋아요 버튼을 눌렀을때 좋아요 값을 1증가 1감소 시키는 메소드
	 */
	@Override
	public void updateLikePost(HashMap<String, Integer> map) {
		// TODO Auto-generated method stub
		getSqlSession().update("updateLikeOfPost", map);
	}
	/*
	 * id에 해당하는 리뷰글 데이터 반환
	 */
	@Override
	public PostDto selectDataPost(int id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("selectDataOfPost", id);
	}
	/*
	 * 리뷰글 수정
	 */
	@Override
	public void updatePost(PostDto dto) {
		// TODO Auto-generated method stub
		getSqlSession().update("updateOfPost", dto);
	}
	/*
	 * 방금 등록한 리뷰글의 id와 user_place_id 반환
	 */
	@Override
	public PostDto selectLatelyPost(int id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("selecLatelyOfPost", id);
	}
	/*
	 * user_place_id에 해당하는 모든 리뷰글 데이터 반환
	 */
	@Override
	public List<PostDto> selectUPDataPost(int user_place_id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("selectUPDataOfPost", user_place_id);
	}
	

}
