package com.triplebyte.repository;


import com.triplebyte.models.Number;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* Long: representa el tipo de dato con relacion al id de la entidad Number
* ES DECIR ES EL SIGUIENTE CODIGO CON RELACION AL ID DE LA CLASE Number:
* @Id
* @GeneratedValue(strategy = GenerationType.IDENTITY)
* private long id;
* */
public interface NumberRepository extends JpaRepository<Number, Long> {

}
