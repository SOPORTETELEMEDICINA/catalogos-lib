package net.amentum.niomedic.catalogos.views;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor


public class CatCluesView implements Serializable {

    private Integer idCatClues;
    private String clues;
    private String fkEntidad;
    private String fkCveMunicipio;
    private String fkCveLocalidad;
    private String nombreJurisdiccion;
    private Integer claveJurisdiccion;
    private String nombreInstitucion;
    private String claveInstitucion;
    private String claveCortaInstitucion;
    private String nombreTipoEstablecimiento;
    private String claveTipoEstablecimiento;
    private String nombreTipologia;
    private String claveTipologia;
    private String nombreSubtipologia;
    private Integer claveSubtipologia;
    private Integer claveScian;
    private String descripcionClaveScian;
    private Integer consultoriosMedGral;
    private Integer consultoriosOtrasAreas;
    private Integer totalConsultorios;
    private Integer camasAreaHos;
    private Integer camasOtrasAreas;
    private Integer totalCamas;
    private String nombreUnidad;
    private Integer claveVialidad;
    private String tipoVialidad;
    private String vialidad;
    private String numeroExterior;
    private String numeroInterior;
    private Integer claveTipoAsentamiento;
    private String tipoAsentamiento;
    private String asentamiento;
    private String entreTipoVialidad1;
    private String entreVialidad1;
    private String entreTipoVialidad2;
    private String entreVialidad2;
    private String observacionesDireccion;
    private String codigoPostal;
    private String estatusOperacion;
    private Integer claveEstatusOperacion;
    private String tieneLicenciaSanitaria;
    private String numeroLicenciaSanitaria;
    private Boolean tieneAvisoFuncionamiento;
    private String fechaEmisionAvFun;
    private String rfcEstablecimiento;
    private String fechaConstruccion;
    private String fechaInicioOperacion;
    private String unidadMovilMarca;
    private Integer unidadMovilModelo;
    private Integer unidadMovilCapacidad;
    private String unidadMovilPrograma;
    private Integer unidadMovilClavePrograma;
    private String unidadMovilTipo;
    private String unidadMovilClaveTipo;
    private String unidadMovilTipologia;
    private Integer unidadMovilClaveTipologia;
    private Double longitud;
    private Double latitud;
    private String nombreInsAdm;
    private Integer claveInsAdm;
    private String nivelAtencion;
    private Integer claveNivelAtencion;
    private String estatusAcreditacion;
    private Integer claveEstatusAcreditacion;
    private String acreditaciones;
    private String subacreditacion;
    private String estratoUnidad;
    private Integer claveEstratoUnidad;
    private String tipoObra;
    private Integer claveTipoObra;
    private String horarioAtencion;
    private String areasServicios;
    private String ultimoMovimiento;
    private String fechaUltimoMovimiento;
    private String certificacionCsg;
    private String tipoCertificacion;
    private String vigenciaCertificacion;
    private String telefono;



}
