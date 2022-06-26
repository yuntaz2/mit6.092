#!/usr/bin/sh

echo "starting program at $(date)"
echo "Running program $0 pid:$$ with $# arg"

for file in "$@"; do
	grep foobar "$file" > /dev/null 2> /dev/null
	if [[ "$?" -ne 0 ]]; then
		echo "File $file does not have any foobar, so adding one"
		echo "# foobar" >> "$file"
	fi
done
