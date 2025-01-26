package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Pendaftaran;
import com.example.demo.dto.KecamatanKelurahanData;
import com.example.demo.dto.VisitData;

public interface PendaftaranRepository extends JpaRepository<Pendaftaran, Long> {

    @Query("SELECT new com.example.demo.dto.VisitData(p.nama, kel.nama, kec.nama, kab.nama, pend.waktuDaftar) " +
           "FROM Pendaftaran pend " +
           "JOIN pend.pasien p " +
           "JOIN p.kelurahan kel " +
           "JOIN kel.kecamatan kec " +
           "JOIN kec.kabupaten kab " +
           "WHERE kab.nama = :kabupaten")
    List<VisitData> findVisitsByKabupaten(@Param("kabupaten") String kabupaten);

    @Query("SELECT kec.nama AS kecamatan, COUNT(pend) AS visitCount " +
            "FROM Pendaftaran pend " +
            "JOIN pend.pasien p " +
            "JOIN p.kelurahan kel " +
            "JOIN kel.kecamatan kec " +
            "JOIN kec.kabupaten kab " +
            "WHERE kab.nama = :kabupaten " +
            "GROUP BY kec.nama")
    List<Object[]> findVisitsByKecamatan(@Param("kabupaten") String kabupaten);

    @Query("SELECT COUNT(pend) FROM Pendaftaran pend " +
            "JOIN pend.pasien p " +
            "JOIN p.kelurahan kel " +
            "JOIN kel.kecamatan kec " +
            "JOIN kec.kabupaten kab " +
            "WHERE kab.nama = :kabupaten")
    Long findTotalVisitsByKabupaten(@Param("kabupaten") String kabupaten);

    @Query("SELECT new com.example.demo.dto.KecamatanKelurahanData(kec.nama, kel.nama) " +
            "FROM Pendaftaran pend " +
            "JOIN pend.pasien p " +
            "JOIN p.kelurahan kel " +
            "JOIN kel.kecamatan kec " +
            "JOIN kec.kabupaten kab " +
            "WHERE kab.nama = :kabupaten " +
            "GROUP BY kec.nama, kel.nama")
    List<KecamatanKelurahanData> findKelurahanGroupedByKecamatan(@Param("kabupaten") String kabupaten);

    
}


