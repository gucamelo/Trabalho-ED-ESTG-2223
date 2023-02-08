package pt.estg.Grupo9ED;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	@GetMapping("/admin/createPlayer")
	public String createPlayer() {
		return "admin/createPlayer";
	}


	@GetMapping("/admin/createConnector")
	public String createConnector() {
		return "admin/addConnector";
	}

	@GetMapping("/admin/addPortal")
	public String addPortal() {
		return "admin/addPortal";
	}

	@GetMapping("/admin/importLocalsJson")
	public String importLocalsJson() {
		return "admin/importLocalsJson";
	}

	@GetMapping("/admin/importPlayersJson")
	public String importPlayersJson() {
		return "admin/importPlayersJson";
	}

	@GetMapping("/admin/importRoutesJson")
	public String importRoutesJson() {
		return "admin/importRoutesJson";
	}

	@GetMapping("/admin/importConfigJson")
	public String importConfigJson() {
		return "admin/importConfigJson";
	}

	@GetMapping("/admin/addRota")
	public String addRota() {
		return "admin/addRota";
	}

	@GetMapping("/admin/removeRota")
	public String removeRota() {
		return "admin/removeRota";
	}

	@GetMapping("/admin/removeLocal")
	public String removeLocal() {
		return "admin/removeLocal";
	}
}
