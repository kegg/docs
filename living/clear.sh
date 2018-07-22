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

find . -type f -name '*.class' -delete
