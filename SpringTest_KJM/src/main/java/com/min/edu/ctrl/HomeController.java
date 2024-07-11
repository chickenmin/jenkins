package com.min.edu.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.min.edu.service.IJobsService;
import com.min.edu.vo.JobsVo;

@Controller
public class HomeController {
	
	@Autowired
	private IJobsService service;

	@GetMapping(value = "/list.do")
	public String list(Model model) {
		List<JobsVo> lists = service.selectAll();
		model.addAttribute("lists", lists);
		return "list";
	}
}
