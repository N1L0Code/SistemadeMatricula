evaluar:-
opciones(Carrera),
write('Su vocacion al que se asemeja mas es: '),
write(Carrera),
nl,
write('Mucha Suerte!'),
deshacer.

%Posibles opciones
opciones(informatica):- informatica.
opciones(matematicapura):- matematicapura.
opciones(derecho):- derecho.
opciones(trabajosocial):-trabajosocial.
opciones(administracion):-administracion.
opciones(contabilidad):-contabilidad.
opciones(general):-general.
opciones(desconocido).

%Reglas de identificacion
informatica:-
verificar(programacion),
verificar(lectura),
verificar(estadistica),
verificar(compromiso),
verificar(idiomas),
write('Vision:'),
nl,
write('Tiene pasion,eres una persona cautelosa que busca dar soluciones optimas usando herramientas de programacion'),
nl.

matematicapura:-
verificar(numeros),
verificar(ciencia),
verificar(estadistica),
verificar(compromiso),
verificar(calculo),
write('Vision:'),
nl,
write('Tienes un gran interes en el ambito matematico,y tu capacidad en el calculo,te hara tener exito'),
nl.

derecho:-
verificar(leyes),
verificar(socializar),
verificar(estadistica),
verificar(compromiso),
verificar(economia),
write('Vision:'),
nl,
write('Tienes actitud para las leyes,tu deseo de socializar y convenser te podrianllevar lejos en el ambito del negocios'),
nl.

trabajosocial:-
verificar(disciplina),
verificar(socializar),
verificar(idiomas),
verificar(compromiso),
verificar(bienestar),
write('Vision:'),
nl,
write('Tienes capacidad para apoyar a las personas para que sean capaces de manifestar las necesidades, puntos de vista y circunstancias.'),
nl.

administracion:-
verificar(disciplina),
verificar(economia),
verificar(estadistica),
verificar(compromiso),
verificar(calculo),
write('Vision:'),
nl,
write('Tienes una vision proactiva, te proyectas a un entorno administrativo, que seria muy beneficioso en la toma de desiciones en una empresa'),
nl.

contabilidad:-
verificar(etica),
verificar(economia),
verificar(estadistica),
verificar(compromiso),
verificar(analisis),
write('Vision:'),
nl,
write('Tienes interes para las competencias en el ambito de los negocios, utilizando tu capacidad de analisis y etica'),
nl.

general:-
write('Vision: '),
nl,
write('Tu talento e interes aun son arbitrarios, aun asi puedes desempeñarte bien en cualquiera de nuestras carreras'),
nl.

%Resolucion de preguntas
preguntar(Pregunta):-
write('El alumno muestra las siguientes capacidades: '),
write(Pregunta),
write('?'),
read(Respuesta),
nl,
((Respuesta==si)
->
assert(si(Pregunta));
assert(no(Pregunta)),fail).

:-dynamic si/1,no/1.

%Verificacion
verificar(C):-
(si(C)
->
true;
(no(C)
->
fail;
preguntar(C))).


deshacer:- retract(si(_)),fail.
deshacer:- retract(no(_)),fail.
deshacer.


