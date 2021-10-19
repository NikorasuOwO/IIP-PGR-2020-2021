#!/bin/bash

function script_func(){
ps | head -n -2 > ps.txt
list=`awk '/[0-9]/ {print $1}' ps.txt`

for item in $list
do
./inf_process.sh $item
done
}

script_func #2> /dev/null # redirigimos los errores para no verlos. jeje
