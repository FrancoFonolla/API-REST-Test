package com.utn.Proyect.Controllers;

import com.utn.Proyect.Entities.Autor;
import com.utn.Proyect.Services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
