package Analizador1;
import java_cup.runtime.*;

%% 
%class Lexico
%public 
%line 
%char 
%cup 
%unicode
%ignorecase

%init{ 
	yyline = 1; 
	yychar = 1; 
%init} 

BLANCOS = [ \t\r]+
D=[0-9]+
DECIMAL= [0-9]+"."[0-9]+
ID=[A-Z|a-z]+["_"|0-9|A-Z|a-z]*
COMENTARIOML="#*""*"*([^*#]|[^*]"#"|"*"[^#])*"*"*"*#"
COMENTARIO=("##".*\n)|("##".\n)
CARACTER =(["("]|[")"]|["/"]|["!"]|["#"]|["$"]|["&"]|["%"]|["'"]|["@"]|["`"]|["<"]|["^"]|["_"]|["\\"])+
COMILLAS = ("\"")
CADENAS= {COMILLAS} ({LETRA}|{D}|{CARACTER}|{BLANCOS}|"-"|","|";"|"%"|":"|"+"|"*"|"."|"|"|"?"|"}"|"{"|">")* {COMILLAS}
LETRA=[a-z]|[A-Z]
%%



{COMENTARIO}    {} 
{COMENTARIOML}  {}


{CADENAS}       {return new Symbol(sym.cadena,yychar,yyline,(yytext()).substring(1,yytext().length()-1));}
{CARACTER}         {return new Symbol(sym.caracter,yychar,yyline,yytext());}
{COMILLAS} {}
{DECIMAL}         {return new Symbol(sym.decimal,yychar,yyline,yytext());}


"GenerarReporteEstadistico" {return new Symbol(sym.gerest,yychar,yyline,yytext());}
"DefinirGlobales" {return new Symbol(sym.defglo,yychar,yyline,yytext());}
"Compare" {return new Symbol(sym.compare,yychar,yyline,yytext());}

"GraficaBarras" {return new Symbol(sym.grafbar,yychar,yyline,yytext());}
"GraficaPie" {return new Symbol(sym.grafpie,yychar,yyline,yytext());}
"GraficaLineas" {return new Symbol(sym.graflinea,yychar,yyline,yytext());}
"Titulo" {return new Symbol(sym.titulo,yychar,yyline,yytext());}
"TituloX" {return new Symbol(sym.titulox,yychar,yyline,yytext());}
"TituloY" {return new Symbol(sym.tituloy,yychar,yyline,yytext());}
"Valores" {return new Symbol(sym.valores,yychar,yyline,yytext());}

"EjeX" {return new Symbol(sym.ejex,yychar,yyline,yytext());}

"string" {return new Symbol(sym.str,yychar,yyline,yytext());}
"double" {return new Symbol(sym.doub,yychar,yyline,yytext());}

"=" {return new Symbol(sym.igual,yychar,yyline,yytext());}

"{" {return new Symbol(sym.llavea,yychar,yyline,yytext());}
"}" {return new Symbol(sym.llavec,yychar,yyline,yytext());}
"[" {return new Symbol(sym.cora,yychar,yyline,yytext());}
"]" {return new Symbol(sym.corc,yychar,yyline,yytext());}
";" {return new Symbol(sym.pyc,yychar,yyline,yytext());}
":" {return new Symbol(sym.dsp,yychar,yyline,yytext());}
"-" {return new Symbol(sym.guion,yychar,yyline,yytext());}
"." {return new Symbol(sym.punto,yychar,yyline,yytext());}
"|" {return new Symbol(sym.orr,yychar,yyline,yytext());}

"+" {return new Symbol(sym.mas,yychar,yyline,yytext());}
"," {return new Symbol(sym.coma,yychar,yyline,yytext());}


\n {yychar=1;}

{BLANCOS}       {}
{ID}        {return new Symbol(sym.id,yychar,yyline,yytext());}
{D}         {return new Symbol(sym.entero,yychar,yyline,yytext());}


.   {
	    System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yychar));
            
            
    }