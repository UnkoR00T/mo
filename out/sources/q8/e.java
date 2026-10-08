package q8;

import java.util.Arrays;
import o8.l0;
import o8.m0;
import o8.q;
import o8.s0;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f165270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s0 f165271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f165272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f165273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f165274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f165275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f165276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f165277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f165278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f165279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f165280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f165281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f165282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f165283n;

    public e(int i15, d dVar, s0 s0Var) {
        this.f165270a = dVar;
        int iB = dVar.b();
        boolean z15 = true;
        if (iB != 1 && iB != 2) {
            z15 = false;
        }
        p.d(z15);
        this.f165272c = d(i15, iB == 2 ? 1667497984 : 1651965952);
        this.f165274e = dVar.a();
        this.f165271b = s0Var;
        this.f165273d = iB == 2 ? d(i15, 1650720768) : -1;
        this.f165281l = -1L;
        this.f165282m = new long[512];
        this.f165283n = new int[512];
        this.f165275f = dVar.f165267e;
    }

    private static int d(int i15, int i16) {
        return (((i15 % 10) + 48) << 8) | ((i15 / 10) + 48) | i16;
    }

    private long e(int i15) {
        return (this.f165274e * ((long) i15)) / ((long) this.f165275f);
    }

    private m0 h(int i15) {
        return new m0(((long) this.f165283n[i15]) * g(), this.f165282m[i15]);
    }

    public void a() {
        this.f165278i++;
    }

    public void b(long j15, boolean z15) {
        if (this.f165281l == -1) {
            this.f165281l = j15;
        }
        if (z15) {
            if (this.f165280k == this.f165283n.length) {
                long[] jArr = this.f165282m;
                this.f165282m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f165283n;
                this.f165283n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f165282m;
            int i15 = this.f165280k;
            jArr2[i15] = j15;
            this.f165283n[i15] = this.f165279j;
            this.f165280k = i15 + 1;
        }
        this.f165279j++;
    }

    public void c() {
        int i15;
        this.f165282m = Arrays.copyOf(this.f165282m, this.f165280k);
        this.f165283n = Arrays.copyOf(this.f165283n, this.f165280k);
        if (!k() || this.f165270a.f165269g == 0 || (i15 = this.f165280k) <= 0) {
            return;
        }
        this.f165275f = i15;
    }

    public long f() {
        return e(this.f165278i);
    }

    public long g() {
        return e(1);
    }

    public l0.a i(long j15) {
        if (this.f165280k == 0) {
            return new l0.a(new m0(0L, this.f165281l));
        }
        int iG = (int) (j15 / g());
        int iF = o0.f(this.f165283n, iG, true, true);
        if (this.f165283n[iF] == iG) {
            return new l0.a(h(iF));
        }
        m0 m0VarH = h(iF);
        int i15 = iF + 1;
        return i15 < this.f165282m.length ? new l0.a(m0VarH, h(i15)) : new l0.a(m0VarH);
    }

    public boolean j(int i15) {
        return this.f165272c == i15 || this.f165273d == i15;
    }

    public boolean k() {
        return (this.f165272c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f165283n, this.f165278i) >= 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean m(q qVar) {
        int i15 = this.f165277h;
        int iF = i15 - this.f165271b.f(qVar, i15, false);
        this.f165277h = iF;
        boolean z15 = iF == 0;
        if (z15) {
            if (this.f165276g > 0) {
                this.f165271b.c(f(), l() ? 1 : 0, this.f165276g, 0, null);
            }
            a();
        }
        return z15;
    }

    public void n(int i15) {
        this.f165276g = i15;
        this.f165277h = i15;
    }

    public void o(long j15) {
        if (this.f165280k == 0) {
            this.f165278i = 0;
        } else {
            this.f165278i = this.f165283n[o0.g(this.f165282m, j15, true, true)];
        }
    }
}
