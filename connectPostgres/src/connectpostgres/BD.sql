drop table productes cascade;
drop table proveidors cascade;
drop table preus;
drop table guany;

CREATE TABLE productes (
part varchar(20),
tipus varchar(20),
especificacio varchar(20),
psuggerit float(6),
clau serial,
PRIMARY KEY(clau)
);

INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Processador','2 GHz','32 bits',NULL);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Processador','2.4 GHz','32 bits',35);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Processador','1.7 GHz','64 bits',205);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Processador','3 GHz','64 bits',560);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('RAM','128MB','333 MHz',10);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('RAM','256MB','400 MHz',35);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Disc Dur','80 GB','7200 rpm',60);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Disc Dur','120 GB','7200 rpm',78);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Disc Dur','200 GB','7200 rpm',110);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Disc Dur','40 GB','4200 rpm',NULL);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Monitor','1024x876','75 Hz',80);
INSERT INTO productes (part,tipus,especificacio,psuggerit) VALUES ('Monitor','1024x876','60 Hz',67);
 
CREATE TABLE proveidors (
empresa varchar(20) NOT NULL,
credit bool,
efectiu bool,
PRIMARY KEY(empresa)
);
 
INSERT INTO proveidors (empresa,efectiu) VALUES ('Descomponte PC', true );
INSERT INTO proveidors (empresa,credit) VALUES ('INS Ebre Tech', true );
INSERT INTO proveidors (empresa,credit,efectiu) VALUES ('Armazon', true, true );
 
CREATE TABLE guany(
venda varchar(16),
factor decimal (4,2),
PRIMARY KEY (venda)
);
 
INSERT INTO guany VALUES('engros',1.05);
INSERT INTO guany VALUES('detall',1.12);
 
CREATE TABLE preus (
empresa varchar(20) NOT NULL,
clau int NOT NULL,
preu float(6),
PRIMARY KEY (empresa, clau),
FOREIGN KEY (empresa) REFERENCES proveidors,
FOREIGN KEY (clau)REFERENCES productes
);
 
INSERT INTO preus VALUES ('Armazon',001,30.82);
INSERT INTO preus VALUES ('Armazon',002,32.73);
INSERT INTO preus VALUES ('Armazon',003,202.25);
INSERT INTO preus VALUES ('Armazon',005,9.76);
INSERT INTO preus VALUES ('Armazon',006,31.52);
INSERT INTO preus VALUES ('Armazon',007,58.41);
INSERT INTO preus VALUES ('Armazon',010,64.38);
INSERT INTO preus VALUES ('INS Ebre Tech',001,30.40);
INSERT INTO preus VALUES ('INS Ebre Tech',002,33.63);
INSERT INTO preus VALUES ('INS Ebre Tech',003,195.59);
INSERT INTO preus VALUES ('INS Ebre Tech',005,9.78);
INSERT INTO preus VALUES ('INS Ebre Tech',006,32.44);
INSERT INTO preus VALUES ('INS Ebre Tech',007,59.99);
INSERT INTO preus VALUES ('INS Ebre Tech',010,62.02);
INSERT INTO preus VALUES ('Descomponte PC',003,198.34);
INSERT INTO preus VALUES ('Descomponte PC',005,9.27);
INSERT INTO preus VALUES ('Descomponte PC',006,34.85);
INSERT INTO preus VALUES ('Descomponte PC',007,59.95);
INSERT INTO preus VALUES ('Descomponte PC',010,61.22);
INSERT INTO preus VALUES ('Descomponte PC',012,62.29);
