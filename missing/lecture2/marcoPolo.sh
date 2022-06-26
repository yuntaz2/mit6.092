#!/usr/bin/sh
marco() {
    echo "executing marco.sh, saving current working dirctory to variable currwd"
    currwd=$(pwd)
}
polo() {
    cd "$currwd" || exit
}
