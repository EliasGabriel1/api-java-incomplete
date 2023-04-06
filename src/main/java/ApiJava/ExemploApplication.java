@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public List<User> getUsers() {
		// Lógica para buscar a lista de usuários
		List<User> users = new ArrayList<>();
		users.add(new User("João", 25));
		users.add(new User("Maria", 30));
		return users;
	}
}

public class User {
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters e setters
}
