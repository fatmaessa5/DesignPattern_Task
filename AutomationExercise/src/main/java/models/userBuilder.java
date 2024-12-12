package models;


public class userBuilder {
    private String name;
    private String email;

    // Private constructor to enforce usage of Builder
    private userBuilder(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Static Builder class
    public static class Builder {
        private String name;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public userBuilder build() {
            return new userBuilder(this);
        }
    }
}
