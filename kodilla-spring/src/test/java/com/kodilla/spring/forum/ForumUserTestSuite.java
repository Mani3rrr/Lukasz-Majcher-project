package com.kodilla.spring.forum;



import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class ForumUserTestSuite {

        @Test
        public void testCircleLoadedIntoContainer() {
            //Given
            ApplicationContext context =
                    new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
            ForumUser user = context.getBean(ForumUser.class);
            //When
            String name = user.getUserName();
            //Then
            Assert.assertEquals("John Smith", name);
        }

    @Test
    public void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Square.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a square.", name);
    }

    }
