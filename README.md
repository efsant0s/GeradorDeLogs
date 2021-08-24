# Gerador de Logs

Essa ferramenta foiador de logs. criada para auxiliar no processo de "Debug" de Tabelas e objetos PL SQL .

Para objetos:
Funciona através de um processo de
gerar comandos inserts ao longo do 
objeto para inserir as informações 
em uma tabela temporária.
(A lógica para colocar os logs foi
feita para ser sempre depois do
then e else)

Para tabelas: 
Funciona criando uma trigger que vai 
inserir registros de logs com as 
mudanças, alterações, e callstack da 
tabela em questão.

Em que gerador de logs ajuda?
Principalmente em situações que:

- Saber quando uma váriavel é alterada.
- Saber callstack da chamada de um objeto.
- Saber valor/momento/origem de qualquer 
mudança/cadastro de qualquer tabela.
