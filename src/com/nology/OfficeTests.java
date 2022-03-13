package com.nology;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class OfficeTests {

    private OfficeSupplies newSupplies;

    @Before
    public void setup() { newSupplies = new OfficeSupplies(1000, 200, 8000, 50, 300, 9550);}

    @org.junit.Test
    public void GetPensTotal() {
        // Assert
        assertEquals(1000, newSupplies.totalPens() );
    }

    @org.junit.Test
    public void AddPenReturnTotal() {
        // Act
        newSupplies.addPens(50);
        // Assert
        assertEquals(1050, newSupplies.totalPens());
    }

    @org.junit.Test
    public void RemovePenReturnTotal() {
        // Act
        newSupplies.removePens(50);
        // Assert
        assertEquals(950, newSupplies.totalPens());
    }

    @org.junit.Test
    public void GetStaplersTotal() {
        // Assert
        assertEquals(200, newSupplies.totalStaplers());
    }

    @org.junit.Test
    public void AddStaplerAddTotal() {
        // Act
        newSupplies.addStaplers(20);
        // Assert
        assertEquals(220, newSupplies.totalStaplers());
    }

    @org.junit.Test
    public void RemoveStaplerReturnTotal() {
        // Act
        newSupplies.removeStaplers(100);
        // Assert
        assertEquals(100, newSupplies.totalStaplers());
    }

    @org.junit.Test
    public void GetStaplesTotal() {
        // Assert
        assertEquals(8000, newSupplies.totalStaples());
    }

    @org.junit.Test
    public void AddStapleReturnTotal() {
        // Act
        newSupplies.addStaples(2000);
        // Assert
        assertEquals(10000, newSupplies.totalStaples());
    }

    @org.junit.Test
    public void RemoveStapleReturnTotal() {
        // Act
        newSupplies.removeStaples(5000);
        // Assert
        assertEquals(3000, newSupplies.totalStaples());
    }

    @org.junit.Test
    public void GetA4Booklets() {
        // Assert
        assertEquals(300, newSupplies.totalA4Booklets());
    }

    @org.junit.Test
    public void AddA4BookletsReturnTotal() {
        // Act
        newSupplies.addA4Booklets(100);
        // Assert
        assertEquals(400, newSupplies.totalA4Booklets());
    }

    @org.junit.Test
    public void RemoveA4BookletsReturnTotal() {
        // Act
        newSupplies.removeA4Booklets(150);
        // Assert
        assertEquals(150, newSupplies.totalA4Booklets());
    }
}
