package ljj.mapper;

public class TContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.c_id
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    private String cId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.c_name
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    private String cName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_content.c_content
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    private String cContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.c_id
     *
     * @return the value of t_content.c_id
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    public String getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.c_id
     *
     * @param cId the value for t_content.c_id
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    public void setcId(String cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.c_name
     *
     * @return the value of t_content.c_name
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    public String getcName() {
        return cName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.c_name
     *
     * @param cName the value for t_content.c_name
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_content.c_content
     *
     * @return the value of t_content.c_content
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    public String getcContent() {
        return cContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_content.c_content
     *
     * @param cContent the value for t_content.c_content
     *
     * @mbggenerated Thu Sep 28 14:00:51 CST 2017
     */
    public void setcContent(String cContent) {
        this.cContent = cContent;
    }
    public TContent(){
        super();
    }
    public TContent(String cId, String cName, String cContent) {
        super();
        this.cId = cId;
        this.cName = cName;
        this.cContent = cContent;
    }

}