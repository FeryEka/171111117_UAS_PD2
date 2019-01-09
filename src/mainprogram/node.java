/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

/**
 *
 * @author Fery Eka Mahendra
 */
public class node {
    node next;
    String[] data;
    node() {
        next = null;
        data = null;
    }
    node(String[] Data) {
        next = null;
        data = Data;
    }
    node(String[] Data, node Next) {
        next = Next;
        data = Data;
    }
}
