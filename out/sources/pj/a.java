package pj;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;
import p007NuL.m;
import ri.b;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f157926a = {R.attr.theme, m.N};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f157927b = {b.f173926u};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f157926a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int[] b(Context context, AttributeSet attributeSet, int[] iArr, int i15, int i16) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i15, i16);
            for (int i17 = 0; i17 < iArr.length; i17++) {
                iArr2[i17] = typedArrayObtainStyledAttributes.getResourceId(i17, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    private static int c(Context context, AttributeSet attributeSet, int i15, int i16) {
        return b(context, attributeSet, f157927b, i15, i16)[0];
    }

    public static Context d(Context context, AttributeSet attributeSet, int i15, int i16) {
        return e(context, attributeSet, i15, i16, new int[0]);
    }

    public static Context e(Context context, AttributeSet attributeSet, int i15, int i16, int[] iArr) {
        int iC = c(context, attributeSet, i15, i16);
        boolean z15 = (context instanceof d) && ((d) context).c() == iC;
        if (iC == 0 || z15) {
            return context;
        }
        d dVar = new d(context, iC);
        for (int i17 : b(context, attributeSet, iArr, i15, i16)) {
            if (i17 != 0) {
                dVar.getTheme().applyStyle(i17, true);
            }
        }
        int iA = a(context, attributeSet);
        if (iA != 0) {
            dVar.getTheme().applyStyle(iA, true);
        }
        return dVar;
    }
}
