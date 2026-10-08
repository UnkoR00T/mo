package k8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<b> f109119h = new Comparator() { // from class: k8.m
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return o.b((o.b) obj, (o.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<b> f109120i = new Comparator() { // from class: k8.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((o.b) obj).f109130c, ((o.b) obj2).f109130c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109121a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f109125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f109126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f109127g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f109123c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f109122b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f109124d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f109129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f109130c;

        private b() {
        }
    }

    public o(int i15) {
        this.f109121a = i15;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f109128a - bVar2.f109128a;
    }

    private void d() {
        if (this.f109124d != 1) {
            Collections.sort(this.f109122b, f109119h);
            this.f109124d = 1;
        }
    }

    private void e() {
        if (this.f109124d != 0) {
            Collections.sort(this.f109122b, f109120i);
            this.f109124d = 0;
        }
    }

    public void c(int i15, float f15) {
        b bVar;
        d();
        int i16 = this.f109127g;
        if (i16 > 0) {
            b[] bVarArr = this.f109123c;
            int i17 = i16 - 1;
            this.f109127g = i17;
            bVar = bVarArr[i17];
        } else {
            bVar = new b();
        }
        int i18 = this.f109125e;
        this.f109125e = i18 + 1;
        bVar.f109128a = i18;
        bVar.f109129b = i15;
        bVar.f109130c = f15;
        this.f109122b.add(bVar);
        this.f109126f += i15;
        while (true) {
            int i19 = this.f109126f;
            int i25 = this.f109121a;
            if (i19 <= i25) {
                return;
            }
            int i26 = i19 - i25;
            b bVar2 = this.f109122b.get(0);
            int i27 = bVar2.f109129b;
            if (i27 <= i26) {
                this.f109126f -= i27;
                this.f109122b.remove(0);
                int i28 = this.f109127g;
                if (i28 < 5) {
                    b[] bVarArr2 = this.f109123c;
                    this.f109127g = i28 + 1;
                    bVarArr2[i28] = bVar2;
                }
            } else {
                bVar2.f109129b = i27 - i26;
                this.f109126f -= i26;
            }
        }
    }

    public float f(float f15) {
        e();
        float f16 = f15 * this.f109126f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f109122b.size(); i16++) {
            b bVar = this.f109122b.get(i16);
            i15 += bVar.f109129b;
            if (i15 >= f16) {
                return bVar.f109130c;
            }
        }
        if (this.f109122b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f109122b;
        return arrayList.get(arrayList.size() - 1).f109130c;
    }

    public void g() {
        this.f109122b.clear();
        this.f109124d = -1;
        this.f109125e = 0;
        this.f109126f = 0;
    }
}
