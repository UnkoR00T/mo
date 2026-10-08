package ak;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes4.dex */
abstract class i<C extends Comparable> implements s1<C> {
    i() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            return a().equals(((s1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
