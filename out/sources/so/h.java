package so;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<g> f182645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, l> f182646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o f182647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f182648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f182649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f182650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f182651i;

    h(i0 i0Var, o oVar) {
        g gVar;
        super((short) -1, i0Var);
        this.f182645c = new ArrayList();
        this.f182646d = new HashMap();
        this.f182648f = false;
        this.f182649g = false;
        this.f182650h = -1;
        this.f182651i = -1;
        this.f182647e = oVar;
        do {
            gVar = new g(i0Var);
            this.f182645c.add(gVar);
        } while ((gVar.c() & 32) != 0);
        if ((gVar.c() & 256) != 0) {
            i(i0Var, i0Var.N());
        }
        l();
    }

    private g j(int i15) {
        for (g gVar : this.f182645c) {
            l lVar = this.f182646d.get(Integer.valueOf(gVar.d()));
            if (gVar.b() <= i15 && lVar != null && i15 < gVar.b() + lVar.e()) {
                return gVar;
            }
        }
        return null;
    }

    private g k(int i15) {
        for (g gVar : this.f182645c) {
            l lVar = this.f182646d.get(Integer.valueOf(gVar.d()));
            if (gVar.a() <= i15 && lVar != null && i15 < gVar.a() + lVar.h()) {
                return gVar;
            }
        }
        return null;
    }

    private void l() {
        Iterator<g> it = this.f182645c.iterator();
        while (it.hasNext()) {
            try {
                int iD = it.next().d();
                k kVarJ = this.f182647e.j(iD);
                if (kVarJ != null) {
                    this.f182646d.put(Integer.valueOf(iD), kVarJ.a());
                }
            } catch (IOException e15) {
                c2.f("PdfBox-Android", e15.getMessage(), e15);
            }
        }
    }

    @Override // so.l
    public boolean a() {
        return true;
    }

    @Override // so.l
    public short b(int i15) {
        g gVarJ = j(i15);
        if (gVarJ == null) {
            return (short) 0;
        }
        l lVar = this.f182646d.get(Integer.valueOf(gVarJ.d()));
        int iB = i15 - gVarJ.b();
        return (short) (gVarJ.h(lVar.f(iB), lVar.b(iB)) + gVarJ.f());
    }

    @Override // so.i, so.l
    public void c() {
        if (this.f182649g) {
            return;
        }
        if (this.f182648f) {
            c2.e("PdfBox-Android", "Circular reference in GlyfCompositeDesc");
            return;
        }
        this.f182648f = true;
        int iE = 0;
        int iH = 0;
        for (g gVar : this.f182645c) {
            gVar.j(iE);
            gVar.i(iH);
            l lVar = this.f182646d.get(Integer.valueOf(gVar.d()));
            if (lVar != null) {
                lVar.c();
                iE += lVar.e();
                iH += lVar.h();
            }
        }
        this.f182649g = true;
        this.f182648f = false;
    }

    @Override // so.l
    public byte d(int i15) {
        g gVarJ = j(i15);
        if (gVarJ != null) {
            return this.f182646d.get(Integer.valueOf(gVarJ.d())).d(i15 - gVarJ.b());
        }
        return (byte) 0;
    }

    @Override // so.l
    public int e() {
        if (!this.f182649g) {
            c2.e("PdfBox-Android", "getPointCount called on unresolved GlyfCompositeDescript");
        }
        if (this.f182650h < 0) {
            List<g> list = this.f182645c;
            g gVar = list.get(list.size() - 1);
            l lVar = this.f182646d.get(Integer.valueOf(gVar.d()));
            if (lVar == null) {
                c2.e("PdfBox-Android", "GlyphDescription for index " + gVar.d() + " is null, returning 0");
                this.f182650h = 0;
            } else {
                this.f182650h = gVar.b() + lVar.e();
            }
        }
        return this.f182650h;
    }

    @Override // so.l
    public short f(int i15) {
        g gVarJ = j(i15);
        if (gVarJ == null) {
            return (short) 0;
        }
        l lVar = this.f182646d.get(Integer.valueOf(gVarJ.d()));
        int iB = i15 - gVarJ.b();
        return (short) (gVarJ.g(lVar.f(iB), lVar.b(iB)) + gVarJ.e());
    }

    @Override // so.l
    public int g(int i15) {
        g gVarK = k(i15);
        if (gVarK != null) {
            return this.f182646d.get(Integer.valueOf(gVarK.d())).g(i15 - gVarK.a()) + gVarK.b();
        }
        return 0;
    }

    @Override // so.i, so.l
    public int h() {
        if (!this.f182649g) {
            c2.e("PdfBox-Android", "getContourCount called on unresolved GlyfCompositeDescript");
        }
        if (this.f182651i < 0) {
            List<g> list = this.f182645c;
            g gVar = list.get(list.size() - 1);
            l lVar = this.f182646d.get(Integer.valueOf(gVar.d()));
            if (lVar == null) {
                c2.e("PdfBox-Android", "missing glyph description for index " + gVar.d());
                this.f182651i = 0;
            } else {
                this.f182651i = gVar.a() + lVar.h();
            }
        }
        return this.f182651i;
    }
}
