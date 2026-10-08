package g5;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f70673t = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f70674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f70675b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f70679f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    a f70683k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70676c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f70677d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70678e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f70680g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f70681h = new float[9];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float[] f70682j = new float[9];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b[] f70684l = new b[16];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f70685m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f70686n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f70687p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f70688q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f70689r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    HashSet<b> f70690s = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f70683k = aVar;
    }

    static void g() {
        f70673t++;
    }

    public final void b(b bVar) {
        int i15 = 0;
        while (true) {
            int i16 = this.f70685m;
            if (i15 >= i16) {
                b[] bVarArr = this.f70684l;
                if (i16 >= bVarArr.length) {
                    this.f70684l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f70684l;
                int i17 = this.f70685m;
                bVarArr2[i17] = bVar;
                this.f70685m = i17 + 1;
                return;
            }
            if (this.f70684l[i15] == bVar) {
                return;
            } else {
                i15++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f70676c - iVar.f70676c;
    }

    public final void j(b bVar) {
        int i15 = this.f70685m;
        int i16 = 0;
        while (i16 < i15) {
            if (this.f70684l[i16] == bVar) {
                while (i16 < i15 - 1) {
                    b[] bVarArr = this.f70684l;
                    int i17 = i16 + 1;
                    bVarArr[i16] = bVarArr[i17];
                    i16 = i17;
                }
                this.f70685m--;
                return;
            }
            i16++;
        }
    }

    public void k() {
        this.f70675b = null;
        this.f70683k = a.UNKNOWN;
        this.f70678e = 0;
        this.f70676c = -1;
        this.f70677d = -1;
        this.f70679f = 0.0f;
        this.f70680g = false;
        this.f70687p = false;
        this.f70688q = -1;
        this.f70689r = 0.0f;
        int i15 = this.f70685m;
        for (int i16 = 0; i16 < i15; i16++) {
            this.f70684l[i16] = null;
        }
        this.f70685m = 0;
        this.f70686n = 0;
        this.f70674a = false;
        Arrays.fill(this.f70682j, 0.0f);
    }

    public void l(d dVar, float f15) {
        this.f70679f = f15;
        this.f70680g = true;
        this.f70687p = false;
        this.f70688q = -1;
        this.f70689r = 0.0f;
        int i15 = this.f70685m;
        this.f70677d = -1;
        for (int i16 = 0; i16 < i15; i16++) {
            this.f70684l[i16].A(dVar, this, false);
        }
        this.f70685m = 0;
    }

    public void n(a aVar, String str) {
        this.f70683k = aVar;
    }

    public final void o(d dVar, b bVar) {
        int i15 = this.f70685m;
        for (int i16 = 0; i16 < i15; i16++) {
            this.f70684l[i16].B(dVar, bVar, false);
        }
        this.f70685m = 0;
    }

    public String toString() {
        if (this.f70675b != null) {
            return "" + this.f70675b;
        }
        return "" + this.f70676c;
    }
}
