# Deloison-Leclercq-POO

## readme de Deloison Lucas et Leclercq Victor pour le TP7

## Dans ce tp nous découvrons tout d'abord une introduction à l'héritage et nous réaliserons un main contenant les différents affichages souhaités

**Toutes les commandes doivent être effectuées à la racine du dossier /tp8**

**Pour générer la documentation de l'intégralité des fichiers précédemment créés (en dehors du main) :**

> `javadoc src/goosegame/Board.java src/goosegame/Cell.java src/goosegame/ClassicalBoard.java src/goosegame/Game.java src/goosegame/GooseCell.java src/goosegame/Player.java src/goosegame/TeleportCell.java src/goosegame/TrapCell.java src/goosegame/WaitCell.java -d docs`

**Pour compiler les différentes classes du project :**

>`javac src/goosegame/*.java -d classes`

**Execution des différents mains :**

- Execution du GoosegameMain :

> `java goosegame.GoosegameMain <joueurs>`

**Création et éxecution des fichiers jars :**

- Goosegame.jar :

> `jar cvfe Goosegame.jar goosegame.GoosegameMain -C classes goosegame`

> `java -jar Goosegame.jar <joueurs>`

- Exemple pour une partie à 3 joueurs :

`java -jar Goosegame.jar Marc Tristan Franck`