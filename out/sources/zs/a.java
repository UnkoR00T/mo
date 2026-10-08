package zs;

import fr.t;
import fu.r;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C6397a f236626f = new C6397a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f236627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f236628h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f236629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f236630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f236631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f236632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f236633e;

    /* JADX INFO: renamed from: zs.a$a, reason: collision with other inner class name */
    public static final class C6397a {
        public /* synthetic */ C6397a(fr.k kVar) {
            this();
        }

        private C6397a() {
        }
    }

    static {
        f fVar = h.f236668n;
        f236627g = fVar;
        f236628h = c.f236638c.a(fVar);
    }

    private a(c cVar, c cVar2, f fVar, b bVar, c cVar3) {
        this.f236629a = cVar;
        this.f236630b = cVar2;
        this.f236631c = fVar;
        this.f236632d = bVar;
        this.f236633e = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f236629a, aVar.f236629a) && t.c(this.f236630b, aVar.f236630b) && t.c(this.f236631c, aVar.f236631c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f236629a.hashCode()) * 31;
        c cVar = this.f236630b;
        return ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f236631c.hashCode();
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(r.O(this.f236629a.a(), '.', '/', false, 4, null));
        sb5.append("/");
        c cVar = this.f236630b;
        if (cVar != null) {
            sb5.append(cVar);
            sb5.append(".");
        }
        sb5.append(this.f236631c);
        return sb5.toString();
    }

    public a(c cVar, f fVar) {
        this(cVar, null, fVar, null, null);
    }
}
