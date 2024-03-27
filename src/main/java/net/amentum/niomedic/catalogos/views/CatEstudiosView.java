package net.amentum.niomedic.catalogos.views;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CatEstudiosView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6449661064462382701L;
	private Integer idCatEstudio;
	@Size(max=100, message = "Maximo 100 caracteres")
	@NotEmpty(message="No puede ser nulo/vació")
	private String descripcion;
	private String preparacion;
	@Size(max=100, message = "Maximo 100 caracteres")
	@NotEmpty(message="No puede ser nulo/vació")
	private String estudio;
	private Boolean activo;
}
