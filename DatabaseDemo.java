interface JDBCAPI
{
    void getConnection();
    void executeQuery();
    void showResults();
    void close();
}
class MySQL implements JDBCAPI
{
    public void getConnection()
    {
        System.out.println("connect with MySQL database");
    }
    public void executeQuery()
    {
        System.out.println("Query execeuted in MySQL Database");
    }
    public void showResults()
    {
        System.out.println("MySQL will display the results");
    }
    public void close()
    {
        System.out.println("MySQL will close the connection\n");
    }
}
class Oracle implements JDBCAPI
{
    public void getConnection()
    {
        System.out.println("connect with Oracle database");
    }
    public void executeQuery()
    {
        System.out.println("Query execeuted in Oracle Database");
    }
    public void showResults()
    {
        System.out.println("Oracle will display the results");
    }
    public void close()
    {
        System.out.println("Oracle will close the connection\n");
    }
}
class AdityaDB implements JDBCAPI
{
    public void getConnection()
    {
        System.out.println("connect with AdityaDB database");
    }
    public void executeQuery()
    {
        System.out.println("Query execeuted in AdityaDB Database");
    }
    public void showResults()
    {
        System.out.println("AdityaDB will display the results");
    }
    public void close()
    {
        System.out.println("AdityaDB will close the connection\n");
    }
}
public class interfaces5 {
    public static void main(String args[])
    {
        JDBCAPI jd;
        jd = new MySQL();
        jd.getConnection();;
        jd.executeQuery();
        jd.showResults();
        jd.close();

        jd = new Oracle();
        jd.getConnection();;
        jd.executeQuery();
        jd.showResults();
        jd.close();

        jd = new AdityaDB();
        jd.getConnection();;
        jd.executeQuery();
        jd.showResults();
        jd.close();
    }
}
