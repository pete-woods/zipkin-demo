# Zipkin Spring-Sleuth Tracing Demo

This is a simple demo for distributed tracing using Apache Zipkin and
Spring Cloud Sleuth. There are three services:

- demoA
- demoB
- demoC

Each of the services relies on the next in a synchronous REST call chain.
Demo C has a "performance issue" (10% of queries go slow). Using distributed
tracing with Spring Sleuth you can easily identify this, without any changes
to the codebase.

## Requirements

- Docker

## Building

This will run 3 multi-stage Docker builds for each of the 3 micro-services
```
# ./build.sh
```

## Deploying

Start the Swarm deployment with:
```
# ./deploy.sh
```

and stop it with:
```
# ./stop.sh
```

## Usage

- Zipkin at http://localhost:9411
- Main app at http://localhost:8080