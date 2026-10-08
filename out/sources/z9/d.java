package z9;

import p071kotlin.Metadata;
import p114t0.y0;
import p136y9.b1;
import p136y9.f1;
import p136y9.s1;
import p136y9.t1;

/* JADX INFO: loaded from: classes3.dex */
@s1.b("navigation")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lz9/d;", "Ly9/f1;", "Ly9/t1;", "navigatorProvider", "<init>", "(Ly9/t1;)V", "Ly9/b1;", "q", "()Ly9/b1;", "a", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends f1 {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R8\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR8\u0010\u0015\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR8\u0010\u0019\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR8\u0010\u001d\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR8\u0010\"\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Lz9/d$a;", "Ly9/b1;", "Ly9/s1;", "navGraphNavigator", "<init>", "(Ly9/s1;)V", "Lkotlin/Function1;", "Lt0/h;", "Ly9/w;", "Lt0/c0;", "k", "Ler/l;", "f0", "()Ler/l;", "setEnterTransition$navigation_compose_release", "(Ler/l;)V", "enterTransition", "Lt0/e0;", "l", "g0", "setExitTransition$navigation_compose_release", "exitTransition", "m", "h0", "setPopEnterTransition$navigation_compose_release", "popEnterTransition", "n", "i0", "setPopExitTransition$navigation_compose_release", "popExitTransition", "Lt0/y0;", "p", "j0", "setSizeTransform$navigation_compose_release", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends b1 {

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.c0> enterTransition;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.e0> exitTransition;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.c0> popEnterTransition;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, p114t0.e0> popExitTransition;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private er.l<p114t0.h<p136y9.w>, y0> sizeTransform;

        public a(s1<? extends b1> s1Var) {
            super(s1Var);
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.c0> f0() {
            return this.enterTransition;
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.e0> g0() {
            return this.exitTransition;
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.c0> h0() {
            return this.popEnterTransition;
        }

        public final er.l<p114t0.h<p136y9.w>, p114t0.e0> i0() {
            return this.popExitTransition;
        }

        public final er.l<p114t0.h<p136y9.w>, y0> j0() {
            return this.sizeTransform;
        }
    }

    public d(t1 t1Var) {
        super(t1Var);
    }

    @Override // p136y9.f1, p136y9.s1
    /* JADX INFO: renamed from: q */
    public b1 c() {
        return new a(this);
    }
}
