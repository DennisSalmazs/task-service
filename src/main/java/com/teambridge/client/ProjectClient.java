package com.teambridge.client;

import com.teambridge.dto.ProjectResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "project-service", url = "localhost:8082")
public interface ProjectClient {

    @GetMapping("/api/v1/project/check/{projectCode}")
    ResponseEntity<ProjectResponse> checkByProjectCode(@PathVariable("projectCode") String projectCode);

    @GetMapping("/read/manager/{projectCode}")
    ResponseEntity<ProjectResponse> getManagerByProjectCode(@PathVariable("projectCode") String projectCode);
}
