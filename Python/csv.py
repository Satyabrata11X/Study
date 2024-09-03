import csv
%precision 2
with open('mpg.csv')as csvfile:
    mpg=list(csv.DictReader(csvfile))
mpg[:3]