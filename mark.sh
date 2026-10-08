#!/bin/bash
# mark.sh NNN_net.md "DONE"
mkdir -p notes/_status
printf '%s | %s\n' "$1" "$2" > "notes/_status/$1.txt"
