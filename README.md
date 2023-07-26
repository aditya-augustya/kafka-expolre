# kafka-expolre
kafka-tutorials


Commands
*********************************

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties   (it run kafka broker service)

Create Topic:
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic wikimedia_recentchange

Creating topic with multiple partitions
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --create --replication-factor 1 --partitions 3 --topic multifarmtopic

Describe Topic
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic realmkafka

list topic
.\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

Produce a message
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic multifarmtopic

Consume a message
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic wikimedia_data


START CONSOLE CONSUMER AND READ MESSAGES FROM BEGINNING
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic multifarmtopic --from-beginning

START CONSOLE CONSUMER WITH SPECIFIC partitions
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --partition 2 --topic multifarmtopic --from-beginning

Reading messages from specific offset in specific partition
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --partition 1 --topic multifarmtopic --offset 0


Send messages
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic realmkafka
.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic realmkafka


Consume messages
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic wikimedia_data  --from-beginning
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic wikimedia_data


Consume List
.\bin\windows\kafka-consumer-groups.bat --list --bootstrap-server localhost:9092


describe consumer-groups
.\bin\windows\kafka-consumer-groups.bat --bootstrap-server localhost:9092 --describe --group NewApp2

TOPIC DETAILS
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic multifarmtopic
.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic __consumer_offsets


Get Information from zookeeper about active broker ids
.\bin\windows\zookeeper-shell.bat localhost:2181  ls /brokers/ids
.\bin\windows\zookeeper-shell.bat localhost:2181  ls /brokers/ids/0  (for id broker 0)




