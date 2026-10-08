package mt;

import fr.t;
import st.e1;

/* JADX INFO: loaded from: classes4.dex */
public class e implements g, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vr.e f128143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f128144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.e f128145c;

    public e(vr.e eVar, e eVar2) {
        this.f128143a = eVar;
        this.f128144b = eVar2 == null ? this : eVar2;
        this.f128145c = eVar;
    }

    @Override // mt.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e1 getType() {
        return this.f128143a.t();
    }

    public boolean equals(Object obj) {
        vr.e eVar = this.f128143a;
        e eVar2 = obj instanceof e ? (e) obj : null;
        return t.c(eVar, eVar2 != null ? eVar2.f128143a : null);
    }

    public int hashCode() {
        return this.f128143a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // mt.i
    public final vr.e y() {
        return this.f128143a;
    }
}
