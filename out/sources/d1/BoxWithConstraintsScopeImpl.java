package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d1.d0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u0014*\u00020\u0014H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\"¨\u0006%"}, d2 = {"Ld1/d0;", "Ld1/c0;", "Ld1/w;", "Lc5/d;", "density", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "<init>", "(Lc5/d;JLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf3/m;", "Lf3/c;", "alignment", "d", "(Lf3/m;Lf3/c;)Lf3/m;", "c", "(Lf3/m;)Lf3/m;", "b", "Lc5/d;", "J", "e", "()J", "Lc5/h;", "a", "()F", "maxWidth", "maxHeight", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class BoxWithConstraintsScopeImpl implements c0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ x f39052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c5.d density;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    public /* synthetic */ BoxWithConstraintsScopeImpl(c5.d dVar, long j15, fr.k kVar) {
        this(dVar, j15);
    }

    @Override // d1.c0
    public float a() {
        return c5.b.h(getConstraints()) ? this.density.b2(c5.b.l(getConstraints())) : c5.h.INSTANCE.b();
    }

    @Override // d1.c0
    public float b() {
        return c5.b.g(getConstraints()) ? this.density.b2(c5.b.k(getConstraints())) : c5.h.INSTANCE.b();
    }

    @Override // d1.w
    public f3.m c(f3.m mVar) {
        return this.f39052a.c(mVar);
    }

    @Override // d1.w
    public f3.m d(f3.m mVar, f3.c cVar) {
        return this.f39052a.d(mVar, cVar);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public long getConstraints() {
        return this.constraints;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) other;
        return fr.t.c(this.density, boxWithConstraintsScopeImpl.density) && c5.b.f(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + c5.b.o(this.constraints);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) c5.b.q(this.constraints)) + ')';
    }

    private BoxWithConstraintsScopeImpl(c5.d dVar, long j15) {
        this.f39052a = x.f39368a;
        this.density = dVar;
        this.constraints = j15;
    }
}
