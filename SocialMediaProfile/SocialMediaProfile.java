package SocialMediaProfile;

public class SocialMediaProfile {

    private String username;
    private int age;
    private String bio;

    public void createProfile (String username, int age, String bio) {
        this.username = username;
        this.age = age;
        this.bio = bio;

        if (username == null || username.trim().isEmpty()){
            throw new IllegalArgumentException("Username cannot be empty.");
        }

        if (age <= 13 || age >120 ){
            throw new IllegalArgumentException("Age must be between 13 and 120.");
        }

        if (bio.length() > 120){
            throw new IndexOutOfBoundsException("Bio cannot exceed 160 characters.");
        }

        System.out.println("Profile created successfully!");
        System.out.println("Username: " + this.username);
        System.out.println("Age: " + this.age);
        System.out.println("Bio: " + this.bio);
    }

    public static void main(String[] args) {
        SocialMediaProfile profile = new SocialMediaProfile();
        try {
            // Test with valid data
            profile.createProfile("belle", 25, "Cats are superior!!!!");

        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
}
