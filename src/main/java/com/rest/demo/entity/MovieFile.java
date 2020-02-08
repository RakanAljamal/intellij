package com.rest.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie_files")
public class MovieFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "file_path")
    private String filePath;
    @Column(name = "file_name")
    private String fileName;

    public MovieFile() {
    }

    public MovieFile(String filePath, String fileName) {
        this.filePath = filePath;
        this.fileName = fileName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "MovieFile{" +
                "id=" + id +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
