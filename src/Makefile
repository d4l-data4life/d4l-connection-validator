url?=https://www.google.de/
host?=google.de
port?=443

build:
	javac HTTPSClient.java
	javac SSLPoke.java

url: build
	java -Djdk.tls.client.protocols=TLSv1.1 -Dhttps.protocols=TLSv1.1 HTTPSClient $(url)

tls3: build
	java -Djdk.tls.client.protocols=TLSv1.3 -Dhttps.protocols=TLSv1.3 SSLPoke $(host) $(port)

tls2: build
	java -Djdk.tls.client.protocols=TLSv1.2 -Dhttps.protocols=TLSv1.2 SSLPoke $(host) $(port)

tls1: build
	java -Djdk.tls.client.protocols=TLSv1.1 -Dhttps.protocols=TLSv1.1 SSLPoke $(host) $(port)

tls: tls3

server-ciphers:
	nmap -sV --script ssl-enum-ciphers -p $(port) $(host)

client-ciphers:
	openssl ciphers | sed 's/:/\n/g' | sort

full: tls1 tls2 tls3 server-ciphers client-ciphers