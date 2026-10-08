package mf2;

import ff2.UserDocumentData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uf2.OperatorItem;
import zi0.InternetDemandRequest;
import zi0.InternetDemandResponse;
import zi0.InternetSpeed;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001DBS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lmf2/h0;", "Ll00/g;", "Lmf2/d;", "Lmf2/c;", "Lmf2/e;", "", "Lyy/a;", "stateMachineFactory", "Lnf2/b;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lef2/a;", "internetAccessContainersInteractor", "Lhj0/a;", "createDemandUseCase", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lmf2/f;", "setupContract", "<init>", "(Lyy/a;Lnf2/b;Lac4/a;Lef2/a;Lhj0/a;Lmx/c;Lib4/c;Lhb4/d;Lmf2/f;)V", "state", "Lmf2/e$a;", "y9", "(Lmf2/d;)Lmf2/e$a;", "b", "Lnf2/b;", "c", "Lac4/a;", "d", "Lef2/a;", "e", "Lhj0/a;", "f", "Lmx/c;", "g", "Lib4/c;", "h", "Lhb4/d;", "j", "Lmf2/f;", "Lxw/b;", "Lmf2/c$f;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmf2/d$b;", "l", "Lmf2/d$b;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<mf2.d, mf2.c> implements mf2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nf2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ef2.a internetAccessContainersInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hj0.a createDemandUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mf2.f setupContract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mf2.c.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mf2.d.b initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<mf2.d, mf2.c> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<mf2.e.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmf2/h0$a;", "Lf00/j0;", "Lmf2/f;", "Lmf2/h0;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<mf2.f, h0> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<mf2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f126212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f126213b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f126214a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f126215b;

            /* JADX INFO: renamed from: mf2.h0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3105a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f126216d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f126217e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f126218f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f126220h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f126221j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f126222k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f126223l;

                public C3105a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f126216d = obj;
                    this.f126217e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h0 h0Var) {
                this.f126214a = hVar;
                this.f126215b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3105a c3105a;
                if (eVar instanceof C3105a) {
                    c3105a = (C3105a) eVar;
                    int i15 = c3105a.f126217e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3105a.f126217e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3105a = new C3105a(eVar);
                    }
                } else {
                    c3105a = new C3105a(eVar);
                }
                Object obj2 = c3105a.f126216d;
                Object objE = uq.b.e();
                int i16 = c3105a.f126217e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f126214a;
                    mf2.e.a aVarY9 = this.f126215b.y9((mf2.d) obj);
                    c3105a.f126218f = vq.j.a(obj);
                    c3105a.f126220h = vq.j.a(c3105a);
                    c3105a.f126221j = vq.j.a(obj);
                    c3105a.f126222k = vq.j.a(hVar);
                    c3105a.f126223l = 0;
                    c3105a.f126217e = 1;
                    if (hVar.F(aVarY9, c3105a) == objE) {
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

        public b(mu.g gVar, h0 h0Var) {
            this.f126212a = gVar;
            this.f126213b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super mf2.e.a> hVar, tq.e eVar) {
            Object objA = this.f126212a.a(new a(hVar, this.f126213b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmf2/d$b;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<mf2.d.b>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126225f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lmf2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends mf2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f126227e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f126228f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f126229g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f126230h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f126231j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ h0 f126232k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<mf2.d.b> f126233l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, k10.c0<mf2.d.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f126232k = h0Var;
                this.f126233l = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mf2.d.Error a0(final h0 h0Var, mf2.d.b bVar) {
                return new mf2.d.Error(h0Var.errorVMSFactory.a(h0Var.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: mf2.m0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.c.a.b0(h0Var, (ib4.c.b) obj);
                    }
                }))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 b0(h0 h0Var, ib4.c.b bVar) {
                h0Var.d9(mf2.c.b.f126140a);
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mf2.d.c.DisplayingData c0(UserDocumentData userDocumentData, FormSummaryContractData formSummaryContractData, mf2.d.b bVar) {
                return new mf2.d.c.DisplayingData(new mf2.d.StateData(userDocumentData, formSummaryContractData, false, null, 8, null));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mf2.d.Error d0(final h0 h0Var, mf2.d.b bVar) {
                return new mf2.d.Error(h0Var.errorVMSFactory.a(h0Var.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: mf2.l0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.c.a.e0(h0Var, (ib4.c.b) obj);
                    }
                }))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 e0(h0 h0Var, ib4.c.b bVar) {
                h0Var.d9(mf2.c.b.f126140a);
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final FormSummaryContractData formSummaryContractData;
                final h0 h0Var;
                k10.c0<mf2.d.b> c0Var;
                Object objD;
                Object objE = uq.b.e();
                int i15 = this.f126231j;
                if (i15 == 0) {
                    oq.u.b(obj);
                    FormSummaryContractData formSummaryContractDataU8 = this.f126232k.setupContract.u8();
                    if (formSummaryContractDataU8 != null) {
                        h0 h0Var2 = this.f126232k;
                        k10.c0<mf2.d.b> c0Var2 = this.f126233l;
                        ef2.a aVar = h0Var2.internetAccessContainersInteractor;
                        this.f126227e = h0Var2;
                        this.f126228f = c0Var2;
                        this.f126229g = formSummaryContractDataU8;
                        this.f126230h = 0;
                        this.f126231j = 1;
                        Object objA = aVar.a(this);
                        if (objA == objE) {
                            return objE;
                        }
                        formSummaryContractData = formSummaryContractDataU8;
                        obj = objA;
                        h0Var = h0Var2;
                        c0Var = c0Var2;
                    }
                    k10.c0<mf2.d.b> c0Var3 = this.f126233l;
                    final h0 h0Var3 = this.f126232k;
                    return c0Var3.d(new er.l() { // from class: mf2.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.c.a.d0(h0Var3, (d.b) obj2);
                        }
                    });
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                formSummaryContractData = (FormSummaryContractData) this.f126229g;
                c0Var = (k10.c0) this.f126228f;
                h0Var = (h0) this.f126227e;
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    objD = c0Var.d(new er.l() { // from class: mf2.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.c.a.a0(h0Var, (d.b) obj2);
                        }
                    });
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final UserDocumentData userDocumentData = (UserDocumentData) ((dx.i.Right) iVar).b();
                    objD = c0Var.d(new er.l() { // from class: mf2.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.c.a.c0(userDocumentData, formSummaryContractData, (d.b) obj2);
                        }
                    });
                }
                if (objD != null) {
                    return objD;
                }
                k10.c0<mf2.d.b> c0Var4 = this.f126233l;
                final h0 h0Var4 = this.f126232k;
                return c0Var4.d(new er.l() { // from class: mf2.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.c.a.d0(h0Var4, (d.b) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> Y(tq.e<?> eVar) {
                return new a(this.f126232k, this.f126233l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends mf2.d>> eVar) {
                return ((a) Y(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126225f;
            Object objE = uq.b.e();
            int i15 = this.f126224e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = h0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(h0.this, c0Var, null);
            this.f126225f = vq.j.a(c0Var);
            this.f126224e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<mf2.d.b> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = h0.this.new c(eVar);
            cVar.f126225f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmf2/c$a;", "<unused var>", "Lmf2/d$c$a;", "Loq/i0;", "<anonymous>", "(Lmf2/c$a;Lmf2/d$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<mf2.c.a, mf2.d.c.DisplayingData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126234e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126234e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mf2.c.f> bVarY1 = h0.this.Y1();
                mf2.c.f.a aVar = mf2.c.f.a.f126144a;
                this.f126234e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(mf2.c.a aVar, mf2.d.c.DisplayingData displayingData, tq.e<? super oq.i0> eVar) {
            return h0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmf2/c$c;", "<unused var>", "Lmf2/d$c$a;", "Loq/i0;", "<anonymous>", "(Lmf2/c$c;Lmf2/d$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<mf2.c.C3098c, mf2.d.c.DisplayingData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126236e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126236e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mf2.c.f> bVarY1 = h0.this.Y1();
                mf2.c.f.C3099c c3099c = mf2.c.f.C3099c.f126146a;
                this.f126236e = 1;
                if (bVarY1.F(c3099c, this) == objE) {
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
        public final Object w(mf2.c.C3098c c3098c, mf2.d.c.DisplayingData displayingData, tq.e<? super oq.i0> eVar) {
            return h0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmf2/c$d;", "<unused var>", "Lk10/c0;", "Lmf2/d$c$a;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lmf2/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<mf2.c.d, k10.c0<mf2.d.c.DisplayingData>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126239f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf2.d.c.ProviderList O(k10.c0 c0Var, mf2.d.c.DisplayingData displayingData) {
            return new mf2.d.c.ProviderList(((mf2.d.c.DisplayingData) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f126239f;
            uq.b.e();
            if (this.f126238e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mf2.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.f.O(c0Var, (d.c.DisplayingData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mf2.c.d dVar, k10.c0<mf2.d.c.DisplayingData> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f126239f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmf2/c$e;", "<unused var>", "Lk10/c0;", "Lmf2/d$c$a;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lmf2/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<mf2.c.e, k10.c0<mf2.d.c.DisplayingData>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126241f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf2.d.c.Statement O(k10.c0 c0Var, mf2.d.c.DisplayingData displayingData) {
            return new mf2.d.c.Statement(((mf2.d.c.DisplayingData) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f126241f;
            uq.b.e();
            if (this.f126240e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mf2.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.g.O(c0Var, (d.c.DisplayingData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mf2.c.e eVar, k10.c0<mf2.d.c.DisplayingData> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f126241f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmf2/c$i;", "action", "Lk10/c0;", "Lmf2/d$c$a;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lmf2/c$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<mf2.c.StatementCheckChange, k10.c0<mf2.d.c.DisplayingData>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126244g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf2.d.c.DisplayingData O(mf2.c.StatementCheckChange statementCheckChange, mf2.d.c.DisplayingData displayingData) {
            return displayingData.a(mf2.d.StateData.b(displayingData.getStateData(), null, null, statementCheckChange.getIsChecked(), hz.b.C2039b.f86846c, 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final mf2.c.StatementCheckChange statementCheckChange = (mf2.c.StatementCheckChange) this.f126243f;
            k10.c0 c0Var = (k10.c0) this.f126244g;
            uq.b.e();
            if (this.f126242e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mf2.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.h.O(statementCheckChange, (d.c.DisplayingData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mf2.c.StatementCheckChange statementCheckChange, k10.c0<mf2.d.c.DisplayingData> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar) {
            h hVar = new h(eVar);
            hVar.f126243f = statementCheckChange;
            hVar.f126244g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmf2/c$h;", "<unused var>", "Lk10/c0;", "Lmf2/d$c$a;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lmf2/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<mf2.c.h, k10.c0<mf2.d.c.DisplayingData>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126246f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf2.d.c.SendingApplication V(mf2.d.c.DisplayingData displayingData) {
            return new mf2.d.c.SendingApplication(displayingData.getStateData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf2.d.c.DisplayingData X(h0 h0Var, mf2.d.c.DisplayingData displayingData) {
            return displayingData.a(mf2.d.StateData.b(displayingData.getStateData(), null, null, false, new hz.b.Invalid(h0Var.labelProvider.c(df2.a.f41418z)), 7, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126246f;
            uq.b.e();
            if (this.f126245e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean isCheckedStatement = ((mf2.d.c.DisplayingData) c0Var.a()).getStateData().getIsCheckedStatement();
            if (isCheckedStatement) {
                return c0Var.d(new er.l() { // from class: mf2.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.i.V((d.c.DisplayingData) obj2);
                    }
                });
            }
            if (isCheckedStatement) {
                throw new oq.p();
            }
            final h0 h0Var = h0.this;
            return c0Var.b(new er.l() { // from class: mf2.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.i.X(h0Var, (d.c.DisplayingData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(mf2.c.h hVar, k10.c0<mf2.d.c.DisplayingData> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar) {
            i iVar = h0.this.new i(eVar);
            iVar.f126246f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmf2/d$c$c;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<mf2.d.c.SendingApplication>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126249f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lmf2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends mf2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f126251e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0 f126252f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<mf2.d.c.SendingApplication> f126253g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, k10.c0<mf2.d.c.SendingApplication> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f126252f = h0Var;
                this.f126253g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mf2.d.Error Y(final h0 h0Var, dx.b bVar, final mf2.d.c.SendingApplication sendingApplication) {
                return new mf2.d.Error(h0Var.errorVMSFactory.a(h0Var.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: mf2.u0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.j.a.Z(h0Var, sendingApplication, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 Z(h0 h0Var, mf2.d.c.SendingApplication sendingApplication, ib4.c.b bVar) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    h0Var.d9(new mf2.c.Retry(sendingApplication.getStateData()));
                } else {
                    h0Var.d9(mf2.c.b.f126140a);
                }
                return oq.i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mf2.d.Success a0(InternetDemandResponse internetDemandResponse, k10.c0 c0Var, mf2.d.c.SendingApplication sendingApplication) {
                return new mf2.d.Success(internetDemandResponse.getDemandId(), ((mf2.d.c.SendingApplication) c0Var.a()).getStateData().getFormData().d());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objC;
                Object objE = uq.b.e();
                int i15 = this.f126251e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    hj0.a aVar = this.f126252f.createDemandUseCase;
                    long id5 = this.f126253g.a().getStateData().getFormData().getAddressPoint().getId();
                    String communityId = this.f126253g.a().getStateData().getFormData().getAddressPoint().getCommunityId();
                    boolean isCheckedStatement = this.f126253g.a().getStateData().getIsCheckedStatement();
                    List<OperatorItem> listD = this.f126253g.a().getStateData().getFormData().d();
                    ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add(vq.b.f(((OperatorItem) it.next()).getOperator().getId()));
                    }
                    Set setK1 = pq.v.k1(arrayList);
                    boolean upgrade = this.f126253g.a().getStateData().getFormData().getParameters().getUpgrade();
                    String apartmentNumber = this.f126253g.a().getStateData().getFormData().getAddress().getApartmentNumber();
                    InternetSpeed downlink = this.f126253g.a().getStateData().getFormData().getParameters().getDownlink();
                    Integer numE = downlink != null ? vq.b.e(downlink.getValue()) : null;
                    String strE = iy.c0.e(this.f126253g.a().getStateData().getFormData().getContactInfo().getEmail());
                    String strD = this.f126253g.a().getStateData().getFormData().getContactInfo().d();
                    InternetSpeed uplink = this.f126253g.a().getStateData().getFormData().getParameters().getUplink();
                    hj0.a.Params params = new hj0.a.Params(new InternetDemandRequest(id5, communityId, isCheckedStatement, setK1, upgrade, apartmentNumber, numE, strE, strD, uplink != null ? vq.b.e(uplink.getValue()) : null));
                    this.f126251e = 1;
                    objC = aVar.c(params, this);
                    if (objC == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    objC = obj;
                }
                dx.i iVar = (dx.i) objC;
                final k10.c0<mf2.d.c.SendingApplication> c0Var = this.f126253g;
                final h0 h0Var = this.f126252f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: mf2.s0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.j.a.Y(h0Var, bVar, (d.c.SendingApplication) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final InternetDemandResponse internetDemandResponse = (InternetDemandResponse) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: mf2.t0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.j.a.a0(internetDemandResponse, c0Var, (d.c.SendingApplication) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f126252f, this.f126253g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends mf2.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f126249f;
            Object objE = uq.b.e();
            int i15 = this.f126248e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = h0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(h0.this, c0Var, null);
            this.f126249f = vq.j.a(c0Var);
            this.f126248e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<mf2.d.c.SendingApplication> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = h0.this.new j(eVar);
            jVar.f126249f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmf2/c$a;", "<unused var>", "Lk10/c0;", "Lmf2/d$c$b;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lmf2/c$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<mf2.c.a, k10.c0<mf2.d.c.ProviderList>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126255f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf2.d.c.DisplayingData O(k10.c0 c0Var, mf2.d.c.ProviderList providerList) {
            return new mf2.d.c.DisplayingData(((mf2.d.c.ProviderList) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f126255f;
            uq.b.e();
            if (this.f126254e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mf2.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.k.O(c0Var, (d.c.ProviderList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mf2.c.a aVar, k10.c0<mf2.d.c.ProviderList> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f126255f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmf2/c$a;", "<unused var>", "Lk10/c0;", "Lmf2/d$c$d;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lmf2/c$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<mf2.c.a, k10.c0<mf2.d.c.Statement>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126257f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf2.d.c.DisplayingData O(k10.c0 c0Var, mf2.d.c.Statement statement) {
            return new mf2.d.c.DisplayingData(((mf2.d.c.Statement) c0Var.a()).getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f126257f;
            uq.b.e();
            if (this.f126256e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mf2.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.l.O(c0Var, (d.c.Statement) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mf2.c.a aVar, k10.c0<mf2.d.c.Statement> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f126257f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmf2/c$b;", "<unused var>", "Lmf2/d$e;", "Loq/i0;", "<anonymous>", "(Lmf2/c$b;Lmf2/d$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<mf2.c.b, mf2.d.Success, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126258e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126258e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mf2.c.f> bVarY1 = h0.this.Y1();
                mf2.c.f.b bVar = mf2.c.f.b.f126145a;
                this.f126258e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(mf2.c.b bVar, mf2.d.Success success, tq.e<? super oq.i0> eVar) {
            return h0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmf2/c$b;", "<unused var>", "Lmf2/d$a;", "Loq/i0;", "<anonymous>", "(Lmf2/c$b;Lmf2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<mf2.c.b, mf2.d.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126260e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126260e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mf2.c.f> bVarY1 = h0.this.Y1();
                mf2.c.f.b bVar = mf2.c.f.b.f126145a;
                this.f126260e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(mf2.c.b bVar, mf2.d.Error error, tq.e<? super oq.i0> eVar) {
            return h0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmf2/c$g;", "action", "Lk10/c0;", "Lmf2/d$a;", "state", "Lk10/l;", "Lmf2/d;", "<anonymous>", "(Lmf2/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<mf2.c.Retry, k10.c0<mf2.d.Error>, tq.e<? super k10.l<? extends mf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126264g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf2.d.c.SendingApplication O(mf2.c.Retry retry, mf2.d.Error error) {
            return new mf2.d.c.SendingApplication(retry.getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final mf2.c.Retry retry = (mf2.c.Retry) this.f126263f;
            k10.c0 c0Var = (k10.c0) this.f126264g;
            uq.b.e();
            if (this.f126262e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mf2.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.o.O(retry, (d.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mf2.c.Retry retry, k10.c0<mf2.d.Error> c0Var, tq.e<? super k10.l<? extends mf2.d>> eVar) {
            o oVar = new o(eVar);
            oVar.f126263f = retry;
            oVar.f126264g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    public h0(yy.a aVar, nf2.b bVar, ac4.a aVar2, ef2.a aVar3, hj0.a aVar4, mx.c cVar, ib4.c cVar2, hb4.d dVar, mf2.f fVar) {
        this.mapper = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.internetAccessContainersInteractor = aVar3;
        this.createDemandUseCase = aVar4;
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.setupContract = fVar;
        mf2.d.b bVar2 = mf2.d.b.f126151a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: mf2.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.B9(this.f126197a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), y9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(final h0 h0Var, k10.v vVar) {
        vVar.c(fr.q0.c(mf2.d.b.class), new er.l() { // from class: mf2.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.C9(this.f126305a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(mf2.d.c.DisplayingData.class), new er.l() { // from class: mf2.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.D9(this.f126306a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(mf2.d.c.SendingApplication.class), new er.l() { // from class: mf2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.E9(this.f126135a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(mf2.d.c.ProviderList.class), new er.l() { // from class: mf2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.F9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(mf2.d.c.Statement.class), new er.l() { // from class: mf2.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.G9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(mf2.d.Success.class), new er.l() { // from class: mf2.d0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.H9(this.f126162a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(mf2.d.Error.class), new er.l() { // from class: mf2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.I9(this.f126190a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(h0 h0Var, k10.z zVar) {
        zVar.A(h0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(h0 h0Var, k10.z zVar) {
        d dVar = h0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(mf2.c.a.class), oVar, dVar);
        zVar.x(fr.q0.c(mf2.c.C3098c.class), oVar, h0Var.new e(null));
        zVar.v(fr.q0.c(mf2.c.d.class), oVar, new f(null));
        zVar.v(fr.q0.c(mf2.c.e.class), oVar, new g(null));
        zVar.v(fr.q0.c(mf2.c.StatementCheckChange.class), oVar, new h(null));
        zVar.v(fr.q0.c(mf2.c.h.class), oVar, h0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(h0 h0Var, k10.z zVar) {
        zVar.A(h0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(k10.z zVar) {
        k kVar = new k(null);
        zVar.v(fr.q0.c(mf2.c.a.class), k10.o.CANCEL_PREVIOUS, kVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(k10.z zVar) {
        l lVar = new l(null);
        zVar.v(fr.q0.c(mf2.c.a.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(h0 h0Var, k10.z zVar) {
        m mVar = h0Var.new m(null);
        zVar.x(fr.q0.c(mf2.c.b.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(h0 h0Var, k10.z zVar) {
        n nVar = h0Var.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(mf2.c.b.class), oVar, nVar);
        zVar.v(fr.q0.c(mf2.c.Retry.class), oVar, new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mf2.e.a y9(mf2.d state) {
        return this.mapper.b(new nf2.b.Params(state, b9(mf2.c.h.f126148a), b9(mf2.c.a.f126139a), b9(mf2.c.b.f126140a), b9(mf2.c.C3098c.f126141a), b9(mf2.c.d.f126142a), b9(mf2.c.e.f126143a), new er.l() { // from class: mf2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.z9(this.f126191a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(h0 h0Var, boolean z15) {
        h0Var.d9(new mf2.c.StatementCheckChange(z15));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mf2.e.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<mf2.c.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<mf2.d, mf2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<mf2.e.a> getState() {
        return this.state;
    }
}
