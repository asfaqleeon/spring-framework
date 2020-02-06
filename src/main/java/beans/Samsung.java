package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    private MobileProcessor processor;

    public MobileProcessor getMobileProcessor() {
        return processor;
    }

    public void setMobileProcessor(MobileProcessor processor) {
        this.processor = processor;
    }

    public void config() {
        System.out.println("octa core, 4gb ram, 12mp camera");
        processor.process();
    }
}
