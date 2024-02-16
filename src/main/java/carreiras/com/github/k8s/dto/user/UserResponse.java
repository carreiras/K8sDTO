package carreiras.com.github.k8s.dto.user;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String name;
    private String cpf;
    private String address;
    private String email;
    private String phoneNumber;
    private LocalDate registrationDate;
}
