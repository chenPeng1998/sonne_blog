package sonn.service;

import java.util.List;

import sonn.util.Page;
import sonn.util.PageInfo;


/**
* @ClassName: BaseService 
* @Description:Service���ӿ�
* @author ����
* @date 2016-4-22
* @version 1.0
* @param <T>
 */
public interface BaseService<T>
{
	/**
	 * ����ʵ������ҳ
	 * 
	 * @param pageable
	 *            ��ҳ��Ϣ
	 * @return ʵ������ҳ
	 */
	Page<T> findPage(PageInfo pageInfo,Class<T> clazz);
	
	/**
	 * @Title: findList 
	* @Description: ��ѯ���У���List��ʽ����
	* @param @param clazz
	* @param @return    �趨�ļ� 
	* @return List<T>    �������� 
	* @throws
	 */
	List<T> findList(Class<T> clazz);
	
	/**
	 * ����ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 */
	void save(T entity);
	
	/**
	* @Title: find 
	* @Description: ����id��ѯ
	* @param @param id
	* @param @return    �趨�ļ� 
	* @return T    �������� 
	* @throws
	 */
	T find(Integer id,Class<T> clazz);

}