/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jim
 */
public class Flight {

    private String depCode;
    private String destCode;
    private Plane plane;

    public Flight(Plane plane, String depCode, String destCode) {
        this.plane = plane;
        this.depCode = depCode;
        this.destCode = destCode;

    }

    public String toString() {
        return plane + " (" + depCode + "-" + destCode + ")";
    }
}
