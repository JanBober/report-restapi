package pl.progressivereport.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.progressivereport.restapi.model.Report;
import pl.progressivereport.restapi.repository.ReportRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository reportRepository;

    public List<Report> getReports() {
        return reportRepository.findAllReports();
    }

    public Report getSingleReport(long id) {
        return reportRepository.findById(id)
                .orElseThrow();
    }

    public Report addReport(Report report) {
        return reportRepository.save(report);
    }

    @Transactional
    public Report editReport(Report report) {
        Report reportEdited = reportRepository.findById(report.getId()).orElseThrow();
        reportEdited.setName(report.getName());
        reportEdited.setDate(report.getDate());
        reportEdited.setTime(report.getTime());
        return reportEdited;
    }

    public void deleteReport(long id) {
        reportRepository.deleteById(id);
    }
}