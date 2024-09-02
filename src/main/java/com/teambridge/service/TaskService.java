package com.teambridge.service;

import com.teambridge.dto.TaskDTO;
import com.teambridge.enums.Status;

import java.util.List;
import java.util.Map;

public interface TaskService {

    TaskDTO create(TaskDTO taskDTO);

    TaskDTO readByTaskCode(String taskCode);
    List<TaskDTO> readAllTasksByProject(String projectCode);
    List<TaskDTO> readAllByStatus(Status status);
    List<TaskDTO> readAllByStatusIsNot(Status status);
    Map<String, Integer> getCountsByProject(String projectCode);
    Integer countNonCompletedByAssignedEmployee(String assignedEmployee);

    TaskDTO update(String taskCode, TaskDTO taskDTO);
    TaskDTO updateStatus(String taskCode, Status status);
    void completeByProject(String projectCode);

    void delete(String taskCode);
    void deleteByProject(String projectCode);

}
