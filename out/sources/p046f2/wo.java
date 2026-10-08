package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import l2.h1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u009b\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u00020\u0004*\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lf2/wo;", "", "<init>", "()V", "Lf2/vo;", "a", "(Lm2/r;I)Lf2/vo;", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "b", "(JJJJJJJJJJJJJJLm2/r;III)Lf2/vo;", "Lf2/e2;", "c", "(Lf2/e2;)Lf2/vo;", "defaultTimePickerColors", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wo f58239a = new wo();

    private wo() {
    }

    public final vo a(r rVar, int i15) {
        if (t.k()) {
            t.o(-2085808058, i15, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:303)");
        }
        vo voVarC = c(d.f9816a.a(rVar, 6));
        if (t.k()) {
            t.n();
        }
        return voVarC;
    }

    public final vo b(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, r rVar, int i15, int i16, int i17) {
        long jH = (i17 & 1) != 0 ? Color.INSTANCE.h() : j15;
        long jH2 = (i17 & 2) != 0 ? Color.INSTANCE.h() : j16;
        long jH3 = (i17 & 4) != 0 ? Color.INSTANCE.h() : j17;
        long jH4 = (i17 & 8) != 0 ? Color.INSTANCE.h() : j18;
        long jH5 = (i17 & 16) != 0 ? Color.INSTANCE.h() : j19;
        long jH6 = (i17 & 32) != 0 ? Color.INSTANCE.h() : j25;
        long jH7 = (i17 & 64) != 0 ? Color.INSTANCE.h() : j26;
        long jH8 = (i17 & 128) != 0 ? Color.INSTANCE.h() : j27;
        long j39 = jH;
        long jH9 = (i17 & 256) != 0 ? Color.INSTANCE.h() : j28;
        long jH10 = (i17 & 512) != 0 ? Color.INSTANCE.h() : j29;
        long jH11 = (i17 & 1024) != 0 ? Color.INSTANCE.h() : j35;
        long jH12 = (i17 & 2048) != 0 ? Color.INSTANCE.h() : j36;
        long jH13 = (i17 & PKIFailureInfo.certConfirmed) != 0 ? Color.INSTANCE.h() : j37;
        long jH14 = (i17 & PKIFailureInfo.certRevoked) != 0 ? Color.INSTANCE.h() : j38;
        if (t.k()) {
            t.o(-646352288, i15, i16, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:350)");
        }
        vo voVarA = c(d.f9816a.a(rVar, 6)).a(j39, jH4, jH5, jH6, jH2, jH3, jH7, jH8, jH9, jH10, jH11, jH12, jH13, jH14);
        if (t.k()) {
            t.n();
        }
        return voVarA;
    }

    public final vo c(ColorScheme colorScheme) {
        vo defaultTimePickerColorsCached = colorScheme.getDefaultTimePickerColorsCached();
        if (defaultTimePickerColorsCached != null) {
            return defaultTimePickerColorsCached;
        }
        h1 h1Var = h1.f114662a;
        vo voVar = new vo(g2.h(colorScheme, h1Var.a()), g2.h(colorScheme, h1Var.d()), g2.h(colorScheme, h1Var.f()), g2.h(colorScheme, h1Var.i()), g2.h(colorScheme, h1Var.c()), g2.h(colorScheme, h1Var.e()), g2.h(colorScheme, h1Var.k()), Color.INSTANCE.g(), g2.h(colorScheme, h1Var.l()), g2.h(colorScheme, h1Var.m()), g2.h(colorScheme, h1Var.o()), g2.h(colorScheme, h1Var.q()), g2.h(colorScheme, h1Var.p()), g2.h(colorScheme, h1Var.r()), null);
        colorScheme.w0(voVar);
        return voVar;
    }
}
