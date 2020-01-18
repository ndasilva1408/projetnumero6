
P6 - DA JAVA - OpenClassrooms - Nicolas DA SILVA

                                    Présentation :
Cette application web a été développée dans le cadre du projet n°6 du parcours DA-JAVA.

                                    Développement :
Cette application a été développée avec IntelliJ IDEA.
C'est une architecture MVC. J'ai utilisé les framework **Spring** (Spring-core pour l'inversion de contrôle et l'injection de dépendance, Spring-data pour l'accées aux données, Spring-webmvc pour la gestion des parties vues et controller et Spring Security pour la sécurité) et **Hibernate** pour la partie persistence des entités.

                                    Installation :
Cette application est configurée pour fonctionner avec une base de donnée **PostgreSql**.

                                     Lancement :
Vous pouvez lancer un serveur web depuis votre IDE 
et vous rendre sur http://localhost:9090/ dans votre navigateur
(paramètres par défault).
Des commandes pour créer un SuperUser avec le rang ADMIN , ainsi que 3 rangs ( Admin,Membre,Invite)
sont implantés en commentaire dans la classe Projetnumero6Application.java (en commentaire)

Dans le dossier "projetnumero6", vous trouverez aussi le fichier "p6ocr.war".
Il faut copier/coller ce fichier dans le dossier "webapp" du server Tomcat.
