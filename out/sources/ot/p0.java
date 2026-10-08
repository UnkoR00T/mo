package ot;

import st.p2;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f149838a = new p0();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f149840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f149841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f149842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f149843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f149844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f149845g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f149846h;

        static {
            int[] iArr = new int[us.l.values().length];
            try {
                iArr[us.l.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[us.l.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[us.l.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[us.l.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f149839a = iArr;
            int[] iArr2 = new int[vr.f0.values().length];
            try {
                iArr2[vr.f0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[vr.f0.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[vr.f0.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[vr.f0.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f149840b = iArr2;
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
            f149841c = iArr3;
            int[] iArr4 = new int[us.c.EnumC5226c.values().length];
            try {
                iArr4[us.c.EnumC5226c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[us.c.EnumC5226c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[us.c.EnumC5226c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[us.c.EnumC5226c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[us.c.EnumC5226c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[us.c.EnumC5226c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[us.c.EnumC5226c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f149842d = iArr4;
            int[] iArr5 = new int[vr.f.values().length];
            try {
                iArr5[vr.f.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[vr.f.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[vr.f.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[vr.f.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[vr.f.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[vr.f.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f149843e = iArr5;
            int[] iArr6 = new int[us.t.c.values().length];
            try {
                iArr6[us.t.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[us.t.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[us.t.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f149844f = iArr6;
            int[] iArr7 = new int[us.r.b.c.values().length];
            try {
                iArr7[us.r.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[us.r.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[us.r.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[us.r.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f149845g = iArr7;
            int[] iArr8 = new int[p2.values().length];
            try {
                iArr8[p2.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[p2.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[p2.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f149846h = iArr8;
        }
    }

    private p0() {
    }

    public final vr.f a(us.c.EnumC5226c enumC5226c) {
        switch (enumC5226c == null ? -1 : a.f149842d[enumC5226c.ordinal()]) {
            case 1:
                return vr.f.CLASS;
            case 2:
                return vr.f.INTERFACE;
            case 3:
                return vr.f.ENUM_CLASS;
            case 4:
                return vr.f.ENUM_ENTRY;
            case 5:
                return vr.f.ANNOTATION_CLASS;
            case 6:
            case 7:
                return vr.f.OBJECT;
            default:
                return vr.f.CLASS;
        }
    }

    public final vr.f0 b(us.l lVar) {
        int i15 = lVar == null ? -1 : a.f149839a[lVar.ordinal()];
        if (i15 == 1) {
            return vr.f0.FINAL;
        }
        if (i15 == 2) {
            return vr.f0.OPEN;
        }
        if (i15 != 3) {
            return i15 != 4 ? vr.f0.FINAL : vr.f0.SEALED;
        }
        return vr.f0.ABSTRACT;
    }

    public final p2 c(us.r.b.c cVar) {
        int i15 = a.f149845g[cVar.ordinal()];
        if (i15 == 1) {
            return p2.IN_VARIANCE;
        }
        if (i15 == 2) {
            return p2.OUT_VARIANCE;
        }
        if (i15 == 3) {
            return p2.INVARIANT;
        }
        if (i15 != 4) {
            throw new oq.p();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + cVar);
    }

    public final p2 d(us.t.c cVar) {
        int i15 = a.f149844f[cVar.ordinal()];
        if (i15 == 1) {
            return p2.IN_VARIANCE;
        }
        if (i15 == 2) {
            return p2.OUT_VARIANCE;
        }
        if (i15 == 3) {
            return p2.INVARIANT;
        }
        throw new oq.p();
    }
}
