package com.ninjastech.immobilier.entities;

import com.ninjastech.immobilier.security.Role;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Table(name = "FUNCIONARIO")
public class Fucionario extends Usuario {


}
