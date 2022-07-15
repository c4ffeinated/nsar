import { Component, NgZone } from '@angular/core';
import { DemoSharedNsar } from '@demo/shared';
import { } from 'nsar';

@Component({
	selector: 'demo-nsar',
	templateUrl: 'nsar.component.html',
})
export class NsarComponent {

  demoShared: DemoSharedNsar;

	constructor(private _ngZone: NgZone) {}

  ngOnInit() {
    this.demoShared = new DemoSharedNsar();
  }

}