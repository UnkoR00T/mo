package ey3;

import dy3.PaymentCardsNavParams;
import fr.q0;
import fy3.DeleteCardsRequiredData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vr0.BEUserCard;
import vw.NavigationDialogModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BK\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003088\u0014X\u0094\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010L¨\u0006N"}, d2 = {"Ley3/s;", "Ll00/g;", "Ley3/c;", "Ley3/a;", "Ley3/d;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Ley3/f;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lcs0/c;", "deleteCardUseCase", "Lmx/c;", "labelProvider", "snackBarManagerStateHolder", "Ley3/b;", "setupData", "<init>", "(Lyy/a;Ley3/f;Lac4/a;Lib4/c;Lcs0/c;Lmx/c;Li70/n;Ley3/b;)V", "state", "Ley3/d$a;", "t9", "(Ley3/c;)Ley3/d$a;", "data", "Loq/i0;", "v9", "(Ley3/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ley3/f;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lcs0/c;", "f", "Lmx/c;", "g", "Li70/n;", "h", "Ley3/b;", "Ley3/c$a;", "j", "Ley3/c$a;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Ley3/a$f;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<ey3.c, ey3.a> implements ey3.d, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ey3.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cs0.c deleteCardUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private PaymentsDeleteCardsSetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ey3.c.a initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ey3.c, ey3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<ey3.d.a> state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ey3.a.f> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ey3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f54326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f54327b;

        /* JADX INFO: renamed from: ey3.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1280a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f54328a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f54329b;

            /* JADX INFO: renamed from: ey3.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1281a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f54330d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f54331e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f54332f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f54334h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f54335j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f54336k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f54337l;

                public C1281a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f54330d = obj;
                    this.f54331e |= PKIFailureInfo.systemUnavail;
                    return C1280a.this.F(null, this);
                }
            }

            public C1280a(mu.h hVar, s sVar) {
                this.f54328a = hVar;
                this.f54329b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1281a c1281a;
                if (eVar instanceof C1281a) {
                    c1281a = (C1281a) eVar;
                    int i15 = c1281a.f54331e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1281a.f54331e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1281a = new C1281a(eVar);
                    }
                } else {
                    c1281a = new C1281a(eVar);
                }
                Object obj2 = c1281a.f54330d;
                Object objE = uq.b.e();
                int i16 = c1281a.f54331e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f54328a;
                    ey3.d.a aVarT9 = this.f54329b.t9((ey3.c) obj);
                    c1281a.f54332f = vq.j.a(obj);
                    c1281a.f54334h = vq.j.a(c1281a);
                    c1281a.f54335j = vq.j.a(obj);
                    c1281a.f54336k = vq.j.a(hVar);
                    c1281a.f54337l = 0;
                    c1281a.f54331e = 1;
                    if (hVar.F(aVarT9, c1281a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, s sVar) {
            this.f54326a = gVar;
            this.f54327b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ey3.d.a> hVar, tq.e eVar) {
            Object objA = this.f54326a.a(new C1280a(hVar, this.f54327b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ley3/a$b;", "action", "Ley3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ley3/a$b;Ley3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ey3.a.Error, ey3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54339f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(s sVar, ey3.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    sVar.d9(ey3.a.c.f54267a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    error.b().a();
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ey3.a.Error error = (ey3.a.Error) this.f54339f;
            Object objE = uq.b.e();
            int i15 = this.f54338e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ey3.a.f> bVarY1 = s.this.Y1();
                ib4.c cVar = s.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final s sVar = s.this;
                ey3.a.f.Error error2 = new ey3.a.f.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ey3.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.b.O(sVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f54339f = vq.j.a(error);
                this.f54338e = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.Error error, ey3.c cVar, tq.e<? super i0> eVar) {
            b bVar = s.this.new b(eVar);
            bVar.f54339f = error;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ley3/a$c;", "<unused var>", "Ley3/c$a;", "Loq/i0;", "<anonymous>", "(Ley3/a$c;Ley3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ey3.a.c, ey3.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54341e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f54341e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ey3.a.f> bVarY1 = s.this.Y1();
                ey3.a.f.C1278a c1278a = ey3.a.f.C1278a.f54270a;
                this.f54341e = 1;
                if (bVarY1.F(c1278a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.c cVar, ey3.c.a aVar, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ley3/a$h;", "action", "Lk10/c0;", "Ley3/c$a;", "state", "Lk10/l;", "Ley3/c;", "<anonymous>", "(Ley3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ey3.a.Setup, c0<ey3.c.a>, tq.e<? super k10.l<? extends ey3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f54345g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ey3.c.Initialized O(DeleteCardsRequiredData deleteCardsRequiredData, ey3.c.a aVar) {
            return new ey3.c.Initialized(deleteCardsRequiredData.getDataFromPaymentsCards(), deleteCardsRequiredData.b(), deleteCardsRequiredData.b());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ey3.a.Setup setup = (ey3.a.Setup) this.f54344f;
            c0 c0Var = (c0) this.f54345g;
            uq.b.e();
            if (this.f54343e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final DeleteCardsRequiredData deleteCardsRequiredData = setup.getDeleteCardsRequiredData();
            return c0Var.d(new er.l() { // from class: ey3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(deleteCardsRequiredData, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.Setup setup, c0<ey3.c.a> c0Var, tq.e<? super k10.l<? extends ey3.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f54344f = setup;
            dVar.f54345g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ley3/a$c;", "action", "Ley3/c$b;", "state", "Loq/i0;", "<anonymous>", "(Ley3/a$c;Ley3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ey3.a.c, ey3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54347f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r8.F(r2, r7) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        
            if (r8.F(r2, r7) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f54347f
                ey3.c$b r0 = (ey3.c.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f54346e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                oq.u.b(r8)
                goto L6b
            L1f:
                oq.u.b(r8)
                java.util.List r8 = r0.e()
                java.util.List r2 = r0.c()
                boolean r8 = fr.t.c(r8, r2)
                if (r8 == 0) goto L47
                ey3.s r8 = ey3.s.this
                xw.b r8 = r8.Y1()
                ey3.a$f$a r2 = ey3.a.f.C1278a.f54270a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f54347f = r0
                r7.f54346e = r4
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto L6b
                goto L6a
            L47:
                ey3.s r8 = ey3.s.this
                xw.b r8 = r8.Y1()
                ey3.a$f$d r2 = new ey3.a$f$d
                dy3.d r4 = new dy3.d
                dy3.c r5 = r0.getDataFromPaymentsCards()
                r6 = 0
                r4.<init>(r5, r6)
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f54347f = r0
                r7.f54346e = r3
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto L6b
            L6a:
                return r1
            L6b:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ey3.s.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.c cVar, ey3.c.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f54347f = initialized;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ley3/a$e;", "<unused var>", "Ley3/c$b;", "state", "Loq/i0;", "<anonymous>", "(Ley3/a$e;Ley3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ey3.a.e, ey3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54350f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ey3.c.Initialized initialized = (ey3.c.Initialized) this.f54350f;
            Object objE = uq.b.e();
            int i15 = this.f54349e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ey3.a.f> bVarY1 = s.this.Y1();
                ey3.a.f.PaymentCards paymentCards = new ey3.a.f.PaymentCards(new PaymentCardsNavParams(initialized.getDataFromPaymentsCards(), dy3.a.DELETE_CARD_LAST_CARD_REMOVED));
                this.f54350f = vq.j.a(initialized);
                this.f54349e = 1;
                if (bVarY1.F(paymentCards, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.e eVar, ey3.c.Initialized initialized, tq.e<? super i0> eVar2) {
            f fVar = s.this.new f(eVar2);
            fVar.f54350f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ley3/a$a;", "action", "Lk10/c0;", "Ley3/c$b;", "state", "Lk10/l;", "Ley3/c;", "<anonymous>", "(Ley3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ey3.a.DeleteCard, c0<ey3.c.Initialized>, tq.e<? super k10.l<? extends ey3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54353f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f54354g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ley3/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ey3.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f54356e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f54357f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ey3.a.DeleteCard f54358g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<ey3.c.Initialized> f54359h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, ey3.a.DeleteCard deleteCard, c0<ey3.c.Initialized> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f54357f = sVar;
                this.f54358g = deleteCard;
                this.f54359h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ey3.c.Initialized V(s sVar, List list, ey3.c.Initialized initialized) {
                sVar.d9(ey3.a.i.f54277a);
                return ey3.c.Initialized.b(initialized, null, null, list, 3, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f54356e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cs0.c cVar = this.f54357f.deleteCardUseCase;
                    cs0.c.Params params = new cs0.c.Params(this.f54358g.getCardTokenId());
                    this.f54356e = 1;
                    obj = cVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                final s sVar = this.f54357f;
                ey3.a.DeleteCard deleteCard = this.f54358g;
                c0<ey3.c.Initialized> c0Var = this.f54359h;
                if (iVar instanceof dx.i.Left) {
                    sVar.d9(new ey3.a.Error((dx.b) ((dx.i.Left) iVar).b(), sVar.b9(new ey3.a.DeleteCard(deleteCard.getCardTokenId()))));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                List<BEUserCard> listC = c0Var.a().c();
                final ArrayList arrayList = new ArrayList();
                for (Object obj2 : listC) {
                    if (!fr.t.c(((BEUserCard) obj2).getCardTokenId(), deleteCard.getCardTokenId())) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return c0Var.b(new er.l() { // from class: ey3.v
                        @Override // er.l
                        public final Object b(Object obj3) {
                            return s.g.a.V(sVar, arrayList, (c.Initialized) obj3);
                        }
                    });
                }
                sVar.d9(ey3.a.e.f54269a);
                return c0Var.c();
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f54357f, this.f54358g, this.f54359h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ey3.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ey3.a.DeleteCard deleteCard = (ey3.a.DeleteCard) this.f54353f;
            c0 c0Var = (c0) this.f54354g;
            Object objE = uq.b.e();
            int i15 = this.f54352e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s.this.callActionWithLoaderUseCase;
            a aVar2 = new a(s.this, deleteCard, c0Var, null);
            this.f54353f = vq.j.a(deleteCard);
            this.f54354g = vq.j.a(c0Var);
            this.f54352e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.DeleteCard deleteCard, c0<ey3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ey3.c>> eVar) {
            g gVar = s.this.new g(eVar);
            gVar.f54353f = deleteCard;
            gVar.f54354g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ley3/a$g;", "action", "Ley3/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ley3/a$g;Ley3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ey3.a.OpenDeleteCardDialog, ey3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54361f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ey3.a.OpenDeleteCardDialog openDeleteCardDialog = (ey3.a.OpenDeleteCardDialog) this.f54361f;
            Object objE = uq.b.e();
            int i15 = this.f54360e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ey3.a.f> bVarY1 = s.this.Y1();
                ey3.a.f.DeleteCardDialog deleteCardDialog = new ey3.a.f.DeleteCardDialog(new NavigationDialogModel(s.this.labelProvider.c(px3.b.f163149w), null, null, null, null, null, new ButtonTextData(null, s.this.labelProvider.c(px3.b.f163121c), k30.b.a.f107766a, null, s.this.b9(new ey3.a.DeleteCard(openDeleteCardDialog.getCardTokenId())), 9, null), new ButtonTextData(null, s.this.labelProvider.c(px3.b.f163117a), null, null, new er.a() { // from class: ey3.w
                    @Override // er.a
                    public final Object a() {
                        return s.h.O();
                    }
                }, 13, null), 62, null));
                this.f54361f = vq.j.a(openDeleteCardDialog);
                this.f54360e = 1;
                if (bVarY1.F(deleteCardDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.OpenDeleteCardDialog openDeleteCardDialog, ey3.c.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = s.this.new h(eVar);
            hVar.f54361f = openDeleteCardDialog;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ley3/a$d;", "<unused var>", "Ley3/c$b;", "Loq/i0;", "<anonymous>", "(Ley3/a$d;Ley3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ey3.a.d, ey3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54363e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f54363e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.snackBarManagerStateHolder.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.d dVar, ey3.c.Initialized initialized, tq.e<? super i0> eVar) {
            return s.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ley3/a$i;", "<unused var>", "Ley3/c$b;", "Loq/i0;", "<anonymous>", "(Ley3/a$i;Ley3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ey3.a.i, ey3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54365e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f54365e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.y(new p50.a.Default(s.this.labelProvider.c(px3.b.f163145s), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ey3.a.i iVar, ey3.c.Initialized initialized, tq.e<? super i0> eVar) {
            return s.this.new j(eVar).J(i0.f148189a);
        }
    }

    public s(yy.a aVar, ey3.f fVar, ac4.a aVar2, ib4.c cVar, cs0.c cVar2, mx.c cVar3, i70.n nVar, PaymentsDeleteCardsSetupData paymentsDeleteCardsSetupData) {
        this.mapper = fVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.deleteCardUseCase = cVar2;
        this.labelProvider = cVar3;
        this.snackBarManagerStateHolder = nVar;
        this.setupData = paymentsDeleteCardsSetupData;
        ey3.c.a aVar3 = ey3.c.a.f54279a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: ey3.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f54314a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), t9(aVar3));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ey3.d.a t9(ey3.c state) {
        return this.mapper.b(new ey3.f.Params(state, b9(ey3.a.c.f54267a), new er.l() { // from class: ey3.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9(this.f54310a, (String) obj);
            }
        }, b9(ey3.a.d.f54268a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(s sVar, String str) {
        sVar.d9(new ey3.a.OpenDeleteCardDialog(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(ey3.c.class), new er.l() { // from class: ey3.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.x9(this.f54311a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ey3.c.a.class), new er.l() { // from class: ey3.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.y9(this.f54312a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ey3.c.Initialized.class), new er.l() { // from class: ey3.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f54313a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(s sVar, k10.z zVar) {
        b bVar = sVar.new b(null);
        zVar.x(q0.c(ey3.a.Error.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(s sVar, k10.z zVar) {
        c cVar = sVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ey3.a.c.class), oVar, cVar);
        zVar.v(q0.c(ey3.a.Setup.class), oVar, new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(s sVar, k10.z zVar) {
        e eVar = sVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ey3.a.c.class), oVar, eVar);
        zVar.x(q0.c(ey3.a.e.class), oVar, sVar.new f(null));
        zVar.v(q0.c(ey3.a.DeleteCard.class), oVar, sVar.new g(null));
        zVar.x(q0.c(ey3.a.OpenDeleteCardDialog.class), oVar, sVar.new h(null));
        zVar.x(q0.c(ey3.a.d.class), oVar, sVar.new i(null));
        zVar.x(q0.c(ey3.a.i.class), oVar, sVar.new j(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<ey3.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ey3.c, ey3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ey3.d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentsDeleteCardsSetupData data) {
        this.setupData = data;
        d9(new ey3.a.Setup(data.getData()));
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
