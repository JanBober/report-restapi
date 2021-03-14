package pl.progressivereport.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.progressivereport.restapi.controller.dto.ReportDto;
import pl.progressivereport.restapi.model.Report;
import pl.progressivereport.restapi.service.ReportService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class  ReportController {

    private final ReportService reportService;

    @GetMapping("/reports")
    public List<ReportDto> getReports() {
        return ReportDtoMapper.mapToReportDtos(reportService.getReports());
    }

    @GetMapping("/reports/{id}")
    public Report getSingleReport(@PathVariable long id) {
        return reportService.getSingleReport(id);
    }

    @PostMapping("/reports")
    public Report addReport(@RequestBody Report report) {
        return reportService.addReport(report);
    }

    @PutMapping("/reports")
    public Report editReport(@RequestBody Report report) {
        return reportService.editReport(report);
    }

    @DeleteMapping("/reports/{id}")
    public void deleteReport(@PathVariable long id) {
        reportService.deleteReport(id);
    }
}