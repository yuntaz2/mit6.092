#!/usr/bin/env bash
rm ~/missing/out.txt
echo "Start running test.sh, output -> out.txt, error -> err.txt"
count=0
while [[ $? -eq 0 ]]; do
    count=$((count + 1))
    /home/yun/missing/test.sh >>out.txt
done
echo "It takes $count times to fail" >>out.txt
