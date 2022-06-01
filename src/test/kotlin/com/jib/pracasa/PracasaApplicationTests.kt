# Criar tópico

kafka-topics --bootstrap-server localhost:9092 --topic <nome_topico> --create --partitions 3 --replication-factor 1



#Alterar tópico

kafka-topics --alter --bootstrap-server localhost:9092 --topic <nome_topico> --partitions <qtd>



#Listar tópico

kafka-topics --bootstrap-server localhost:9092 --list



#Detalhes do tópico

kafka-topics --bootstrap-server localhost:9092 --topic <nome_topico> --describe



#Deletar tópico (Windows não suporta a deleção de tópicos ainda, é necessário limpar a pasta referenciada pelo arquivo 'server.properties', propriedade 'log.dirs')

https://issues.apache.org/jira/browse/KAFKA-1194

kafka-topics --bootstrap-server localhost:9092 --topic <nome_topico> --delete



#Enviar mensagem via linha de comando:

kafka-console-producer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico>



#Enviar mensagens via linha de comando com chave e valor:

kafka-console-producer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico> --property parse.key=true --property key.separator=,

Exemplo:

> chave,valor

> outra chave,outro valor



#Consumir mensagens via linha de comando:

kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico>



#Consumir mensagens via linha de comando com chave e valor:

kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico> --from-beginning --property print.key=true --property key.separator=,



#Consumir mensagens via linha de comando (desde o inicio):

kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico> --from-beginning



#Consumir mensagens em grupo (Use 2 ou mais instâncias para consumir em paralelo. As mensagens serão distribuídas até a quantidade de partições existentes no tópico)

kafka-console-consumer --bootstrap-server 127.0.0.1:9092 --topic <nome_topico> --group <group-name>



#Mostrar grupos existentes

kafka-consumer-groups --bootstrap-server localhost:9092 --list



#Visualizar status das entregas por grupo:

kafka-consumer-groups --bootstrap-server localhost:9092 --describe --group <group-name>



#Reiniciar o offset do grupo (ver as diferentes opções de reinício conforme documentação do comando), por tópico ou para todos

kafka-consumer-groups --bootstrap-server localhost:9092 --group <group-name> --reset-offsets --to-earliest --execute --topic <nome_topico>

kafka-consumer-groups --bootstrap-server localhost:9092 --group <group-name> --reset-offsets --to-earliest --execute --all-topics



#Voltar quantidade específica de offsets (por partição)

kafka-consumer-groups --bootstrap-server localhost:9092 --group <group-name> --reset-offsets --shift-by -2 --execute --topic <nome_topico>package com.jib.pracasa

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PracasaApplicationTests {

	@Test
	fun contextLoads() {
	}

}
