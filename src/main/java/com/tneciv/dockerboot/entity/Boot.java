package com.tneciv.dockerboot.entity;

public class Boot {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.boot
     *
     * @mbg.generated
     */
    private String boot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boot.memo_rest
     *
     * @mbg.generated
     */
    private String memoRest;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    public Boot(Integer id, String boot, String name, String description, String memoRest) {
        this.id = id;
        this.boot = boot;
        this.name = name;
        this.description = description;
        this.memoRest = memoRest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    public Boot() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.id
     *
     * @return the value of boot.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.id
     *
     * @param id the value for boot.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.boot
     *
     * @return the value of boot.boot
     *
     * @mbg.generated
     */
    public String getBoot() {
        return boot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.boot
     *
     * @param boot the value for boot.boot
     *
     * @mbg.generated
     */
    public void setBoot(String boot) {
        this.boot = boot == null ? null : boot.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.name
     *
     * @return the value of boot.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.name
     *
     * @param name the value for boot.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.description
     *
     * @return the value of boot.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.description
     *
     * @param description the value for boot.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boot.memo_rest
     *
     * @return the value of boot.memo_rest
     *
     * @mbg.generated
     */
    public String getMemoRest() {
        return memoRest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boot.memo_rest
     *
     * @param memoRest the value for boot.memo_rest
     *
     * @mbg.generated
     */
    public void setMemoRest(String memoRest) {
        this.memoRest = memoRest == null ? null : memoRest.trim();
    }
}