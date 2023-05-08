package alo;

public class Employee
private int id;
private String name;
private String email;
private String[] role;
private boolean admin;

        public Employee(int id, String name, String email, String[] role, boolean admin) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.role = role;
            this.admin = admin;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String[] getRole() {
            return role;
        }

        public void setRole(String[] role) {
            this.role = role;
        }

        public boolean isAdmin() {
            return admin;
        }

        public void setAdmin(boolean admin) {
            this.admin = admin;
        }
}
