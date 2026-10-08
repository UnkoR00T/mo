package rs;

/* JADX INFO: loaded from: classes4.dex */
class a implements er.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f175611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f175612b;

    public a(e eVar, e.a aVar) {
        this.f175611a = eVar;
        this.f175612b = aVar;
    }

    @Override // er.l
    public Object b(Object obj) {
        return Boolean.valueOf(e.l(this.f175611a, this.f175612b, obj));
    }
}
