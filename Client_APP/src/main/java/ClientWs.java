import proxy.EtudiantService;
import proxy.EtudiantServiceService;

public class ClientWs {
    public static void main(String[] args) {
        EtudiantService etudiantService=new EtudiantServiceService().getEtudiantServicePort();
        System.out.println(etudiantService.getAllEtudiants());
        System.out.println(etudiantService.getEtudiantsBycin("EF345678"));
        System.out.println(etudiantService.getLimitEtudiants(2)) ;
    }
}
