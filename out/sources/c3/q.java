package c3;

import java.util.ArrayList;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 '2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001!B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001c\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lc3/q;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "belowBound", "<init>", "(JJJ[J)V", "id", "", "n", "(J)Z", "s", "(J)Lc3/q;", "l", "ids", "k", "(Lc3/q;)Lc3/q;", "bits", "q", "", "iterator", "()Ljava/util/Iterator;", "default", "o", "(J)J", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "c", "d", "[J", "e", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements Iterable<Long>, gr.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final q f22882f = new q(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long upperSet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long lowerSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long lowerBound;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long[] belowBound;

    /* JADX INFO: renamed from: c3.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc3/q$a;", "", "<init>", "()V", "Lc3/q;", "EMPTY", "Lc3/q;", "a", "()Lc3/q;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final q a() {
            return q.f22882f;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leu/j;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "Loq/i0;", "<anonymous>", "(Leu/j;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.i implements er.p<eu.j<? super Long>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f22887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f22891g;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c3.q.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(eu.j<? super Long> jVar, tq.e<? super oq.i0> eVar) {
            return ((b) v(jVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = q.this.new b(eVar);
            bVar.f22891g = obj;
            return bVar;
        }
    }

    private q(long j15, long j16, long j17, long[] jArr) {
        this.upperSet = j15;
        this.lowerSet = j16;
        this.lowerBound = j17;
        this.belowBound = jArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return eu.k.b(new b(null)).iterator();
    }

    public final q k(q ids) {
        q qVarL;
        q qVar = f22882f;
        if (ids == qVar) {
            return this;
        }
        if (this == qVar) {
            return qVar;
        }
        long j15 = ids.lowerBound;
        long j16 = this.lowerBound;
        if (j15 == j16) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new q((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j16, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            qVarL = this;
            for (long j17 : jArr3) {
                qVarL = qVarL.l(j17);
            }
        } else {
            qVarL = this;
        }
        if (ids.lowerSet != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if ((ids.lowerSet & (1 << i15)) != 0) {
                    qVarL = qVarL.l(ids.lowerBound + ((long) i15));
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                if ((ids.upperSet & (1 << i16)) != 0) {
                    qVarL = qVarL.l(ids.lowerBound + ((long) i16) + ((long) 64));
                }
            }
        }
        return qVarL;
    }

    public final q l(long id5) {
        long[] jArr;
        int iA;
        long j15 = id5 - this.lowerBound;
        long j16 = 0;
        if (fr.t.e(j15, j16) >= 0 && fr.t.e(j15, 64) < 0) {
            long j17 = 1 << ((int) j15);
            long j18 = this.lowerSet;
            if ((j18 & j17) != 0) {
                return new q(this.upperSet, j18 & (~j17), this.lowerBound, this.belowBound);
            }
        } else if (fr.t.e(j15, 64) >= 0 && fr.t.e(j15, 128) < 0) {
            long j19 = 1 << (((int) j15) - 64);
            long j25 = this.upperSet;
            if ((j25 & j19) != 0) {
                return new q(j25 & (~j19), this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (fr.t.e(j15, j16) < 0 && (jArr = this.belowBound) != null && (iA = r.a(jArr, id5)) >= 0) {
            return new q(this.upperSet, this.lowerSet, this.lowerBound, r.e(jArr, iA));
        }
        return this;
    }

    public final boolean n(long id5) {
        long[] jArr;
        long j15 = id5 - this.lowerBound;
        long j16 = 0;
        if (fr.t.e(j15, j16) >= 0 && fr.t.e(j15, 64) < 0) {
            return ((1 << ((int) j15)) & this.lowerSet) != 0;
        }
        if (fr.t.e(j15, 64) < 0 || fr.t.e(j15, 128) >= 0) {
            return fr.t.e(j15, j16) <= 0 && (jArr = this.belowBound) != null && r.a(jArr, id5) >= 0;
        }
        return ((1 << (((int) j15) - 64)) & this.upperSet) != 0;
    }

    public final long o(long j15) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        long j16 = this.lowerSet;
        if (j16 != 0) {
            return this.lowerBound + ((long) Long.numberOfTrailingZeros(j16));
        }
        long j17 = this.upperSet;
        return j17 != 0 ? this.lowerBound + ((long) 64) + ((long) Long.numberOfTrailingZeros(j17)) : j15;
    }

    public final q q(q bits) {
        q qVarS;
        q qVar = f22882f;
        if (bits == qVar) {
            return this;
        }
        if (this == qVar) {
            return bits;
        }
        long j15 = bits.lowerBound;
        long j16 = this.lowerBound;
        if (j15 == j16) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new q(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j16, jArr2);
            }
        }
        int i15 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j17 : jArr3) {
                    bits = bits.s(j17);
                }
            }
            if (this.lowerSet != 0) {
                for (int i16 = 0; i16 < 64; i16++) {
                    if ((this.lowerSet & (1 << i16)) != 0) {
                        bits = bits.s(this.lowerBound + ((long) i16));
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i15 < 64) {
                    if ((this.upperSet & (1 << i15)) != 0) {
                        bits = bits.s(this.lowerBound + ((long) i15) + ((long) 64));
                    }
                    i15++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            qVarS = this;
            for (long j18 : jArr4) {
                qVarS = qVarS.s(j18);
            }
        } else {
            qVarS = this;
        }
        if (bits.lowerSet != 0) {
            for (int i17 = 0; i17 < 64; i17++) {
                if ((bits.lowerSet & (1 << i17)) != 0) {
                    qVarS = qVarS.s(bits.lowerBound + ((long) i17));
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i15 < 64) {
                if ((bits.upperSet & (1 << i15)) != 0) {
                    qVarS = qVarS.s(bits.lowerBound + ((long) i15) + ((long) 64));
                }
                i15++;
            }
        }
        return qVarS;
    }

    public final q s(long id5) {
        long j15;
        long j16;
        long[] jArrB;
        long j17 = id5 - this.lowerBound;
        long j18 = 0;
        if (fr.t.e(j17, j18) < 0 || fr.t.e(j17, 64) >= 0) {
            long j19 = 64;
            if (fr.t.e(j17, j19) < 0 || fr.t.e(j17, 128) >= 0) {
                long j25 = 128;
                if (fr.t.e(j17, j25) < 0) {
                    long[] jArr = this.belowBound;
                    if (jArr == null) {
                        return new q(this.upperSet, this.lowerSet, this.lowerBound, new long[]{id5});
                    }
                    int iA = r.a(jArr, id5);
                    if (iA < 0) {
                        return new q(this.upperSet, this.lowerSet, this.lowerBound, r.d(jArr, -(iA + 1), id5));
                    }
                } else if (!n(id5)) {
                    long j26 = this.upperSet;
                    long j27 = this.lowerSet;
                    long j28 = this.lowerBound;
                    long j29 = 1;
                    long j35 = ((id5 + j29) / j19) * j19;
                    if (fr.t.e(j35, j18) < 0) {
                        j35 = (Long.MAX_VALUE - j25) + j29;
                    }
                    p pVar = null;
                    long j36 = j26;
                    while (true) {
                        if (fr.t.e(j28, j35) >= 0) {
                            j15 = j27;
                            j16 = j28;
                            break;
                        }
                        if (j27 != 0) {
                            if (pVar == null) {
                                pVar = new p(this.belowBound);
                            }
                            int i15 = 0;
                            while (i15 < 64) {
                                long j37 = j27;
                                if ((j27 & (1 << i15)) != 0) {
                                    pVar.a(((long) i15) + j28);
                                }
                                i15++;
                                j27 = j37;
                            }
                        }
                        if (j36 == 0) {
                            j16 = j35;
                            j15 = 0;
                            break;
                        }
                        j28 += j19;
                        j27 = j36;
                        j36 = 0;
                    }
                    if (pVar == null || (jArrB = pVar.b()) == null) {
                        jArrB = this.belowBound;
                    }
                    return new q(j36, j15, j16, jArrB).s(id5);
                }
            } else {
                long j38 = 1 << (((int) j17) - 64);
                long j39 = this.upperSet;
                if ((j39 & j38) == 0) {
                    return new q(j39 | j38, this.lowerSet, this.lowerBound, this.belowBound);
                }
            }
        } else {
            long j45 = 1 << ((int) j17);
            long j46 = this.lowerSet;
            if ((j46 & j45) == 0) {
                return new q(this.upperSet, j46 | j45, this.lowerBound, this.belowBound);
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        sb5.append(" [");
        ArrayList arrayList = new ArrayList(pq.v.y(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb5.append(c.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb5.append(']');
        return sb5.toString();
    }
}
