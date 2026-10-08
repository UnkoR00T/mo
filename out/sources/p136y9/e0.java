package p136y9;

import CON.m0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.p016lifecycle.q;
import androidx.p016lifecycle.x0;
import ba.h;
import ba.u;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import fr.t;
import io.sentry.android.core.c2;
import ip.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mu.p0;
import oq.i0;
import oq.k;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.m;
import pq.v;
import pq.v0;
import s5.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 32\u00020\u0001:\u0003_[VB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0003¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00060&R\u00020\u00002\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190$H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\bH\u0017¢\u0006\u0004\b.\u0010/J)\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u0010/J\u0019\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000104H\u0017¢\u0006\u0004\b6\u00107J'\u00109\u001a\u0004\u0018\u00010\u00192\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u0016H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010?J#\u0010B\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020@2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0000¢\u0006\u0004\bB\u0010CJ/\u0010D\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0017¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u001f2\u000e\u0010H\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0017¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020KH\u0017¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020OH\u0017¢\u0006\u0004\bQ\u0010RJ\u0015\u0010T\u001a\u00020S2\u0006\u00100\u001a\u00020\u0016¢\u0006\u0004\bT\u0010UR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010q\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010/\"\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010mR\u001b\u0010{\u001a\u00020h8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010x\u001a\u0004\by\u0010zR\u0014\u0010~\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R*\u0010\u0080\u0001\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u007f8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\"\u0010\u0089\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020S0\u0086\u00010\u0085\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R,\u0010\u0090\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010S8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0097\u0001"}, d2 = {"Ly9/e0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "destinationId", "", "inclusive", "saveState", "M", "(IZZ)Z", "", "deepLink", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "args", "newTask", "z", "([I[Landroid/os/Bundle;Z)Z", "", "o", "([I)Ljava/lang/String;", "Ly9/y0;", "node", "Ly9/i1;", "navOptions", "Ly9/s1$a;", "navigatorExtras", "Loq/i0;", i.f37087n, "(Ly9/y0;Landroid/os/Bundle;Ly9/i1;Ly9/s1$a;)V", "U", "()V", "Ly9/s1;", "navigator", "Ly9/e0$b;", "k", "(Ly9/s1;)Ly9/e0$b;", "Ly9/e0$c;", "listener", "i", "(Ly9/e0$c;)V", "O", "J", "()Z", "route", "K", "(Ljava/lang/String;ZZ)Z", "j", "Landroid/content/Intent;", "intent", "y", "(Landroid/content/Intent;)Z", "matchingDest", "l", "(ILy9/y0;)Ly9/y0;", "m", "(Ljava/lang/String;)Ly9/y0;", "Landroid/net/Uri;", "F", "(Landroid/net/Uri;)V", "Ly9/w0;", "request", "V", "(Ly9/w0;Landroid/os/Bundle;)V", "G", "(Ljava/lang/String;Ly9/i1;Ly9/s1$a;)V", "Q", "()Landroid/os/Bundle;", "navState", i.f37086m, "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/q;", "owner", a.f96137b, "(Landroidx/lifecycle/q;)V", "Landroidx/lifecycle/x0;", "viewModelStore", "T", "(Landroidx/lifecycle/x0;)V", "Ly9/w;", "p", "(Ljava/lang/String;)Ly9/w;", "a", "Landroid/content/Context;", "q", "()Landroid/content/Context;", "Lba/u;", "b", "Lba/u;", "impl", "Lba/h;", "c", "Lba/h;", "v", "()Lba/h;", "navContext", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "activity", "Ly9/h1;", "e", "Ly9/h1;", "inflater", "f", "Z", "getDeepLinkHandled$navigation_runtime_release", "setDeepLinkHandled$navigation_runtime_release", "(Z)V", "deepLinkHandled", "LCON/m0;", "g", "LCON/m0;", "onBackPressedCallback", "h", "enableOnBackPressedCallback", "Loq/k;", "getNavInflater", "()Ly9/h1;", "navInflater", "t", "()I", "destinationCountOnBackStack", "Ly9/b1;", "graph", "u", "()Ly9/b1;", "R", "(Ly9/b1;)V", "Lmu/p0;", "", "x", "()Lmu/p0;", "visibleEntries", "Ly9/t1;", "value", "w", "()Ly9/t1;", "setNavigatorProvider", "(Ly9/t1;)V", "navigatorProvider", "s", "()Ly9/y0;", "currentDestination", "r", "()Ly9/w;", "currentBackStackEntry", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class e0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f225388k = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u impl = new u(this, new er.a() { // from class: y9.y
        @Override // er.a
        public final Object a() {
            return e0.D(this.f225555a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h navContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Activity activity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private h1 inflater;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean deepLinkHandled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m0 onBackPressedCallback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean enableOnBackPressedCallback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final k navInflater;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0090\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ly9/e0$b;", "Ly9/u1;", "Ly9/s1;", "Ly9/y0;", "navigator", "<init>", "(Ly9/e0;Ly9/s1;)V", "Ly9/w;", "backStackEntry", "Loq/i0;", "k", "(Ly9/w;)V", "p", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "b", "(Ly9/y0;Landroid/os/Bundle;)Ly9/w;", "popUpTo", "", "saveState", "h", "(Ly9/w;Z)V", "i", "entry", "f", "j", "g", "Ly9/s1;", "q", "()Ly9/s1;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public class b extends u1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final s1<? extends y0> navigator;

        public b(s1<? extends y0> s1Var) {
            this.navigator = s1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 r(b bVar, w wVar) {
            super.f(wVar);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 s(b bVar, w wVar, boolean z15) {
            super.h(wVar, z15);
            return i0.f148189a;
        }

        @Override // p136y9.u1
        public w b(y0 destination, Bundle arguments) {
            return e0.this.impl.r(destination, arguments);
        }

        @Override // p136y9.u1
        public void f(final w entry) {
            e0.this.impl.a0(this, entry, new er.a() { // from class: y9.f0
                @Override // er.a
                public final Object a() {
                    return e0.b.r(this.f225402a, entry);
                }
            });
        }

        @Override // p136y9.u1
        public void h(final w popUpTo, final boolean saveState) {
            e0.this.impl.k0(this, popUpTo, saveState, new er.a() { // from class: y9.g0
                @Override // er.a
                public final Object a() {
                    return e0.b.s(this.f225406a, popUpTo, saveState);
                }
            });
        }

        @Override // p136y9.u1
        public void i(w popUpTo, boolean saveState) {
            super.i(popUpTo, saveState);
        }

        @Override // p136y9.u1
        public void j(w entry) {
            super.j(entry);
            e0.this.impl.y0(entry);
        }

        @Override // p136y9.u1
        public void k(w backStackEntry) {
            e0.this.impl.z0(this, backStackEntry);
        }

        public final void p(w backStackEntry) {
            super.k(backStackEntry);
        }

        public final s1<? extends y0> q() {
            return this.navigator;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ly9/e0$c;", "", "Ly9/e0;", "controller", "Ly9/y0;", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "Loq/i0;", "a", "(Ly9/e0;Ly9/y0;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {
        void a(e0 controller, y0 destination, Bundle arguments);
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"y9/e0$d", "LCON/m0;", "Loq/i0;", "d", "()V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends m0 {
        d() {
            super(false);
        }

        @Override // CON.m0
        public void d() {
            e0.this.J();
        }
    }

    public e0(Context context) {
        this.context = context;
        this.navContext = new h(context);
        for (Object obj : eu.k.o(context, new l() { // from class: y9.z
            @Override // er.l
            public final Object b(Object obj2) {
                return e0.h((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.activity = (Activity) obj;
                this.onBackPressedCallback = new d();
                this.enableOnBackPressedCallback = true;
                this.impl.U().c(new f1(this.impl.U()));
                this.impl.U().c(new p136y9.b(this.context));
                this.navInflater = oq.l.a(new er.a() { // from class: y9.a0
                    @Override // er.a
                    public final Object a() {
                        return e0.E(this.f225367a);
                    }
                });
            }
        }
        obj = null;
        this.activity = (Activity) obj;
        this.onBackPressedCallback = new d();
        this.enableOnBackPressedCallback = true;
        this.impl.U().c(new f1(this.impl.U()));
        this.impl.U().c(new p136y9.b(this.context));
        this.navInflater = oq.l.a(new er.a() { // from class: y9.a0
            @Override // er.a
            public final Object a() {
                return e0.E(this.f225367a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(y0 y0Var, e0 e0Var, j1 j1Var) {
        j1Var.a(new l() { // from class: y9.c0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.B((c) obj);
            }
        });
        if (y0Var instanceof b1) {
            for (y0 y0Var2 : y0.INSTANCE.e(y0Var)) {
                y0 y0VarS = e0Var.s();
                if (t.c(y0Var2, y0VarS != null ? y0VarS.getParent() : null)) {
                }
            }
            if (f225388k) {
                j1Var.c(b1.INSTANCE.d(e0Var.u()).o(), new l() { // from class: y9.d0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e0.C((v1) obj);
                    }
                });
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(p136y9.c cVar) {
        cVar.e(0);
        cVar.f(0);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(v1 v1Var) {
        v1Var.c(true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(e0 e0Var) {
        e0Var.U();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h1 E(e0 e0Var) {
        h1 h1Var = e0Var.inflater;
        return h1Var == null ? new h1(e0Var.context, e0Var.impl.U()) : h1Var;
    }

    private final void H(y0 node, Bundle args, i1 navOptions, s1.a navigatorExtras) {
        this.impl.g0(node, args, navOptions, navigatorExtras);
    }

    public static /* synthetic */ void I(e0 e0Var, String str, i1 i1Var, s1.a aVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i15 & 2) != 0) {
            i1Var = null;
        }
        if ((i15 & 4) != 0) {
            aVar = null;
        }
        e0Var.G(str, i1Var, aVar);
    }

    public static /* synthetic */ boolean L(e0 e0Var, String str, boolean z15, boolean z16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        return e0Var.K(str, z15, z16);
    }

    private final boolean M(int destinationId, boolean inclusive, boolean saveState) {
        return this.impl.r0(destinationId, inclusive, saveState);
    }

    static /* synthetic */ boolean N(e0 e0Var, int i15, boolean z15, boolean z16, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i16 & 4) != 0) {
            z16 = false;
        }
        return e0Var.M(i15, z15, z16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private final void U() {
        boolean z15;
        m0 m0Var = this.onBackPressedCallback;
        if (this.enableOnBackPressedCallback) {
            z15 = t() > 1;
        }
        m0Var.i(z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context h(Context context) {
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static /* synthetic */ y0 n(e0 e0Var, int i15, y0 y0Var, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i16 & 2) != 0) {
            y0Var = null;
        }
        return e0Var.l(i15, y0Var);
    }

    private final String o(int[] deepLink) {
        return this.impl.G(deepLink);
    }

    private final int t() {
        m<w> mVarI = this.impl.I();
        int i15 = 0;
        if (mVarI != null && mVarI.isEmpty()) {
            return 0;
        }
        Iterator<w> it = mVarI.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof b1) && (i15 = i15 + 1) < 0) {
                v.w();
            }
        }
        return i15;
    }

    private final boolean z(int[] deepLink, Bundle[] args, boolean newTask) {
        b1 b1Var;
        int i15 = 0;
        if (newTask) {
            if (!this.impl.I().isEmpty()) {
                N(this, this.impl.get_graph().o(), true, false, 4, null);
            }
            while (i15 < deepLink.length) {
                int i16 = deepLink[i15];
                int i17 = i15 + 1;
                Bundle bundle = args[i15];
                final y0 y0VarN = n(this, i16, null, 2, null);
                if (y0VarN == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + y0.INSTANCE.d(this.navContext, i16) + " cannot be found from the current destination " + s());
                }
                H(y0VarN, bundle, Function1.a(new l() { // from class: y9.b0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e0.A(y0VarN, this, (j1) obj);
                    }
                }), null);
                i15 = i17;
            }
            this.deepLinkHandled = true;
            return true;
        }
        b1 b1VarT = this.impl.get_graph();
        int length = deepLink.length;
        int i18 = 0;
        while (i18 < length) {
            int i19 = deepLink[i18];
            Bundle bundle2 = args[i18];
            y0 y0VarT = i18 == 0 ? this.impl.get_graph() : b1VarT.M(i19);
            if (y0VarT == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + y0.INSTANCE.d(this.navContext, i19) + " cannot be found in graph " + b1VarT);
            }
            if (i18 == deepLink.length - 1) {
                H(y0VarT, bundle2, i1.a.k(new i1.a(), this.impl.get_graph().o(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (y0VarT instanceof b1) {
                while (true) {
                    b1Var = (b1) y0VarT;
                    if (!(b1Var.M(b1Var.U()) instanceof b1)) {
                        break;
                    }
                    y0VarT = b1Var.M(b1Var.U());
                }
                b1VarT = b1Var;
            }
            i18++;
        }
        this.deepLinkHandled = true;
        return true;
    }

    public void F(Uri deepLink) {
        this.impl.d0(new w0(deepLink, null, null));
    }

    public final void G(String route, i1 navOptions, s1.a navigatorExtras) {
        this.impl.c0(route, navOptions, navigatorExtras);
    }

    public boolean J() {
        return this.impl.l0();
    }

    public final boolean K(String route, boolean inclusive, boolean saveState) {
        return this.impl.o0(route, inclusive, saveState);
    }

    public void O(c listener) {
        this.impl.A0(listener);
    }

    public void P(Bundle navState) {
        if (navState != null) {
            navState.setClassLoader(this.context.getClassLoader());
        }
        this.impl.B0(navState);
        if (navState != null) {
            Boolean boolG = ua.c.g(ua.c.a(navState), "android-support-nav:controller:deepLinkHandled");
            this.deepLinkHandled = boolG != null ? boolG.booleanValue() : false;
        }
    }

    public Bundle Q() {
        r[] rVarArr;
        Bundle bundleE0 = this.impl.E0();
        if (this.deepLinkHandled) {
            if (bundleE0 == null) {
                Map mapI = v0.i();
                if (mapI.isEmpty()) {
                    rVarArr = new r[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapI.size());
                    for (Map.Entry entry : mapI.entrySet()) {
                        arrayList.add(y.a((String) entry.getKey(), entry.getValue()));
                    }
                    rVarArr = (r[]) arrayList.toArray(new r[0]);
                }
                bundleE0 = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
                ua.k.a(bundleE0);
            }
            ua.k.c(ua.k.a(bundleE0), "android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundleE0;
    }

    public void R(b1 b1Var) {
        this.impl.F0(b1Var);
    }

    public void S(q owner) {
        this.impl.H0(owner);
    }

    public void T(x0 viewModelStore) {
        this.impl.I0(viewModelStore);
    }

    public final void V(w0 request, Bundle args) {
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        ua.k.l(ua.k.a(args), "android-support-nav:controller:deepLinkIntent", intent);
    }

    public void i(c listener) {
        this.impl.o(listener);
    }

    public final boolean j() {
        Activity activity;
        return (this.deepLinkHandled || (activity = this.activity) == null || !y(activity.getIntent())) ? false : true;
    }

    public final b k(s1<? extends y0> navigator) {
        return new b(navigator);
    }

    public final y0 l(int destinationId, y0 matchingDest) {
        return this.impl.B(destinationId, matchingDest);
    }

    public final y0 m(String route) {
        return this.impl.C(route);
    }

    public final w p(String route) {
        return this.impl.K(route);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public w r() {
        return this.impl.L();
    }

    public y0 s() {
        return this.impl.M();
    }

    public b1 u() {
        return this.impl.N();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final h getNavContext() {
        return this.navContext;
    }

    public t1 w() {
        return this.impl.get_navigatorProvider();
    }

    public final p0<List<w>> x() {
        return this.impl.S();
    }

    public boolean y(Intent intent) {
        int[] intArray;
        r[] rVarArr;
        b1 b1VarR;
        y0.b bVarW;
        r[] rVarArr2;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e15) {
                c2.f("NavController", "handleDeepLink() could not extract deepLink from " + intent, e15);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Map mapI = v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new r[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList2.add(y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (r[]) arrayList2.toArray(new r[0]);
        }
        Bundle bundleA = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA);
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            ua.k.b(ua.k.a(bundleA), bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (bVarW = (b1VarR = this.impl.R()).W(h0.a(intent), true, true, b1VarR)) != null) {
            y0 destination = bVarW.getDestination();
            int[] iArrI = y0.i(destination, null, 1, null);
            Bundle bundleG = destination.g(bVarW.getMatchingArgs());
            if (bundleG != null) {
                ua.k.b(ua.k.a(bundleA), bundleG);
            }
            intArray = iArrI;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strO = o(intArray);
        if (strO != null) {
            ba.b.INSTANCE.a("NavController", "Could not find destination " + strO + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        ua.k.l(ua.k.a(bundleA), "android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i15 = 0; i15 < length; i15++) {
            Map mapI2 = v0.i();
            if (mapI2.isEmpty()) {
                rVarArr2 = new r[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapI2.size());
                for (Map.Entry entry2 : mapI2.entrySet()) {
                    arrayList3.add(y.a((String) entry2.getKey(), entry2.getValue()));
                }
                rVarArr2 = (r[]) arrayList3.toArray(new r[0]);
            }
            Bundle bundleA2 = e6.c.a((r[]) Arrays.copyOf(rVarArr2, rVarArr2.length));
            Bundle bundleA3 = ua.k.a(bundleA2);
            ua.k.b(bundleA3, bundleA);
            if (arrayList != null && (bundle = (Bundle) arrayList.get(i15)) != null) {
                ua.k.b(bundleA3, bundle);
            }
            bundleArr[i15] = bundleA2;
        }
        int flags = intent.getFlags();
        int i16 = 268435456 & flags;
        if (i16 == 0 || (flags & 32768) != 0) {
            return z(intArray, bundleArr, i16 != 0);
        }
        intent.addFlags(32768);
        w.i(this.context).f(intent).j();
        Activity activity = this.activity;
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }
}
