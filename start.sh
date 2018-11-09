cd demo &&
echo "O comando mvn clean limpa os arquivos e diretorios criados pelo seu build." &&
mvn clean &&
echo "O comando install roda todos os testes, caso passem ele junta todas as dependencias do código e gera o executavel caso o contrário o build é cancelado." &&
mvn install &&
echo "Apps o build basta executar o app gerado."
cd target && java -jar demo-0.0.1-SNAPSHOT.jar

