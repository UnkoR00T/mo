package o5;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f142427g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f142429b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f142431d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<n5.e> f142428a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f142430c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<a> f142432e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f142433f = -1;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<n5.e> f142434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f142435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f142436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f142437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f142439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f142440g;

        a(n5.e eVar, g5.d dVar, int i15) {
            this.f142434a = new WeakReference<>(eVar);
            this.f142435b = dVar.y(eVar.O);
            this.f142436c = dVar.y(eVar.P);
            this.f142437d = dVar.y(eVar.Q);
            this.f142438e = dVar.y(eVar.R);
            this.f142439f = dVar.y(eVar.S);
            this.f142440g = i15;
        }
    }

    public o(int i15) {
        int i16 = f142427g;
        f142427g = i16 + 1;
        this.f142429b = i16;
        this.f142431d = i15;
    }

    private String e() {
        int i15 = this.f142431d;
        if (i15 == 0) {
            return "Horizontal";
        }
        if (i15 == 1) {
            return "Vertical";
        }
        return i15 == 2 ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.h.f37071k : "Unknown";
    }

    private int j(g5.d dVar, ArrayList<n5.e> arrayList, int i15) {
        int iY;
        int iY2;
        n5.f fVar = (n5.f) arrayList.get(0).L();
        dVar.E();
        fVar.g(dVar, false);
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            arrayList.get(i16).g(dVar, false);
        }
        if (i15 == 0 && fVar.W0 > 0) {
            n5.b.b(fVar, dVar, arrayList, 0);
        }
        if (i15 == 1 && fVar.X0 > 0) {
            n5.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e15) {
            System.err.println(e15.toString() + "\n" + Arrays.toString(e15.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f142432e = new ArrayList<>();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            this.f142432e.add(new a(arrayList.get(i17), dVar, i15));
        }
        if (i15 == 0) {
            iY = dVar.y(fVar.O);
            iY2 = dVar.y(fVar.Q);
            dVar.E();
        } else {
            iY = dVar.y(fVar.P);
            iY2 = dVar.y(fVar.R);
            dVar.E();
        }
        return iY2 - iY;
    }

    public boolean a(n5.e eVar) {
        if (this.f142428a.contains(eVar)) {
            return false;
        }
        this.f142428a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f142428a.size();
        if (this.f142433f != -1 && size > 0) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                o oVar = arrayList.get(i15);
                if (this.f142433f == oVar.f142429b) {
                    g(this.f142431d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f142429b;
    }

    public int d() {
        return this.f142431d;
    }

    public int f(g5.d dVar, int i15) {
        if (this.f142428a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f142428a, i15);
    }

    public void g(int i15, o oVar) {
        for (n5.e eVar : this.f142428a) {
            oVar.a(eVar);
            if (i15 == 0) {
                eVar.I0 = oVar.c();
            } else {
                eVar.J0 = oVar.c();
            }
        }
        this.f142433f = oVar.f142429b;
    }

    public void h(boolean z15) {
        this.f142430c = z15;
    }

    public void i(int i15) {
        this.f142431d = i15;
    }

    public String toString() {
        String str = e() + " [" + this.f142429b + "] <";
        Iterator<n5.e> it = this.f142428a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().t();
        }
        return str + " >";
    }
}
