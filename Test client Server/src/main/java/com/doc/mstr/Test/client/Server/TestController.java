/**
 * 
 */
package com.doc.mstr.Test.client.Server;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amar
 *
 */
@RestController
@ComponentScan({"com.doc.mstr.Test.client"})
@RequestMapping(value = "say")
public class TestController {

	@RequestMapping (value="hi")
	public String greetMe() { 
		return "Hello World";
	}
}
