package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import c5.h;
import c5.i;
import fr.k;
import l2.a1;
import l2.c1;
import l2.e0;
import l2.i0;
import l2.n1;
import l2.o1;
import n3.y2;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001d\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010 \u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010#\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\"¨\u0006$"}, d2 = {"Lf2/tc;", "", "<init>", "()V", "Lf2/sc;", "c", "(Lm2/r;I)Lf2/sc;", "Lf2/e2;", "Landroidx/compose/ui/graphics/Color;", "localContentColor", "a", "(Lf2/e2;J)Lf2/sc;", "Lf2/tc$a;", "widthOption", "Lc5/k;", "d", "(I)J", "Lc5/h;", "b", "F", "getExtraSmallIconSize-D9Ej5fM", "()F", "extraSmallIconSize", "getSmallIconSize-D9Ej5fM", "smallIconSize", "getMediumIconSize-D9Ej5fM", "mediumIconSize", "e", "getLargeIconSize-D9Ej5fM", "largeIconSize", "f", "getExtraLargeIconSize-D9Ej5fM", "extraLargeIconSize", "Ln3/y2;", "(Lm2/r;I)Ln3/y2;", "standardShape", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tc f57829a = new tc();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float extraSmallIconSize = o1.f115102a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float smallIconSize = a1.f114275a.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float mediumIconSize = i0.f114702a.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float largeIconSize = e0.f114432a.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float extraLargeIconSize = n1.f115009a.a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Lf2/tc$a;", "", "", "value", "d", "(I)I", "a", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f57836b = d(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f57837c = d(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f57838d = d(2);

        /* JADX INFO: renamed from: f2.tc$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lf2/tc$a$a;", "", "<init>", "()V", "Lf2/tc$a;", "Narrow", "I", "a", "()I", "Uniform", "b", "Wide", "c", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final int a() {
                return a.f57836b;
            }

            public final int b() {
                return a.f57837c;
            }

            public final int c() {
                return a.f57838d;
            }

            private Companion() {
            }
        }

        private static int d(int i15) {
            return i15;
        }

        public static final boolean e(int i15, int i16) {
            return i15 == i16;
        }
    }

    private tc() {
    }

    public static /* synthetic */ long e(tc tcVar, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = a.INSTANCE.b();
        }
        return tcVar.d(i15);
    }

    public final sc a(ColorScheme colorScheme, long j15) {
        sc defaultIconButtonColorsCached = colorScheme.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached != null) {
            return defaultIconButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        sc scVar = new sc(companion.g(), j15, companion.g(), Color.m9copywmQWz5c$default(j15, c1.f114356a.a(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.o0(scVar);
        return scVar;
    }

    public final y2 b(r rVar, int i15) {
        if (t.k()) {
            t.o(-377108005, i15, -1, "androidx.compose.material3.IconButtonDefaults.<get-standardShape> (IconButtonDefaults.kt:856)");
        }
        y2 y2VarH = ui.h(a1.f114275a.b(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }

    public final sc c(r rVar, int i15) {
        if (t.k()) {
            t.o(-1037266503, i15, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:49)");
        }
        long jM20unboximpl = ((Color) rVar.N(h4.a())).m20unboximpl();
        sc scVarA = a(d.f9816a.a(rVar, 6), jM20unboximpl);
        if (!Color.m11equalsimpl0(scVarA.getContentColor(), jM20unboximpl)) {
            scVarA = sc.d(scVarA, 0L, jM20unboximpl, 0L, Color.m9copywmQWz5c$default(jM20unboximpl, c1.f114356a.a(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        }
        if (t.k()) {
            t.n();
        }
        return scVarA;
    }

    public final long d(int widthOption) {
        float fN;
        a.Companion companion = a.INSTANCE;
        if (a.e(widthOption, companion.a())) {
            a1 a1Var = a1.f114275a;
            fN = h.n(a1Var.e() + a1Var.f());
        } else if (a.e(widthOption, companion.b())) {
            a1 a1Var2 = a1.f114275a;
            fN = h.n(a1Var2.c() + a1Var2.c());
        } else if (a.e(widthOption, companion.c())) {
            a1 a1Var3 = a1.f114275a;
            fN = h.n(a1Var3.g() + a1Var3.h());
        } else {
            fN = h.n(0);
        }
        a1 a1Var4 = a1.f114275a;
        return i.a(h.n(a1Var4.d() + fN), a1Var4.a());
    }
}
