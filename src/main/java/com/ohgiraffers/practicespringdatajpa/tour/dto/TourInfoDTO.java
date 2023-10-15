package com.ohgiraffers.practicespringdatajpa.tour.dto;

public class TourInfoDTO {
    private int tourCode;
    private String tourTitle;
    private String addr;
    private String tourCategory;
    private String facilities;
    private String supplies;
    private String policy;
    private String notice;

    public TourInfoDTO() {
    }

    public TourInfoDTO(int tourCode, String tourTitle, String addr, String tourCategory, String facilities, String supplies, String policy, String notice) {
        this.tourCode = tourCode;
        this.tourTitle = tourTitle;
        this.addr = addr;
        this.tourCategory = tourCategory;
        this.facilities = facilities;
        this.supplies = supplies;
        this.policy = policy;
        this.notice = notice;
    }

    public int getTourCode() {
        return tourCode;
    }

    public void setTourCode(int tourCode) {
        this.tourCode = tourCode;
    }

    public String getTourTitle() {
        return tourTitle;
    }

    public void setTourTitle(String tourTitle) {
        this.tourTitle = tourTitle;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTourCategory() {
        return tourCategory;
    }

    public void setTourCategory(String tourCategory) {
        this.tourCategory = tourCategory;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getSupplies() {
        return supplies;
    }

    public void setSupplies(String supplies) {
        this.supplies = supplies;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "TourInfoDTO{" +
                "tourCode=" + tourCode +
                ", tourTitle='" + tourTitle + '\'' +
                ", addr='" + addr + '\'' +
                ", tourCategory='" + tourCategory + '\'' +
                ", facilities='" + facilities + '\'' +
                ", supplies='" + supplies + '\'' +
                ", policy='" + policy + '\'' +
                ", notice='" + notice + '\'' +
                '}';
    }
}
