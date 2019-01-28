public abstract class AbstractManipulator {

    protected final Scanner reader;

    AbstractManipulator(Scanner reader) {
        this.reader = reader;
    }

    protected String promptString(String prompt) {
        while (true) {
            System.out.print(this.getPrefix() + prompt);
            String toggleName = reader.nextLine();
            if (toggleName.length() > 0) {
                return toggleName;
            }
        }
    }

    protected String promptOneFromMany(String prompt, String... choices) {
        while (true) {
            System.out.print(this.getPrefix() + prompt);
            String input = this.reader.nextLine();
            for (String choice : choices) {
                if (choice.equals(input)) {
                    return input;
                }
            }
        }
    }

    protected Optional<Integer> matchFirstInteger(Pattern pattern, String input) {
        Matcher m = pattern.matcher(input);
        if (!m.find()) {
            return Optional.empty();
        }
        Integer id = Integer.parseInt(m.group(1));
        return Optional.of(id);
    }

    protected void format(String format, Object... args) {
        System.out.format(this.getPrefix() + format, args);
    }

    protected void errFormat(String format, Object... args) {
        System.err.format(this.getPrefix() + format, args);
    }

    abstract String getPrefix();

    interface Command {
        void run(String command);
    }
}
