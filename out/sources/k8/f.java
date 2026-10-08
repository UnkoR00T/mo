package k8;

import java.util.Arrays;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f109057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f109058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f109059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f109060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f109061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f109062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a[] f109063g;

    public f(boolean z15, int i15) {
        this(z15, i15, 0);
    }

    @Override // k8.b
    public synchronized a a() {
        a aVar;
        try {
            this.f109061e++;
            int i15 = this.f109062f;
            if (i15 > 0) {
                a[] aVarArr = this.f109063g;
                int i16 = i15 - 1;
                this.f109062f = i16;
                aVar = (a) p.q(aVarArr[i16]);
                this.f109063g[this.f109062f] = null;
            } else {
                aVar = new a(new byte[this.f109058b], 0);
                int i17 = this.f109061e;
                a[] aVarArr2 = this.f109063g;
                if (i17 > aVarArr2.length) {
                    this.f109063g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return aVar;
    }

    @Override // k8.b
    public synchronized void b() {
        try {
            int i15 = 0;
            int iMax = Math.max(0, o0.j(this.f109060d, this.f109058b) - this.f109061e);
            int i16 = this.f109062f;
            if (iMax >= i16) {
                return;
            }
            if (this.f109059c != null) {
                int i17 = i16 - 1;
                while (i15 <= i17) {
                    a aVar = (a) p.q(this.f109063g[i15]);
                    if (aVar.f109047a == this.f109059c) {
                        i15++;
                    } else {
                        a aVar2 = (a) p.q(this.f109063g[i17]);
                        if (aVar2.f109047a != this.f109059c) {
                            i17--;
                        } else {
                            a[] aVarArr = this.f109063g;
                            aVarArr[i15] = aVar2;
                            aVarArr[i17] = aVar;
                            i17--;
                            i15++;
                        }
                    }
                }
                iMax = Math.max(iMax, i15);
                if (iMax >= this.f109062f) {
                    return;
                }
            }
            Arrays.fill(this.f109063g, iMax, this.f109062f, (Object) null);
            this.f109062f = iMax;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // k8.b
    public synchronized void c(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f109063g;
            int i15 = this.f109062f;
            this.f109062f = i15 + 1;
            aVarArr[i15] = aVar.a();
            this.f109061e--;
            aVar = aVar.next();
        }
    }

    @Override // k8.b
    public synchronized void d(a aVar) {
        a[] aVarArr = this.f109063g;
        int i15 = this.f109062f;
        this.f109062f = i15 + 1;
        aVarArr[i15] = aVar;
        this.f109061e--;
    }

    @Override // k8.b
    public int e() {
        return this.f109058b;
    }

    public synchronized void f() {
        if (this.f109057a) {
            g(0);
        }
    }

    public synchronized void g(int i15) {
        boolean z15 = i15 < this.f109060d;
        this.f109060d = i15;
        if (z15) {
            b();
        }
    }

    public f(boolean z15, int i15, int i16) {
        p.d(i15 > 0);
        p.d(i16 >= 0);
        this.f109057a = z15;
        this.f109058b = i15;
        this.f109062f = i16;
        this.f109063g = new a[i16 + 100];
        if (i16 <= 0) {
            this.f109059c = null;
            return;
        }
        this.f109059c = new byte[i16 * i15];
        for (int i17 = 0; i17 < i16; i17++) {
            this.f109063g[i17] = new a(this.f109059c, i17 * i15);
        }
    }
}
