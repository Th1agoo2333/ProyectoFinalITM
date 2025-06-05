package com.festivos.api.service;

import com.festivos.api.model.Festivo;
import com.festivos.api.repository.FestivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FestivoService {

    @Autowired
    private FestivoRepository festivoRepository;

    public String validarFecha(LocalDate fecha) {
        return festivoRepository.existsByFecha(fecha) ? "Sí es festivo" : "No es festivo";
    }

    public List<Festivo> listarPorAnio(int anio) {
        LocalDate inicio = LocalDate.of(anio, 1, 1);
        LocalDate fin = LocalDate.of(anio, 12, 31);
        return festivoRepository.findByFechaBetween(inicio, fin);
    }
}
