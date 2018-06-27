#!/bin/bash

if [ -f *.aux ] ; then
  rm *.aux
fi

if [ -f *.log ] ; then
  rm *.log
fi

if [ -f *.lof ] ; then
  rm *.lof
fi

if [ -f *.pdf ] ; then
  rm *.pdf
fi

if [ -f *.toc ] ; then
  rm *.toc;
fi

if [ -f *.bbl ] ; then
  rm *.bbl;
fi

if [ -f *.blg ] ; then
  rm *.blg;
fi

if [ -f *.bcf ] ; then
  rm *.bcf;
fi

if [ -f *.xml ] ; then
  rm *.xml;
fi

pdflatex living.tex
biber living
pdflatex living.tex

xdg-open living.pdf

find . -type f -name '*.class' -delete
