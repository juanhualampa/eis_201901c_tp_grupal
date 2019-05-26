package gradle.cucumber;

public class CeldaConPoderSaltarParedes extends CeldaConPoder {

    public CeldaConPoderSaltarParedes(Pair coordenada) {
        super(coordenada);
    }

    public void colocarBomberman(Tablero tablero, Pair coordenada) {
        tablero.agregarPoderSaltarParedesaBomberman();
        tablero.setPlayerCoord(tablero.playerCoord());
    }

    public void explotar(Tablero tablero) {
    }

    public void detonar(Tablero tablero) {

    }
}
