package j9;

import java.util.Arrays;
import o8.q;
import o8.s;
import w7.c0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f100359a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f100360b = new c0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f100361c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f100362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f100363e;

    e() {
    }

    private int a(int i15) {
        int i16;
        int i17 = 0;
        this.f100362d = 0;
        do {
            int i18 = this.f100362d;
            int i19 = i15 + i18;
            f fVar = this.f100359a;
            if (i19 >= fVar.f100370g) {
                break;
            }
            int[] iArr = fVar.f100373j;
            this.f100362d = i18 + 1;
            i16 = iArr[i18 + i15];
            i17 += i16;
        } while (i16 == 255);
        return i17;
    }

    public f b() {
        return this.f100359a;
    }

    public c0 c() {
        return this.f100360b;
    }

    public boolean d(q qVar) {
        int i15;
        p.w(qVar != null);
        if (this.f100363e) {
            this.f100363e = false;
            this.f100360b.b0(0);
        }
        while (!this.f100363e) {
            if (this.f100361c < 0) {
                if (!this.f100359a.c(qVar) || !this.f100359a.a(qVar, true)) {
                    return false;
                }
                f fVar = this.f100359a;
                int iA = fVar.f100371h;
                if ((fVar.f100365b & 1) == 1 && this.f100360b.j() == 0) {
                    iA += a(0);
                    i15 = this.f100362d;
                } else {
                    i15 = 0;
                }
                if (!s.f(qVar, iA)) {
                    return false;
                }
                this.f100361c = i15;
            }
            int iA2 = a(this.f100361c);
            int i16 = this.f100361c + this.f100362d;
            if (iA2 > 0) {
                c0 c0Var = this.f100360b;
                c0Var.d(c0Var.j() + iA2);
                if (!s.e(qVar, this.f100360b.f(), this.f100360b.j(), iA2)) {
                    return false;
                }
                c0 c0Var2 = this.f100360b;
                c0Var2.e0(c0Var2.j() + iA2);
                this.f100363e = this.f100359a.f100373j[i16 + (-1)] != 255;
            }
            if (i16 == this.f100359a.f100370g) {
                i16 = -1;
            }
            this.f100361c = i16;
        }
        return true;
    }

    public void e() {
        this.f100359a.b();
        this.f100360b.b0(0);
        this.f100361c = -1;
        this.f100363e = false;
    }

    public void f() {
        if (this.f100360b.f().length == 65025) {
            return;
        }
        c0 c0Var = this.f100360b;
        c0Var.d0(Arrays.copyOf(c0Var.f(), Math.max(65025, this.f100360b.j())), this.f100360b.j());
    }
}
