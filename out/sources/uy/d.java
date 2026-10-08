package uy;

import dx.i;
import mu.g;
import p071kotlin.Metadata;
import vy.Coordinates;
import vy.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H&¢\u0006\u0004\b\u000f\u0010\nJ'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Luy/d;", "", "", "d", "()Z", "Lmu/g;", "Ldx/i;", "Ldx/b;", "Lvy/c;", "g", "()Lmu/g;", "Loq/i0;", "a", "()V", "e", "b", "Lvy/j;", "priority", "", "timeout", "Lvy/d;", "f", "(Lvy/j;J)Lmu/g;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f202159a;

    /* JADX INFO: renamed from: uy.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luy/d$a;", "", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f202159a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ g c(d dVar, j jVar, long j15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrentLocationFlow");
        }
        if ((i15 & 2) != 0) {
            j15 = 10000;
        }
        return dVar.f(jVar, j15);
    }

    void a();

    g<Boolean> b();

    boolean d();

    void e();

    g<vy.d> f(j priority, long timeout);

    g<i<dx.b, Coordinates>> g();
}
