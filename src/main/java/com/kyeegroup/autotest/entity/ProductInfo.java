package com.kyeegroup.autotest.entity;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author lianghong
 * @date 09/12/2017
 */
@Entity
@Table(name = "product_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Lazy(value = false)
public class ProductInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "project_name",length = 30)
    private String projectName;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "area_id")
    private Integer areaId;

    @Column(name = "mail_list")
    private String mailList;

    @CreatedDate
    private Date createdTime;

    @Column(name = "last_updated")
    private Date lastUpdated;
}
