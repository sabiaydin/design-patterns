package proxy;

import java.math.BigDecimal;

public class RealManager implements CompanyInfo{
    @Override
    public BigDecimal getGiro() {
        return BigDecimal.valueOf(10000);
    }
}
