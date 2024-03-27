package net.amentum.niomedic.catalogos.views;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatAnioResidenciaView implements Serializable {

    private Integer idAnioResidencia;

    @Size(max = 100, message = "Máximo 100 caracteres")
    private String descripcionAnioResidencia;
}
