set xrange [0:110000] 
set yrange [-10:]
set xtics 20000
set ytics 10 
set xlabel "Tamaño"
set ylabel "Microsegundos"
set key left
set grid

plot "linearSearch.out" using 1:2 title "Mejor caso" with points, \
     "linearSearch.out" using 1:3 title "Peor caso" with points, \
     "linearSearch.out" using 1:4 title "Caso promedio" with points
