grammar Hello;

s  : eol? programa eol declaraciones? eol Tk_inicio eol Tk_fin ; //inicio de la gramatica

programa : Tk_programa Tk_id;

//Declaraciones
declaraciones :variables declaraciones?
              |constants declaraciones?;

// Declaracion variables
variables : Tk_var eol? variables_aux?; // es obligatorio ese salto de linea?
variables_aux: Tk_id (Tk_comma eol? Tk_id)* Tk_colon tipo (eol variables_aux?)?;
tipo : Tk_numerico | Tk_logico | Tk_cadena;

// Declaracion constantes
constants : Tk_cons eol? constants_aux?;
constants_aux : Tk_id Tk_assig valor (eol constants_aux?)?;
valor : Tk_numero ;

eol : EOL; //end of line (para pensar y ponerle el punto y coma luego (podría desaparecer en un futuro))

Tk_inicio : 'inicio';
Tk_fin : 'fin';
Tk_var : 'var';
Tk_cons : 'cons';
Tk_programa : 'programa';
Tk_numerico : 'numerico';
Tk_logico : 'logico';
Tk_cadena : 'cadena';
Tk_comma : ',';
Tk_colon : ':';
Tk_assig: '=';
Tk_numero : [0-9]+('e'[0-9]+)?;
Tk_id : [a-zA-Z]+[a-z0-9A-Z]*;
EOL: [\r\n]+;
WS : [ \t]+ -> skip;