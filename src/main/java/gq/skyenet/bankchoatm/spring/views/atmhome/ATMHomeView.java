package gq.skyenet.bankchoatm.spring.views.atmhome;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

import gq.skyenet.bankchoatm.spring.MainView;
import gq.skyenet.bankchoatm.spring.views.atmhome.ATMHomeView.ATMHomeViewModel;

@Route(value = "atmHome", layout = MainView.class)
@PageTitle("ATM Home")
@JsModule("./src/views/atmhome/a-tm-home-view.js")
@Tag("a-tm-home-view")
public class ATMHomeView extends PolymerTemplate<ATMHomeViewModel> {

    // This is the Java companion file of a design
    // You can find the design file in /frontend/src/views/atmhome/a-tm-home-view.js
    // The design can be easily edited by using Vaadin Designer (vaadin.com/designer)

    public static interface ATMHomeViewModel extends TemplateModel {
    }

    public ATMHomeView() {
    }
}
