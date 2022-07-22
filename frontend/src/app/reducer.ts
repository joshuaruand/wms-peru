import {createReducer, on} from '@ngrx/store';
import * as states from './action';
import { SesionUsuario } from './interfaces/SesionUsuario';

export const initialSesionUsuario:SesionUsuario = {
    id: 0,
    nombres: '',
    dni:,
    contrasenia: '',
};

const _sesionUsuarioReducer = createReducer(
    initialSesionUsuario, 
    on(states.sesionUsuario,(state,{id,nombres,dni,contrasenia}) => ( 
            {id: id, nombres: nombres, dni:dni, contrasenia: contrasenia } )
    )
);
export function sesionUsuarioReducer(state: SesionUsuario, action: any){
    return _sesionUsuarioReducer(state,action);
}
