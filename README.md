# proj-sb-jpa

Projeto Web services com Spring Boot e JPA / Hibernate

### Objetivos

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções

Obs.: Utiliza JAVA SE Development Kit 11


#### Executando script SQL no servidor remoto (Heroku)

- App dashboard -> Settings - > Config Vars

	EXEMPLO: 
		```postgres://wavglvupbdad:358f443aafe452eca4c58fbc15d02e50b08130c7aaea3aff6c4f59c13f9abb@ec2-23-21-106-266.compute-1.amazonaws.com:5432/d7u9ub86cdsu```

		usuario: wavglvupbdad
		senha: 358f443aafe452eca4c58fbc15d02e50b08130c7aaea3aff6c4f59c13f9abb
		servidor: ec2-23-21-106-266.compute-1.amazonaws.com
		porta: 5432
		database: d7u9ub86cdsu
    
- PgAdmin: Servers -> Create -> Server
  - Advanced -> DB rescriction: (database)
    
- Database -> Query Tool
  - Buscar e executar o script SQL
  
  
### Deploy no Heroku

- Enviar o projeto para deploy no Heroku
 ```
   heroku git:remote -a proj-order
   git remote -v
```


- Setup Heroku app Config Vars
	- DATABASE_URL
	- JWT_EXPIRATION
	- JWT_SECRET
	
	
- Criar: application-prod.properties
```
	spring.datasource.url=${DATABASE_URL}

	spring.jpa.hibernate.ddl-auto=none
	spring.jpa.show-sql=false
	spring.jpa.properties.hibernate.format_sql=false

	jwt.secret=${JWT_SECRET}
	jwt.expiration=${JWT_EXPIRATION}
```

- Atualizar application.properties: ```spring.profiles.active=prod```

- Criar o arquivo na raiz: system.properties
	- Adicionar o codigo no arquivo criado:  ```java.runtime.version=11```
	
- Enviar para o Heroku
```
	git add .
	git commit -m "Deploy app to Heroku"
	git push heroku master
```
