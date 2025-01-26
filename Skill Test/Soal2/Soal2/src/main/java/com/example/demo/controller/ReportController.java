package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.KecamatanKelurahanData;
import com.example.demo.dto.VisitData;
import com.example.demo.dto.VisitPercentageData;
import com.example.demo.service.ReportService;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/visits")
    public List<VisitData> getVisitsByKabupaten(@RequestParam String kabupaten) {
        return reportService.getVisitsByKabupaten(kabupaten);
    }
    
    @GetMapping("/visits-percentage")
    public List<VisitPercentageData> getVisitsPercentageByKabupaten(@RequestParam String kabupaten) {
        return reportService.getVisitsPercentageByKabupaten(kabupaten);
    }

    @GetMapping("/kelurahan/grouped/{kabupaten}")
    public List<KecamatanKelurahanData> getKelurahanGroupedByKecamatan(@PathVariable String kabupaten) {
        return reportService.getKelurahanGroupedByKecamatan(kabupaten);
    }
}




