import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelcastClientApp {

    public static void main(String[] args) {
        // 1. Hazelcast İstemci Konfigürasyonu
        ClientConfig clientConfig = new ClientConfig();
        // Sunucunuzun adresini buraya ekleyin. Varsayılan olarak localhost:5701'dir.
        clientConfig.getNetworkConfig().addAddress("127.0.0.1:5701");
        // Eğer sunucunuzda bir küme adı varsa, buraya ekleyin.
        // clientConfig.setClusterName("dev");

        // 2. Hazelcast İstemcisini Başlat
        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        System.out.println("Hazelcast Client Connected to Cluster!");

        // 3. Bir Distributed Map (IMap) Al
        IMap<String, Person> personMap = client.getMap("myPersons"); // Map adı

        final int numberOfEntries = 10000;

        // 4. Dummy Person Nesnelerini Haritaya Koy (Put)
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


        // 5. Nesneleri Haritadan Al (Get)
        System.out.println("\nGetting " + numberOfEntries + " Person objects from the map...");
        long getStartTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfEntries; i++) {
            String id = "person-" + i;
            Person retrievedPerson = personMap.get(id);
            // İlk 10 ve son 10 nesneyi kontrol için yazdırabiliriz
            if (i < 10 || i >= numberOfEntries - 10) {
                System.out.println("Retrieved: " + retrievedPerson);
            }
        }
        long getEndTime = System.currentTimeMillis();
        System.out.println("Finished getting " + numberOfEntries + " objects. Time taken: " + (getEndTime - getStartTime) + " ms");

        // 6. İstemciyi Kapat
        client.shutdown();
        System.out.println("\nHazelcast Client Shut Down.");
    }
}