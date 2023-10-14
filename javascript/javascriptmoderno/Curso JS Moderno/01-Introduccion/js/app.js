const nombre = prompt('Cual es tu nombre?');
document.querySelector('.contenido').innerHTML = `${nombre} esta aprendiendo Javascript Moderno`; //document.querySelector: selecciona contenidos del html
//template string (`)

/* bloque de comentario

ESTO ESTA COMENTADO.

*/

const producto = 'Monitor 24 pulgadas';
console.log('Hola');
console.time('Holaaaaaaaa');
console.error('Algo salio mal');
console.warn('Esto no esta permitido');


console.timeEnd('Holaaaaaaaa');