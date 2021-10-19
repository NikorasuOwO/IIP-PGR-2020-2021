#!/bin/bash

NOMBRE=$1

list=`ls /proc | awk '/[0-9]/ {print $1}' `
#echo $list
i=0

for ps in $list
do
	VAR=`cat /proc/$ps/comm 2> null`
	#echo $VAR
	if [ "$VAR" = "$NOMBRE" ];
	then
	#echo $VAR
	i=$(($i + 1))
	fi
done

echo There are $i process with name \"$NOMBRE\"
