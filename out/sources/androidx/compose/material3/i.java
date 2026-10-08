package androidx.compose.material3;

import androidx.compose.material3.i;
import androidx.compose.ui.graphics.Color;
import n3.y2;
import p071kotlin.Metadata;
import p076m2.a0;
import p076m2.b4;
import p076m2.d0;
import w0.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aa\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"", "bounded", "Lc5/h;", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/y2;", "focusRingShape", "enablePressIndication", "enableFocusIndication", "enableHoverIndication", "enableDragIndication", "Lw0/r1;", "g", "(ZFJLn3/y2;ZZZZ)Lw0/r1;", "Lm2/b4;", "Landroidx/compose/material3/k;", "a", "Lm2/b4;", "f", "()Lm2/b4;", "LocalRippleThemeConfiguration", "Landroidx/compose/material3/g;", "b", "e", "LocalRippleConfiguration", "Landroidx/compose/material3/j;", "c", "Landroidx/compose/material3/j;", "DefaultBoundedRipple", "d", "DefaultUnboundedRipple", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<k> f9843a = d0.h(null, new er.a() { // from class: f2.ph
        @Override // er.a
        public final Object a() {
            return i.d();
        }
    }, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<RippleConfiguration> f9844b = d0.i(new er.l() { // from class: f2.qh
        @Override // er.l
        public final Object b(Object obj) {
            return i.c((a0) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f9845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f9846d;

    static {
        c5.h.Companion companion = c5.h.INSTANCE;
        float fC = companion.c();
        Color.Companion companion2 = Color.INSTANCE;
        f9845c = new j(true, fC, companion2.h(), (y2) null, true, true, true, true, (fr.k) null);
        f9846d = new j(false, companion.c(), companion2.h(), (y2) null, true, true, true, true, (fr.k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleConfiguration c(a0 a0Var) {
        return new RippleConfiguration(0L, 1, (fr.k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k d() {
        return h.f9838a.c();
    }

    public static final b4<RippleConfiguration> e() {
        return f9844b;
    }

    public static final b4<k> f() {
        return f9843a;
    }

    public static final r1 g(boolean z15, float f15, long j15, y2 y2Var, boolean z16, boolean z17, boolean z18, boolean z19) {
        if (c5.h.p(f15, c5.h.INSTANCE.c()) && Color.m11equalsimpl0(j15, Color.INSTANCE.h()) && y2Var == null && z16 && z17 && z18 && z19) {
            return z15 ? f9845c : f9846d;
        }
        return new j(z15, f15, j15, y2Var, z16, z17, z18, z19, (fr.k) null);
    }

    public static /* synthetic */ r1 h(boolean z15, float f15, long j15, y2 y2Var, boolean z16, boolean z17, boolean z18, boolean z19, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            j15 = Color.INSTANCE.h();
        }
        if ((i15 & 8) != 0) {
            y2Var = null;
        }
        if ((i15 & 16) != 0) {
            z16 = true;
        }
        if ((i15 & 32) != 0) {
            z17 = true;
        }
        if ((i15 & 64) != 0) {
            z18 = true;
        }
        if ((i15 & 128) != 0) {
            z19 = true;
        }
        return g(z15, f15, j15, y2Var, z16, z17, z18, z19);
    }
}
