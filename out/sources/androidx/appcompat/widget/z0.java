package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f9101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f9102c;

    private z0(Context context, TypedArray typedArray) {
        this.f9100a = context;
        this.f9101b = typedArray;
    }

    public static z0 t(Context context, int i15, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(i15, iArr));
    }

    public static z0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static z0 v(Context context, AttributeSet attributeSet, int[] iArr, int i15, int i16) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i15, i16));
    }

    public boolean a(int i15, boolean z15) {
        return this.f9101b.getBoolean(i15, z15);
    }

    public int b(int i15, int i16) {
        return this.f9101b.getColor(i15, i16);
    }

    public ColorStateList c(int i15) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f9101b.hasValue(i15) || (resourceId = this.f9101b.getResourceId(i15, 0)) == 0 || (colorStateListA = p082nUL.y.a(this.f9100a, resourceId)) == null) ? this.f9101b.getColorStateList(i15) : colorStateListA;
    }

    public float d(int i15, float f15) {
        return this.f9101b.getDimension(i15, f15);
    }

    public int e(int i15, int i16) {
        return this.f9101b.getDimensionPixelOffset(i15, i16);
    }

    public int f(int i15, int i16) {
        return this.f9101b.getDimensionPixelSize(i15, i16);
    }

    public Drawable g(int i15) {
        int resourceId;
        return (!this.f9101b.hasValue(i15) || (resourceId = this.f9101b.getResourceId(i15, 0)) == 0) ? this.f9101b.getDrawable(i15) : p082nUL.y.b(this.f9100a, resourceId);
    }

    public Drawable h(int i15) {
        int resourceId;
        if (!this.f9101b.hasValue(i15) || (resourceId = this.f9101b.getResourceId(i15, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f9100a, resourceId, true);
    }

    public float i(int i15, float f15) {
        return this.f9101b.getFloat(i15, f15);
    }

    public Typeface j(int i15, int i16, w5.h.e eVar) {
        int resourceId = this.f9101b.getResourceId(i15, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f9102c == null) {
            this.f9102c = new TypedValue();
        }
        return w5.h.h(this.f9100a, resourceId, this.f9102c, i16, eVar);
    }

    public int k(int i15, int i16) {
        return this.f9101b.getInt(i15, i16);
    }

    public int l(int i15, int i16) {
        return this.f9101b.getInteger(i15, i16);
    }

    public int m(int i15, int i16) {
        return this.f9101b.getLayoutDimension(i15, i16);
    }

    public int n(int i15, int i16) {
        return this.f9101b.getResourceId(i15, i16);
    }

    public String o(int i15) {
        return this.f9101b.getString(i15);
    }

    public CharSequence p(int i15) {
        return this.f9101b.getText(i15);
    }

    public CharSequence[] q(int i15) {
        return this.f9101b.getTextArray(i15);
    }

    public TypedArray r() {
        return this.f9101b;
    }

    public boolean s(int i15) {
        return this.f9101b.hasValue(i15);
    }

    public TypedValue w(int i15) {
        return this.f9101b.peekValue(i15);
    }

    public void x() {
        this.f9101b.recycle();
    }
}
