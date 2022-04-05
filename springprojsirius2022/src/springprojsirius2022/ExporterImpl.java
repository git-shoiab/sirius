package springprojsirius2022;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ExporterImpl extends DelegatingIntroductionInterceptor implements Exporter{
@Override
public void doExport() {
	System.out.println("do export method is called....");
}
}
