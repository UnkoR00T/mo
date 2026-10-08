package eh;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class s implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f51027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Map f51028b;

    s() {
    }

    @Override // eh.c1
    public final Map b() {
        Map map = this.f51028b;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.f51028b = mapE;
        return mapE;
    }

    @Override // eh.c1
    public final Set c() {
        Set set = this.f51027a;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.f51027a = setF;
        return setF;
    }

    abstract Map e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c1) {
            return b().equals(((c1) obj).b());
        }
        return false;
    }

    abstract Set f();

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return ((i) b()).f50647c.toString();
    }
}
