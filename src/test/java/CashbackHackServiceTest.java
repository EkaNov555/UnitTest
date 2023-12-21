import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testRemainBoundaryNegativeValues() {
        org.junit.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.junit.Test
    public void testRemainBoundaryValuesZero() {
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void testRemainBoundaryValuesMaxSum() {
        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void testRemainBoundaryValuesMin() {
        org.junit.Assert.assertEquals(service.remain(1), 999);
    }

    @org.junit.Test
    public void testRemainBoundaryBorder() {
        org.junit.Assert.assertEquals(service.remain(999), 1);
    }

    @org.junit.Test
    public void testRemainBoundaryValuesMoreThnTh() {
        org.junit.Assert.assertEquals(service.remain(1005), 995);
    }

    @org.junit.Test
    public void testRemainCriticalPath() {
        org.junit.Assert.assertEquals(service.remain(350), 650);
    }
}