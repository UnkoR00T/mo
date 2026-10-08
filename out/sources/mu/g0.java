package mu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ju.i1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010 \n\u0002\b\u0013\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u0011B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010$\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J-\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b/\u0010\u0016J\u0017\u00100\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u0010\u0016J\u000f\u00101\u001a\u00020\u0017H\u0002¢\u0006\u0004\b1\u0010(J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u001aH\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b6\u00107J9\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001e2\u0010\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001e2\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0001\u0010;J\u0018\u0010<\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b<\u0010\u0019J\u0017\u0010?\u001a\u00020\u00172\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J/\u0010E\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u001aH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0017H\u0002¢\u0006\u0004\bG\u0010(J\u0019\u0010I\u001a\u0004\u0018\u00010\u00052\u0006\u0010H\u001a\u00020\u0003H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u0003H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u0004\u0018\u00010\u00052\u0006\u0010M\u001a\u00020\u001aH\u0002¢\u0006\u0004\bN\u0010OJ\u0018\u0010P\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bP\u0010QJ3\u0010S\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001e2\u0014\u0010R\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f0\u001eH\u0002¢\u0006\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010<R\u0016\u0010_\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010<R\u0016\u0010a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010VR\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010k\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bj\u0010(\u001a\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u001cR\u0014\u0010p\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010oR\u0014\u0010t\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u001cR\u0014\u0010v\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u001c¨\u0006w"}, d2 = {"Lmu/g0;", "T", "Lnu/b;", "Lmu/i0;", "Lmu/a0;", "", "Lnu/r;", "", "replay", "bufferCapacity", "Llu/a;", "onBufferOverflow", "<init>", "(IILlu/a;)V", "Lmu/h;", "collector", "", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "value", "", "f", "(Ljava/lang/Object;)Z", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "", "a0", "()J", "oldIndex", "", "Ltq/e;", "Z", "(J)[Ltq/e;", "E", "()Lmu/i0;", "size", "G", "(I)[Lmu/i0;", "u", "()V", "Ltq/i;", "context", "capacity", "Lmu/g;", "b", "(Ltq/i;ILlu/a;)Lmu/g;", "U", "V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "newHead", ip.a.f96138c, "(J)V", "item", "K", "(Ljava/lang/Object;)V", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "J", "Lmu/g0$a;", "emitter", "A", "(Lmu/g0$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "Y", "(JJJJ)V", "B", "slot", "X", "(Lmu/i0;)Ljava/lang/Object;", "W", "(Lmu/i0;)J", "index", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(J)Ljava/lang/Object;", "z", "(Lmu/i0;Ltq/e;)Ljava/lang/Object;", "resumesIn", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "([Ltq/e;)[Ltq/e;", "e", "I", "g", "Llu/a;", "h", "[Ljava/lang/Object;", "buffer", "j", "replayIndex", "k", "minCollectorIndex", "l", "bufferSize", "m", "queueSize", "", "c", "()Ljava/util/List;", "replayCache", "O", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "N", "head", "R", "()I", "replaySize", ip.a.f96137b, "totalSize", "M", "bufferEndIndex", "Q", "queueEndIndex", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g0<T> extends p086nu.b<i0> implements a0<T>, g, p086nu.r<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int replay;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int bufferCapacity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final lu.a onBufferOverflow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Object[] buffer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long replayIndex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long minCollectorIndex;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int bufferSize;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int queueSize;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmu/g0$a;", "Lju/i1;", "Lmu/g0;", "flow", "", "index", "", "value", "Ltq/e;", "Loq/i0;", "cont", "<init>", "(Lmu/g0;JLjava/lang/Object;Ltq/e;)V", "j", "()V", "a", "Lmu/g0;", "b", "J", "c", "Ljava/lang/Object;", "d", "Ltq/e;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final g0<?> flow;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public long index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final Object value;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final tq.e<oq.i0> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g0<?> g0Var, long j15, Object obj, tq.e<? super oq.i0> eVar) {
            this.flow = g0Var;
            this.index = j15;
            this.value = obj;
            this.cont = eVar;
        }

        @Override // ju.i1
        public void j() {
            this.flow.A(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128198a;

        static {
            int[] iArr = new int[lu.a.values().length];
            try {
                iArr[lu.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lu.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lu.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128198a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f128201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f128202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f128203h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ g0<T> f128204j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f128205k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g0<T> g0Var, tq.e<? super c> eVar) {
            super(eVar);
            this.f128204j = g0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128203h = obj;
            this.f128205k |= PKIFailureInfo.systemUnavail;
            return g0.C(this.f128204j, null, this);
        }
    }

    public g0(int i15, int i16, lu.a aVar) {
        this.replay = i15;
        this.bufferCapacity = i16;
        this.onBufferOverflow = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(a emitter) {
        synchronized (this) {
            if (emitter.index < N()) {
                return;
            }
            Object[] objArr = this.buffer;
            if (h0.f(objArr, emitter.index) != emitter) {
                return;
            }
            h0.g(objArr, emitter.index, h0.f128206a);
            B();
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    private final void B() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            while (this.queueSize > 0 && h0.f(objArr, (N() + ((long) S())) - 1) == h0.f128206a) {
                this.queueSize--;
                h0.g(objArr, N() + ((long) S()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((mu.t0) r9).a(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <T> java.lang.Object C(mu.g0<T> r8, mu.h<? super T> r9, tq.e<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.g0.C(mu.g0, mu.h, tq.e):java.lang.Object");
    }

    private final void D(long newHead) {
        p086nu.d[] dVarArr;
        if (((p086nu.b) this).nCollectors != 0 && (dVarArr = ((p086nu.b) this).slots) != null) {
            for (p086nu.d dVar : dVarArr) {
                if (dVar != null) {
                    i0 i0Var = (i0) dVar;
                    long j15 = i0Var.index;
                    if (j15 >= 0 && j15 < newHead) {
                        i0Var.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    private final void H() {
        h0.g(this.buffer, N(), null);
        this.bufferSize--;
        long jN = N() + 1;
        if (this.replayIndex < jN) {
            this.replayIndex = jN;
        }
        if (this.minCollectorIndex < jN) {
            D(jN);
        }
    }

    static /* synthetic */ <T> Object I(g0<T> g0Var, T t15, tq.e<? super oq.i0> eVar) {
        Object objJ;
        return (!g0Var.f(t15) && (objJ = g0Var.J(t15, eVar)) == uq.b.e()) ? objJ : oq.i0.f148189a;
    }

    private final Object J(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
        Throwable th4;
        tq.e<oq.i0>[] eVarArrL;
        a aVar;
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        tq.e<oq.i0>[] eVarArrL2 = p086nu.c.f138701a;
        synchronized (this) {
            try {
                if (U(t15)) {
                    try {
                        oq.t.Companion companion = oq.t.INSTANCE;
                        pVar.i(oq.t.b(oq.i0.f148189a));
                        eVarArrL = L(eVarArrL2);
                        aVar = null;
                    } catch (Throwable th5) {
                        th4 = th5;
                        throw th4;
                    }
                } else {
                    try {
                        aVar = new a(this, N() + ((long) S()), t15, pVar);
                        K(aVar);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            eVarArrL2 = L(eVarArrL2);
                        }
                        eVarArrL = eVarArrL2;
                    } catch (Throwable th6) {
                        th = th6;
                        th4 = th;
                        throw th4;
                    }
                }
                if (aVar != null) {
                    ju.r.a(pVar, aVar);
                }
                for (tq.e<oq.i0> eVar2 : eVarArrL) {
                    if (eVar2 != null) {
                        oq.t.Companion companion2 = oq.t.INSTANCE;
                        eVar2.i(oq.t.b(oq.i0.f148189a));
                    }
                }
                Object objX = pVar.x();
                if (objX == uq.b.e()) {
                    vq.g.c(eVar);
                }
                return objX == uq.b.e() ? objX : oq.i0.f148189a;
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Object item) {
        int iS = S();
        Object[] objArrT = this.buffer;
        if (objArrT == null) {
            objArrT = T(null, 0, 2);
        } else if (iS >= objArrT.length) {
            objArrT = T(objArrT, iS, objArrT.length * 2);
        }
        h0.g(objArrT, N() + ((long) iS), item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [tq.e<oq.i0>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final tq.e<oq.i0>[] L(tq.e<oq.i0>[] resumesIn) {
        p086nu.d[] dVarArr;
        i0 i0Var;
        tq.e<? super oq.i0> eVar;
        int length = resumesIn.length;
        if (((p086nu.b) this).nCollectors != 0 && (dVarArr = ((p086nu.b) this).slots) != null) {
            int length2 = dVarArr.length;
            int i15 = 0;
            while (i15 < length2) {
                p086nu.d dVar = dVarArr[i15];
                if (dVar == null || (eVar = (i0Var = (i0) dVar).cont) == null || W(i0Var) < 0) {
                    resumesIn = resumesIn;
                } else {
                    if (length >= resumesIn.length) {
                        resumesIn = resumesIn;
                        resumesIn = resumesIn;
                        resumesIn = Arrays.copyOf((Object[]) resumesIn, Math.max(2, resumesIn.length * 2));
                    }
                    resumesIn = resumesIn;
                    resumesIn = resumesIn;
                    ((tq.e[]) resumesIn)[length] = eVar;
                    i0Var.cont = null;
                    length++;
                }
                i15++;
                resumesIn = resumesIn;
            }
            resumesIn = resumesIn;
        }
        return (tq.e[]) resumesIn;
    }

    private final long M() {
        return N() + ((long) this.bufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long N() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object P(long index) {
        Object objF = h0.f(this.buffer, index);
        return objF instanceof a ? ((a) objF).value : objF;
    }

    private final long Q() {
        return N() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    private final int R() {
        return (int) ((N() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] T(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long jN = N();
            for (int i15 = 0; i15 < curSize; i15++) {
                long j15 = ((long) i15) + jN;
                h0.g(objArr, j15, h0.f(curBuffer, j15));
            }
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U(T value) {
        if (getNCollectors() == 0) {
            return V(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i15 = b.f128198a[this.onBufferOverflow.ordinal()];
            if (i15 == 1) {
                return false;
            }
            if (i15 == 2) {
                return true;
            }
            if (i15 != 3) {
                throw new oq.p();
            }
        }
        K(value);
        int i16 = this.bufferSize + 1;
        this.bufferSize = i16;
        if (i16 > this.bufferCapacity) {
            H();
        }
        if (R() > this.replay) {
            Y(this.replayIndex + 1, this.minCollectorIndex, M(), Q());
        }
        return true;
    }

    private final boolean V(T value) {
        if (this.replay == 0) {
            return true;
        }
        K(value);
        int i15 = this.bufferSize + 1;
        this.bufferSize = i15;
        if (i15 > this.replay) {
            H();
        }
        this.minCollectorIndex = N() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long W(i0 slot) {
        long j15 = slot.index;
        if (j15 >= M() && (this.bufferCapacity > 0 || j15 > N() || this.queueSize == 0)) {
            return -1L;
        }
        return j15;
    }

    private final Object X(i0 slot) {
        Object obj;
        tq.e<oq.i0>[] eVarArrZ = p086nu.c.f138701a;
        synchronized (this) {
            try {
                long jW = W(slot);
                if (jW < 0) {
                    obj = h0.f128206a;
                } else {
                    long j15 = slot.index;
                    Object objP = P(jW);
                    slot.index = jW + 1;
                    eVarArrZ = Z(j15);
                    obj = objP;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        for (tq.e<oq.i0> eVar : eVarArrZ) {
            if (eVar != null) {
                oq.t.Companion companion = oq.t.INSTANCE;
                eVar.i(oq.t.b(oq.i0.f148189a));
            }
        }
        return obj;
    }

    private final void Y(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long jN = N(); jN < jMin; jN++) {
            h0.g(this.buffer, jN, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    private final Object z(i0 i0Var, tq.e<? super oq.i0> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        synchronized (this) {
            try {
                if (W(i0Var) < 0) {
                    i0Var.cont = pVar;
                } else {
                    oq.t.Companion companion = oq.t.INSTANCE;
                    pVar.i(oq.t.b(oq.i0.f148189a));
                }
                oq.i0 i0Var2 = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX == uq.b.e() ? objX : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p086nu.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public i0 h() {
        return new i0();
    }

    @Override // mu.a0, mu.h
    public Object F(T t15, tq.e<? super oq.i0> eVar) {
        return I(this, t15, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p086nu.b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public i0[] i(int size) {
        return new i0[size];
    }

    protected final T O() {
        return (T) h0.f(this.buffer, (this.replayIndex + ((long) R())) - 1);
    }

    public final tq.e<oq.i0>[] Z(long oldIndex) {
        long j15;
        long j16;
        long j17;
        p086nu.d[] dVarArr;
        if (oldIndex > this.minCollectorIndex) {
            return p086nu.c.f138701a;
        }
        long jN = N();
        long j18 = ((long) this.bufferSize) + jN;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j18++;
        }
        if (((p086nu.b) this).nCollectors != 0 && (dVarArr = ((p086nu.b) this).slots) != null) {
            for (p086nu.d dVar : dVarArr) {
                if (dVar != null) {
                    long j19 = ((i0) dVar).index;
                    if (j19 >= 0 && j19 < j18) {
                        j18 = j19;
                    }
                }
            }
        }
        if (j18 <= this.minCollectorIndex) {
            return p086nu.c.f138701a;
        }
        long jM = M();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (jM - j18))) : this.queueSize;
        tq.e<oq.i0>[] eVarArr = p086nu.c.f138701a;
        long j25 = ((long) this.queueSize) + jM;
        if (iMin > 0) {
            eVarArr = new tq.e[iMin];
            Object[] objArr = this.buffer;
            j17 = 1;
            long j26 = jM;
            int i15 = 0;
            while (true) {
                if (jM >= j25) {
                    j15 = jN;
                    j16 = j18;
                    jM = j26;
                    break;
                }
                Object objF = h0.f(objArr, jM);
                j15 = jN;
                ou.e0 e0Var = h0.f128206a;
                if (objF != e0Var) {
                    a aVar = (a) objF;
                    int i16 = i15 + 1;
                    j16 = j18;
                    eVarArr[i15] = aVar.cont;
                    h0.g(objArr, jM, e0Var);
                    h0.g(objArr, j26, aVar.value);
                    long j27 = j26 + 1;
                    if (i16 >= iMin) {
                        jM = j27;
                        break;
                    }
                    i15 = i16;
                    j26 = j27;
                } else {
                    j16 = j18;
                }
                jM++;
                jN = j15;
                j18 = j16;
            }
        } else {
            j15 = jN;
            j16 = j18;
            j17 = 1;
        }
        tq.e<oq.i0>[] eVarArr2 = eVarArr;
        int i17 = (int) (jM - j15);
        long j28 = getNCollectors() == 0 ? jM : j16;
        long jMax = Math.max(this.replayIndex, jM - ((long) Math.min(this.replay, i17)));
        if (this.bufferCapacity == 0 && jMax < j25 && fr.t.c(h0.f(this.buffer, jMax), h0.f128206a)) {
            jM += j17;
            jMax += j17;
        }
        Y(jMax, j28, jM, j25);
        B();
        return !(eVarArr2.length == 0) ? L(eVarArr2) : eVarArr2;
    }

    @Override // mu.f0, mu.g
    public Object a(h<? super T> hVar, tq.e<?> eVar) {
        return C(this, hVar, eVar);
    }

    public final long a0() {
        long j15 = this.replayIndex;
        if (j15 < this.minCollectorIndex) {
            this.minCollectorIndex = j15;
        }
        return j15;
    }

    @Override // p086nu.r
    public g<T> b(tq.i context, int capacity, lu.a onBufferOverflow) {
        return h0.e(this, context, capacity, onBufferOverflow);
    }

    @Override // mu.f0
    public List<T> c() {
        synchronized (this) {
            int iR = R();
            if (iR == 0) {
                return pq.v.n();
            }
            ArrayList arrayList = new ArrayList(iR);
            Object[] objArr = this.buffer;
            for (int i15 = 0; i15 < iR; i15++) {
                arrayList.add(h0.f(objArr, this.replayIndex + ((long) i15)));
            }
            return arrayList;
        }
    }

    @Override // mu.a0
    public boolean f(T value) {
        int i15;
        boolean z15;
        tq.e<oq.i0>[] eVarArrL = p086nu.c.f138701a;
        synchronized (this) {
            if (U(value)) {
                eVarArrL = L(eVarArrL);
                z15 = true;
            } else {
                z15 = false;
            }
        }
        for (tq.e<oq.i0> eVar : eVarArrL) {
            if (eVar != null) {
                oq.t.Companion companion = oq.t.INSTANCE;
                eVar.i(oq.t.b(oq.i0.f148189a));
            }
        }
        return z15;
    }

    @Override // mu.a0
    public void u() throws Throwable {
        synchronized (this) {
            try {
                try {
                    Y(M(), this.minCollectorIndex, M(), Q());
                    oq.i0 i0Var = oq.i0.f148189a;
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }
}
