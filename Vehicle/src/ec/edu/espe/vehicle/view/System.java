/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.vehicle.view;
import ec.edu.espe.vehicle.model.Accessory;
import ec.edu.espe.vehicle.model.Brand;
import ec.edu.espe.vehicle.model.Client;
import ec.edu.espe.vehicle.model.ModelofVehicle;
import ec.edu.espe.vehicle.model.Type;
import ec.edu.espe.vehicle.model.Vehicle;
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class System {
        public static void main(String[] args  ){
        
      Vehicle vehicle= new Vehicle();
      Client client= new Client();

      ModelofVehicle modelofvehicle= new ModelofVehicle("Toyota", "black", "squard");
      Accessory accessory= new Accessory();
      Brand brand= new Brand();
      Type type= new Type();
      
      vehicle.setPrice("2.000");
      client.setEsconomicstatus("middle class ");
      modelofvehicle.setName("Chevrolet");
      accessory.setSeat(7);
      brand.setAge(2004);
      type.setT("t");
      
      
    }
}
