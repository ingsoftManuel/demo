package co.edu.co.spring.demo.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "productos")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String descripcion;
	private double precio;
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private User user;

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}


}
