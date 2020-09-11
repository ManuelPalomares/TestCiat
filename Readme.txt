/* ************************************************************
*	 Test Application Developer
*	 Autor : Manuel Palomares Mail : manuel936@gmail.com
*	 
***************************** *********************************/
 
 
 Proyect : Created with Spring Bot , Maven  3.6.3 , Jdk Java 1.8 
 
 Instrutions 
 
 1) Configure the propertie file application.properties  
 	 
 	#Spring DataSource Basic Config
	spring.datasource.url=jdbc:mysql://127.0.0.1:3306/prueba_ciat?&serverTimezone=UTC
	spring.datasource.username= root
	spring.datasource.password= 123
	spring.jpa.show-sql=true
	spring.jpa.properties.hibernate.dialet = org.hibernate.dialect.MySQL5Dialect

 2) Compile the source in root folder with maven :  Mvn clean install
   
 3) Execute jre 8 java commmand cmd =>  java -jar pruebaciat-1.0.jar 
 
 4) Access the application in http://localhost:8080/institutions
 
  note: the port of the server can change in fiel application.properties
  
  
  Thanks for you Attention !! 
  
  
   
  