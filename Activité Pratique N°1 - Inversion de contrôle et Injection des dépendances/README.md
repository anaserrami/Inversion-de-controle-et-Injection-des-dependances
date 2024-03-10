# Rapport - Application d'Inversion de Contrôle et Injection de Dépendances

## Introduction
Ce projet consiste en la création d'une application Java démontrant l'utilisation de l'Inversion de Contrôle (IoC) et de l'Injection de Dépendances (DI) selon les spécifications données. L'objectif est de comprendre et d'illustrer les différents mécanismes d'injection de dépendances, y compris l'injection par instanciation statique, par instanciation dynamique et en utilisant le framework Spring avec les versions XML et annotations.

![img_3.png](captures/img_3.png)
## Fonctionnalités
- DaoImpl.java et IDao.java : Ces fichiers définissent une interface IDao avec une méthode getData et une implémentation DaoImpl qui retourne une valeur factice à des fins de démonstration.

![img.png](captures/img.png)

![img_1.png](captures/img_1.png)
- DaoImplV2.java : Une implémentation alternative de l'interface IDao qui simule une autre source de données.

![img_2.png](captures/img_2.png)
- IMetier.java et MetierImpl.java : Ces fichiers définissent une interface IMetier avec une méthode calcul et une implémentation MetierImpl qui utilise l'interface IDao pour effectuer des calculs.

![img_4.png](captures/img_4.png)

![img_5.png](captures/img_5.png)
#### Injection des Dépendances :

- Par Instanciation Statique (PresentationV1.java) : Les dépendances sont injectées en créant manuellement les instances des classes nécessaires.

![img_6.png](captures/img_6.png)

- Par Instanciation Dynamique (PresentationV2.java) : Les dépendances sont injectées en lisant les noms de classe à partir d'un fichier de configuration et en utilisant la réflexion pour créer les instances.

![img_7.png](captures/img_7.png)

- Avec Spring (PresentationAvecSpringXML.java et PresentationSpringAnnotation.java) : Les dépendances sont gérées par Spring en utilisant les configurations XML et les annotations respectivement.

  - Version XML

  ![img_8.png](captures/img_9.png)

  - Version annotations

  ![img_9.png](captures/img_9.png)