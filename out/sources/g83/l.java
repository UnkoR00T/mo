package g83;

import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lg83/l;", "Lib4/c;", "Lmx/c;", "labelProvider", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Ldx/b;", "Ljb4/f;", "u", "(Ldx/b;)Ljb4/f;", "Lib4/c$a;", "params", "Ljb4/b;", "v", "(Lib4/c$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements ib4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    public l(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    private final PayloadErrorData u(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(ib4.c.Params params) {
        params.c().b(new ib4.c.b.a.Primary(a.UPDATE_APP));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // er.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final ib4.c.Params params) {
        PayloadErrorData payloadErrorDataU = u(params.getDomainError());
        String code = payloadErrorDataU != null ? payloadErrorDataU.getCode() : null;
        if (code != null) {
            int iHashCode = code.hashCode();
            if (iHashCode != 1507426) {
                switch (iHashCode) {
                    case 1537247:
                        if (code.equals("2012")) {
                            return new jb4.b.Failure(this.labelProvider.c(n73.a.V), this.labelProvider.c(n73.a.U), null, new ErrorActionData(this.labelProvider.c(n73.a.f133448b), new er.a() { // from class: g83.d
                                @Override // er.a
                                public final Object a() {
                                    return l.E(params);
                                }
                            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: g83.e
                                @Override // er.a
                                public final Object a() {
                                    return l.F();
                                }
                            }), 52, null);
                        }
                        break;
                    case 1537248:
                        if (code.equals("2013")) {
                            return new jb4.b.Failure(this.labelProvider.c(n73.a.X), this.labelProvider.c(n73.a.W), null, new ErrorActionData(this.labelProvider.c(n73.a.f133448b), new er.a() { // from class: g83.f
                                @Override // er.a
                                public final Object a() {
                                    return l.G(params);
                                }
                            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: g83.g
                                @Override // er.a
                                public final Object a() {
                                    return l.H(params);
                                }
                            }), 52, null);
                        }
                        break;
                    case 1537249:
                        if (code.equals("2014")) {
                            return new jb4.b.Failure(this.labelProvider.c(n73.a.Z), this.labelProvider.c(n73.a.Y), null, new ErrorActionData(this.labelProvider.c(n73.a.f133448b), new er.a() { // from class: g83.h
                                @Override // er.a
                                public final Object a() {
                                    return l.I(params);
                                }
                            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: g83.i
                                @Override // er.a
                                public final Object a() {
                                    return l.J(params);
                                }
                            }), 52, null);
                        }
                        break;
                    case 1537250:
                        if (code.equals("2015")) {
                            return new jb4.b.Failure(this.labelProvider.c(n73.a.f133450c), this.labelProvider.c(n73.a.f133447a0), null, new ErrorActionData(this.labelProvider.c(n73.a.f133448b), new er.a() { // from class: g83.j
                                @Override // er.a
                                public final Object a() {
                                    return l.K(params);
                                }
                            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: g83.k
                                @Override // er.a
                                public final Object a() {
                                    return l.L(params);
                                }
                            }), 52, null);
                        }
                        break;
                }
            } else if (code.equals("1003")) {
                return new jb4.b.Info(this.labelProvider.c(n73.a.T), this.labelProvider.c(n73.a.S), null, new ErrorActionData(this.labelProvider.c(n73.a.f133460h), new er.a() { // from class: g83.b
                    @Override // er.a
                    public final Object a() {
                        return l.x(params);
                    }
                }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: g83.c
                    @Override // er.a
                    public final Object a() {
                        return l.z(params);
                    }
                }), 52, null);
            }
        }
        return this.genericDomainErrorMapper.b(params);
    }
}
