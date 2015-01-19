package cn.com.axiom.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Description TODO
 * @author
 * @date 2013-5-7下午2:43:41
 *
 */
public interface BaseDao<T, pk extends Serializable> extends PagingAndSortingRepository<T, Serializable>,
		JpaSpecificationExecutor<T> {

}
