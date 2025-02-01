public class Main {
    public static void main(String[] args) {
        Repository<User> userRepository = new MemoryRepository<>();
        
        // Add users
        userRepository.add(new User("Alice"));
        userRepository.add(new User("Bob"));
        
        // Retrieve and display users
        System.out.println("Users:");
        for (int i = 0; i < userRepository.size(); i++) {
            System.out.println(userRepository.get(i));
        }
        
        // Update a user
        userRepository.update(1, new User("Charlie"));
        System.out.println("After update: " + userRepository.get(1));
        
        // Delete a user
        userRepository.delete(0);
        System.out.println("After deletion, size: " + userRepository.size());
    }
} 
