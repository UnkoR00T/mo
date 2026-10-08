package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f149849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f149850c;

        static {
            int[] iArr = new int[us.k.values().length];
            try {
                iArr[us.k.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[us.k.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[us.k.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[us.k.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f149848a = iArr;
            int[] iArr2 = new int[vr.b.a.values().length];
            try {
                iArr2[vr.b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[vr.b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[vr.b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[vr.b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f149849b = iArr2;
            int[] iArr3 = new int[us.y.values().length];
            try {
                iArr3[us.y.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[us.y.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[us.y.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[us.y.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[us.y.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[us.y.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f149850c = iArr3;
        }
    }

    public static final vr.u a(p0 p0Var, us.y yVar) {
        switch (yVar == null ? -1 : a.f149850c[yVar.ordinal()]) {
            case 1:
                return vr.t.f208079d;
            case 2:
                return vr.t.f208076a;
            case 3:
                return vr.t.f208077b;
            case 4:
                return vr.t.f208078c;
            case 5:
                return vr.t.f208080e;
            case 6:
                return vr.t.f208081f;
            default:
                return vr.t.f208076a;
        }
    }

    public static final vr.b.a b(p0 p0Var, us.k kVar) {
        int i15 = kVar == null ? -1 : a.f149848a[kVar.ordinal()];
        if (i15 == 1) {
            return vr.b.a.DECLARATION;
        }
        if (i15 == 2) {
            return vr.b.a.FAKE_OVERRIDE;
        }
        if (i15 != 3) {
            return i15 != 4 ? vr.b.a.DECLARATION : vr.b.a.SYNTHESIZED;
        }
        return vr.b.a.DELEGATION;
    }
}
