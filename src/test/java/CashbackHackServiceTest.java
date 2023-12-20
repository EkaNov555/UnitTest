import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testRemainBoundaryNegativeValues() {
        org.testng.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesZero() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }
    @org.testng.annotations.Test
    public void testRemainBoundaryValuesMaxSum() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }
    @org.testng.annotations.Test
    public void testRemainBoundaryValuesMin() {
        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesBorder() {
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesMoreThnTh() {
        org.testng.Assert.assertEquals(service.remain(1005), 995);
    }

    @org.testng.annotations.Test
    public void testRemainCriticalPath() {
        org.testng.Assert.assertEquals(service.remain(350), 650);
    }
}