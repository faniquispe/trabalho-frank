package aluno.apiAlunos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aluno.apiAlunos.model.AlunoModel;
import aluno.apiAlunos.repository.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;
	
	public void salvar(AlunoModel aluno) {
		alunoRepository.saveAndFlush(aluno);
	}
	
	public List<AlunoModel> buscarTodos(){
		return alunoRepository.findAll();
	}
}
