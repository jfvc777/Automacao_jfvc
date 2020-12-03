$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("read_arquive/exemplo-read.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 4,
  "name": "",
  "description": "Feature que trata sobre carga y lectura de arquivo sean xls, xlsx, csv e txt",
  "id": "",
  "keyword": "Característica",
  "tags": [
    {
      "line": 3,
      "name": "@Ejemplo_Read"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Antecedentes"
});
formatter.step({
  "line": 8,
  "name": "que el archivo esta en la direccion \"C:\\Automacao_jfvc\\Arquivos\\\"",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Automacao_jfvc\\Arquivos\\",
      "offset": 37
    }
  ],
  "location": "StepsValidarArchivos.queElArchivoEstaEnLaDireccion(String)"
});
formatter.result({
  "duration": 141480805,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Lectura de archivo del tipo txt y CSV",
  "description": "",
  "id": ";lectura-de-archivo-del-tipo-txt-y-csv",
  "type": "scenario",
  "keyword": "Escenario",
  "tags": [
    {
      "line": 10,
      "name": "@ER-1.0"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "el nombre del archivo es \"demo_csv\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 13,
  "name": "el archivo es del tipo \"csv\"",
  "keyword": "Y "
});
formatter.step({
  "line": 14,
  "name": "realizo la carga del archivo",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "demo_csv",
      "offset": 26
    }
  ],
  "location": "StepsValidarArchivos.elNombreDelArchivoEs(String)"
});
formatter.result({
  "duration": 77404,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "csv",
      "offset": 24
    }
  ],
  "location": "StepsValidarArchivos.elArchivoEsDelTipo(String)"
});
formatter.result({
  "duration": 77026,
  "status": "passed"
});
formatter.match({
  "location": "StepsValidarArchivos.realizoLaCargaDelArchivo()"
});
formatter.result({
  "duration": 1188248,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Antecedentes"
});
formatter.step({
  "line": 8,
  "name": "que el archivo esta en la direccion \"C:\\Automacao_jfvc\\Arquivos\\\"",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Automacao_jfvc\\Arquivos\\",
      "offset": 37
    }
  ],
  "location": "StepsValidarArchivos.queElArchivoEstaEnLaDireccion(String)"
});
formatter.result({
  "duration": 84578,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Lectura de archivo del tipo xls y xlsx",
  "description": "",
  "id": ";lectura-de-archivo-del-tipo-xls-y-xlsx",
  "type": "scenario",
  "keyword": "Escenario",
  "tags": [
    {
      "line": 16,
      "name": "@ER-2.0"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "el nombre del archivo es \"demo_xls\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 19,
  "name": "el archivo es del tipo \"xls\"",
  "keyword": "Y "
});
formatter.step({
  "line": 20,
  "name": "el nombre de la hoja es \"Plan1\"",
  "keyword": "Y "
});
formatter.step({
  "line": 21,
  "name": "realizo la carga del archivo",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "demo_xls",
      "offset": 26
    }
  ],
  "location": "StepsValidarArchivos.elNombreDelArchivoEs(String)"
});
formatter.result({
  "duration": 68343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xls",
      "offset": 24
    }
  ],
  "location": "StepsValidarArchivos.elArchivoEsDelTipo(String)"
});
formatter.result({
  "duration": 65699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Plan1",
      "offset": 25
    }
  ],
  "location": "StepsValidarArchivos.elNombreDeLaHojaEs(String)"
});
formatter.result({
  "duration": 76271,
  "status": "passed"
});
formatter.match({
  "location": "StepsValidarArchivos.realizoLaCargaDelArchivo()"
});
formatter.result({
  "duration": 274054471,
  "status": "passed"
});
});