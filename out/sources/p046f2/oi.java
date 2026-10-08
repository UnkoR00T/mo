package p046f2;

import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a3;
import d1.d3;
import l2.d0;
import l2.t;
import l2.u0;
import n3.y2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.r;
import z1.SelectionColors;
import z1.g3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jõ\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R \u0010+\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010!\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010#R\u0017\u0010.\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0017\u00101\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0011\u0010;\u001a\u0002088G¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>²\u0006\f\u0010=\u001a\u00020<8\nX\u008a\u0084\u0002"}, d2 = {"Lf2/oi;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "cursorColor", "Lz1/e3;", "selectionColors", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "Lf2/hn;", "b", "(JJJJLz1/e3;JJJJJJJJJJJJJJJJJJLm2/r;IIII)Lf2/hn;", "Lc5/h;", "F", "getTonalElevation-D9Ej5fM", "()F", "TonalElevation", "c", "getShadowElevation-D9Ej5fM", "ShadowElevation", "d", "getElevation-D9Ej5fM", "getElevation-D9Ej5fM$annotations", "Elevation", "e", "getInputFieldHeight-D9Ej5fM", "InputFieldHeight", "f", "getDockedDropdownGapSize-D9Ej5fM", "dockedDropdownGapSize", "Ld1/d3;", "g", "Ld1/d3;", "getAppBarContentPadding", "()Ld1/d3;", "AppBarContentPadding", "Ln3/y2;", "a", "(Lm2/r;I)Ln3/y2;", "inputFieldShape", "", "focused", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oi f57146a = new oi();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ShadowElevation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float InputFieldHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float dockedDropdownGapSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final d3 AppBarContentPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f57153h = 0;

    static {
        t tVar = t.f115244a;
        float fA = tVar.a();
        TonalElevation = fA;
        ShadowElevation = tVar.a();
        Elevation = fA;
        InputFieldHeight = u0.f115260a.a();
        dockedDropdownGapSize = h.n(2);
        AppBarContentPadding = a3.e(h.n(0));
    }

    private oi() {
    }

    public final y2 a(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1770571533, i15, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:1671)");
        }
        y2 y2VarH = ui.h(u0.f115260a.b(), rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return y2VarH;
    }

    public final hn b(long j15, long j16, long j17, long j18, SelectionColors selectionColors, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, r rVar, int i15, int i16, int i17, int i18) {
        long jM9copywmQWz5c$default;
        long jM9copywmQWz5c$default2;
        long jM9copywmQWz5c$default3;
        long jM9copywmQWz5c$default4;
        long jM9copywmQWz5c$default5;
        long jM9copywmQWz5c$default6;
        long jI = (i18 & 1) != 0 ? g2.i(u0.f115260a.c(), rVar, 6) : j15;
        long jI2 = (i18 & 2) != 0 ? g2.i(u0.f115260a.c(), rVar, 6) : j16;
        if ((i18 & 4) != 0) {
            d0 d0Var = d0.f114374a;
            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(g2.i(d0Var.g(), rVar, 6), d0Var.h(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM9copywmQWz5c$default = j17;
        }
        long jI3 = (i18 & 8) != 0 ? g2.i(d0.f114374a.b(), rVar, 6) : j18;
        SelectionColors selectionColors2 = (i18 & 16) != 0 ? (SelectionColors) rVar.N(g3.c()) : selectionColors;
        long jI4 = (i18 & 32) != 0 ? g2.i(u0.f115260a.d(), rVar, 6) : j19;
        long jI5 = (i18 & 64) != 0 ? g2.i(u0.f115260a.d(), rVar, 6) : j25;
        if ((i18 & 128) != 0) {
            d0 d0Var2 = d0.f114374a;
            jM9copywmQWz5c$default2 = Color.m9copywmQWz5c$default(g2.i(d0Var2.k(), rVar, 6), d0Var2.l(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM9copywmQWz5c$default2 = j26;
        }
        long jI6 = (i18 & 256) != 0 ? g2.i(u0.f115260a.f(), rVar, 6) : j27;
        long jI7 = (i18 & 512) != 0 ? g2.i(u0.f115260a.f(), rVar, 6) : j28;
        if ((i18 & 1024) != 0) {
            d0 d0Var3 = d0.f114374a;
            jM9copywmQWz5c$default3 = Color.m9copywmQWz5c$default(g2.i(d0Var3.o(), rVar, 6), d0Var3.p(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM9copywmQWz5c$default3 = j29;
        }
        long jI8 = (i18 & 2048) != 0 ? g2.i(u0.f115260a.e(), rVar, 6) : j35;
        long jI9 = (i18 & PKIFailureInfo.certConfirmed) != 0 ? g2.i(u0.f115260a.e(), rVar, 6) : j36;
        if ((i18 & PKIFailureInfo.certRevoked) != 0) {
            d0 d0Var4 = d0.f114374a;
            jM9copywmQWz5c$default4 = Color.m9copywmQWz5c$default(g2.i(d0Var4.g(), rVar, 6), d0Var4.h(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM9copywmQWz5c$default4 = j37;
        }
        long jI10 = (i18 & 16384) != 0 ? g2.i(d0.f114374a.F(), rVar, 6) : j38;
        long jI11 = (32768 & i18) != 0 ? g2.i(d0.f114374a.F(), rVar, 6) : j39;
        if ((65536 & i18) != 0) {
            d0 d0Var5 = d0.f114374a;
            jM9copywmQWz5c$default5 = Color.m9copywmQWz5c$default(g2.i(d0Var5.F(), rVar, 6), d0Var5.h(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM9copywmQWz5c$default5 = j45;
        }
        long jI12 = (131072 & i18) != 0 ? g2.i(d0.f114374a.G(), rVar, 6) : j46;
        long jI13 = (262144 & i18) != 0 ? g2.i(d0.f114374a.G(), rVar, 6) : j47;
        if ((524288 & i18) != 0) {
            d0 d0Var6 = d0.f114374a;
            jM9copywmQWz5c$default6 = Color.m9copywmQWz5c$default(g2.i(d0Var6.G(), rVar, 6), d0Var6.h(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM9copywmQWz5c$default6 = j48;
        }
        long jG = (1048576 & i18) != 0 ? Color.INSTANCE.g() : j49;
        long jG2 = (2097152 & i18) != 0 ? Color.INSTANCE.g() : j55;
        long jG3 = (i18 & 4194304) != 0 ? Color.INSTANCE.g() : j56;
        if (p076m2.t.k()) {
            p076m2.t.o(-2000124979, i15, i16, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:1959)");
        }
        int i19 = i17 << 12;
        int i25 = i16 << 3;
        int i26 = i16 << 18;
        int i27 = i16 >> 24;
        hn hnVarR = pn.f57316a.r(jI, jI2, jM9copywmQWz5c$default, 0L, jG, jG2, jG3, 0L, jI3, 0L, selectionColors2, 0L, 0L, 0L, 0L, jI4, jI5, jM9copywmQWz5c$default2, 0L, jI6, jI7, jM9copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, jI8, jI9, jM9copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, jI10, jI11, jM9copywmQWz5c$default5, 0L, jI12, jI13, jM9copywmQWz5c$default6, 0L, rVar, (i15 & 1022) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | ((i15 << 15) & 234881024), ((i15 >> 12) & 14) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | ((i15 << 3) & 1879048192), ((i15 >> 27) & 14) | (i25 & 112) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192), (33488896 & i25) | ((i16 << 6) & 1879048192), (i27 & 14) | 3072 | (i27 & 112), 1204058760, 2191);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return hnVarR;
    }
}
