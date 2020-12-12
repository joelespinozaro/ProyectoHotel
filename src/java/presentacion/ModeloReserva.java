package presentacion;

import java.util.ArrayList;
import java.util.List;
import negocio.*;

public class ModeloReserva {
    private Reserva res;
    private List listHab;

    public ModeloReserva(Reserva res) {
        this.res = res;
    }

    public List getListHab() {
        return listHab;
    }

    public void setListHab(List listHab) {
        this.listHab = listHab;
    }
    
    public List getCesta(){
        List lis = new ArrayList();
        for(int i=0; i<res.getCesta().size();i++){
            Linea lin =(Linea)res.getCesta().get(i);
            Object[] f = new Object[5];
            f[0] = lin.getHabit().getCodigo();
            f[1] = lin.getHabit().getNombre();
            f[2] = lin.getHabit().getPrecio();
            f[3] = lin.getCantDias();
            f[4] = lin.getImporte();
            lis.add(f);
        }
        return lis;
    }
    
    public String getSubTotal(){
        return String.valueOf(res.getSubTot());
    }
    public String getDesc(){
        return String.valueOf(res.getDesc());
    }
    public String getTotal(){
        return String.valueOf(res.getTotal());
    }
}

