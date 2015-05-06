# SIR_TP4_MONGODB

TP MONGODB
===================

Groupe : Anne-Sophie Balestra et Jérémy Viallatte.

**Question**
-------------------------

***Quelles sont les limites d’une base données orientées document ? (à répondre dans le compte rendu de TP (le readme)***

> Stockage en fichier, peut être corrompue / modifier.
La réutilisation des données est plus dur, la base n’est pas partagée.
mongo avec morpheo permet tout de même de faire tout les types de requête, select / update / delete grâce à un système de DAO ou bien avec nos propres requête.


**Peuplement de la BDD** 
-------------------------

> - Run **JpaTest.java** pour alimenter la base de données.


**Lancement de l'application** 
-------------------------

> - Lancer le serveur Tomcat 7 avec maven : ``` mvn tomcat7:run```
> - Rendez vous sur ```http://localhost:8080/ ```
> - Les servlets sont dans **src.main.java.fr.istic.sir.servlet**
> - Les pages web dans **src/main/webapp**
> - L'application permet de visualiser et de créer des Personnes. 


**API REST Jersey** 
-----------

La commande ``` mvn tomcat7:run``` démarre également le web service de JERSEY, la source se situe dans **src.main.java.fr.istic.sir.rest**

Le path de base pour Jersey est **/rest/hello**.

| Method     | URL | Action   |
| :------- | ----: | :---: |
| GET    | /rest/home  |  créer une maison   |
