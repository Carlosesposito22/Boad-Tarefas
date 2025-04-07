package br.com.dio.dto;

import java.util.List;

public record BoardDetailsssDTO(Long id,
                              String name,
                              List<BoardColumnDTO> columns) {
}
