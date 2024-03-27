package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatCie10View implements Serializable {
   private Integer idCie10;
   @Size(max = 2)
   private String letra;
   @Size(max = 5)
   private String catalogKey;
   @Size(max = 2)
   private String asterisco;
   @Size(max = 250)
   private String nombre;
   @Size(max = 2)
   private String lsex;
   @Size(max = 5)
   private String linf;
   @Size(max = 5)
   private String lsup;
   @Size(max = 3)
   private String trivial;
   @Size(max = 3)
   private String erradicado;
   @Size(max = 3)
   private String nInter;
   @Size(max = 3)
   private String nin;
   @Size(max = 3)
   private String ninmtobs;
   @Size(max = 3)
   private String noCbd;
   @Size(max = 3)
   private String noAph;
   @Size(max = 3)
   private String fetal;
   @Size(max = 3)
   private String diaCapituloType;
   @Size(max = 130)
   private String yearModifi;
   @Size(max = 5)
   private String yearAplicacion;
   @Size(max = 3)
   private String notdiaria;
   @Size(max = 3)
   private String notsemanal;
   @Size(max = 3)
   private String sistemaEspecial;
   @Size(max = 3)
   private String birmm;
   @Size(max = 2)
   private String cveCausaType;
   @Size(max = 3)
   private String epiMorta;
   @Size(max = 3)
//   @Column(name="epi_morta_m5")
   private String epiMortaM5;
   @Size(max = 3)
//   @Column(name="edas_e_iras_en_m5")
   private String edasEIrasEnM5;
   @Size(max = 4)
   private String lista1;
   @Size(max = 4)
   private String lista5;
   @Size(max = 5)
   private String prinmorta;
   @Size(max = 5)
   private String prinmorbi;
   @Size(max = 5)
   private String lmMorbi;
   @Size(max = 5)
   private String lmMorta;
   @Size(max = 4)
   private String lgbd165;
   @Size(max = 4)
   private String lomsbeck;
   @Size(max = 4)
   private String lgbd190;
   @Size(max = 3)
   private String esCauses;
   @Size(max = 4)
   private String numCauses;
   @Size(max = 3)
   private String esSuiveMorta;
   @Size(max = 2)
   private String daga;
   @Size(max = 4)
   private String epiClave;
   @Size(max = 100)
   private String epiClaveDesc;
   @Size(max = 3)
   private String esSuiveMorb;
   @Size(max = 3)
   private String esSuiveNotin;
   @Size(max = 3)
   private String esSuiveEstEpi;
   @Size(max = 3)
   private String esSuiveEstBrote;
   @Size(max = 3)
   private String sinac;
   @Size(max = 3)
   private String codigox;
   @Size(max = 3)
   private String codSitLesion;
//   private String datosBusqueda;
   //   relaciones
   private Integer catCapitulosId;
   private Integer catTitulosId;
   private Integer catSubtitulosId;
   //   valores de retorno
   private String _descripcionCapitulosCie10;
   private String _descripcionTitulosCie10;
   private String _descripcionSubtitulosCie10;
}
