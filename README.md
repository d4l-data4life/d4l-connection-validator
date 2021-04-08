# d4l connection validator

# Introduction

# Local

Every following command assume that its run inside the `src` folder 
```
 cd src
```

## Prerequisites

The following software need's to be installed in order to run all the make targets.

* [nmap](https://nmap.org/)
* [openssl](https://www.openssl.org/)
* [openjdk](https://openjdk.java.net/)

## Build
```
 make build
```

# Vagrant

The repository provides a Vagrantfile to run the d4l-connection-validator from inside a virtual machine.

All the needed software is installed in this vagrant virtual machine image during provisioning.

## Prerequisites

* [vagrant](https://www.vagrantup.com/)
* [virtualbox](https://www.virtualbox.org/)

## Build

The following command will run a full build of the vagrant vm based on the Vagrantfile
```
 make deploy
```

An successful output will look like this

```
 vagrant destroy -f
 ==> openjdk: VM not created. Moving on...
 vagrant up --provision
 Bringing machine 'openjdk' up with 'virtualbox' provider...
 ==> openjdk: Importing base box 'ubuntu/hirsute64'...
 ==> openjdk: Matching MAC address for NAT networking...
 ==> openjdk: Checking if box 'ubuntu/hirsute64' version '20210405.0.0' is up to date...
 ...
 ==> openjdk: Booting VM...
 ==> openjdk: Waiting for machine to boot. This may take a few minutes...
     openjdk: SSH address: 127.0.0.1:2201
     openjdk: SSH username: vagrant
     openjdk: SSH auth method: private key
     openjdk: Warning: Connection reset. Retrying...
     openjdk: 
     openjdk: Vagrant insecure key detected. Vagrant will automatically replace
     openjdk: this with a newly generated keypair for better security.
     openjdk: 
     openjdk: Inserting generated public key within guest...
     openjdk: Removing insecure key from the guest if it's present...
     openjdk: Key inserted! Disconnecting and reconnecting using new SSH key...
 ==> openjdk: Machine booted and ready!
 ==> openjdk: Checking for guest additions in VM...
     openjdk: The guest additions on this VM do not match the installed version of
     openjdk: VirtualBox! In most cases this is fine, but in rare cases it can
     openjdk: prevent things such as shared folders from working properly. If you see
     openjdk: shared folder errors, please make sure the guest additions within the
     openjdk: virtual machine match the version of VirtualBox you have installed on
     openjdk: your host and reload your VM.
     openjdk: 
     openjdk: Guest Additions Version: 6.0.0 r127566
     openjdk: VirtualBox Version: 6.1
 ==> openjdk: Configuring and enabling network interfaces...
 ==> openjdk: Mounting shared folders...
 ...
 ==> openjdk: Running provisioner: file...
     openjdk: ./src => $HOME
 ==> openjdk: Running provisioner: shell...
     openjdk: Running: inline script
     openjdk: Get:1 http://archive.ubuntu.com/ubuntu hirsute InRelease [269 kB]
     openjdk: Hit:2 http://security.ubuntu.com/ubuntu hirsute-security InRelease
 ...
     openjdk: Calculating upgrade...
     openjdk: The following packages will be upgraded:
     openjdk:   apport apt apt-utils gcc-11-base libapt-pkg6.0 libgcc-s1 libpython3.9
     openjdk:   libpython3.9-minimal libpython3.9-stdlib libstdc++6 python3-apport
     openjdk:   python3-problem-report python3.9 python3.9-minimal zlib1g
     openjdk: 15 upgraded, 0 newly installed, 0 to remove and 0 not upgraded.
 ...
     openjdk: 
     openjdk: 0 upgraded, 92 newly installed, 0 to remove and 0 not upgraded.
     openjdk: Need to get 297 MB of archives.
     openjdk: After this operation, 572 MB of additional disk space will be used.
 ...
     openjdk: Get:20 http://archive.ubuntu.com/ubuntu hirsute/main amd64 openjdk-11-jre-headless amd64 11.0.11+8-0ubuntu2 [37.2 MB]
 ...
     openjdk:  vagrant @ session #3: sshd[1599]
     openjdk: 
 ...
     openjdk: 0 upgraded, 7 newly installed, 0 to remove and 0 not upgraded.
     openjdk: Need to get 6008 kB of archives.
     openjdk: After this operation, 27.3 MB of additional disk space will be used.
 ...
     openjdk: openjdk version "11.0.11-ea" 2021-04-20
     openjdk: OpenJDK Runtime Environment (build 11.0.11-ea+8-Ubuntu-0ubuntu2)
     openjdk: OpenJDK 64-Bit Server VM (build 11.0.11-ea+8-Ubuntu-0ubuntu2, mixed mode, sharing)
 ==> openjdk: Running provisioner: shell...
     openjdk: Running: inline script
     openjdk: vagrant
```

For a quick re-provisioning in case you had to change the Vagrantfile provision code.

```
 make build
```

An successful output will look like this

```
 vagrant up --provision
 Bringing machine 'openjdk' up with 'virtualbox' provider...
 ==> openjdk: Checking if box 'ubuntu/hirsute64' version '20210405.0.0' is up to date...
 ==> openjdk: Running provisioner: file...
     openjdk: ./src => $HOME
 ==> openjdk: Running provisioner: shell...
     openjdk: Running: inline script
     openjdk: Hit:1 http://archive.ubuntu.com/ubuntu hirsute InRelease
 ...
     openjdk: 0 upgraded, 0 newly installed, 0 to remove and 0 not upgraded.
     openjdk: WARNING:
     openjdk: apt
     openjdk:
     openjdk: does not have a stable CLI interface.
     openjdk: Use with caution in scripts.
     openjdk: Reading package lists...
     openjdk: Building dependency tree...
     openjdk: Reading state information...
     openjdk: default-jdk is already the newest version (2:1.11-72).
     openjdk: 0 upgraded, 0 newly installed, 0 to remove and 0 not upgraded.
     openjdk:
     openjdk: WARNING: apt does not have a stable CLI interface. Use with caution in scripts.
     openjdk: Reading package lists...
     openjdk: Building dependency tree...
     openjdk:
     openjdk: Reading state information...
     openjdk: make is already the newest version (4.3-4ubuntu1).
     openjdk: nmap is already the newest version (7.91+dfsg1+really7.80+dfsg1-1).
     openjdk: 0 upgraded, 0 newly installed, 0 to remove and 0 not upgraded.
     openjdk: openjdk version "11.0.11-ea" 2021-04-20
     openjdk: OpenJDK Runtime Environment (build 11.0.11-ea+8-Ubuntu-0ubuntu2)
     openjdk: OpenJDK 64-Bit Server VM (build 11.0.11-ea+8-Ubuntu-0ubuntu2, mixed mode, sharing)
 ==> openjdk: Running provisioner: shell...
     openjdk: Running: inline script
     openjdk: vagrant
```

That just re-run the provisioning on the running virtual machine.

# Usage

Every following command assume that you are inside the virtual machine provided by vagrant or that you are inside the `src` folder if you are not using the virtual machine.

Use the following command to ssh into the running virtual machine.
```
 make shell
```

### HTTP/HTTPS
The following command prints out the http get response body to the console.
```
 make url url=https://www.google.de
```

An successful output will look like this

```
 java HTTPSClient https://www.google.de
 <!doctype html><html itemscope="" itemtype="http://schema.org/WebPage" lang="de"><head><meta content="text/html; charset=UTF-8" http-equiv="Content-Type"><meta content="/images/branding/googleg/1x/googleg_standard_color_128dp.png" itemprop="image"><title>Google</title><script nonce="z3Ulnc+y4LG/2JzXYB84VA==">(function(){window.google=\x22stok\x22:\x22wGFPIzECGUuCc7_AOp8VeE-fWYY\x22,\x22uhde\x22:false}}'
 ..................................................................................................................
 ;google.pmc=JSON.parse(pmc);})();</script>        </body></html>
```

### Full TLS/SSL Suite

To run all the single targets below just execute.

```
 make full host=google.de port=443
```

### TLS v1.3

```
 make tls host=google.de port=443
```

An successful output will look like this

```
 java SSLPoke google.de 443
 Successfully connected
```

### TLS v1.2

```
 make tls2 host=google.de port=443
```

An successful output will look like this

```
 java SSLPoke google.de 443
 Successfully connected
```

An error because of missing

### TLS v1.1

```
 make tls1 host=google.de port=443
```

An successful output will look like this

```
 java SSLPoke google.de 443
 Successfully connected
```

### List supported Server Ciphers

```
 make server-ciphers host=google.de port=443
```

### List supported Client Ciphers

```
 make client-ciphers host=google.de port=443
```

https://gist.github.com/4ndrej/4547029