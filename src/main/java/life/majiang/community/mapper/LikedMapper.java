package life.majiang.community.mapper;

import java.util.List;
import life.majiang.community.model.Liked;
import life.majiang.community.model.LikedExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LikedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    long countByExample(LikedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    int deleteByExample(LikedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    int insert(Liked record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    int insertSelective(Liked record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    List<Liked> selectByExampleWithRowbounds(LikedExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    List<Liked> selectByExample(LikedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    Liked selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    int updateByExampleSelective(@Param("record") Liked record, @Param("example") LikedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    int updateByExample(@Param("record") Liked record, @Param("example") LikedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    int updateByPrimaryKeySelective(Liked record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LIKED
     *
     * @mbg.generated Fri Oct 25 14:27:02 CST 2019
     */
    int updateByPrimaryKey(Liked record);
}