package pl.progressivereport.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.progressivereport.restapi.model.Report;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {

    @Query("Select r From Report r")
    List<Report> findAllReports();
}