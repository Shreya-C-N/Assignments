package valtechspring.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import valtechspring.orm.Address1;
import valtechspring.orm.Article;
import valtechspring.orm.Author;
import valtechspring.orm.Blog;
import valtechspring.orm.Book;
import valtechspring.orm.HandBook;
import valtechspring.orm.Publisher;


public class BookClient {
	public static void main(String[] args) {
			//SessionFactory sf=new Configuration()
			SessionFactory sf=new AnnotationConfiguration()
					.configure()
					.addAnnotatedClass(Book.class)
					.addAnnotatedClass(Publisher.class)
					.addAnnotatedClass(Author.class)
					.addAnnotatedClass(Address1.class)
					.addAnnotatedClass(Article.class)
					.addAnnotatedClass(Blog.class)
					.addAnnotatedClass(HandBook.class)
					
					.buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
		
			Address1 add=new Address1("3rd","Mysore","Karnataka",576547);
			ses.save(add);
			
			Address1 add2=new Address1("3rd","Mysore","Karnataka",576547);
			ses.save(add2);
			
			
			Book b=new Book("",new Date(90/11/20));
			ses.save(b);
			Book b1=new Book("rrr",new Date(97/7/15));
			ses.save(b1);
			Book b2=new Book("xxx",new Date(93/10/29));
			ses.save(b2);
			
			Author a=new Author("aax",689890096);
			ses.save(a);
			Author a1=new Author("bbx",983684296);
			ses.save(a1);
			Author a2=new Author("bbx",934658438);
			ses.save(a2);
			
			Publisher p=new Publisher("uuu","Mumbai",984838124);
			ses.save(p);
			Publisher p1=new Publisher("www","Bangalore",948543260);
			ses.save(p1);
			
			Publisher p2=new Publisher("www","Chennai",948594390);
			ses.save(p2);
			
			Article ar=new Article("www.abc.com");
			ses.save(ar);
			
			Article ar1=new Article("www.xyz.com");
			ses.save(ar1);
			
			Blog b12=new Blog("www.xyz.com",2);
			ses.save(b12);
			
			HandBook h1=new HandBook("222",4500f,new Date(97/7/15),4);
			ses.save(h1);
			
			//CustomerDAO customerDAO=new CustomerDAOImpl();
//			for(Customer c:customerDAO.getByAccountBalanceGreaterThan(ses, 5000)){
//				System.out.println(c);
//			}
			
//			for(Customer c:customerDAO.getByAccountType(ses, "SB")){
//				System.out.println(c);
//			}
			//System.out.println("combined balance for customer 1="+customerDAO.getCombinedBalance(ses, 1));
			//System.out.println("combined balance for customer 2="+customerDAO.getCombinedBalance(ses, 2));
			//System.out.println("combined balance for customer 1="+customerDAO.getCombinedBalance(ses, 1));
			//System.out.println("combined balance for customer 1="+customerDAO.getCombinedBalance(ses, 1));
		//	
//			List objects=ses.createQuery("SELECT o FROM java.lang.Objects o").list();
//			for(Object o:objects){
//				System.out.println(o);
//			}
			
//			CustomerDAO customerDAO=new CustomerDAOImpl();
//			for(Customer c:customerDAO.getAllCustomer(ses)){
//				System.out.println(c);
//			}
			
			//Customer c=new Customer("pqr",new Date(90,6,13),1);
//			Address a=new Address("JP Nagar","Blr","Kar",560078);
//			ses.save(c);
//			ses.save(a);
//			c.setAddress(a);
//			Customer c1=new Customer("Abc",new Date(90,5,13),1);
//			ses.save(c1);
//			Account acc1=new Account(2000,"SB");
//			Account acc2=new Account(10000,"CA");
		//	
		//
//			ses.save(acc1);
//			ses.save(acc2);
		//	
//			Account acc3=new Account(1000,"SB");
//			Account acc4=new Account(10000,"CA");
//			ses.save(acc3);
//			ses.save(acc4);
//			c.addAccount(acc1);
//			c.addAccount(acc4);
//			c.addAccount(acc3);
//			c1.addAccount(acc4);
//			c1.addAccount(acc3);
		//
//			List<Tx> txs=ses.createQuery("SELECT tx FROM Tx tx").list();
//			for(Tx t:txs){
//				//Ternary operator Boolean condition ? true:false
//				t.setAccount(t.getId()%2==0?acc1:acc2);
//				
//			}
		//	
//			ses.save(new Tx(1000));
//			ses.save(new ChequeTx(2000,123456,false,2));
//			ses.save(new TellerTx(2500,"Teller1","JP Nagar"));
//			ses.save(new AtmTx(3000,123,"Jayanagar"));
		//	
		//	
////			Customer c =new Customer("Abc",new Date(1974,6,13),1);
////			Address a=new Address("JP Nagar","Blr","Kar",560078);
////			ses.save(c);
////			ses.save(a);
////			a.setCustomer(c);
////			c.setAddress(a);
		//	
		//	
////			List<Tx> txs=ses.createQuery("Select t from Tx t").list();
////			for(Tx t:txs){
////				System.out.println(t);
////			}
		////	
////			ses.save(new Tx(1000));
////			ses.save(new ChequeTx(2000,123456,false,2));
////			ses.save(new TellerTx(2500,"Teller1","JP Nagar"));
////			ses.save(new AtmTx(3000,123,"Jayanagar"));
		////	
////			Car car=new Car("Honda","City",2020,120000,"white",new CarDetails(4000,true,1));
////			ses.save(car);
//			//ses.saveOrUpdate(car);
//			//Car car=(Car)ses.load(Car.class, 1);
//			//System.out.println("car loaded"+car.getId());
////			car.getMake();
//			//car.setPrice(123000);
////			ses.update(car);
//			//System.out.println("car loaded"+car.getClass().getName());
		//	
		///*BankAccount ba=new BankAccount();
//			ba.setAccountNo(1);
//			ba.setAccountType("SB");
//			ba.setActive(true);
//			ba.setBalance(1000);
//			ba.setOpeningDate(new Date());
//			ses.save(ba);*/
		//	
////			BankAccount ba=(BankAccount)ses.load(BankAccount.class,new BankAccountId(1,"SB"));
////			System.out.println(ba);
			tx.commit();
			ses.close();
			sf.close();
			
		}
		}


