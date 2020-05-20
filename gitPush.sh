#!/bin/bash
if [ $? -eq 0 ] ; then commit='autocommit'; else commit=$1;  fi
git add . && git commit -m "$commit" && git push origin master
