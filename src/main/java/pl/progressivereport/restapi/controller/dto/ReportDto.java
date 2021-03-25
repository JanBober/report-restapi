package pl.progressivereport.restapi.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ReportDto {
    private long id;
    private String name;
    private String date;
    private String time;
    private boolean update;
}
