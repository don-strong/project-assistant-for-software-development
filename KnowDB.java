public record KnowDB(String id, String keywords,
    String prog_lang, String application,
    String observed_errors, String known_solutions) {
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Keywords: " + keywords + "\n" +
               "Programming Language: " + prog_lang + "\n" +
               "Application: " + application + "\n" +
               "Observed Errors: " + observed_errors + "\n" +
               "Known Solutions: " + known_solutions + "\n";
    }
}
