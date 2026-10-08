package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import l2.s0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u00020\u0004*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lf2/lh;", "", "<init>", "()V", "Lf2/kh;", "a", "(Lm2/r;I)Lf2/kh;", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "b", "(JJJJLm2/r;II)Lf2/kh;", "Lf2/e2;", "c", "(Lf2/e2;)Lf2/kh;", "defaultRadioButtonColors", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lh f56740a = new lh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f56741b = 0;

    private lh() {
    }

    public final kh a(r rVar, int i15) {
        if (t.k()) {
            t.o(-1191566130, i15, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:142)");
        }
        kh khVarC = c(d.f9816a.a(rVar, 6));
        if (t.k()) {
            t.n();
        }
        return khVarC;
    }

    public final kh b(long j15, long j16, long j17, long j18, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            j15 = Color.INSTANCE.h();
        }
        if ((i16 & 2) != 0) {
            j16 = Color.INSTANCE.h();
        }
        if ((i16 & 4) != 0) {
            j17 = Color.INSTANCE.h();
        }
        if ((i16 & 8) != 0) {
            j18 = Color.INSTANCE.h();
        }
        if (t.k()) {
            t.o(-351083046, i15, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:162)");
        }
        long j19 = j15;
        kh khVarA = c(d.f9816a.a(rVar, 6)).a(j19, j16, j17, j18);
        if (t.k()) {
            t.n();
        }
        return khVarA;
    }

    public final kh c(ColorScheme colorScheme) {
        kh defaultRadioButtonColorsCached = colorScheme.getDefaultRadioButtonColorsCached();
        if (defaultRadioButtonColorsCached != null) {
            return defaultRadioButtonColorsCached;
        }
        s0 s0Var = s0.f115231a;
        kh khVar = new kh(g2.h(colorScheme, s0Var.d()), g2.h(colorScheme, s0Var.f()), Color.m9copywmQWz5c$default(g2.h(colorScheme, s0Var.a()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m9copywmQWz5c$default(g2.h(colorScheme, s0Var.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.r0(khVar);
        return khVar;
    }
}
