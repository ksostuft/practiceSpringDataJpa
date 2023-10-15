package com.ohgiraffers.practicespringdatajpa.tour.service;

import com.ohgiraffers.practicespringdatajpa.tour.dto.TourCategorySortDTO;
import com.ohgiraffers.practicespringdatajpa.tour.dto.TourInfoDTO;
import com.ohgiraffers.practicespringdatajpa.tour.entity.TourCategorySort;
import com.ohgiraffers.practicespringdatajpa.tour.entity.TourInfo;
import com.ohgiraffers.practicespringdatajpa.tour.repository.TourCategoryRepository;
import com.ohgiraffers.practicespringdatajpa.tour.repository.TourInfoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TourService {

    private final TourInfoRepository tourInfoRepository;
    private final TourCategoryRepository tourCategoryRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public TourService(TourInfoRepository tourInfoRepository, TourCategoryRepository tourCategoryRepository, ModelMapper modelMapper) {
        this.tourInfoRepository = tourInfoRepository;
        this.tourCategoryRepository = tourCategoryRepository;
        this.modelMapper = modelMapper;
    }

    public List<TourInfoDTO> allSelect() {
        List<TourInfo> tourInfos = tourInfoRepository.findAll();
        return tourInfos.stream().map(tourInfo -> modelMapper.map(tourInfo, TourInfoDTO.class)).collect(Collectors.toList());
    }

    public TourInfoDTO findOne(int no) {
        TourInfo tourInfo = tourInfoRepository.findById(no).orElseThrow(IllegalArgumentException::new);
        return modelMapper.map(tourInfo, TourInfoDTO.class);
    }

    public List<TourInfoDTO> searchByTitle(String tourTitle) {
        List<TourInfo> tourInfoList = tourInfoRepository.findByTourTitleContaining(tourTitle);
        System.out.println(tourInfoList);

        return tourInfoList.stream().map(tourInfo -> modelMapper.map(tourInfo, TourInfoDTO.class)).collect(Collectors.toList());
    }

    @Transactional
    public void modifyTourInfo(TourInfoDTO tourInfoDTO) {
        TourInfo tourInfo = tourInfoRepository.findById(tourInfoDTO.getTourCode()).orElseThrow(IllegalArgumentException::new);
        tourInfo.setTourTitle(tourInfoDTO.getTourTitle());
        tourInfo.setFacilities(tourInfoDTO.getFacilities());
        tourInfo.setPolicy(tourInfoDTO.getPolicy());
        tourInfo.setNotice(tourInfoDTO.getNotice());
    }

    @Transactional
    public void deleteTourInfo(String no) {
        tourInfoRepository.deleteById(Integer.parseInt(no));
    }

    public List<TourCategorySortDTO> findTourCategorySort() {
        List<TourCategorySort> tourCategorySortList = tourCategoryRepository.findAll();

        return tourCategorySortList.stream().map(categorySort -> modelMapper.map(categorySort, TourCategorySortDTO.class)).collect(Collectors.toList());
    }

    @Transactional
    public void registTourInfo(TourInfoDTO tourInfoDTO) {
        tourInfoRepository.save(modelMapper.map(tourInfoDTO, TourInfo.class));
    }
}
