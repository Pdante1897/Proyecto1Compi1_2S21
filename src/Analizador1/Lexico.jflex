package Analizadores;
import java_cup.runtime.*;
import Datos.*;

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
ID=[A-Z|a-z]+["_"|0-9|A-Z|a-z]*
COMENTARIOML="<!""!"*([^!>]|[^!]">"|"!"[^>])*"!"*"!>"
COMENTARIO=("//".*\n)|("//".\n)
//CASOD= [CARACTER] "~" [CARACTER]
CARACTER = ["("]|[")"]|["/"]|["!"]|["#"]|["$"]|["&"]|["%"]|["'"]|["@"]|["`"]|["<"]|["["]|["]"]|["^"]|["_"]|["\\"]|["="]
CADENAS= (\"({LETRA}|{D}|{CARACTER}|{BLANCOS}|"-"|","|";"|"%"|":"|"+"|"*"|"."|"|"|"?"|"}"|"{"|">")*\")

CASOA=[0-9]"~"[0-9]
CASOB=[A-Z]"~"[A-Z]
CASOC=[a-z]"~"[a-z]

LETRAEXPREG = \\"[A-Z]|[a-z]|[0-9]\\"
LETRA=[a-z]|[A-Z]
CARACTERESP="\\"["n"|"'"|"\""]
%%

{COMENTARIO}    {} 
{COMENTARIOML}  {}
{LETRAEXPREG}       {return new Symbol(sym.letraexp,yychar,yyline,(yytext()).substring(1,yytext().length()-1));}
{CADENAS}       {return new Symbol(sym.cadena,yychar,yyline,(yytext()).substring(1,yytext().length()-1));}
{CARACTER}         {return new Symbol(sym.caracter,yychar,yyline,yytext());}

"~" {return new Symbol(sym.oguion,yychar,yyline,yytext());}

"{" {return new Symbol(sym.llavea,yychar,yyline,yytext());}
"}" {return new Symbol(sym.llavec,yychar,yyline,yytext());}
";" {return new Symbol(sym.pyc,yychar,yyline,yytext());}
":" {return new Symbol(sym.dsp,yychar,yyline,yytext());}

"%%" {return new Symbol(sym.porcen,yychar,yyline,yytext());}
"-" {return new Symbol(sym.guion,yychar,yyline,yytext());}
"." {return new Symbol(sym.punto,yychar,yyline,yytext());}
"|" {return new Symbol(sym.orr,yychar,yyline,yytext());}

"+" {return new Symbol(sym.mas,yychar,yyline,yytext());}
"," {return new Symbol(sym.coma,yychar,yyline,yytext());}
"CONJ" {return new Symbol(sym.conj,yychar,yyline,yytext());}
"?" {return new Symbol(sym.interrogacion,yychar,yyline,yytext());}

"*" {return new Symbol(sym.asterisco,yychar,yyline,yytext());}
">" {return new Symbol(sym.mayor,yychar,yyline,yytext());}

\n {yychar=1;}
{LETRA}     {return new Symbol(sym.letra,yychar,yyline,yytext());}
{CARACTERESP}         {return new Symbol(sym.caracteresp,yychar,yyline,yytext());}

{BLANCOS}       {}
{ID}        {return new Symbol(sym.id,yychar,yyline,yytext());}
{D}         {return new Symbol(sym.entero,yychar,yyline,yytext());}

{CASOA}     {return new Symbol(sym.casoa,yychar,yyline,yytext());}
{CASOB}     {return new Symbol(sym.casob,yychar,yyline,yytext());}
{CASOC}     {return new Symbol(sym.casoc,yychar,yyline,yytext());}
//{CASOD}     {return new Symbol(sym.casod,yychar,yyline,yytext());}



.   {
	    System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yychar));
            
            ErrorA errorA;
            if(parser.errores.isEmpty()){
                errorA = new ErrorA(0,"Lexico","El caracter \""+yytext()+"\" no pertence al lenguaje", yyline, yychar);
            }else{
                errorA = new ErrorA(parser.errores.size()+1,"Lexico","El caracter \""+yytext()+"\" no pertence al lenguaje", yyline, yychar);
            }
     
            parser.errores.add(errorA);
    }