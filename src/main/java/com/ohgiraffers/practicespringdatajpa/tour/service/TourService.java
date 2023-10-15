package com.ohgiraffers.practicespringdatajpa.tour.service;

import com.ohgiraffers.practicespringdatajpa.tour.dto.TourInfoDTO;
import com.ohgiraffers.practicespringdatajpa.tour.entity.TourInfo;
import com.ohgiraffers.practicespringdatajpa.tour.repository.TourRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TourService {

    private final TourRepository tourRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TourService(TourRepository tourRepository, ModelMapper modelMapper) {
        this.tourRepository = tourRepository;
        this.modelMapper = modelMapper;
    }

    public List<TourInfoDTO> allSelect() {
        List<TourInfo> tourInfos = tourRepository.findAll();
        return tourInfos.stream().map(tourInfo -> modelMapper.map(tourInfo, TourInfoDTO.class)).collect(Collectors.toList());
    }

    public TourInfoDTO findOne(int no) {
        TourInfo tourInfo = tourRepository.findById(no).orElseThrow(IllegalArgumentException::new);
        return modelMapper.map(tourInfo, TourInfoDTO.class);
    }
}
