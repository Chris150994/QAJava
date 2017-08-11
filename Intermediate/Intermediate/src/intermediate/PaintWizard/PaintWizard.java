/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate.PaintWizard;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class PaintWizard {
    public ArrayList<Paint> paint = new ArrayList<Paint>();
    
    public static void main(String[] args){
        PaintWizard p = new PaintWizard();
        p.CreatePaint(20,10,19.99,"CheapoMax");
        p.CreatePaint(15,11,17.99,"AverageJoes");
        p.CreatePaint(10,20,25,"DuluxorousPaints");
        p.DisplayPaints(p.paint);
        p.CalculateCost(500);
        p.CalculateCost(800);
        p.CalculateCost(1200);
        p.CalculateCost(463);
    }
    
    public void CalculateCost(int roomSize){
        double cost = 0;
        double waste = 0;
        String cheapestSoFar = "";
        String leastWasteful = "";
        for (Paint p : paint) {
           double squareFootage = p.GetCapacity()*p.GetCoverage();
           double tins = roomSize/squareFootage;
           int tinsRoundedUp = (int) Math.ceil(tins);
           double tempCost = tinsRoundedUp * p.GetCost();
           double tempWaste = (tinsRoundedUp*p.GetCost()) - (tins*p.GetCost());
           tempWaste = Double.parseDouble(new DecimalFormat("#.##").format(tempWaste));

            if (waste == 0) {
                waste = tempWaste;
                leastWasteful = p.GetName();
            }
            else if (waste > tempWaste) {
                waste = tempWaste;
                leastWasteful = p.GetName();
            }
           
            if (cost == 0) {
                cost = tempCost;
                cheapestSoFar = p.GetName();
            }
            else if (tempCost < cost) {
                cost = tempCost;
                cheapestSoFar = p.GetName();
            }
        }
        System.out.println("Cost for "+ roomSize +" squareft :£" + cost);
        System.out.println("Cheapest brand: " + cheapestSoFar);
        System.out.println("Least wasteful: " + leastWasteful + " wasting : £" + waste);
        System.out.println("");
    }
    
    public void CreatePaint(int capacity, int coverage, double cost, String name){
        Paint p = new Paint();
        p.SetCapacity(capacity);
        p.SetCost(cost);
        p.SetCoverage(coverage);
        p.SetName(name);
        paint.add(p);
    }
    
    public void DisplayPaints(ArrayList<Paint> paint){
        for (Paint p : paint) {
            System.out.println("Capacity: " + p.GetCapacity());
            System.out.println("Coverage: " + p.GetCoverage());
            System.out.println("Cost: " + p.GetCost());
            System.out.println("------------");
        }
    }
    
}
