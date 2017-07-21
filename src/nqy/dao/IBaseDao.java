package nqy.dao;

import java.util.List;
//接口 T谁继承他了 T就是谁
public interface IBaseDao<T> {
	public List<T> getData();
	
	public T getDataById(int id);
	
	public int insert(T t);
	
	public int update(T t);
	
	public int delete(int id);

}
