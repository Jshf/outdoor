package cn.jstorm.outdoor.model;

public class ODPostType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_type.type_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_type.type_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post_type.type_desc
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    private String typeDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_type.type_id
     *
     * @return the value of post_type.type_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_type.type_id
     *
     * @param typeId the value for post_type.type_id
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_type.type_name
     *
     * @return the value of post_type.type_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_type.type_name
     *
     * @param typeName the value for post_type.type_name
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post_type.type_desc
     *
     * @return the value of post_type.type_desc
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post_type.type_desc
     *
     * @param typeDesc the value for post_type.type_desc
     *
     * @mbggenerated Tue Aug 18 21:56:09 CST 2015
     */
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }
}