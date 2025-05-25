package gr.aueb.cf.helloapp.dto;

public record TeacherReadOnlyDTO(Long id, String firstname, String lastname) {

    // default axillary constructor
    public TeacherReadOnlyDTO() {
        this(null, "","");
    }
}
