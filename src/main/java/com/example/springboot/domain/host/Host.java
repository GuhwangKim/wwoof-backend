package com.example.springboot.domain.host;

import com.example.springboot.domain.BaseTimeEntity;
import com.example.springboot.domain.user.User;
import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Host extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hnum;

    @OneToOne
    @JoinColumn(name = "id")
    private User user;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String farmsts;

    @Column(nullable = false)
    private String shortintro;

    @Column(length = 1000, nullable = false)
    private String intro;

    @Column(nullable = false)
    private String lat;

    @Column(nullable = false)
    private String lng;

    @Column(nullable = false)
    private String maxPpl;

    @Column
    private String apprvYn;

    @Column
    private Date apprv_date;


    @Builder
    public Host(String region, String gender, String age, String farmsts, String shortintro, String intro, String lat, String lng, User user){
        this.user = user;
        this.region = region;
        this.gender = gender;
        this.age = age;
        this.farmsts = farmsts;
        this.shortintro = shortintro;
        this.intro = intro;
        this.lat = lat;
        this.lng = lng;
    }

    // 수정용
    public void hostUpdate(String region, String gender, String age, String farmsts, String shortintro, String intro, String lat, String lng){
        this.region = region;
        this.gender = gender;
        this.age = age;
        this.farmsts = farmsts;
        this.shortintro = shortintro;
        this.intro = intro;
        this.lat = lat;
        this.lng = lng;
    }
}
