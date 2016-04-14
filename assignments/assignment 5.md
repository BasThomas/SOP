# SOP Rapport (opdracht 5)

## Gemeten waarden

- Java Files: 7 - evenveel als het aantal classes. Dat is goed. Je zou niet meer dan een file per class moeten hebben, maar ook zeker niet minder (lees: meerdere classes per file).
- Regels code: 369 - alle regels code, exclusief de tests.
- Commentaarpercentage: 2,4% (9 regels totaal) - percentage commentaar per code, exclusief tests.
- Classes: 7 - evenveel als het aantal files. Dat is goed. Je zou niet meer dan een class per file moeten hebben, maar ook zeker niet minder (lees: meerdere files per class)
- Methods: 48 - ook dit is exclusief de tests
- Statements: 159 - telt het aantal returns, assignments, for / if / else / switch statements
- Gemiddelde cyclomatische complexiteit method: 1.8 (88 totaal) - hangt samen met de block depth: zegt iets over hoe complex een methode is, door te kijken naar het aantal mogelijke “uitkomsten” die de moethode heeft.
- Gemiddelde cyclomatische complexiteit file / class: 12.6
- avg Block depth - ??


## Definities

a) Percentage regels met commentaar: Het percentage commentaarregels per regel CODE (whitespace wordt dus genegeerd). Wanneer er per regel code ook één regel commentaar aanwezig is, betekent dit dat het percentage 100% is (en niet 50%).
b) Cyclomatische complexiteit: Een hoeveelheidsberekening van het aantal niet-samenhangende paden in sourcecode.
c) Diepte van een block: De diepte van geneste blokken in code

eg.
```
if {
  if {
    if {
      // 3 block depth
    }
  }
}
```

## Lijsten
### Grootste files
![image](/images/biggest_files.png)

### Regels commentaar
![image](/images/commented_lines.png)

### Files met meeste classes
Zoals beschreven in de gemeten waarden, staat een elke file slechts één class.

### Hoogste cyclomatische complexiteit
￼
![image](/images/cyclomatic_complexity.png)