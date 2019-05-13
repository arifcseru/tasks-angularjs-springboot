package app.taskmanagement.service;

import java.util.List;

import app.taskmanagement.domain.Task;

public interface TaskService {
	void add(Task task);
	void update(Task task);
	List<Task> findAll();
	Task findById(Integer taskId);
	void archiveTask(Integer taskId);
	void changeStatusTask(Integer taskId, String status);
}
