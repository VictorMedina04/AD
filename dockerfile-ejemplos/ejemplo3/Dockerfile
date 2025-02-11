FROM node:20.10-alpine3.19 as builder
RUN apk add git
WORKDIR /web
RUN git clone https://github.com/PdelBot/peliculillas.git .
WORKDIR /web/app
RUN npm install -g @angular/cli
RUN npm install
RUN ng build --configuration production --aot

FROM nginx:alpine
WORKDIR /usr/share/nginx/html
COPY --from=builder /web/app/dist/peliculillas/ .