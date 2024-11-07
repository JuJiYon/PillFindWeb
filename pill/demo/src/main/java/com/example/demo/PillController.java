import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.io.File;
import java.io.IOException;
@RestController
@RequestMapping("/api")
public class PillController {

    @Autowired
    private PillRepository pillRepository;

    @PostMapping("/savePillData")
    public ResponseEntity<String> savePillData(
            @RequestParam("form") String form,
            @RequestParam("shape") String shape,
            @RequestParam("pillImage") MultipartFile pillImage) {

        try {
            // 1. 파일 저장
            String imagePath = "uploads/" + pillImage.getOriginalFilename();
            File imageFile = new File(imagePath);
            pillImage.transferTo(imageFile);

            // 2. 데이터베이스에 정보 저장
            Pill pill = new Pill();
            pill.setPillType(form);
            pill.setPillShape(shape);
            pill.setImagePath(imagePath);  // 이미지 경로 저장
            pillRepository.save(pill);

            return ResponseEntity.ok("약물 정보가 성공적으로 저장되었습니다.");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("이미지 업로드 중 오류가 발생했습니다.");
        }
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // 모든 경로에 대해 CORS 허용
                .allowedOrigins("http://localhost:8080") // 프론트엔드의 주소로 변경
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 필요한 메서드 추가
                .allowCredentials(true); // 쿠키를 사용하는 경우 true로 설정
}
}


