import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';

class ATMHomeView extends PolymerElement {
  static get template() {
    return html`
      <style include="shared-styles">
        :host {
          display: block;
        }
      </style>

      <br/>
      Content placeholder
		`;
  }

  static get is() {
    return 'a-tm-home-view';
  }

  static get properties() {
    return {
      // Declare your properties here.
    };
  }
}

customElements.define(ATMHomeView.is, ATMHomeView);
