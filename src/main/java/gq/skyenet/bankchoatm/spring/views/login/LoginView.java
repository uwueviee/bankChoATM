package gq.skyenet.bankchoatm.spring.views.login;

import gq.skyenet.bankchoatm.spring.backend.Employee;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.templatemodel.TemplateModel;

import gq.skyenet.bankchoatm.spring.MainView;
import gq.skyenet.bankchoatm.spring.views.login.LoginView.LoginViewModel;

@Route(value = "login", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Login")
@JsModule("./src/views/login/login-view.js")
@Tag("login-view")
public class LoginView extends PolymerTemplate<LoginViewModel> {

    // This is the Java companion file of a design
    // You can find the design file in /frontend/src/views/login/login-view.js
    // The design can be easily edited by using Vaadin Designer (vaadin.com/designer)

    public static interface LoginViewModel extends TemplateModel {

    }

    @Id
    private TextField firstname;
    @Id
    private TextField lastname;
    @Id
    private TextField email;
    @Id
    private TextArea notes;

    @Id
    private Button cancel;
    @Id
    private Button save;

    public LoginView() {

        // Configure Form
        Binder<Employee> binder = new Binder<>(Employee.class);

        // Bind fields. This where you'd define e.g. validation rules
        binder.bindInstanceFields(this);

        cancel.addClickListener(e -> binder.readBean(null));
        save.addClickListener(e -> {
            Notification.show("Not implemented");
        });
    }
}
