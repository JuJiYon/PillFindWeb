package com.yourpackage.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class FileUploadController {

    // 이미지 파일을 서버에 저장하는 엔드포인트
    @PostMapping("/uploadImage")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        String uploadDir = "uploads/";  // 서버 내 업로드 디렉토리
        File uploadDirFile = new File(uploadDir);

        // 업로드 폴더가 없으면 생성
        if (!uploadDirFile.exists()) {
            uploadDirFile.mkdirs();
        }

        // 파일 저장 경로 설정
        String filePath = uploadDir + file.getOriginalFilename();
        File destinationFile = new File(filePath);

        try {
            // 파일을 서버에 저장
            file.transferTo(destinationFile);
            return ResponseEntity.ok("파일이 성공적으로 업로드되었습니다. 경로: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("파일 업로드 실패");
        }
    }
}
