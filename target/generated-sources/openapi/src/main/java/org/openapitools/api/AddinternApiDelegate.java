package org.openapitools.api;

import org.openapitools.model.Intern;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link AddinternApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-10-14T12:32:47.611557+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public interface AddinternApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /addintern
     *
     * @param intern  (required)
     * @return OK (status code 200)
     * @see AddinternApi#addintern
     */
    default ResponseEntity<String> addintern(Intern intern) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
