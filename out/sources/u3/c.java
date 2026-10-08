package u3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import c5.h;
import fr.t;
import java.io.IOException;
import java.util.List;
import n3.a1;
import n3.a3;
import n3.b3;
import n3.o1;
import n3.o2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p071kotlin.Metadata;
import t3.d;
import t3.j;
import t3.o;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001e\u001a9\u0010%\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010&¨\u0006("}, d2 = {"", "id", "Ln3/a3;", "defValue", "b", "(II)I", "Ln3/b3;", "c", "Lorg/xmlpull/v1/XmlPullParser;", "", "d", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Lu3/a;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Lt3/d$a;", "builder", "nestedGroups", "g", "(Lu3/a;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lt3/d$a;I)I", "j", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", "a", "(Lu3/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Lt3/d$a;", "Loq/i0;", "i", "(Lu3/a;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Lt3/d$a;)V", "Lw5/d;", "complexColor", "Landroidx/compose/ui/graphics/c;", "e", "(Lw5/d;)Landroidx/compose/ui/graphics/c;", "f", "h", "I", "FILL_TYPE_WINDING", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f194953a = 0;

    public static final d.a a(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jH;
        int iZ;
        ColorStateList colorStateListF;
        b bVar = b.f194927a;
        TypedArray typedArrayL = androidVectorParser.l(resources, theme, attributeSet, bVar.F());
        boolean zE = androidVectorParser.e(typedArrayL, "autoMirrored", bVar.a(), false);
        float fH = androidVectorParser.h(typedArrayL, "viewportWidth", bVar.H(), 0.0f);
        float fH2 = androidVectorParser.h(typedArrayL, "viewportHeight", bVar.G(), 0.0f);
        if (fH <= 0.0f) {
            throw new XmlPullParserException(typedArrayL.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fH2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayL.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fB = androidVectorParser.b(typedArrayL, bVar.I(), 0.0f);
        float fB2 = androidVectorParser.b(typedArrayL, bVar.n(), 0.0f);
        if (typedArrayL.hasValue(bVar.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayL.getValue(bVar.D(), typedValue);
            jH = (typedValue.type == 2 || (colorStateListF = androidVectorParser.f(typedArrayL, theme, "tint", bVar.D())) == null) ? Color.INSTANCE.h() : o1.b(colorStateListF.getDefaultColor());
        } else {
            jH = Color.INSTANCE.h();
        }
        long j15 = jH;
        int iD = androidVectorParser.d(typedArrayL, bVar.E(), -1);
        if (iD == -1) {
            iZ = a1.INSTANCE.z();
        } else if (iD == 3) {
            iZ = a1.INSTANCE.B();
        } else if (iD == 5) {
            iZ = a1.INSTANCE.z();
        } else if (iD != 9) {
            switch (iD) {
                case 14:
                    iZ = a1.INSTANCE.q();
                    break;
                case 15:
                    iZ = a1.INSTANCE.v();
                    break;
                case 16:
                    iZ = a1.INSTANCE.t();
                    break;
                default:
                    iZ = a1.INSTANCE.z();
                    break;
            }
        } else {
            iZ = a1.INSTANCE.y();
        }
        int i15 = iZ;
        float fN = h.n(fB / resources.getDisplayMetrics().density);
        float fN2 = h.n(fB2 / resources.getDisplayMetrics().density);
        typedArrayL.recycle();
        return new d.a(null, fN, fN2, fH, fH2, j15, i15, zE, 1, null);
    }

    private static final int b(int i15, int i16) {
        if (i15 == 0) {
            return a3.INSTANCE.a();
        }
        if (i15 != 1) {
            return i15 != 2 ? i16 : a3.INSTANCE.c();
        }
        return a3.INSTANCE.b();
    }

    private static final int c(int i15, int i16) {
        if (i15 == 0) {
            return b3.INSTANCE.b();
        }
        if (i15 != 1) {
            return i15 != 2 ? i16 : b3.INSTANCE.a();
        }
        return b3.INSTANCE.c();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    private static final androidx.compose.ui.graphics.c e(w5.d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? androidx.compose.ui.graphics.d.a(shaderF) : new SolidColor(o1.b(dVar.e()), null);
    }

    public static final void f(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) {
        b bVar = b.f194927a;
        TypedArray typedArrayL = androidVectorParser.l(resources, theme, attributeSet, bVar.b());
        String strJ = androidVectorParser.j(typedArrayL, bVar.c());
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        String strJ2 = androidVectorParser.j(typedArrayL, bVar.d());
        List listD = strJ2 == null ? o.d() : j.b(androidVectorParser.pathParser, strJ2, null, 2, null);
        typedArrayL.recycle();
        d.a.b(aVar, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listD, 254, null);
    }

    public static final int g(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, d.a aVar, int i15) throws XmlPullParserException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !t.c("group", androidVectorParser.getXmlParser().getName())) {
                return i15;
            }
            int i16 = i15 + 1;
            for (int i17 = 0; i17 < i16; i17++) {
                aVar.g();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i15;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i15;
            }
            f(androidVectorParser, resources, theme, attributeSet, aVar);
            return i15 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i15;
            }
            i(androidVectorParser, resources, theme, attributeSet, aVar);
            return i15;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i15;
        }
        h(androidVectorParser, resources, theme, attributeSet, aVar);
        return i15;
    }

    public static final void h(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) {
        b bVar = b.f194927a;
        TypedArray typedArrayL = androidVectorParser.l(resources, theme, attributeSet, bVar.e());
        float fH = androidVectorParser.h(typedArrayL, "rotation", bVar.i(), 0.0f);
        float fC = androidVectorParser.c(typedArrayL, bVar.g(), 0.0f);
        float fC2 = androidVectorParser.c(typedArrayL, bVar.h(), 0.0f);
        float fH2 = androidVectorParser.h(typedArrayL, "scaleX", bVar.j(), 1.0f);
        float fH3 = androidVectorParser.h(typedArrayL, "scaleY", bVar.k(), 1.0f);
        float fH4 = androidVectorParser.h(typedArrayL, "translateX", bVar.l(), 0.0f);
        float fH5 = androidVectorParser.h(typedArrayL, "translateY", bVar.m(), 0.0f);
        String strJ = androidVectorParser.j(typedArrayL, bVar.f());
        if (strJ == null) {
            strJ = "";
        }
        typedArrayL.recycle();
        aVar.a(strJ, fH, fC, fC2, fH2, fH3, fH4, fH5, o.d());
    }

    public static final void i(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar) {
        b bVar = b.f194927a;
        TypedArray typedArrayL = androidVectorParser.l(resources, theme, attributeSet, bVar.o());
        if (!k.h(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strJ = androidVectorParser.j(typedArrayL, bVar.r());
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        String strJ2 = androidVectorParser.j(typedArrayL, bVar.s());
        List<? extends t3.h> listD = strJ2 == null ? o.d() : j.b(androidVectorParser.pathParser, strJ2, null, 2, null);
        w5.d dVarG = androidVectorParser.g(typedArrayL, theme, "fillColor", bVar.q(), 0);
        float fH = androidVectorParser.h(typedArrayL, "fillAlpha", bVar.p(), 1.0f);
        int iB = b(androidVectorParser.i(typedArrayL, "strokeLineCap", bVar.v(), -1), a3.INSTANCE.a());
        int iC = c(androidVectorParser.i(typedArrayL, "strokeLineJoin", bVar.w(), -1), b3.INSTANCE.b());
        float fH2 = androidVectorParser.h(typedArrayL, "strokeMiterLimit", bVar.x(), 4.0f);
        w5.d dVarG2 = androidVectorParser.g(typedArrayL, theme, "strokeColor", bVar.u(), 0);
        float fH3 = androidVectorParser.h(typedArrayL, "strokeAlpha", bVar.t(), 1.0f);
        float fH4 = androidVectorParser.h(typedArrayL, "strokeWidth", bVar.y(), 1.0f);
        float fH5 = androidVectorParser.h(typedArrayL, "trimPathEnd", bVar.z(), 1.0f);
        float fH6 = androidVectorParser.h(typedArrayL, "trimPathOffset", bVar.B(), 0.0f);
        float fH7 = androidVectorParser.h(typedArrayL, "trimPathStart", bVar.C(), 0.0f);
        int i15 = androidVectorParser.i(typedArrayL, "fillType", bVar.A(), f194953a);
        typedArrayL.recycle();
        aVar.c(listD, i15 == 0 ? o2.INSTANCE.b() : o2.INSTANCE.a(), str, e(dVarG), fH, e(dVarG2), fH3, fH4, iB, iC, fH2, fH7, fH5, fH6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
