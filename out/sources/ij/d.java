package ij;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Xml;
import p007NuL.v;
import ri.l;
import w5.h;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f93007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f93008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f93009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f93011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f93013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f93014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f93015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f93016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f93017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f93018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f93019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f93020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f93021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f93022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f93023q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f93024r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Typeface f93025s;

    class a extends h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f93026a;

        a(f fVar) {
            this.f93026a = fVar;
        }

        @Override // w5.h.e
        public void f(int i15) {
            d.this.f93023q = true;
            this.f93026a.a(i15);
        }

        @Override // w5.h.e
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f93025s = Typeface.create(typeface, dVar.f93012f);
            d.this.f93023q = true;
            this.f93026a.b(d.this.f93025s, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f93028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f93029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f93030c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f93028a = context;
            this.f93029b = textPaint;
            this.f93030c = fVar;
        }

        @Override // ij.f
        public void a(int i15) {
            this.f93030c.a(i15);
        }

        @Override // ij.f
        public void b(Typeface typeface, boolean z15) {
            d.this.r(this.f93028a, this.f93029b, typeface);
            this.f93030c.b(typeface, z15);
        }
    }

    public d(Context context, int i15) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i15, v.f505n2);
        o(typedArrayObtainStyledAttributes.getDimension(v.f510o2, 0.0f));
        n(c.a(context, typedArrayObtainStyledAttributes, v.f525r2));
        this.f93007a = c.a(context, typedArrayObtainStyledAttributes, v.f530s2);
        this.f93008b = c.a(context, typedArrayObtainStyledAttributes, v.f535t2);
        this.f93012f = typedArrayObtainStyledAttributes.getInt(v.f520q2, 0);
        this.f93013g = typedArrayObtainStyledAttributes.getInt(v.f515p2, 1);
        int iF = c.f(typedArrayObtainStyledAttributes, v.A2, v.f555y2);
        this.f93022p = typedArrayObtainStyledAttributes.getResourceId(iF, 0);
        this.f93010d = typedArrayObtainStyledAttributes.getString(iF);
        this.f93014h = typedArrayObtainStyledAttributes.getBoolean(v.C2, false);
        this.f93009c = c.a(context, typedArrayObtainStyledAttributes, v.f539u2);
        this.f93015i = typedArrayObtainStyledAttributes.getFloat(v.f543v2, 0.0f);
        this.f93016j = typedArrayObtainStyledAttributes.getFloat(v.f547w2, 0.0f);
        this.f93017k = typedArrayObtainStyledAttributes.getFloat(v.f551x2, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i15, l.f174265v3);
        this.f93018l = typedArrayObtainStyledAttributes2.hasValue(l.f174273w3);
        this.f93019m = typedArrayObtainStyledAttributes2.getFloat(l.f174273w3, 0.0f);
        this.f93011e = typedArrayObtainStyledAttributes2.getString(c.f(typedArrayObtainStyledAttributes2, l.f174297z3, l.f174281x3));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f93025s == null && (str = this.f93010d) != null) {
            this.f93025s = Typeface.create(str, this.f93012f);
        }
        if (this.f93025s == null) {
            int i15 = this.f93013g;
            if (i15 == 1) {
                this.f93025s = Typeface.SANS_SERIF;
            } else if (i15 == 2) {
                this.f93025s = Typeface.SERIF;
            } else if (i15 != 3) {
                this.f93025s = Typeface.DEFAULT;
            } else {
                this.f93025s = Typeface.MONOSPACE;
            }
            this.f93025s = Typeface.create(this.f93025s, this.f93012f);
        }
    }

    private Typeface i(Context context) {
        Typeface typefaceCreate;
        if (this.f93024r) {
            return null;
        }
        this.f93024r = true;
        String strM = m(context, this.f93022p);
        if (strM == null || (typefaceCreate = Typeface.create(strM, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.f93012f);
    }

    private boolean l(Context context) {
        if (e.a()) {
            f(context);
            return true;
        }
        if (this.f93023q) {
            return true;
        }
        int i15 = this.f93022p;
        if (i15 == 0) {
            return false;
        }
        Typeface typefaceC = h.c(context, i15);
        if (typefaceC != null) {
            this.f93025s = typefaceC;
            this.f93023q = true;
            return true;
        }
        Typeface typefaceI = i(context);
        if (typefaceI == null) {
            return false;
        }
        this.f93025s = typefaceI;
        this.f93023q = true;
        return true;
    }

    @SuppressLint({"ResourceType"})
    private static String m(Context context, int i15) {
        Resources resources = context.getResources();
        if (i15 != 0 && resources.getResourceTypeName(i15).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i15);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), r5.g.f171844h);
                        String string = typedArrayObtainAttributes.getString(r5.g.f171852p);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Typeface e() {
        d();
        return this.f93025s;
    }

    public Typeface f(Context context) {
        if (this.f93023q) {
            return this.f93025s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = h.g(context, this.f93022p);
                this.f93025s = typefaceG;
                if (typefaceG != null) {
                    this.f93025s = Typeface.create(typefaceG, this.f93012f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        d();
        this.f93023q = true;
        return this.f93025s;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        r(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (!l(context)) {
            d();
        }
        int i15 = this.f93022p;
        if (i15 == 0) {
            this.f93023q = true;
        }
        if (this.f93023q) {
            fVar.b(this.f93025s, true);
            return;
        }
        try {
            h.i(context, i15, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f93023q = true;
            fVar.a(1);
        } catch (Exception unused2) {
            this.f93023q = true;
            fVar.a(-3);
        }
    }

    public ColorStateList j() {
        return this.f93020n;
    }

    public float k() {
        return this.f93021o;
    }

    public void n(ColorStateList colorStateList) {
        this.f93020n = colorStateList;
    }

    public void o(float f15) {
        this.f93021o = f15;
    }

    public void p(Context context, TextPaint textPaint, f fVar) {
        q(context, textPaint, fVar);
        ColorStateList colorStateList = this.f93020n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f15 = this.f93017k;
        float f16 = this.f93015i;
        float f17 = this.f93016j;
        ColorStateList colorStateList2 = this.f93009c;
        textPaint.setShadowLayer(f15, f16, f17, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void q(Context context, TextPaint textPaint, f fVar) {
        Typeface typeface;
        if (l(context) && this.f93023q && (typeface = this.f93025s) != null) {
            r(context, textPaint, typeface);
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = g.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i15 = this.f93012f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i15 & 1) != 0);
        textPaint.setTextSkewX((i15 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f93021o);
        textPaint.setFontVariationSettings(this.f93011e);
        if (this.f93018l) {
            textPaint.setLetterSpacing(this.f93019m);
        }
    }
}
