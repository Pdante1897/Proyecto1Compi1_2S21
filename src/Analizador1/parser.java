
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.*;
import Arbol.*;
import Datos.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\004\000\002\002\011\000\002\003" +
    "\004\000\002\003\003\000\002\007\011\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\005\005\000\002\006\005\000\002" +
    "\006\005\000\002\006\005\000\002\006\003\000\002\006" +
    "\003\000\002\006\003\000\002\010\004\000\002\010\003" +
    "\000\002\011\007\000\002\015\005\000\002\015\005\000" +
    "\002\015\004\000\002\015\004\000\002\015\004\000\002" +
    "\015\003\000\002\015\003\000\002\015\005\000\002\014" +
    "\004\000\002\014\003\000\002\013\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\004\006\004\001\002\000\004\020\011\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\006\020\011\024\041\001\002\000\006\020\ufffe\024" +
    "\ufffe\001\002\000\004\011\012\001\002\000\004\024\013" +
    "\001\002\000\004\013\014\001\002\000\004\023\015\001" +
    "\002\000\016\025\025\026\024\027\020\030\017\031\016" +
    "\034\023\001\002\000\004\010\ufff9\001\002\000\004\010" +
    "\ufffa\001\002\000\004\010\ufffb\001\002\000\006\010\ufffc" +
    "\017\032\001\002\000\004\010\031\001\002\000\010\010" +
    "\ufff1\017\ufff1\035\027\001\002\000\006\010\ufff3\017\ufff3" +
    "\001\002\000\006\010\ufff2\017\ufff2\001\002\000\004\010" +
    "\ufff8\001\002\000\004\034\030\001\002\000\004\010\ufff7" +
    "\001\002\000\006\020\ufffd\024\ufffd\001\002\000\010\025" +
    "\034\026\033\034\035\001\002\000\006\010\ufff5\017\ufff5" +
    "\001\002\000\006\010\ufff6\017\ufff6\001\002\000\006\010" +
    "\ufff4\017\ufff4\001\002\000\006\012\uffef\024\uffef\001\002" +
    "\000\006\012\070\024\041\001\002\000\006\020\uffff\024" +
    "\uffff\001\002\000\004\013\042\001\002\000\004\023\043" +
    "\001\002\000\022\005\044\006\051\014\045\015\046\016" +
    "\054\021\052\022\053\033\047\001\002\000\024\005\uffe8" +
    "\006\uffe8\010\uffe8\014\uffe8\015\uffe8\016\uffe8\021\uffe8\022" +
    "\uffe8\033\uffe8\001\002\000\022\005\044\006\051\014\045" +
    "\015\046\016\054\021\052\022\053\033\047\001\002\000" +
    "\022\005\044\006\051\014\045\015\046\016\054\021\052" +
    "\022\053\033\047\001\002\000\024\005\uffe7\006\uffe7\010" +
    "\uffe7\014\uffe7\015\uffe7\016\uffe7\021\uffe7\022\uffe7\033\uffe7" +
    "\001\002\000\004\010\062\001\002\000\004\024\060\001" +
    "\002\000\022\005\044\006\051\014\045\015\046\016\054" +
    "\021\052\022\053\033\047\001\002\000\022\005\044\006" +
    "\051\014\045\015\046\016\054\021\052\022\053\033\047" +
    "\001\002\000\022\005\044\006\051\014\045\015\046\016" +
    "\054\021\052\022\053\033\047\001\002\000\024\005\uffea" +
    "\006\uffea\010\uffea\014\uffea\015\uffea\016\uffea\021\uffea\022" +
    "\uffea\033\uffea\001\002\000\024\005\uffeb\006\uffeb\010\uffeb" +
    "\014\uffeb\015\uffeb\016\uffeb\021\uffeb\022\uffeb\033\uffeb\001" +
    "\002\000\024\005\uffe9\006\uffe9\010\uffe9\014\uffe9\015\uffe9" +
    "\016\uffe9\021\uffe9\022\uffe9\033\uffe9\001\002\000\004\007" +
    "\061\001\002\000\024\005\uffe6\006\uffe6\010\uffe6\014\uffe6" +
    "\015\uffe6\016\uffe6\021\uffe6\022\uffe6\033\uffe6\001\002\000" +
    "\006\012\uffee\024\uffee\001\002\000\022\005\044\006\051" +
    "\014\045\015\046\016\054\021\052\022\053\033\047\001" +
    "\002\000\024\005\uffed\006\uffed\010\uffed\014\uffed\015\uffed" +
    "\016\uffed\021\uffed\022\uffed\033\uffed\001\002\000\022\005" +
    "\044\006\051\014\045\015\046\016\054\021\052\022\053" +
    "\033\047\001\002\000\024\005\uffec\006\uffec\010\uffec\014" +
    "\uffec\015\uffec\016\uffec\021\uffec\022\uffec\033\uffec\001\002" +
    "\000\006\012\ufff0\024\ufff0\001\002\000\004\012\071\001" +
    "\002\000\004\024\074\001\002\000\006\007\uffe4\024\uffe4" +
    "\001\002\000\006\007\101\024\074\001\002\000\004\011" +
    "\075\001\002\000\004\005\076\001\002\000\004\010\077" +
    "\001\002\000\006\007\uffe3\024\uffe3\001\002\000\006\007" +
    "\uffe5\024\uffe5\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\004\002\004\001\001\000\006\003\006\007" +
    "\007\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\007\037\010\036\011\035\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\004\021\005\025\006\020\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\066\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\047\001\001" +
    "\000\002\001\001\000\004\015\064\001\001\000\004\015" +
    "\062\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\015\056\001\001\000\004\015\055\001" +
    "\001\000\004\015\054\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\015\063\001\001\000\002" +
    "\001\001\000\004\015\065\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\013\071\014\072" +
    "\001\001\000\002\001\001\000\004\013\077\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  
    public static ArrayList<Arbol> lista = new ArrayList<Arbol>(); 
    public static int contador=1;
    public static int num=1;
    public static ArrayList<ErrorA> errores = new ArrayList<ErrorA>();
    public String[] firstLast(Nodo var, Nodo var2){
        String firstLast[]= new String[2];
        String last="";
        String first="";
        if (var.anulable) {
            first=first+var.first+","+var2.first;
            last= var2.last;
        }else{
            first=first+var.first;
        }
        if (var2.anulable) {
            last= last+var.last+",";
            last= last+var2.last;
            
        }else{
            last= var2.last;
        }
        firstLast[0]=first;    
        firstLast[1]=last;
        return firstLast;      
    }
    //-----------------------------------------para errores sintacticos-------------------------------------------------------------------------------------------
    public void syntax_error(Symbol s)
    {
        System.err.println("Error SINTACTICO en la Línea " + (s.right) +" Columna "+(s.left+1)+ ". Identificador "+s.value + " no reconocido. Se ha recuperado del error." );
        ErrorA errorA;
            if(errores.isEmpty()){
            errorA = new ErrorA(0,"Sintactico","Encontrado identificador \""+s.value+"\" no reconocido", s.right, s.left+1);
            }else{
                errorA = new ErrorA(errores.size()+1,"Sintactico","Encontrado identificador \""+s.value+"\" no reconocido", s.right, s.left+1);
            }
     
            errores.add(errorA);
    }
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
        System.err.println("Error SINTACTICO en la Línea " + (s.right)+ " Columna "+(s.left+1)+". Identificador " +s.value + " no reconocido.");
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {



  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= llavea CONJ EXPRESION porcen porcen ENTRADA llavec 
            {
              Object RESULT =null;
		System.out.println("si jala!");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CONJ ::= CONJ DECONJ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONJ",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CONJ ::= DECONJ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONJ",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DECONJ ::= conj dsp id guion mayor CUCONJ pyc 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECONJ",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CUCONJ ::= LISTA 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUCONJ",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CUCONJ ::= casoa 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUCONJ",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CUCONJ ::= casob 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUCONJ",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CUCONJ ::= casoc 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUCONJ",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CUCONJ ::= CASOD 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUCONJ",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CASOD ::= caracter oguion caracter 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CASOD",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // LISTA ::= LISTA coma entero 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // LISTA ::= LISTA coma letra 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // LISTA ::= LISTA coma caracter 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // LISTA ::= letra 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // LISTA ::= entero 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // LISTA ::= caracter 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("LISTA",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPRESION ::= EXPRESION DEXP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPRESION ::= DEXP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DEXP ::= id guion mayor CUERPOEXP pyc 
            {
              Object RESULT =null;
		int Nomleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int Nomright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String Nom = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Nodo var = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 Nodo acept = new Nodo(null, null, "#", parser.contador, false, parser.num, String.valueOf(parser.num), String.valueOf(parser.num)); parser.contador++;  Nodo raiz = new Nodo(var, acept, ".", parser.contador, false, 0, parser.firstLast(var, acept)[0], parser.firstLast(var, acept)[1]);  parser.contador=1; parser.num=1; Arbol arbol = new Arbol(Nom, raiz); parser.lista.add(arbol);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("DEXP",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // CUERPOEXP ::= orr CUERPOEXP CUERPOEXP 
            {
              Nodo RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Nodo var = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var2 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var, var2, "\\|", parser.contador, false, 0, var.first+","+var2.first, var.last+","+var2.last); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOEXP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // CUERPOEXP ::= punto CUERPOEXP CUERPOEXP 
            {
              Nodo RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Nodo var = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var2 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var, var2, ".", parser.contador, false, 0, parser.firstLast(var, var2)[0], parser.firstLast(var, var2)[1]); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOEXP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // CUERPOEXP ::= asterisco CUERPOEXP 
            {
              Nodo RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var, null, "*", parser.contador, true, 0, var.first, var.last); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOEXP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CUERPOEXP ::= mas CUERPOEXP 
            {
              Nodo RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var, null, "+", parser.contador, false, 0, var.first, var.last); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOEXP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CUERPOEXP ::= interrogacion CUERPOEXP 
            {
              Nodo RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var, null, "?", parser.contador, true, 0, var.first, var.last); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOEXP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CUERPOEXP ::= cadena 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(null, null, var1, parser.contador, false, parser.num, String.valueOf(parser.num), String.valueOf(parser.num)); parser.contador++; parser.num++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOEXP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // CUERPOEXP ::= caracteresp 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(null, null, "\\"+var1, parser.contador, false, parser.num, String.valueOf(parser.num), String.valueOf(parser.num)); parser.contador++; parser.num++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOEXP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // CUERPOEXP ::= llavea id llavec 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=new Nodo(null, null, var1, parser.contador, false, parser.num, String.valueOf(parser.num), String.valueOf(parser.num)); parser.contador++; parser.num++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOEXP",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ENTRADA ::= ENTRADA CONTENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ENTRADA",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ENTRADA ::= CONTENT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ENTRADA",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // CONTENT ::= id dsp cadena pyc 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONTENT",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}