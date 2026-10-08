package ws;

import us.l;
import us.y;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static final C5702b A;
    public static final C5702b B;
    public static final C5702b C;
    public static final C5702b D;
    public static final C5702b E;
    public static final C5702b F;
    public static final C5702b G;
    public static final C5702b H;
    public static final C5702b I;
    public static final C5702b J;
    public static final C5702b K;
    public static final C5702b L;
    public static final C5702b M;
    public static final C5702b N;
    public static final C5702b O;
    public static final C5702b P;
    public static final C5702b Q;
    public static final C5702b R;
    public static final C5702b S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5702b f214719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5702b f214720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5702b f214721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d<y> f214722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d<l> f214723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d<us.c.EnumC5226c> f214724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5702b f214725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5702b f214726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5702b f214727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C5702b f214728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5702b f214729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5702b f214730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5702b f214731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5702b f214732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5702b f214733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5702b f214734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d<us.k> f214735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C5702b f214736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5702b f214737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C5702b f214738t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C5702b f214739u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C5702b f214740v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C5702b f214741w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C5702b f214742x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C5702b f214743y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C5702b f214744z;

    /* JADX INFO: renamed from: ws.b$b, reason: collision with other inner class name */
    public static class C5702b extends d<Boolean> {
        public C5702b(int i15) {
            super(i15, 1);
        }

        @Override // ws.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i15) {
            return Boolean.valueOf((i15 & (1 << this.f214746a)) != 0);
        }

        @Override // ws.b.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f214746a;
            }
            return 0;
        }
    }

    private static class c<E extends bt.j.a> extends d<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final E[] f214745c;

        public c(int i15, E[] eArr) {
            super(i15, g(eArr));
            this.f214745c = eArr;
        }

        private static /* synthetic */ void f(int i15) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static <E> int g(E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i15 = 31; i15 >= 0; i15--) {
                if (((1 << i15) & length) != 0) {
                    return i15 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // ws.b.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i15) {
            int i16 = (1 << this.f214747b) - 1;
            int i17 = this.f214746a;
            int i18 = (i15 & (i16 << i17)) >> i17;
            for (E e15 : this.f214745c) {
                if (e15.h() == i18) {
                    return e15;
                }
            }
            return null;
        }

        @Override // ws.b.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e15) {
            return e15.h() << this.f214746a;
        }
    }

    public static abstract class d<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f214746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f214747b;

        /* JADX WARN: Incorrect types in method signature: <E::Lbt/j$a;>(Lws/b$d<*>;[TE;)Lws/b$d<TE;>; */
        public static d a(d dVar, bt.j.a[] aVarArr) {
            return new c(dVar.f214746a + dVar.f214747b, aVarArr);
        }

        public static C5702b b(d<?> dVar) {
            return new C5702b(dVar.f214746a + dVar.f214747b);
        }

        public static C5702b c() {
            return new C5702b(0);
        }

        public abstract E d(int i15);

        public abstract int e(E e15);

        private d(int i15, int i16) {
            this.f214746a = i15;
            this.f214747b = i16;
        }
    }

    static {
        C5702b c5702bC = d.c();
        f214719a = c5702bC;
        f214720b = d.b(c5702bC);
        C5702b c5702bC2 = d.c();
        f214721c = c5702bC2;
        d<y> dVarA = d.a(c5702bC2, y.values());
        f214722d = dVarA;
        d<l> dVarA2 = d.a(dVarA, l.values());
        f214723e = dVarA2;
        d<us.c.EnumC5226c> dVarA3 = d.a(dVarA2, us.c.EnumC5226c.values());
        f214724f = dVarA3;
        C5702b c5702bB = d.b(dVarA3);
        f214725g = c5702bB;
        C5702b c5702bB2 = d.b(c5702bB);
        f214726h = c5702bB2;
        C5702b c5702bB3 = d.b(c5702bB2);
        f214727i = c5702bB3;
        C5702b c5702bB4 = d.b(c5702bB3);
        f214728j = c5702bB4;
        C5702b c5702bB5 = d.b(c5702bB4);
        f214729k = c5702bB5;
        C5702b c5702bB6 = d.b(c5702bB5);
        f214730l = c5702bB6;
        f214731m = d.b(c5702bB6);
        C5702b c5702bB7 = d.b(dVarA);
        f214732n = c5702bB7;
        C5702b c5702bB8 = d.b(c5702bB7);
        f214733o = c5702bB8;
        f214734p = d.b(c5702bB8);
        d<us.k> dVarA4 = d.a(dVarA2, us.k.values());
        f214735q = dVarA4;
        C5702b c5702bB9 = d.b(dVarA4);
        f214736r = c5702bB9;
        C5702b c5702bB10 = d.b(c5702bB9);
        f214737s = c5702bB10;
        C5702b c5702bB11 = d.b(c5702bB10);
        f214738t = c5702bB11;
        C5702b c5702bB12 = d.b(c5702bB11);
        f214739u = c5702bB12;
        C5702b c5702bB13 = d.b(c5702bB12);
        f214740v = c5702bB13;
        C5702b c5702bB14 = d.b(c5702bB13);
        f214741w = c5702bB14;
        C5702b c5702bB15 = d.b(c5702bB14);
        f214742x = c5702bB15;
        C5702b c5702bB16 = d.b(c5702bB15);
        f214743y = c5702bB16;
        f214744z = d.b(c5702bB16);
        C5702b c5702bB17 = d.b(dVarA4);
        A = c5702bB17;
        C5702b c5702bB18 = d.b(c5702bB17);
        B = c5702bB18;
        C5702b c5702bB19 = d.b(c5702bB18);
        C = c5702bB19;
        C5702b c5702bB20 = d.b(c5702bB19);
        D = c5702bB20;
        C5702b c5702bB21 = d.b(c5702bB20);
        E = c5702bB21;
        C5702b c5702bB22 = d.b(c5702bB21);
        F = c5702bB22;
        C5702b c5702bB23 = d.b(c5702bB22);
        G = c5702bB23;
        C5702b c5702bB24 = d.b(c5702bB23);
        H = c5702bB24;
        C5702b c5702bB25 = d.b(c5702bB24);
        I = c5702bB25;
        J = d.b(c5702bB25);
        C5702b c5702bB26 = d.b(c5702bC2);
        K = c5702bB26;
        C5702b c5702bB27 = d.b(c5702bB26);
        L = c5702bB27;
        M = d.b(c5702bB27);
        C5702b c5702bB28 = d.b(dVarA2);
        N = c5702bB28;
        C5702b c5702bB29 = d.b(c5702bB28);
        O = c5702bB29;
        P = d.b(c5702bB29);
        C5702b c5702bC3 = d.c();
        Q = c5702bC3;
        R = d.b(c5702bC3);
        S = d.c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    private static /* synthetic */ void a(int i15) {
        Object[] objArr = new Object[3];
        if (i15 == 1) {
            objArr[0] = "modality";
        } else if (i15 == 2) {
            objArr[0] = "kind";
        } else if (i15 == 5) {
            objArr[0] = "modality";
        } else if (i15 == 6) {
            objArr[0] = "memberKind";
        } else if (i15 == 8) {
            objArr[0] = "modality";
        } else if (i15 == 9) {
            objArr[0] = "memberKind";
        } else if (i15 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i15) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int b(boolean z15, y yVar, l lVar, boolean z16, boolean z17, boolean z18) {
        if (yVar == null) {
            a(10);
        }
        if (lVar == null) {
            a(11);
        }
        return f214721c.e(Boolean.valueOf(z15)) | f214723e.e(lVar) | f214722d.e(yVar) | N.e(Boolean.valueOf(z16)) | O.e(Boolean.valueOf(z17)) | P.e(Boolean.valueOf(z18));
    }
}
