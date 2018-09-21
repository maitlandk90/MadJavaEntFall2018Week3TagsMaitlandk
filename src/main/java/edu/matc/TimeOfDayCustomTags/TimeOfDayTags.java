package edu.matc.TimeOfDayCustomTags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Date;

public class TimeOfDayTags extends SimpleTagSupport {

    private Date today = new Date();
    private Date groundHogDay = new Date(today.getYear(), 2, 2);

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        if (today.equals(groundHogDay)) {
            out.println("Happy Groundhogs Day!");
        }
        if (today.getHours() >= 0 &&
            today.getHours() < 12) {
            out.println("Good morning!");
        }
        else if (today.getHours() >= 12 &&
                 today.getHours() < 23) {
            out.println("Good afternoon!");
        }
    }
}
