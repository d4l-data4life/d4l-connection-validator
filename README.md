# d4l connection validator

# Introduction

# Local

Every following command assume that its run inside the `src` folder 
```
 cd src
```

## Build
```
 make build
```
## Usage

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

```
 make ssl host=google.de port=443
```

An successful output will look like this

```
 java SSLPoke google.de 443
 Successfully connected
```

# Vagrant

The repository provides a Vagrantfile to run the d4l-connection-validator from inside a virtual machine.

## Prerequisites

* [vagrant](https://www.vagrantup.com/)
* [virtualbox](https://www.virtualbox.org/)

## Build

The following command will run a full build of the vagrant vm based on the Vagrantfile
```
 make deploy
```

For a quick re-provisioning in case you had to change the Vagrantfile provision code.

```
 make build
```

That just re-run the provisioning on the running virtual machine.

## Usage

Every following command assume that you are inside the virtual machine provided by vagrant.

Use the following command to ssh into the running virtual machine.
```
 make shell
```

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

```
 make ssl host=google.de port=443
```

An successful output will look like this

```
 java SSLPoke google.de 443
 Successfully connected
```



https://gist.github.com/4ndrej/4547029