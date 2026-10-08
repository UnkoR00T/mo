package p012a2;

import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a3;
import d1.d3;
import n3.o1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010!R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\u001c\u0010!R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b%\u0010!R\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010!R\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0017\u00100\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b#\u0010\u001e¨\u00061"}, d2 = {"La2/s0;", "", "<init>", "()V", "Lc5/h;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "La2/t0;", "b", "(FFFFFLm2/r;II)La2/t0;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "La2/r0;", "a", "(JJJJLm2/r;II)La2/r0;", "g", "(JJJLm2/r;II)La2/r0;", "F", "ButtonHorizontalPadding", "c", "ButtonVerticalPadding", "Ld1/d3;", "d", "Ld1/d3;", "()Ld1/d3;", "ContentPadding", "e", "()F", "MinWidth", "f", "MinHeight", "getIconSize-D9Ej5fM", "IconSize", "h", "getIconSpacing-D9Ej5fM", "IconSpacing", "i", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "j", "TextButtonHorizontalPadding", "k", "TextButtonContentPadding", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f1901a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final d3 ContentPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float OutlinedBorderSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final d3 TextButtonContentPadding;

    static {
        float fN = h.n(16);
        ButtonHorizontalPadding = fN;
        float f15 = 8;
        float fN2 = h.n(f15);
        ButtonVerticalPadding = fN2;
        d3 d3VarH = a3.h(fN, fN2, fN, fN2);
        ContentPadding = d3VarH;
        MinWidth = h.n(64);
        MinHeight = h.n(36);
        IconSize = h.n(18);
        IconSpacing = h.n(f15);
        OutlinedBorderSize = h.n(1);
        float fN3 = h.n(f15);
        TextButtonHorizontalPadding = fN3;
        TextButtonContentPadding = a3.h(fN3, d3VarH.getTop(), fN3, d3VarH.getBottom());
    }

    private s0() {
    }

    public final r0 a(long j15, long j16, long j17, long j18, r rVar, int i15, int i16) {
        long jG;
        long jH = (i16 & 1) != 0 ? m2.f1788a.a(rVar, 6).h() : j15;
        long jD = (i16 & 2) != 0 ? c1.d(jH, rVar, i15 & 14) : j16;
        if ((i16 & 4) != 0) {
            m2 m2Var = m2.f1788a;
            jG = o1.g(Color.m9copywmQWz5c$default(m2Var.a(rVar, 6).g(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), m2Var.a(rVar, 6).l());
        } else {
            jG = j17;
        }
        long jM9copywmQWz5c$default = (i16 & 8) != 0 ? Color.m9copywmQWz5c$default(m2.f1788a.a(rVar, 6).g(), j1.f1722a.b(rVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if (t.k()) {
            t.o(1870371134, i15, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:412)");
        }
        n1 n1Var = new n1(jH, jD, jG, jM9copywmQWz5c$default, null);
        if (t.k()) {
            t.n();
        }
        return n1Var;
    }

    public final t0 b(float f15, float f16, float f17, float f18, float f19, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            f15 = h.n(2);
        }
        float f25 = f15;
        if ((i16 & 2) != 0) {
            f16 = h.n(8);
        }
        float f26 = f16;
        if ((i16 & 4) != 0) {
            f17 = h.n(0);
        }
        float f27 = f17;
        if ((i16 & 8) != 0) {
            f18 = h.n(4);
        }
        float f28 = f18;
        if ((i16 & 16) != 0) {
            f19 = h.n(4);
        }
        float f29 = f19;
        if (t.k()) {
            t.o(-737170518, i15, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:374)");
        }
        boolean z15 = ((((i15 & 14) ^ 6) > 4 && rVar.b(f25)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.b(f26)) || (i15 & 48) == 32) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.b(f27)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i15 & 7168) ^ 3072) > 2048 && rVar.b(f28)) || (i15 & 3072) == 2048) | ((((57344 & i15) ^ 24576) > 16384 && rVar.b(f29)) || (i15 & 24576) == 16384);
        Object objE = rVar.E();
        if (z15 || objE == r.INSTANCE.a()) {
            o1 o1Var = new o1(f25, f26, f27, f28, f29, null);
            rVar.v(o1Var);
            objE = o1Var;
        }
        o1 o1Var2 = (o1) objE;
        if (t.k()) {
            t.n();
        }
        return o1Var2;
    }

    public final d3 c() {
        return ContentPadding;
    }

    public final float d() {
        return MinHeight;
    }

    public final float e() {
        return MinWidth;
    }

    public final d3 f() {
        return TextButtonContentPadding;
    }

    public final r0 g(long j15, long j16, long j17, r rVar, int i15, int i16) {
        long jG = (i16 & 1) != 0 ? Color.INSTANCE.g() : j15;
        long jH = (i16 & 2) != 0 ? m2.f1788a.a(rVar, 6).h() : j16;
        long jM9copywmQWz5c$default = (i16 & 4) != 0 ? Color.m9copywmQWz5c$default(m2.f1788a.a(rVar, 6).g(), j1.f1722a.b(rVar, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if (t.k()) {
            t.o(182742216, i15, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:456)");
        }
        n1 n1Var = new n1(jG, jH, jG, jM9copywmQWz5c$default, null);
        if (t.k()) {
            t.n();
        }
        return n1Var;
    }
}
