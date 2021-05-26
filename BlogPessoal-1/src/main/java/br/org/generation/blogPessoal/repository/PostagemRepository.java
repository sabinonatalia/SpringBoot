package br.org.generation.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogPessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
		/*^ Buscar todos pelo título. "Titulo" nome do atributo da entidade(@Entity) 
		 * Containing = like do msql - tudo que contém de caracteres dentro da variavel(String titulo) 
		 * ele vai trazer
		 * Ignore Case - não levar em consideração maiusculo e minusculo
		 * */

}
