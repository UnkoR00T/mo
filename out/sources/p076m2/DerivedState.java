package p076m2;

import c3.l;
import c3.u0;
import c3.v0;
import c3.w;
import c3.w0;
import fr.k;
import n2.c;
import oq.i0;
import p071kotlin.Metadata;
import r0.p0;
import r0.y0;
import r0.z0;
import y2.IntRef;
import y2.x;

/* JADX INFO: renamed from: m2.n0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001.B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lm2/n0;", "T", "Lc3/v0;", "Lm2/o0;", "Lkotlin/Function0;", "calculation", "Lm2/w5;", "policy", "<init>", "(Ler/a;Lm2/w5;)V", "Lm2/n0$a;", "readable", "Lc3/l;", "snapshot", "", "forceDependencyReads", "C", "(Lm2/n0$a;Lc3/l;ZLer/a;)Lm2/n0$a;", "", "E", "()Ljava/lang/String;", "B", "(Lc3/l;)Lm2/n0$a;", "Lc3/w0;", "value", "Loq/i0;", "l", "(Lc3/w0;)V", "toString", "b", "Ler/a;", "c", "Lm2/w5;", "()Lm2/w5;", "d", "Lm2/n0$a;", "first", "k", "()Lc3/w0;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "Lm2/o0$a;", "x", "()Lm2/o0$a;", "currentRecord", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DerivedState<T> extends v0 implements o0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<T> calculation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w5<T> policy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a<T> first = new a<>(w.K().getSnapshotId());

    /* JADX INFO: renamed from: m2.n0$a */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 <*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001:B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00182\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u001f\u001a\u00060\u0004j\u0002`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\"\u0010%\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u0014\u0010;\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00102¨\u0006="}, d2 = {"Lm2/n0$a;", "T", "Lc3/w0;", "Lm2/o0$a;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "value", "Loq/i0;", "c", "(Lc3/w0;)V", "d", "()Lc3/w0;", "e", "(J)Lc3/w0;", "Lm2/o0;", "derivedState", "Lc3/l;", "snapshot", "", "l", "(Lm2/o0;Lc3/l;)Z", "", "m", "(Lm2/o0;Lc3/l;)I", "J", "getValidSnapshotId", "()J", "q", "validSnapshotId", "I", "getValidSnapshotWriteCount", "()I", "r", "(I)V", "validSnapshotWriteCount", "Lr0/y0;", "Lc3/u0;", "Lr0/y0;", "b", "()Lr0/y0;", "n", "(Lr0/y0;)V", "dependencies", "", "f", "Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "result", "g", "getResultHash", "p", "resultHash", "a", "currentValue", "h", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends w0 implements o0.a<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f123013i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Object f123014j = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long validSnapshotId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int validSnapshotWriteCount;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private y0<u0> dependencies;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Object result;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int resultHash;

        /* JADX INFO: renamed from: m2.n0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm2/n0$a$a;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final Object a() {
                return a.f123014j;
            }

            private Companion() {
            }
        }

        public a(long j15) {
            super(j15);
            this.dependencies = z0.a();
            this.result = f123014j;
        }

        @Override // m2.o0.a
        public T a() {
            return (T) this.result;
        }

        @Override // m2.o0.a
        public y0<u0> b() {
            return this.dependencies;
        }

        @Override // c3.w0
        public void c(w0 value) {
            a aVar = (a) value;
            n(aVar.b());
            this.result = aVar.result;
            this.resultHash = aVar.resultHash;
        }

        @Override // c3.w0
        public w0 d() {
            return e(w.K().getSnapshotId());
        }

        @Override // c3.w0
        public w0 e(long snapshotId) {
            return new a(snapshotId);
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        public final boolean l(o0<?> derivedState, l snapshot) {
            boolean z15;
            boolean z16;
            synchronized (w.M()) {
                z15 = true;
                z16 = (this.validSnapshotId == snapshot.getSnapshotId() && this.validSnapshotWriteCount == snapshot.getWriteCount()) ? false : true;
            }
            if (this.result == f123014j || (z16 && this.resultHash != m(derivedState, snapshot))) {
                z15 = false;
            }
            if (!z15 || !z16) {
                return z15;
            }
            synchronized (w.M()) {
                this.validSnapshotId = snapshot.getSnapshotId();
                this.validSnapshotWriteCount = snapshot.getWriteCount();
                i0 i0Var = i0.f148189a;
            }
            return z15;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00db A[PHI: r12
          0x00db: PHI (r12v1 int) = (r12v0 int), (r12v2 int) binds: [B:29:0x00ac, B:39:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[Catch: all -> 0x00cf, LOOP:3: B:28:0x009f->B:43:0x00e1, LOOP_END, TryCatch #1 {all -> 0x00cf, blocks: (B:11:0x002c, B:14:0x0039, B:16:0x0048, B:18:0x0056, B:20:0x0060, B:49:0x011f, B:23:0x007f, B:25:0x0083, B:28:0x009f, B:30:0x00ae, B:32:0x00b8, B:34:0x00be, B:37:0x00d2, B:46:0x00fd, B:43:0x00e1, B:45:0x00eb, B:55:0x0142, B:59:0x0153), top: B:75:0x002c }] */
        /* JADX WARN: Code duplicated, block: B:62:0x015e A[DONT_GENERATE, LOOP:5: B:61:0x015c->B:62:0x015e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:83:0x00fd A[EDGE_INSN: B:83:0x00fd->B:46:0x00fd BREAK  A[LOOP:3: B:28:0x009f->B:43:0x00e1], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v10, types: [m2.n0$a] */
        /* JADX WARN: Type inference failed for: r7v8, types: [c3.w0] */
        /* JADX WARN: Type inference failed for: r7v9, types: [c3.w0, java.lang.Object] */
        public final int m(o0<?> derivedState, l snapshot) {
            y0<u0> y0VarB;
            int iA;
            long[] jArr;
            int i15;
            Object[] objArr;
            int[] iArr;
            long[] jArr2;
            int i16;
            Object[] objArr2;
            int[] iArr2;
            long j15;
            long j16;
            int i17;
            ?? J;
            synchronized (w.M()) {
                y0VarB = b();
            }
            int i18 = 7;
            if (!y0VarB.h()) {
                return 7;
            }
            c<p0> cVarC = x5.c();
            p0[] p0VarArr = cVarC.content;
            int size = cVarC.getSize();
            for (int i19 = 0; i19 < size; i19++) {
                p0VarArr[i19].b(derivedState);
            }
            try {
                Object[] objArr3 = y0VarB.keys;
                int[] iArr3 = y0VarB.values;
                long[] jArr3 = y0VarB.metadata;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    iA = 7;
                    int i25 = 0;
                    while (true) {
                        long j17 = jArr3[i25];
                        long j18 = -9187201950435737472L;
                        if ((((~j17) << i18) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i26 = 8;
                            int i27 = 8 - ((~(i25 - length)) >>> 31);
                            i15 = i18;
                            int i28 = 0;
                            while (i28 < i27) {
                                if ((j17 & 255) < 128) {
                                    int i29 = (i25 << 3) + i28;
                                    j16 = j18;
                                    u0 u0Var = (u0) objArr3[i29];
                                    int i35 = i26;
                                    if (iArr3[i29] != 1) {
                                        jArr2 = jArr3;
                                        i16 = i28;
                                        objArr2 = objArr3;
                                        iArr2 = iArr3;
                                        j15 = j17;
                                    } else {
                                        if (u0Var instanceof DerivedState) {
                                            J = ((DerivedState) u0Var).B(snapshot);
                                            y0<u0> y0VarB2 = J.b();
                                            Object[] objArr4 = y0VarB2.keys;
                                            long[] jArr4 = y0VarB2.metadata;
                                            jArr2 = jArr3;
                                            int length2 = jArr4.length - 2;
                                            i16 = i28;
                                            objArr2 = objArr3;
                                            iArr2 = iArr3;
                                            if (length2 >= 0) {
                                                int i36 = 0;
                                                while (true) {
                                                    long j19 = jArr4[i36];
                                                    j15 = j17;
                                                    int iA2 = iA;
                                                    if ((((~j19) << i15) & j19 & j16) == j16) {
                                                        iA = iA2;
                                                        if (i36 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i36++;
                                                        j17 = j15;
                                                        i35 = 8;
                                                    } else {
                                                        int i37 = 8 - ((~(i36 - length2)) >>> 31);
                                                        for (int i38 = 0; i38 < i37; i38++) {
                                                            if ((j19 & 255) < 128) {
                                                                iA2 = (iA2 * 31) + x.a((u0) objArr4[(i36 << 3) + i38]);
                                                            }
                                                            j19 >>= i35;
                                                        }
                                                        if (i37 != i35) {
                                                            iA = iA2;
                                                            break;
                                                        }
                                                        iA = iA2;
                                                        if (i36 != length2) {
                                                            break;
                                                        }
                                                        i36++;
                                                        j17 = j15;
                                                        i35 = 8;
                                                    }
                                                }
                                            } else {
                                                j15 = j17;
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            i16 = i28;
                                            objArr2 = objArr3;
                                            iArr2 = iArr3;
                                            j15 = j17;
                                            J = w.J(u0Var.getFirstStateRecord(), snapshot);
                                        }
                                        iA = (((iA * 31) + x.a(J)) * 31) + Long.hashCode(J.getSnapshotId());
                                    }
                                    i17 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i16 = i28;
                                    objArr2 = objArr3;
                                    iArr2 = iArr3;
                                    j15 = j17;
                                    j16 = j18;
                                    i17 = i26;
                                }
                                j17 = j15 >> i17;
                                i28 = i16 + 1;
                                i26 = i17;
                                jArr3 = jArr2;
                                j18 = j16;
                                objArr3 = objArr2;
                                iArr3 = iArr2;
                            }
                            jArr = jArr3;
                            objArr = objArr3;
                            iArr = iArr3;
                            if (i27 != i26) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            i15 = i18;
                            objArr = objArr3;
                            iArr = iArr3;
                        }
                        if (i25 != length) {
                            i25++;
                            i18 = i15;
                            jArr3 = jArr;
                            objArr3 = objArr;
                            iArr3 = iArr;
                        } else {
                            i18 = iA;
                        }
                    }
                    i0 i0Var = i0.f148189a;
                    return iA;
                }
                iA = i18;
                i0 i0Var2 = i0.f148189a;
                return iA;
            } finally {
                p0[] p0VarArr2 = cVarC.content;
                int size2 = cVarC.getSize();
                for (int i39 = 0; i39 < size2; i39++) {
                    p0VarArr2[i39].a(derivedState);
                }
            }
        }

        public void n(y0<u0> y0Var) {
            this.dependencies = y0Var;
        }

        public final void o(Object obj) {
            this.result = obj;
        }

        public final void p(int i15) {
            this.resultHash = i15;
        }

        public final void q(long j15) {
            this.validSnapshotId = j15;
        }

        public final void r(int i15) {
            this.validSnapshotWriteCount = i15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(er.a<? extends T> aVar, w5<T> w5Var) {
        this.calculation = aVar;
        this.policy = w5Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab A[Catch: all -> 0x0043, LOOP:1: B:16:0x0056->B:30:0x00ab, LOOP_END, TryCatch #2 {all -> 0x0043, blocks: (B:8:0x0026, B:10:0x0036, B:13:0x0046, B:16:0x0056, B:18:0x0069, B:20:0x0074, B:22:0x007e, B:24:0x0097, B:26:0x009d, B:30:0x00ab, B:31:0x00b1), top: B:87:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b1 A[EDGE_INSN: B:92:0x00b1->B:31:0x00b1 BREAK  A[LOOP:1: B:16:0x0056->B:30:0x00ab], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final a<T> C(a<T> readable, l snapshot, boolean forceDependencyReads, er.a<? extends T> calculation) {
        l.Companion companion;
        w5<T> w5VarC;
        int i15;
        a<T> aVar = readable;
        int i16 = 0;
        if (!aVar.l(this, snapshot)) {
            final p0 p0Var = new p0(0, 1, null);
            final IntRef intRef = (IntRef) y5.f123258a.a();
            if (intRef == null) {
                intRef = new IntRef(0);
                y5.f123258a.b(intRef);
            }
            final int element = intRef.getElement();
            c<p0> cVarC = x5.c();
            p0[] p0VarArr = cVarC.content;
            int size = cVarC.getSize();
            for (int i17 = 0; i17 < size; i17++) {
                p0VarArr[i17].b(this);
            }
            try {
                intRef.b(element + 1);
                Object objG = l.INSTANCE.g(new er.l() { // from class: m2.m0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return DerivedState.D(this.f123000a, intRef, p0Var, element, obj);
                    }
                }, null, calculation);
                intRef.b(element);
                p0[] p0VarArr2 = cVarC.content;
                int size2 = cVarC.getSize();
                for (int i18 = 0; i18 < size2; i18++) {
                    p0VarArr2[i18].a(this);
                }
                synchronized (w.M()) {
                    try {
                        companion = l.INSTANCE;
                        l lVarC = companion.c();
                        if (aVar.getResult() == a.INSTANCE.a() || (w5VarC = c()) == 0 || !w5VarC.b(objG, aVar.getResult())) {
                            aVar = (a) w.T(this.first, this, lVarC);
                            aVar.n(p0Var);
                            aVar.p(aVar.m(this, lVarC));
                            aVar.o(objG);
                        } else {
                            aVar.n(p0Var);
                            aVar.p(aVar.m(this, lVarC));
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                IntRef intRef2 = (IntRef) y5.f123258a.a();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return aVar;
                }
                companion.f();
                synchronized (w.M()) {
                    l lVarC2 = companion.c();
                    aVar.q(lVarC2.getSnapshotId());
                    aVar.r(lVarC2.getWriteCount());
                    i0 i0Var = i0.f148189a;
                }
                return aVar;
            } catch (Throwable th5) {
                p0[] p0VarArr3 = cVarC.content;
                int size3 = cVarC.getSize();
                for (int i19 = 0; i19 < size3; i19++) {
                    p0VarArr3[i19].a(this);
                }
                throw th5;
            }
        }
        if (forceDependencyReads) {
            c<p0> cVarC2 = x5.c();
            p0[] p0VarArr4 = cVarC2.content;
            int size4 = cVarC2.getSize();
            for (int i25 = 0; i25 < size4; i25++) {
                p0VarArr4[i25].b(this);
            }
            try {
                y0<u0> y0VarB = aVar.b();
                IntRef intRef3 = (IntRef) y5.f123258a.a();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    y5.f123258a.b(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = y0VarB.keys;
                int[] iArr = y0VarB.values;
                long[] jArr = y0VarB.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i26 = 0;
                    while (true) {
                        long j15 = jArr[i26];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i26 != length) {
                                break;
                                break;
                            }
                            i26++;
                            i16 = 0;
                        } else {
                            int i27 = 8;
                            int i28 = 8 - ((~(i26 - length)) >>> 31);
                            while (i16 < i28) {
                                if ((j15 & 255) < 128) {
                                    int i29 = (i26 << 3) + i16;
                                    i15 = i27;
                                    u0 u0Var = (u0) objArr[i29];
                                    intRef3.b(element2 + iArr[i29]);
                                    er.l<Object, i0> lVarG = snapshot.g();
                                    if (lVarG != null) {
                                        lVarG.b(u0Var);
                                    }
                                } else {
                                    i15 = i27;
                                }
                                j15 >>= i15;
                                i16++;
                                i27 = i15;
                            }
                            if (i28 != i27) {
                                break;
                            }
                            if (i26 != length) {
                                break;
                            }
                            i26++;
                            i16 = 0;
                        }
                    }
                }
                intRef3.b(element2);
                i0 i0Var2 = i0.f148189a;
            } finally {
                p0[] p0VarArr5 = cVarC2.content;
                int size5 = cVarC2.getSize();
                for (int i35 = 0; i35 < size5; i35++) {
                    p0VarArr5[i35].a(this);
                }
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(DerivedState derivedState, IntRef intRef, p0 p0Var, int i15, Object obj) {
        if (obj == derivedState) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof u0) {
            p0Var.u(obj, Math.min(intRef.getElement() - i15, p0Var.e(obj, Integer.MAX_VALUE)));
        }
        return i0.f148189a;
    }

    private final String E() {
        a aVar = (a) w.I(this.first);
        return aVar.l(this, l.INSTANCE.c()) ? String.valueOf(aVar.getResult()) : "<Not calculated>";
    }

    public final a<?> B(l snapshot) {
        return C((a) w.J(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // p076m2.o0
    public w5<T> c() {
        return this.policy;
    }

    @Override // p076m2.f6
    public T getValue() {
        l.Companion companion = l.INSTANCE;
        er.l<Object, i0> lVarG = companion.c().g();
        if (lVarG != null) {
            lVarG.b(this);
        }
        l lVarC = companion.c();
        return (T) C((a) w.J(this.first, lVarC), lVarC, true, this.calculation).getResult();
    }

    @Override // c3.u0
    /* JADX INFO: renamed from: k */
    public w0 getFirstStateRecord() {
        return this.first;
    }

    @Override // c3.u0
    public void l(w0 value) {
        this.first = (a) value;
    }

    public String toString() {
        return "DerivedState(value=" + E() + ")@" + hashCode();
    }

    @Override // p076m2.o0
    public o0.a<T> x() {
        l lVarC = l.INSTANCE.c();
        return C((a) w.J(this.first, lVarC), lVarC, false, this.calculation);
    }
}
