package lv.tsi.javacourses.bookshelf.control;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Util {
    public static void addError(String fieldId, String message) {
        FacesContext.getCurrentInstance()
                .addMessage(fieldId,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
    }
}
