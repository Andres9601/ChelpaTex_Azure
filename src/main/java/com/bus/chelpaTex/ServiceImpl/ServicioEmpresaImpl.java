package com.bus.chelpaTex.ServiceImpl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.chelpaTex.DTO.EmpresaDTO;
import com.bus.chelpaTex.Entity.Empresa;
import com.bus.chelpaTex.Repo.ManejadorEmpresa;
import com.bus.chelpaTex.Service.ServicioEmpresa;

@Service
public class ServicioEmpresaImpl implements ServicioEmpresa {

	private static final Logger logger =  Logger.getLogger(ServicioEmpresa.class.getName());

	
	@Autowired
	ManejadorEmpresa manejadorEmpresa;
	
	@Override
	public EmpresaDTO crear(EmpresaDTO empresaDTO) {
		try {
			Empresa empresa = new Empresa();
			empresa.setNombre(empresaDTO.getNombre());
			empresa.setTelefono(empresaDTO.getTelefono());
			empresa.setActivo(empresaDTO.getActivo());
			empresa.setIdUsuario(empresaDTO.getIdUsuario());
			manejadorEmpresa.save(empresa);
			return empresaDTO;
		}catch(Exception e){
			logger.info(e.getMessage() + e.getCause());
			return null;
		}
	}
		
}
