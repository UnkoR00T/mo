package hj;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.v;
import androidx.core.widget.c;
import com.google.android.material.internal.n;
import p007NuL.m;
import ri.b;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
public class a extends v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f85024g = k.f174088v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[][] f85025h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f85026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f85027f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.I);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f85026e == null) {
            int iD = bj.a.d(this, m.f329v);
            int iD2 = bj.a.d(this, b.f173909d);
            int iD3 = bj.a.d(this, b.f173912g);
            int[][] iArr = f85025h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = bj.a.j(iD3, iD, 1.0f);
            iArr2[1] = bj.a.j(iD3, iD2, 0.54f);
            iArr2[2] = bj.a.j(iD3, iD2, 0.38f);
            iArr2[3] = bj.a.j(iD3, iD2, 0.38f);
            this.f85026e = new ColorStateList(iArr, iArr2);
        }
        return this.f85026e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f85027f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z15) {
        this.f85027f = z15;
        if (z15) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i15) {
        int i16 = f85024g;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        Context context2 = getContext();
        TypedArray typedArrayI = n.i(context2, attributeSet, l.f174185l3, i15, i16, new int[0]);
        if (typedArrayI.hasValue(l.f174193m3)) {
            c.d(this, ij.c.a(context2, typedArrayI, l.f174193m3));
        }
        this.f85027f = typedArrayI.getBoolean(l.f174201n3, false);
        typedArrayI.recycle();
    }
}
