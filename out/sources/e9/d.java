package e9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w7.c0;
import w7.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f48676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f48678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f48679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f48680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f48681m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f48684c;

        private b(int i15, long j15, long j16) {
            this.f48682a = i15;
            this.f48683b = j15;
            this.f48684c = j16;
        }
    }

    private d(long j15, boolean z15, boolean z16, boolean z17, boolean z18, long j16, long j17, List<b> list, boolean z19, long j18, int i15, int i16, int i17) {
        this.f48669a = j15;
        this.f48670b = z15;
        this.f48671c = z16;
        this.f48672d = z17;
        this.f48673e = z18;
        this.f48674f = j16;
        this.f48675g = j17;
        this.f48676h = Collections.unmodifiableList(list);
        this.f48677i = z19;
        this.f48678j = j18;
        this.f48679k = i15;
        this.f48680l = i16;
        this.f48681m = i17;
    }

    static d d(c0 c0Var, long j15, k0 k0Var) {
        List list;
        long j16;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i15;
        int iQ;
        int iQ2;
        boolean z19;
        long jS = c0Var.S();
        boolean z25 = (c0Var.Q() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jS2 = -9223372036854775807L;
        if (z25) {
            list = list2;
            j16 = -9223372036854775807L;
            z15 = false;
            z16 = false;
            z17 = false;
            z18 = false;
            i15 = 0;
            iQ = 0;
            iQ2 = 0;
        } else {
            int iQ3 = c0Var.Q();
            boolean z26 = (iQ3 & 128) != 0;
            boolean z27 = (iQ3 & 64) != 0;
            boolean z28 = (iQ3 & 32) != 0;
            boolean z29 = (iQ3 & 16) != 0;
            long jE = (!z27 || z29) ? -9223372036854775807L : g.e(c0Var, j15);
            if (!z27) {
                int iQ4 = c0Var.Q();
                ArrayList arrayList = new ArrayList(iQ4);
                int i16 = 0;
                while (i16 < iQ4) {
                    int iQ5 = c0Var.Q();
                    long jE2 = !z29 ? g.e(c0Var, j15) : -9223372036854775807L;
                    arrayList.add(new b(iQ5, jE2, k0Var.b(jE2)));
                    i16++;
                    iQ4 = iQ4;
                }
                list2 = arrayList;
            }
            if (z28) {
                long jQ = c0Var.Q();
                boolean z35 = (128 & jQ) != 0;
                jS2 = ((((jQ & 1) << 32) | c0Var.S()) * 1000) / 90;
                z19 = z35;
            } else {
                z19 = false;
            }
            int iY = c0Var.Y();
            long j17 = jE;
            j16 = jS2;
            jS2 = j17;
            iQ = c0Var.Q();
            iQ2 = c0Var.Q();
            i15 = iY;
            z18 = z19;
            z15 = z26;
            z16 = z27;
            list = list2;
            z17 = z29;
        }
        return new d(jS, z25, z15, z16, z17, jS2, k0Var.b(jS2), list, z18, j16, i15, iQ, iQ2);
    }

    @Override // e9.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f48674f + ", programSplicePlaybackPositionUs= " + this.f48675g + " }";
    }
}
