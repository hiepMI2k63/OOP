package bai8;

import java.time.LocalDate;

public class Card {
   private Student student;
   private String CardId;
   private LocalDate borrowDate;
   private LocalDate paymentDate;
   private String bookId;
    public Card(Student student, String CardId, LocalDate borrowDate, LocalDate paymentDate, String bookId) {
        this.student = student;
        this.CardId = CardId;
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public String getId() {
        return CardId;
    }
    public void setId(String CardId) {
        this.CardId = CardId;
    }
    public LocalDate getBorrowDate() {
        return borrowDate;
    }
    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }
    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    @Override
    public String toString() {
        return "Card [bookId=" + bookId + ", borrowDate=" + borrowDate + ", id=" + CardId + ", paymentDate=" + paymentDate
                + ", student=" + student + "]";
    }
    
}
