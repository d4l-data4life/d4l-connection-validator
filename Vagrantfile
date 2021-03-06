# -*- mode: ruby -*-
# vi: set ft=ruby :
EXTERNAL_IP = "192.168.33.10"
# All Vagrant configuration is done below. The "2" in Vagrant.configure
# configures the configuration version (we support older styles for
# backwards compatibility). Please don't change it unless you know what
# you're doing.
Vagrant.configure("2") do |config|
  # The most common configuration options are documented and commented below.
  # For a complete reference, please see the online documentation at
  # https://docs.vagrantup.com.

  # Every Vagrant development environment requires a box. You can search for
  # boxes at https://vagrantcloud.com/search.
  config.vm.box = "ubuntu/hirsute64"

  config.vm.define "openjdk"

  # Create a private network, which allows host-only access to the machine
  # using a specific IP.
  config.vm.network "private_network", ip: EXTERNAL_IP

  # Share an additional folder to the guest VM. The first argument is
  # the path on the host to the actual folder. The second argument is
  # the path on the guest to mount the folder. And the optional third
  # argument is a set of non-required options.
  # config.vm.synced_folder "../data", "/vagrant_data"

  # Provider-specific configuration so you can fine-tune various
  # backing providers for Vagrant. These expose provider-specific options.
  # Example for VirtualBox:
  #
  config.vm.provider "virtualbox" do |vb|
    # Customize the amount of memory on the VM:
    vb.memory = "4096"
    vb.cpus = 4
  end
  #
  # View the documentation for the provider you are using for more
  # information on available options.

  # Enable provisioning with a shell script. Additional provisioners such as
  # Ansible, Chef, Docker, Puppet and Salt are also available. Please see the
  # documentation for more information about their specific syntax and use.
  config.vm.provision "file", source: "./src", destination: "$HOME"

  config.vm.provision "shell", env: {"EXTERNAL_IP" => EXTERNAL_IP}, inline: <<-SHELL
    apt-get update
    apt -y upgrade
    apt -y install default-jdk
    apt -y install make nmap
    java -version
  SHELL

  config.vm.provision "shell", env: {"EXTERNAL_IP" => EXTERNAL_IP}, privileged: false, inline: <<-SHELL
    whoami
    javac HTTPSClient.java
    javac SSLPoke.java
  SHELL
end
