package vr;

import lt.k;

/* JADX INFO: loaded from: classes4.dex */
public final class f1<T extends lt.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f208047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er.l<tt.g, T> f208048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tt.g f208049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.i f208050d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f208046f = {fr.q0.j(new fr.h0(f1.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f208045e = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final <T extends lt.k> f1<T> a(e eVar, rt.n nVar, tt.g gVar, er.l<? super tt.g, ? extends T> lVar) {
            return new f1<>(eVar, nVar, lVar, gVar, null);
        }

        private a() {
        }
    }

    public /* synthetic */ f1(e eVar, rt.n nVar, er.l lVar, tt.g gVar, fr.k kVar) {
        this(eVar, nVar, lVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lt.k d(f1 f1Var, tt.g gVar) {
        return f1Var.f208048b.b(gVar);
    }

    private final T e() {
        return (T) rt.m.a(this.f208050d, this, f208046f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lt.k f(f1 f1Var) {
        return f1Var.f208048b.b(f1Var.f208049c);
    }

    public final T c(tt.g gVar) {
        if (gVar.d(ht.e.s(this.f208047a)) && gVar.e(this.f208047a.o())) {
            return (T) gVar.c(this.f208047a, new e1(this, gVar));
        }
        return (T) e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f1(e eVar, rt.n nVar, er.l<? super tt.g, ? extends T> lVar, tt.g gVar) {
        this.f208047a = eVar;
        this.f208048b = lVar;
        this.f208049c = gVar;
        this.f208050d = nVar.d(new d1(this));
    }
}
