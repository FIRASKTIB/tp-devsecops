# Utilise Java 21 comme image de base (comme sur ta capture)
FROM eclipse-temurin:21-jdk-jammy

# Crée un dossier de travail dans le conteneur
WORKDIR /app

# Copie le fichier .jar généré par Maven dans le conteneur
COPY target/democyber-0.0.1-SNAPSHOT.jar app.jar

# Commande pour lancer l'application au démarrage du conteneur
ENTRYPOINT ["java", "-jar", "app.jar"]