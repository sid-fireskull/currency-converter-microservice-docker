package com.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "currency_exchange")
public class CurrencyExchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;

	private BigDecimal conversionMultiple;
	
	private String environment;
}

//insert into currency_exchange
//(currency_from,currency_to,conversion_multiple,environment)
//values('USD','INR',65,'');
//insert into currency_exchange
//(currency_from,currency_to,conversion_multiple,environment)
//values('EUR','INR',75,'');
//insert into currency_exchange
//(currency_from,currency_to,conversion_multiple,environment)
//values('AUD','INR',25,'');
