#!/bin/bash

# Declare the file name
FILE_NAME=$(getopt -o f: --long file: -- "$@")
eval set -- "$FILE_NAME"
while true; do
   case "$1" in
      --file)
         FILE_NAME="$2"
         shift 2
         ;;
      --)
         shift
         break
         ;;
      *)
         echo "Invalid option"
         exit 1
         ;;
   esac
done

if [ -z "$FILE_NAME" ]; then
   echo "Error: --file option is required."
   exit 1
fi


echo "Compiling ${FILE_NAME}.java ...";

# Compile Program.java
javac "${FILE_NAME}.java"
if [ $? -ne 0 ]; then
   echo "Compilation failed."
   exit 1
fi

echo "Compiling ${FILE_NAME}.java successfully.";

# Run the Program class
java $FILE_NAME