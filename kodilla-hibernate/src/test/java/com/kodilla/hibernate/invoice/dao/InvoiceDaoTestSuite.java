package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Ball");
        Product product2 = new Product("Telephone");
        Product product3 = new Product("Wallet");

        Item item1 = new Item(product1, new BigDecimal(200), 2, new BigDecimal(400));
        Item item2 = new Item(product1, new BigDecimal(200), 4, new BigDecimal(800));
        Item item3 = new Item(product3, new BigDecimal(70), 1, new BigDecimal(70));

        Invoice invoice1 = new Invoice("F Number 1");

        product1.getItems().add(item1);
        item1.setProduct(product1);
        invoice1.getItems().add(item1);

        product2.getItems().add(item2);
        item2.setProduct(product2);
        invoice1.getItems().add(item2);

        product3.getItems().add(item3);
        item3.setProduct(product3);
        invoice1.getItems().add(item3);


        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
        Assert.assertNotEquals(1, invoice1Id);

        //CleanUp
        try {
            invoiceDao.deleteById(invoice1Id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
