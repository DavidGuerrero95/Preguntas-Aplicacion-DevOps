package com.aplicacion.repository;

import com.aplicacion.models.Preguntas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface PreguntasRepository extends MongoRepository<Preguntas, String> {

	@RestResource(path = "buscar-lista-preguntas")
	public List<Preguntas> findByIdProyectoAndFormulario(@Param("idProyecto") Integer idProyecto,
														 @Param("formulario") Integer formulario);

	@RestResource(path = "buscar-pregunta")
	public Preguntas findByIdProyectoAndNumeroPreguntaAndFormulario(@Param("idProyecto") Integer idProyecto,
			@Param("numeroPregunta") Integer numeroPregunta, @Param("formulario") Integer formulario);

	@RestResource(path = "existe-lista-preguntas")
	public Boolean existsByIdProyectoAndFormulario(@Param("idProyecto") Integer idProyecto,
			@Param("formulario") Integer formulario);

	@RestResource(path = "existe-pregunta")
	public Boolean existsByIdProyectoAndNumeroPreguntaAndFormulario(@Param("idProyecto") Integer idProyecto,
			@Param("numeroPregunta") Integer numeroPregunta, @Param("formulario") Integer formulario);

	@RestResource(path = "existe-proyecti")
	public Boolean existsByIdProyecto(@Param("idProyecto") Integer idProyecto);

	@RestResource(path = "eliminar-pregunta")
	public void deleteByIdProyectoAndNumeroPreguntaAndFormulario(@Param("idProyecto") Integer idProyecto,
			@Param("numeroPregunta") Integer numeroPregunta, @Param("formulario") Integer formulario);

	@RestResource(path = "eliminar-preguntas")
	public void deleteByIdProyectoAndFormulario(@Param("idProyecto") Integer idProyecto,
			@Param("formulario") Integer formulario);

	@RestResource(path = "eliminar-proyectos")
	public void deleteByIdProyecto(@Param("idProyecto") Integer idProyecto);

}
