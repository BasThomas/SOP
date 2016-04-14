# SOP Rapport (opdracht 6)

## A)
### Drie te meten eigenschappen:
Allocations

Activity monitor

Leaks

### Toelichting relevantie:
Kijken hoeveel objecten aangemaakt worden

Kijken hoeveel RAM en overige resources gebruikt worden

Kijken of er objecten ‘lekken’; oftewel niet gedeallocated kunnen worden

### Type meting:
Gemiddelde over tijd gebruik

Hoogtepunten per specifieke actie(s)

Aantal leaks

### Verwachting:
Normaal - er wordt in de applicatie rekening gehouden met het aantal objecten - en dit wordt goed gemanaged met ARC

Hoger bij gebruik advertenties, lager wanneer deze uitstaan

Normaal - dankzij ARC zouden er weinig tot geen leaks op moeten treden

### Opnemen van uitvoeren van dynamische metingen
?

### Toelichtingen plaats van dynamische metingen:
Gemeten met Instruments, een tool om verschillende soorten metingen uit te voeren
￼

## B)
### Metingen (meermaals) uitvoeren (en vergelijken):
Allocations:

Spikes tijdens openen van een artikel, waarbij vele objecten worden ingeladen en getoond; dat is logisch. Verder lijken de metingen redelijk consistent

Activity monitor:

Zijn redelijk normaal, fluctueren weinig.

Leaks:

Relatief onvoorspelbaar; 

Grafische weergave resultaten:
Allocations:
￼![image](/images/alloc_1.png)
![image](/images/alloc_2.png)
![image](/images/alloc_3.png)

Activity monitor:
￼![image](/images/am_1.png)
![image](/images/am_2.png)
![image](/images/am_3.png)

Leaks:
￼![image](/images/leak_1.png)
![image](/images/leak_2.png)
![image](/images/leak_3.png)

### Verschil baseline, periodieke en incidentele dynamische metingen:
Ondanks dat die niet zo specifiek gemeten is, kun je in ieder geval zien dat er bepaalde spikes en verschillen in de grafieken te observeren zijn. Hieruit kun je in ieder geval concluderen dat het nuttig is om dynamische metingen te doen - statische metingen zijn niet altijd betrouwbaar of nuttig - en kunnen daardoor verkeerd geïnterpreteerd worden

## C)
### Drie eigenschappen met toelichting en verklaring
?

### Beschrijven van inrichting en gebruik van tooling:
Tooling die standaard in Xcode aanwezig is; daarmee garandeer je kwaliteit en zijn alle processen die door Instruments uitgevoerd worden, native zijn.
Verder is het een geweldig goed in te richten programma; je kunt alle verschillende processen en “testen” meten en daarbij kun je nog eens aangeven wat je daarbij specifiek wilt meten.
