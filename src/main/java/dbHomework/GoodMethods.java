package dbHomework;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import dbHomework.src.Item;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author ondrej.hosek
 */

public class GoodMethods implements IGoodMethods {
	private SessionFactory sf = HibernateUtil.createSessionFactory();

	@Override
	public Item loadItemById(final Integer id) {
		Session session = sf.openSession();
		try {
			session.beginTransaction();

			String hql = "SELECT I FROM Item I WHERE I.id = :id";
			Query query = session.createQuery(hql).setParameter("id", id);
			Item item = (Item) query.uniqueResult();
			if (item != null) {
				System.out.println("Item loaded " + item.getDescription());
			} else
				System.out.println("No Item found for id ");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void deleteAllOutOfStockItems() {
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			String hql = "DELETE FROM Item I WHERE I.numberInStock = 0 OR I.numberInStock IS NULL";
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			System.out.println("Number of rows deleted:" + result);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * This method loads all items that are in stock
	 *
	 * @return
	 */
	@Override
	public List<Item> loadAllAvailableItems() {
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			String hql = "SELECT I FROM Item I WHERE I.numberInStock != 0 AND I.numberInStock IS NOT NULL";
			Query query = session.createQuery(hql);
			System.out.println("Items loaded " + query.list().size());
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return Collections.emptyList();
	}

	/**
	 * This method saves the given item
	 *
	 * @param item - item to be saved
	 */
	@Override
	public void saveItem(final Item item) {
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			session.save(item);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * This method updates a price of an item
	 *
	 * @param id       - id of an item which price is to be updated
	 * @param newPrice - new price
	 */
	@Override
	public void updatePrice(final Integer id, final BigDecimal newPrice) {
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			String hql = "UPDATE Item I SET price = :newPrice "
					+ "WHERE id = :id";
			Query query = session.createQuery(hql);
			query.setParameter("newPrice", newPrice);
			query.setParameter("id", id);
			int result = query.executeUpdate();
			System.out.println("Rows affected: " + result);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}