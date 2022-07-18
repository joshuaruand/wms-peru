import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable, throwError} from "rxjs";
import {catchError, retry} from "rxjs/operators";
import { AlmacenDto, CabeceraBienesLugarDto, EspaciosDto, RptaCodigoCita, CitaDto, RptaEspacios, EstanteDto, RptaEstante,
  CabeceraEstanteDto, MovMercaderiaDto, OrdenDto, RptaOrdenesRecepcion, RptaOrdenesRecepcionDetallado,
  RptaPaquetesUbicados, UbicarPaqueteDto, RptaPoloSeleccionado, UsuarioDto} from "./interfaces";

@Injectable({
  providedIn: 'root'
})

export class ApiService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json;charset=utf-8'
    })
  };

  errorHandl(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    }
    else {
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }

  constructor(private http: HttpClient) { }

    obtenerInfoAlmacen(): Observable<AlmacenDto>{
      return this.http.post<AlmacenDto>('http://127.0.0.1:8080/obtenerInfoAlmacen', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerBienesLugarDto(data:EspaciosDto): Observable<CabeceraBienesLugarDto>{
      return this.http.post<CabeceraBienesLugarDto>('http://127.0.0.1:8080/obtenerCabeceraBienesLugar', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerIdCitasRecepcion(): Observable<RptaCodigoCita>{
      return this.http.post<RptaCodigoCita>('http://127.0.0.1:8080/obtenerIdCitasRecepcion', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    verificarCitaProgramada(data:CitaDto): Observable<CitaDto>{
      return this.http.post<CitaDto>('http://127.0.0.1:8080/verificarCitaProgramada', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerGrillaEspacios(data:EstanteDto): Observable<RptaEspacios>{
      return this.http.post<RptaEspacios>('http://127.0.0.1:8080/obtenerGrillaEspacios', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerGrillaEstantes(): Observable<RptaEstante>{
      return this.http.post<RptaEstante>('http://127.0.0.1:8080/obtenerGrillaEstantes', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerCabeceraEstante(data:EstanteDto): Observable<CabeceraEstanteDto>{
      return this.http.post<CabeceraEstanteDto>('http://127.0.0.1:8080/obtenerCabeceraEstante', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    creacionMovimientoEntrada(data:MovMercaderiaDto): Observable<MovMercaderiaDto>{
      return this.http.post<MovMercaderiaDto>('http://127.0.0.1:8080/creacionMovimientoEntrada', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerIdOrdenPorIdCita(data:CitaDto): Observable<OrdenDto>{
      return this.http.post<OrdenDto>('http://127.0.0.1:8080/obtenerIdOrdenPorIdCita', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    actualizarFechaHoraOrden(data:OrdenDto): Observable<OrdenDto>{
      return this.http.post<OrdenDto>('http://127.0.0.1:8080/actualizarFechaHoraOrden', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerOrdenesRecepcion(): Observable<RptaOrdenesRecepcion>{
      return this.http.post<RptaOrdenesRecepcion>('http://127.0.0.1:8080/obtenerOrdenesRecepcion', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerOrdenesRecepcionDetallado(data:OrdenDto): Observable<RptaOrdenesRecepcionDetallado>{
      return this.http.post<RptaOrdenesRecepcionDetallado>('http://127.0.0.1:8080/obtenerOrdenesRecepcionDetallado', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerPaquetesUbicados(data:EspaciosDto): Observable<RptaPaquetesUbicados>{
      return this.http.post<RptaPaquetesUbicados>('http://127.0.0.1:8080/obtenerPaquetesUbicados', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    ubicarPaquetes(data:UbicarPaqueteDto): Observable<UbicarPaqueteDto>{
      return this.http.post<UbicarPaqueteDto>('http://127.0.0.1:8080/ubicarPaquetes', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    obtenerPaquetesaUbicar(): Observable<RptaPaquetesUbicados>{
      return this.http.post<RptaPaquetesUbicados>('http://127.0.0.1:8080/obtenerPaquetesaUbicar', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    seleccionBienes(): Observable<RptaPoloSeleccionado>{
      return this.http.post<RptaPoloSeleccionado>('http://127.0.0.1:8080/seleccionBienes', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }

    mostrarUsuarioResponsable(): Observable<UsuarioDto>{
      return this.http.post<UsuarioDto>('http://127.0.0.1:8080/mostrarUsuarioResponsable', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
    }
}
