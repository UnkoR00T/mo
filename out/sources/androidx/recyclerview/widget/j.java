package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class j implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ThreadLocal<j> f13371e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Comparator<c> f13372f = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f13374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f13375c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<RecyclerView> f13373a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<c> f13376d = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f13384d;
            if ((recyclerView == null) != (cVar2.f13384d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z15 = cVar.f13381a;
            if (z15 != cVar2.f13381a) {
                return z15 ? -1 : 1;
            }
            int i15 = cVar2.f13382b - cVar.f13382b;
            if (i15 != 0) {
                return i15;
            }
            int i16 = cVar.f13383c - cVar2.f13383c;
            if (i16 != 0) {
                return i16;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f13379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13380d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i15, int i16) {
            if (i15 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i16 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i17 = this.f13380d;
            int i18 = i17 * 2;
            int[] iArr = this.f13379c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f13379c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i18 >= iArr.length) {
                int[] iArr3 = new int[i17 * 4];
                this.f13379c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f13379c;
            iArr4[i18] = i15;
            iArr4[i18 + 1] = i16;
            this.f13380d++;
        }

        void b() {
            int[] iArr = this.f13379c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f13380d = 0;
        }

        void c(RecyclerView recyclerView, boolean z15) {
            this.f13380d = 0;
            int[] iArr = this.f13379c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f13026p;
            if (recyclerView.f13025n == null || pVar == null || !pVar.y0()) {
                return;
            }
            if (z15) {
                if (!recyclerView.f13016e.p()) {
                    pVar.u(recyclerView.f13025n.g(), this);
                }
            } else if (!recyclerView.s0()) {
                pVar.t(this.f13377a, this.f13378b, recyclerView.J0, this);
            }
            int i15 = this.f13380d;
            if (i15 > pVar.f13141m) {
                pVar.f13141m = i15;
                pVar.f13142n = z15;
                recyclerView.f13014c.P();
            }
        }

        boolean d(int i15) {
            if (this.f13379c != null) {
                int i16 = this.f13380d * 2;
                for (int i17 = 0; i17 < i16; i17 += 2) {
                    if (this.f13379c[i17] == i15) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i15, int i16) {
            this.f13377a = i15;
            this.f13378b = i16;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f13384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13385e;

        c() {
        }

        public void a() {
            this.f13381a = false;
            this.f13382b = 0;
            this.f13383c = 0;
            this.f13384d = null;
            this.f13385e = 0;
        }
    }

    j() {
    }

    private void b() {
        c cVar;
        int size = this.f13373a.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            RecyclerView recyclerView = this.f13373a.get(i16);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.I0.c(recyclerView, false);
                i15 += recyclerView.I0.f13380d;
            }
        }
        this.f13376d.ensureCapacity(i15);
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            RecyclerView recyclerView2 = this.f13373a.get(i18);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.I0;
                int iAbs = Math.abs(bVar.f13377a) + Math.abs(bVar.f13378b);
                for (int i19 = 0; i19 < bVar.f13380d * 2; i19 += 2) {
                    if (i17 >= this.f13376d.size()) {
                        cVar = new c();
                        this.f13376d.add(cVar);
                    } else {
                        cVar = this.f13376d.get(i17);
                    }
                    int[] iArr = bVar.f13379c;
                    int i25 = iArr[i19 + 1];
                    cVar.f13381a = i25 <= iAbs;
                    cVar.f13382b = iAbs;
                    cVar.f13383c = i25;
                    cVar.f13384d = recyclerView2;
                    cVar.f13385e = iArr[i19];
                    i17++;
                }
            }
        }
        Collections.sort(this.f13376d, f13372f);
    }

    private void c(c cVar, long j15) {
        RecyclerView.f0 f0VarI = i(cVar.f13384d, cVar.f13385e, cVar.f13381a ? Long.MAX_VALUE : j15);
        if (f0VarI == null || f0VarI.f13092b == null || !f0VarI.u() || f0VarI.v()) {
            return;
        }
        h(f0VarI.f13092b.get(), j15);
    }

    private void d(long j15) {
        for (int i15 = 0; i15 < this.f13376d.size(); i15++) {
            c cVar = this.f13376d.get(i15);
            if (cVar.f13384d == null) {
                return;
            }
            c(cVar, j15);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i15) {
        int iJ = recyclerView.f13017f.j();
        for (int i16 = 0; i16 < iJ; i16++) {
            RecyclerView.f0 f0VarL0 = RecyclerView.l0(recyclerView.f13017f.i(i16));
            if (f0VarL0.f13093c == i15 && !f0VarL0.v()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j15) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.I && recyclerView.f13017f.j() != 0) {
            recyclerView.d1();
        }
        b bVar = recyclerView.I0;
        bVar.c(recyclerView, true);
        if (bVar.f13380d != 0) {
            try {
                e6.l.a("RV Nested Prefetch");
                recyclerView.J0.f(recyclerView.f13025n);
                for (int i15 = 0; i15 < bVar.f13380d * 2; i15 += 2) {
                    i(recyclerView, bVar.f13379c[i15], j15);
                }
                e6.l.b();
            } catch (Throwable th4) {
                e6.l.b();
                throw th4;
            }
        }
    }

    private RecyclerView.f0 i(RecyclerView recyclerView, int i15, long j15) {
        if (e(recyclerView, i15)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f13014c;
        try {
            recyclerView.N0();
            RecyclerView.f0 f0VarN = wVar.N(i15, false, j15);
            if (f0VarN != null) {
                if (!f0VarN.u() || f0VarN.v()) {
                    wVar.a(f0VarN, false);
                } else {
                    wVar.G(f0VarN.f13091a);
                }
            }
            return f0VarN;
        } finally {
            recyclerView.P0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.f12997c1 && this.f13373a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f13373a.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i15, int i16) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f12997c1 && !this.f13373a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f13374b == 0) {
                this.f13374b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.I0.e(i15, i16);
    }

    void g(long j15) {
        b();
        d(j15);
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f13373a.remove(recyclerView);
        if (RecyclerView.f12997c1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            e6.l.a("RV Prefetch");
            if (!this.f13373a.isEmpty()) {
                int size = this.f13373a.size();
                long jMax = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    RecyclerView recyclerView = this.f13373a.get(i15);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f13375c);
                }
            }
        } finally {
            this.f13374b = 0L;
            e6.l.b();
        }
    }
}
