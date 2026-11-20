# Zoo Java Console Application

Een Java-consoleapplicatie voor een dierentuin met zeven dieren. De applicatie leest één commando per run en toont het resultaat in de console.

## Starten

Open de projectmap in VS Code of IntelliJ IDEA en start de `main`-methode in `src/com/ing/zoo/Zoo.java`. Typ een commando zodra `Voer uw command in:` verschijnt.

## Commando’s

| Commando | Resultaat |
|---|---|
| `hello` | Alle zeven dieren groeten. |
| `hello henk` | Alleen Henk groet. Je kunt ook de naam van een ander dier opgeven. |
| `give leaves` | Elsa, Dora, Marty en Gina krijgen bladeren. |
| `give meat` | Henk, Dora, Wally en Sam krijgen voer. Sam krijgt vis. |
| `perform trick` | Dora, Wally en Sam doen elk een truc. |

## Ontwerp

`Animal` bevat de naam en begroeting van ieder dier. De interfaces `EatsLeaves`, `EatsMeat` en `TrickPerformer` beschrijven welk gedrag een dier ondersteunt. `Zoo` gebruikt die interfaces om per commando de juiste dieren te selecteren. Een aanroep van `eatMeat()` op een `Zebra` wordt daardoor al bij het compileren afgewezen.

De twee toegevoegde dieren zijn Gina de giraffe en Sam de zeeleeuw. Gina eet bladeren. Sam eet vis en balanceert een bal op zijn neus.

---
## Git

Voor het maken van deze opdracht wordt er gebruik gemaakt van het versiebeheersysteem Git.

Gebruikte **IDE**: [IntelliJ IDEA](https://www.jetbrains.com/idea/). (**Niet verplicht**)

Gebruikte **SDK**: [JDK 1.8](https://bitbucket.org/kychu/zoo/downloads/java-1.8.0-openjdk-1.8.0.212-3.b04.redhat.windows.x86_64.zip).

Mocht er problemen zijn met het openen van dit project, creëer dan een nieuw project binnen jouw IDE en kopieer de Java bestanden uit `src/com/ing/zoo`

Stappen:

1. Clone deze repository.
2. Maak een nieuwe repository aan, bijvoorbeeld op [Github](https://www.github.com).
3. Push jouw veranderingen naar jouw repository.
4. Maak jouw repository openbaar (public).
4. Als de applicatie af is, push dan de laatste versie naar jouw `master` branch.

--- 
## Opdracht
- Maak de applicatie af.
- Reorganiseer eventueel de folder structuur.
- Refactor eventueel de code (denk goed na over de class structure).
	- Probeer er voor de zorgen dat je bijvoorbeeld geen EatMeat methode kan aanroepen op een Zebra object.
- Voeg 2 nieuwe dieren toe.
---
## Eisen

Bij elke command laat je het resultaat in de console  zien.

- Als je de [hello] command uitvoert zonder dat er een naam is ingevuld zeggen alle dieren hallo.
	- Als er wel een naam is ingevuld [hello henk] zegt alleen dat dier hallo 
- Als je de [give leaves] command uitvoert krijgen alle herbivores leaves.
- Als je de [give meat] command uitvoert krijgen alle carnivores meat.
- Als je de [perform trick] command uitvoert doen alle dieren die dat kunnen hun trucje.
