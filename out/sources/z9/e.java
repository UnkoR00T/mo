package z9;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p136y9.i1;
import p136y9.s1;
import p136y9.y0;

/* JADX INFO: loaded from: classes3.dex */
@s1.b("composable")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lz9/e;", "Ly9/s1;", "Lz9/e$b;", "<init>", "()V", "", "Ly9/w;", "entries", "Ly9/i1;", "navOptions", "Ly9/s1$a;", "navigatorExtras", "Loq/i0;", "g", "(Ljava/util/List;Ly9/i1;Ly9/s1$a;)V", "p", "()Lz9/e$b;", "popUpTo", "", "savedState", "n", "(Ly9/w;Z)V", "entry", "t", "(Ly9/w;)V", "s", "Lm2/a3;", "d", "Lm2/a3;", "r", "()Lm2/a3;", "isPop", "Lmu/p0;", "q", "()Lmu/p0;", "backStack", "e", "b", "a", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends s1<b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f233465f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3<Boolean> isPop;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nR,\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR8\u0010\u0018\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R8\u0010\u001d\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R8\u0010!\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R8\u0010%\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R8\u0010*\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017¨\u0006+"}, d2 = {"Lz9/e$b;", "Ly9/y0;", "Lz9/e;", "navigator", "Lkotlin/Function2;", "Lt0/f;", "Ly9/w;", "Loq/i0;", "content", "<init>", "(Lz9/e;Ler/r;)V", "h", "Ler/r;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Ler/r;", "Lkotlin/Function1;", "Lt0/h;", "Lt0/c0;", "j", "Ler/l;", "M", "()Ler/l;", "T", "(Ler/l;)V", "enterTransition", "Lt0/e0;", "k", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "U", "exitTransition", "l", "Q", "V", "popEnterTransition", "m", "R", "W", "popExitTransition", "Lt0/y0;", "n", ip.a.f96137b, "X", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends y0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final er.r<p114t0.f, p136y9.w, p076m2.r, Integer, oq.i0> content;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.c0> enterTransition;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.e0> exitTransition;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.c0> popEnterTransition;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.e0> popExitTransition;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.y0> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e eVar, er.r<? super p114t0.f, p136y9.w, ? super p076m2.r, ? super Integer, oq.i0> rVar) {
            super(eVar);
            this.content = rVar;
        }

        public final er.r<p114t0.f, p136y9.w, p076m2.r, Integer, oq.i0> L() {
            return this.content;
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.c0> M() {
            return this.enterTransition;
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.e0> P() {
            return this.exitTransition;
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.c0> Q() {
            return this.popEnterTransition;
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.e0> R() {
            return this.popExitTransition;
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.y0> S() {
            return this.sizeTransform;
        }

        public final void T(er.l<p114t0.h<p136y9.w>, p114t0.c0> lVar) {
            this.enterTransition = lVar;
        }

        public final void U(er.l<p114t0.h<p136y9.w>, p114t0.e0> lVar) {
            this.exitTransition = lVar;
        }

        public final void V(er.l<p114t0.h<p136y9.w>, p114t0.c0> lVar) {
            this.popEnterTransition = lVar;
        }

        public final void W(er.l<p114t0.h<p136y9.w>, p114t0.e0> lVar) {
            this.popExitTransition = lVar;
        }

        public final void X(er.l<p114t0.h<p136y9.w>, p114t0.y0> lVar) {
            this.sizeTransform = lVar;
        }
    }

    public e() {
        super("composable");
        this.isPop = c6.e(Boolean.FALSE, null, 2, null);
    }

    @Override // p136y9.s1
    public void g(List<p136y9.w> entries, i1 navOptions, s1.a navigatorExtras) {
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            d().l((p136y9.w) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    @Override // p136y9.s1
    public void n(p136y9.w popUpTo, boolean savedState) {
        d().i(popUpTo, savedState);
        this.isPop.setValue(Boolean.TRUE);
    }

    @Override // p136y9.s1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b c() {
        return new b(this, z9.b.f233444a.a());
    }

    public final mu.p0<List<p136y9.w>> q() {
        return d().c();
    }

    public final a3<Boolean> r() {
        return this.isPop;
    }

    public final void s(p136y9.w entry) {
        d().f(entry);
    }

    public final void t(p136y9.w entry) {
        d().j(entry);
    }
}
