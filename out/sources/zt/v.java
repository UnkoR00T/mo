package zt;

import st.t0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f237277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er.l<sr.j, t0> f237278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f237279c;

    public static final class a extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f237280d = new a();

        private a() {
            super("Boolean", u.f237276a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t0 c(sr.j jVar) {
            return jVar.o();
        }
    }

    public static final class b extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f237281d = new b();

        private b() {
            super("Int", w.f237283a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t0 c(sr.j jVar) {
            return jVar.E();
        }
    }

    public static final class c extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f237282d = new c();

        private c() {
            super("Unit", x.f237284a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t0 c(sr.j jVar) {
            return jVar.a0();
        }
    }

    public /* synthetic */ v(String str, er.l lVar, fr.k kVar) {
        this(str, lVar);
    }

    @Override // zt.f
    public boolean a(vr.z zVar) {
        return fr.t.c(zVar.f(), this.f237278b.b(ht.e.m(zVar)));
    }

    @Override // zt.f
    public /* bridge */ String b(vr.z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // zt.f
    public String getDescription() {
        return this.f237279c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v(String str, er.l<? super sr.j, ? extends t0> lVar) {
        this.f237277a = str;
        this.f237278b = lVar;
        this.f237279c = "must return " + str;
    }
}
