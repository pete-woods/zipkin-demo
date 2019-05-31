#!/bin/bash
set -euo pipefail

docker stack deploy \
    --prune \
    -c 'docker-compose.yml' \
    zipkin-demo