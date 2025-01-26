package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PendaftaranRepository;
import com.example.demo.dto.KecamatanKelurahanData;
import com.example.demo.dto.VisitData;
import com.example.demo.dto.VisitPercentageData;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    @Autowired
    private PendaftaranRepository pendaftaranRepository;

    public List<VisitData> getVisitsByKabupaten(String kabupaten) {
        return pendaftaranRepository.findVisitsByKabupaten(kabupaten);
    }

    public List<VisitPercentageData> getVisitsPercentageByKabupaten(String kabupaten) {
        Long totalVisits = pendaftaranRepository.findTotalVisitsByKabupaten(kabupaten);

        List<Object[]> visitsByKecamatan = pendaftaranRepository.findVisitsByKecamatan(kabupaten);

        List<VisitPercentageData> result = new ArrayList<>();
        for (Object[] visit : visitsByKecamatan) {
            String kecamatan = (String) visit[0];
            Long visitCount = (Long) visit[1];
            double percentage = (visitCount * 100.0) / totalVisits;
            result.add(new VisitPercentageData(kecamatan, visitCount, percentage));
        }

        return result;
    }

    public List<KecamatanKelurahanData> getKelurahanGroupedByKecamatan(String kabupaten) {
        return pendaftaranRepository.findKelurahanGroupedByKecamatan(kabupaten);
    }
}

