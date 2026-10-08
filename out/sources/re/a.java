package re;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ie.k;
import ie.n;
import ie.q;
import ie.s;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import re.a;
import zd.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private boolean A;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f173282a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f173286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f173287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f173288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f173289h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f173294n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f173296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f173297r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f173301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Resources.Theme f173302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f173303y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f173304z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f173283b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private be.j f173284c = be.j.f18726e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.g f173285d = com.bumptech.glide.g.NORMAL;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f173290j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f173291k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f173292l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private zd.f f173293m = ue.c.c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f173295p = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private zd.h f173298s = new zd.h();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map<Class<?>, l<?>> f173299t = new ve.b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Class<?> f173300v = Object.class;
    private boolean B = true;

    private boolean S(int i15) {
        return T(this.f173282a, i15);
    }

    private static boolean T(int i15, int i16) {
        return (i15 & i16) != 0;
    }

    private T f0(n nVar, l<Bitmap> lVar) {
        return (T) k0(nVar, lVar, false);
    }

    private T k0(n nVar, l<Bitmap> lVar, boolean z15) {
        T t15 = z15 ? (T) s0(nVar, lVar) : (T) g0(nVar, lVar);
        t15.B = true;
        return t15;
    }

    private T l0() {
        return this;
    }

    public final com.bumptech.glide.g A() {
        return this.f173285d;
    }

    public final Class<?> D() {
        return this.f173300v;
    }

    public final zd.f F() {
        return this.f173293m;
    }

    public final float G() {
        return this.f173283b;
    }

    public final Resources.Theme H() {
        return this.f173302x;
    }

    public final Map<Class<?>, l<?>> I() {
        return this.f173299t;
    }

    public final boolean J() {
        return this.C;
    }

    public final boolean K() {
        return this.f173304z;
    }

    protected final boolean N() {
        return this.f173303y;
    }

    public final boolean O(a<?> aVar) {
        return Float.compare(aVar.f173283b, this.f173283b) == 0 && this.f173287f == aVar.f173287f && ve.l.d(this.f173286e, aVar.f173286e) && this.f173289h == aVar.f173289h && ve.l.d(this.f173288g, aVar.f173288g) && this.f173297r == aVar.f173297r && ve.l.d(this.f173296q, aVar.f173296q) && this.f173290j == aVar.f173290j && this.f173291k == aVar.f173291k && this.f173292l == aVar.f173292l && this.f173294n == aVar.f173294n && this.f173295p == aVar.f173295p && this.f173304z == aVar.f173304z && this.A == aVar.A && this.f173284c.equals(aVar.f173284c) && this.f173285d == aVar.f173285d && this.f173298s.equals(aVar.f173298s) && this.f173299t.equals(aVar.f173299t) && this.f173300v.equals(aVar.f173300v) && ve.l.d(this.f173293m, aVar.f173293m) && ve.l.d(this.f173302x, aVar.f173302x);
    }

    public final boolean P() {
        return this.f173290j;
    }

    public final boolean Q() {
        return S(8);
    }

    boolean R() {
        return this.B;
    }

    public final boolean U() {
        return this.f173295p;
    }

    public final boolean W() {
        return this.f173294n;
    }

    public final boolean X() {
        return S(2048);
    }

    public final boolean Y() {
        return ve.l.t(this.f173292l, this.f173291k);
    }

    public T a0() {
        this.f173301w = true;
        return (T) l0();
    }

    public T b(a<?> aVar) {
        if (this.f173303y) {
            return (T) clone().b(aVar);
        }
        if (T(aVar.f173282a, 2)) {
            this.f173283b = aVar.f173283b;
        }
        if (T(aVar.f173282a, PKIFailureInfo.transactionIdInUse)) {
            this.f173304z = aVar.f173304z;
        }
        if (T(aVar.f173282a, PKIFailureInfo.badCertTemplate)) {
            this.C = aVar.C;
        }
        if (T(aVar.f173282a, 4)) {
            this.f173284c = aVar.f173284c;
        }
        if (T(aVar.f173282a, 8)) {
            this.f173285d = aVar.f173285d;
        }
        if (T(aVar.f173282a, 16)) {
            this.f173286e = aVar.f173286e;
            this.f173287f = 0;
            this.f173282a &= -33;
        }
        if (T(aVar.f173282a, 32)) {
            this.f173287f = aVar.f173287f;
            this.f173286e = null;
            this.f173282a &= -17;
        }
        if (T(aVar.f173282a, 64)) {
            this.f173288g = aVar.f173288g;
            this.f173289h = 0;
            this.f173282a &= -129;
        }
        if (T(aVar.f173282a, 128)) {
            this.f173289h = aVar.f173289h;
            this.f173288g = null;
            this.f173282a &= -65;
        }
        if (T(aVar.f173282a, 256)) {
            this.f173290j = aVar.f173290j;
        }
        if (T(aVar.f173282a, 512)) {
            this.f173292l = aVar.f173292l;
            this.f173291k = aVar.f173291k;
        }
        if (T(aVar.f173282a, 1024)) {
            this.f173293m = aVar.f173293m;
        }
        if (T(aVar.f173282a, PKIFailureInfo.certConfirmed)) {
            this.f173300v = aVar.f173300v;
        }
        if (T(aVar.f173282a, PKIFailureInfo.certRevoked)) {
            this.f173296q = aVar.f173296q;
            this.f173297r = 0;
            this.f173282a &= -16385;
        }
        if (T(aVar.f173282a, 16384)) {
            this.f173297r = aVar.f173297r;
            this.f173296q = null;
            this.f173282a &= -8193;
        }
        if (T(aVar.f173282a, 32768)) {
            this.f173302x = aVar.f173302x;
        }
        if (T(aVar.f173282a, PKIFailureInfo.notAuthorized)) {
            this.f173295p = aVar.f173295p;
        }
        if (T(aVar.f173282a, PKIFailureInfo.unsupportedVersion)) {
            this.f173294n = aVar.f173294n;
        }
        if (T(aVar.f173282a, 2048)) {
            this.f173299t.putAll(aVar.f173299t);
            this.B = aVar.B;
        }
        if (T(aVar.f173282a, PKIFailureInfo.signerNotTrusted)) {
            this.A = aVar.A;
        }
        if (!this.f173295p) {
            this.f173299t.clear();
            int i15 = this.f173282a;
            this.f173294n = false;
            this.f173282a = i15 & (-133121);
            this.B = true;
        }
        this.f173282a |= aVar.f173282a;
        this.f173298s.d(aVar.f173298s);
        return (T) m0();
    }

    public T c() {
        if (this.f173301w && !this.f173303y) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f173303y = true;
        return (T) a0();
    }

    public T c0() {
        return (T) g0(n.f91913e, new ie.j());
    }

    public T d0() {
        return (T) f0(n.f91912d, new k());
    }

    public T e() {
        return (T) s0(n.f91912d, new ie.l());
    }

    public T e0() {
        return (T) f0(n.f91911c, new s());
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return O((a) obj);
        }
        return false;
    }

    @Override // 
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t15 = (T) super.clone();
            zd.h hVar = new zd.h();
            t15.f173298s = hVar;
            hVar.d(this.f173298s);
            ve.b bVar = new ve.b();
            t15.f173299t = bVar;
            bVar.putAll(this.f173299t);
            t15.f173301w = false;
            t15.f173303y = false;
            return t15;
        } catch (CloneNotSupportedException e15) {
            throw new RuntimeException(e15);
        }
    }

    final T g0(n nVar, l<Bitmap> lVar) {
        if (this.f173303y) {
            return (T) clone().g0(nVar, lVar);
        }
        m(nVar);
        return (T) v0(lVar, false);
    }

    public T h0(int i15, int i16) {
        if (this.f173303y) {
            return (T) clone().h0(i15, i16);
        }
        this.f173292l = i15;
        this.f173291k = i16;
        this.f173282a |= 512;
        return (T) m0();
    }

    public int hashCode() {
        return ve.l.o(this.f173302x, ve.l.o(this.f173293m, ve.l.o(this.f173300v, ve.l.o(this.f173299t, ve.l.o(this.f173298s, ve.l.o(this.f173285d, ve.l.o(this.f173284c, ve.l.p(this.A, ve.l.p(this.f173304z, ve.l.p(this.f173295p, ve.l.p(this.f173294n, ve.l.n(this.f173292l, ve.l.n(this.f173291k, ve.l.p(this.f173290j, ve.l.o(this.f173296q, ve.l.n(this.f173297r, ve.l.o(this.f173288g, ve.l.n(this.f173289h, ve.l.o(this.f173286e, ve.l.n(this.f173287f, ve.l.l(this.f173283b)))))))))))))))))))));
    }

    public T i(Class<?> cls) {
        if (this.f173303y) {
            return (T) clone().i(cls);
        }
        this.f173300v = (Class) ve.k.d(cls);
        this.f173282a |= PKIFailureInfo.certConfirmed;
        return (T) m0();
    }

    public T i0(com.bumptech.glide.g gVar) {
        if (this.f173303y) {
            return (T) clone().i0(gVar);
        }
        this.f173285d = (com.bumptech.glide.g) ve.k.d(gVar);
        this.f173282a |= 8;
        return (T) m0();
    }

    public T j(be.j jVar) {
        if (this.f173303y) {
            return (T) clone().j(jVar);
        }
        this.f173284c = (be.j) ve.k.d(jVar);
        this.f173282a |= 4;
        return (T) m0();
    }

    T j0(zd.g<?> gVar) {
        if (this.f173303y) {
            return (T) clone().j0(gVar);
        }
        this.f173298s.e(gVar);
        return (T) m0();
    }

    public T l() {
        return (T) n0(me.i.f125945b, Boolean.TRUE);
    }

    public T m(n nVar) {
        return (T) n0(n.f91916h, ve.k.d(nVar));
    }

    protected final T m0() {
        if (this.f173301w) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) l0();
    }

    public final be.j n() {
        return this.f173284c;
    }

    public <Y> T n0(zd.g<Y> gVar, Y y15) {
        if (this.f173303y) {
            return (T) clone().n0(gVar, y15);
        }
        ve.k.d(gVar);
        ve.k.d(y15);
        this.f173298s.f(gVar, y15);
        return (T) m0();
    }

    public final int o() {
        return this.f173287f;
    }

    public T o0(zd.f fVar) {
        if (this.f173303y) {
            return (T) clone().o0(fVar);
        }
        this.f173293m = (zd.f) ve.k.d(fVar);
        this.f173282a |= 1024;
        return (T) m0();
    }

    public final Drawable p() {
        return this.f173286e;
    }

    public T p0(float f15) {
        if (this.f173303y) {
            return (T) clone().p0(f15);
        }
        if (f15 < 0.0f || f15 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f173283b = f15;
        this.f173282a |= 2;
        return (T) m0();
    }

    public final Drawable q() {
        return this.f173296q;
    }

    public T q0(boolean z15) {
        if (this.f173303y) {
            return (T) clone().q0(true);
        }
        this.f173290j = !z15;
        this.f173282a |= 256;
        return (T) m0();
    }

    public T r0(Resources.Theme theme) {
        if (this.f173303y) {
            return (T) clone().r0(theme);
        }
        this.f173302x = theme;
        if (theme != null) {
            this.f173282a |= 32768;
            return (T) n0(ke.g.f110242b, theme);
        }
        this.f173282a &= -32769;
        return (T) j0(ke.g.f110242b);
    }

    public final int s() {
        return this.f173297r;
    }

    final T s0(n nVar, l<Bitmap> lVar) {
        if (this.f173303y) {
            return (T) clone().s0(nVar, lVar);
        }
        m(nVar);
        return (T) u0(lVar);
    }

    public final boolean t() {
        return this.A;
    }

    <Y> T t0(Class<Y> cls, l<Y> lVar, boolean z15) {
        if (this.f173303y) {
            return (T) clone().t0(cls, lVar, z15);
        }
        ve.k.d(cls);
        ve.k.d(lVar);
        this.f173299t.put(cls, lVar);
        int i15 = this.f173282a;
        this.f173295p = true;
        this.f173282a = 67584 | i15;
        this.B = false;
        if (z15) {
            this.f173282a = i15 | 198656;
            this.f173294n = true;
        }
        return (T) m0();
    }

    public T u0(l<Bitmap> lVar) {
        return (T) v0(lVar, true);
    }

    public final zd.h v() {
        return this.f173298s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    T v0(l<Bitmap> lVar, boolean z15) {
        if (this.f173303y) {
            return (T) clone().v0(lVar, z15);
        }
        q qVar = new q(lVar, z15);
        t0(Bitmap.class, lVar, z15);
        t0(Drawable.class, qVar, z15);
        t0(BitmapDrawable.class, qVar.c(), z15);
        t0(me.c.class, new me.f(lVar), z15);
        return (T) m0();
    }

    public final int w() {
        return this.f173291k;
    }

    public T w0(boolean z15) {
        if (this.f173303y) {
            return (T) clone().w0(z15);
        }
        this.C = z15;
        this.f173282a |= PKIFailureInfo.badCertTemplate;
        return (T) m0();
    }

    public final int x() {
        return this.f173292l;
    }

    public final Drawable y() {
        return this.f173288g;
    }

    public final int z() {
        return this.f173289h;
    }
}
