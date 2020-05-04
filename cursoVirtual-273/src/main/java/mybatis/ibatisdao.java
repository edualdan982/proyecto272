package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ibatisdao {
	
	public List<?> nroTareas();
	
	public List<?> preguntExamen();
	
	public List<?> nota();
	
	public List<?> materialPralelo();
	
	public List<?> lecciones();
	
	public List<?> getPreguntas();
	
	public List<?> getUsuario();
	
	public List<?> actSigla();
	
	public List<?> actDescripcion();
	
	public List<?> docenteDescripcion();
	
	public List<?> getSigla();
	
	public List<?> getMensaje();
	
	public List<?> nroLeccionesPar(String paralelo);
	
	public List<?> reprobados(String sigla);
	
	public List<?> aprobados(String sigla);
	
	public List<?> archivosdocente(String sigla, Long id);
	
	
	
	

}
