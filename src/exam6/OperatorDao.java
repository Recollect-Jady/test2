package exam6;

import java.util.List;

public interface OperatorDao {

	/**
	 * @return 查找所有管理员（不需要密码）
	 */
	List<Operator> findAll();

	/**
	 * @param id
	 * @return 根据id查找某个管理员（需要密码）
	 */
	Operator findOne(Integer id);

	/**
	 * @param username
	 * @param password
	 * @param role
	 *            添加管理员（password是明文）
	 */
	void create(String username, String password, String role);

	/**
	 * @param id
	 * @param newPassword
	 *            修改密码（newPassword是明文）
	 */
	void updatePassword(Integer id, String newPassword);

	/**
	 * @param id
	 *            删除管理员
	 */
	void delete(Integer id);

	/**
	 * @param id
	 *            禁用指定管理员账号（将DISABLED列设为true）
	 */
	void disable(Integer id);

	/**
	 * @param id
	 *            启用指定管理员账号（将DISABLED列设为false）
	 */
	void enable(Integer id);

}
