# SOP Rapport (opdracht 4)

## Doel proces (SMART):
Het structureel kunnen doorvoeren van wijzigingsverzoeken vanuit de klant in de software, waarbij elk wijzigingsverzoek binnen 1 week worden geëvalueerd en, wanneer deze wijziging doorgevoerd wordt, binnen 3 weken na deze evaluatie gemerged is.

## UML

![image](/images/uml_1.png)
![image](/images/uml_2.png)
￼

### Toelichting activiteiten UML
- [ ] Wat?
1. De klant dient een issue in.
2. De baliemedewerker / dienst HRM documenteert de issue (in GitHub)
3. De issue wordt door een developer gevalideerd (kan het gereproduceerd worden? In welke versie dient het gefixt te worden? Wat voor fix is het (improvement, bug, ?)?
4. Het issue kan niet gevalideerd worden of wordt om andere redenen niet opgelost.
5. Het issue wordt verder gedocumenteerd (met de bevindingen van de developer) en toegewezen aan een andere developer, die het issue op zal gaan lossen.
6. De klant wordt ingelicht over het feit dat het issue niet wordt verholpen, waarbij wordt toegelicht wat hier de redenen voor zijn (zoals gedocumenteerd door HRM en developer(s))
7. De klant geeft feedback en / of suggesties wanneer deze daar behoefte aan heeft.
8. Het issue wordt verholpen en geïmplementeerd
9. De oplossing wordt gevalideerd en gemerged
10. De klant wordt ingelicht over het feit dat het issue verholpen is, waarbij duidelijk wordt toegelicht dat de fix zo spoedig mogelijk beschikbaar komt
11. De klant geeft feedback en / of suggesties wanneer deze daar behoefte aan heeft.
- [ ] Door wie? (rol)
1. Klant
2. HRM
3. Dev
4. Dev
5. Dev
6. HRM
7. Klant
8. Dev
9. Dev
10. HRM
11. Klant
- [ ] Waarom?
1. Om aan te geven dat de klant een probleem ondervindt
2. Om aan de devs door te geven wat het probleem is en overige informatie die nuttig is voor de devs
3. Er wordt gekeken of het issue gereproduceerd kan worden / gevalideerd kan worden om een beslissing te maken om het op te lossen
4. Wanneer het issue niet opgelost kan worden, dient de klant hierover ingelicht te worden
5. Issue wordt geëscaleerd / doorverwezen naar de juiste dev
6. De klant wordt ingelicht om relatie met de klant te behouden en iedere betrokkene in te lichten
7. De klant kan feedback of suggesties geven om het proces in de toekomst te kunnen stroomlijnen
8. De implementatie dient gedaan te worden om het issue te verhelpen
9. De oplossing dient in de software te worden ingeweven
10. De klant wordt ingelicht om relatie met de klant te behouden en iedere betrokkene in te lichten
11. De klant kan feedback of suggesties geven om het proces in de toekomst te kunnen stroomlijnen
- [ ] Welke software-omgeving?
1. n.v.t.
2. GitHub
3. GitHub + IDE
4. GitHub
5. GitHub
6. GitHub
7. n.v.t.
8. GitHub + IDE
9. Travis CI
10. GitHub
11. n.v.t.
- [ ] Relatie met tooling ontwikkelstraat?
1. n.v.t.
2. Ingevoerd op GitHub waarbij betrokkenen automatisch notificaties krijgen (assignees)
3. Ingevoerd op GitHub waarbij betrokkenen automatisch notificaties krijgen (assignees)
4. Ingevoerd op GitHub waarbij betrokkenen automatisch notificaties krijgen (assignees)
5. Ingevoerd op GitHub waarbij betrokkenen automatisch notificaties krijgen (assignees)
6. Issue wordt gesloten
7. n.v.t.
8. Travis CI wordt gebruikt om de fix te valideren
9. Travis CI wordt gebruikt om de fix nogmaals te valideren en deze te mergen
10. Issue wordt gesloten
11. n.v.t.

### Toelichten rollen
Klanten: Dienen issues in en krijgen hier tijdig ook feedback op.

HRM: Zorgen voor de communicatie tussen de klanten en de devs.

Devs: Valideren de issues en lossen deze op - wanneer mogelijk - waarna ze dit terugsturen naar HRM, die het issue met de klant afhandelen

### Producten
1. Het gehele traject van het issue is gedocumenteerd op GitHub.
2. De feedback van de klant wordt door HRM afgehandeld.
3. De implementatie om het issue te verhelpen wordt in de codebase opgenomen.

### Validatie

De oplossing is gevalideerd met onderstaand UML-diagram.
￼
![image](/images/validation.png)

### Werkinstructies
2. Het issue wordt ingevoerd op GitHub. Hierbij wordt alle informatie, die door de klant verstrekt is, toegevoegd. Ook wordt er door de HRM-mederwerker een indicatie van het issue als label toegevoegd - en wordt een developer als assignee aangewezen.

3 / 4 / 5. De aangewezen dev (in stap 2) valideert het issue en geeft een milestone voor het issue aan. Ook past deze de labels aan wanneer nodig - en wijst een nieuwe assignee aan. Dat kan zowel een HRM-medewerker zijn (label dient `wont-fix` te zijn) als een (andere) dev (welke het issue zal verhelpen).

7. De klant krijgt per e-mail een feedback-optie (via Google Forms) welke ingevuld wordt (wanneer van toepassing). Deze wordt automatisch doorgestuurd naar HRM.
