package com.iki.domain.dto.Cart;

import com.iki.domain.dto.OrderMenu.OrderMenuResponseDto;
import com.iki.domain.entity.Cart;
import com.iki.domain.entity.OrderUsers;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class CartStatusResponseDto {
    Long cartId;
    Long orderUsersId;
    int totalPrice;
    int totalAmount;
    List<OrderMenuResponseDto> orderMenuResponseDtoList;

    @Builder
    public CartStatusResponseDto(List<OrderMenuResponseDto> orderMenuResponseDtoList, Cart cart, OrderUsers users) {
        this.cartId = cart.getCartId();
        this.orderUsersId = users.getOrderUsersId();
        this.orderMenuResponseDtoList = orderMenuResponseDtoList;
        this.totalPrice = cart.getTotalPrice();
        this.totalAmount = cart.getTotalAmount();
    }
}
