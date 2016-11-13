package sonn.dao;

import java.util.List;

import sonn.util.Page;
import sonn.util.PageInfo;


/**
 * @author 无名
 * @date 2016.04.22
 * @description:dao基类
 */
public interface BaseDao<T>
{
	/**
	 * @Title: findList 
	* @Description: 查询所有，以List形式返回
	* @param @param clazz
	* @param @return    设定文件 
	* @return List<T>    返回类型 
	* @throws
	 */
	List<T> findList(Class<T> clazz);
	/**
	 * 查找实体对象分页
	 * 
	 * @param pageable
	 *            分页信息
	 * @return 实体对象分页
	 */
	Page<T> findPage(PageInfo pageInfo,Class<T> clazz);
	
	/**
	 * 持久化实体对象
	 * 
	 * @param entity
	 *            实体对象
	 */
	void persist(T entity);
	
	/**
	 * 合并实体对象
	 * 
	 * @param entity
	 *            实体对象
	 * @return 实体对象
	 */
	T merge(T entity);
	
	/**
	 * 查找实体对象
	 * 
	 * @param id
	 *            ID
	 * @return 实体对象，若不存在则返回null
	 */
	T find(Integer id,Class<T> clazz);

	/**
	 * 移除实体对象
	 * 
	 * @param entity
	 *            实体对象
	 */
	void remove(T entity);
}
