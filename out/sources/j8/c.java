package j8;

import java.util.Arrays;
import java.util.Comparator;
import t7.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final f0 f100029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f100030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f100031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t7.p[] f100033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f100034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f100035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f100036h;

    public c(f0 f0Var, int[] iArr, int i15) {
        zj.p.w(iArr.length > 0);
        this.f100032d = i15;
        this.f100029a = (f0) zj.p.q(f0Var);
        int length = iArr.length;
        this.f100030b = length;
        this.f100033e = new t7.p[length];
        for (int i16 = 0; i16 < iArr.length; i16++) {
            this.f100033e[i16] = f0Var.a(iArr[i16]);
        }
        Arrays.sort(this.f100033e, new Comparator() { // from class: j8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.n((t7.p) obj, (t7.p) obj2);
            }
        });
        this.f100031c = new int[this.f100030b];
        int i17 = 0;
        while (true) {
            int i18 = this.f100030b;
            if (i17 >= i18) {
                this.f100034f = new long[i18];
                this.f100036h = false;
                return;
            } else {
                this.f100031c[i17] = f0Var.b(this.f100033e[i17]);
                i17++;
            }
        }
    }

    public static /* synthetic */ int n(t7.p pVar, t7.p pVar2) {
        return pVar2.f188375j - pVar.f188375j;
    }

    @Override // j8.r
    public void a() {
    }

    @Override // j8.r
    public void c() {
    }

    @Override // j8.v
    public final t7.p d(int i15) {
        return this.f100033e[i15];
    }

    @Override // j8.v
    public final int e(int i15) {
        return this.f100031c[i15];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f100029a.equals(cVar.f100029a) && Arrays.equals(this.f100031c, cVar.f100031c)) {
                return true;
            }
        }
        return false;
    }

    @Override // j8.r
    public void f(float f15) {
    }

    @Override // j8.v
    public final int h(int i15) {
        for (int i16 = 0; i16 < this.f100030b; i16++) {
            if (this.f100031c[i16] == i15) {
                return i16;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.f100035g == 0) {
            this.f100035g = (System.identityHashCode(this.f100029a) * 31) + Arrays.hashCode(this.f100031c);
        }
        return this.f100035g;
    }

    @Override // j8.v
    public final f0 i() {
        return this.f100029a;
    }

    @Override // j8.r
    public void j(boolean z15) {
        this.f100036h = z15;
    }

    @Override // j8.r
    public final int k() {
        return this.f100031c[b()];
    }

    @Override // j8.r
    public final t7.p l() {
        return this.f100033e[b()];
    }

    @Override // j8.v
    public final int length() {
        return this.f100031c.length;
    }
}
