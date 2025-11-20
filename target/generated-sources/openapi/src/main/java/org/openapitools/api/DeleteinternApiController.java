package org.openapitools.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-14T12:31:26.351690+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
@Controller
@RequestMapping("${openapi.openAPIDefinition.base-path:}")
public class DeleteinternApiController implements DeleteinternApi {

    private final DeleteinternApiDelegate delegate;

    public DeleteinternApiController(@Autowired(required = false) DeleteinternApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new DeleteinternApiDelegate() {});
    }

    @Override
    public DeleteinternApiDelegate getDelegate() {
        return delegate;
    }

}
