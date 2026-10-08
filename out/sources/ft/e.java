package ft;

import java.util.Arrays;
import st.e1;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends r<Character> {
    public e(char c15) {
        super(Character.valueOf(c15));
    }

    private final String c(char c15) {
        switch (c15) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return e(c15) ? String.valueOf(c15) : "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean e(char c15) {
        byte type = (byte) Character.getType(c15);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // ft.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e1 a(i0 i0Var) {
        return i0Var.i().v();
    }

    @Override // ft.g
    public String toString() {
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
    }
}
