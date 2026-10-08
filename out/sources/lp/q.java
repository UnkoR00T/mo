package lp;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f119158a;

    q(bp.d dVar) {
        this.f119158a = dVar;
    }

    @Override // hp.c
    public bp.b D1() {
        return this.f119158a;
    }

    public String a() {
        return this.f119158a.H4(bp.i.f20871s6);
    }

    public String b() {
        return this.f119158a.H4(bp.i.f20915w7);
    }

    public int c() {
        return this.f119158a.x4(bp.i.f20949z8);
    }

    public String toString() {
        return b() + "-" + a() + "-" + c();
    }
}
