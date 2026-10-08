package oo;

import android.graphics.Path;
import android.graphics.PointF;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private to.c f147236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f147237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f147238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Path f147239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f147240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PointF f147241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PointF f147242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f147243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<PointF> f147244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected List<Object> f147245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f147246k;

    class a extends q {
        a() {
        }

        @Override // oo.q
        public List<Number> a(List<Number> list, p pVar) {
            return t.this.f(list, pVar);
        }
    }

    public t(to.c cVar, String str, String str2, List<Object> list) {
        this(cVar, str, str2);
        this.f147245j = list;
    }

    private void b(int i15) {
        if (i15 != 0) {
            if (i15 == 1) {
                this.f147243h = true;
                return;
            }
            c2.g("PdfBox-Android", "Invalid callothersubr parameter: " + i15);
            return;
        }
        this.f147243h = false;
        if (this.f147244i.size() < 7) {
            c2.g("PdfBox-Android", "flex without moveTo in font " + this.f147237b + ", glyph " + this.f147238c + ", command " + this.f147246k);
            return;
        }
        PointF pointF = this.f147244i.get(0);
        PointF pointF2 = this.f147242g;
        pointF.set(pointF2.x + pointF.x, pointF2.y + pointF.y);
        PointF pointF3 = this.f147244i.get(1);
        pointF3.set(pointF.x + pointF3.x, pointF.y + pointF3.y);
        float f15 = pointF3.x;
        PointF pointF4 = this.f147242g;
        pointF3.set(f15 - pointF4.x, pointF3.y - pointF4.y);
        PointF pointF5 = this.f147244i.get(1);
        PointF pointF6 = this.f147244i.get(2);
        PointF pointF7 = this.f147244i.get(3);
        j(Float.valueOf(pointF5.x), Float.valueOf(pointF5.y), Float.valueOf(pointF6.x), Float.valueOf(pointF6.y), Float.valueOf(pointF7.x), Float.valueOf(pointF7.y));
        PointF pointF8 = this.f147244i.get(4);
        PointF pointF9 = this.f147244i.get(5);
        PointF pointF10 = this.f147244i.get(6);
        j(Float.valueOf(pointF8.x), Float.valueOf(pointF8.y), Float.valueOf(pointF9.x), Float.valueOf(pointF9.y), Float.valueOf(pointF10.x), Float.valueOf(pointF10.y));
        this.f147244i.clear();
    }

    private void c() {
        if (this.f147239d.isEmpty()) {
            c2.g("PdfBox-Android", "closepath without initial moveTo in font " + this.f147237b + ", glyph " + this.f147238c);
        } else {
            this.f147239d.close();
        }
        Path path = this.f147239d;
        PointF pointF = this.f147242g;
        path.moveTo(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Number> f(List<Number> list, p pVar) {
        this.f147246k++;
        String str = p.f147229b.get(pVar.a());
        if ("rmoveto".equals(str)) {
            if (list.size() < 2) {
                return null;
            }
            if (this.f147243h) {
                this.f147244i.add(new PointF(list.get(0).floatValue(), list.get(1).floatValue()));
                return null;
            }
            i(list.get(0), list.get(1));
            return null;
        }
        if ("vmoveto".equals(str)) {
            if (list.isEmpty()) {
                return null;
            }
            if (this.f147243h) {
                this.f147244i.add(new PointF(0.0f, list.get(0).floatValue()));
                return null;
            }
            i(0, list.get(0));
            return null;
        }
        if ("hmoveto".equals(str)) {
            if (list.isEmpty()) {
                return null;
            }
            if (this.f147243h) {
                this.f147244i.add(new PointF(list.get(0).floatValue(), 0.0f));
                return null;
            }
            i(list.get(0), 0);
            return null;
        }
        if ("rlineto".equals(str)) {
            if (list.size() < 2) {
                return null;
            }
            h(list.get(0), list.get(1));
            return null;
        }
        if ("hlineto".equals(str)) {
            if (list.isEmpty()) {
                return null;
            }
            h(list.get(0), 0);
            return null;
        }
        if ("vlineto".equals(str)) {
            if (list.isEmpty()) {
                return null;
            }
            h(0, list.get(0));
            return null;
        }
        if ("rrcurveto".equals(str)) {
            if (list.size() < 6) {
                return null;
            }
            j(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5));
            return null;
        }
        if ("closepath".equals(str)) {
            c();
            return null;
        }
        if ("sbw".equals(str)) {
            if (list.size() < 3) {
                return null;
            }
            this.f147241f = new PointF(list.get(0).floatValue(), list.get(1).floatValue());
            this.f147240e = list.get(2).intValue();
            this.f147242g.set(this.f147241f);
            return null;
        }
        if ("hsbw".equals(str)) {
            if (list.size() < 2) {
                return null;
            }
            this.f147241f = new PointF(list.get(0).floatValue(), 0.0f);
            this.f147240e = list.get(1).intValue();
            this.f147242g.set(this.f147241f);
            return null;
        }
        if ("vhcurveto".equals(str)) {
            if (list.size() < 4) {
                return null;
            }
            j(0, list.get(0), list.get(1), list.get(2), list.get(3), 0);
            return null;
        }
        if ("hvcurveto".equals(str)) {
            if (list.size() < 4) {
                return null;
            }
            j(list.get(0), 0, list.get(1), list.get(2), 0, list.get(3));
            return null;
        }
        if ("seac".equals(str)) {
            if (list.size() < 5) {
                return null;
            }
            k(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
            return null;
        }
        if ("setcurrentpoint".equals(str)) {
            if (list.size() < 2) {
                return null;
            }
            l(list.get(0), list.get(1));
            return null;
        }
        if ("callothersubr".equals(str)) {
            if (list.isEmpty()) {
                return null;
            }
            b(list.get(0).intValue());
            return null;
        }
        if ("div".equals(str)) {
            if (list.size() < 2) {
                return null;
            }
            float fFloatValue = list.get(list.size() - 2).floatValue() / list.get(list.size() - 1).floatValue();
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(Float.valueOf(fFloatValue));
            return arrayList;
        }
        if ("hstem".equals(str) || "vstem".equals(str) || "hstem3".equals(str) || "vstem3".equals(str) || "dotsection".equals(str) || "endchar".equals(str)) {
            return null;
        }
        if ("return".equals(str) || "callsubr".equals(str)) {
            c2.g("PdfBox-Android", "Unexpected charstring command: " + str + " in glyph " + this.f147238c + " of font " + this.f147237b);
            return null;
        }
        if (str != null) {
            throw new IllegalArgumentException("Unhandled command: " + str);
        }
        c2.g("PdfBox-Android", "Unknown charstring command: " + pVar.a() + " in glyph " + this.f147238c + " of font " + this.f147237b);
        return null;
    }

    private void g() {
        this.f147239d = new Path();
        this.f147241f = new PointF(0.0f, 0.0f);
        this.f147240e = 0;
        new a().b(this.f147245j);
    }

    private void h(Number number, Number number2) {
        float fFloatValue = this.f147242g.x + number.floatValue();
        float fFloatValue2 = this.f147242g.y + number2.floatValue();
        if (this.f147239d.isEmpty()) {
            c2.g("PdfBox-Android", "rlineTo without initial moveTo in font " + this.f147237b + ", glyph " + this.f147238c);
            this.f147239d.moveTo(fFloatValue, fFloatValue2);
        } else {
            this.f147239d.lineTo(fFloatValue, fFloatValue2);
        }
        this.f147242g.set(fFloatValue, fFloatValue2);
    }

    private void i(Number number, Number number2) {
        float fFloatValue = this.f147242g.x + number.floatValue();
        float fFloatValue2 = this.f147242g.y + number2.floatValue();
        this.f147239d.moveTo(fFloatValue, fFloatValue2);
        this.f147242g.set(fFloatValue, fFloatValue2);
    }

    private void j(Number number, Number number2, Number number3, Number number4, Number number5, Number number6) {
        float fFloatValue = this.f147242g.x + number.floatValue();
        float fFloatValue2 = this.f147242g.y + number2.floatValue();
        float fFloatValue3 = fFloatValue + number3.floatValue();
        float fFloatValue4 = fFloatValue2 + number4.floatValue();
        float fFloatValue5 = fFloatValue3 + number5.floatValue();
        float fFloatValue6 = fFloatValue4 + number6.floatValue();
        if (this.f147239d.isEmpty()) {
            c2.g("PdfBox-Android", "rrcurveTo without initial moveTo in font " + this.f147237b + ", glyph " + this.f147238c);
            this.f147239d.moveTo(fFloatValue5, fFloatValue6);
        } else {
            this.f147239d.cubicTo(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6);
        }
        this.f147242g.set(fFloatValue5, fFloatValue6);
    }

    private void k(Number number, Number number2, Number number3, Number number4, Number number5) {
        String strC = qo.c.f167554d.c(number4.intValue());
        try {
            this.f147239d.op(this.f147236a.a(strC).d(), Path.Op.UNION);
        } catch (IOException unused) {
            c2.g("PdfBox-Android", "invalid seac character in glyph " + this.f147238c + " of font " + this.f147237b);
        }
        String strC2 = qo.c.f167554d.c(number5.intValue());
        try {
            t tVarA = this.f147236a.a(strC2);
            if (this.f147239d == tVarA.d()) {
                c2.g("PdfBox-Android", "Path for " + strC + " and for accent " + strC2 + " are same, ignored");
            } else {
                wo.a.n((this.f147241f.x + number2.floatValue()) - number.floatValue(), this.f147241f.y + number3.floatValue());
                this.f147239d.op(tVarA.d(), Path.Op.UNION);
            }
        } catch (IOException unused2) {
            c2.g("PdfBox-Android", "invalid seac character in glyph " + this.f147238c + " of font " + this.f147237b);
        }
    }

    private void l(Number number, Number number2) {
        this.f147242g.set(number.floatValue(), number2.floatValue());
    }

    public Path d() {
        if (this.f147239d == null) {
            g();
        }
        return this.f147239d;
    }

    public int e() {
        if (this.f147239d == null) {
            g();
        }
        return this.f147240e;
    }

    public String toString() {
        return this.f147245j.toString().replace("|", "\n").replace(",", " ");
    }

    protected t(to.c cVar, String str, String str2) {
        this.f147239d = null;
        this.f147240e = 0;
        this.f147241f = null;
        this.f147242g = null;
        this.f147243h = false;
        this.f147244i = new ArrayList();
        this.f147236a = cVar;
        this.f147237b = str;
        this.f147238c = str2;
        this.f147242g = new PointF(0.0f, 0.0f);
    }
}
