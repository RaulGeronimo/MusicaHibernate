create table Artista(
idArtista int primary key auto_increment,
Nombre varchar(45),
ApellidoP varchar(45),
ApellidoM varchar(45),
NombreArtistico varchar(45),
Edad int,
Genero char,
FechaNacimiento date,
Pais varchar(45),
Instrumento varchar(45),
Estatura double);

create table Disquera(
idDisquera int primary key auto_increment,
Nombre varchar(45),
Correo varchar(45),
Direccion varchar(45),
Telefono bigint,
Fundacion date);

create table Grupo(
idGrupo int primary key auto_increment,
idDisquera int,
Nombre varchar(45),
Origen varchar(45),
Inicio date,
NoIntegrantes int,
Genero varchar(45),
idioma varchar(45),
foreign key (idDisquera) references Disquera(idDisquera) on update cascade on delete cascade);

create table Album(
idAlbum int primary key auto_increment,
idGrupo int,
Nombre varchar(45),
NoCanciones int,
Duracion Time,
Lanzamiento date,
NoVentas double,
Genero varchar(45),
foreign key(idGrupo) references Grupo(idGrupo) on update cascade on delete cascade);

create table Canciones(
idCancion int primary key auto_increment,
idGrupo int,
idInterprete int,
idAlbum int,
Nombre varchar(45),
Duracion time,
Lanzamiento date,
Idioma varchar(45),
Genero varchar(45),
foreign key (idGrupo) references Grupo(idGrupo) on update cascade on delete cascade,
foreign key (idInterprete) references Artista(idArtista) on update cascade on delete cascade,
foreign key (idAlbum) references Album(idAlbum) on update cascade on delete cascade);