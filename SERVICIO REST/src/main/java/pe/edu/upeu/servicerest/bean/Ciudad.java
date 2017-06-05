package pe.edu.upeu.servicerest.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Ciudad {

	private static final long serialVersionUID = 1L;

	
	@Id
    @GeneratedValue
	private Long id;

	@Column(length =100)
	private String nameCiudad;
	
	
}
