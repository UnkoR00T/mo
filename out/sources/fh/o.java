package fh;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class o implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f63416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Map f63417b;

    o() {
    }

    @Override // fh.e1
    public final Set B() {
        Set set = this.f63416a;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.f63416a = setE;
        return setE;
    }

    @Override // fh.e1
    public final Map b() {
        Map map = this.f63417b;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.f63417b = mapD;
        return mapD;
    }

    abstract Map d();

    abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1) {
            return b().equals(((e1) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
