package com.example.springboot.service.host;

import com.example.springboot.controller.dto.host.HostSaveRequestDto;
import com.example.springboot.controller.dto.host.HostSaveResponseDto;
import com.example.springboot.domain.user.User;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.util.List;

public interface HostService {
    // 호스트 데이터 불러오기
    HostSaveResponseDto findHostInfo(User user,  HostSaveResponseDto hostSaveResponseDto);
    // 호스트 데이터 저장
    String save(HostSaveRequestDto dto, MultipartFile file);
    // 호스트 이미지 저장
    void saveImgs(MultipartFile[] files, String hostNum);
}