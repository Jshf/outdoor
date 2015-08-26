package cn.jstorm.outdoor.model;

import java.util.Date;

public class ODPost {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private Integer postId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String postName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_create_user
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String postCreateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_create_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String postCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_update_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private Date postUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_content
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private Date postContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_type
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String postType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_state
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private Integer postState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.post_auditor
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String postAuditor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_table.auditor_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private Date auditorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_id
     *
     * @return the value of post_table.post_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_id
     *
     * @param postId the value for post_table.post_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_name
     *
     * @return the value of post_table.post_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getPostName() {
        return postName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_name
     *
     * @param postName the value for post_table.post_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_create_user
     *
     * @return the value of post_table.post_create_user
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getPostCreateUser() {
        return postCreateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_create_user
     *
     * @param postCreateUser the value for post_table.post_create_user
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostCreateUser(String postCreateUser) {
        this.postCreateUser = postCreateUser == null ? null : postCreateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_create_time
     *
     * @return the value of post_table.post_create_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getPostCreateTime() {
        return postCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_create_time
     *
     * @param postCreateTime the value for post_table.post_create_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostCreateTime(String postCreateTime) {
        this.postCreateTime = postCreateTime == null ? null : postCreateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_update_time
     *
     * @return the value of post_table.post_update_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public Date getPostUpdateTime() {
        return postUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_update_time
     *
     * @param postUpdateTime the value for post_table.post_update_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostUpdateTime(Date postUpdateTime) {
        this.postUpdateTime = postUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_content
     *
     * @return the value of post_table.post_content
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public Date getPostContent() {
        return postContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_content
     *
     * @param postContent the value for post_table.post_content
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostContent(Date postContent) {
        this.postContent = postContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_type
     *
     * @return the value of post_table.post_type
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getPostType() {
        return postType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_type
     *
     * @param postType the value for post_table.post_type
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostType(String postType) {
        this.postType = postType == null ? null : postType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_state
     *
     * @return the value of post_table.post_state
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public Integer getPostState() {
        return postState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_state
     *
     * @param postState the value for post_table.post_state
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostState(Integer postState) {
        this.postState = postState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.post_auditor
     *
     * @return the value of post_table.post_auditor
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getPostAuditor() {
        return postAuditor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.post_auditor
     *
     * @param postAuditor the value for post_table.post_auditor
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setPostAuditor(String postAuditor) {
        this.postAuditor = postAuditor == null ? null : postAuditor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_table.auditor_time
     *
     * @return the value of post_table.auditor_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public Date getAuditorTime() {
        return auditorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_table.auditor_time
     *
     * @param auditorTime the value for post_table.auditor_time
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }
}