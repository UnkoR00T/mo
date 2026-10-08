package gb4;

import dx.Vendor;
import java.util.Iterator;
import java.util.List;
import jb4.ErrorActionData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lgb4/v0;", "Lib4/c;", "Liy/u;", "keyguardManager", "Lgx/d;", "globalEventManager", "Lmx/c;", "labelProvider", "Lpx/d;", "remoteLogger", "Lib4/a;", "deactivateDomainErrorMapper", "", "Lib4/d;", "httpDomainErrorMappers", "Lgb4/w0;", "integrityDomainErrorMapper", "Lgb4/a;", "appUpdateRequiredDomainErrorMapper", "<init>", "(Liy/u;Lgx/d;Lmx/c;Lpx/d;Lib4/a;Ljava/util/List;Lgb4/w0;Lgb4/a;)V", "Lib4/c$a;", "params", "Ljb4/b;", "k0", "(Lib4/c$a;)Ljb4/b;", "a", "Liy/u;", "b", "Lgx/d;", "c", "Lmx/c;", "d", "Lpx/d;", "e", "Lib4/a;", "f", "Ljava/util/List;", "g", "Lgb4/w0;", "h", "Lgb4/a;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 implements ib4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.u keyguardManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.a deactivateDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<ib4.d> httpDomainErrorMappers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w0 integrityDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final gb4.a appUpdateRequiredDomainErrorMapper;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71710a;

        static {
            int[] iArr = new int[dx.b.f.values().length];
            try {
                iArr[dx.b.f.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dx.b.f.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dx.b.f.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71710a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v0(iy.u uVar, gx.d dVar, mx.c cVar, px.d dVar2, ib4.a aVar, List<? extends ib4.d> list, w0 w0Var, gb4.a aVar2) {
        this.keyguardManager = uVar;
        this.globalEventManager = dVar;
        this.labelProvider = cVar;
        this.remoteLogger = dVar2;
        this.deactivateDomainErrorMapper = aVar;
        this.httpDomainErrorMappers = list;
        this.integrityDomainErrorMapper = w0Var;
        this.appUpdateRequiredDomainErrorMapper = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(v0 v0Var) {
        v0Var.globalEventManager.c(gx.a.b.f78191a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(v0 v0Var) {
        v0Var.globalEventManager.c(gx.a.b.f78191a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Primary(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S0(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Secondary(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.C2162b.f90860a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a1(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Close(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b1(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Primary(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c1(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Secondary(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d1(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Close(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e1(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Primary(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Secondary(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.C2162b.f90860a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.C2162b.f90860a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(ib4.c.Params params, dx.b bVar) {
        params.c().b(new ib4.c.b.a.Close(((dx.b.Business) bVar).getType()));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(v0 v0Var) {
        v0Var.globalEventManager.c(gx.a.c.f78192a);
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x024a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0281 A[RETURN] */
    @Override // er.l
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final ib4.c.Params params) {
        int i15;
        jb4.b bVarA;
        px.f.e(px.f.f163100a, "DomainError:\n" + params.getDomainError(), null, px.c.a(this), 2, null);
        final dx.b domainError = params.getDomainError();
        if (domainError instanceof dx.b.Business) {
            dx.b.Business business = (dx.b.Business) domainError;
            int i16 = a.f71710a[business.getInformationType().ordinal()];
            if (i16 == 1) {
                Label title = business.getTitle();
                Label message = business.getMessage();
                Label secondMessage = business.getSecondMessage();
                ErrorActionData errorActionData = null;
                ErrorActionData errorActionData2 = new ErrorActionData(business.getPrimaryActionLabel(), new er.a() { // from class: gb4.b
                    @Override // er.a
                    public final Object a() {
                        return v0.l0(params, domainError);
                    }
                });
                if (business.getSecondaryActionLabel().l()) {
                    errorActionData = new ErrorActionData(business.getSecondaryActionLabel(), new er.a() { // from class: gb4.d
                        @Override // er.a
                        public final Object a() {
                            return v0.m0(params, domainError);
                        }
                    });
                }
                return new jb4.b.Warning(title, message, secondMessage, errorActionData2, errorActionData, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.p
                    @Override // er.a
                    public final Object a() {
                        return v0.w0(params, domainError);
                    }
                }), 32, null);
            }
            if (i16 != 2) {
                if (i16 == 3) {
                    return new jb4.b.Info(business.getTitle(), business.getMessage(), business.getSecondMessage(), new ErrorActionData(business.getPrimaryActionLabel(), new er.a() { // from class: gb4.l0
                        @Override // er.a
                        public final Object a() {
                            return v0.b1(params, domainError);
                        }
                    }), business.getSecondaryActionLabel().l() ? new ErrorActionData(business.getSecondaryActionLabel(), new er.a() { // from class: gb4.m0
                        @Override // er.a
                        public final Object a() {
                            return v0.c1(params, domainError);
                        }
                    }) : null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.n0
                        @Override // er.a
                        public final Object a() {
                            return v0.d1(params, domainError);
                        }
                    }), 32, null);
                }
                throw new oq.p();
            }
            Label title2 = business.getTitle();
            Label message2 = business.getMessage();
            ErrorActionData errorActionData3 = null;
            Label secondMessage2 = business.getSecondMessage();
            ErrorActionData errorActionData4 = new ErrorActionData(business.getPrimaryActionLabel(), new er.a() { // from class: gb4.b0
                @Override // er.a
                public final Object a() {
                    return v0.H0(params, domainError);
                }
            });
            if (business.getSecondaryActionLabel().l()) {
                errorActionData3 = new ErrorActionData(business.getSecondaryActionLabel(), new er.a() { // from class: gb4.j0
                    @Override // er.a
                    public final Object a() {
                        return v0.S0(params, domainError);
                    }
                });
            }
            return new jb4.b.Failure(title2, message2, secondMessage2, errorActionData4, errorActionData3, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.k0
                @Override // er.a
                public final Object a() {
                    return v0.a1(params, domainError);
                }
            }), 32, null);
        }
        if (fr.t.c(domainError, dx.b.g.a.f45045a)) {
            return new jb4.b.Info(this.labelProvider.c(x0.f71738x), this.labelProvider.c(x0.f71737w), null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.o0
                @Override // er.a
                public final Object a() {
                    return v0.e1(params);
                }
            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.m
                @Override // er.a
                public final Object a() {
                    return v0.n0(params);
                }
            }), 52, null);
        }
        if (domainError instanceof dx.b.AppUpdateRequired) {
            return this.appUpdateRequiredDomainErrorMapper.b(new gb4.a.Params((dx.b.AppUpdateRequired) domainError));
        }
        if (fr.t.c(domainError, dx.b.g.e.f45078a)) {
            return new jb4.b.Warning(this.labelProvider.c(x0.f71720f), this.labelProvider.c(x0.f71719e), null, params.getGenericRetryAllowed() ? new ErrorActionData(this.labelProvider.c(x0.f71725k), new er.a() { // from class: gb4.x
                @Override // er.a
                public final Object a() {
                    return v0.o0(params);
                }
            }) : new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.i0
                @Override // er.a
                public final Object a() {
                    return v0.p0(params);
                }
            }), params.getGenericRetryAllowed() ? new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.p0
                @Override // er.a
                public final Object a() {
                    return v0.q0(params);
                }
            }) : null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.q0
                @Override // er.a
                public final Object a() {
                    return v0.r0(params);
                }
            }), 36, null);
        }
        if (domainError instanceof dx.b.g.Http) {
            Iterator<T> it = this.httpDomainErrorMappers.iterator();
            while (it.hasNext()) {
                bVarA = ((ib4.d) it.next()).b(new ib4.d.Params((dx.b.g.Http) domainError, params.c(), params.getGenericRetryAllowed())).a();
                if (bVarA != null) {
                    if (bVarA == null) {
                        return new jb4.b.Failure(this.labelProvider.c(x0.f71717c), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.r0
                            @Override // er.a
                            public final Object a() {
                                return v0.s0(params);
                            }
                        }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.s0
                            @Override // er.a
                            public final Object a() {
                                return v0.t0(params);
                            }
                        }), 54, null);
                    }
                    return bVarA;
                }
            }
            bVarA = null;
            if (bVarA == null) {
                return new jb4.b.Failure(this.labelProvider.c(x0.f71717c), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.r0
                    @Override // er.a
                    public final Object a() {
                        return v0.s0(params);
                    }
                }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.s0
                    @Override // er.a
                    public final Object a() {
                        return v0.t0(params);
                    }
                }), 54, null);
            }
            return bVarA;
        }
        if ((domainError instanceof dx.b.Parsing) || fr.t.c(domainError, dx.b.g.C1031b.f45046a) || fr.t.c(domainError, dx.b.g.c.f45047a) || fr.t.c(domainError, dx.b.g.f.f45079a) || fr.t.c(domainError, dx.b.g.h.f45081a)) {
            if ((domainError instanceof dx.b.g.f) || (domainError instanceof dx.b.g.h)) {
                px.b.y5(this.remoteLogger, "timeout error", null, px.c.a(this), 2, null);
            }
            return new jb4.b.Failure(this.labelProvider.c(x0.f71717c), this.labelProvider.c(x0.f71723i), null, params.getGenericRetryAllowed() ? new ErrorActionData(this.labelProvider.c(x0.f71725k), new er.a() { // from class: gb4.t0
                @Override // er.a
                public final Object a() {
                    return v0.u0(params);
                }
            }) : new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.u0
                @Override // er.a
                public final Object a() {
                    return v0.v0(params);
                }
            }), params.getGenericRetryAllowed() ? new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.c
                @Override // er.a
                public final Object a() {
                    return v0.x0(params);
                }
            }) : null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.e
                @Override // er.a
                public final Object a() {
                    return v0.y0(params);
                }
            }), 36, null);
        }
        if (domainError instanceof dx.b.g.SslCertificate) {
            return ((dx.b.g.SslCertificate) domainError).getAppUpdateRequired() ? new jb4.b.Warning(this.labelProvider.c(x0.f71740z), this.labelProvider.c(x0.f71739y), null, new ErrorActionData(this.labelProvider.c(x0.f71736v), new er.a() { // from class: gb4.f
                @Override // er.a
                public final Object a() {
                    return v0.z0(this.f71665a);
                }
            }), new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.g
                @Override // er.a
                public final Object a() {
                    return v0.A0(this.f71667a);
                }
            }), null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.h
                @Override // er.a
                public final Object a() {
                    return v0.B0(this.f71669a);
                }
            }), 36, null) : new jb4.b.Failure(this.labelProvider.c(x0.f71717c), this.labelProvider.c(x0.f71718d), null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.i
                @Override // er.a
                public final Object a() {
                    return v0.C0(params);
                }
            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.j
                @Override // er.a
                public final Object a() {
                    return v0.D0(params);
                }
            }), 52, null);
        }
        if (domainError instanceof dx.b.j.InterfaceC1034b) {
            return this.integrityDomainErrorMapper.b(new w0.Params((dx.b.j.InterfaceC1034b) domainError, params.c()));
        }
        if (domainError instanceof dx.b.j.c) {
            return this.keyguardManager.a() ? new jb4.b.Failure(this.labelProvider.c(x0.f71726l), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.k
                @Override // er.a
                public final Object a() {
                    return v0.E0(params);
                }
            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.l
                @Override // er.a
                public final Object a() {
                    return v0.F0(params);
                }
            }), 54, null) : new jb4.b.Failure(this.labelProvider.c(x0.f71724j), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.n
                @Override // er.a
                public final Object a() {
                    return v0.G0(params);
                }
            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.o
                @Override // er.a
                public final Object a() {
                    return v0.I0(params);
                }
            }), 54, null);
        }
        if (domainError instanceof dx.b.j.a) {
            return new jb4.b.Failure(this.labelProvider.c(x0.f71728n), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.q
                @Override // er.a
                public final Object a() {
                    return v0.J0(params);
                }
            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.r
                @Override // er.a
                public final Object a() {
                    return v0.K0(params);
                }
            }), 54, null);
        }
        if (domainError instanceof dx.b.j.e) {
            return new jb4.b.Failure(this.labelProvider.c(x0.f71731q), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.s
                @Override // er.a
                public final Object a() {
                    return v0.L0(params);
                }
            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.t
                @Override // er.a
                public final Object a() {
                    return v0.M0(params);
                }
            }), 54, null);
        }
        if (fr.t.c(domainError, dx.c.f45092a) || fr.t.c(domainError, dx.d.f45093a)) {
            return new jb4.b.Failure(this.labelProvider.c(x0.f71734t), this.labelProvider.c(x0.f71733s), null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.u
                @Override // er.a
                public final Object a() {
                    return v0.N0();
                }
            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.v
                @Override // er.a
                public final Object a() {
                    return v0.O0();
                }
            }), 52, null);
        }
        if (fr.t.c(domainError, dx.e.f45094a) || (domainError instanceof Vendor)) {
            return new jb4.b.Failure(this.labelProvider.c(x0.f71724j), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.w
                @Override // er.a
                public final Object a() {
                    return v0.P0(params);
                }
            }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.y
                @Override // er.a
                public final Object a() {
                    return v0.Q0(params);
                }
            }), 54, null);
        }
        if (!(domainError instanceof dx.b.InterfaceC1027b.a)) {
            if ((domainError instanceof dx.b.h) || fr.t.c(domainError, dx.h.f45097a) || (domainError instanceof dx.b.SystemBuild) || (domainError instanceof dx.b.Generic) || (domainError instanceof dx.b.j)) {
                return new jb4.b.Failure(this.labelProvider.c(x0.f71724j), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.c0
                    @Override // er.a
                    public final Object a() {
                        return v0.U0(params);
                    }
                }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.d0
                    @Override // er.a
                    public final Object a() {
                        return v0.V0(params);
                    }
                }), 54, null);
            }
            if (domainError instanceof dx.b.Deactivate) {
                return this.deactivateDomainErrorMapper.b(new ib4.a.Params((dx.b.Deactivate) domainError));
            }
            if (fr.t.c(domainError, dx.g.f45096a)) {
                return new jb4.b.Failure(this.labelProvider.c(x0.f71721g), this.labelProvider.c(x0.f71715a), null, params.getGenericRetryAllowed() ? new ErrorActionData(this.labelProvider.c(x0.f71722h), new er.a() { // from class: gb4.e0
                    @Override // er.a
                    public final Object a() {
                        return v0.W0(params);
                    }
                }) : new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.f0
                    @Override // er.a
                    public final Object a() {
                        return v0.X0(params);
                    }
                }), params.getGenericRetryAllowed() ? new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.g0
                    @Override // er.a
                    public final Object a() {
                        return v0.Y0(params);
                    }
                }) : null, null, new ErrorActionData(null, new er.a() { // from class: gb4.h0
                    @Override // er.a
                    public final Object a() {
                        return v0.Z0(params);
                    }
                }, 1, null), 36, null);
            }
            throw new oq.p();
        }
        mx.c cVar = this.labelProvider;
        dx.b.InterfaceC1027b.a aVar = (dx.b.InterfaceC1027b.a) domainError;
        if (fr.t.c(aVar, dx.b.InterfaceC1027b.a.C1029b.f45023a)) {
            i15 = x0.f71730p;
        } else if (fr.t.c(aVar, dx.b.InterfaceC1027b.a.d.f45025a)) {
            i15 = x0.f71732r;
        } else if (fr.t.c(aVar, dx.b.InterfaceC1027b.a.C1028a.f45022a)) {
            i15 = x0.f71727m;
        } else if (fr.t.c(aVar, dx.b.InterfaceC1027b.a.c.f45024a)) {
            i15 = x0.f71729o;
        } else if (aVar instanceof dx.b.InterfaceC1027b.a.UnknownError) {
            i15 = x0.f71717c;
        } else {
            if (!fr.t.c(aVar, dx.b.InterfaceC1027b.a.f.f45028a)) {
                throw new oq.p();
            }
            i15 = x0.f71735u;
        }
        return new jb4.b.Failure(cVar.c(i15), null, null, new ErrorActionData(this.labelProvider.c(x0.f71716b), new er.a() { // from class: gb4.z
            @Override // er.a
            public final Object a() {
                return v0.R0(params);
            }
        }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: gb4.a0
            @Override // er.a
            public final Object a() {
                return v0.T0(params);
            }
        }), 54, null);
    }
}
