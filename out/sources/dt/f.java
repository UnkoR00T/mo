package dt;

/* JADX INFO: loaded from: classes4.dex */
class f implements er.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vr.a f44477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.a f44478b;

    public f(vr.a aVar, vr.a aVar2) {
        this.f44477a = aVar;
        this.f44478b = aVar2;
    }

    @Override // er.p
    public Object B(Object obj, Object obj2) {
        return Boolean.valueOf(g.i(this.f44477a, this.f44478b, (vr.m) obj, (vr.m) obj2));
    }
}
