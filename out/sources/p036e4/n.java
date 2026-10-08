package p036e4;

import c5.b;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Le4/n;", "Le4/v0;", "Le4/v;", "measurable", "Le4/x;", "minMax", "Le4/y;", "widthHeight", "<init>", "(Le4/v;Le4/x;Le4/y;)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/a2;", "o0", "(J)Le4/a2;", "", "height", "e0", "(I)I", "m0", "width", "U", "n", "a", "Le4/v;", "getMeasurable", "()Le4/v;", "b", "Le4/x;", "c", "Le4/y;", "", "e", "()Ljava/lang/Object;", "parentData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v measurable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x minMax;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y widthHeight;

    public n(v vVar, x xVar, y yVar) {
        this.measurable = vVar;
        this.minMax = xVar;
        this.widthHeight = yVar;
    }

    @Override // p036e4.v
    public int U(int width) {
        return this.measurable.U(width);
    }

    @Override // p036e4.v
    public Object e() {
        return this.measurable.e();
    }

    @Override // p036e4.v
    public int e0(int height) {
        return this.measurable.e0(height);
    }

    @Override // p036e4.v
    public int m0(int height) {
        return this.measurable.m0(height);
    }

    @Override // p036e4.v
    public int n(int width) {
        return this.measurable.n(width);
    }

    @Override // p036e4.v0
    public a2 o0(long constraints) {
        if (this.widthHeight == y.Width) {
            return new p(this.minMax == x.Max ? this.measurable.m0(b.k(constraints)) : this.measurable.e0(b.k(constraints)), b.g(constraints) ? b.k(constraints) : 32767);
        }
        return new p(b.h(constraints) ? b.l(constraints) : 32767, this.minMax == x.Max ? this.measurable.n(b.l(constraints)) : this.measurable.U(b.l(constraints)));
    }
}
