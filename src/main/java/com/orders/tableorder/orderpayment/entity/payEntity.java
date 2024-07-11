package com.orders.tableorder.orderpayment.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payment")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class payEntity {

    /*기본키 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pay_id")
    private Long payId;

    /*매장아이디 */
    @Column(name = "shop_id", nullable = false)
    private Long shopId;

    /*매장명 */
    @Column(name = "shop_name", nullable = false, columnDefinition = "varchar(50)")
    private String shopName;

    /*주문테이블번호 */
    @Column(name = "table_no", nullable = false, columnDefinition = "varchar(3)")
    private String tableNo;

    /*메뉴이름 */
    @Column(name = "menu_name", nullable = false, columnDefinition = "varchar(40)")
    private String menuName;

    /*메뉴수량 */
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    /*총 결제금액 */
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
    public payEntity( Long    shopId,
                      String  shopName,
                      String  tableNo,
                      String  menuName,
                      Integer quantity,
                      Integer totalPrice,
                      String  note)
    {
        this.shopId     = shopId;
        this.shopName   = shopName;
        this.tableNo    = tableNo;
        this.menuName   = menuName;
        this.quantity   = quantity;
        this.totalPrice = totalPrice;
        this.note       = note;
    }
    
}
