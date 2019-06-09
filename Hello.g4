//TODO comentarios, vectores-matrices,

grammar Hello;

s : eol? programa? declaraciones? Tk_inicio eol sentencias? Tk_fin subRutinas? ; //inicio de la gramatica

programa : Tk_programa Tk_id eol;

/////////////////////////        Declaraciones        /////////////////////////////////////////

declaraciones :variables declaraciones?
              |constants declaraciones?
              |types declaraciones?;

// Declaracion variables
variables : Tk_var eol variables_aux?; // es obligatorio ese salto de linea?
variables_aux: Tk_id (Tk_comma eol? Tk_id)* Tk_colon tipo eol variables_aux?;
tipo : Tk_numerico
       | Tk_logico
       | Tk_cadena;

// Declaracion constantes
constants : Tk_cons eol constants_aux?;
constants_aux : Tk_id Tk_assig valor eol constants_aux?;
valor : Tk_num | Tk_str | verdad;
verdad : Tk_true | Tk_false;

//Declaración Tipos
types : Tk_tipos eol types_aux?;
types_aux : Tk_id Tk_colon tipo2 eol types_aux?;
tipo2 : Tk_numerico | Tk_logico | Tk_cadena | registro;
registro: Tk_registro eol? Tk_okey eol variables_aux Tk_ckey;

////////////////////////////       Sentencias         ///////////////////////////////////

sentencias: asignacion sentencias? eol
           |condicional sentencias? eol
           |cicloMientras sentencias? eol
           |cicloRepetir sentencias? eol
           |eval sentencias? eol
           |desde sentencias? eol
           |llamada sentencias? eol;

// Sentencias de asignación

asignacion : Tk_id Tk_assig asignacionAux;
asignacionAux : valor | llamada | operacionMatematica | Tk_id ;


// Sentencias condicionales (if)

condicional : Tk_si Tk_opar condicion Tk_cpar eol? Tk_okey eol? sentencias?
              (Tk_sino Tk_si Tk_opar condicion Tk_cpar eol? sentencias? eol?)*
              (Tk_sino eol? sentencias? eol?)? Tk_ckey;

// Sentencias del ciclo mientras

cicloMientras : Tk_mientras Tk_opar condicion Tk_cpar eol? Tk_okey eol? sentencias? Tk_ckey;

// Sentencias ciclo repetir hasta

cicloRepetir : Tk_repetir eol? sentencias? Tk_hasta Tk_opar condicion Tk_cpar;

// Sentencias del eval (switch case)

eval : Tk_eval eol? Tk_okey eol?
       (Tk_caso Tk_opar condicion Tk_cpar eol? sentencias)*
       (Tk_sino eol? sentencias)? Tk_ckey;

// Sentencias ciclo desde / hasta

desde : Tk_desde Tk_id Tk_assig auxNum Tk_hasta auxNum
       eol? Tk_okey eol? sentencias Tk_ckey; //TODO en la documentación menciona como poner el paso de incremento pero no encuentro un ejemplo pg 51

//Sentencias de llamado de función

llamada : Tk_id Tk_opar tiposLLamada? (tiposLLamada Tk_comma tiposLLamada)* Tk_cpar;
tiposLLamada : Tk_num | Tk_str | llamada | operacionMatematica | condicion | vector | matriz;

////////////////////////////       Sub Rutinas        ///////////////////////////////////TODO

subRutinas: Tk_id ;//TODO




//////////////////////////// No se como llamar esta sección //////////////////////////////
// parte matemática
operacionMatematica : auxNum signo operacionMatematicaAux;  // TODO lo de los parentesis
operacionMatematicaAux : auxNum (signo operacionMatematicaAux)?;

signo: Tk_sum | Tk_subt | Tk_div | Tk_mult ;

auxNum : Tk_id | Tk_num | llamada;

//Parte de lógica  //TODO necesita bastante trabajo IMPORTANTE

condicion : auxLog relacional auxLog (condicionAux condicion)?; //TODO lo de los parentesis x2
condicionAux : Tk_or | Tk_and; //TODO pensar en qué hacer con la negación
relacional : Tk_less | Tk_equal | Tk_lessEqual | Tk_bigger | Tk_biggerEqual | Tk_diferent;
auxLog : Tk_id | Tk_num | llamada | verdad | Tk_str;  //TODO --- TRUE < TRUE?

// estructuras //TODO
vector : Tk_str;//TODO es evidente que no hay mucho
matriz : Tk_str;//TODO x2



eol : EOL; //end of line (para pensar y ponerle el punto y coma luego (podría desaparecer en un futuro))


/////////////////////////////       Tokens            ////////////////////////////////////
Tk_inicio : 'inicio';
Tk_fin : 'fin';
Tk_var : 'var';
Tk_cons : 'cons';
Tk_tipos: 'tipos';
Tk_programa : 'programa';
Tk_numerico : 'numerico';
Tk_logico : 'logico';
Tk_cadena : 'cadena' ;
Tk_registro : 'registro';
Tk_true : 'TRUE';
Tk_false : 'FALSE';
Tk_and : 'and';
Tk_or : 'or';
Tk_mientras : 'mientras';
Tk_repetir : 'repetir';
Tk_hasta : 'hasta';
Tk_eval : 'eval';
Tk_caso : 'caso';
Tk_desde : 'desde';
Tk_si: 'si';
Tk_sino: 'sino';
Tk_sum : '+';
Tk_subt : '-';
Tk_div : '/';
Tk_mult : '*';
Tk_less : '<';
Tk_lessEqual : '<=';
Tk_bigger : '>';
Tk_biggerEqual : '>=';
Tk_equal : '==';
Tk_diferent : '<>';
Tk_comma : ',';
Tk_colon : ':';
Tk_assig: '=';
Tk_okey : '{';
Tk_ckey : '}';
Tk_opar : '(';
Tk_cpar : ')';
Tk_num : [0-9]+('e'[0-9]+)?; // TODO falta agregar . decimal
Tk_str : '"'[A-Za-z1-9 ]+'"'; // TODO falta agregar los de comilla sencilla
Tk_id : [a-zA-Z]+[a-z0-9A-Z]*;
EOL: [\r\n]+;
WS : [ \t]+ -> skip;