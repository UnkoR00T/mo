package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import c5.h;
import d1.a3;
import d1.d3;
import l2.g0;
import l2.j0;
import l2.t;
import l2.v0;
import n3.y2;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR \u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\t\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0015\u0010\u000bR \u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR \u0010!\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u001bR \u0010%\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u001bR\u0017\u0010'\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b\r\u0010\u001bR\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\tR\u0017\u0010,\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001bR\u0017\u0010/\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001bR\u0011\u00102\u001a\u0002008G¢\u0006\u0006\u001a\u0004\b\u0012\u00101R\u0011\u00106\u001a\u0002038G¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u00109\u001a\u00020\u0004*\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u00108¨\u0006:"}, d2 = {"Lf2/zd;", "", "<init>", "()V", "Lf2/ae;", "g", "(Lm2/r;I)Lf2/ae;", "Lc5/h;", "b", "F", "f", "()F", "TonalElevation", "c", "d", "ShadowElevation", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "e", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "getGroupSpacing-D9Ej5fM", "getGroupSpacing-D9Ej5fM$annotations", "GroupSpacing", "Ld1/d3;", "Ld1/d3;", "getHorizontalDividerPadding", "()Ld1/d3;", "getHorizontalDividerPadding$annotations", "HorizontalDividerPadding", "h", "getDropdownMenuGroupLabelHorizontalPadding", "getDropdownMenuGroupLabelHorizontalPadding$annotations", "DropdownMenuGroupLabelHorizontalPadding", "i", "getDropdownMenuItemTrailingLabelHorizontalPadding", "getDropdownMenuItemTrailingLabelHorizontalPadding$annotations", "DropdownMenuItemTrailingLabelHorizontalPadding", "j", "DropdownMenuItemContentPadding", "k", "SelectableItemVerticalPadding", "l", "getDropdownMenuSelectableItemContentPadding", "DropdownMenuSelectableItemContentPadding", "m", "getDropdownMenuGroupContentPadding", "DropdownMenuGroupContentPadding", "Ln3/y2;", "(Lm2/r;I)Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "a", "(Lm2/r;I)J", "containerColor", "Lf2/e2;", "(Lf2/e2;)Lf2/ae;", "defaultMenuItemColors", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zd f58497a = new zd();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation = t.f115244a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ShadowElevation = j0.f114807a.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float LeadingIconSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float TrailingIconSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float GroupSpacing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final d3 HorizontalDividerPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final d3 DropdownMenuGroupLabelHorizontalPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final d3 DropdownMenuItemTrailingLabelHorizontalPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final d3 DropdownMenuItemContentPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float SelectableItemVerticalPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final d3 DropdownMenuSelectableItemContentPadding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final d3 DropdownMenuGroupContentPadding;

    static {
        v0 v0Var = v0.f115282a;
        LeadingIconSize = v0Var.a();
        TrailingIconSize = sg.a().getValue().booleanValue() ? h.n(24) : v0Var.b();
        GroupSpacing = v0Var.c();
        float f15 = 12;
        HorizontalDividerPadding = a3.f(h.n(f15), h.n(2));
        DropdownMenuGroupLabelHorizontalPadding = a3.i(h.n(f15), 0.0f, h.n(4), 0.0f, 10, null);
        DropdownMenuItemTrailingLabelHorizontalPadding = sg.a().getValue().booleanValue() ? a3.i(h.n(0), 0.0f, h.n(6), 0.0f, 10, null) : a3.e(h.n(0));
        float f16 = 0;
        DropdownMenuItemContentPadding = a3.f(le.A(), h.n(f16));
        float fN = h.n(f15);
        SelectableItemVerticalPadding = fN;
        DropdownMenuSelectableItemContentPadding = sg.a().getValue().booleanValue() ? a3.h(h.n(16), fN, h.n(10), fN) : a3.f(le.A(), fN);
        DropdownMenuGroupContentPadding = a3.f(h.n(f16), le.z());
    }

    private zd() {
    }

    public final long a(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2079969291, i15, -1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (MenuDefaults.kt:71)");
        }
        long jI = g2.i(j0.f114807a.a(), rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jI;
    }

    public final ae b(ColorScheme colorScheme) {
        ae defaultMenuItemColorsCached = colorScheme.getDefaultMenuItemColorsCached();
        if (defaultMenuItemColorsCached != null) {
            return defaultMenuItemColorsCached;
        }
        g0 g0Var = g0.f114547a;
        ae aeVar = new ae(g2.h(colorScheme, g0Var.g()), g2.h(colorScheme, g0Var.h()), g2.h(colorScheme, g0Var.j()), Color.m9copywmQWz5c$default(g2.h(colorScheme, g0Var.a()), g0Var.b(), 0.0f, 0.0f, 0.0f, 14, null), Color.m9copywmQWz5c$default(g2.h(colorScheme, g0Var.c()), g0Var.d(), 0.0f, 0.0f, 0.0f, 14, null), Color.m9copywmQWz5c$default(g2.h(colorScheme, g0Var.e()), g0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.p0(aeVar);
        return aeVar;
    }

    public final d3 c() {
        return DropdownMenuItemContentPadding;
    }

    public final float d() {
        return ShadowElevation;
    }

    public final y2 e(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1323260959, i15, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (MenuDefaults.kt:67)");
        }
        y2 y2VarH = ui.h(j0.f114807a.c(), rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return y2VarH;
    }

    public final float f() {
        return TonalElevation;
    }

    public final ae g(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1208055030, i15, -1, "androidx.compose.material3.MenuDefaults.itemColors (MenuDefaults.kt:239)");
        }
        ae aeVarB = b(d.f9816a.a(rVar, 6));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return aeVarB;
    }
}
