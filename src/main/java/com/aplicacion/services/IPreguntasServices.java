package com.aplicacion.services;

import com.aplicacion.models.Preguntas;

import java.util.List;

public interface IPreguntasServices {

	public void crearPregunta(Preguntas p);

	public void editarPregunta(Preguntas pregunta) throws Exception;

	public List<Preguntas> verTodas(Integer idProyecto, Integer formulario);

	public Preguntas verUna(Integer idProyecto, Integer numeroPregunta, Integer formulario);

	public boolean existsIdNumeroFormulario(Integer idProyecto, Integer numeroPregunta, Integer formulario);

	public boolean existIdFormulario(Integer idProyecto, Integer formulario);

	public void deleteIdFormulario(Integer idProyecto, Integer formulario);

	public void deleteIdNumeroFormulario(Integer idProyecto, Integer numeroPregunta, Integer formulario);

	public boolean existId(Integer idProyecto);

}
