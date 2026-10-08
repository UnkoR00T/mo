package ur;

import fr.h0;
import fr.q0;
import java.util.List;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends sr.j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f200068k = {q0.j(new h0(k.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f200069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private er.a<b> f200070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rt.i f200071j;

    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f200076e = wq.b.a(b());
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i0 f200077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f200078b;

        public b(i0 i0Var, boolean z15) {
            this.f200077a = i0Var;
            this.f200078b = z15;
        }

        public final i0 a() {
            return this.f200077a;
        }

        public final boolean b() {
            return this.f200078b;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200079a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f200079a = iArr;
        }
    }

    public k(rt.n nVar, a aVar) {
        super(nVar);
        this.f200069h = aVar;
        this.f200071j = nVar.d(new h(this, nVar));
        int i15 = c.f200079a[aVar.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                f(false);
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u J0(k kVar, rt.n nVar) {
        return new u(kVar.s(), nVar, new j(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b K0(k kVar) {
        er.a<b> aVar = kVar.f200070i;
        if (aVar == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVarA = aVar.a();
        kVar.f200070i = null;
        return bVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b O0(i0 i0Var, boolean z15) {
        return new b(i0Var, z15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sr.j
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List<xr.b> w() {
        return pq.v.K0(super.w(), new g(V(), s(), null, 4, null));
    }

    public final u M0() {
        return (u) rt.m.a(this.f200071j, this, f200068k[0]);
    }

    @Override // sr.j
    protected xr.c N() {
        return M0();
    }

    public final void N0(i0 i0Var, boolean z15) {
        P0(new i(i0Var, z15));
    }

    public final void P0(er.a<b> aVar) {
        this.f200070i = aVar;
    }

    @Override // sr.j
    protected xr.a g() {
        return M0();
    }
}
