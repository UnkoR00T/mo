package l5;

/* JADX INFO: loaded from: classes.dex */
public class c extends k5.e {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private k5.g.c f116028q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f116029r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private n5.a f116030s0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116031a;

        static {
            int[] iArr = new int[k5.g.c.values().length];
            f116031a = iArr;
            try {
                iArr[k5.g.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116031a[k5.g.c.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116031a[k5.g.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116031a[k5.g.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116031a[k5.g.c.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116031a[k5.g.c.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(k5.g gVar) {
        super(gVar, k5.g.d.BARRIER);
    }

    @Override // k5.a
    public k5.a J(int i15) {
        this.f116029r0 = i15;
        return this;
    }

    @Override // k5.a
    public k5.a K(Object obj) {
        J(this.f108487m0.e(obj));
        return this;
    }

    @Override // k5.e, k5.a, k5.f
    public void apply() {
        u0();
        int i15 = a.f116031a[this.f116028q0.ordinal()];
        int i16 = 3;
        if (i15 == 3 || i15 == 4) {
            i16 = 1;
        } else if (i15 == 5) {
            i16 = 2;
        } else if (i15 != 6) {
            i16 = 0;
        }
        this.f116030s0.D1(i16);
        this.f116030s0.E1(this.f116029r0);
    }

    @Override // k5.e
    public n5.j u0() {
        if (this.f116030s0 == null) {
            this.f116030s0 = new n5.a();
        }
        return this.f116030s0;
    }

    public void w0(k5.g.c cVar) {
        this.f116028q0 = cVar;
    }
}
