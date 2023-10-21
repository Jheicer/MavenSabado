package proyectoLPIISabado;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_empresa database table.
 * 
 */
@Entity
@Table(name="tbl_empresa")
@NamedQuery(name="TblEmpresa.findAll", query="SELECT t FROM TblEmpresa t")
public class TblEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idempresa;

	private String descrip;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechacreate;

	private String nomcomer;

	private String rzocial;

	private String telf;

	//bi-directional many-to-one association to TblCategoria
	@ManyToOne
	@JoinColumn(name="idcategoria")
	private TblCategoria tblCategoria;

	public TblEmpresa() {
	}

	public int getIdempresa() {
		return this.idempresa;
	}

	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechacreate() {
		return this.fechacreate;
	}

	public void setFechacreate(Date fechacreate) {
		this.fechacreate = fechacreate;
	}

	public String getNomcomer() {
		return this.nomcomer;
	}

	public void setNomcomer(String nomcomer) {
		this.nomcomer = nomcomer;
	}

	public String getRzocial() {
		return this.rzocial;
	}

	public void setRzocial(String rzocial) {
		this.rzocial = rzocial;
	}

	public String getTelf() {
		return this.telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public TblCategoria getTblCategoria() {
		return this.tblCategoria;
	}

	public void setTblCategoria(TblCategoria tblCategoria) {
		this.tblCategoria = tblCategoria;
	}

}