/*
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.syndesis.controllers.integration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;

public class IntegrationControllerTest {

    private static final String INTEGRATION_ID = "test-integration";

    /*
    @Test
    @SuppressWarnings("PMD.DoNotUseThreads")
    public void shouldReplaceIntegrationRevisions() {
        final DataManager dataManager = mock(DataManager.class);
        final EventBus eventBus = mock(EventBus.class);
        final StateChangeHandlerProvider handlerFactory = mock(StateChangeHandlerProvider.class);

        final IntegrationController integrationController = new IntegrationController(dataManager, eventBus,
            handlerFactory);

        integrationController.executor = mock(ExecutorService.class);
        integrationController.scheduler = mock(ScheduledExecutorService.class);

        final StateChangeHandler handler = mock(StateChangeHandler.class);
        when(handler.getTriggerStates()).thenReturn(EnumSet.allOf(IntegrationRevisionState.class));
        when(handler.execute(any(IntegrationDeployment.class))).thenReturn(new StateUpdate(IntegrationRevisionState.Pending),
            new StateUpdate(IntegrationRevisionState.Pending), new StateUpdate(IntegrationRevisionState.Active));

        final IntegrationDeployment integrationRevision = new IntegrationDeployment.Builder().integrationId(INTEGRATION_ID)
            .createdDate(new Date())
            .targetState(IntegrationRevisionState.Active)
            //.addDeployment(new IntegrationDeployment.Builder().version(1).build())
            //.addDeployment(new IntegrationDeployment.Builder().version(2).build())
            .build();

        final AtomicReference<IntegrationDeployment> currentIntegration = new AtomicReference<>(integrationRevision);
        when(dataManager.fetch(Integration.class, INTEGRATION_ID)).thenAnswer(invocation -> currentIntegration.get());

        doAnswer(invocation -> {
            invocation.getArgumentAt(0, Runnable.class).run();
            return null;
        }).when(integrationController.executor).execute(any(Runnable.class));

        final ArgumentCaptor<IntegrationDeployment> updatedIntegrations = ArgumentCaptor.forClass(IntegrationDeployment.class);
        doNothing().when(dataManager).update(updatedIntegrations.capture());

        integrationController.callStateChangeHandler(handler, INTEGRATION_ID);
        IntegrationDeployment newIntegration = updatedIntegrations.getValue();
        assertThat(newIntegration.getDeployments()).hasSize(3);
        currentIntegration.set(newIntegration);

        integrationController.callStateChangeHandler(handler, INTEGRATION_ID);
        assertThat(updatedIntegrations.getAllValues().get(1).getDeployments()).hasSize(3);

        // status update is now Activated
        integrationController.callStateChangeHandler(handler, INTEGRATION_ID);
        assertThat(updatedIntegrations.getAllValues().get(2).getDeployments()).hasSize(4);
    }
    */
}