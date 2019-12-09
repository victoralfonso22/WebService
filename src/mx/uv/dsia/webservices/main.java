package mx.uv.dsia.webservices;

public class main {
	
	public static void main(String[] args){
		WsGetInfSorteoLocator location = new WsGetInfSorteoLocator();
		
		WsGetInfSorteoSoap puerto = null;
		
		String datos = null;
	
	try{
		puerto = location.getwsGetInfSorteoSoap();		
		datos = puerto.sorteoUV("18/06/2015");
				
		System.out.println(datos);
		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	

}
}