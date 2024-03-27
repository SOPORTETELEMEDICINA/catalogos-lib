package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatReligionView implements Serializable {
	private static final long serialVersionUID = -5269508988165870106L;
	private Integer idCatReligion;
	@Size(min=3, max = 40 , message="ingrese minimo 3 caracteres y máximo 40")
	@NotNull(message="no puede ser nulo")
	private String relDescripcion;
	private Boolean activo;
}
