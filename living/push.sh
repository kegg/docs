#!/bin/bash

rm *.aux
rm *.log
rm *.lof
rm *.pdf
rm *.toc;
rm *.bbl;
rm *.blg;
rm *.bcf;
rm *.xml;
rm *.lot;

pdflatex living.tex
biber living
pdflatex living.tex

pdflatex religion.tex
biber religion
pdflatex religion.tex

xdg-open living.pdf
xdg-open religion.pdf

find . -type f -name '*.class' -delete
