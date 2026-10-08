package rs;

/* JADX INFO: loaded from: classes4.dex */
class d implements er.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f175623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wt.s f175624b;

    public d(e eVar, wt.s sVar) {
        this.f175623a = eVar;
        this.f175624b = sVar;
    }

    @Override // er.l
    public Object b(Object obj) {
        return e.M(this.f175623a, this.f175624b, (e.a) obj);
    }
}
