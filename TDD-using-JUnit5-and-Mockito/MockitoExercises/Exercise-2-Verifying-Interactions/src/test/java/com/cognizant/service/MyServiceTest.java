package com.cognizant.service;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class MyServiceTest {

    @Test
    void testVerifyFetchDataInteraction() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();

        // Assert
        verify(mockApi).getData();
    }

    @Test
    void testVerifyMethodCalledWithArgument() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // Act
        service.saveData("Hello Mockito");

        // Assert
        verify(mockApi).sendData("Hello Mockito");
    }

}
