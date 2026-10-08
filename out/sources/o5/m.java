package o5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f142416h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p f142419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f142420d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f142422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f142423g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142417a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f142418b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<p> f142421e = new ArrayList<>();

    m(p pVar, int i15) {
        this.f142419c = null;
        this.f142420d = null;
        int i16 = f142416h;
        this.f142422f = i16;
        f142416h = i16 + 1;
        this.f142419c = pVar;
        this.f142420d = pVar;
        this.f142423g = i15;
    }

    private long c(f fVar, long j15) {
        p pVar = fVar.f142392d;
        if (pVar instanceof k) {
            return j15;
        }
        int size = fVar.f142399k.size();
        long jMin = j15;
        for (int i15 = 0; i15 < size; i15++) {
            d dVar = fVar.f142399k.get(i15);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f142392d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f142394f) + j15));
                }
            }
        }
        if (fVar != pVar.f142449i) {
            return jMin;
        }
        long j16 = j15 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f142448h, j16)), j16 - ((long) pVar.f142448h.f142394f));
    }

    private long d(f fVar, long j15) {
        p pVar = fVar.f142392d;
        if (pVar instanceof k) {
            return j15;
        }
        int size = fVar.f142399k.size();
        long jMax = j15;
        for (int i15 = 0; i15 < size; i15++) {
            d dVar = fVar.f142399k.get(i15);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f142392d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f142394f) + j15));
                }
            }
        }
        if (fVar != pVar.f142448h) {
            return jMax;
        }
        long j16 = j15 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f142449i, j16)), j16 - ((long) pVar.f142449i.f142394f));
    }

    public void a(p pVar) {
        this.f142421e.add(pVar);
        this.f142420d = pVar;
    }

    public long b(n5.f fVar, int i15) {
        long j15;
        int i16;
        p pVar = this.f142419c;
        if (pVar instanceof c) {
            if (((c) pVar).f142446f != i15) {
                return 0L;
            }
        } else if (i15 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i15 == 0 ? fVar.f131847e : fVar.f131849f).f142448h;
        f fVar3 = (i15 == 0 ? fVar.f131847e : fVar.f131849f).f142449i;
        boolean zContains = pVar.f142448h.f142400l.contains(fVar2);
        boolean zContains2 = this.f142419c.f142449i.f142400l.contains(fVar3);
        long j16 = this.f142419c.j();
        if (zContains && zContains2) {
            long jD = d(this.f142419c.f142448h, 0L);
            long jC = c(this.f142419c.f142449i, 0L);
            long j17 = jD - j16;
            p pVar2 = this.f142419c;
            int i17 = pVar2.f142449i.f142394f;
            if (j17 >= (-i17)) {
                j17 += (long) i17;
            }
            int i18 = pVar2.f142448h.f142394f;
            long j18 = ((-jC) - j16) - ((long) i18);
            if (j18 >= i18) {
                j18 -= (long) i18;
            }
            float fQ = pVar2.f142442b.q(i15);
            float f15 = fQ > 0.0f ? (long) ((j18 / fQ) + (j17 / (1.0f - fQ))) : 0L;
            long j19 = ((long) ((f15 * fQ) + 0.5f)) + j16 + ((long) ((f15 * (1.0f - fQ)) + 0.5f));
            p pVar3 = this.f142419c;
            j15 = ((long) pVar3.f142448h.f142394f) + j19;
            i16 = pVar3.f142449i.f142394f;
        } else {
            if (zContains) {
                f fVar4 = this.f142419c.f142448h;
                return Math.max(d(fVar4, fVar4.f142394f), ((long) this.f142419c.f142448h.f142394f) + j16);
            }
            if (zContains2) {
                f fVar5 = this.f142419c.f142449i;
                return Math.max(-c(fVar5, fVar5.f142394f), ((long) (-this.f142419c.f142449i.f142394f)) + j16);
            }
            p pVar4 = this.f142419c;
            j15 = ((long) pVar4.f142448h.f142394f) + pVar4.j();
            i16 = this.f142419c.f142449i.f142394f;
        }
        return j15 - ((long) i16);
    }
}
