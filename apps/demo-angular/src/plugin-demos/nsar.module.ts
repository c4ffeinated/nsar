import { NgModule, NO_ERRORS_SCHEMA } from '@angular/core';
import { NativeScriptCommonModule, NativeScriptRouterModule } from '@nativescript/angular';
import { NsarComponent } from './nsar.component';

@NgModule({
	imports: [NativeScriptCommonModule, NativeScriptRouterModule.forChild([{ path: '', component: NsarComponent }])],
  declarations: [NsarComponent],
  schemas: [ NO_ERRORS_SCHEMA]
})
export class NsarModule {}
