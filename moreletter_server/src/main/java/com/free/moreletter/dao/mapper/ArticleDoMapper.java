package com.free.moreletter.dao.mapper;

import com.free.moreletter.dao.model.ArticleDo;
import com.free.moreletter.dao.model.ArticleDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    long countByExample(ArticleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int deleteByExample(ArticleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int insert(ArticleDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int insertSelective(ArticleDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    List<ArticleDo> selectByExampleWithBLOBs(ArticleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    List<ArticleDo> selectByExample(ArticleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") ArticleDo record, @Param("example") ArticleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") ArticleDo record, @Param("example") ArticleDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_article
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    int updateByExample(@Param("record") ArticleDo record, @Param("example") ArticleDoExample example);
}