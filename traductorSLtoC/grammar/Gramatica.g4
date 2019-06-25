//TODO comentarios, vectores-matrices,

grammar Gramatica;

s : eol* programa? declaraciones? cuerpo subRutinas? ; //inicio de la gramatica

programa : Tk_programa Tk_id eol*;

/////////////////////////        Declaraciones        /////////////////////////////////////////

declaraciones :variables declaraciones?
              |constants declaraciones?
              |types declaraciones?;

// Declaracion variables
variables : Tk_var eol variables_aux?; // es obligatorio ese salto de linea?
variables_aux: Tk_id (Tk_comma eol? Tk_id)* Tk_colon tipo eol variables_aux? //variables normales
             | Tk_id Tk_colon Tk_vector Tk_obracket vectorAux Tk_cbracket tipo eol variables_aux? //vectores
             | Tk_id Tk_colon Tk_matriz Tk_obracket vectorAux (Tk_comma vectorAux)+ Tk_cbracket tipo eol variables_aux?; //matrices

vectorAux : Tk_mult
          | operacionMatematica;

tipo :   Tk_numerico
       | Tk_logico
       | Tk_cadena
       | registro;

// Declaracion constantes
constants : Tk_cons eol constants_aux?;
constants_aux : Tk_id Tk_assig valor eol constants_aux?;
valor : operacionMatematica | verdad | Tk_str;
verdad : Tk_true | Tk_false;

//Declaración Tipos
types : Tk_tipos eol types_aux?;
types_aux : Tk_id Tk_colon tipo eol types_aux?;
registro: Tk_registro eol? Tk_okey eol variables_aux Tk_ckey;


/////////////////////////////      Cuerpo            ///////////////////////////////////

cuerpo: Tk_inicio eol sentencias* Tk_fin;

////////////////////////////       Sentencias         ///////////////////////////////////

sentencias: asignacion eol
           |condicional eol
           |cicloMientras eol
           |cicloRepetir eol
           |eval eol
           |desde eol
           |llamada eol;

// Sentencias de asignación

asignacion : Tk_id Tk_assig asignacionAux;
asignacionAux : llamada | valor |estruct|vector|matriz;
estruct : Tk_okey valor (Tk_comma estruct2) Tk_ckey
        | Tk_okey estruct (Tk_comma estruct) Tk_ckey // TODO la forma esa rara para rellenar matrices y vectores
        | Tk_okey valor Tk_ckey;
estruct2 : valor (Tk_comma estruct2) Tk_ckey
        | Tk_okey valor Tk_ckey;


// Sentencias condicionales (if)

condicional : Tk_si Tk_opar condicion Tk_cpar eol? Tk_okey eol? sentencias*
              condicionSinoSi* condicionSino? Tk_ckey;

condicionSinoSi : Tk_sino Tk_si Tk_opar condicion Tk_cpar eol? sentencias* eol?;

condicionSino: Tk_sino eol? sentencias* eol?;

// Sentencias del ciclo mientras

cicloMientras : Tk_mientras Tk_opar condicion Tk_cpar eol? Tk_okey eol? sentencias* Tk_ckey;

// Sentencias ciclo repetir hasta

cicloRepetir : Tk_repetir eol? sentencias* Tk_hasta Tk_opar condicion Tk_cpar;

// Sentencias del eval (switch case)

eval : Tk_eval eol? Tk_okey eol? evalAux* condicionSino? Tk_ckey;

evalAux : Tk_caso Tk_opar condicion Tk_cpar eol? sentencias ;

// Sentencias ciclo desde / hasta

desde : Tk_desde Tk_id Tk_assig operacionMatematica Tk_hasta operacionMatematica (Tk_paso operacionMatematica)? // TODO la forma en que se da el paso es opcional, o por defecto es uno
       eol? Tk_okey eol? sentencias* Tk_ckey;

//Sentencias de llamado de función

llamada : Tk_id Tk_opar tiposLLamada? (eol? Tk_comma eol? tiposLLamada)* Tk_cpar;
tiposLLamada : Tk_num | Tk_str | llamada | operacionMatematica | condicion | vector | matriz;

////////////////////////////       Sub Rutinas        ///////////////////////////////////

subRutinas: Tk_subrutina Tk_id Tk_opar subParamatros* Tk_cpar (Tk_retorna tipo)? eol? subRutinasDeclar ;

subRutinasDeclar: declaraciones* eol? subRutinasAux;

subRutinasAux : Tk_inicio eol sentencias? retorna? eol? Tk_fin ;

retorna: Tk_retorna Tk_opar retornaAux Tk_cpar ;

retornaAux : Tk_id | Tk_num | verdad ;

subParamatros : Tk_id (Tk_comma eol? Tk_id)* Tk_colon tipo (eol subParamatros)*
              | Tk_ref Tk_id (Tk_comma eol? Tk_id)* Tk_colon tipo (eol subParamatros)*;


//////////////////////////// No se como llamar esta sección //////////////////////////////

// parte matemática CON precedencia de signos

operacionMatematica : operacionMatematica signo1 (precedencia1)
                    | precedencia1;


precedencia1 : precedencia1 signo2 precedencia2
             | precedencia2;


precedencia2 : precedencia2 signo3 precedencia3
             | precedencia3;


precedencia3 : Tk_opar operacionMatematica Tk_cpar
             | auxNum;

signo1: Tk_sum | Tk_subt ;
signo2: Tk_div | Tk_mult | Tk_mod;
signo3: Tk_exp;

auxNum : Tk_id | Tk_num | llamada | vector | matriz;

// Parte de lógica  //TODO necesita bastante trabajo IMPORTANTE

condicion : auxLog relacional auxLog (condicionAux condicion)?; //TODO lo de los parentesis x2
condicionAux : Tk_or | Tk_and; //TODO pensar en qué hacer con la negación
relacional : Tk_less | Tk_equal | Tk_lessEqual | Tk_bigger | Tk_biggerEqual | Tk_diferent;
auxLog : Tk_id | Tk_num | llamada | verdad | Tk_str | vector;  //TODO --- TRUE < TRUE?


// Estructuras
vector : Tk_id Tk_obracket operacionMatematica Tk_cbracket;
matriz : Tk_id Tk_obracket operacionMatematica (Tk_comma operacionMatematica)+ Tk_cbracket;



eol : EOL | Tk_semicolon; //end of line (para pensar y ponerle el punto y coma luego (podría desaparecer en un futuro))


/////////////////////////////       Tokens            ////////////////////////////////////
Tk_inicio : 'inicio';
Tk_fin : 'fin';
Tk_var : 'var';
Tk_cons : 'const';
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
Tk_paso : 'paso';
Tk_si: 'si';
Tk_sino: 'sino';
Tk_subrutina: 'subrutina';
Tk_retorna: 'retorna';
Tk_ref: 'ref';
Tk_vector: 'vector';
Tk_matriz: 'matriz';
Tk_sum : '+';
Tk_subt : '-';
Tk_div : '/';
Tk_mult : '*';
Tk_mod : '%';
Tk_exp : '^';
Tk_less : '<';
Tk_lessEqual : '<=';
Tk_bigger : '>';
Tk_biggerEqual : '>=';
Tk_equal : '==';
Tk_diferent : '<>';
Tk_comma : ',';
Tk_colon : ':';
Tk_semicolon : ';'+;
Tk_assig: '=';
Tk_okey : '{';
Tk_ckey : '}';
Tk_opar : '(';
Tk_cpar : ')';
Tk_obracket : '[';
Tk_cbracket : ']';
Tk_num : [0-9]+('.'[0-9]+)?('e'[0-9]+('.'[0-9]+)?)?
        |[0-9]+('.'[0-9]+)?('E'[0-9]+('.'[0-9]+)?)?;
Tk_str : '"'.*?'"'; // TODO falta agregar los de comilla sencilla
Tk_id : [a-zA-Z_ñÑ][a-z0-9A-Z_ñÑ]* ('.' Tk_id)* ; // llamado a secciones de registros quedan como ID's TODO revisar si es correcto / Testee la regla y todo okay
/////////////////////////////       Comentarios      /////////////////////////////
COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
EOL: [\r\n]+;
WS : [ \t]+ -> skip;