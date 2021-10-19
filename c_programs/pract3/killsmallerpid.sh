#!/bin/bash

A=`ps | awk 'BEGIN {min=10000000000;} /nano/{ if ($1 < min) min=$1;} END {print min}'`

echo $A
kill -9 $A
