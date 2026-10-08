package e9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f48685a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48687b;

        private b(int i15, long j15) {
            this.f48686a = i15;
            this.f48687b = j15;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f48691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f48692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f48693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f48694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f48695h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f48696i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f48697j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f48698k;

        private c(long j15, boolean z15, boolean z16, boolean z17, List<b> list, long j16, boolean z18, long j17, int i15, int i16, int i17) {
            this.f48688a = j15;
            this.f48689b = z15;
            this.f48690c = z16;
            this.f48691d = z17;
            this.f48693f = Collections.unmodifiableList(list);
            this.f48692e = j16;
            this.f48694g = z18;
            this.f48695h = j17;
            this.f48696i = i15;
            this.f48697j = i16;
            this.f48698k = i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(c0 c0Var) {
            ArrayList arrayList;
            boolean z15;
            boolean z16;
            long j15;
            boolean z17;
            long j16;
            int i15;
            int i16;
            int iQ;
            boolean z18;
            long jS;
            long jS2 = c0Var.S();
            boolean z19 = true;
            if ((c0Var.Q() & 128) == 0) {
                z19 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z19) {
                arrayList = arrayList2;
                z15 = false;
                z16 = false;
                j15 = -9223372036854775807L;
                z17 = false;
                j16 = -9223372036854775807L;
                i15 = 0;
                i16 = 0;
                iQ = 0;
            } else {
                int iQ2 = c0Var.Q();
                boolean z25 = (iQ2 & 128) != 0;
                boolean z26 = (iQ2 & 64) != 0 ? z19 : false;
                boolean z27 = (iQ2 & 32) != 0 ? z19 : false;
                long jS3 = z26 ? c0Var.S() : -9223372036854775807L;
                if (!z26) {
                    int iQ3 = c0Var.Q();
                    ArrayList arrayList3 = new ArrayList(iQ3);
                    int i17 = 0;
                    while (i17 < iQ3) {
                        arrayList3.add(new b(c0Var.Q(), c0Var.S()));
                        i17++;
                        iQ3 = iQ3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z27) {
                    long jQ = c0Var.Q();
                    boolean z28 = (128 & jQ) != 0;
                    jS = ((((jQ & 1) << 32) | c0Var.S()) * 1000) / 90;
                    z18 = z28;
                } else {
                    z18 = false;
                    jS = -9223372036854775807L;
                }
                int iY = c0Var.Y();
                int iQ4 = c0Var.Q();
                boolean z29 = z25;
                z17 = z18;
                z15 = z29;
                iQ = c0Var.Q();
                long j17 = jS3;
                i15 = iY;
                i16 = iQ4;
                long j18 = jS;
                arrayList = arrayList2;
                z16 = z26;
                j15 = j17;
                j16 = j18;
            }
            return new c(jS2, z19, z15, z16, arrayList, j15, z17, j16, i15, i16, iQ);
        }
    }

    private f(List<c> list) {
        this.f48685a = Collections.unmodifiableList(list);
    }

    static f d(c0 c0Var) {
        int iQ = c0Var.Q();
        ArrayList arrayList = new ArrayList(iQ);
        for (int i15 = 0; i15 < iQ; i15++) {
            arrayList.add(c.b(c0Var));
        }
        return new f(arrayList);
    }
}
