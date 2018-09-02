#!
source set-env.sh
echo --- Existing containers:
docker container ls -a --format '{{.Names}}'
echo --- Removed containers:
docker container rm -f $(docker container ls -a --format '{{.Names}}')
echo
echo --- Existing volumes:
docker volume ls --format '{{.Name}}'
echo --- Removed volumes:
docker volume rm $(docker volume ls --format '{{.Name}}')