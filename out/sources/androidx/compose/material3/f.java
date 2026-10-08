package androidx.compose.material3;

import l2.d1;
import p071kotlin.Metadata;
import u0.j0;
import u0.m;
import u0.q1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\bJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\n\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/f;", "", "T", "Lu0/j0;", "f", "()Lu0/j0;", "a", "c", "b", "e", "d", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f9825a;

    /* JADX INFO: renamed from: androidx.compose.material3.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/f$a;", "", "<init>", "()V", "Landroidx/compose/material3/f;", "a", "()Landroidx/compose/material3/f;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f9825a = new Companion();

        private Companion() {
        }

        public final f a() {
            return b.f9826b;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/f$b;", "Landroidx/compose/material3/f;", "<init>", "()V", "T", "Lu0/j0;", "f", "()Lu0/j0;", "a", "c", "b", "e", "d", "Lu0/q1;", "", "Lu0/q1;", "defaultSpatialSpec", "fastSpatialSpec", "slowSpatialSpec", "defaultEffectsSpec", "g", "fastEffectsSpec", "h", "slowEffectsSpec", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f9826b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final q1<Object> defaultSpatialSpec;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final q1<Object> fastSpatialSpec;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final q1<Object> slowSpatialSpec;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final q1<Object> defaultEffectsSpec;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final q1<Object> fastEffectsSpec;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final q1<Object> slowEffectsSpec;

        static {
            d1 d1Var = d1.f114415a;
            defaultSpatialSpec = m.j(d1Var.c(), d1Var.d(), null, 4, null);
            fastSpatialSpec = m.j(d1Var.g(), d1Var.h(), null, 4, null);
            slowSpatialSpec = m.j(d1Var.k(), d1Var.l(), null, 4, null);
            defaultEffectsSpec = m.j(d1Var.a(), d1Var.b(), null, 4, null);
            fastEffectsSpec = m.j(d1Var.e(), d1Var.f(), null, 4, null);
            slowEffectsSpec = m.j(d1Var.i(), d1Var.j(), null, 4, null);
        }

        private b() {
        }

        @Override // androidx.compose.material3.f
        public <T> j0<T> a() {
            return fastSpatialSpec;
        }

        @Override // androidx.compose.material3.f
        public <T> j0<T> b() {
            return defaultEffectsSpec;
        }

        @Override // androidx.compose.material3.f
        public <T> j0<T> c() {
            return slowSpatialSpec;
        }

        @Override // androidx.compose.material3.f
        public <T> j0<T> d() {
            return slowEffectsSpec;
        }

        @Override // androidx.compose.material3.f
        public <T> j0<T> e() {
            return fastEffectsSpec;
        }

        @Override // androidx.compose.material3.f
        public <T> j0<T> f() {
            return defaultSpatialSpec;
        }
    }

    <T> j0<T> a();

    <T> j0<T> b();

    <T> j0<T> c();

    <T> j0<T> d();

    <T> j0<T> e();

    <T> j0<T> f();
}
