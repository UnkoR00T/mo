package es;

import java.util.Map;
import pq.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, f> f53080b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, Map<String, ? extends f> map) {
        this.f53079a = str;
        this.f53080b = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(oq.r rVar) {
        return ((String) rVar.a()) + " = " + ((f) rVar.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return fr.t.c(this.f53079a, eVar.f53079a) && fr.t.c(this.f53080b, eVar.f53080b);
    }

    public int hashCode() {
        return (this.f53079a.hashCode() * 31) + this.f53080b.hashCode();
    }

    public String toString() {
        return '@' + this.f53079a + '(' + pq.v.v0(v0.y(this.f53080b), null, null, null, 0, null, d.f53073a, 31, null) + ')';
    }
}
