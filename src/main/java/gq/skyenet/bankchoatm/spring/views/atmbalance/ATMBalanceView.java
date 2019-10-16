package gq.skyenet.bankchoatm.spring.views.atmbalance;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

import gq.skyenet.bankchoatm.spring.MainView;
import gq.skyenet.bankchoatm.spring.views.atmbalance.ATMBalanceView.ATMBalanceViewModel;

@Route(value = "atmBalance", layout = MainView.class)
@PageTitle("ATM Balance")
@JsModule("./src/views/atmbalance/a-tm-balance-view.js")
@Tag("a-tm-balance-view")
public class ATMBalanceView extends PolymerTemplate<ATMBalanceViewModel> {

    // This is the Java companion file of a design
    // You can find the design file in /frontend/src/views/atmbalance/a-tm-balance-view.js
    // The design can be easily edited by using Vaadin Designer (vaadin.com/designer)

    public static interface ATMBalanceViewModel extends TemplateModel {
    }

    public ATMBalanceView() {
    }
}
