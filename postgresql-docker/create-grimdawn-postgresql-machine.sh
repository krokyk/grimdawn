#!
source set-env.sh
docker-machine create --driver virtualbox --virtualbox-no-vtx-check --virtualbox-cpu-count "2" --virtualbox-memory "3000" --virtualbox-hostonly-cidr "192.168.200.1/24" grimdawn-postgresql-machine