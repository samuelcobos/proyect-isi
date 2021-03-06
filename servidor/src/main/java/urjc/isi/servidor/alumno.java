package urjc.isi.servidor;


public class alumno {
	private int idAlumno;
	private String Nombre;
	private int puerto;
	private String ip;
	
	public alumno(String Nombre, int puerto, String ip) {
		this.idAlumno = 0;
		this.Nombre = Nombre;
		this.puerto = puerto;
		this.ip = ip;
	}
	
	
	public int getIdAlumno() {
		return idAlumno;
	}
	
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + idAlumno;
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + puerto;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		alumno other = (alumno) obj;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (idAlumno != other.idAlumno)
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (puerto != other.puerto)
			return false;
		return true;
	}

	

}
