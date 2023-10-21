package proyectoLPIISabado;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_categoria database table.
 * 
 */
@Entity
@Table(name="tbl_categoria")
@NamedQuery(name="TblCategoria.findAll", query="SELECT t FROM TblCategoria t")
public class TblCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcategoria;

	private String descrip;

	private String nomcat;

	//bi-directional many-to-one association to TblEmpresa
	@OneToMany(mappedBy="tblCategoria")
	private List<TblEmpresa> tblEmpresas;

	public TblCategoria() {
	}

	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getNomcat() {
		return this.nomcat;
	}

	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}

	public List<TblEmpresa> getTblEmpresas() {
		return this.tblEmpresas;
	}

	public void setTblEmpresas(List<TblEmpresa> tblEmpresas) {
		this.tblEmpresas = tblEmpresas;
	}

	public TblEmpresa addTblEmpresa(TblEmpresa tblEmpresa) {
		getTblEmpresas().add(tblEmpresa);
		tblEmpresa.setTblCategoria(this);

		return tblEmpresa;
	}

	public TblEmpresa removeTblEmpresa(TblEmpresa tblEmpresa) {
		getTblEmpresas().remove(tblEmpresa);
		tblEmpresa.setTblCategoria(null);

		return tblEmpresa;
	}

}