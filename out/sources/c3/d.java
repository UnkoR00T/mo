package c3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;
import p076m2.w3;
import r0.i1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u0019\b\u0017\u0018\u0000 >2\u00020\u0001:\u0001hBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ%\u0010\u001c\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\tH\u0010¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\tH\u0010¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\tH\u0010¢\u0006\u0004\b$\u0010\u000fJG\u0010-\u001a\u00020\u00182\n\u0010%\u001a\u00060\u0002j\u0002`\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0000¢\u0006\u0004\b/\u0010\u000fJ\u001b\u00101\u001a\u00020\t2\n\u00100\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\t2\u0006\u00100\u001a\u000203H\u0000¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0005H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020'H\u0010¢\u0006\u0004\b>\u0010?R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\"\u0010J\u001a\u0002038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0014\u001a\u0004\bG\u0010H\"\u0004\bI\u00105R*\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bG\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010V\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010\\\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010<R\"\u0010a\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u00109R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0014R\"\u0010f\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010b\u001a\u0004\bc\u0010\u0015\"\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0015¨\u0006i"}, d2 = {"Lc3/d;", "Lc3/l;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lc3/q;", "invalid", "Lkotlin/Function1;", "", "Loq/i0;", "readObserver", "writeObserver", "<init>", "(JLc3/q;Ler/l;Ler/l;)V", ip.a.f96137b, "()V", "T", "A", "O", "", "I", "()Z", "R", "(Ler/l;Ler/l;)Lc3/d;", "Lc3/n;", "C", "()Lc3/n;", "d", "x", "(Ler/l;)Lc3/l;", "snapshot", "m", "(Lc3/l;)V", "n", "o", "c", "r", "nextId", "Lr0/u0;", "Lc3/u0;", "modified", "", "Lc3/w0;", "optimisticMerges", "invalidSnapshots", "J", "(JLr0/u0;Ljava/util/Map;Lc3/q;)Lc3/n;", "B", "id", "K", "(J)V", "", "M", "(I)V", "", "handles", "N", "([I)V", "snapshots", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lc3/q;)V", "state", "p", "(Lc3/u0;)V", "g", "Ler/l;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Ler/l;", "h", "k", "i", "j", "()I", "w", "writeCount", "Lr0/u0;", "E", "()Lr0/u0;", "Q", "(Lr0/u0;)V", "", "Ljava/util/List;", "getMerged$runtime", "()Ljava/util/List;", "setMerged$runtime", "(Ljava/util/List;)V", "merged", "l", "Lc3/q;", "F", "()Lc3/q;", "setPreviousIds$runtime", "previousIds", "[I", "G", "()[I", "setPreviousPinnedSnapshots$runtime", "previousPinnedSnapshots", "Z", ip.a.f96138c, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Z)V", "applied", "readOnly", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d extends l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f22792p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f22793q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f22794r = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, oq.i0> readObserver;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, oq.i0> writeObserver;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int writeCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private r0.u0<u0> modified;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<? extends u0> merged;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private q previousIds;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int[] previousPinnedSnapshots;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean applied;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc3/d$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public d(long j15, q qVar, er.l<Object, oq.i0> lVar, er.l<Object, oq.i0> lVar2) {
        super(j15, qVar, null);
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        this.previousIds = q.INSTANCE.a();
        this.previousPinnedSnapshots = f22794r;
        this.snapshots = 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[LOOP:0: B:7:0x001e->B:24:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[EDGE_INSN: B:28:0x007f->B:25:0x007f BREAK  A[LOOP:0: B:7:0x001e->B:24:0x007c], SYNTHETIC] */
    private final void A() {
        r0.u0<u0> u0VarE = E();
        if (u0VarE != null) {
            S();
            Q(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = u0VarE.elements;
            long[] jArr = u0VarE.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                for (w0 firstStateRecord = ((u0) objArr[(i15 << 3) + i17]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == snapshotId || pq.v.c0(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId()))) {
                                        firstStateRecord.i(w.f22908b);
                                    }
                                }
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        b();
    }

    private final void O() {
        int length = this.previousPinnedSnapshots.length;
        for (int i15 = 0; i15 < length; i15++) {
            w.d0(this.previousPinnedSnapshots[i15]);
        }
    }

    private final void S() {
        if (this.applied) {
            w3.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void T() {
        if (!this.applied || ((l) this).pinningTrackingHandle >= 0) {
            return;
        }
        w3.b("Unsupported operation on a disposed or applied snapshot");
    }

    public final void B() {
        long j15;
        K(getSnapshotId());
        oq.i0 i0Var = oq.i0.f148189a;
        if (getApplied() || getDisposed()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (w.M()) {
            long j16 = w.f22912f;
            j15 = 1;
            w.f22912f += j15;
            v(j16);
            w.f22911e = w.f22911e.s(getSnapshotId());
        }
        u(w.C(getInvalid(), snapshotId + j15, getSnapshotId()));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1 A[Catch: all -> 0x0197, LOOP:6: B:90:0x01b5->B:100:0x01e1, LOOP_END, TryCatch #3 {all -> 0x0197, blocks: (B:67:0x0153, B:69:0x0163, B:72:0x016f, B:74:0x017b, B:76:0x0185, B:78:0x018b, B:81:0x019a, B:87:0x01ab, B:90:0x01b5, B:92:0x01bf, B:94:0x01c9, B:96:0x01cf, B:97:0x01d9, B:100:0x01e1, B:101:0x01e4, B:103:0x01e8, B:105:0x01f2, B:106:0x01fe, B:84:0x01a2), top: B:120:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x01a9 A[EDGE_INSN: B:127:0x01a9->B:86:0x01a9 BREAK  A[LOOP:4: B:72:0x016f->B:84:0x01a2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4 A[EDGE_INSN: B:132:0x01e4->B:101:0x01e4 BREAK  A[LOOP:6: B:90:0x01b5->B:100:0x01e1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a2 A[Catch: all -> 0x0197, LOOP:4: B:72:0x016f->B:84:0x01a2, LOOP_END, TryCatch #3 {all -> 0x0197, blocks: (B:67:0x0153, B:69:0x0163, B:72:0x016f, B:74:0x017b, B:76:0x0185, B:78:0x018b, B:81:0x019a, B:87:0x01ab, B:90:0x01b5, B:92:0x01bf, B:94:0x01c9, B:96:0x01cf, B:97:0x01d9, B:100:0x01e1, B:101:0x01e4, B:103:0x01e8, B:105:0x01f2, B:106:0x01fe, B:84:0x01a2), top: B:120:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01df A[DONT_INVERT] */
    public n C() {
        Map<w0, ? extends w0> mapW;
        List list;
        r0.u0<u0> u0VarE;
        long j15;
        long j16;
        r0.u0<u0> u0VarE2 = E();
        if (u0VarE2 != null) {
            b bVar = w.f22917k;
            mapW = w.W(bVar.getSnapshotId(), this, w.f22911e.l(bVar.getSnapshotId()));
        } else {
            mapW = null;
        }
        List listN = pq.v.n();
        synchronized (w.M()) {
            try {
                w.m0(this);
                if (u0VarE2 == null || u0VarE2.get_size() == 0) {
                    c();
                    b bVar2 = w.f22917k;
                    r0.u0<u0> u0VarE3 = bVar2.E();
                    w.f0(bVar2, w.f22907a);
                    if (u0VarE3 == null || !u0VarE3.f()) {
                        list = listN;
                        u0VarE = null;
                    } else {
                        list = w.f22915i;
                        u0VarE = u0VarE3;
                    }
                } else {
                    b bVar3 = w.f22917k;
                    n nVarJ = J(w.f22912f, u0VarE2, mapW, w.f22911e.l(bVar3.getSnapshotId()));
                    if (!fr.t.c(nVarJ, n.b.f22864a)) {
                        return nVarJ;
                    }
                    c();
                    u0VarE = bVar3.E();
                    w.f0(bVar3, w.f22907a);
                    Q(null);
                    bVar3.Q(null);
                    list = w.f22915i;
                }
                oq.i0 i0Var = oq.i0.f148189a;
                this.applied = true;
                if (u0VarE != null) {
                    Set setA = n2.f.a(u0VarE);
                    if (!setA.isEmpty()) {
                        if (e3.g.isVerboseTracingEnabled) {
                            Object objA = y2.b0.f223360a.a("Compose:applyObservers");
                            try {
                                int size = list.size();
                                for (int i15 = 0; i15 < size; i15++) {
                                    ((er.p) list.get(i15)).B(setA, this);
                                }
                                oq.i0 i0Var2 = oq.i0.f148189a;
                                y2.b0.f223360a.b(objA);
                            } catch (Throwable th4) {
                                y2.b0.f223360a.b(objA);
                                throw th4;
                            }
                        } else {
                            int size2 = list.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                ((er.p) list.get(i16)).B(setA, this);
                            }
                        }
                    }
                }
                if (u0VarE2 != null && u0VarE2.f()) {
                    Set setA2 = n2.f.a(u0VarE2);
                    if (e3.g.isVerboseTracingEnabled) {
                        Object objA2 = y2.b0.f223360a.a("Compose:applyObservers");
                        try {
                            int size3 = list.size();
                            for (int i17 = 0; i17 < size3; i17++) {
                                ((er.p) list.get(i17)).B(setA2, this);
                            }
                            oq.i0 i0Var3 = oq.i0.f148189a;
                            y2.b0.f223360a.b(objA2);
                        } catch (Throwable th5) {
                            y2.b0.f223360a.b(objA2);
                            throw th5;
                        }
                    } else {
                        int size4 = list.size();
                        for (int i18 = 0; i18 < size4; i18++) {
                            ((er.p) list.get(i18)).B(setA2, this);
                        }
                    }
                }
                d3.d.d(this, u0VarE2);
                synchronized (w.M()) {
                    try {
                        r();
                        w.F();
                        if (u0VarE != null) {
                            Object[] objArr = u0VarE.elements;
                            long[] jArr = u0VarE.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i19 = 0;
                                j15 = 128;
                                while (true) {
                                    long j17 = jArr[i19];
                                    j16 = 255;
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i19 != length) {
                                            break;
                                            break;
                                        }
                                        i19++;
                                    } else {
                                        int i25 = 8 - ((~(i19 - length)) >>> 31);
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            if ((j17 & 255) < 128) {
                                                w.Z((u0) objArr[(i19 << 3) + i26]);
                                            }
                                            j17 >>= 8;
                                        }
                                        if (i25 != 8) {
                                            break;
                                        }
                                        if (i19 != length) {
                                            break;
                                        }
                                        i19++;
                                    }
                                }
                            } else {
                                j15 = 128;
                                j16 = 255;
                            }
                        } else {
                            j15 = 128;
                            j16 = 255;
                        }
                        if (u0VarE2 != null) {
                            Object[] objArr2 = u0VarE2.elements;
                            long[] jArr2 = u0VarE2.metadata;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i27 = 0;
                                while (true) {
                                    long j18 = jArr2[i27];
                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i27 != length2) {
                                            break;
                                            break;
                                        }
                                        i27++;
                                    } else {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        for (int i29 = 0; i29 < i28; i29++) {
                                            if ((j18 & j16) < j15) {
                                                w.Z((u0) objArr2[(i27 << 3) + i29]);
                                            }
                                            j18 >>= 8;
                                        }
                                        if (i28 != 8) {
                                            break;
                                        }
                                        if (i27 != length2) {
                                            break;
                                        }
                                        i27++;
                                    }
                                }
                            }
                        }
                        List<? extends u0> list2 = this.merged;
                        if (list2 != null) {
                            int size5 = list2.size();
                            for (int i35 = 0; i35 < size5; i35++) {
                                w.Z(list2.get(i35));
                            }
                        }
                        this.merged = null;
                        oq.i0 i0Var4 = oq.i0.f148189a;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return n.b.f22864a;
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public r0.u0<u0> E() {
        return this.modified;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final q getPreviousIds() {
        return this.previousIds;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // c3.l
    /* JADX INFO: renamed from: H */
    public er.l<Object, oq.i0> g() {
        return this.readObserver;
    }

    public boolean I() {
        r0.u0<u0> u0VarE = E();
        return u0VarE != null && u0VarE.f();
    }

    public final n J(long nextId, r0.u0<u0> modified, Map<w0, ? extends w0> optimisticMerges, q invalidSnapshots) {
        q qVar;
        Object[] objArr;
        long[] jArr;
        q qVar2;
        Object[] objArr2;
        long[] jArr2;
        int i15;
        long j15;
        int i16;
        w0 w0VarT;
        q qVarQ = getInvalid().s(getSnapshotId()).q(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends u0> listL0 = null;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                long j16 = jArr3[i17];
                List<? extends u0> arrayList2 = listL0;
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8;
                    int i19 = 8 - ((~(i17 - length)) >>> 31);
                    int i25 = 0;
                    while (i25 < i19) {
                        if ((j16 & 255) < 128) {
                            i15 = i18;
                            u0 u0Var = (u0) objArr3[(i17 << 3) + i25];
                            objArr2 = objArr3;
                            w0 firstStateRecord = u0Var.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            w0 w0VarB0 = w.b0(firstStateRecord, nextId, invalidSnapshots);
                            if (w0VarB0 == null) {
                                j15 = j16;
                            } else {
                                j15 = j16;
                                w0 w0VarB1 = w.b0(firstStateRecord, getSnapshotId(), qVarQ);
                                if (w0VarB1 != null && w0VarB1.getSnapshotId() != r.c(1) && !fr.t.c(w0VarB0, w0VarB1)) {
                                    i16 = i25;
                                    qVar2 = qVarQ;
                                    w0 w0VarB2 = w.b0(firstStateRecord, getSnapshotId(), getInvalid());
                                    if (w0VarB2 == null) {
                                        w.a0();
                                        throw new oq.g();
                                    }
                                    if (optimisticMerges == null || (w0VarT = optimisticMerges.get(w0VarB0)) == null) {
                                        w0VarT = u0Var.t(w0VarB1, w0VarB0, w0VarB2);
                                    }
                                    if (w0VarT == null) {
                                        return new n.a(this);
                                    }
                                    if (!fr.t.c(w0VarT, w0VarB2)) {
                                        if (fr.t.c(w0VarT, w0VarB0)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(oq.y.a(u0Var, w0VarB0.e(getSnapshotId())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList<>();
                                            }
                                            List<? extends u0> list = arrayList2;
                                            list.add(u0Var);
                                            arrayList = arrayList4;
                                            arrayList2 = list;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!fr.t.c(w0VarT, w0VarB1) ? oq.y.a(u0Var, w0VarT) : oq.y.a(u0Var, w0VarB1.e(getSnapshotId())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            qVar2 = qVarQ;
                            i16 = i25;
                            arrayList = arrayList3;
                        } else {
                            qVar2 = qVarQ;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i15 = i18;
                            j15 = j16;
                            i16 = i25;
                        }
                        j16 = j15 >> i15;
                        i25 = i16 + 1;
                        objArr3 = objArr2;
                        i18 = i15;
                        jArr3 = jArr2;
                        qVarQ = qVar2;
                    }
                    qVar = qVarQ;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList5 = arrayList;
                    if (i19 != i18) {
                        listL0 = arrayList2;
                        arrayList = arrayList5;
                        break;
                    }
                    arrayList = arrayList5;
                } else {
                    qVar = qVarQ;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listL0 = arrayList2;
                if (i17 == length) {
                    break;
                }
                i17++;
                objArr3 = objArr;
                jArr3 = jArr;
                qVarQ = qVar;
            }
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i26 = 0; i26 < size; i26++) {
                oq.r rVar = (oq.r) arrayList.get(i26);
                u0 u0Var2 = (u0) rVar.a();
                w0 w0Var = (w0) rVar.b();
                w0Var.i(nextId);
                synchronized (w.M()) {
                    w0Var.h(u0Var2.getFirstStateRecord());
                    u0Var2.l(w0Var);
                    oq.i0 i0Var = oq.i0.f148189a;
                }
            }
        }
        if (listL0 != null) {
            int size2 = listL0.size();
            for (int i27 = 0; i27 < size2; i27++) {
                modified.z(listL0.get(i27));
            }
            List<? extends u0> list2 = this.merged;
            if (list2 != null) {
                listL0 = pq.v.L0(list2, listL0);
            }
            this.merged = listL0;
        }
        return n.b.f22864a;
    }

    public final void K(long id5) {
        synchronized (w.M()) {
            this.previousIds = this.previousIds.s(id5);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public final void L(q snapshots) {
        synchronized (w.M()) {
            this.previousIds = this.previousIds.q(snapshots);
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public final void M(int id5) {
        if (id5 >= 0) {
            this.previousPinnedSnapshots = pq.n.J(this.previousPinnedSnapshots, id5);
        }
    }

    public final void N(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = pq.n.K(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    public final void P(boolean z15) {
        this.applied = z15;
    }

    public void Q(r0.u0<u0> u0Var) {
        this.modified = u0Var;
    }

    public d R(er.l<Object, oq.i0> readObserver, er.l<Object, oq.i0> writeObserver) {
        Map<d3.b, d3.a> mapD;
        long j15;
        e eVar;
        z();
        T();
        t2.e eVar2 = d3.d.f39530a;
        er.l<Object, oq.i0> lVar = readObserver;
        er.l<Object, oq.i0> lVarB = writeObserver;
        if (eVar2 != null) {
            oq.r<d3.a, Map<d3.b, d3.a>> rVarG = d3.d.g(eVar2, this, false, lVar, lVarB);
            d3.a aVarC = rVarG.c();
            er.l<Object, oq.i0> lVarA = aVarC.a();
            lVarB = aVarC.b();
            mapD = rVarG.d();
            lVar = lVarA;
        } else {
            mapD = null;
        }
        K(getSnapshotId());
        synchronized (w.M()) {
            long j16 = w.f22912f;
            j15 = 1;
            w.f22912f += j15;
            w.f22911e = w.f22911e.s(j16);
            q invalid = getInvalid();
            u(invalid.s(j16));
            eVar = new e(j16, w.C(invalid, getSnapshotId() + j15, j16), w.O(lVar, g(), false, 4, null), w.Q(lVarB, k()), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (w.M()) {
                long j17 = w.f22912f;
                w.f22912f += j15;
                v(j17);
                w.f22911e = w.f22911e.s(getSnapshotId());
                oq.i0 i0Var = oq.i0.f148189a;
            }
            u(w.C(getInvalid(), snapshotId + j15, getSnapshotId()));
        }
        if (eVar2 != null) {
            d3.d.c(eVar2, this, eVar, mapD);
        }
        return eVar;
    }

    @Override // c3.l
    public void c() {
        w.f22911e = w.f22911e.l(getSnapshotId()).k(this.previousIds);
    }

    @Override // c3.l
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        n(this);
        d3.d.e(this);
    }

    @Override // c3.l
    public boolean h() {
        return false;
    }

    @Override // c3.l
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // c3.l
    public er.l<Object, oq.i0> k() {
        return this.writeObserver;
    }

    @Override // c3.l
    public void m(l snapshot) {
        this.snapshots++;
    }

    @Override // c3.l
    public void n(l snapshot) {
        if (!(this.snapshots > 0)) {
            w3.a("no pending nested snapshots");
        }
        int i15 = this.snapshots - 1;
        this.snapshots = i15;
        if (i15 != 0 || this.applied) {
            return;
        }
        A();
    }

    @Override // c3.l
    public void o() {
        if (this.applied || getDisposed()) {
            return;
        }
        B();
    }

    @Override // c3.l
    public void p(u0 state) {
        r0.u0<u0> u0VarE = E();
        if (u0VarE == null) {
            u0VarE = i1.b();
            Q(u0VarE);
        }
        u0VarE.i(state);
    }

    @Override // c3.l
    public void r() {
        O();
        super.r();
    }

    @Override // c3.l
    public void w(int i15) {
        this.writeCount = i15;
    }

    @Override // c3.l
    public l x(er.l<Object, oq.i0> readObserver) {
        Map<d3.b, d3.a> mapD;
        long j15;
        f fVar;
        z();
        T();
        long snapshotId = getSnapshotId();
        d dVar = this instanceof b ? null : this;
        t2.e eVar = d3.d.f39530a;
        er.l<Object, oq.i0> lVar = readObserver;
        if (eVar != null) {
            oq.r<d3.a, Map<d3.b, d3.a>> rVarG = d3.d.g(eVar, dVar, true, lVar, null);
            d3.a aVarC = rVarG.c();
            er.l<Object, oq.i0> lVarA = aVarC.a();
            aVarC.b();
            mapD = rVarG.d();
            lVar = lVarA;
        } else {
            mapD = null;
        }
        K(getSnapshotId());
        synchronized (w.M()) {
            long j16 = w.f22912f;
            j15 = 1;
            w.f22912f += j15;
            w.f22911e = w.f22911e.s(j16);
            fVar = new f(j16, w.C(getInvalid(), snapshotId + j15, j16), w.O(lVar, g(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (w.M()) {
                long j17 = w.f22912f;
                w.f22912f += j15;
                v(j17);
                w.f22911e = w.f22911e.s(getSnapshotId());
                oq.i0 i0Var = oq.i0.f148189a;
            }
            u(w.C(getInvalid(), snapshotId2 + j15, getSnapshotId()));
        }
        if (eVar != null) {
            d3.d.c(eVar, dVar, fVar, mapD);
        }
        return fVar;
    }
}
