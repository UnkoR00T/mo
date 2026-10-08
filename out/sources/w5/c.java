package w5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import io.sentry.android.core.c2;
import java.io.IOException;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f210235a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f210235a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int i15, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i15), theme);
        } catch (Exception e15) {
            c2.f("CSLCompat", "Failed to inflate ColorStateList.", e15);
            return null;
        }
    }

    private static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i15 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i16 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i15 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayH = h(resources, theme, attributeSet, r5.g.f171838b);
                int resourceId = typedArrayH.getResourceId(r5.g.f171839c, -1);
                if (resourceId == -1 || f(resources, resourceId)) {
                    color = typedArrayH.getColor(r5.g.f171839c, -65281);
                } else {
                    try {
                        color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayH.getColor(r5.g.f171839c, -65281);
                    }
                }
                float f15 = 1.0f;
                if (typedArrayH.hasValue(r5.g.f171840d)) {
                    f15 = typedArrayH.getFloat(r5.g.f171840d, 1.0f);
                } else if (typedArrayH.hasValue(r5.g.f171842f)) {
                    f15 = typedArrayH.getFloat(r5.g.f171842f, 1.0f);
                }
                float f16 = (Build.VERSION.SDK_INT < 31 || !typedArrayH.hasValue(r5.g.f171841e)) ? typedArrayH.getFloat(r5.g.f171843g, -1.0f) : typedArrayH.getFloat(r5.g.f171841e, -1.0f);
                typedArrayH.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i17 = 0;
                for (int i18 = 0; i18 < attributeCount; i18++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i18);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != r5.a.f171794a && attributeNameResource != r5.a.f171795b) {
                        int i19 = i17 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i18, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i17] = attributeNameResource;
                        i17 = i19;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i17);
                iArrA = g.a(iArrA, i16, g(color, f15, f16));
                iArr = (int[][]) g.b(iArr, i16, iArrTrimStateSet);
                i16++;
            }
            i15 = 1;
        }
        int[] iArr3 = new int[i16];
        int[][] iArr4 = new int[i16][];
        System.arraycopy(iArrA, 0, iArr3, 0, i16);
        System.arraycopy(iArr, 0, iArr4, 0, i16);
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean f(Resources resources, int i15) {
        TypedValue typedValueC = c();
        resources.getValue(i15, typedValueC, true);
        int i16 = typedValueC.type;
        return i16 >= 28 && i16 <= 31;
    }

    private static int g(int i15, float f15, float f16) {
        boolean z15 = f16 >= 0.0f && f16 <= 100.0f;
        if (f15 == 1.0f && !z15) {
            return i15;
        }
        int iB = c6.a.b((int) ((Color.alpha(i15) * f15) + 0.5f), 0, GF2Field.MASK);
        if (z15) {
            a aVarC = a.c(i15);
            i15 = a.m(aVarC.j(), aVarC.i(), f16);
        }
        return (i15 & 16777215) | (iB << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
