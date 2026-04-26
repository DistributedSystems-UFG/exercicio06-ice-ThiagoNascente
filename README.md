[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/AGZSOySv)
# Rodar na aws

> Sucessão de passos

```bash
sudo dnf install java-17-amazon-corretto-devel -y
```

```bash
sudo dnf install sudo dnf install sudo dnf install  https://download.zeroc.com/ice/3.7/amzn2023/ice-repo-3.7.amzn2023.noarch.rpm -y
```

```bash
sudo dnf install ice-compilers -y
``` 

```bash
sudo apt uptdate
```

```bash
sudo apt install default-jdk
```

```bash
wget "https://download.zeroc.com/ice/3.7/ubuntu24.04/ice-repo-3.7_1.0.0_all.deb" -O ice-repo.deb
```

```bash
sudo dpkg -i ice-repo.deb
```

```bash
rm ice-repo.deb
```

```bash
sudo apt-get update
```

```bash
sudo apt-get install zeroc-ice-compilers
```

```bash
wget https://repo1.maven.org/maven2/com/zeroc/ice/3.7.11/ice-3.7.11.jar
```

```bash
javac -cp ".:ice-3.7.11.jar" Server.java FunctionsI.java Client.java Demo/*.java
```

## Rodar Client.java e Server.java

> Na máquina 1
```bash
java -cp ".:ice-3.7.11.jar" Server
```

> Na máquina 2
```bash
java -cp ".:ice-3.7.11.jar" Client
```

## Cliente java e Servidor python

> clone o repositório da atividade anterior

```bash
git clone https://github.com/DistributedSystems-UFG/exercicio05-ice-ThiagoNascente.git
```

> siga a readme do repositória do exercício 5, e depois execute a server.py, e depois ...

```bash
java -cp ".;ice-3.7.11.jar" Client
```

### Note: configure the IP address and port appropriately

# Rodar local
> Sucessão de passos

```bash
Invoke-WebRequest -Uri "https://repo1.maven.org/maven2/com/zeroc/ice/3.7.11/ice-3.7.11.jar" -OutFile "ice-3.7.11.jar"
```

```bash
slice2java --output-dir . Functions.ice
```

```bash
javac -cp ".;ice-3.7.11.jar" Server.java FunctionsI.java Client.java Demo/*.java
```

```bash
java -cp ".;ice-3.7.11.jar" Server
```

```bash
java -cp ".;ice-3.7.11.jar" Client
```

# Cliente java e servidor python

> clone o repositório da atividade anterior

```bash
git clone https://github.com/DistributedSystems-UFG/exercicio05-ice-ThiagoNascente.git
```

> siga a readme do repositória do exercício 5, e depois execute a server.py, e depois ...

```bash
java -cp ".;ice-3.7.11.jar" Client
```

# Cliente python/java e servidor java

```bash
java -cp ".;ice-3.7.11.jar" Server
```

> Podemos usar o Client.java ou o client.py

```bash
java -cp ".;ice-3.7.11.jar" Client
```

```bash
python3 client.py
```

**Obs.: Deve-se trocar os ip's remotos tanto nesse repositório, quanto no repositório da primeira atividade envolvendo zeroc-ice.**