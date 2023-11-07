package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.CartItem;
import com.getdata.restcall_test1.Entity.ShoppingCart;
import com.getdata.restcall_test1.Entity.User;
import com.getdata.restcall_test1.Repository.BookRepo;
import com.getdata.restcall_test1.Repository.CartItemRepo;
import com.getdata.restcall_test1.Repository.ShoppingCartRepo;
import com.getdata.restcall_test1.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShoppingCartService {

    private final ShoppingCartRepo shoppingCartRepository;
    private final CartItemRepo cartItemRepository;
    private final BookRepo bookRepository;
    private final UserRepo userRepository;

    @Autowired
    public ShoppingCartService(ShoppingCartRepo shoppingCartRepository, CartItemRepo cartItemRepository, BookRepo bookRepository, UserRepo userRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.cartItemRepository = cartItemRepository;
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    public Double getCartSubtotalByUserId(String userId) {
        List<CartItem> cartItems = cartItemRepository.findByCart_UserID(userId);
        return cartItems.stream()
                .mapToDouble(cartItem -> cartItem.getBook().getPrice() * cartItem.getQuantity())
                .sum();
    }

    public void addToUserCart(String userId, String bookId) {
        ShoppingCart cart = shoppingCartRepository.findByUser_UserID(userId);

        // Check if the cart item for the bookId already exists.
        CartItem existingItem = cartItemRepository.findByCartAndBookId(cart, bookId);

        if (existingItem == null) {
            existingItem.setQuantity(existingItem.getQuantity() + 1);
            cartItemRepository.save(existingItem);
        } else {
            CartItem newItem = new CartItem();
            newItem.setBook(bookRepository.findById(String.valueOf(Long.parseLong(bookId))).orElse(null));
            newItem.setCart(cart);
            newItem.setQuantity(1);
            cartItemRepository.save(newItem);
        }
    }

    public List<Books> getBooksInUserCart(String userId) {
        List<CartItem> cartItems = cartItemRepository.findByCart_UserID(userId);
        return cartItems.stream()
                .map(CartItem::getBook)
                .collect(Collectors.toList());
    }

    public void removeBookFromUserCart(String userId, String bookId) {
        ShoppingCart cart = shoppingCartRepository.findByUser_UserID(userId);
        CartItem itemToRemove = cartItemRepository.findByCartAndBookId(cart, bookId);
        if (itemToRemove != null) {
            cartItemRepository.delete(itemToRemove);
        }
    }
}

