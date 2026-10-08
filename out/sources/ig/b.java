package ig;

import hg.a.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b<O extends hg.a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f92139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hg.a f92140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hg.a.d f92141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92142d;

    private b(hg.a aVar, hg.a.d dVar, String str) {
        this.f92140b = aVar;
        this.f92141c = dVar;
        this.f92142d = str;
        this.f92139a = jg.r.b(aVar, dVar, str);
    }

    public static <O extends hg.a.d> b<O> a(hg.a<O> aVar, O o15, String str) {
        return new b<>(aVar, o15, str);
    }

    public final String b() {
        return this.f92140b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jg.r.a(this.f92140b, bVar.f92140b) && jg.r.a(this.f92141c, bVar.f92141c) && jg.r.a(this.f92142d, bVar.f92142d);
    }

    public final int hashCode() {
        return this.f92139a;
    }
}
