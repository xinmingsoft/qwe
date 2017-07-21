package nqy.entity;

//创建一个实体类 属性要和数据库里的属性保持一致 私有的属性
public class Gly {
	private int id;
	private String yhm;
	private String mm;
	private int jb;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYhm() {
		return yhm;
	}
	public void setYhm(String yhm) {
		this.yhm = yhm;
	}
	public String getMm() {
		return mm;
	}
	public void setMm(String mm) {
		this.mm = mm;
	}
	public int getJb() {
		return jb;
	}
	public void setJb(int jb) {
		this.jb = jb;
	}
	

}
