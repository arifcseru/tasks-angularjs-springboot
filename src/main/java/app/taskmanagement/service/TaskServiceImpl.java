package app.taskmanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.taskmanagement.domain.Task;
import app.taskmanagement.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void add(Task task) {
		this.taskRepository.save(task);
	}

	@Override
	public void update(Task task) {
		this.taskRepository.save(task);
	}

	@Override
	public List<Task> findAll() {
		return (List<Task>) this.taskRepository.findAll();
	}

	@Override
	public Task findById(Integer taskId) {
		return this.taskRepository.findOne(taskId);
	}

	@Transactional
	@Override
	public void archiveTask(Integer taskId) {
		this.taskRepository.archiveTask(taskId);
	}
	
	@Transactional
	@Override
	public void changeStatusTask(Integer taskId, String status) {
		this.taskRepository.changeStatusTask(taskId, status);
	}
}
