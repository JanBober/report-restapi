package pl.progressivereport.restapi.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class ReportDto {
    private long id;
    private String name;
    private LocalDateTime created;
}
