package ua.com.alevel.final_project.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ApiResponse<ID> {
    private ID id;
}