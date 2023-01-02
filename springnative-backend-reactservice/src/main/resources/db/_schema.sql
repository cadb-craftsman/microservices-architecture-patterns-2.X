DROP TABLE IF EXISTS PRODUCT;
 
CREATE TABLE PRODUCT (id serial primary key, name varchar, description varchar);

INSERT INTO PRODUCT (id, name, description) VALUES (1,'mobile','object mobile');
INSERT INTO PRODUCT (id, name, description) VALUES (2,'table','object table');
INSERT INTO PRODUCT (id, name, description) VALUES (3,'computer','object computer');
INSERT INTO PRODUCT (id, name, description) VALUES (4,'car','object car');
INSERT INTO PRODUCT (id, name, description) VALUES (5,'airplane','object airplane');
