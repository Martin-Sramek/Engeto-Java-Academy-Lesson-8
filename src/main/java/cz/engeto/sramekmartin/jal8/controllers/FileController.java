package cz.engeto.sramekmartin.jal8.controllers;

import cz.engeto.sramekmartin.jal8.services.FileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    private final FileService fileService;

    public FileController(final FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping(path = "/{fileName}")
    public String read(@PathVariable String fileName) {
        return fileService.readFile(fileName);
    }
}
