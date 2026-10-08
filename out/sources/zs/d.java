package zs;

import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f236642e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f236643f = f.p("<root>");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f236644g = Pattern.compile("\\.");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f236645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f236646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient d f236647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient f f236648d;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final d a(f fVar) {
            return new d(fVar.e(), c.f236639d.i(), fVar, null);
        }

        private a() {
        }
    }

    public /* synthetic */ d(String str, d dVar, f fVar, fr.k kVar) {
        this(str, dVar, fVar);
    }

    private final void c() {
        int iD = d(this.f236645a);
        if (iD >= 0) {
            this.f236648d = f.k(this.f236645a.substring(iD + 1));
            this.f236647c = new d(this.f236645a.substring(0, iD));
        } else {
            this.f236648d = f.k(this.f236645a);
            this.f236647c = c.f236639d.i();
        }
    }

    private final int d(String str) {
        int length = str.length() - 1;
        boolean z15 = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z15) {
                return length;
            }
            if (cCharAt == '`') {
                z15 = !z15;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List<f> i(d dVar) {
        if (dVar.e()) {
            return new ArrayList();
        }
        List<f> listI = i(dVar.g());
        listI.add(dVar.j());
        return listI;
    }

    public final String a() {
        return this.f236645a;
    }

    public final d b(f fVar) {
        String strE;
        if (e()) {
            strE = fVar.e();
        } else {
            strE = this.f236645a + '.' + fVar.e();
        }
        return new d(strE, this, fVar);
    }

    public final boolean e() {
        return this.f236645a.length() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && t.c(this.f236645a, ((d) obj).f236645a);
    }

    public final boolean f() {
        return this.f236646b != null || r.q0(a(), '<', 0, false, 6, null) < 0;
    }

    public final d g() {
        d dVar = this.f236647c;
        if (dVar != null) {
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        return this.f236647c;
    }

    public final List<f> h() {
        return i(this);
    }

    public int hashCode() {
        return this.f236645a.hashCode();
    }

    public final f j() {
        f fVar = this.f236648d;
        if (fVar != null) {
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        return this.f236648d;
    }

    public final f k() {
        return e() ? f236643f : j();
    }

    public final boolean l(f fVar) {
        if (e()) {
            return false;
        }
        int iQ0 = r.q0(this.f236645a, '.', 0, false, 6, null);
        if (iQ0 == -1) {
            iQ0 = this.f236645a.length();
        }
        int i15 = iQ0;
        String strE = fVar.e();
        return i15 == strE.length() && r.K(this.f236645a, 0, strE, 0, i15, false, 16, null);
    }

    public final c m() {
        c cVar = this.f236646b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f236646b = cVar2;
        return cVar2;
    }

    public String toString() {
        return e() ? f236643f.e() : this.f236645a;
    }

    public d(String str, c cVar) {
        this.f236645a = str;
        this.f236646b = cVar;
    }

    public d(String str) {
        this.f236645a = str;
    }

    private d(String str, d dVar, f fVar) {
        this.f236645a = str;
        this.f236647c = dVar;
        this.f236648d = fVar;
    }
}
