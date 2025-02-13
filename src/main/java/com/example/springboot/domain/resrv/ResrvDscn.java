package com.example.springboot.domain.resrv;

import com.example.springboot.domain.host.Host;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResrvDscn implements Serializable {
    @Id
    private Long resrvNum;

    @OneToOne
    @MapsId // mapsId는 칼럼에 있는 값을 @Id에 있는 값에 매핑시킴
    @JoinColumn(name = "resrvNum")
    private ResrvHis resrvHis;

    @Column
    private Long hnum;

    @Column
    private int restPpl; // 비교를 위해선 int 형으로

    @Column
    private Date acptdDate;
}
