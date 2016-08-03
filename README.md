# SWII
softwareII II 2016
<table>
<tr><th>Integrantes</th></tr>
<tr>
  <td>Natalia Moreno Lopera</td>
</tr>
<tr>
  <td>Daniel Granados Aguilar</td>
</tr>
</table>

<h1>1. Explorador de marte </h1>

<article>
 <header><h2>Instrucciones:<h2></header>
 <p>Suponga que la aplicación recibirá las líneas de entrada a través de un archivo de texto plano sin ningún tipo de formato en particular.</p>

<h2>Enunciado:</h2> 
<p>Un equipo de de exploradores roboticos han sido solicitados por la NASA para que aterricen en la superficie de Marte.</p>
<p>Curiosamente la superficie de Marte es plana y debe ser navegada por los exploradores de manera que las cámaras internas tengan una vista completa del terreno circundante y así mandar estas imágenes al planeta Tierra.</p>
<p>Una posición del explorador está representada por la combinación de coordenadas X y Y y una letra que corresponde a uno de los puntos cardinales.</p>
<p>Por simplificación, el terreno de Marte puede ser visto como una grilla. Por ejemplo, (0,0,N) corresponde a la posición de un explorador en la esquina inferior izquierda de la grilla estando el explorando apuntando al norte. Con el propósito de controlar el explorador robótico, la NASA envía cadenas de caracteres sencillas. Las letras posibles son ‘I’, ‘D’ y ‘A’.</p>
<ul>
  <li> ‘I’ corresponde a girar 90 grados a la Izquierda sin moverse del punto en la grilla en la que se encuentra</li>
  <li> ‘D’ corresponde a girar 90 grados a la Derecha sin moverse del punto en la grilla en la que se encuentra</li>
  <li> ‘A’ corresponde a realizar un movimiento hacia adelante manteniendo la misma dirección en la que actualmente se encuentra.</li>
</ul>

<p>Asuma que el cuadro que queda al norte del punto (X,Y) es (X,Y+1). Datos de entrada: La primera línea de datos de entrada es la coordenada superior derecha máxima posible del terreno de Marte, la coordenada inferior izquierda se asume que es 0,0.</p>

<p>El resto de los datos de entrada es información pertinente a los exploradores que han aterrizado en la superficie marciana. Cada explorador tiene dos líneas de entrada de datos. La primera línea corresponde la posición actual del explorador y la segunda línea es una serie de instrucciones que le indican al robot como debe explorar el terreno.</p>

<p>La posición está compuesta por dos enteros y una letra separados por espacios, correspondientes a la coordenada X y Y y la orientación del explorador.</p>

<p>Cada explorador será finalizado secuencialmente, lo que significa que el segundo explorador no iniciará sus movimientos hasta que el último explorador haya finalizado sus movimientos.<p>

<h2>Datos de salida:</h2>

<p>La salida en consola por cada explorador debe ser suposición final y su orientación.</p>

<h2>Ejemplo</h2>

<h3>Entrada de ejemplo:</h3>
<code>
5 5

1 2 N

IAIAIAIAA

3 3 E

AADAADADDA
</code>

<h3>Salida en consola esperada:</h3>
<code>
1 3 N

5 1 E
</code>
