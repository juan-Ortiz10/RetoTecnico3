# Author:Camilo Ortiz
  Feature: Report time in Maxtime page
    Scenario Outline:
      Given that Camilo is in the Maxtime page
      When he login in the page
        | user  |    pass    |
        |jortizf|Exxidae2020.|
      And select the day, fill the form with the information of his working day
        | proyecto | servicio | actividad | horas | comentario |
        |<proyecto>|<servicio>|<actividad>|<horas>|<comentario>|
      Then the day close with message Atención:
      Examples:
        |proyecto|    servicio    |   actividad   | horas | comentario |
        | Banking|pruebas clásicas|FORMACIÓN GUÍAS|   9   |RetoTecnico3|