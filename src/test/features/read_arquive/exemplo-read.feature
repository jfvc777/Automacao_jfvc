# language: es

@Ejemplo_Read
Característica:
  Feature que trata sobre carga y lectura de arquivo sean xls, xlsx, csv e txt

  Antecedentes:
    Dado que el archivo esta en la direccion "C:\Automacao_jfvc\Arquivos\"

  @ER-1.0
  Escenario: Lectura de archivo del tipo txt y CSV
    Cuando el nombre del archivo es "demo_csv"
    Y el archivo es del tipo "csv"
    Entonces realizo la carga del archivo

  @ER-2.0
  Escenario: Lectura de archivo del tipo xls y xlsx
    Cuando el nombre del archivo es "demo_xls"
    Y el archivo es del tipo "xls"
    Y el nombre de la hoja es "Plan1"
    Entonces realizo la carga del archivo