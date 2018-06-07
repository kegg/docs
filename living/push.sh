#!/bin/bash

rm *.aux
rm *.log
rm *.pdf

pdflatex living.tex

xdg-open living.pdf

