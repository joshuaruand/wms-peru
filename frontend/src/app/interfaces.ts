import { Time } from "@angular/common";

export interface AlmacenDto {
  idAlmacen:number;
  tipoAlmacen:string;
  direccionAlmacen:string;
}

export interface EspaciosDto {
  idEspacio:number;
  numeroFila:number;
  numeroColumna:number;
  tipoEspacio:string;
  cantPaquetesUbicados:number;
  capacidad:number;
}

export interface CabeceraBienesLugarDto {
  idEstante:number;
  idEspacio:number;
  colorEstante:string;
  TallaEspacio:string;
}

export interface CodigoCitaDto {
  idCita?:number;
}

export interface RptaCodigoCita
{
  lista: CodigoCitaDto[];
}

export interface CitaDto
{
  idCita:number;
  tipoCita:string;
  fechaCita:string;
  horaCita:string;
  idAlmacen:number;
  nombreCliente:string;
  documentoCliente:string;
}

export interface EstanteDto
{
  idEstante?:number;
  tipoBien?:string;
  cantEspaciosLlenos?:number;
  cantEspaciosTotal?:number;
}

export interface RptaEspacios {
  lista: EspaciosDto[];
}

export interface RptaEstante {
  grillaEstantes: EstanteDto[];
}

export interface CabeceraEstanteDto{
  ubicacion:string;
  tipoAlmacen:string;
  tipoEstante:string;
}

export interface MovMercaderiaDto {
  idMovimiento:number;
  tipoMovimiento:string;
  idOrden:number;
  idBien:number;
}

export interface OrdenDto {
  idOrden?:number;
  tipoOrden?:string;
  fechaOrden?:string;
  horaOrden?:string;
  idCita?:number;
  idUsuario?:number;
}

export interface OrdenesRecepcionDto {
  idOrden:number;
  idCita:number;
  tipoBien:string;
  responsable:string;
  paquetes:number;
}

export interface RptaOrdenesRecepcion {
  lista:OrdenesRecepcionDto[];
}


export interface OrdenesRecepcionDetallado{
  codPaquete:string;
  colorBien:string;
  tipoTalla:string;
  unidades:number;
}


export interface RptaOrdenesRecepcionDetallado{
  detalle:OrdenesRecepcionDetallado[];
}

export interface PaquetesDto {
  idPaquete:number;
  tipoBien:string;
  unidades:number;
}

export interface RptaPaquetesUbicados {
  lista:PaquetesDto[];
}

export interface UbicarPaqueteDto {
  idPaquete:number;
  idEspacio:number;
}

export interface PoloSeleccionadoDto {
  idPaquete:number;
  idBien:number;
  tipoBien:string;
  cantidadBienes:number;
}

export interface RptaPoloSeleccionado {
  lista:PoloSeleccionadoDto[];
}

export interface UsuarioDto {
  idUsuario:number;
  dniUsuario:string;
  nombresUsuario:string;
  idTipoUsuario:number;
  contrasenaUsuario:string;
  idAlmacen:number;
}
