# JUnit

Das ist das Repository für mein ePortfolio über JUnit Testing.

To work with JUnit5 you will have to install it in your Java IDE if it's not already present.

## 1. JUnit
JUnit ist ein Open-Source Testframework zum Erstellen und Durchführen von Unittests für Javaprogramme. 

## 2. Using JUnit
JUnit arbeitet mit Annotations und Assert statements.

### 2.1 Annotations
| Annotation JUnit5 | Description |
|----|----|
| @Test | Kennzeichnet eine Testmethode |
| @ParameterizedTest | Kennzeichnet einen parametrisierten Test |
| @BeforeEach | Kennzeichnet Methoden, die vor jeder Testmethode durchgefürt werden |
| @AfterEach | Kennzeichnet Methoden, die nach jeder Testmethode durchgefürt werden |
| @BeforeAll | Kennzeichnet die Methode, die vor allen Testmethoden einmalig am Anfang eines Testdurchgangs einer Klasse durchgeführt wird |
| @AfterAll | Kennzeichnet die Methode, die nach allen Testmethoden einmalig am Ende eines Testdurchgangs einer Klasse durchgeführt wird |
| @Disabled | Kennzeichnet eine Methode, die von dem TestRunner ignoriert werden |

Die obige Tabelle zeigt eine Zusammenfassung von Annotations. Eine Übersicht über alle Annotations finet ihr [hier](https://github.com/Mert-Guenduez/learnityourself/blob/master/app/src/androidTest/assets/res/ManageTasks.feature).

## 2.2 Assertions
| Statement | Description |
|----|----|
| assertTrue( boolean condition) | Überprüft ob eine boolean Bedingung wahr ist |
| assertFalse( boolean condition) | Überprüft ob eine boolean Bedingung falsch ist |
| assertEquals( expected, actual) | Überprüft ob beide Werte gleich sind. Note: Bei Arrays wird die Referenz und nicht der Inhalt verglichen |

Die obige Tabelle zeigt eine Zusammenfassung von Assertions. Weitere Assertions und Beispiele zur Benutzung dieser findet ihr [hier](https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions).

## 2.3 JUnit integration in IntelliJ
1. Erstelle ein Projekt
2. Erstelle für eine bessere Übersicht einen Testordner
3. Erstelle eine Klasse mit Methoden
4. Drücke alt + enter auf dem Klassennamen um auf die Option "Create Test" zu kommen
5. Konfiguriere die Testmethode (JUnit Version, Name der Testklasse, Ordner, Methoden)
6. Tests schreiben
7. Tests testen
