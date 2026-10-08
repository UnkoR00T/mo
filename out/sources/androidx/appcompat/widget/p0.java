package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import io.sentry.android.core.c2;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p106prn.p2;
import r0.l1;
import r0.m1;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static p0 f8997i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, m1<ColorStateList>> f8999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l1<String, b> f9000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m1<String> f9001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, r0.a0<WeakReference<Drawable.ConstantState>>> f9002d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f9003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f9005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f8996h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f8998j = new a(6);

    private static class a extends r0.c0<Integer, PorterDuffColorFilter> {
        public a(int i15) {
            super(i15);
        }

        private static int k(int i15, PorterDuff.Mode mode) {
            return ((i15 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter l(int i15, PorterDuff.Mode mode) {
            return d(Integer.valueOf(k(i15, mode)));
        }

        PorterDuffColorFilter m(int i15, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return e(Integer.valueOf(k(i15, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(p0 p0Var, Context context, int i15);

        ColorStateList b(Context context, int i15);

        boolean c(Context context, int i15, Drawable drawable);

        PorterDuff.Mode d(int i15);

        boolean e(Context context, int i15, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j15, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            r0.a0<WeakReference<Drawable.ConstantState>> a0Var = this.f9002d.get(context);
            if (a0Var == null) {
                a0Var = new r0.a0<>();
                this.f9002d.put(context, a0Var);
            }
            a0Var.m(j15, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private void b(Context context, int i15, ColorStateList colorStateList) {
        if (this.f8999a == null) {
            this.f8999a = new WeakHashMap<>();
        }
        m1<ColorStateList> m1Var = this.f8999a.get(context);
        if (m1Var == null) {
            m1Var = new m1<>();
            this.f8999a.put(context, m1Var);
        }
        m1Var.b(i15, colorStateList);
    }

    private void c(Context context) {
        if (this.f9004f) {
            return;
        }
        this.f9004f = true;
        Drawable drawableI = i(context, p2.f162213a);
        if (drawableI == null || !p(drawableI)) {
            this.f9004f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i15) {
        if (this.f9003e == null) {
            this.f9003e = new TypedValue();
        }
        TypedValue typedValue = this.f9003e;
        context.getResources().getValue(i15, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f9005g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i15);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized p0 g() {
        try {
            if (f8997i == null) {
                p0 p0Var = new p0();
                f8997i = p0Var;
                o(p0Var);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f8997i;
    }

    private synchronized Drawable h(Context context, long j15) {
        r0.a0<WeakReference<Drawable.ConstantState>> a0Var = this.f9002d.get(context);
        if (a0Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceG = a0Var.g(j15);
        if (weakReferenceG != null) {
            Drawable.ConstantState constantState = weakReferenceG.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            a0Var.o(j15);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i15, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterL;
        a aVar = f8998j;
        porterDuffColorFilterL = aVar.l(i15, mode);
        if (porterDuffColorFilterL == null) {
            porterDuffColorFilterL = new PorterDuffColorFilter(i15, mode);
            aVar.m(i15, mode, porterDuffColorFilterL);
        }
        return porterDuffColorFilterL;
    }

    private ColorStateList m(Context context, int i15) {
        m1<ColorStateList> m1Var;
        WeakHashMap<Context, m1<ColorStateList>> weakHashMap = this.f8999a;
        if (weakHashMap == null || (m1Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return m1Var.i(i15);
    }

    private static void o(p0 p0Var) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i15) {
        int next;
        l1<String, b> l1Var = this.f9000b;
        if (l1Var == null || l1Var.isEmpty()) {
            return null;
        }
        m1<String> m1Var = this.f9001c;
        if (m1Var != null) {
            String strI = m1Var.i(i15);
            if ("appcompat_skip_skip".equals(strI) || (strI != null && this.f9000b.get(strI) == null)) {
                return null;
            }
        } else {
            this.f9001c = new m1<>();
        }
        if (this.f9003e == null) {
            this.f9003e = new TypedValue();
        }
        TypedValue typedValue = this.f9003e;
        Resources resources = context.getResources();
        resources.getValue(i15, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i15);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f9001c.b(i15, name);
                b bVar = this.f9000b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e15) {
                c2.f("ResourceManagerInternal", "Exception while inflating drawable", e15);
            }
        }
        if (drawableH == null) {
            this.f9001c.b(i15, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i15, boolean z15, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i15);
        if (colorStateListL != null) {
            Drawable drawableR = y5.a.r(drawable.mutate());
            y5.a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i15);
            if (modeN != null) {
                y5.a.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.f9005g;
        if ((cVar == null || !cVar.e(context, i15, drawable)) && !w(context, i15, drawable) && z15) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, x0 x0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z15 = x0Var.f9091d;
            if (z15 || x0Var.f9090c) {
                drawable.setColorFilter(f(z15 ? x0Var.f9088a : null, x0Var.f9090c ? x0Var.f9089b : f8996h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public synchronized Drawable i(Context context, int i15) {
        return j(context, i15, false);
    }

    synchronized Drawable j(Context context, int i15, boolean z15) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i15);
            if (drawableQ == null) {
                drawableQ = e(context, i15);
            }
            if (drawableQ == null) {
                drawableQ = u5.a.f(context, i15);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i15, z15, drawableQ);
            }
            if (drawableQ != null) {
                h0.b(drawableQ);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i15) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i15);
        if (colorStateListM == null) {
            c cVar = this.f9005g;
            colorStateListM = cVar == null ? null : cVar.b(context, i15);
            if (colorStateListM != null) {
                b(context, i15, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i15) {
        c cVar = this.f9005g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i15);
    }

    public synchronized void r(Context context) {
        r0.a0<WeakReference<Drawable.ConstantState>> a0Var = this.f9002d.get(context);
        if (a0Var != null) {
            a0Var.b();
        }
    }

    synchronized Drawable s(Context context, f1 f1Var, int i15) {
        try {
            Drawable drawableQ = q(context, i15);
            if (drawableQ == null) {
                drawableQ = f1Var.a(i15);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i15, false, drawableQ);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public synchronized void t(c cVar) {
        this.f9005g = cVar;
    }

    boolean w(Context context, int i15, Drawable drawable) {
        c cVar = this.f9005g;
        return cVar != null && cVar.c(context, i15, drawable);
    }
}
