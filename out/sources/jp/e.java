package jp;

/* JADX INFO: loaded from: classes4.dex */
public class e implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected bp.d f104279a;

    public e() {
        this.f104279a = null;
        this.f104279a = new bp.d();
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f104279a;
    }

    public bp.i b() {
        return (bp.i) this.f104279a.p4(bp.i.f20734f1);
    }

    public int c() {
        return this.f104279a.y4(bp.i.f20699b5, 40);
    }

    public boolean d() {
        bp.b bVarP4 = D1().p4(bp.i.f20776j3);
        if (bVarP4 instanceof bp.c) {
            return ((bp.c) bVarP4).A3();
        }
        return true;
    }

    public void e(bp.i iVar) {
        this.f104279a.Y4(bp.i.f20734f1, iVar);
    }

    public void f(int i15) {
        this.f104279a.W4(bp.i.f20699b5, i15);
    }

    public e(bp.d dVar) {
        this.f104279a = dVar;
    }
}
