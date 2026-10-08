package zs;

import fr.t;
import fu.r;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f236634d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f236635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f236636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f236637c;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z15, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                z15 = false;
            }
            return aVar.a(str, z15);
        }

        public final b a(String str, boolean z15) {
            String strP;
            String str2;
            int iQ0 = r.q0(str, '`', 0, false, 6, null);
            if (iQ0 == -1) {
                iQ0 = str.length();
            }
            int iX0 = r.x0(str, "/", iQ0, false, 4, null);
            if (iX0 == -1) {
                strP = r.P(str, "`", "", false, 4, null);
                str2 = "";
            } else {
                String strO = r.O(str.substring(0, iX0), '/', '.', false, 4, null);
                strP = r.P(str.substring(iX0 + 1), "`", "", false, 4, null);
                str2 = strO;
            }
            return new b(new c(str2), new c(strP), z15);
        }

        public final b c(c cVar) {
            return new b(cVar.d(), cVar.f());
        }

        private a() {
        }
    }

    public b(c cVar, c cVar2, boolean z15) {
        this.f236635a = cVar;
        this.f236636b = cVar2;
        this.f236637c = z15;
        cVar2.c();
    }

    private static final String c(c cVar) {
        String strA = cVar.a();
        if (!r.c0(strA, '/', false, 2, null)) {
            return strA;
        }
        return '`' + strA + '`';
    }

    public static final b k(c cVar) {
        return f236634d.c(cVar);
    }

    public final c a() {
        if (this.f236635a.c()) {
            return this.f236636b;
        }
        return new c(this.f236635a.a() + '.' + this.f236636b.a());
    }

    public final String b() {
        if (this.f236635a.c()) {
            return c(this.f236636b);
        }
        return r.O(this.f236635a.a(), '.', '/', false, 4, null) + "/" + c(this.f236636b);
    }

    public final b d(f fVar) {
        return new b(this.f236635a, this.f236636b.b(fVar), this.f236637c);
    }

    public final b e() {
        c cVarD = this.f236636b.d();
        if (cVarD.c()) {
            return null;
        }
        return new b(this.f236635a, cVarD, this.f236637c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f236635a, bVar.f236635a) && t.c(this.f236636b, bVar.f236636b) && this.f236637c == bVar.f236637c;
    }

    public final c f() {
        return this.f236635a;
    }

    public final c g() {
        return this.f236636b;
    }

    public final f h() {
        return this.f236636b.f();
    }

    public int hashCode() {
        return (((this.f236635a.hashCode() * 31) + this.f236636b.hashCode()) * 31) + Boolean.hashCode(this.f236637c);
    }

    public final boolean i() {
        return this.f236637c;
    }

    public final boolean j() {
        return !this.f236636b.d().c();
    }

    public String toString() {
        if (!this.f236635a.c()) {
            return b();
        }
        return '/' + b();
    }

    public b(c cVar, f fVar) {
        this(cVar, c.f236638c.a(fVar), false);
    }
}
