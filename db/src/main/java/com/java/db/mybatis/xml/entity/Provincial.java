package com.java.db.mybatis.xml.entity;

import java.io.Serializable;

public class Provincial implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provincial.provincialID
     *
     * @mbg.generated
     */
    private Integer provincialid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column provincial.provincialName
     *
     * @mbg.generated
     */
    private String provincialname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table provincial
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provincial.provincialID
     *
     * @return the value of provincial.provincialID
     *
     * @mbg.generated
     */
    public Integer getProvincialid() {
        return provincialid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provincial.provincialID
     *
     * @param provincialid the value for provincial.provincialID
     *
     * @mbg.generated
     */
    public void setProvincialid(Integer provincialid) {
        this.provincialid = provincialid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column provincial.provincialName
     *
     * @return the value of provincial.provincialName
     *
     * @mbg.generated
     */
    public String getProvincialname() {
        return provincialname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column provincial.provincialName
     *
     * @param provincialname the value for provincial.provincialName
     *
     * @mbg.generated
     */
    public void setProvincialname(String provincialname) {
        this.provincialname = provincialname == null ? null : provincialname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table provincial
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", provincialid=").append(provincialid);
        sb.append(", provincialname=").append(provincialname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}