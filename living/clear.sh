#!/bin/bash

if [ -f *.aux ] ; then
  rm *.aux
fi

if [ -f *.log ] ; then
  rm *.log
fi

if [ -f *.pdf ] ; then
  rm *.pdf
fi

if [ -f *.toc ] ; then
  rm *.toc;
fi

