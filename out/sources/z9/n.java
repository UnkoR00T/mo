package z9;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import p136y9.i1;
import p136y9.s1;
import p136y9.y0;

/* JADX INFO: loaded from: classes3.dex */
@s1.b("dialog")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006%"}, d2 = {"Lz9/n;", "Ly9/s1;", "Lz9/n$b;", "<init>", "()V", "Ly9/w;", "backStackEntry", "Loq/i0;", "q", "(Ly9/w;)V", "", "entries", "Ly9/i1;", "navOptions", "Ly9/s1$a;", "navigatorExtras", "g", "(Ljava/util/List;Ly9/i1;Ly9/s1$a;)V", "p", "()Lz9/n$b;", "popUpTo", "", "savedState", "n", "(Ly9/w;Z)V", "entry", "t", "Lmu/p0;", "r", "()Lmu/p0;", "backStack", "", "s", "transitionInProgress", "d", "b", "a", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends s1<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f233558e = 8;

    public n() {
        super("dialog");
    }

    @Override // p136y9.s1
    public void g(List<p136y9.w> entries, i1 navOptions, s1.a navigatorExtras) {
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            d().k((p136y9.w) it.next());
        }
    }

    @Override // p136y9.s1
    public void n(p136y9.w popUpTo, boolean savedState) {
        d().i(popUpTo, savedState);
        int iP0 = pq.v.p0(d().d().getValue(), popUpTo);
        int i15 = 0;
        for (Object obj : d().d().getValue()) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            p136y9.w wVar = (p136y9.w) obj;
            if (i15 > iP0) {
                t(wVar);
            }
            i15 = i16;
        }
    }

    @Override // p136y9.s1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this, null, c.f233451a.a(), 2, null);
    }

    public final void q(p136y9.w backStackEntry) {
        n(backStackEntry, false);
    }

    public final mu.p0<List<p136y9.w>> r() {
        return d().c();
    }

    public final mu.p0<Set<p136y9.w>> s() {
        return d().d();
    }

    public final void t(p136y9.w entry) {
        d().f(entry);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lz9/n$b;", "Ly9/y0;", "Ly9/k;", "Lz9/n;", "navigator", "Landroidx/compose/ui/window/l;", "dialogProperties", "Lkotlin/Function1;", "Ly9/w;", "Loq/i0;", "content", "<init>", "(Lz9/n;Landroidx/compose/ui/window/l;Ler/q;)V", "h", "Landroidx/compose/ui/window/l;", "M", "()Landroidx/compose/ui/window/l;", "j", "Ler/q;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Ler/q;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends y0 implements p136y9.k {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.ui.window.l dialogProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final er.q<p136y9.w, p076m2.r, Integer, oq.i0> content;

        public /* synthetic */ b(n nVar, androidx.compose.ui.window.l lVar, er.q qVar, int i15, fr.k kVar) {
            this(nVar, (i15 & 2) != 0 ? new androidx.compose.ui.window.l(false, false, false, 7, null) : lVar, qVar);
        }

        public final er.q<p136y9.w, p076m2.r, Integer, oq.i0> L() {
            return this.content;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
        public final androidx.compose.ui.window.l getDialogProperties() {
            return this.dialogProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(n nVar, androidx.compose.ui.window.l lVar, er.q<? super p136y9.w, ? super p076m2.r, ? super Integer, oq.i0> qVar) {
            super(nVar);
            this.dialogProperties = lVar;
            this.content = qVar;
        }
    }
}
