package com.orders.tableorder.orders.entity;

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
@Table(name = "orders"/*, uniqueConstraints = {@UniqueConstraint(name = "ORDER_UNIQUE", columnNames = {"shop_id"})}*/)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ordersEntity {
    
    /*주키 : 박싱 기본타입 Long */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    /*보조키 : 박싱 기본타입 Long */
    @Column(name = "shop_id", nullable = false)
    private Long shopId;

    /*매장이름 */
    @Column(name = "shop_name", nullable = false, columnDefinition = "varchar(50)")
    private String shopName;

    /*테이블 넘버 */
    @Column(name = "table_no", nullable = false, columnDefinition = "varchar(3)")
    private String tableNo;

    /*메뉴이름 */
    @Column(name = "menu_name", nullable = false, columnDefinition = "varchar(40)")
    private String menuName;

    /*메뉴 대 중 소 구분 */
    @Column(name = "food_size", columnDefinition = "varchar(2)")
    private String foodSize;

    /*메뉴별 주문 수량 */
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    /*총 주문금액 */
    @Column(name = "total_price", nullable = false)
    private Integer totalPrice;

    /*비고 */
    @Column(name = "note", columnDefinition = "varchar(200) default 'EMPTY'")
    private String note;

    /*생성일자 */
    @CreationTimestamp
    @Column(name = "create_Time")
    private LocalDateTime createTime;
    
    /*마지막 업데이트 일자 */
    @UpdateTimestamp
    @Column(name = "lastUpdate_Time")
    private LocalDateTime lastUpdateTime;

    @Builder
    public ordersEntity( Long   shopId, 
                         String shopName,
                         String tableNo,
                         String menuName,
                         String foodSize,
                         Integer quantity,
                         Integer totalPrice,
                         String note)
    {
        this.shopId     = shopId;
        this.shopName   = shopName;
        this.tableNo    = tableNo;
        this.menuName   = menuName;
        this.foodSize   = foodSize;
        this.quantity   = quantity;
        this.totalPrice = totalPrice;
        this.note       = note;
    }
}
