FROM httpd:2.4-alpine
LABEL maintainer="medina.levic"
LABEL version="1.0"
RUN apk add git
WORKDIR /web
RUN git clone https://github.com/PdelBot/peliculillas.git .
RUN mv ./* /usr/local/apache2/htdocs/
#COPY index.html /usr/local/apache2/htdocs/