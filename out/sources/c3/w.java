package c3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\"\u0010#\u001a)\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,\u001a/\u0010/\u001a\u00020\u00132\n\u0010-\u001a\u00060\u0000j\u0002`\u00012\n\u0010.\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u00100\u001a+\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u0002012\n\u0010*\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u00104\u001a7\u00107\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u00002\n\u00106\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010;\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a\u000f\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0019\u0010@\u001a\u0004\u0018\u0001012\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0017\u0010B\u001a\u00020\u00132\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bB\u0010C\u001a\u000f\u0010D\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010'\u001a\u0017\u0010E\u001a\u00020\t2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0001¢\u0006\u0004\bG\u0010H\u001a5\u0010J\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\f2\u0006\u0010I\u001a\u00028\u0000H\u0000¢\u0006\u0004\bJ\u0010K\u001a-\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010H\u001a-\u0010L\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010H\u001a%\u0010M\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000201*\u00028\u00002\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\bM\u0010<\u001a\u001f\u0010N\u001a\u00020\t2\u0006\u0010*\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\bN\u0010O\u001a9\u0010U\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0018\u00010T2\n\u0010P\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u0003H\u0002¢\u0006\u0004\bU\u0010V\u001a\u000f\u0010W\u001a\u00020=H\u0002¢\u0006\u0004\bW\u0010?\u001a)\u0010X\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\fH\u0001¢\u0006\u0004\bX\u0010Y\u001a!\u0010Z\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002012\u0006\u00105\u001a\u00028\u0000H\u0001¢\u0006\u0004\bZ\u0010[\u001a+\u0010^\u001a\u00020\u0003*\u00020\u00032\n\u0010\\\u001a\u00060\u0000j\u0002`\u00012\n\u0010]\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b^\u0010_\" \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a\"\u0018\u0010d\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010X\"\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g\"$\u0010o\u001a\u00060\u0011j\u0002`i8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bj\u0010k\u0012\u0004\bn\u0010'\u001a\u0004\bl\u0010m\"\u0016\u0010r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010q\"\u001a\u0010t\u001a\u00060\u0000j\u0002`\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010X\"\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w\"\u001a\u0010|\u001a\b\u0012\u0004\u0012\u0002090y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{\"7\u0010\u0082\u0001\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u007f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0~0}8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001\"+\u0010\u0084\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00100}8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001\"\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001\"%\u0010\u008b\u0001\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u0012\u0005\b\u008a\u0001\u0010'\u001a\u0005\b\u0089\u0001\u0010\u000e\"\u001a\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0090\u0001"}, d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lc3/q;", "invalid", "", "i0", "(JLc3/q;)I", "handle", "Loq/i0;", "d0", "(I)V", "Lc3/l;", "K", "()Lc3/l;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "G", "(Lc3/l;Ler/l;Z)Lc3/l;", "parentObserver", "mergeReadObserver", "N", "(Ler/l;Ler/l;Z)Ler/l;", "writeObserver", "Q", "(Ler/l;Ler/l;)Ler/l;", "T", "Lc3/b;", "globalSnapshot", "block", "f0", "(Lc3/b;Ler/l;)Ljava/lang/Object;", ip.a.f96138c, "(Ler/l;)Ljava/lang/Object;", "E", "()V", "g0", "(Ler/l;)Lc3/l;", "snapshot", "m0", "(Lc3/l;)V", "currentSnapshot", "candidateSnapshot", "k0", "(JJLc3/q;)Z", "Lc3/w0;", "data", "l0", "(Lc3/w0;JLc3/q;)Z", "r", "id", "b0", "(Lc3/w0;JLc3/q;)Lc3/w0;", "Lc3/u0;", "state", "c0", "(Lc3/w0;Lc3/u0;)Lc3/w0;", "", "a0", "()Ljava/lang/Void;", "j0", "(Lc3/u0;)Lc3/w0;", "Y", "(Lc3/u0;)Z", "F", "Z", "(Lc3/u0;)V", "n0", "(Lc3/w0;Lc3/u0;Lc3/l;)Lc3/w0;", "candidate", "X", "(Lc3/w0;Lc3/u0;Lc3/l;Lc3/w0;)Lc3/w0;", "U", ip.a.f96137b, "V", "(Lc3/l;Lc3/u0;)V", "currentSnapshotId", "Lc3/d;", "applyingSnapshot", "invalidSnapshots", "", "W", "(JLc3/d;Lc3/q;)Ljava/util/Map;", "e0", "J", "(Lc3/w0;Lc3/l;)Lc3/w0;", "I", "(Lc3/w0;)Lc3/w0;", "from", "until", "C", "(Lc3/q;JJ)Lc3/q;", "a", "Ler/l;", "emptyLambda", "b", "INVALID_SNAPSHOT", "Ly2/v;", "c", "Ly2/v;", "threadSnapshot", "Landroidx/compose/runtime/platform/SynchronizedObject;", "d", "Ljava/lang/Object;", "M", "()Ljava/lang/Object;", "getLock$annotations", "lock", "e", "Lc3/q;", "openSnapshots", "f", "nextSnapshotId", "Lc3/o;", "g", "Lc3/o;", "pinningTable", "Lc3/n0;", "h", "Lc3/n0;", "extraStateObjects", "", "Lkotlin/Function2;", "", "i", "Ljava/util/List;", "applyObservers", "j", "globalWriteObservers", "k", "Lc3/b;", "l", "Lc3/l;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "snapshotInitializer", "Ly2/c;", "m", "Ly2/c;", "pendingApplyObserverCount", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f22908b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static q f22911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f22912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o f22913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final n0<u0> f22914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static List<? extends er.p<? super Set<? extends Object>, ? super l, oq.i0>> f22915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static List<? extends er.l<Object, oq.i0>> f22916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final b f22917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final l f22918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static y2.c f22919m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final er.l<q, oq.i0> f22907a = new er.l() { // from class: c3.t
        @Override // er.l
        public final Object b(Object obj) {
            return w.L((q) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y2.v<l> f22909c = new y2.v<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f22910d = new Object();

    static {
        q.Companion aVar = q.INSTANCE;
        f22911e = aVar.a();
        long j15 = 1;
        f22912f = r.c(1) + j15;
        f22913g = new o();
        f22914h = new n0<>();
        f22915i = pq.v.n();
        f22916j = pq.v.n();
        long j16 = f22912f;
        f22912f = j15 + j16;
        b bVar = new b(j16, aVar.a());
        f22911e = f22911e.s(bVar.getSnapshotId());
        f22917k = bVar;
        f22918l = bVar;
        f22919m = new y2.c(0);
    }

    public static final q C(q qVar, long j15, long j16) {
        while (fr.t.e(j15, j16) < 0) {
            qVar = qVar.s(j15);
            j15 += (long) 1;
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca A[Catch: all -> 0x00c0, LOOP:2: B:42:0x0090->B:54:0x00ca, LOOP_END, TryCatch #0 {all -> 0x00c0, blocks: (B:37:0x0081, B:39:0x0086, B:42:0x0090, B:44:0x00a0, B:46:0x00ac, B:48:0x00b5, B:51:0x00c2, B:54:0x00ca, B:55:0x00cd), top: B:62:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd A[EDGE_INSN: B:72:0x00cd->B:55:0x00cd BREAK  A[LOOP:2: B:42:0x0090->B:54:0x00ca], SYNTHETIC] */
    public static final <T> T D(er.l<? super q, ? extends T> lVar) {
        r0.u0<u0> u0VarE;
        T t15;
        b bVar = f22917k;
        synchronized (M()) {
            try {
                u0VarE = bVar.E();
                if (u0VarE != null) {
                    f22919m.a(1);
                }
                t15 = (T) f0(bVar, lVar);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (u0VarE != null) {
            try {
                List<? extends er.p<? super Set<? extends Object>, ? super l, oq.i0>> list = f22915i;
                Set setA = n2.f.a(u0VarE);
                if (e3.g.isVerboseTracingEnabled) {
                    Object objA = y2.b0.f223360a.a("Compose:applyObservers");
                    try {
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            list.get(i15).B(setA, bVar);
                        }
                        oq.i0 i0Var = oq.i0.f148189a;
                        y2.b0.f223360a.b(objA);
                    } catch (Throwable th5) {
                        y2.b0.f223360a.b(objA);
                        throw th5;
                    }
                } else {
                    int size2 = list.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        list.get(i16).B(setA, bVar);
                    }
                }
                f22919m.a(-1);
            } catch (Throwable th6) {
                f22919m.a(-1);
                throw th6;
            }
        }
        synchronized (M()) {
            try {
                F();
                if (u0VarE != null) {
                    Object[] objArr = u0VarE.elements;
                    long[] jArr = u0VarE.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j15 = jArr[i17];
                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i17 != length) {
                                    break;
                                    break;
                                }
                                i17++;
                            } else {
                                int i18 = 8 - ((~(i17 - length)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((255 & j15) < 128) {
                                        Z((u0) objArr[(i17 << 3) + i19]);
                                    }
                                    j15 >>= 8;
                                }
                                if (i18 != 8) {
                                    break;
                                }
                                if (i17 != length) {
                                    break;
                                }
                                i17++;
                            }
                        }
                    }
                    oq.i0 i0Var2 = oq.i0.f148189a;
                }
            } catch (Throwable th7) {
                throw th7;
            }
        }
        return t15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E() {
        D(f22907a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F() {
        n0<u0> n0Var = f22914h;
        int iE = n0Var.getSize();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= iE) {
                break;
            }
            y2.d0<u0> d0Var = n0Var.f()[i15];
            u0 u0Var = d0Var != null ? d0Var.get() : null;
            if (u0Var != null && Y(u0Var)) {
                if (i16 != i15) {
                    n0Var.f()[i16] = d0Var;
                    n0Var.getHashes()[i16] = n0Var.getHashes()[i15];
                }
                i16++;
            }
            i15++;
        }
        for (int i17 = i16; i17 < iE; i17++) {
            n0Var.f()[i17] = null;
            n0Var.getHashes()[i17] = 0;
        }
        if (i16 != iE) {
            n0Var.g(i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l G(l lVar, er.l<Object, oq.i0> lVar2, boolean z15) {
        boolean z16 = lVar instanceof d;
        if (z16 || lVar == null) {
            return new y0(z16 ? (d) lVar : null, lVar2, null, false, z15);
        }
        return new z0(lVar, lVar2, false, z15);
    }

    static /* synthetic */ l H(l lVar, er.l lVar2, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            lVar2 = null;
        }
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        return G(lVar, lVar2, z15);
    }

    public static final <T extends w0> T I(T t15) {
        T t16;
        l.Companion companion = l.INSTANCE;
        l lVarC = companion.c();
        T t17 = (T) b0(t15, lVarC.getSnapshotId(), lVarC.getInvalid());
        if (t17 != null) {
            return t17;
        }
        synchronized (M()) {
            l lVarC2 = companion.c();
            t16 = (T) b0(t15, lVarC2.getSnapshotId(), lVarC2.getInvalid());
        }
        if (t16 != null) {
            return t16;
        }
        a0();
        throw new oq.g();
    }

    public static final <T extends w0> T J(T t15, l lVar) {
        T t16;
        T t17 = (T) b0(t15, lVar.getSnapshotId(), lVar.getInvalid());
        if (t17 != null) {
            return t17;
        }
        synchronized (M()) {
            t16 = (T) b0(t15, lVar.getSnapshotId(), lVar.getInvalid());
        }
        if (t16 != null) {
            return t16;
        }
        a0();
        throw new oq.g();
    }

    public static final l K() {
        l lVarA = f22909c.a();
        return lVarA == null ? f22917k : lVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(q qVar) {
        return oq.i0.f148189a;
    }

    public static final Object M() {
        return f22910d;
    }

    public static final er.l<Object, oq.i0> N(final er.l<Object, oq.i0> lVar, final er.l<Object, oq.i0> lVar2, boolean z15) {
        if (!z15) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new er.l() { // from class: c3.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.P(lVar, lVar2, obj);
            }
        };
    }

    public static /* synthetic */ er.l O(er.l lVar, er.l lVar2, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        return N(lVar, lVar2, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(er.l lVar, er.l lVar2, Object obj) {
        lVar.b(obj);
        lVar2.b(obj);
        return oq.i0.f148189a;
    }

    public static final er.l<Object, oq.i0> Q(final er.l<Object, oq.i0> lVar, final er.l<Object, oq.i0> lVar2) {
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new er.l() { // from class: c3.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.R(lVar, lVar2, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(er.l lVar, er.l lVar2, Object obj) {
        lVar.b(obj);
        lVar2.b(obj);
        return oq.i0.f148189a;
    }

    public static final <T extends w0> T S(T t15, u0 u0Var) {
        T t16 = (T) j0(u0Var);
        if (t16 != null) {
            t16.i(Long.MAX_VALUE);
            return t16;
        }
        T t17 = (T) t15.e(Long.MAX_VALUE);
        t17.h(u0Var.getFirstStateRecord());
        u0Var.l(t17);
        return t17;
    }

    public static final <T extends w0> T T(T t15, u0 u0Var, l lVar) {
        T t16;
        synchronized (M()) {
            t16 = (T) U(t15, u0Var, lVar);
        }
        return t16;
    }

    private static final <T extends w0> T U(T t15, u0 u0Var, l lVar) {
        T t16 = (T) S(t15, u0Var);
        t16.c(t15);
        t16.i(lVar.getSnapshotId());
        return t16;
    }

    public static final void V(l lVar, u0 u0Var) {
        lVar.w(lVar.getWriteCount() + 1);
        er.l<Object, oq.i0> lVarK = lVar.k();
        if (lVarK != null) {
            lVarK.b(u0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<w0, w0> W(long j15, d dVar, q qVar) {
        long[] jArr;
        Map<w0, w0> map;
        q qVar2;
        Object[] objArr;
        int i15;
        long[] jArr2;
        Map<w0, w0> map2;
        Object[] objArr2;
        int i16;
        int i17;
        r0.u0<u0> u0VarE = dVar.E();
        Map<w0, w0> map3 = null;
        if (u0VarE == null) {
            return null;
        }
        long snapshotId = dVar.getSnapshotId();
        q qVarQ = dVar.getInvalid().s(snapshotId).q(dVar.getPreviousIds());
        Object[] objArr3 = u0VarE.elements;
        long[] jArr3 = u0VarE.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i18 = 0;
        while (true) {
            long j16 = jArr3[i18];
            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i19 = 8;
                int i25 = 8 - ((~(i18 - length)) >>> 31);
                int i26 = 0;
                while (i26 < i25) {
                    if ((255 & j16) < 128) {
                        u0 u0Var = (u0) objArr3[(i18 << 3) + i26];
                        map2 = map3;
                        w0 w0VarK = u0Var.getFirstStateRecord();
                        jArr2 = jArr3;
                        i16 = i18;
                        i17 = i19;
                        w0 w0VarB0 = b0(w0VarK, j15, qVar);
                        if (w0VarB0 == null) {
                            objArr2 = objArr3;
                        } else {
                            objArr2 = objArr3;
                            w0 w0VarB1 = b0(w0VarK, snapshotId, qVarQ);
                            if (w0VarB1 != null && !fr.t.c(w0VarB0, w0VarB1)) {
                                w0 w0VarB2 = b0(w0VarK, snapshotId, dVar.getInvalid());
                                if (w0VarB2 == null) {
                                    a0();
                                    throw new oq.g();
                                }
                                w0 w0VarT = u0Var.t(w0VarB1, w0VarB0, w0VarB2);
                                if (w0VarT == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(w0VarB0, w0VarT);
                                map4 = map4;
                            }
                        }
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        objArr2 = objArr3;
                        i16 = i18;
                        i17 = i19;
                    }
                    j16 >>= i17;
                    i26++;
                    map3 = map2;
                    i18 = i16;
                    i19 = i17;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                    qVarQ = qVarQ;
                }
                jArr = jArr3;
                map = map3;
                qVar2 = qVarQ;
                objArr = objArr3;
                i15 = i18;
                if (i25 != i19) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                qVar2 = qVarQ;
                objArr = objArr3;
                i15 = i18;
            }
            int i27 = i15;
            if (i27 == length) {
                return map4;
            }
            i18 = i27 + 1;
            map3 = map;
            jArr3 = jArr;
            objArr3 = objArr;
            qVarQ = qVar2;
        }
    }

    public static final <T extends w0> T X(T t15, u0 u0Var, l lVar, T t16) {
        T t17;
        if (lVar.h()) {
            lVar.p(u0Var);
        }
        long snapshotId = lVar.getSnapshotId();
        if (t16.getSnapshotId() == snapshotId) {
            return t16;
        }
        synchronized (M()) {
            t17 = (T) S(t15, u0Var);
        }
        t17.i(snapshotId);
        if (t16.getSnapshotId() != r.c(1)) {
            lVar.p(u0Var);
        }
        return t17;
    }

    private static final boolean Y(u0 u0Var) {
        w0 w0Var;
        long jE = f22913g.e(f22912f);
        w0 w0Var2 = null;
        w0 w0VarK = null;
        int i15 = 0;
        for (w0 w0VarK2 = u0Var.getFirstStateRecord(); w0VarK2 != null; w0VarK2 = w0VarK2.getNext()) {
            long jG = w0VarK2.getSnapshotId();
            if (jG != f22908b) {
                if (fr.t.e(jG, jE) >= 0) {
                    i15++;
                } else if (w0Var2 == null) {
                    i15++;
                    w0Var2 = w0VarK2;
                } else {
                    if (fr.t.e(w0VarK2.getSnapshotId(), w0Var2.getSnapshotId()) < 0) {
                        w0Var = w0Var2;
                        w0Var2 = w0VarK2;
                    } else {
                        w0Var = w0VarK2;
                    }
                    if (w0VarK == null) {
                        w0VarK = u0Var.getFirstStateRecord();
                        w0 w0Var3 = w0VarK;
                        while (true) {
                            if (w0VarK == null) {
                                w0VarK = w0Var3;
                                break;
                            }
                            if (fr.t.e(w0VarK.getSnapshotId(), jE) >= 0) {
                                break;
                            }
                            if (fr.t.e(w0Var3.getSnapshotId(), w0VarK.getSnapshotId()) < 0) {
                                w0Var3 = w0VarK;
                            }
                            w0VarK = w0VarK.getNext();
                        }
                    }
                    w0Var2.i(f22908b);
                    w0Var2.c(w0VarK);
                    w0Var2 = w0Var;
                }
            }
        }
        return i15 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(u0 u0Var) {
        if (Y(u0Var)) {
            f22914h.a(u0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void a0() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends w0> T b0(T t15, long j15, q qVar) {
        T t16 = null;
        while (t15 != null) {
            if (l0(t15, j15, qVar) && (t16 == null || fr.t.e(t16.getSnapshotId(), t15.getSnapshotId()) < 0)) {
                t16 = t15;
            }
            t15 = (T) t15.getNext();
        }
        if (t16 != null) {
            return t16;
        }
        return null;
    }

    public static final <T extends w0> T c0(T t15, u0 u0Var) {
        T t16;
        l.Companion companion = l.INSTANCE;
        l lVarC = companion.c();
        er.l<Object, oq.i0> lVarG = lVarC.g();
        if (lVarG != null) {
            lVarG.b(u0Var);
        }
        T t17 = (T) b0(t15, lVarC.getSnapshotId(), lVarC.getInvalid());
        if (t17 != null) {
            return t17;
        }
        synchronized (M()) {
            l lVarC2 = companion.c();
            t16 = (T) b0(u0Var.getFirstStateRecord(), lVarC2.getSnapshotId(), lVarC2.getInvalid());
            if (t16 == null) {
                a0();
                throw new oq.g();
            }
        }
        return t16;
    }

    public static final void d0(int i15) {
        f22913g.f(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T f0(b bVar, er.l<? super q, ? extends T> lVar) {
        long snapshotId = bVar.getSnapshotId();
        T tB = lVar.b(f22911e.l(snapshotId));
        long j15 = f22912f;
        f22912f = ((long) 1) + j15;
        f22911e = f22911e.l(snapshotId);
        bVar.v(j15);
        bVar.u(f22911e);
        bVar.w(0);
        bVar.Q(null);
        bVar.q();
        f22911e = f22911e.s(j15);
        return tB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends l> T g0(final er.l<? super q, ? extends T> lVar) {
        return (T) D(new er.l() { // from class: c3.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.h0(lVar, (q) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l h0(er.l lVar, q qVar) {
        l lVar2 = (l) lVar.b(qVar);
        synchronized (M()) {
            f22911e = f22911e.s(lVar2.getSnapshotId());
            oq.i0 i0Var = oq.i0.f148189a;
        }
        return lVar2;
    }

    public static final int i0(long j15, q qVar) {
        int iA;
        long jO = qVar.o(j15);
        synchronized (M()) {
            iA = f22913g.a(jO);
        }
        return iA;
    }

    private static final w0 j0(u0 u0Var) {
        long jE = f22913g.e(f22912f) - ((long) 1);
        q qVarA = q.INSTANCE.a();
        w0 w0Var = null;
        for (w0 w0VarK = u0Var.getFirstStateRecord(); w0VarK != null; w0VarK = w0VarK.getNext()) {
            if (w0VarK.getSnapshotId() != f22908b) {
                if (l0(w0VarK, jE, qVarA)) {
                    if (w0Var == null) {
                        w0Var = w0VarK;
                    } else if (fr.t.e(w0VarK.getSnapshotId(), w0Var.getSnapshotId()) >= 0) {
                        return w0Var;
                    }
                }
            }
            return w0VarK;
        }
        return null;
    }

    private static final boolean k0(long j15, long j16, q qVar) {
        return (j16 == f22908b || fr.t.e(j16, j15) > 0 || qVar.n(j16)) ? false : true;
    }

    private static final boolean l0(w0 w0Var, long j15, q qVar) {
        return k0(j15, w0Var.getSnapshotId(), qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(l lVar) {
        long jE;
        if (f22911e.n(lVar.getSnapshotId())) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Snapshot is not open: snapshotId=");
        sb5.append(lVar.getSnapshotId());
        sb5.append(", disposed=");
        sb5.append(lVar.getDisposed());
        sb5.append(", applied=");
        d dVar = lVar instanceof d ? (d) lVar : null;
        sb5.append(dVar != null ? Boolean.valueOf(dVar.getApplied()) : "read-only");
        sb5.append(", lowestPin=");
        synchronized (M()) {
            jE = f22913g.e(-1L);
        }
        sb5.append(jE);
        throw new IllegalStateException(sb5.toString().toString());
    }

    public static final <T extends w0> T n0(T t15, u0 u0Var, l lVar) {
        T t16;
        if (lVar.h()) {
            lVar.p(u0Var);
        }
        long snapshotId = lVar.getSnapshotId();
        T t17 = (T) b0(t15, snapshotId, lVar.getInvalid());
        if (t17 == null) {
            a0();
            throw new oq.g();
        }
        if (t17.getSnapshotId() == lVar.getSnapshotId()) {
            return t17;
        }
        synchronized (M()) {
            t16 = (T) b0(u0Var.getFirstStateRecord(), snapshotId, lVar.getInvalid());
            if (t16 == null) {
                a0();
                throw new oq.g();
            }
            if (t16.getSnapshotId() != snapshotId) {
                t16 = (T) U(t16, u0Var, lVar);
            }
        }
        if (t17.getSnapshotId() != r.c(1)) {
            lVar.p(u0Var);
        }
        return t16;
    }
}
