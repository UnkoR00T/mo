package g1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lg1/d;", "Lg1/w0;", "Lkotlin/Function2;", "Lc5/d;", "Lc5/b;", "Lg1/v0;", "calculation", "<init>", "(Ler/p;)V", "density", CryptoServicesPermission.CONSTRAINTS, "a", "(Lc5/d;J)Lg1/v0;", "Ler/p;", "b", "J", "cachedConstraints", "", "c", "F", "cachedDensity", "d", "Lg1/v0;", "cachedSizes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.p<c5.d, c5.b, v0> calculation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long cachedConstraints = c5.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float cachedDensity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private v0 cachedSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public d(er.p<? super c5.d, ? super c5.b, v0> pVar) {
        this.calculation = pVar;
    }

    @Override // g1.w0
    public v0 a(c5.d density, long constraints) {
        if (this.cachedSizes != null && c5.b.f(this.cachedConstraints, constraints) && this.cachedDensity == density.getDensity()) {
            return this.cachedSizes;
        }
        this.cachedConstraints = constraints;
        this.cachedDensity = density.getDensity();
        v0 v0VarB = this.calculation.B(density, c5.b.a(constraints));
        this.cachedSizes = v0VarB;
        return v0VarB;
    }
}
