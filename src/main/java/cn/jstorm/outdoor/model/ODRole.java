package cn.jstorm.outdoor.model;

public class ODRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_table.role_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_table.role_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_table.role_content
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String roleContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_table.role_desc
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String roleDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_table.role_id
     *
     * @return the value of role_table.role_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_table.role_id
     *
     * @param roleId the value for role_table.role_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_table.role_name
     *
     * @return the value of role_table.role_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_table.role_name
     *
     * @param roleName the value for role_table.role_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_table.role_content
     *
     * @return the value of role_table.role_content
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getRoleContent() {
        return roleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_table.role_content
     *
     * @param roleContent the value for role_table.role_content
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setRoleContent(String roleContent) {
        this.roleContent = roleContent == null ? null : roleContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_table.role_desc
     *
     * @return the value of role_table.role_desc
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_table.role_desc
     *
     * @param roleDesc the value for role_table.role_desc
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }
}