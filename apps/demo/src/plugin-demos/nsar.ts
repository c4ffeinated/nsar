import { Observable, EventData, Page } from '@nativescript/core';
import { DemoSharedNsar } from '@demo/shared';
import { } from 'nsar';

export function navigatingTo(args: EventData) {
	const page = <Page>args.object;
	page.bindingContext = new DemoModel();
}

export class DemoModel extends DemoSharedNsar {

}
