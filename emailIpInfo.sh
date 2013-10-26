#!/bin/sh
date > date
wget ipecho.net/plain #returns just the ip address
echo $'\n' > newline
ifconfig eth0 > local #may want to change specified metwork interface
cat date newline plain newline local | mail -s EmailSubject email@domain.com
rm date newline plain local
#update crontab and point to this script