package l4;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import n3.b2;
import n3.l0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln3/b2$a;", "Landroid/content/res/Resources;", "res", "", "id", "Ln3/b2;", "b", "(Ln3/b2$a;Landroid/content/res/Resources;I)Ln3/b2;", "a", "(Ln3/b2$a;ILm2/r;I)Ln3/b2;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final b2 a(b2.Companion companion, int i15, r rVar, int i16) {
        if (t.k()) {
            t.o(-304919470, i16, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Resources resources = (Resources) rVar.N(AndroidCompositionLocals_androidKt.f());
        Object objE = rVar.E();
        r.Companion companion2 = r.INSTANCE;
        if (objE == companion2.a()) {
            objE = new TypedValue();
            rVar.v(objE);
        }
        TypedValue typedValue = (TypedValue) objE;
        resources.getValue(i15, typedValue, true);
        boolean zW = rVar.W(typedValue.string.toString());
        Object objE2 = rVar.E();
        if (zW || objE2 == companion2.a()) {
            objE2 = b(companion, resources, i15);
            rVar.v(objE2);
        }
        b2 b2Var = (b2) objE2;
        if (t.k()) {
            t.n();
        }
        return b2Var;
    }

    public static final b2 b(b2.Companion companion, Resources resources, int i15) {
        return l0.c(((BitmapDrawable) resources.getDrawable(i15, null)).getBitmap());
    }
}
