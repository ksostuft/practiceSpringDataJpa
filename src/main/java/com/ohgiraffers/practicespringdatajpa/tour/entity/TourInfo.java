package com.ohgiraffers.practicespringdatajpa.tour.entity;

import javax.persistence.*;

@Entity
@Table(name = "tour_info")
public class TourInfo {

    @Id
    @Column(name = "tour_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tourCode;

    @Column(name = "tour_title")
    private String tourTitle;

    @Column(name = "addr")
    private String addr;

    @Column(name = "tour_category")
    private String tourCategory;

    @Column(name = "facilities")
    private String facilities;

    @Column(name = "supplies")
    private String supplies;

    @Column(name = "policy")
    private String policy;

    @Column(name = "notice")
    private String notice;

    protected TourInfo() {
    }

    public TourInfo(int tourCode, String tourTitle, String addr, String tourCategory, String facilities, String supplies, String policy, String notice) {
        this.tourCode = tourCode;
        this.tourTitle = tourTitle;
        this.addr = addr;
        this.tourCategory = tourCategory;
        this.facilities = facilities;
        this.supplies = supplies;
        this.policy = policy;
        this.notice = notice;
    }

    // 엔티티에서는 setter 사용은 신중해야 함

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
        return "TourInfo{" +
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
