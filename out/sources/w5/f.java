package w5;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class f {
    private static a a(a aVar, int i15, int i16, boolean z15, int i17) {
        if (aVar != null) {
            return aVar;
        }
        return z15 ? new a(i15, i17, i16) : new a(i15, i16);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, r5.g.F);
        float f15 = k.f(typedArrayI, xmlPullParser, "startX", r5.g.O, 0.0f);
        float f16 = k.f(typedArrayI, xmlPullParser, "startY", r5.g.P, 0.0f);
        float f17 = k.f(typedArrayI, xmlPullParser, "endX", r5.g.Q, 0.0f);
        float f18 = k.f(typedArrayI, xmlPullParser, "endY", r5.g.R, 0.0f);
        float f19 = k.f(typedArrayI, xmlPullParser, "centerX", r5.g.J, 0.0f);
        float f25 = k.f(typedArrayI, xmlPullParser, "centerY", r5.g.K, 0.0f);
        int iG = k.g(typedArrayI, xmlPullParser, "type", r5.g.I, 0);
        int iB = k.b(typedArrayI, xmlPullParser, "startColor", r5.g.G, 0);
        boolean zH = k.h(xmlPullParser, "centerColor");
        int iB2 = k.b(typedArrayI, xmlPullParser, "centerColor", r5.g.N, 0);
        int iB3 = k.b(typedArrayI, xmlPullParser, "endColor", r5.g.H, 0);
        int iG2 = k.g(typedArrayI, xmlPullParser, "tileMode", r5.g.M, 0);
        float f26 = k.f(typedArrayI, xmlPullParser, "gradientRadius", r5.g.L, 0.0f);
        typedArrayI.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zH, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f15, f16, f17, f18, aVarA.f210250a, aVarA.f210251b, d(iG2)) : new SweepGradient(f19, f25, aVarA.f210250a, aVarA.f210251b);
        }
        if (f26 > 0.0f) {
            return new RadialGradient(f19, f25, f26, aVarA.f210250a, aVarA.f210251b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, r5.g.S);
                boolean zHasValue = typedArrayI.hasValue(r5.g.T);
                boolean zHasValue2 = typedArrayI.hasValue(r5.g.U);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayI.getColor(r5.g.T, 0);
                float f15 = typedArrayI.getFloat(r5.g.U, 0.0f);
                typedArrayI.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f15));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i15) {
        if (i15 != 1) {
            return i15 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f210250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f210251b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f210250a = new int[size];
            this.f210251b = new float[size];
            for (int i15 = 0; i15 < size; i15++) {
                this.f210250a[i15] = list.get(i15).intValue();
                this.f210251b[i15] = list2.get(i15).floatValue();
            }
        }

        a(int i15, int i16) {
            this.f210250a = new int[]{i15, i16};
            this.f210251b = new float[]{0.0f, 1.0f};
        }

        a(int i15, int i16, int i17) {
            this.f210250a = new int[]{i15, i16, i17};
            this.f210251b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
