package com.aplicacion.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "app-estadistica")
public interface EstadisticaFeignClient {

	@PostMapping("/resultados/crear/")
	public Boolean crearResultados(@RequestParam("idProyecto") Integer idProyecto,
			@RequestParam("formulario") Integer formulario, @RequestParam("numeroPregunta") Integer numeroPregunta,
			@RequestParam("pregunta") String pregunta, @RequestParam("tipoConsulta") Integer tipoConsulta,
			@RequestParam("opciones") List<String> opciones,
			@RequestParam("mensajeImpacto") List<String> mensajeImpacto);

	@DeleteMapping("/estadisticas/formularios/eliminar-pregunta/{idProyecto}")
	public Boolean elimininarFormularioPregunta(@PathVariable("idProyecto") Integer idProyecto,
			@RequestParam("formulario") Integer formulario, @RequestParam("numeroPregunta") Integer numeroPregunta);

	@DeleteMapping("/estadisticas/formularios/eliminar-preguntas/{idProyecto}")
	public Boolean elimininarFormulario(@PathVariable("idProyecto") Integer idProyecto,
			@RequestParam("formulario") Integer formulario);

}
