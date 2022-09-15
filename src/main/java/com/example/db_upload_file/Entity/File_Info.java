package com.example.db_upload_file.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class File_Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String fileorginalnomi;

    @Column(nullable = false)
    private long filehajmi;

    @Column(nullable = false)
    private String fileturi;
}
