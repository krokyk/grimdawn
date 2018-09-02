#!
source set-env.sh
echo Existing containers:
docker container ls -a --format '{{.Names}}'

echo
echo Existing volumes:
docker volume ls --format '{{.Name}}'