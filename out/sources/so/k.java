package so;

import android.graphics.Path;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short f182662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private short f182663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f182664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f182665d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short f182667f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private uo.a f182666e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f182668g = null;

    public l a() {
        return this.f182668g;
    }

    public Path b() {
        return new m(this.f182668g).c();
    }

    public short c() {
        return this.f182665d;
    }

    void d(o oVar, i0 i0Var, int i15) {
        this.f182667f = i0Var.E();
        this.f182662a = i0Var.E();
        this.f182663b = i0Var.E();
        this.f182664c = i0Var.E();
        short sE = i0Var.E();
        this.f182665d = sE;
        this.f182666e = new uo.a(this.f182662a, this.f182663b, this.f182664c, sE);
        short s15 = this.f182667f;
        if (s15 >= 0) {
            this.f182668g = new j(s15, i0Var, (short) (i15 - this.f182662a));
        } else {
            this.f182668g = new h(i0Var, oVar);
        }
    }

    void e() {
        this.f182668g = new j();
        this.f182666e = new uo.a();
    }
}
