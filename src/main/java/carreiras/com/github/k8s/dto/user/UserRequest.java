package carreiras.com.github.k8s.dto.user;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    @NotBlank(message = "O Nome deve ser informado")
    private String name;

    @NotBlank(message = "O CPF deve ser informado")
    private String cpf;

    @NotBlank(message = "O Endereço deve ser informado")
    private String address;

    @NotBlank(message = "O E-mail deve ser informado")
    private String email;

    @NotBlank(message = "O Telefone deve ser informado")
    private String phoneNumber;

    @NotNull(message = "A Data de Registro deve ser informada")
    private LocalDate registrationDate;
}
