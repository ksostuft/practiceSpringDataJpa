package com.ohgiraffers.practicespringdatajpa.tour.controller;

import com.ohgiraffers.practicespringdatajpa.tour.dto.TourInfoDTO;
import com.ohgiraffers.practicespringdatajpa.tour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/tour")
public class TourController {

    private final TourService tourService;

    @Autowired
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/allSelect")
    public void allSelect(Model model) {
        List<TourInfoDTO> tourInfoDTOList = tourService.allSelect();
        model.addAttribute("tourList", tourInfoDTOList);
    }

    @GetMapping("/chooseSelect")
    public void chooseSelect(@RequestParam("no") String no, Model model) {
        System.out.println(no);
        if(no != null && !"".equals(no)) {
            TourInfoDTO tourInfo = tourService.findOne(Integer.parseInt(no));
            model.addAttribute("tourInfo", tourInfo);
        } else {
            model.addAttribute("tourInfo");
        }
    }

    @GetMapping("/conditionSelect")
    public void conditionSelect() {}

    @GetMapping("/searchByTitle")
    public void searchByTitle(@RequestParam("tourTitle") String tourTitle, Model model) {
        List<TourInfoDTO> tourInfoDTOList = tourService.searchByTitle(tourTitle);

        model.addAttribute("tourList", tourInfoDTOList);
        model.addAttribute("tourTitle", tourTitle);
    }

    @GetMapping("/regist")
    public void regist() {}

    @GetMapping("/modify")
    public void modify() {}

    @PostMapping("/modify")
    public String modifyTourInfo(TourInfoDTO tourInfoDTO) {
        tourService.modifyTourInfo(tourInfoDTO);
        return "redirect:/tour/allSelect";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("no") String no) {
        if (no != null && !"".equals(no)) {
            if(Integer.parseInt(no) > 206 || Integer.parseInt(no) < 0 ) {
                return "tour/delete";
            }
            tourService.deleteTourInfo(no);
            return "redirect:/tour/allSelect";
        }
        return "tour/delete";
    }
}
