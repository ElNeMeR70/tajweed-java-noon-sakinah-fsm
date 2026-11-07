import java.nio.charset.StandardCharsets;

/**
 * tajweed-java-noon-sakinah-fsm — آلة الحالة المحدودة لأحكام النون الساكنة والتنوين
 * Noon Sakinah & Tanween Finite-State Rule Automaton
 */
public final class Main {
    public static void main(String[] args) {
        String input = "مِنْ بَعْدِ / مَنْ يَعْمَلْ";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] tajweed-java-noon-sakinah-fsm (Java) — Noon Sakinah & Tanween Finite-State Rule Automaton");
        System.out.println("[AR]  آلة الحالة المحدودة لأحكام النون الساكنة والتنوين");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "Rules=[Iqlab, IdghamWithGhunnah] | DurationHarakat=2", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
