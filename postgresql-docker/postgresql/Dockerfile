FROM postgres:latest

LABEL version="1.0"

ENV POSTGRES_PASSWORD grimdawn
ENV POSTGRES_USER grimdawn
ENV PGDATA /var/lib/postgresql/data/grimdawn
ENV POSTGRES_DB grimdawn

COPY postgresql.conf /postgresql.conf
COPY docker-entrypoint.sh /docker-entrypoint.sh
RUN chmod 777 /docker-entrypoint.sh

# Default container timezone as found under the directory /usr/share/zoneinfo/.
ENV CONTAINER_TIMEZONE Europe/Budapest
ENV DEBIAN_FRONTEND noninteractive
# RUN apt-get install -y tzdata
RUN ln -fs /usr/share/zoneinfo/$CONTAINER_TIMEZONE /etc/localtime
RUN dpkg-reconfigure --frontend noninteractive tzdata

COPY grimdawn.sql /docker-entrypoint-initdb.d/grimdawn.sql
COPY grimdawn-data.csv /docker-entrypoint-initdb.d/grimdawn-data.csv

RUN localedef -i en_US -c -f UTF-8 -A /usr/share/locale/locale.alias en_US.UTF-8
ENV LANG en_US.utf8

