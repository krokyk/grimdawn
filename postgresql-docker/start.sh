#!
source set-env.sh
docker-machine start grimdawn-postgresql-machine
docker-compose up -d
./logs.sh