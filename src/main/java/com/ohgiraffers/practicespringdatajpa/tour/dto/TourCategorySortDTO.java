package com.ohgiraffers.practicespringdatajpa.tour.dto;

public class TourCategorySortDTO {
    private int tourSortCode;
    private String tourCategoryName;

    public TourCategorySortDTO() {
    }

    public TourCategorySortDTO(int tourSortCode, String tourCategoryName) {
        this.tourSortCode = tourSortCode;
        this.tourCategoryName = tourCategoryName;
    }

    public int getTourSortCode() {
        return tourSortCode;
    }

    public void setTourSortCode(int tourSortCode) {
        this.tourSortCode = tourSortCode;
    }

    public String getTourCategoryName() {
        return tourCategoryName;
    }

    public void setTourCategoryName(String tourCategoryName) {
        this.tourCategoryName = tourCategoryName;
    }

    @Override
    public String toString() {
        return "TourCategorySortDTO{" +
                "tourSortCode=" + tourSortCode +
                ", tourCategoryName='" + tourCategoryName + '\'' +
                '}';
    }
}
