package l5;

/* JADX INFO: loaded from: classes.dex */
public class h implements e, k5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k5.g f116059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f116060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n5.h f116061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f116062d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f116063e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f116064f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f116065g;

    public h(k5.g gVar) {
        this.f116059a = gVar;
    }

    @Override // l5.e, k5.f
    public n5.e a() {
        if (this.f116061c == null) {
            this.f116061c = new n5.h();
        }
        return this.f116061c;
    }

    @Override // l5.e, k5.f
    public void apply() {
        this.f116061c.D1(this.f116060b);
        int i15 = this.f116062d;
        if (i15 != -1) {
            this.f116061c.A1(i15);
            return;
        }
        int i16 = this.f116063e;
        if (i16 != -1) {
            this.f116061c.B1(i16);
        } else {
            this.f116061c.C1(this.f116064f);
        }
    }

    @Override // k5.f
    public void b(n5.e eVar) {
        if (eVar instanceof n5.h) {
            this.f116061c = (n5.h) eVar;
        } else {
            this.f116061c = null;
        }
    }

    @Override // k5.f
    public void c(Object obj) {
        this.f116065g = obj;
    }

    @Override // k5.f
    public e d() {
        return null;
    }

    public h e(Object obj) {
        this.f116062d = -1;
        this.f116063e = this.f116059a.e(obj);
        this.f116064f = 0.0f;
        return this;
    }

    public h f(float f15) {
        this.f116062d = -1;
        this.f116063e = -1;
        this.f116064f = f15;
        return this;
    }

    public void g(int i15) {
        this.f116060b = i15;
    }

    @Override // k5.f
    public Object getKey() {
        return this.f116065g;
    }

    public h h(Object obj) {
        this.f116062d = this.f116059a.e(obj);
        this.f116063e = -1;
        this.f116064f = 0.0f;
        return this;
    }
}
