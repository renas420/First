package pt.isec.pa.ecosistema.model.data;

import java.io.Serializable;

public sealed interface IElemento extends Serializable permits ElementoBase {
     int getId(); // retorna o identificador
     Elemento getType(); // retorna o tipo
     Area getArea(); // retorna a área ocupada

     int getX() ;
     void setX(int x) ;
     int getY() ;
     void setY(int y) ;
}
