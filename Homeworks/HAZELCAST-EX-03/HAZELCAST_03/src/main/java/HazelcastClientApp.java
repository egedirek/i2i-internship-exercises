import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelcastClientApp {

    public static void main(String[] args) {
    
        ClientConfig clientConfig = new ClientConfig();

        clientConfig.getNetworkConfig().addAddress("127.0.0.1:5701");
       
        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        System.out.println("Hazelcast Client Connected to Cluster!");
        
        IMap<String, Person> personMap = client.getMap("myPersons"); // Map adı

        final int numberOfEntries = 10000;

        System.out.println("\nPutting " + numberOfEntries + " Person objects into the map...");
        long putStartTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfEntries; i++) {
            String id = "person-" + i;
            String name = "Name-" + i;
            Person person = new Person(id, name);
            personMap.put(id, person);
        }
        long putEndTime = System.currentTimeMillis();
        System.out.println("Finished putting " + numberOfEntries + " objects. Time taken: " + (putEndTime - putStartTime) + " ms");
        System.out.println("Map size after put: " + personMap.size());


        System.out.println("\nGetting " + numberOfEntries + " Person objects from the map...");
        long getStartTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfEntries; i++) {
            String id = "person-" + i;
            Person retrievedPerson = personMap.get(id);
            if (i < 10 || i >= numberOfEntries - 10) {
                System.out.println("Retrieved: " + retrievedPerson);
            }
        }
        long getEndTime = System.currentTimeMillis();
        System.out.println("Finished getting " + numberOfEntries + " objects. Time taken: " + (getEndTime - getStartTime) + " ms");

        client.shutdown();
        System.out.println("\nHazelcast Client Shut Down.");
    }
}
