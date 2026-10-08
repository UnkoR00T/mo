package y0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\r\u001a\u00020\u000b*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u000b*\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u000b*\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly0/j;", "b", "(Lm2/r;I)Ly0/j;", "", "backgroundStyleId", "foregroundStyleId", "a", "(IILm2/r;I)Ly0/j;", "Landroid/content/Context;", "resId", "attrId", "Landroidx/compose/ui/graphics/Color;", "defaultColor", "e", "(Landroid/content/Context;IIJ)J", "Landroid/content/res/ColorStateList;", "f", "(Landroid/content/Context;II)Landroid/content/res/ColorStateList;", "d", "(Landroid/content/res/ColorStateList;J)J", "c", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    public static final ContextMenuColors a(int i15, int i16, p076m2.r rVar, int i17) {
        if (p076m2.t.k()) {
            p076m2.t.o(1689505294, i17, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:41)");
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        Object obj = (Configuration) rVar.N(AndroidCompositionLocals_androidKt.b());
        boolean zW = rVar.W(obj) | rVar.W(context);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            long jE = e(context, i15, R.attr.colorBackground, d0.v().getBackgroundColor());
            ColorStateList colorStateListF = f(context, i16, R.attr.textColorPrimary);
            long jD = d(colorStateListF, d0.v().getTextColor());
            long jC = c(colorStateListF, d0.v().getDisabledTextColor());
            Object contextMenuColors = new ContextMenuColors(jE, jD, jD, jC, jC, null);
            rVar.v(contextMenuColors);
            objE = contextMenuColors;
        }
        ContextMenuColors contextMenuColors2 = (ContextMenuColors) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return contextMenuColors2;
    }

    public static final ContextMenuColors b(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1428061410, i15, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:32)");
        }
        ContextMenuColors contextMenuColorsA = a(R.style.Widget.PopupMenu, R.style.TextAppearance.Widget.PopupMenu.Large, rVar, 54);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return contextMenuColorsA;
    }

    private static final long c(ColorStateList colorStateList, long j15) {
        int iJ = o1.j(j15);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iJ)) : null;
        return (numValueOf == null || numValueOf.intValue() == iJ) ? j15 : o1.b(numValueOf.intValue());
    }

    private static final long d(ColorStateList colorStateList, long j15) {
        int iJ = o1.j(j15);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iJ)) : null;
        return (numValueOf == null || numValueOf.intValue() == iJ) ? j15 : o1.b(numValueOf.intValue());
    }

    private static final long e(Context context, int i15, int i16, long j15) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i15, new int[]{i16});
        int iJ = o1.j(j15);
        int color = typedArrayObtainStyledAttributes.getColor(0, iJ);
        typedArrayObtainStyledAttributes.recycle();
        return color == iJ ? j15 : o1.b(color);
    }

    private static final ColorStateList f(Context context, int i15, int i16) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i15, new int[]{i16});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }
}
