package v9;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final double[] f205072r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f205073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f205074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f205075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f205076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w7.c0 f205077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f205078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f205079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f205080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f205081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f205082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f205083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f205084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f205085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f205086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f205087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f205088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f205089q;

    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f205090e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f205091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f205092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f205093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f205094d;

        public a(int i15) {
            this.f205094d = new byte[i15];
        }

        public void a(byte[] bArr, int i15, int i16) {
            if (this.f205091a) {
                int i17 = i16 - i15;
                byte[] bArr2 = this.f205094d;
                int length = bArr2.length;
                int i18 = this.f205092b;
                if (length < i18 + i17) {
                    this.f205094d = Arrays.copyOf(bArr2, (i18 + i17) * 2);
                }
                System.arraycopy(bArr, i15, this.f205094d, this.f205092b, i17);
                this.f205092b += i17;
            }
        }

        public boolean b(int i15, int i16) {
            if (this.f205091a) {
                int i17 = this.f205092b - i16;
                this.f205092b = i17;
                if (this.f205093c != 0 || i15 != 181) {
                    this.f205091a = false;
                    return true;
                }
                this.f205093c = i17;
            } else if (i15 == 179) {
                this.f205091a = true;
            }
            byte[] bArr = f205090e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f205091a = false;
            this.f205092b = 0;
            this.f205093c = 0;
        }
    }

    public n(String str) {
        this(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    private static Pair<t7.p, Long> a(a aVar, String str, String str2) {
        float f15;
        int i15;
        float f16;
        int i16;
        long j15;
        double[] dArr;
        double d15;
        int i17;
        int i18;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f205094d, aVar.f205092b);
        int i19 = bArrCopyOf[4] & 255;
        byte b15 = bArrCopyOf[5];
        int i25 = (i19 << 4) | ((b15 & 255) >> 4);
        int i26 = ((b15 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i27 = (bArrCopyOf[7] & 240) >> 4;
        if (i27 == 2) {
            f15 = i26 * 4;
            i15 = i25 * 3;
        } else {
            if (i27 != 3) {
                if (i27 != 4) {
                    f16 = 1.0f;
                } else {
                    f15 = i26 * 121;
                    i15 = i25 * 100;
                }
                t7.p pVarQ = new t7.p.b().k0(str).X(str2).A0("video/mpeg2").F0(i25).i0(i26).v0(f16).l0(Collections.singletonList(bArrCopyOf)).Q();
                i16 = (bArrCopyOf[7] & 15) - 1;
                if (i16 >= 0) {
                    dArr = f205072r;
                    if (i16 < dArr.length) {
                        d15 = dArr[i16];
                        byte b16 = bArrCopyOf[aVar.f205093c + 9];
                        i17 = (b16 & 96) >> 5;
                        i18 = b16 & 31;
                        if (i17 != i18) {
                            d15 *= (((double) i17) + 1.0d) / ((double) (i18 + 1));
                        }
                        j15 = (long) (1000000.0d / d15);
                    } else {
                        j15 = 0;
                    }
                } else {
                    j15 = 0;
                }
                return Pair.create(pVarQ, Long.valueOf(j15));
            }
            f15 = i26 * 16;
            i15 = i25 * 9;
        }
        f16 = f15 / i15;
        t7.p pVarQ2 = new t7.p.b().k0(str).X(str2).A0("video/mpeg2").F0(i25).i0(i26).v0(f16).l0(Collections.singletonList(bArrCopyOf)).Q();
        i16 = (bArrCopyOf[7] & 15) - 1;
        if (i16 >= 0) {
            dArr = f205072r;
            if (i16 < dArr.length) {
                d15 = dArr[i16];
                byte b17 = bArrCopyOf[aVar.f205093c + 9];
                i17 = (b17 & 96) >> 5;
                i18 = b17 & 31;
                if (i17 != i18) {
                    d15 *= (((double) i17) + 1.0d) / ((double) (i18 + 1));
                }
                j15 = (long) (1000000.0d / d15);
            } else {
                j15 = 0;
            }
        } else {
            j15 = 0;
        }
        return Pair.create(pVarQ2, Long.valueOf(j15));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
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
    @Override // v9.m
    public void b(w7.c0 c0Var) {
        boolean z15;
        int i15;
        zj.p.q(this.f205074b);
        int iG = c0Var.g();
        int iJ = c0Var.j();
        byte[] bArrF = c0Var.f();
        this.f205081i += (long) c0Var.a();
        this.f205074b.a(c0Var, c0Var.a());
        while (true) {
            int iE = x7.g.e(bArrF, iG, iJ, this.f205079g);
            if (iE == iJ) {
                break;
            }
            int i16 = iE + 3;
            int i17 = c0Var.f()[i16] & 255;
            int i18 = iE - iG;
            if (!this.f205083k) {
                if (i18 > 0) {
                    this.f205080h.a(bArrF, iG, iE);
                }
                if (this.f205080h.b(i17, i18 < 0 ? -i18 : 0)) {
                    Pair<t7.p, Long> pairA = a(this.f205080h, (String) zj.p.q(this.f205073a), this.f205076d);
                    this.f205074b.e((t7.p) pairA.first);
                    this.f205084l = ((Long) pairA.second).longValue();
                    this.f205083k = true;
                }
            }
            w wVar = this.f205078f;
            if (wVar != null) {
                if (i18 > 0) {
                    wVar.a(bArrF, iG, iE);
                    i15 = 0;
                } else {
                    i15 = -i18;
                }
                if (this.f205078f.b(i15)) {
                    w wVar2 = this.f205078f;
                    ((w7.c0) w7.o0.h(this.f205077e)).d0(this.f205078f.f205282d, x7.g.M(wVar2.f205282d, wVar2.f205283e));
                    ((o0) w7.o0.h(this.f205075c)).b(this.f205087o, this.f205077e);
                }
                if (i17 == 178 && c0Var.f()[iE + 2] == 1) {
                    this.f205078f.e(i17);
                }
            }
            if (i17 == 0 || i17 == 179) {
                int i19 = iJ - iE;
                if (this.f205089q && this.f205083k) {
                    long j15 = this.f205087o;
                    if (j15 != -9223372036854775807L) {
                        this.f205074b.c(j15, this.f205088p ? 1 : 0, ((int) (this.f205081i - this.f205086n)) - i19, i19, null);
                    }
                }
                if (!this.f205082j || this.f205089q) {
                    this.f205086n = this.f205081i - ((long) i19);
                    long j16 = this.f205085m;
                    if (j16 == -9223372036854775807L) {
                        long j17 = this.f205087o;
                        j16 = j17 != -9223372036854775807L ? j17 + this.f205084l : -9223372036854775807L;
                    }
                    this.f205087o = j16;
                    this.f205088p = false;
                    this.f205085m = -9223372036854775807L;
                    z15 = true;
                    this.f205082j = true;
                } else {
                    z15 = true;
                }
                this.f205089q = i17 == 0 ? z15 : false;
            } else {
                if (i17 == 184) {
                    this.f205088p = true;
                }
                iJ = iJ;
            }
            iJ = iJ;
            iG = i16;
        }
        if (!this.f205083k) {
            this.f205080h.a(bArrF, iG, iJ);
        }
        w wVar3 = this.f205078f;
        if (wVar3 != null) {
            wVar3.a(bArrF, iG, iJ);
        }
    }

    @Override // v9.m
    public void c() {
        x7.g.c(this.f205079g);
        this.f205080h.c();
        w wVar = this.f205078f;
        if (wVar != null) {
            wVar.d();
        }
        this.f205081i = 0L;
        this.f205082j = false;
        this.f205085m = -9223372036854775807L;
        this.f205087o = -9223372036854775807L;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f205073a = dVar.b();
        this.f205074b = rVar.v(dVar.c(), 2);
        o0 o0Var = this.f205075c;
        if (o0Var != null) {
            o0Var.c(rVar, dVar);
        }
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
    @Override // v9.m
    public void e(boolean z15) {
        zj.p.q(this.f205074b);
        if (z15) {
            boolean z16 = this.f205088p;
            this.f205074b.c(this.f205087o, z16 ? 1 : 0, (int) (this.f205081i - this.f205086n), 0, null);
        }
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f205085m = j15;
    }

    n(o0 o0Var, String str) {
        this.f205075c = o0Var;
        this.f205076d = str;
        this.f205079g = new boolean[4];
        this.f205080h = new a(128);
        if (o0Var != null) {
            this.f205078f = new w(178, 128);
            this.f205077e = new w7.c0();
        } else {
            this.f205078f = null;
            this.f205077e = null;
        }
        this.f205085m = -9223372036854775807L;
        this.f205087o = -9223372036854775807L;
    }
}
