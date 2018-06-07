#!/bin/bash

rm *.aux
rm *.log
rm *.pdf
rm *.toc

pdflatex living.tex

xdg-open living.pdf

