build:
	vagrant up --provision

clean:
	vagrant destroy -f

deploy: clean build

shell:
	vagrant ssh
