package site.gaoyisheng.dao;

import java.util.List;
import java.util.Map;

import site.gaoyisheng.pojo.User11;
import site.gaoyisheng.pojo.User11;

public interface UserMapper11 {
	
	/**
	 * 不区分身份，返回所有用户.
	 * TODO
	 * @return
	 */
	List<User11> selectAllUser();
	
	/**
	 * 按身份查询.
	 * TODO
	 * @param identity
	 * @return
	 */
	List<User11> selectAllUserByIdentity(String identity);
	
	/**
	 * 按身份查询.
	 * 除identity外,所有
	 * TODO
	 * @param identity
	 * @return
	 */
	List<User11> selectAllUserExceptIdentity(String identity);
	
	/**
	 * 按老师id,[班级id]查询.
	 * 除identity外,所有
	 * TODO
	 * @param identity
	 * @return
	 */
	List<UserTeamForm> selectByTeacherIdAndTeamId(Map<String, Integer> param);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int insert(User11 record);
    
    /**
     * .
     * TODO
     * @param record
     * @return 返回的并不是id,而是 0,1 = false,true
     */
    int insertCacheId(User11 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int insertSelective(User11 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    User11 selectByPrimaryKey(Integer id);
    
    List<User11> selectByTeamId(Integer teamId);
    
    /**
     * 。
     * login
     */
    User11 selectByNumberAndPassword(Map<String, Object> param);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(User11 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User11 record);
}