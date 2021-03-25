package pl.progressivereport.restapi.controller;

import pl.progressivereport.restapi.controller.dto.ReportDto;
import pl.progressivereport.restapi.model.Report;

import java.util.List;
import java.util.stream.Collectors;

public class ReportDtoMapper {

    private ReportDtoMapper() {}

    public static List<ReportDto> mapToReportDtos(List<Report> reports) {
        return reports.stream()
                .map(report -> mapToReportDto(report))
                .collect(Collectors.toList());
    }

    private static ReportDto mapToReportDto(Report report) {
        return ReportDto.builder()
                .id(report.getId())
                .name(report.getName())
                .date(report.getDate())
                .time(report.getTime())
                .update(report.isUpdate())
                .build();
    }
}