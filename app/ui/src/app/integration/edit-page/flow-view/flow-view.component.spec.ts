import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { ApiModule } from '@syndesis/ui/api';
import { CoreModule } from '@syndesis/ui/core';
import { IntegrationSupportModule } from '@syndesis/ui/integration/integration-support.module';
import { FlowViewComponent } from './flow-view.component';
import { FlowViewStepComponent } from './flow-view-step.component';
import { SyndesisStoreModule } from '@syndesis/ui/store';
import { IntegrationService } from '../../../store/integration/integration.service';
import { SyndesisCommonModule } from '../../../common/common.module';
import { ConnectionsModule } from '../../../connections/connections.module';
import { VendorModule } from '@syndesis/ui/vendor';
import {
  CurrentFlowService,
  FlowPageService
} from '@syndesis/ui/integration/edit-page';
import { PlatformModule } from '@syndesis/ui/platform';

describe('FlowViewComponent', () => {
  let component: FlowViewComponent;
  let fixture: ComponentFixture<FlowViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        CoreModule.forRoot(),
        ApiModule.forRoot(),
        CommonModule,
        FormsModule,
        RouterTestingModule.withRoutes([]),
        ConnectionsModule,
        SyndesisCommonModule.forRoot(),
        IntegrationSupportModule,
        SyndesisStoreModule,
        PlatformModule.forRoot(),
        CoreModule.forRoot(),
        VendorModule
      ],
      declarations: [FlowViewComponent, FlowViewStepComponent],
      providers: [
        CurrentFlowService,
        FlowPageService,
        IntegrationService
      ]
    }).compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FlowViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
