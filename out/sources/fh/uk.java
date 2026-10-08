package fh;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63576a = "\n";

    private uk(String str) {
    }

    public static uk a(String str) {
        return new uk("\n");
    }

    static final CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String b(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb5 = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb5.append(c(it.next()));
                while (it.hasNext()) {
                    sb5.append((CharSequence) this.f63576a);
                    sb5.append(c(it.next()));
                }
            }
            return sb5.toString();
        } catch (IOException e15) {
            throw new AssertionError(e15);
        }
    }
}
