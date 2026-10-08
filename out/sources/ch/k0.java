package ch;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
abstract class k0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set f25995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Map f25996b;

    k0() {
    }

    @Override // ch.u1
    public final Map J() {
        Map map = this.f25996b;
        if (map != null) {
            return map;
        }
        Map mapA = a();
        this.f25996b = mapA;
        return mapA;
    }

    @Override // ch.u1
    public final Set K() {
        Set set = this.f25995a;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.f25995a = setB;
        return setB;
    }

    abstract Map a();

    abstract Set b();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            return J().equals(((u1) obj).J());
        }
        return false;
    }

    public final int hashCode() {
        return J().hashCode();
    }

    public final String toString() {
        return J().toString();
    }
}
