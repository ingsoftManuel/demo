package co.edu.co.spring.demo.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "usuarios")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String username;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String password;
	
	@OneToMany(mappedBy = "usuario")
	private List<Product> products;


	@OneToMany(mappedBy = "usuario")
	private List<Orden> ordenes;
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", password=" + password
				+ "]";
	}

}
