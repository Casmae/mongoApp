package model;

public class Skill {

    private String country_code;
    private String country_name;
    private String wb_income;
    private String wb_region;
    private int skill_group_id;
    private String skill_group_category;
    private String skill_group_name;
    private Double net_per_10k_2015;
    private Double net_per_10k_2016;
    private Double net_per_10k_2017;
    private Double net_per_10k_2018;
    private Double net_per_10k_2019;

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getWb_income() {
        return wb_income;
    }

    public void setWb_income(String wb_income) {
        this.wb_income = wb_income;
    }

    public String getWb_region() {
        return wb_region;
    }

    public void setWb_region(String wb_region) {
        this.wb_region = wb_region;
    }

    public int getSkill_group_id() {
        return skill_group_id;
    }

    public void setSkill_group_id(int skill_group_id) {
        this.skill_group_id = skill_group_id;
    }

    public String getSkill_group_category() {
        return skill_group_category;
    }

    public void setSkill_group_category(String skill_group_category) {
        this.skill_group_category = skill_group_category;
    }

    public String getSkill_group_name() {
        return skill_group_name;
    }

    public void setSkill_group_name(String skill_group_name) {
        this.skill_group_name = skill_group_name;
    }

    public Double getNet_per_10k_2015() {
        return net_per_10k_2015;
    }

    public void setNet_per_10k_2015(Double net_per_10k_2015) {
        this.net_per_10k_2015 = net_per_10k_2015;
    }

    public Double getNet_per_10k_2016() {
        return net_per_10k_2016;
    }

    public void setNet_per_10k_2016(Double net_per_10k_2016) {
        this.net_per_10k_2016 = net_per_10k_2016;
    }

    public Double getNet_per_10k_2017() {
        return net_per_10k_2017;
    }

    public void setNet_per_10k_2017(Double net_per_10k_2017) {
        this.net_per_10k_2017 = net_per_10k_2017;
    }

    public Double getNet_per_10k_2018() {
        return net_per_10k_2018;
    }

    public void setNet_per_10k_2018(Double net_per_10k_2018) {
        this.net_per_10k_2018 = net_per_10k_2018;
    }

    public Double getNet_per_10k_2019() {
        return net_per_10k_2019;
    }

    public void setNet_per_10k_2019(Double net_per_10k_2019) {
        this.net_per_10k_2019 = net_per_10k_2019;
    }

    public Skill(String country_code, String country_name, String wb_income, String wb_region, int skill_group_id, String skill_group_category, String skill_group_name, Double net_per_10k_2015, Double net_per_10k_2016, Double net_per_10k_2017, Double net_per_10k_2018, Double net_per_10k_2019) {
        this.country_code = country_code;
        this.country_name = country_name;
        this.wb_income = wb_income;
        this.wb_region = wb_region;
        this.skill_group_id = skill_group_id;
        this.skill_group_category = skill_group_category;
        this.skill_group_name = skill_group_name;
        this.net_per_10k_2015 = net_per_10k_2015;
        this.net_per_10k_2016 = net_per_10k_2016;
        this.net_per_10k_2017 = net_per_10k_2017;
        this.net_per_10k_2018 = net_per_10k_2018;
        this.net_per_10k_2019 = net_per_10k_2019;
    }

    public Skill() {
    }
}
