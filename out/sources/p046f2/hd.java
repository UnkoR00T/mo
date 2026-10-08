package p046f2;

import c5.h;
import er.p;
import f3.m;
import p036e4.q;
import p036e4.w2;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001c"}, d2 = {"Lf3/m;", "i", "(Lf3/m;)Lf3/m;", "Le4/q;", "a", "Le4/q;", "h", "()Le4/q;", "MinimumInteractiveTopAlignmentLine", "Le4/w2;", "b", "Le4/w2;", "g", "()Le4/w2;", "MinimumInteractiveLeftAlignmentLine", "Lm2/b4;", "", "c", "Lm2/b4;", "e", "()Lm2/b4;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumInteractiveComponentEnforcement", "Lc5/h;", "d", "f", "LocalMinimumInteractiveComponentSize", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f56086a = new q(b.f56091j);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w2 f56087b = new w2(a.f56090j);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b4<Boolean> f56088c = d0.j(new er.a() { // from class: f2.fd
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(hd.c());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b4<h> f56089d = d0.j(new er.a() { // from class: f2.gd
        @Override // er.a
        public final Object a() {
            return hd.d();
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f56090j = new a();

        a() {
            super(2, hr.a.class, "min", "min(II)I", 1);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Integer B(Integer num, Integer num2) {
            return E(num.intValue(), num2.intValue());
        }

        public final Integer E(int i15, int i16) {
            return Integer.valueOf(Math.min(i15, i16));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f56091j = new b();

        b() {
            super(2, hr.a.class, "min", "min(II)I", 1);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Integer B(Integer num, Integer num2) {
            return E(num.intValue(), num2.intValue());
        }

        public final Integer E(int i15, int i16) {
            return Integer.valueOf(Math.min(i15, i16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h d() {
        return h.j(h.n(48));
    }

    public static final b4<Boolean> e() {
        return f56088c;
    }

    public static final b4<h> f() {
        return f56089d;
    }

    public static final w2 g() {
        return f56087b;
    }

    public static final q h() {
        return f56086a;
    }

    public static final m i(m mVar) {
        return mVar.u(me.f56877d);
    }
}
