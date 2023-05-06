package aluno.apiAlunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aluno.apiAlunos.model.AlunoModel;
import aluno.apiAlunos.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	@Autowired
	AlunoService alunoService = new AlunoService();
	
	@GetMapping
	public List<AlunoModel> retornaTodosOsAlunos() {
		return alunoService.buscarTodos();
	}
	
	@PostMapping
	public void salvar(@RequestBody AlunoModel aluno) {
		alunoService.salvar(aluno);
	}
}
