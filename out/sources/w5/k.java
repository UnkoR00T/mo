package w5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i15, boolean z15) {
        return !h(xmlPullParser, str) ? z15 : typedArray.getBoolean(i15, z15);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i15, int i16) {
        return !h(xmlPullParser, str) ? i16 : typedArray.getColor(i15, i16);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i15) {
        if (!h(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i15, typedValue);
        int i16 = typedValue.type;
        if (i16 != 2) {
            return (i16 < 28 || i16 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i15, 0), theme) : d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i15 + ": " + typedValue);
    }

    private static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i15, int i16) {
        if (h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i15, typedValue);
            int i17 = typedValue.type;
            if (i17 >= 28 && i17 <= 31) {
                return d.b(typedValue.data);
            }
            d dVarG = d.g(typedArray.getResources(), typedArray.getResourceId(i15, 0), theme);
            if (dVarG != null) {
                return dVarG;
            }
        }
        return d.b(i16);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i15, float f15) {
        return !h(xmlPullParser, str) ? f15 : typedArray.getFloat(i15, f15);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i15, int i16) {
        return !h(xmlPullParser, str) ? i16 : typedArray.getInt(i15, i16);
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
