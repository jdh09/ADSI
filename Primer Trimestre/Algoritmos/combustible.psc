Algoritmo sin_titulo
	Definir combustuble, concepto Como Caracter;
	Definir cantidad, total, pacpm, pextra, pcorriente, pgnv Como Real;
	combustible="";
	cantidad=0;
	total=0;
	pacpm=6000;
	pextra=10000;
	pcorriente=8000;
	pgnv=2000;
	concepto="";
	
	
	Escribir " Ingrese el tipo de combustible";
	Escribir "1.extra";
	Escribir "2.corriente";
	Escribir "3.ACPM";
	Escribir "4.GNV";
	leer combustuble;
	Escribir "ingrese cantidad";
	leer cantidad;
	
	si(combustuble=="3")Entonces
		total=cantidad*pacpm;
		concepto="ACPM";
	FinSi
	si(combustuble=="1")Entonces
		total=cantidad*pextra;
		concepto="extra";
	FinSi
	si(combustuble=="2")Entonces
		total=cantidad*pcorriente;
		concepto="corriente";
	FinSi
	si(combustuble=="4")Entonces
		total=cantidad*pgnv;
		concepto="gnv";
	FinSi
	si(combustible=="1"o combustible=="2"o combustible=="3"o combustible<>"4") Entonces
	
		escribir"El combustible es ", concepto, " valor a pagar es: ", total;
	SiNo
		
	Escribir "opcion no valida";
		
		
	FinSi
	
FinAlgoritmo
