package studyTool6;

public class PruebaEmpleadoPorComision {

	public static void main(String[] args) {
		EmpleadoPorComision empleado = new  EmpleadoPorComision ( "Santiago","Ramirez","2222-22-2222", 10201, .08);
		
		System.out.println("Informacion del empleado obtenida por los metodos establecer: \n");
		
		System.out.printf("%S %S\n", "El primer nombre es", empleado.obtenerPrimerNombre());
		
		System.out.printf("%S %S\n", "El apellido paterno es", empleado.obtenerApellidoPaterno());
		
		System.out.printf("%S %S\n", "El numerode seguro social es", empleado.obtenerNumeroSeguroSocial());
		
		System.out.printf("%S %S\n", "las ventas brutas son ", empleado.obtenerVentasBrutas());
		
		System.out.printf("%S %S\n", "la tarifa  de comision es ", empleado.obtenerTarifaComision());
		
		empleado.establecerVentasBrutas(500);
		empleado.establecerTarifaComision(.1);
		
		System.out.printf("\n%s:\n\n%s\n", "informacion actualizada del empleado, obtenida mediante toString", empleado);

	}

}