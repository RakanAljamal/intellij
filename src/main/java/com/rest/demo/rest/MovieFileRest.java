package com.rest.demo.rest;

import com.rest.demo.entity.MovieFile;
import com.rest.demo.service.MovieFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
    
@RestController
@RequestMapping("/Yallamovie")
@CrossOrigin
public class MovieFileRest {
    @Autowired
    @Qualifier("MovieFileService")
    private MovieFileService movieFileService;


    @PostMapping(value = "/upload")
    public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        File convertFile = new File("C:\\Users\\Rakan\\Downloads\\filedemo\\" + file.getOriginalFilename());
        FileOutputStream fout = new FileOutputStream(convertFile);
        fout.write(file.getBytes());
        fout.close();
        return new ResponseEntity<>("File has uploaded successfully", HttpStatus.OK);
    }

    @GetMapping("/download/{movieId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable int movieId, HttpServletRequest request) {
        Path folderPath = Paths.get("C:\\Users\\Rakan\\Downloads\\filedemo\\" + movieFileService.findMovieById(movieId).getFilePath() + ".mp4");
        Resource resource = null;
        try {
            resource = new UrlResource(folderPath.toUri());
        } catch (MalformedURLException e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        return ResponseEntity
                .ok()
                .contentType(MediaType.parseMediaType("video/mp4"))
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment;filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
