package AllAndExtras;

public class interview {
    /*public void print(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        int number = Integer.parseInt(sb.toString());
        number= number+1;
        List<Integer> list= new ArrayList<>();
        list.add(number);
        System.out.println(list);
    }
    public static void main(String[] args){
        interview i = new interview();
        int[] arr={9,9,9};
        i.print(arr);
    }
}

You are given an array of integers, arr = [1,2,3]. It represents a number, n = 123. Your
task is to return a new array after doing n + 1. It's guaranteed not to have any leading
zeros.
•	arr = [1,2,9] should be converted to [1,3,0]
        •	arr = [9,9,9] should be converted to [1,0,0,0]




public class interview {
    public void print(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        int number = Integer.parseInt(sb.toString());
        number= number+1;
        List<Integer> list= new ArrayList<>();
        list.add(number);
        System.out.println(list);
    }
    public static void main(String[] args){
        interview i = new interview();
        int[] arr={9,9,9};
        i.print(arr);
    }



    You need to create a RESTful API to manage a list of users.
    The API should support operations to get all users, get a user by ID, create a new user, update a user, and delete a user.
    How would you implement this in Spring?


    Model layer--->

    @Entity
    public class User{
        @Id
        private int Id;
        private String name;
    }


    @RestController
    @RequestMapping("/")
    public Class controller{
        @autowired
        priavte service service;

        @GetMapping("/getusers")
        public List<Users> getallUsers(){
            service.getAllUsers();
        }
        @PostMapping("/postusers")
        public String postUsers(@RequestBody Users user){
            service.postusers();
        }
        @DeleteMapping("/deleteusers/{id}")
        public void deleteUser(@pathvariable int Id){
            service.deleteuser(id);
        }
        @PutMapping("/update")
        public user updateUser(@RequestBody user user){
            service.updateuser(user);
        }
    }

    service layer----->

    public interface service{
        List<Users> getAllUsers();
        String postUsers(Users user);
        void deleteUser(int Id);
        user updateUser(User user);
    }

    @Service
    public class servicemain implements service{
        @Autowrired
        private Repository repo;

        public list<Users> getallusers(){
            repo.getAll();
        }
        public String postUsers(User user){
            repo.save(user);
        }
        public void DeleteUser(int Id){
            repo.deleteById(id);
        }
        public user updateUser(User user){
            repo.get(id)
        }
    }

    @Repositorty

    public interface repo extends JpaRepository<User,int>{*/

}


