package h41;

import bl0.BEChildBirthPlaceOfBirthOffices;
import bl0.BEChildBirthRegistrationCivilRegistryOffices;
import bl0.BEChildBirthRegistrationMunicipalOffice;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jb4.ErrorActionData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r31.SetupData;
import t31.OfficeSearchItems;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020)*\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010W\u001a\b\u0012\u0004\u0012\u00020)0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lh41/z;", "Ll00/g;", "Lh41/d;", "Lh41/a;", "Lh41/e;", "", "Lyy/a;", "stateMachineFactory", "Lj41/a;", "mapper", "Lq31/c;", "exitDialogMapper", "Lmx/c;", "labelProvider", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lnl0/c;", "getMunicipalOfficeDictionary", "Lnl0/a;", "getCivilRegistryOfficeDictionary", "Lac4/a;", "loaderUC", "Lh41/c;", "setupData", "<init>", "(Lyy/a;Lj41/a;Lq31/c;Lmx/c;Lhb4/d;Lib4/c;Lnl0/c;Lnl0/a;Lac4/a;Lh41/c;)V", "Lh41/b;", "form", "Ld60/j;", "Lh41/f$b;", "scrollInstance", "Ljb4/b$b;", "G9", "(Lh41/b;Ld60/j;)Ljb4/b$b;", "Ldx/b;", "domainError", "Ljb4/b;", "D9", "(Ldx/b;)Ljb4/b;", "Lh41/e$a;", "F9", "(Lh41/d;)Lh41/e$a;", "data", "Loq/i0;", "J9", "(Lh41/c;)V", "b", "Lj41/a;", "c", "Lq31/c;", "d", "Lmx/c;", "e", "Lhb4/d;", "f", "Lib4/c;", "g", "Lnl0/c;", "h", "Lnl0/a;", "j", "Lac4/a;", "k", "Lh41/c;", "l", "Lh41/d;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lh41/a$e;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<h41.d, h41.a> implements h41.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j41.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final nl0.c getMunicipalOfficeDictionary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final nl0.a getCivilRegistryOfficeDictionary;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h41.d initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h41.d, h41.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<h41.a.e> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<h41.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h41.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f80916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f80917b;

        /* JADX INFO: renamed from: h41.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1860a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f80918a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f80919b;

            /* JADX INFO: renamed from: h41.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1861a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f80920d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f80921e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f80922f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f80924h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f80925j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f80926k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f80927l;

                public C1861a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f80920d = obj;
                    this.f80921e |= PKIFailureInfo.systemUnavail;
                    return C1860a.this.F(null, this);
                }
            }

            public C1860a(mu.h hVar, z zVar) {
                this.f80918a = hVar;
                this.f80919b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1861a c1861a;
                if (eVar instanceof C1861a) {
                    c1861a = (C1861a) eVar;
                    int i15 = c1861a.f80921e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1861a.f80921e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1861a = new C1861a(eVar);
                    }
                } else {
                    c1861a = new C1861a(eVar);
                }
                Object obj2 = c1861a.f80920d;
                Object objE = uq.b.e();
                int i16 = c1861a.f80921e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f80918a;
                    h41.e.a aVarF9 = this.f80919b.F9((h41.d) obj);
                    c1861a.f80922f = vq.j.a(obj);
                    c1861a.f80924h = vq.j.a(c1861a);
                    c1861a.f80925j = vq.j.a(obj);
                    c1861a.f80926k = vq.j.a(hVar);
                    c1861a.f80927l = 0;
                    c1861a.f80921e = 1;
                    if (hVar.F(aVarF9, c1861a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, z zVar) {
            this.f80916a = gVar;
            this.f80917b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h41.e.a> hVar, tq.e eVar) {
            Object objA = this.f80916a.a(new C1860a(hVar, this.f80917b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh41/a$e;", "action", "Lh41/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh41/a$e;Lh41/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<h41.a.e, h41.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80929f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h41.a.e eVar = (h41.a.e) this.f80929f;
            Object objE = uq.b.e();
            int i15 = this.f80928e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<h41.a.e> bVarY1 = z.this.Y1();
                this.f80929f = vq.j.a(eVar);
                this.f80928e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.e eVar, h41.d dVar, tq.e<? super oq.i0> eVar2) {
            b bVar = z.this.new b(eVar2);
            bVar.f80929f = eVar;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh41/a$g;", "<unused var>", "Lh41/d;", "Loq/i0;", "<anonymous>", "(Lh41/a$g;Lh41/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<h41.a.g, h41.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80931e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f80931e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(new h41.a.e.ShowDialog(z.this.exitDialogMapper.b(new q31.c.Params(z.this.b9(h41.a.e.b.f80818a)))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.g gVar, h41.d dVar, tq.e<? super oq.i0> eVar) {
            return z.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh41/a$c;", "<unused var>", "Lk10/c0;", "Lh41/d$c;", "state", "Lk10/l;", "Lh41/d;", "<anonymous>", "(Lh41/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<h41.a.c, k10.c0<h41.d.ErrorFetchingMunicipalOffices>, tq.e<? super k10.l<? extends h41.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80934f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h41.d.e O(h41.d.ErrorFetchingMunicipalOffices errorFetchingMunicipalOffices) {
            return h41.d.e.f80843a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80934f;
            uq.b.e();
            if (this.f80933e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: h41.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.d.O((d.ErrorFetchingMunicipalOffices) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.c cVar, k10.c0<h41.d.ErrorFetchingMunicipalOffices> c0Var, tq.e<? super k10.l<? extends h41.d>> eVar) {
            d dVar = new d(eVar);
            dVar.f80934f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lh41/d$e;", "state", "Lk10/l;", "Lh41/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<h41.d.e>, tq.e<? super k10.l<? extends h41.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80936f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lh41/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends h41.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f80938e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f80939f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<h41.d.e> f80940g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<h41.d.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f80939f = zVar;
                this.f80940g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h41.d.ErrorFetchingMunicipalOffices Y(z zVar, dx.b bVar, h41.d.e eVar) {
                return new h41.d.ErrorFetchingMunicipalOffices(zVar.errorVMSFactory.a(zVar.D9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h41.d.FetchingCivilRegistryOffices Z(z zVar, List list, BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice, h41.d.e eVar) {
                return new h41.d.FetchingCivilRegistryOffices(new Form(zVar.setupData.getContract().l(), list, null, new BirthPlaceOfficeFields(new BirthPlaceOfficeFields.a.MunicipalOffice(null, bEChildBirthRegistrationMunicipalOffice, 1, null), new BirthPlaceOfficeFields.a.CivilRegistryOffice(null, null, 1, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h41.d.ChoosingOffices a0(z zVar, List list, h41.d.e eVar) {
                return new h41.d.ChoosingOffices(new Form(zVar.setupData.getContract().l(), list, null, new BirthPlaceOfficeFields(new BirthPlaceOfficeFields.a.MunicipalOffice(null, null, 1, null), new BirthPlaceOfficeFields.a.CivilRegistryOffice(null, null, 1, null))), null, 2, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f80938e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    nl0.c cVar = this.f80939f.getMunicipalOfficeDictionary;
                    nl0.c.Params params = new nl0.c.Params(this.f80939f.setupData.getContract().Z0().getTerritorialCode());
                    this.f80938e = 1;
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
                k10.c0<h41.d.e> c0Var = this.f80940g;
                final z zVar = this.f80939f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: h41.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.e.a.Y(zVar, bVar, (d.e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                if (list.size() != 1) {
                    k10.c0<h41.d.e> c0Var2 = this.f80940g;
                    final z zVar2 = this.f80939f;
                    return c0Var2.d(new er.l() { // from class: h41.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.e.a.a0(zVar2, list, (d.e) obj2);
                        }
                    });
                }
                final BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice = (BEChildBirthRegistrationMunicipalOffice) pq.v.l0(list);
                k10.c0<h41.d.e> c0Var3 = this.f80940g;
                final z zVar3 = this.f80939f;
                return c0Var3.d(new er.l() { // from class: h41.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.e.a.Z(zVar3, list, bEChildBirthRegistrationMunicipalOffice, (d.e) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f80939f, this.f80940g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends h41.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80936f;
            Object objE = uq.b.e();
            int i15 = this.f80935e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.loaderUC;
            a aVar2 = new a(z.this, c0Var, null);
            this.f80936f = vq.j.a(c0Var);
            this.f80935e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<h41.d.e> c0Var, tq.e<? super k10.l<? extends h41.d>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f80936f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh41/a$c;", "<unused var>", "Lk10/c0;", "Lh41/d$b;", "state", "Lk10/l;", "Lh41/d;", "<anonymous>", "(Lh41/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h41.a.c, k10.c0<h41.d.ErrorFetchingCivilRegistryOffices>, tq.e<? super k10.l<? extends h41.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80942f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h41.d.FetchingCivilRegistryOffices O(h41.d.ErrorFetchingCivilRegistryOffices errorFetchingCivilRegistryOffices) {
            return new h41.d.FetchingCivilRegistryOffices(errorFetchingCivilRegistryOffices.getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80942f;
            uq.b.e();
            if (this.f80941e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: h41.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.f.O((d.ErrorFetchingCivilRegistryOffices) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.c cVar, k10.c0<h41.d.ErrorFetchingCivilRegistryOffices> c0Var, tq.e<? super k10.l<? extends h41.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f80942f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lh41/d$d;", "state", "Lk10/l;", "Lh41/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<h41.d.FetchingCivilRegistryOffices>, tq.e<? super k10.l<? extends h41.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80944f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lh41/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends h41.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f80946e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f80947f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f80948g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f80949h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f80950j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f80951k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f80952l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f80953m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f80954n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f80955p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f80956q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f80957r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f80958s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ k10.c0<h41.d.FetchingCivilRegistryOffices> f80959t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ z f80960v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<h41.d.FetchingCivilRegistryOffices> c0Var, z zVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f80959t = c0Var;
                this.f80960v = zVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h41.d.ChoosingOffices X(BEChildBirthRegistrationCivilRegistryOffices bEChildBirthRegistrationCivilRegistryOffices, BirthPlaceOfficeFields birthPlaceOfficeFields, h41.d.FetchingCivilRegistryOffices fetchingCivilRegistryOffices) {
                BEChildBirthRegistrationCivilRegistryOffices.Office office;
                Form form = fetchingCivilRegistryOffices.getForm();
                boolean z15 = bEChildBirthRegistrationCivilRegistryOffices.b().size() == 1;
                if (z15) {
                    office = (BEChildBirthRegistrationCivilRegistryOffices.Office) pq.v.l0(bEChildBirthRegistrationCivilRegistryOffices.b());
                } else {
                    if (z15) {
                        throw new oq.p();
                    }
                    office = null;
                }
                return new h41.d.ChoosingOffices(Form.b(form, false, null, bEChildBirthRegistrationCivilRegistryOffices, BirthPlaceOfficeFields.b(birthPlaceOfficeFields, null, new BirthPlaceOfficeFields.a.CivilRegistryOffice(null, office, 1, null), 1, null), 3, null), null, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h41.d.ErrorFetchingCivilRegistryOffices Y(z zVar, dx.b bVar, h41.d.FetchingCivilRegistryOffices fetchingCivilRegistryOffices) {
                return new h41.d.ErrorFetchingCivilRegistryOffices(fetchingCivilRegistryOffices.getForm(), zVar.errorVMSFactory.a(zVar.D9(bVar)));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objB;
                dx.i left;
                k10.c0<h41.d.FetchingCivilRegistryOffices> c0Var;
                ex.b bVar;
                final BirthPlaceOfficeFields birthPlaceOfficeFields;
                Object objE = uq.b.e();
                int i15 = this.f80958s;
                ?? r15 = 1;
                try {
                    try {
                        if (i15 == 0) {
                            oq.u.b(obj);
                            c0Var = this.f80959t;
                            z zVar = this.f80960v;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                BirthPlaceOfficeFields fields = c0Var.a().getForm().getFields();
                                BEChildBirthRegistrationMunicipalOffice value = fields.getChosenMunicipalOffice().getValue();
                                if (value == null) {
                                    aVar.b(new dx.b.Generic(new IllegalStateException("chosenMunicipalOffice can't be null")));
                                    throw new oq.g();
                                }
                                nl0.a aVar2 = zVar.getCivilRegistryOfficeDictionary;
                                nl0.a.Params params = new nl0.a.Params(value);
                                this.f80946e = c0Var;
                                this.f80947f = jVarA;
                                this.f80948g = vq.j.a(aVar);
                                this.f80949h = vq.j.a(aVar);
                                this.f80950j = fields;
                                this.f80951k = aVar;
                                this.f80952l = vq.j.a(value);
                                this.f80953m = 0;
                                this.f80954n = 0;
                                this.f80955p = 0;
                                this.f80956q = 0;
                                this.f80957r = 0;
                                this.f80958s = 1;
                                obj = aVar2.c(params, this);
                                if (obj == objE) {
                                    return objE;
                                }
                                bVar = aVar;
                                birthPlaceOfficeFields = fields;
                            } catch (ex.c e15) {
                                e = e15;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                dx.i iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) this.f80951k;
                            birthPlaceOfficeFields = (BirthPlaceOfficeFields) this.f80950j;
                            c0Var = (k10.c0) this.f80946e;
                            try {
                                oq.u.b(obj);
                            } catch (ex.c e18) {
                                e = e18;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            }
                        }
                        final BEChildBirthRegistrationCivilRegistryOffices bEChildBirthRegistrationCivilRegistryOffices = (BEChildBirthRegistrationCivilRegistryOffices) bVar.a((dx.i) obj);
                        left = new dx.i.Right(c0Var.d(new er.l() { // from class: h41.f0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return z.g.a.X(bEChildBirthRegistrationCivilRegistryOffices, birthPlaceOfficeFields, (d.FetchingCivilRegistryOffices) obj2);
                            }
                        }));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                } catch (Exception e26) {
                    e = e26;
                }
                k10.c0<h41.d.FetchingCivilRegistryOffices> c0Var2 = this.f80959t;
                final z zVar2 = this.f80960v;
                if (left instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) left).b();
                    return c0Var2.d(new er.l() { // from class: h41.g0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.g.a.Y(zVar2, bVar2, (d.FetchingCivilRegistryOffices) obj2);
                        }
                    });
                }
                if (left instanceof dx.i.Right) {
                    return ((dx.i.Right) left).b();
                }
                throw new oq.p();
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f80959t, this.f80960v, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends h41.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80944f;
            Object objE = uq.b.e();
            int i15 = this.f80943e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.loaderUC;
            a aVar2 = new a(c0Var, z.this, null);
            this.f80944f = vq.j.a(c0Var);
            this.f80943e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<h41.d.FetchingCivilRegistryOffices> c0Var, tq.e<? super k10.l<? extends h41.d>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = z.this.new g(eVar);
            gVar.f80944f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh41/a$b;", "<unused var>", "Lh41/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lh41/a$b;Lh41/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<h41.a.b, h41.d.ChoosingOffices, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80962f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h41.d.ChoosingOffices choosingOffices = (h41.d.ChoosingOffices) this.f80962f;
            uq.b.e();
            if (this.f80961e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z zVar = z.this;
            BEChildBirthRegistrationMunicipalOffice value = choosingOffices.getForm().getFields().getChosenMunicipalOffice().getValue();
            String territorialCode = value != null ? value.getTerritorialCode() : null;
            OfficeSearchItems.c cVar = OfficeSearchItems.c.MUNICIPAL_OFFICE;
            List<BEChildBirthRegistrationMunicipalOffice> listE = choosingOffices.getForm().e();
            ArrayList arrayList = new ArrayList(pq.v.y(listE, 10));
            for (BEChildBirthRegistrationMunicipalOffice bEChildBirthRegistrationMunicipalOffice : listE) {
                arrayList.add(new OfficeSearchItems.Item(bEChildBirthRegistrationMunicipalOffice.getName(), bEChildBirthRegistrationMunicipalOffice.getTerritorialCode()));
            }
            zVar.d9(new h41.a.e.GoToOfficeSearch(new SetupData(new OfficeSearchItems(territorialCode, cVar, pq.v.e(new OfficeSearchItems.ItemGroup(null, arrayList))))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.b bVar, h41.d.ChoosingOffices choosingOffices, tq.e<? super oq.i0> eVar) {
            h hVar = z.this.new h(eVar);
            hVar.f80962f = choosingOffices;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh41/a$a;", "<unused var>", "Lk10/c0;", "Lh41/d$a;", "state", "Lk10/l;", "Lh41/d;", "<anonymous>", "(Lh41/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<h41.a.C1854a, k10.c0<h41.d.ChoosingOffices>, tq.e<? super k10.l<? extends h41.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80965f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 Y() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h41.d.ChoosingOffices Z(h41.d.ChoosingOffices choosingOffices) {
            return h41.d.ChoosingOffices.b(choosingOffices, null, null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f80965f;
            uq.b.e();
            if (this.f80964e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Form form = ((h41.d.ChoosingOffices) c0Var.a()).getForm();
            if (form.getAvailableCivilRegistryOffices() == null) {
                z.this.d9(new h41.a.e.ShowDialog(new DialogData(cb4.h.b.f24985a, z.this.labelProvider.c(j31.a.f99145f1), null, new DialogButtonTextData(z.this.labelProvider.c(j31.a.f99171k2), null, new er.a() { // from class: h41.h0
                    @Override // er.a
                    public final Object a() {
                        return z.i.X();
                    }
                }, 2, null), null, null, new er.a() { // from class: h41.i0
                    @Override // er.a
                    public final Object a() {
                        return z.i.Y();
                    }
                }, 52, null)));
                return c0Var.c();
            }
            z zVar = z.this;
            BEChildBirthRegistrationCivilRegistryOffices.Office value = form.getFields().getChosenCivilRegistryOffice().getValue();
            String officeCode = value != null ? value.getOfficeCode() : null;
            OfficeSearchItems.c cVar = OfficeSearchItems.c.CIVIL_REGISTRY_OFFICE;
            Label labelC = z.this.labelProvider.c(j31.a.f99122a3);
            List<BEChildBirthRegistrationCivilRegistryOffices.Office> listB = form.getAvailableCivilRegistryOffices().b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            for (BEChildBirthRegistrationCivilRegistryOffices.Office office : listB) {
                arrayList.add(new OfficeSearchItems.Item(office.getName(), office.getOfficeCode()));
            }
            OfficeSearchItems.ItemGroup itemGroup = new OfficeSearchItems.ItemGroup(labelC, arrayList);
            Label labelC2 = z.this.labelProvider.c(j31.a.D2);
            List<BEChildBirthRegistrationCivilRegistryOffices.Office> listA = form.getAvailableCivilRegistryOffices().a();
            ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
            for (BEChildBirthRegistrationCivilRegistryOffices.Office office2 : listA) {
                arrayList2.add(new OfficeSearchItems.Item(office2.getName(), office2.getOfficeCode()));
            }
            zVar.d9(new h41.a.e.GoToOfficeSearch(new SetupData(new OfficeSearchItems(officeCode, cVar, pq.v.q(itemGroup, new OfficeSearchItems.ItemGroup(labelC2, arrayList2))))));
            return c0Var.b(new er.l() { // from class: h41.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.Z((d.ChoosingOffices) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.C1854a c1854a, k10.c0<h41.d.ChoosingOffices> c0Var, tq.e<? super k10.l<? extends h41.d>> eVar) {
            i iVar = z.this.new i(eVar);
            iVar.f80965f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh41/a$h;", "action", "Lk10/c0;", "Lh41/d$a;", "state", "Lk10/l;", "Lh41/d;", "<anonymous>", "(Lh41/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<h41.a.UpdateChosenOffice, k10.c0<h41.d.ChoosingOffices>, tq.e<? super k10.l<? extends h41.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80969g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f80970a;

            static {
                int[] iArr = new int[OfficeSearchItems.c.values().length];
                try {
                    iArr[OfficeSearchItems.c.MUNICIPAL_OFFICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OfficeSearchItems.c.CIVIL_REGISTRY_OFFICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f80970a = iArr;
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h41.d.FetchingCivilRegistryOffices V(String str, h41.d.ChoosingOffices choosingOffices) {
            Object next;
            Iterator<T> it = choosingOffices.getForm().e().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (fr.t.c(((BEChildBirthRegistrationMunicipalOffice) next).getTerritorialCode(), str)) {
                    return new h41.d.FetchingCivilRegistryOffices(Form.b(choosingOffices.getForm(), false, null, null, BirthPlaceOfficeFields.b(choosingOffices.getForm().getFields(), new BirthPlaceOfficeFields.a.MunicipalOffice(null, (BEChildBirthRegistrationMunicipalOffice) next, 1, null), null, 2, null), 7, null));
                }
            }
            next = null;
            return new h41.d.FetchingCivilRegistryOffices(Form.b(choosingOffices.getForm(), false, null, null, BirthPlaceOfficeFields.b(choosingOffices.getForm().getFields(), new BirthPlaceOfficeFields.a.MunicipalOffice(null, (BEChildBirthRegistrationMunicipalOffice) next, 1, null), null, 2, null), 7, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:16:0x0035  */
        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        public static final h41.d.ChoosingOffices X(String str, h41.d.ChoosingOffices choosingOffices) {
            BEChildBirthRegistrationCivilRegistryOffices.Office office;
            List<BEChildBirthRegistrationCivilRegistryOffices.Office> listA;
            Object next;
            List<BEChildBirthRegistrationCivilRegistryOffices.Office> listB;
            Object next2;
            BEChildBirthRegistrationCivilRegistryOffices availableCivilRegistryOffices = choosingOffices.getForm().getAvailableCivilRegistryOffices();
            if (availableCivilRegistryOffices != null && (listB = availableCivilRegistryOffices.b()) != null) {
                Iterator<T> it = listB.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!fr.t.c(((BEChildBirthRegistrationCivilRegistryOffices.Office) next2).getOfficeCode(), str));
                office = (BEChildBirthRegistrationCivilRegistryOffices.Office) next2;
                if (office == null) {
                    if (availableCivilRegistryOffices != null) {
                        office = null;
                    } else {
                        office = null;
                    }
                }
            } else if (availableCivilRegistryOffices != null || (listA = availableCivilRegistryOffices.a()) == null) {
                office = null;
            } else {
                Iterator<T> it4 = listA.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!fr.t.c(((BEChildBirthRegistrationCivilRegistryOffices.Office) next).getOfficeCode(), str));
                office = (BEChildBirthRegistrationCivilRegistryOffices.Office) next;
            }
            return h41.d.ChoosingOffices.b(choosingOffices, Form.b(choosingOffices.getForm(), false, null, null, BirthPlaceOfficeFields.b(choosingOffices.getForm().getFields(), null, new BirthPlaceOfficeFields.a.CivilRegistryOffice(null, office, 1, null), 1, null), 7, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h41.a.UpdateChosenOffice updateChosenOffice = (h41.a.UpdateChosenOffice) this.f80968f;
            k10.c0 c0Var = (k10.c0) this.f80969g;
            uq.b.e();
            if (this.f80967e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String id5 = updateChosenOffice.getOfficeSearchResult().getId();
            int i15 = a.f80970a[updateChosenOffice.getOfficeSearchResult().getItemType().ordinal()];
            if (i15 == 1) {
                BEChildBirthRegistrationMunicipalOffice value = ((h41.d.ChoosingOffices) c0Var.a()).getForm().getFields().getChosenMunicipalOffice().getValue();
                return fr.t.c(id5, value != null ? value.getTerritorialCode() : null) ? c0Var.c() : c0Var.d(new er.l() { // from class: h41.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.j.V(id5, (d.ChoosingOffices) obj2);
                    }
                });
            }
            if (i15 != 2) {
                throw new oq.p();
            }
            BEChildBirthRegistrationCivilRegistryOffices.Office value2 = ((h41.d.ChoosingOffices) c0Var.a()).getForm().getFields().getChosenCivilRegistryOffice().getValue();
            return fr.t.c(id5, value2 != null ? value2.getOfficeCode() : null) ? c0Var.c() : c0Var.b(new er.l() { // from class: h41.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.j.X(id5, (d.ChoosingOffices) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.UpdateChosenOffice updateChosenOffice, k10.c0<h41.d.ChoosingOffices> c0Var, tq.e<? super k10.l<? extends h41.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f80968f = updateChosenOffice;
            jVar.f80969g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh41/a$d;", "<unused var>", "Lk10/c0;", "Lh41/d$a;", "state", "Lk10/l;", "Lh41/d;", "<anonymous>", "(Lh41/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<h41.a.d, k10.c0<h41.d.ChoosingOffices>, tq.e<? super k10.l<? extends h41.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80972f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h41.d.ChoosingOffices X(Form form, h41.d.ChoosingOffices choosingOffices) {
            BirthPlaceOfficeFields.b bVarF = form.getFields().f();
            return choosingOffices.a(form, bVarF != null ? new d60.j<>(bVarF) : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h41.d.NoEdor Y(z zVar, k10.c0 c0Var, h41.d.ChoosingOffices choosingOffices) {
            return new h41.d.NoEdor(zVar.errorVMSFactory.a(zVar.G9(((h41.d.ChoosingOffices) c0Var.a()).getForm(), ((h41.d.ChoosingOffices) c0Var.a()).d())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h41.d.ChoosingOffices Z(Form form, h41.d.ChoosingOffices choosingOffices) {
            return choosingOffices.a(form, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BEChildBirthRegistrationMunicipalOffice value;
            BEChildBirthRegistrationCivilRegistryOffices.Office value2;
            final k10.c0 c0Var = (k10.c0) this.f80972f;
            uq.b.e();
            if (this.f80971e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Form form = ((h41.d.ChoosingOffices) c0Var.a()).getForm();
            final Form formB = Form.b(form, false, null, null, form.getFields().a(BirthPlaceOfficeFields.a.MunicipalOffice.d(form.getFields().getChosenMunicipalOffice(), form.getFields().getChosenMunicipalOffice().getValue() == null ? new hz.b.Invalid(z.this.labelProvider.c(j31.a.f99120a1)) : hz.b.d.f86848c, null, 2, null), BirthPlaceOfficeFields.a.CivilRegistryOffice.d(form.getFields().getChosenCivilRegistryOffice(), form.getFields().getChosenCivilRegistryOffice().getValue() == null ? new hz.b.Invalid(z.this.labelProvider.c(j31.a.f99120a1)) : hz.b.d.f86848c, null, 2, null)), 7, null);
            if (!formB.getFields().g()) {
                return c0Var.b(new er.l() { // from class: h41.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.k.X(formB, (d.ChoosingOffices) obj2);
                    }
                });
            }
            BEChildBirthRegistrationMunicipalOffice value3 = form.getFields().getChosenMunicipalOffice().getValue();
            if (value3 != null && !value3.getHasElectronicDeliveryAddress()) {
                final z zVar = z.this;
                return c0Var.d(new er.l() { // from class: h41.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.k.Y(zVar, c0Var, (d.ChoosingOffices) obj2);
                    }
                });
            }
            i41.a contract = z.this.setupData.getContract();
            List<BEChildBirthRegistrationMunicipalOffice> listE = form.e();
            BEChildBirthRegistrationCivilRegistryOffices availableCivilRegistryOffices = form.getAvailableCivilRegistryOffices();
            if (availableCivilRegistryOffices != null && (value = form.getFields().getChosenMunicipalOffice().getValue()) != null && (value2 = form.getFields().getChosenCivilRegistryOffice().getValue()) != null) {
                contract.W2(new BEChildBirthPlaceOfBirthOffices(listE, availableCivilRegistryOffices, value, value2));
                z.this.d9(h41.a.e.c.f80819a);
                return c0Var.b(new er.l() { // from class: h41.o0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.k.Z(formB, (d.ChoosingOffices) obj2);
                    }
                });
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.d dVar, k10.c0<h41.d.ChoosingOffices> c0Var, tq.e<? super k10.l<? extends h41.d>> eVar) {
            k kVar = z.this.new k(eVar);
            kVar.f80972f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh41/a$f;", "action", "Lk10/c0;", "Lh41/d$f;", "state", "Lk10/l;", "Lh41/d;", "<anonymous>", "(Lh41/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<h41.a.SetChoosingOffices, k10.c0<h41.d.NoEdor>, tq.e<? super k10.l<? extends h41.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80976g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h41.d.ChoosingOffices O(h41.a.SetChoosingOffices setChoosingOffices, h41.d.NoEdor noEdor) {
            return new h41.d.ChoosingOffices(setChoosingOffices.getForm(), setChoosingOffices.b());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h41.a.SetChoosingOffices setChoosingOffices = (h41.a.SetChoosingOffices) this.f80975f;
            k10.c0 c0Var = (k10.c0) this.f80976g;
            uq.b.e();
            if (this.f80974e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: h41.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.l.O(setChoosingOffices, (d.NoEdor) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h41.a.SetChoosingOffices setChoosingOffices, k10.c0<h41.d.NoEdor> c0Var, tq.e<? super k10.l<? extends h41.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f80975f = setChoosingOffices;
            lVar.f80976g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, j41.a aVar2, q31.c cVar, mx.c cVar2, hb4.d dVar, ib4.c cVar3, nl0.c cVar4, nl0.a aVar3, ac4.a aVar4, SetupData setupData) {
        this.mapper = aVar2;
        this.exitDialogMapper = cVar;
        this.labelProvider = cVar2;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar3;
        this.getMunicipalOfficeDictionary = cVar4;
        this.getCivilRegistryOfficeDictionary = aVar3;
        this.loaderUC = aVar4;
        this.setupData = setupData;
        BEChildBirthPlaceOfBirthOffices bEChildBirthPlaceOfBirthOfficesE4 = setupData.getContract().E4();
        h41.d choosingOffices = bEChildBirthPlaceOfBirthOfficesE4 == null ? h41.d.e.f80843a : new h41.d.ChoosingOffices(new Form(setupData.getContract().l(), bEChildBirthPlaceOfBirthOfficesE4.b(), bEChildBirthPlaceOfBirthOfficesE4.getAvailableCivilRegistryOffices(), new BirthPlaceOfficeFields(new BirthPlaceOfficeFields.a.MunicipalOffice(null, bEChildBirthPlaceOfBirthOfficesE4.getChosenMunicipalOffice(), 1, null), new BirthPlaceOfficeFields.a.CivilRegistryOffice(null, bEChildBirthPlaceOfBirthOfficesE4.getChosenCivilRegistryOffice(), 1, null))), null, 2, null);
        this.initialState = choosingOffices;
        this.stateMachine = aVar.a(choosingOffices, new er.l() { // from class: h41.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.K9(this.f80889a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), F9(choosingOffices));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b D9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: h41.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.E9(this.f80902a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(z zVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            zVar.d9(h41.a.c.f80815a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            zVar.d9(h41.a.e.C1855a.f80817a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h41.e.a F9(h41.d dVar) {
        return this.mapper.b(new j41.a.Params(dVar, b9(h41.a.e.C1855a.f80817a), b9(h41.a.g.f80824a), b9(h41.a.d.f80816a), b9(h41.a.b.f80814a), b9(h41.a.C1854a.f80813a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b.Failure G9(final Form form, final d60.j<BirthPlaceOfficeFields.b> scrollInstance) {
        return new jb4.b.Failure(this.labelProvider.c(j31.a.f99130c1), this.labelProvider.c(j31.a.f99125b1), null, new ErrorActionData(this.labelProvider.c(j31.a.f99171k2), new er.a() { // from class: h41.w
            @Override // er.a
            public final Object a() {
                return z.H9(this.f80896a, form, scrollInstance);
            }
        }), null, null, new ErrorActionData(null, new er.a() { // from class: h41.x
            @Override // er.a
            public final Object a() {
                return z.I9(this.f80899a, form, scrollInstance);
            }
        }, 1, null), 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(z zVar, Form form, d60.j jVar) {
        zVar.d9(new h41.a.SetChoosingOffices(form, jVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(z zVar, Form form, d60.j jVar) {
        zVar.d9(new h41.a.SetChoosingOffices(form, jVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(final z zVar, k10.v vVar) {
        vVar.c(fr.q0.c(h41.d.class), new er.l() { // from class: h41.o
            @Override // er.l
            public final Object b(Object obj) {
                return z.L9(this.f80887a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h41.d.ErrorFetchingMunicipalOffices.class), new er.l() { // from class: h41.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.M9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h41.d.e.class), new er.l() { // from class: h41.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.N9(this.f80891a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h41.d.ErrorFetchingCivilRegistryOffices.class), new er.l() { // from class: h41.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.O9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h41.d.FetchingCivilRegistryOffices.class), new er.l() { // from class: h41.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.P9(this.f80894a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h41.d.ChoosingOffices.class), new er.l() { // from class: h41.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.Q9(this.f80895a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(h41.d.NoEdor.class), new er.l() { // from class: h41.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.R9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(z zVar, k10.z zVar2) {
        b bVar = zVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(fr.q0.c(h41.a.e.class), oVar, bVar);
        zVar2.x(fr.q0.c(h41.a.g.class), oVar, zVar.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(k10.z zVar) {
        d dVar = new d(null);
        zVar.v(fr.q0.c(h41.a.c.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(k10.z zVar) {
        f fVar = new f(null);
        zVar.v(fr.q0.c(h41.a.c.class), k10.o.CANCEL_PREVIOUS, fVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(z zVar, k10.z zVar2) {
        h hVar = zVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(fr.q0.c(h41.a.b.class), oVar, hVar);
        zVar2.v(fr.q0.c(h41.a.C1854a.class), oVar, zVar.new i(null));
        zVar2.v(fr.q0.c(h41.a.UpdateChosenOffice.class), oVar, new j(null));
        zVar2.v(fr.q0.c(h41.a.d.class), oVar, zVar.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(fr.q0.c(h41.a.SetChoosingOffices.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        if (data.getOfficeSearchResult() != null) {
            d9(new h41.a.UpdateChosenOffice(data.getOfficeSearchResult()));
        }
    }

    @Override // zx.b
    public xw.b<h41.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h41.d, h41.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<h41.e.a> getState() {
        return this.state;
    }
}
