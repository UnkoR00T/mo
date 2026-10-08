package l42;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.util.ArrayList;
import java.util.List;
import k10.c0;
import m42.DeleteCardsRequiredData;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BS\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030<8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010M\u001a\b\u0012\u0004\u0012\u00020H0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u0010P¨\u0006R"}, d2 = {"Ll42/s;", "Ll00/g;", "Ll42/c;", "Ll42/a;", "Ll42/d;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Ll42/f;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lcs0/c;", "deleteCardUseCase", "Lmx/c;", "labelProvider", "snackBarManagerStateHolder", "Lcb4/j;", "dialogVMSFactory", "Ll42/b;", "setupData", "<init>", "(Lyy/a;Ll42/f;Lac4/a;Lib4/c;Lcs0/c;Lmx/c;Li70/n;Lcb4/j;Ll42/b;)V", "state", "Ll42/d$a;", "u9", "(Ll42/c;)Ll42/d$a;", "data", "Loq/i0;", "w9", "(Ll42/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ll42/f;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lcs0/c;", "f", "Lmx/c;", "g", "Li70/n;", "h", "Lcb4/j;", "j", "Ll42/b;", "Ll42/c$a;", "k", "Ll42/c$a;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Ll42/a$g;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<l42.c, l42.a> implements l42.d, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l42.f mapper;

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
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private PaymentsDeleteCardsSetupData setupData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l42.c.a initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<l42.c, l42.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<l42.d.a> state;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l42.a.g> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<l42.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f115934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f115935b;

        /* JADX INFO: renamed from: l42.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2799a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f115936a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f115937b;

            /* JADX INFO: renamed from: l42.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2800a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f115938d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f115939e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f115940f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f115942h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f115943j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f115944k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f115945l;

                public C2800a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f115938d = obj;
                    this.f115939e |= PKIFailureInfo.systemUnavail;
                    return C2799a.this.F(null, this);
                }
            }

            public C2799a(mu.h hVar, s sVar) {
                this.f115936a = hVar;
                this.f115937b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2800a c2800a;
                if (eVar instanceof C2800a) {
                    c2800a = (C2800a) eVar;
                    int i15 = c2800a.f115939e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2800a.f115939e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2800a = new C2800a(eVar);
                    }
                } else {
                    c2800a = new C2800a(eVar);
                }
                Object obj2 = c2800a.f115938d;
                Object objE = uq.b.e();
                int i16 = c2800a.f115939e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f115936a;
                    l42.d.a aVarU9 = this.f115937b.u9((l42.c) obj);
                    c2800a.f115940f = vq.j.a(obj);
                    c2800a.f115942h = vq.j.a(c2800a);
                    c2800a.f115943j = vq.j.a(obj);
                    c2800a.f115944k = vq.j.a(hVar);
                    c2800a.f115945l = 0;
                    c2800a.f115939e = 1;
                    if (hVar.F(aVarU9, c2800a) == objE) {
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
            this.f115934a = gVar;
            this.f115935b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l42.d.a> hVar, tq.e eVar) {
            Object objA = this.f115934a.a(new C2799a(hVar, this.f115935b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll42/a$b;", "action", "Ll42/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ll42/a$b;Ll42/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<l42.a.Error, l42.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f115947f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(s sVar, l42.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    sVar.d9(l42.a.c.f115870a);
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
            final l42.a.Error error = (l42.a.Error) this.f115947f;
            Object objE = uq.b.e();
            int i15 = this.f115946e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l42.a.g> bVarY1 = s.this.Y1();
                ib4.c cVar = s.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final s sVar = s.this;
                l42.a.g.Error error2 = new l42.a.g.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: l42.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.b.O(sVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f115947f = vq.j.a(error);
                this.f115946e = 1;
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
        public final Object w(l42.a.Error error, l42.c cVar, tq.e<? super i0> eVar) {
            b bVar = s.this.new b(eVar);
            bVar.f115947f = error;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll42/a$c;", "<unused var>", "Ll42/c$a;", "Loq/i0;", "<anonymous>", "(Ll42/a$c;Ll42/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<l42.a.c, l42.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115949e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115949e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l42.a.g> bVarY1 = s.this.Y1();
                l42.a.g.C2797a c2797a = l42.a.g.C2797a.f115874a;
                this.f115949e = 1;
                if (bVarY1.F(c2797a, this) == objE) {
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
        public final Object w(l42.a.c cVar, l42.c.a aVar, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll42/a$i;", "action", "Lk10/c0;", "Ll42/c$a;", "state", "Lk10/l;", "Ll42/c;", "<anonymous>", "(Ll42/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<l42.a.Setup, c0<l42.c.a>, tq.e<? super k10.l<? extends l42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f115952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f115953g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l42.c.Initialized O(DeleteCardsRequiredData deleteCardsRequiredData, l42.c.a aVar) {
            return new l42.c.Initialized(deleteCardsRequiredData.getSource(), deleteCardsRequiredData.b(), deleteCardsRequiredData.b(), null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l42.a.Setup setup = (l42.a.Setup) this.f115952f;
            c0 c0Var = (c0) this.f115953g;
            uq.b.e();
            if (this.f115951e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final DeleteCardsRequiredData deleteCardsRequiredData = setup.getDeleteCardsRequiredData();
            return c0Var.d(new er.l() { // from class: l42.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(deleteCardsRequiredData, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l42.a.Setup setup, c0<l42.c.a> c0Var, tq.e<? super k10.l<? extends l42.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f115952f = setup;
            dVar.f115953g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll42/a$c;", "<unused var>", "Ll42/c$b;", "state", "Loq/i0;", "<anonymous>", "(Ll42/a$c;Ll42/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<l42.a.c, l42.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f115955f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r15.F(r2, r14) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        
            if (r15.F(r3, r14) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
        
            if (r15.F(r4, r14) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l42.s.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l42.a.c cVar, l42.c.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f115955f = initialized;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll42/a$f;", "<unused var>", "Ll42/c$b;", "state", "Loq/i0;", "<anonymous>", "(Ll42/a$f;Ll42/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<l42.a.f, l42.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f115958f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r14.F(r2, r13) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
        
            if (r14.F(r2, r13) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f115958f
                l42.c$b r0 = (l42.c.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r13.f115957e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1b:
                oq.u.b(r14)
                goto Lad
            L20:
                oq.u.b(r14)
                m42.b r14 = r0.getSource()
                boolean r2 = r14 instanceof m42.b.C3026b
                if (r2 == 0) goto L47
                l42.s r14 = l42.s.this
                xw.b r14 = r14.Y1()
                l42.a$g$d r2 = new l42.a$g$d
                u42.a r3 = u42.a.DELETE_CARD_LAST_CARD_REMOVED
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r13.f115958f = r0
                r13.f115957e = r4
                java.lang.Object r14 = r14.F(r2, r13)
                if (r14 != r1) goto Lad
                goto Lac
            L47:
                boolean r14 = r14 instanceof m42.b.PaymentCards
                if (r14 == 0) goto Lb0
                l42.s r14 = l42.s.this
                xw.b r14 = r14.Y1()
                l42.a$g$c r2 = new l42.a$g$c
                u42.a r4 = u42.a.DELETE_CARD_LAST_CARD_REMOVED
                m42.b r5 = r0.getSource()
                m42.b$a r5 = (m42.b.PaymentCards) r5
                java.util.List r8 = r5.c()
                m42.b r5 = r0.getSource()
                m42.b$a r5 = (m42.b.PaymentCards) r5
                java.lang.String r9 = r5.getInstitutionId()
                m42.b r5 = r0.getSource()
                m42.b$a r5 = (m42.b.PaymentCards) r5
                java.lang.String r7 = r5.getSourcePaymentId()
                m42.b r5 = r0.getSource()
                m42.b$a r5 = (m42.b.PaymentCards) r5
                java.lang.String r10 = r5.getPaymentTitle()
                m42.b r5 = r0.getSource()
                m42.b$a r5 = (m42.b.PaymentCards) r5
                java.lang.String r11 = r5.getAmountWithCurrency()
                m42.b r5 = r0.getSource()
                m42.b$a r5 = (m42.b.PaymentCards) r5
                boolean r12 = r5.getShouldBackToDetails()
                e42.b r6 = new e42.b
                r6.<init>(r7, r8, r9, r10, r11, r12)
                u42.c r5 = new u42.c
                r5.<init>(r6, r4)
                r2.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r13.f115958f = r0
                r13.f115957e = r3
                java.lang.Object r14 = r14.F(r2, r13)
                if (r14 != r1) goto Lad
            Lac:
                return r1
            Lad:
                oq.i0 r14 = oq.i0.f148189a
                return r14
            Lb0:
                oq.p r14 = new oq.p
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: l42.s.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l42.a.f fVar, l42.c.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar2 = s.this.new f(eVar);
            fVar2.f115958f = initialized;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll42/a$a;", "action", "Lk10/c0;", "Ll42/c$b;", "state", "Lk10/l;", "Ll42/c;", "<anonymous>", "(Ll42/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<l42.a.DeleteCard, c0<l42.c.Initialized>, tq.e<? super k10.l<? extends l42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f115961f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f115962g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ll42/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends l42.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f115964e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f115965f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l42.a.DeleteCard f115966g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<l42.c.Initialized> f115967h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, l42.a.DeleteCard deleteCard, c0<l42.c.Initialized> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f115965f = sVar;
                this.f115966g = deleteCard;
                this.f115967h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final l42.c.Initialized X(l42.c.Initialized initialized) {
                return l42.c.Initialized.b(initialized, null, null, null, null, 7, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final l42.c.Initialized Y(s sVar, List list, l42.c.Initialized initialized) {
                sVar.d9(l42.a.j.f115880a);
                return l42.c.Initialized.b(initialized, null, null, list, null, 3, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f115964e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cs0.c cVar = this.f115965f.deleteCardUseCase;
                    cs0.c.Params params = new cs0.c.Params(this.f115966g.getCardTokenId());
                    this.f115964e = 1;
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
                final s sVar = this.f115965f;
                l42.a.DeleteCard deleteCard = this.f115966g;
                c0<l42.c.Initialized> c0Var = this.f115967h;
                if (iVar instanceof dx.i.Left) {
                    sVar.d9(new l42.a.Error((dx.b) ((dx.i.Left) iVar).b(), sVar.b9(new l42.a.DeleteCard(deleteCard.getCardTokenId()))));
                    return c0Var.b(new er.l() { // from class: l42.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.g.a.X((c.Initialized) obj2);
                        }
                    });
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
                    return c0Var.b(new er.l() { // from class: l42.w
                        @Override // er.l
                        public final Object b(Object obj3) {
                            return s.g.a.Y(sVar, arrayList, (c.Initialized) obj3);
                        }
                    });
                }
                sVar.d9(l42.a.f.f115873a);
                return c0Var.c();
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f115965f, this.f115966g, this.f115967h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends l42.c>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l42.a.DeleteCard deleteCard = (l42.a.DeleteCard) this.f115961f;
            c0 c0Var = (c0) this.f115962g;
            Object objE = uq.b.e();
            int i15 = this.f115960e;
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
            this.f115961f = vq.j.a(deleteCard);
            this.f115962g = vq.j.a(c0Var);
            this.f115960e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l42.a.DeleteCard deleteCard, c0<l42.c.Initialized> c0Var, tq.e<? super k10.l<? extends l42.c>> eVar) {
            g gVar = s.this.new g(eVar);
            gVar.f115961f = deleteCard;
            gVar.f115962g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll42/a$h;", "action", "Lk10/c0;", "Ll42/c$b;", "state", "Lk10/l;", "Ll42/c;", "<anonymous>", "(Ll42/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<l42.a.OpenDeleteCardDialog, c0<l42.c.Initialized>, tq.e<? super k10.l<? extends l42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f115969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f115970g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l42.c.Initialized O(s sVar, l42.a.OpenDeleteCardDialog openDeleteCardDialog, l42.c.Initialized initialized) {
            cb4.j jVar = sVar.dialogVMSFactory;
            cb4.h.b bVar = cb4.h.b.f24985a;
            Label labelC = sVar.labelProvider.c(t32.b.L);
            DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(sVar.labelProvider.c(t32.b.f187454g), cb4.a.C0668a.f24967a, sVar.b9(new l42.a.DeleteCard(openDeleteCardDialog.getCardTokenId())));
            Label labelC2 = sVar.labelProvider.c(t32.b.f187437b);
            l42.a.d dVar = l42.a.d.f115871a;
            return l42.c.Initialized.b(initialized, null, null, null, jVar.a(new DialogData(bVar, labelC, null, dialogButtonTextData, new DialogButtonTextData(labelC2, null, sVar.b9(dVar), 2, null), null, sVar.b9(dVar), 36, null)), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final l42.a.OpenDeleteCardDialog openDeleteCardDialog = (l42.a.OpenDeleteCardDialog) this.f115969f;
            c0 c0Var = (c0) this.f115970g;
            uq.b.e();
            if (this.f115968e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final s sVar = s.this;
            return c0Var.b(new er.l() { // from class: l42.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.h.O(sVar, openDeleteCardDialog, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l42.a.OpenDeleteCardDialog openDeleteCardDialog, c0<l42.c.Initialized> c0Var, tq.e<? super k10.l<? extends l42.c>> eVar) {
            h hVar = s.this.new h(eVar);
            hVar.f115969f = openDeleteCardDialog;
            hVar.f115970g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll42/a$e;", "<unused var>", "Ll42/c$b;", "Loq/i0;", "<anonymous>", "(Ll42/a$e;Ll42/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<l42.a.e, l42.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115972e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f115972e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.snackBarManagerStateHolder.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l42.a.e eVar, l42.c.Initialized initialized, tq.e<? super i0> eVar2) {
            return s.this.new i(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll42/a$j;", "<unused var>", "Ll42/c$b;", "Loq/i0;", "<anonymous>", "(Ll42/a$j;Ll42/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<l42.a.j, l42.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115974e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f115974e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.y(new p50.a.Default(s.this.labelProvider.c(t32.b.G), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l42.a.j jVar, l42.c.Initialized initialized, tq.e<? super i0> eVar) {
            return s.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ll42/a$d;", "<unused var>", "Lk10/c0;", "Ll42/c$b;", "state", "Lk10/l;", "Ll42/c;", "<anonymous>", "(Ll42/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<l42.a.d, c0<l42.c.Initialized>, tq.e<? super k10.l<? extends l42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f115977f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l42.c.Initialized O(l42.c.Initialized initialized) {
            return l42.c.Initialized.b(initialized, null, null, null, null, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f115977f;
            uq.b.e();
            if (this.f115976e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: l42.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.k.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(l42.a.d dVar, c0<l42.c.Initialized> c0Var, tq.e<? super k10.l<? extends l42.c>> eVar) {
            k kVar = new k(eVar);
            kVar.f115977f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, l42.f fVar, ac4.a aVar2, ib4.c cVar, cs0.c cVar2, mx.c cVar3, i70.n nVar, cb4.j jVar, PaymentsDeleteCardsSetupData paymentsDeleteCardsSetupData) {
        this.mapper = fVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.deleteCardUseCase = cVar2;
        this.labelProvider = cVar3;
        this.snackBarManagerStateHolder = nVar;
        this.dialogVMSFactory = jVar;
        this.setupData = paymentsDeleteCardsSetupData;
        l42.c.a aVar3 = l42.c.a.f115884a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: l42.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.x9(this.f115921a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), u9(aVar3));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(s sVar, k10.z zVar) {
        e eVar = sVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(l42.a.c.class), oVar, eVar);
        zVar.x(q0.c(l42.a.f.class), oVar, sVar.new f(null));
        zVar.v(q0.c(l42.a.DeleteCard.class), oVar, sVar.new g(null));
        zVar.v(q0.c(l42.a.OpenDeleteCardDialog.class), oVar, sVar.new h(null));
        zVar.x(q0.c(l42.a.e.class), oVar, sVar.new i(null));
        zVar.x(q0.c(l42.a.j.class), oVar, sVar.new j(null));
        zVar.v(q0.c(l42.a.d.class), oVar, new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l42.d.a u9(l42.c state) {
        return this.mapper.b(new l42.f.Params(state, b9(l42.a.c.f115870a), new er.l() { // from class: l42.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f115920a, (String) obj);
            }
        }, b9(l42.a.e.f115872a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(s sVar, String str) {
        sVar.d9(new l42.a.OpenDeleteCardDialog(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(l42.c.class), new er.l() { // from class: l42.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.y9(this.f115917a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l42.c.a.class), new er.l() { // from class: l42.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f115918a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l42.c.Initialized.class), new er.l() { // from class: l42.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f115919a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(s sVar, k10.z zVar) {
        b bVar = sVar.new b(null);
        zVar.x(q0.c(l42.a.Error.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(s sVar, k10.z zVar) {
        c cVar = sVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(l42.a.c.class), oVar, cVar);
        zVar.v(q0.c(l42.a.Setup.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<l42.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<l42.c, l42.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<l42.d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentsDeleteCardsSetupData data) {
        this.setupData = data;
        d9(new l42.a.Setup(data.getData()));
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
