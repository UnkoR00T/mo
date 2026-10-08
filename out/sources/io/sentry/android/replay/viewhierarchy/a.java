package io.sentry.android.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.g;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import fr.t;
import fr.w;
import fu.r;
import io.sentry.android.replay.util.TextAttributes;
import io.sentry.android.replay.util.j;
import io.sentry.android.replay.util.o;
import io.sentry.b7;
import io.sentry.q7;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import n3.o1;
import n4.AccessibilityAction;
import n4.p;
import n4.q;
import oq.k;
import oq.l;
import p036e4.b0;
import p036e4.c0;
import p071kotlin.Metadata;
import pq.v;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import q4.TextStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\t*\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u00020\u001b*\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u001d\u0010&\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010'R$\u0010-\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010+\u0012\u0004\b,\u0010\u0003¨\u0006."}, d2 = {"Lio/sentry/android/replay/viewhierarchy/a;", "", "<init>", "()V", "Landroidx/compose/ui/node/g;", "node", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "e", "(Landroidx/compose/ui/node/g;)Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "isImage", "config", "", "d", "(ZLandroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;", "Lio/sentry/q7;", "options", "f", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/q7;)Z", "Lio/sentry/android/replay/viewhierarchy/b;", "parent", "", "distance", "isComposeRoot", "a", "(Landroidx/compose/ui/node/g;Lio/sentry/android/replay/viewhierarchy/b;IZLio/sentry/q7;)Lio/sentry/android/replay/viewhierarchy/b;", "parentNode", "Loq/i0;", "g", "(Landroidx/compose/ui/node/g;Lio/sentry/android/replay/viewhierarchy/b;ZLio/sentry/q7;)V", "Landroid/view/View;", "view", "b", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/b;Lio/sentry/q7;)Z", "Ljava/lang/reflect/Method;", "Loq/k;", "c", "()Ljava/lang/reflect/Method;", "getSemanticsConfigurationMethod", "Z", "semanticsRetrievalErrorLogged", "Ljava/lang/ref/WeakReference;", "Le4/b0;", "Ljava/lang/ref/WeakReference;", "get_rootCoordinates$annotations", "_rootCoordinates", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean semanticsRetrievalErrorLogged;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static WeakReference<b0> _rootCoordinates;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f94568a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final k getSemanticsConfigurationMethod = l.a(C2227a.f94573b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f94572e = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Method;", "c", "()Ljava/lang/reflect/Method;"}, k = 3, mv = {1, 9, 0})
    static final class C2227a extends w implements er.a<Method> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2227a f94573b = new C2227a();

        C2227a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Method a() {
            try {
                Method declaredMethod = g.class.getDeclaredMethod("f", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private a() {
    }

    private final b a(g node, b parent, int distance, boolean isComposeRoot, q7 options) {
        TextLayoutInput layoutInput;
        TextStyle style;
        TextLayoutInput layoutInput2;
        TextStyle style2;
        AccessibilityAction accessibilityAction;
        er.l lVar;
        if (!node.p() || !node.c()) {
            return null;
        }
        if (isComposeRoot) {
            _rootCoordinates = new WeakReference<>(c0.e(node.m()));
        }
        b0 b0VarM = node.m();
        WeakReference<b0> weakReference = _rootCoordinates;
        Rect rectA = j.a(b0VarM, weakReference != null ? weakReference.get() : null);
        try {
            SemanticsConfiguration semanticsConfigurationE = e(node);
            boolean z15 = !node.getOuterCoordinator$ui_release().C3() && (semanticsConfigurationE == null || !semanticsConfigurationE.g(n4.c0.f131174a.r())) && rectA.height() > 0 && rectA.width() > 0;
            boolean z16 = (semanticsConfigurationE != null && semanticsConfigurationE.g(p.f131279a.A())) || (semanticsConfigurationE != null && semanticsConfigurationE.g(n4.c0.f131174a.g()));
            if ((semanticsConfigurationE != null && semanticsConfigurationE.g(n4.c0.f131174a.L())) || z16) {
                boolean z17 = z15 && f(semanticsConfigurationE, false, options);
                if (parent != null) {
                    parent.g(true);
                }
                ArrayList arrayList = new ArrayList();
                if (semanticsConfigurationE != null && (accessibilityAction = (AccessibilityAction) q.a(semanticsConfigurationE, p.f131279a.i())) != null && (lVar = (er.l) accessibilityAction.a()) != null) {
                }
                TextAttributes mVarC = j.c(node);
                Color colorA = mVarC.getColor();
                boolean zB = mVarC.getHasFillModifier();
                TextLayoutResult textLayoutResult = (TextLayoutResult) v.n0(arrayList);
                Color colorM0boximpl = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.m0boximpl(style2.j());
                if (colorM0boximpl == null || colorM0boximpl.m20unboximpl() != Color.INSTANCE.h()) {
                    colorA = colorM0boximpl;
                }
                c5.v vVarB = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : c5.v.b(style.n());
                new b.d((textLayoutResult == null || z16 || (vVarB != null ? c5.v.e(vVarB.getPackedValue(), c5.v.INSTANCE.a()) : false)) ? null : new io.sentry.android.replay.util.b(textLayoutResult, zB), colorA != null ? Integer.valueOf(o.j(o1.j(colorA.m20unboximpl()))) : null, 0, 0, rectA.left, rectA.top, node.I0(), node.a0(), parent != null ? parent.getElevation() : 0.0f, distance, parent, z17, true, z15, rectA, 12, null);
                return r3;
            }
            androidx.compose.ui.graphics.painter.a aVarB = j.b(node);
            if (aVarB == null) {
                boolean z18 = false;
                if (z15 && f(semanticsConfigurationE, false, options)) {
                    z18 = true;
                }
                return new b.C2228b(rectA.left, rectA.top, node.I0(), node.a0(), parent != null ? parent.getElevation() : 0.0f, distance, parent, z18, false, z15, rectA);
            }
            boolean z19 = z15 && f(semanticsConfigurationE, true, options);
            if (parent != null) {
                parent.g(true);
            }
            float f15 = rectA.left;
            float f16 = rectA.top;
            boolean z25 = false;
            int iI0 = node.I0();
            int iA0 = node.a0();
            float fA = parent != null ? parent.getElevation() : 0.0f;
            if (z19 && j.d(aVarB)) {
                z25 = true;
            }
            return new b.c(f15, f16, iI0, iA0, fA, distance, parent, z25, true, z15, rectA);
        } catch (Throwable th4) {
            if (!semanticsRetrievalErrorLogged) {
                semanticsRetrievalErrorLogged = true;
                options.getLogger().a(b7.ERROR, th4, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            return new b.C2228b(rectA.left, rectA.top, node.I0(), node.a0(), parent != null ? parent.getElevation() : 0.0f, distance, parent, true, false, !node.getOuterCoordinator$ui_release().C3() && rectA.height() > 0 && rectA.width() > 0, rectA);
        }
    }

    private final Method c() {
        return (Method) getSemanticsConfigurationMethod.getValue();
    }

    private final String d(boolean isImage, SemanticsConfiguration config) {
        if (isImage) {
            return "android.widget.ImageView";
        }
        if (config == null) {
            return "android.view.View";
        }
        n4.c0 c0Var = n4.c0.f131174a;
        return (config.g(c0Var.L()) || config.g(p.f131279a.A()) || config.g(c0Var.g())) ? "android.widget.TextView" : "android.view.View";
    }

    public static final SemanticsConfiguration e(g node) {
        Method methodC = f94568a.c();
        return methodC != null ? (SemanticsConfiguration) methodC.invoke(node, null) : node.getCollapsedSemantics$ui_release();
    }

    private final boolean f(SemanticsConfiguration semanticsConfiguration, boolean z15, q7 q7Var) {
        String str = semanticsConfiguration != null ? (String) q.a(semanticsConfiguration, io.sentry.android.replay.v.f94541a.a()) : null;
        if (t.c(str, "unmask")) {
            return false;
        }
        if (t.c(str, "mask")) {
            return true;
        }
        String strD = d(z15, semanticsConfiguration);
        if (q7Var.getSessionReplay().m().contains(strD)) {
            return false;
        }
        return q7Var.getSessionReplay().e().contains(strD);
    }

    private final void g(g gVar, b bVar, boolean z15, q7 q7Var) {
        List children$ui_release = gVar.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        int i15 = 0;
        while (i15 < size) {
            g gVar2 = (g) children$ui_release.get(i15);
            b bVar2 = bVar;
            boolean z16 = z15;
            q7 q7Var2 = q7Var;
            b bVarA = a(gVar2, bVar2, i15, z16, q7Var2);
            if (bVarA != null) {
                arrayList.add(bVarA);
                g(gVar2, bVarA, false, q7Var2);
            }
            i15++;
            bVar = bVar2;
            z15 = z16;
            q7Var = q7Var2;
        }
        bVar.f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(View view, b parent, q7 options) {
        g root;
        if (!r.d0(view.getClass().getName(), "AndroidComposeView", false, 2, null) || parent == null) {
            return false;
        }
        try {
            Owner owner = view instanceof Owner ? (Owner) view : null;
            if (owner != null && (root = owner.getRoot()) != null) {
                g(root, parent, true, options);
                return true;
            }
            return false;
        } catch (Throwable th4) {
            options.getLogger().a(b7.ERROR, th4, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
            return false;
        }
    }
}
