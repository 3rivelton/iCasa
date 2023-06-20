package com.espertacasa.icasa.model.classes;

import lombok.Data;

@Data
public class Dispositivo {
	
	private String id;
	private String nome;
	private boolean powerStatus;
	private boolean connectionStatus;

}
