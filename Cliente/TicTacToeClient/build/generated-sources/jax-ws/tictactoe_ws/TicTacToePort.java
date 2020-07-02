
package tictactoe_ws;

import java.math.BigInteger;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TicTacToePort", targetNamespace = "urn:TicTacToe")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TicTacToePort {


    /**
     * 
     */
    @WebMethod(action = "urn:TicTacToe#TicTacToe#reiniciar")
    @Oneway
    @RequestWrapper(localName = "reiniciar", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.Reiniciar")
    public void reiniciar();

    /**
     * 
     * @param posX
     * @param posY
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:TicTacToe#TicTacToe#turnoUsuario")
    @WebResult(name = "turnoUsuarioResult", targetNamespace = "")
    @RequestWrapper(localName = "turnoUsuario", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.TurnoUsuario")
    @ResponseWrapper(localName = "turnoUsuarioReturn", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.TurnoUsuarioReturn")
    public String turnoUsuario(
        @WebParam(name = "posX", targetNamespace = "")
        BigInteger posX,
        @WebParam(name = "posY", targetNamespace = "")
        BigInteger posY);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:TicTacToe#TicTacToe#turnoMaquina")
    @WebResult(name = "turnoMaquinaResult", targetNamespace = "")
    @RequestWrapper(localName = "turnoMaquina", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.TurnoMaquina")
    @ResponseWrapper(localName = "turnoMaquinaReturn", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.TurnoMaquinaReturn")
    public String turnoMaquina();

    /**
     * 
     * @param caracJugador
     * @param movimiento
     */
    @WebMethod(action = "urn:TicTacToe#TicTacToe#marcarEnTablero")
    @Oneway
    @RequestWrapper(localName = "marcarEnTablero", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.MarcarEnTablero")
    public void marcarEnTablero(
        @WebParam(name = "caracJugador", targetNamespace = "")
        String caracJugador,
        @WebParam(name = "movimiento", targetNamespace = "")
        String movimiento);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:TicTacToe#TicTacToe#estadoDeJuego")
    @WebResult(name = "estadoDeJuegoResult", targetNamespace = "")
    @RequestWrapper(localName = "estadoDeJuego", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.EstadoDeJuego")
    @ResponseWrapper(localName = "estadoDeJuegoReturn", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.EstadoDeJuegoReturn")
    public String estadoDeJuego();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:TicTacToe#TicTacToe#getTablero")
    @WebResult(name = "getTableroResult", targetNamespace = "")
    @RequestWrapper(localName = "getTablero", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.GetTablero")
    @ResponseWrapper(localName = "getTableroReturn", targetNamespace = "urn:TicTacToe", className = "tictactoe_ws.GetTableroReturn")
    public String getTablero();

}
