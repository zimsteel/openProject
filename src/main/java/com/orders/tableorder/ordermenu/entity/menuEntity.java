package com.orders.tableorder.ordermenu.entity;

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
@Table(name = "menu"/*, uniqueConstraints = {@UniqueConstraint(name = "MENU_UNIQUE", columnNames = {""})}*/)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class menuEntity {
    
    /*메뉴아이디 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long menuId; 

    //  * 외래키 설정 부분. shopTable.

     /*메뉴이름 */
    @Column(name = "menu_name", nullable = false, columnDefinition = "varchar(40)")
    private String menuName;

    /*메뉴노출 여부 */
    @Column(name = "menu_view_yn", nullable = false, columnDefinition = "varchar(2) default 'N'")
    private String menuViewYn;

    /*조리시간 */
    @Column(name = "cook_time", columnDefinition = "varchar(10) default 'EMPTY'")
    private String cookTime;

    /*메뉴가격 박싱된 기본타입 */
    @Column(name = "menu_price", nullable = false)
    private Integer menuPrice;

    /*메뉴 대 중 소 구분 */
    @Column(name = "food_size", columnDefinition = "varchar(2) default 'EMPTY'")
    private String foodSize;

    /*음식용량 그램수 */
    @Column(name = "food_volume", columnDefinition = "varchar(6) default 'EMPTY'")
    private String foodVolume;

    /*비고 */
    @Column(name = "note", columnDefinition = "varchar(200) default 'EMPTY'")
    private String note;

    /*생성일자 */
    @CreationTimestamp
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /*마지막 업데이트 일자 */
    @UpdateTimestamp
    @Column(name = "lastUpdate_Time")
    private LocalDateTime lastUpdateTime;

    @Builder
    public menuEntity(String menuName,
                      String menuViewYn,
                      String cookTime,
                      Integer menuPrice,
                      String foodSize,
                      String foodVolume,
                      String note)
    {
        this.menuName   = menuName;
        this.menuViewYn = menuViewYn;
        this.cookTime   = cookTime;
        this.menuPrice  = menuPrice;
        this.foodSize   = foodSize;
        this.foodVolume = foodVolume;
        this.note       = note;
    }
    
}
