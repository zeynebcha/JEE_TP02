# JEE_TP02
Rendu TP02 JEE par CHAABANE Zeineb, THOMAS Meven, GADELLE Ella et PILLOT Pierre

### Aperçu du projet

Le projet MonPremier_ProjetJSP est conçu pour démontrer l'utilisation des servlets Java et des pages JSP pour créer une application web dynamique. 

### Fonctionnalités implémentées

Servlet de Base
Une servlet (MyFirstServlet) qui affiche le message "hello world, this is my first servlet" ainsi que l'heure système.

Servlet de Redirection
RedirectServlet qui redirige les utilisateurs vers différentes pages basées sur les paramètres de l'URL. Cette servlet illustre comment manipuler les données de requête pour contrôler le flux de navigation.

Servlet de Login
LoginServlet qui gère le processus de connexion. Si les identifiants sont corrects (J2EE/J2EE), l'utilisateur est redirigé vers une page résultante, sinon un message d'erreur s'affiche.

Interface de connexion utilisateur
login.html constitue le point d'entrée pour l'authentification des utilisateurs. Il contient un formulaire simple où les utilisateurs peuvent saisir leur nom d'utilisateur et leur mot de passe. Le formulaire est configuré pour envoyer les données à LoginServlet via une requête POST, déclenchant ainsi le processus d'authentification.

### Méthodes servlet

MyFirstServlet
doGet : Cette méthode est utilisée pour générer une réponse HTTP simple qui affiche le message "hello world, this is my first servlet" accompagné de l'heure système. Cela montre comment une servlet peut manipuler et répondre avec des données dynamiques.

RedirectServlet
doGet : La méthode doGet de cette servlet extrait les paramètres de l'URL, tels que l'action et la page de destination. Selon ces paramètres, elle utilise response.sendRedirect(URL) pour rediriger le client vers la nouvelle URL, ce qui illustre comment gérer les actions basées sur les requêtes des utilisateurs.

LoginServlet
doPost : Cette méthode traite les données envoyées par l'utilisateur via un formulaire de login. Elle vérifie les identifiants (login et mot de passe) et, en fonction de leur validité, redirige l'utilisateur vers une page de résultat positive ou affiche un message d'erreur. Cette méthode montre comment gérer la sécurité et les données sensibles dans une application web.
