package ot;

import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws.d f149765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final us.c f149766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ws.a f149767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h1 f149768d;

    public i(ws.d dVar, us.c cVar, ws.a aVar, h1 h1Var) {
        this.f149765a = dVar;
        this.f149766b = cVar;
        this.f149767c = aVar;
        this.f149768d = h1Var;
    }

    public final ws.d a() {
        return this.f149765a;
    }

    public final us.c b() {
        return this.f149766b;
    }

    public final ws.a c() {
        return this.f149767c;
    }

    public final h1 d() {
        return this.f149768d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return fr.t.c(this.f149765a, iVar.f149765a) && fr.t.c(this.f149766b, iVar.f149766b) && fr.t.c(this.f149767c, iVar.f149767c) && fr.t.c(this.f149768d, iVar.f149768d);
    }

    public int hashCode() {
        return (((((this.f149765a.hashCode() * 31) + this.f149766b.hashCode()) * 31) + this.f149767c.hashCode()) * 31) + this.f149768d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f149765a + ", classProto=" + this.f149766b + ", metadataVersion=" + this.f149767c + ", sourceElement=" + this.f149768d + ')';
    }
}
