package rs;

/* JADX INFO: loaded from: classes4.dex */
class c implements er.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1 f175619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i[] f175620b;

    public c(r1 r1Var, i[] iVarArr) {
        this.f175619a = r1Var;
        this.f175620b = iVarArr;
    }

    @Override // er.l
    public Object b(Object obj) {
        return e.h(this.f175619a, this.f175620b, ((Number) obj).intValue());
    }
}
