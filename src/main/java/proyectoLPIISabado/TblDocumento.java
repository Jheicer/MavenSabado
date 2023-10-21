package proyectoLPIISabado;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_documento database table.
 * 
 */
@Entity
@Table(name="tbl_documento")
@NamedQuery(name="TblDocumento.findAll", query="SELECT t FROM TblDocumento t")
public class TblDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iddocumento;

	private String descridoc;

	private String nomdoc;

	private String nrodocumento;

	//bi-directional many-to-one association to TblTipodocumento
	@ManyToOne
	@JoinColumn(name="idtipodocumento")
	private TblTipodocumento tblTipodocumento;

	public TblDocumento() {
	}

	public int getIddocumento() {
		return this.iddocumento;
	}

	public void setIddocumento(int iddocumento) {
		this.iddocumento = iddocumento;
	}

	public String getDescridoc() {
		return this.descridoc;
	}

	public void setDescridoc(String descridoc) {
		this.descridoc = descridoc;
	}

	public String getNomdoc() {
		return this.nomdoc;
	}

	public void setNomdoc(String nomdoc) {
		this.nomdoc = nomdoc;
	}

	public String getNrodocumento() {
		return this.nrodocumento;
	}

	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}

	public TblTipodocumento getTblTipodocumento() {
		return this.tblTipodocumento;
	}

	public void setTblTipodocumento(TblTipodocumento tblTipodocumento) {
		this.tblTipodocumento = tblTipodocumento;
	}

}