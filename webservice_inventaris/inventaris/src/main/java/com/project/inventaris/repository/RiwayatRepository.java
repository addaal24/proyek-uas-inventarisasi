package com.project.inventaris.repository;

import com.project.inventaris.entity.Riwayat;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RiwayatRepository extends JpaRepository<Riwayat, Long> {
    List<Riwayat> findByReportDateAndReportedClass(String date, Long reportedClass);
    List<Riwayat> findByReportDateContaining(String date);
    List<Riwayat> findByReportedClass(Long id);
}
