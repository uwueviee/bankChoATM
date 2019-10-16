package gq.skyenet.bankchoatm.spring.views.atmdeposit;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

import gq.skyenet.bankchoatm.spring.MainView;
import gq.skyenet.bankchoatm.spring.views.atmdeposit.ATMDepositView.ATMDepositViewModel;

@Route(value = "atmDeposit", layout = MainView.class)
@PageTitle("ATM Deposit")
@JsModule("./src/views/atmdeposit/a-tm-deposit-view.js")
@Tag("a-tm-deposit-view")
public class ATMDepositView extends PolymerTemplate<ATMDepositViewModel> {

    // This is the Java companion file of a design
    // You can find the design file in /frontend/src/views/atmdeposit/a-tm-deposit-view.js
    // The design can be easily edited by using Vaadin Designer (vaadin.com/designer)

    public static interface ATMDepositViewModel extends TemplateModel {
    }

    public ATMDepositView() {
    }
}
