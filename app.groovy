@RestController
class WebApplication {

	@RequestMapping('/')
	String home(Map<String,Object> model) {
		model['color'] = 'green'
		template 'index.html', model
	}
}