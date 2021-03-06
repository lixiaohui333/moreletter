package com.free.moreletter.dao.mapper;

import com.free.moreletter.dao.model.HallDo;
import com.free.moreletter.dao.model.HallDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HallDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    long countByExample(HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int deleteByExample(HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int insert(HallDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int insertSelective(HallDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    List<HallDo> selectByExample(HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") HallDo record, @Param("example") HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int updateByExample(@Param("record") HallDo record, @Param("example") HallDoExample example);
}