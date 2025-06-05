package com.festivos.api.controller;

import com.festivos.api.model.Festivo;
import com.festivos.api.service.FestivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/festivos")
@CrossOrigin(origins = "*")
public class FestivoController {

    @Autowired
    private FestivoService festivoService;

    @GetMapping("/validar")
    public String validarFecha(@RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return festivoService.validarFecha(fecha);
    }

    @GetMapping("/listar")
    public List<Festivo> listarFestivos(@RequestParam("anio") int anio) {
        return festivoService.listarPorAnio(anio);
    }
}
