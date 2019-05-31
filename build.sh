#!/bin/bash
set -euo pipefail

(
    cd demoA
    docker build . -t petewoods/demoa
)
(
    cd demoB
    docker build . -t petewoods/demob
)
(
    cd demoC
    docker build . -t petewoods/democ
)
