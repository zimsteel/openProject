package com.orders.tableorder.shop.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shop"/*, uniqueConstraints = {@UniqueConstraint(name = "SHOP_UNIQUE", columnNames = {""})}*/)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class shopEntity {
    
    // 기본키 생성을 DB에 위임하는 전략.
    // MySQL, PostgreSQL, SQL Server, DB2에서 사용한다.
    // GenerationType.IDENTITY : row를 저장 후 키값을 채운다.
    /* 매장 아이디 */ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private Long shopId; 

    /*매장이름 */
    @Column(name = "shop_name", nullable = false, columnDefinition = "varchar(50)")
    private String shopName;
    
    /* 우편번호 */
    @Column(name = "post_code", nullable = false, columnDefinition = "varchar(6)")
    private String postCode; 
    
    /* 매장주소 시, 도 */
    @Column(name = "shop_Addr1", nullable = false, columnDefinition = "varchar(20)")
    private String shopAddr1; 

    /* 매장주소 나머지 */
    @Column(name = "shop_Addr2", columnDefinition = "varchar(30)")
    private String shopAddr2; 

    /* 매장대표 이름 */
    @Column(name = "shop_Owner", nullable = false, columnDefinition = "varchar(8)")
    private String shopOwner; 

    /* 매장대표 모바일폰 */
    @Column(name = "rep_Mobile", nullable = false, columnDefinition = "varchar(22)")
    private String repMobile; 

    /* 매장전화 */
    @Column(name = "shop_Phone", nullable = false, columnDefinition = "varchar(22)")
    private String shopPhone; 
    
    /* 대표메일 */
    @Column(name = "email_Addr", columnDefinition = "varchar(40) default 'EMPTY'")
    private String email; 
    
    /* 매장 테이블 개수 박싱 기본타입 */
    @Column(name = "table_Count", nullable = false)
    private Integer tableCount; 

    /* 비고 */
    @Column(name = "note", columnDefinition = "varchar(200) default 'EMPTY'")
    private String note; 

    /* 생성일자 */
    @CreationTimestamp
    @Column(name = "create_Time")
    private LocalDateTime createTime; 

    /* 업데이트 일자 */
    @UpdateTimestamp
    @Column(name = "lastUpdate_Time")
    private LocalDateTime lastUpdateTime; 

    @Builder
    public shopEntity(  String  shopName,
                        String  postCode,
                        String  shopAddr1, 
                        String  shopAddr2, 
                        String  shopOwner, 
                        String  repMobile,
                        String  shopPhone, 
                        String  email, 
                        Integer tableCount, 
                        String  note) 
    {
        this.shopName   = shopName;
        this.postCode   = postCode;
        this.shopAddr1  = shopAddr1;
        this.shopAddr2  = shopAddr2;
        this.repMobile  = repMobile;
        this.shopPhone  = shopPhone;
        this.email      = email;
        this.tableCount = tableCount;
        this.note       = note;
    }
    
}
