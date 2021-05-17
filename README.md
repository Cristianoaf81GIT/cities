# Cities Api

Api rest com spring boot 2.4.5, postgresql, java 8.

## Passos

1 - clone este repositório.

```bash
$ git clone https://github.com/Cristianoaf81GIT/cities.git
```

2 - clone este repositório também (dados em sql para api):

```bash
$ git clone https://github.com/chinnonsantos/sql-paises-estados-cidades.git
```

3 - instale postgres no docker:

```bash
$  docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

```

4 - execute estes comandos: 
```bash
    $ cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

    $ docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

    $ psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
    $ psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
    $ psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

    $ psql -h localhost -U postgres_user_city cities

    $ CREATE EXTENSION cube; 
    $ CREATE EXTENSION earthdistance;
```   


5 - acesse o diretório raiz da aplicação e rode o script de build:

```bash
$ ./gradlew build
```

6 - Acesso ao projeto no heroku:

#### https://radiant-tor-62415.herokuapp.com/

7 - Swagger 2:

#### https://radiant-tor-62415.herokuapp.com/swagger-ui/index.html

8 - Localhost: 
```bash
    http://localhost:8080/
```

## Sobre

Este projeto foi desenvolvido durante o bootcamp da Everis na Digital Innovation One.

## Licença

[MIT](https://choosealicense.com/licenses/mit/)
