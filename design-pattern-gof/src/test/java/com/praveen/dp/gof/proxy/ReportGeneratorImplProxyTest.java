package com.praveen.dp.gof.proxy;

import org.junit.Test;

import com.praveen.dp.gof.proxy.ReportGenerator;
import com.praveen.dp.gof.proxy.ReportGeneratorImplProxy;
import com.praveen.dp.gof.proxy.Role;

import static org.junit.Assert.*;

public class ReportGeneratorImplProxyTest {

    @Test
    public void testGenerateReport() throws Exception {
        Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf",150);
        proxy.generateComplexReport("Pdf",150);
        proxy.generateSensitiveReport();
    }
}