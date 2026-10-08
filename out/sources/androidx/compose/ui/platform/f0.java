package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0013*\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\".\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ln3/g2;", "other", "Loq/i0;", "k", "([F[F)V", "", "x", "y", "tmpMatrix", "l", "([FFF[F)V", "m1", "", "row", "m2", "column", "h", "([FI[FI)F", "Landroid/view/View;", "", "f", "(Landroid/view/View;Landroid/view/View;)Z", "Li3/j;", "i", "(Landroid/view/View;)Li3/j;", "Landroid/content/res/Configuration;", "g", "(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Z", "Lkotlin/Function1;", "Lv4/m0;", "a", "Ler/l;", "j", "()Ler/l;", "setPlatformTextInputServiceInterceptor", "(Ler/l;)V", "platformTextInputServiceInterceptor", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static er.l<? super v4.m0, ? extends v4.m0> f10506a = a.f10507b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv4/m0;", "it", "c", "(Lv4/m0;)Lv4/m0;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<v4.m0, v4.m0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10507b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v4.m0 b(v4.m0 m0Var) {
            return m0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(View view, View view2) {
        if (fr.t.c(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(Configuration configuration, Configuration configuration2) {
        return (configuration.diff(configuration2) & (-1342235264)) != 0;
    }

    private static final float h(float[] fArr, int i15, float[] fArr2, int i16) {
        int i17 = i15 * 4;
        return (fArr[i17] * fArr2[i16]) + (fArr[i17 + 1] * fArr2[4 + i16]) + (fArr[i17 + 2] * fArr2[8 + i16]) + (fArr[i17 + 3] * fArr2[12 + i16]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i3.j i(View view) {
        j4.d.c(view, 1);
        return j4.d.b(view);
    }

    public static final er.l<v4.m0, v4.m0> j() {
        return f10506a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(float[] fArr, float[] fArr2) {
        float fH = h(fArr2, 0, fArr, 0);
        float fH2 = h(fArr2, 0, fArr, 1);
        float fH3 = h(fArr2, 0, fArr, 2);
        float fH4 = h(fArr2, 0, fArr, 3);
        float fH5 = h(fArr2, 1, fArr, 0);
        float fH6 = h(fArr2, 1, fArr, 1);
        float fH7 = h(fArr2, 1, fArr, 2);
        float fH8 = h(fArr2, 1, fArr, 3);
        float fH9 = h(fArr2, 2, fArr, 0);
        float fH10 = h(fArr2, 2, fArr, 1);
        float fH11 = h(fArr2, 2, fArr, 2);
        float fH12 = h(fArr2, 2, fArr, 3);
        float fH13 = h(fArr2, 3, fArr, 0);
        float fH14 = h(fArr2, 3, fArr, 1);
        float fH15 = h(fArr2, 3, fArr, 2);
        float fH16 = h(fArr2, 3, fArr, 3);
        fArr[0] = fH;
        fArr[1] = fH2;
        fArr[2] = fH3;
        fArr[3] = fH4;
        fArr[4] = fH5;
        fArr[5] = fH6;
        fArr[6] = fH7;
        fArr[7] = fH8;
        fArr[8] = fH9;
        fArr[9] = fH10;
        fArr[10] = fH11;
        fArr[11] = fH12;
        fArr[12] = fH13;
        fArr[13] = fH14;
        fArr[14] = fH15;
        fArr[15] = fH16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(float[] fArr, float f15, float f16, float[] fArr2) {
        n3.g2.i(fArr2);
        n3.g2.s(fArr2, f15, f16, 0.0f, 4, null);
        k(fArr, fArr2);
    }
}
