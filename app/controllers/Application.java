package controllers;

import play.*;
import play.data.*;
import static play.data.Form.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	
	public static class FindForm {
		public String input;
	}

	// ルートにアクセスした際のAction
	public static Result index() {
		return ok(index.render("データベースのサンプル"));
	}
}