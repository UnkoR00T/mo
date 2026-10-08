package n6;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import x5.h;

/* JADX INFO: loaded from: classes.dex */
class c implements g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f132353a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f132354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f132355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f132356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f132357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f132358f;

    c(g gVar, List<b> list) {
        h hVar = h.f216812e;
        this.f132355c = hVar;
        this.f132356d = hVar;
        f(list, false);
        f(list, true);
        gVar.g(this);
        this.f132354b = gVar;
    }

    private void f(List<b> list, boolean z15) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            b bVar = list.get(i15);
            if (bVar.g() == z15) {
                Object objD = bVar.d();
                if (objD != null) {
                    throw new IllegalStateException(bVar + " is already controlled by " + objD);
                }
                bVar.h(this);
                this.f132353a.add(bVar);
            }
        }
    }

    private void j() {
        h hVarA = h.f216812e;
        for (int size = this.f132353a.size() - 1; size >= 0; size--) {
            hVarA = h.a(hVarA, this.f132353a.get(size).b(this.f132355c, this.f132356d, hVarA));
        }
    }

    @Override // n6.g.c
    public void a(int i15, h hVar, RectF rectF) {
        h hVar2 = this.f132356d;
        for (int size = this.f132353a.size() - 1; size >= 0; size--) {
            b bVar = this.f132353a.get(size);
            int iE = bVar.e();
            if ((iE & i15) != 0) {
                bVar.l(true);
                if (iE == 1) {
                    int i16 = hVar2.f216813a;
                    if (i16 > 0) {
                        bVar.k(hVar.f216813a / i16);
                    }
                    bVar.j(rectF.left);
                } else if (iE == 2) {
                    int i17 = hVar2.f216814b;
                    if (i17 > 0) {
                        bVar.k(hVar.f216814b / i17);
                    }
                    bVar.j(rectF.top);
                } else if (iE == 4) {
                    int i18 = hVar2.f216815c;
                    if (i18 > 0) {
                        bVar.k(hVar.f216815c / i18);
                    }
                    bVar.j(rectF.right);
                } else if (iE == 8) {
                    int i19 = hVar2.f216816d;
                    if (i19 > 0) {
                        bVar.k(hVar.f216816d / i19);
                    }
                    bVar.j(rectF.bottom);
                }
            }
        }
    }

    @Override // n6.g.c
    public void b(h hVar, h hVar2) {
        this.f132355c = hVar;
        this.f132356d = hVar2;
        j();
    }

    @Override // n6.g.c
    public void c() {
        this.f132357e++;
    }

    @Override // n6.g.c
    public void d() {
        int i15 = this.f132357e;
        boolean z15 = i15 > 0;
        int i16 = i15 - 1;
        this.f132357e = i16;
        if (z15 && i16 == 0) {
            j();
        }
    }

    @Override // n6.g.c
    public void e(int i15) {
        for (int size = this.f132353a.size() - 1; size >= 0; size--) {
            this.f132353a.get(size).a(i15);
        }
    }

    void g() {
        if (this.f132358f) {
            return;
        }
        this.f132358f = true;
        this.f132354b.l(this);
        for (int size = this.f132353a.size() - 1; size >= 0; size--) {
            this.f132353a.get(size).h(null);
        }
        this.f132353a.clear();
    }

    b h(int i15) {
        return this.f132353a.get(i15);
    }

    int i() {
        return this.f132353a.size();
    }
}
