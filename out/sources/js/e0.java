package js;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f104634d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f104635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er.l<zs.c, p0> f104636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f104637c;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p0 c(oq.i iVar, zs.c cVar) {
            return b0.c(cVar, iVar);
        }

        public final e0 b(oq.i iVar) {
            return new e0(b0.a(iVar), new d0(iVar));
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(h0 h0Var, er.l<? super zs.c, ? extends p0> lVar) {
        this.f104635a = h0Var;
        this.f104636b = lVar;
        this.f104637c = h0Var.f() || lVar.b(b0.d()) == p0.IGNORE;
    }

    public final boolean a() {
        return this.f104637c;
    }

    public final er.l<zs.c, p0> b() {
        return this.f104636b;
    }

    public final h0 c() {
        return this.f104635a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f104635a + ", getReportLevelForAnnotation=" + this.f104636b + ')';
    }
}
