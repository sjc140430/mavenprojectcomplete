package empSubmit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empSubmitController {
	
	@RequestMapping("/submit")
	public void empSubmit(@RequestParam long empId, String name) throws IOException {
		Employee add = new Employee(empId, name);
		final String FILE_NAME = "/main/java/resources/employeeStore.txt";
		
		BufferedWriter write = new BufferedWriter(new FileWriter(FILE_NAME));
		write.append(add.toString());
		write.close();
	}
	
	@RequestMapping("/retrieve")
	public String empRetrieve(@RequestParam long empId, String name) throws IOException {
		Employee add = new Employee(empId, name);
		final String FILE_NAME = "/main/java/resources/employeeStore.txt";
		
		BufferedReader read = new BufferedReader(new FileReader(FILE_NAME));
		return read.readLine();
		
	}
}

/*
package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
*/