package Oct.DailyOctTasks;

public class ex_11102024_task {
    //    Create a Runner class - APIAutomation (HTTP Method)
//    method - string, name, id (int)
//    create a base class BaseTest API
//    method performGET()
//    method performPOST()
//    method performPATCH()
//    method performPUT()
//   method performDELETE()
//    create a class TestCaseAPI
//    Ecap, Poly, Single, Dynamic, Super, this.
    public static void main(String[] args) {
        // Examples of polymorphism, encapsulation, and usage
        TestCaseAPI Test1 = new TestCaseAPI("GET", "ABC", 1);
        TestCaseAPI Test2 = new TestCaseAPI("POST", "DEF", 2);
        TestCaseAPI Test3 = new TestCaseAPI("DELETE", "GHI", 3);
        TestCaseAPI Test4 = new TestCaseAPI("PATCH", "JKL", 4);
        TestCaseAPI Test5 = new TestCaseAPI("PUT", "MNO", 5);
        // Execute test cases
        Test1.execute();
        Test2.execute();
        Test3.execute();
        Test4.execute();
        Test5.execute();
        // Test6.execute();


    }
}
    // Base class for API automation
    class BaseTestAPI {
        // Method to perform GET request
        public void performGET(String name, int id) {
            System.out.println("Performing GET request for " + name + " with id: " + id);
        }

        // Method to perform POST request
        public void performPOST(String name, int id) {
            System.out.println("Performing POST request for " + name + " with id: " + id);
        }

        // Method to perform PATCH request
        public void performPATCH(String name, int id) {
            System.out.println("Performing PATCH request for " + name + " with id: " + id);
        }

        // Method to perform PUT request
        public void performPUT(String name, int id) {
            System.out.println("Performing PUT request for " + name + " with id: " + id);
        }

        // Method to perform DELETE request
        public void performDELETE(String name, int id) {
            System.out.println("Performing DELETE request for " + name + " with id: " + id);
        }
    }

    // Class for running test cases
    class TestCaseAPI extends BaseTestAPI {
        private String method;
        private String name;
        private int id;

        // Constructor
        public TestCaseAPI(String method, String name, int id) {
            this.method = method;
            this.name = name;
            this.id = id;
        }

        // Execute the appropriate HTTP method
        public void execute() {
            switch (method.toUpperCase()) {
                case "GET":
                    performGET(name, id);
                    break;
                case "POST":
                    performPOST(name, id);
                    break;
                case "PATCH":
                    performPATCH(name, id);
                    break;
                case "PUT":
                    performPUT(name, id);
                    break;
                case "DELETE":
                    performDELETE(name, id);
                    break;
                default:
                    System.out.println("Invalid HTTP method: " + method);
            }
        }
    }