#!/bin/bash
# arguments
varPID=$1
varPPID=`awk '/[pP][pP][iI][dD]/{print $2}' /proc/${varPID}/status` || true
varESTADO=`awk '/State/{print $2}' /proc/${varPID}/status` || true

varCOMANDO=`awk '{print $1}' /proc/${varPID}/cmdline | tr "\0" " "`

echo -e "PID\tPPID\tESTADO\tCOMMANDO\n"
echo -e "$varPID\t$varPPID\t$varESTADO\t$varCOMANDO"
