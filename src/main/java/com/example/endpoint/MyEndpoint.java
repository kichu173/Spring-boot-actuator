package com.example.endpoint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="kichu",enableByDefault = true)
public class MyEndpoint {

    @ReadOperation
    public MyEndPointResponse features() {
        return new MyEndPointResponse(263872, "kichu173", "Active");
    }

}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class MyEndPointResponse {
    private int id;
    private String name;
    private String status;
}