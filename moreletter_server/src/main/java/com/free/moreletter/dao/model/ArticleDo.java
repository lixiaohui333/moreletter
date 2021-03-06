package com.free.moreletter.dao.model;

import java.util.Date;

public class ArticleDo extends BaseDo{


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.name
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.desc
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private String desc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.tag_ids
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private String tagIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.category_id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private Long categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.user_id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.is_private
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private Integer isPrivate;

    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.gmt_create
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.gmt_modified
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.creator
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.state
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_article.content
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_article.id
     *
     * @return the value of ml_article.id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_article.id
     *
     * @param id the value for ml_article.id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_article.name
     *
     * @return the value of ml_article.name
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_article.name
     *
     * @param name the value for ml_article.name
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_article.desc
     *
     * @return the value of ml_article.desc
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_article.desc
     *
     * @param desc the value for ml_article.desc
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_article.tag_ids
     *
     * @return the value of ml_article.tag_ids
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public String getTagIds() {
        return tagIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_article.tag_ids
     *
     * @param tagIds the value for ml_article.tag_ids
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public void setTagIds(String tagIds) {
        this.tagIds = tagIds == null ? null : tagIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_article.category_id
     *
     * @return the value of ml_article.category_id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_article.category_id
     *
     * @param categoryId the value for ml_article.category_id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_article.user_id
     *
     * @return the value of ml_article.user_id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_article.user_id
     *
     * @param userId the value for ml_article.user_id
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_article.is_private
     *
     * @return the value of ml_article.is_private
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public Integer getIsPrivate() {
        return isPrivate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_article.is_private
     *
     * @param isPrivate the value for ml_article.is_private
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_article.content
     *
     * @return the value of ml_article.content
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_article.content
     *
     * @param content the value for ml_article.content
     *
     * @mbg.generated Sun Feb 24 17:27:33 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}