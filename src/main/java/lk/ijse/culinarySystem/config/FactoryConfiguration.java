package lk.ijse.culinarySystem.config;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {

        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
        standardServiceRegistryBuilder.loadProperties("hibernate.properties");

        MetadataSources metadataSources = new MetadataSources(standardServiceRegistryBuilder.build());

//metadataSources.addAnnotatedClass(User.class).addAnnotatedClass(Book.class).addAnnotatedClass(Admin.class).addAnnotatedClass(Branches.class).addAnnotatedClass(BorrowingDetails.class);

        Metadata metadata = metadataSources.getMetadataBuilder().build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
    }

    public static FactoryConfiguration getFactoryConfiguration(){
        return (factoryConfiguration == null)?factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}