### SOP Rapport (opdracht 7)

## Block depth
De blokdiepte is overal geminimaliseerd tot maximaal één. Dit om de overzichtelijkheid te verbeteren en kleinere en overzichtelijkere methodes te garanderen.

## Geen else
Dit is een goede oplossing om te voorkomen dat er moeilijk te onderscheiden onderdelen in de code voorkomen. Hierbij houdt je ook rekening waarbij een `if` gebruikt wordt, zodat hiermee ook weer de grootte van de methods en classes klein blijft.

## Wrappers
De wrappers `BooleanWrapperFactory`, `StringWrapperFactory`, `IntWrapperFactory` en `DoubleWrapperFactory` zijn aangemaakt om af te stappen van de primitieve typen (en `String`s). Dit is niet gedaan om de leesbaarheid te verbeteren, maar het kan handig zijn, omdat de public methods ervan zelf aan te geven zijn, waarbij je bij de primitieve typen direct toegang hebt tot al zijn public methods.

Bovenstaande geldt ook voor de wrapper `PartsWrapperFactory`.

## Afk.
Het niet gebruiken van afk. is vanzelfsprekend, wanneer je hier enigszins bij nadenkt, verstandig. Hiermee voorkom je onduidelijke code en verbeter je de leesbaarheid.

## Kleine methods / classes
Zie `Block depth`, `Geen else`, `Wrappers` en `Niet meer dan 2 instantievariabelen`.

## Niet meer dan 2 instantievariabelen
Ook dit zorgt ervoor dat de programmeur goed nadenkt bij het aanmaken van een specifieke klasse - en dat deze relatief compact blijft.

## Geen getters, setters of properties
Geïmplementeerd omdat het kan. Maar dan heb je het ook wel gehad.

## Geen method chaining
Omdat dit de leesbaarheid zò erg overhoop zou gooien - en ook de genomen acties om classes en methodes klein te houden omver zouden gooien, is hiermee geen rekening gehouden.

### Extra: enums
Er is een enum gemaakt om het type `Part` aan te geven, zodat er geen makkelijk breekbare vergelijkingen tussen `String`s dienen te gebeuren (denk aan `UPPERCASE`, `lowercase`).