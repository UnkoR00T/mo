package f72;

import d72.HydroWarning;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lf72/f;", "Ll00/g;", "Lf72/o;", "Lf72/m;", "Lf72/p;", "", "Lyy/a;", "stateMachineFactory", "Lg72/c;", "mapper", "Lc72/a;", "interactor", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lf72/n;", "setupData", "<init>", "(Lyy/a;Lg72/c;Lc72/a;Lib4/c;Lac4/a;Lf72/n;)V", "state", "Lf72/p$a;", "r9", "(Lf72/o;)Lf72/p$a;", "data", "Loq/i0;", "t9", "(Lf72/n;)V", "b", "Lg72/c;", "c", "Lc72/a;", "d", "Lib4/c;", "e", "Lac4/a;", "f", "Lf72/n;", "Lf72/o$a;", "g", "Lf72/o$a;", "initialState", "Lxw/b;", "Lf72/m$e;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends l00.g<o, m> implements p, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g72.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c72.a interactor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final FloodAlertAlarmStateNavigationParams setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o.a initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m.e> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<o, m> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<p.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<p.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f59761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f59762b;

        /* JADX INFO: renamed from: f72.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1345a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f59763a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f59764b;

            /* JADX INFO: renamed from: f72.f$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1346a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f59765d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f59766e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f59767f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f59769h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f59770j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f59771k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f59772l;

                public C1346a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f59765d = obj;
                    this.f59766e |= PKIFailureInfo.systemUnavail;
                    return C1345a.this.F(null, this);
                }
            }

            public C1345a(mu.h hVar, f fVar) {
                this.f59763a = hVar;
                this.f59764b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1346a c1346a;
                if (eVar instanceof C1346a) {
                    c1346a = (C1346a) eVar;
                    int i15 = c1346a.f59766e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1346a.f59766e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1346a = new C1346a(eVar);
                    }
                } else {
                    c1346a = new C1346a(eVar);
                }
                Object obj2 = c1346a.f59765d;
                Object objE = uq.b.e();
                int i16 = c1346a.f59766e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f59763a;
                    p.a aVarR9 = this.f59764b.r9((o) obj);
                    c1346a.f59767f = vq.j.a(obj);
                    c1346a.f59769h = vq.j.a(c1346a);
                    c1346a.f59770j = vq.j.a(obj);
                    c1346a.f59771k = vq.j.a(hVar);
                    c1346a.f59772l = 0;
                    c1346a.f59766e = 1;
                    if (hVar.F(aVarR9, c1346a) == objE) {
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

        public a(mu.g gVar, f fVar) {
            this.f59761a = gVar;
            this.f59762b = fVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p.a> hVar, tq.e eVar) {
            Object objA = this.f59761a.a(new C1345a(hVar, this.f59762b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf72/m$b;", "<unused var>", "Lf72/o;", "Loq/i0;", "<anonymous>", "(Lf72/m$b;Lf72/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<m.b, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59773e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f59773e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m.e> bVarY1 = f.this.Y1();
                m.e.a aVar = m.e.a.f59809a;
                this.f59773e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(m.b bVar, o oVar, tq.e<? super i0> eVar) {
            return f.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf72/m$c;", "action", "Lf72/o;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf72/m$c;Lf72/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<m.Error, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59776f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(f fVar, m.Error error, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                fVar.d9(m.b.f59805a);
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new oq.p();
                }
                fVar.d9(error.getRetryAction());
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m.Error error = (m.Error) this.f59776f;
            Object objE = uq.b.e();
            int i15 = this.f59775e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m.e> bVarY1 = f.this.Y1();
                ib4.c cVar = f.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final f fVar = f.this;
                m.e.Error error2 = new m.e.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: f72.g
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f.c.O(fVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f59776f = vq.j.a(error);
                this.f59775e = 1;
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
        public final Object w(m.Error error, o oVar, tq.e<? super i0> eVar) {
            c cVar = f.this.new c(eVar);
            cVar.f59776f = error;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf72/o$a;", "it", "Loq/i0;", "<anonymous>", "(Lf72/o$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<o.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59778e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f59778e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f.this.d9(m.d.f59808a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(o.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf72/m$d;", "action", "Lk10/c0;", "Lf72/o$a;", "state", "Lk10/l;", "Lf72/o;", "<anonymous>", "(Lf72/m$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<m.d, c0<o.a>, tq.e<? super k10.l<? extends o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f59782g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lf72/o;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends o>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f59784e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ f f59785f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m.d f59786g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<o.a> f59787h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, m.d dVar, c0<o.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f59785f = fVar;
                this.f59786g = dVar;
                this.f59787h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o.Initialized V(f fVar, List list, o.a aVar) {
                return new o.Initialized(fVar.setupData.getVoivodeship(), list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f59784e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    c72.a aVar = this.f59785f.interactor;
                    this.f59784e = 1;
                    obj = aVar.a(this);
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
                final f fVar = this.f59785f;
                m.d dVar = this.f59786g;
                c0<o.a> c0Var = this.f59787h;
                if (iVar instanceof dx.i.Left) {
                    fVar.d9(new m.Error((dx.b) ((dx.i.Left) iVar).b(), dVar));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: f72.h
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f.e.a.V(fVar, list, (o.a) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f59785f, this.f59786g, this.f59787h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends o>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m.d dVar = (m.d) this.f59781f;
            c0 c0Var = (c0) this.f59782g;
            Object objE = uq.b.e();
            int i15 = this.f59780e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = f.this.callActionWithLoaderUseCase;
            a aVar2 = new a(f.this, dVar, c0Var, null);
            this.f59781f = vq.j.a(dVar);
            this.f59782g = vq.j.a(c0Var);
            this.f59780e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m.d dVar, c0<o.a> c0Var, tq.e<? super k10.l<? extends o>> eVar) {
            e eVar2 = f.this.new e(eVar);
            eVar2.f59781f = dVar;
            eVar2.f59782g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: f72.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf72/m$g;", "<unused var>", "Lf72/o$b;", "state", "Loq/i0;", "<anonymous>", "(Lf72/m$g;Lf72/o$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C1347f extends vq.k implements er.q<m.g, o.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59789f;

        C1347f(tq.e<? super C1347f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o.Initialized initialized = (o.Initialized) this.f59789f;
            Object objE = uq.b.e();
            int i15 = this.f59788e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m.e> bVarY1 = f.this.Y1();
                m.e.ToVoivodeshipPicker toVoivodeshipPicker = new m.e.ToVoivodeshipPicker(initialized.getSelectedVoivodeship());
                this.f59789f = vq.j.a(initialized);
                this.f59788e = 1;
                if (bVarY1.F(toVoivodeshipPicker, this) == objE) {
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
        public final Object w(m.g gVar, o.Initialized initialized, tq.e<? super i0> eVar) {
            C1347f c1347f = f.this.new C1347f(eVar);
            c1347f.f59789f = initialized;
            return c1347f.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf72/m$f;", "action", "Lf72/o$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lf72/m$f;Lf72/o$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<m.ToAlarmStateDetails, o.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59792f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m.ToAlarmStateDetails toAlarmStateDetails = (m.ToAlarmStateDetails) this.f59792f;
            Object objE = uq.b.e();
            int i15 = this.f59791e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<m.e> bVarY1 = f.this.Y1();
                m.e.ToAlarmStateDetails toAlarmStateDetails2 = new m.e.ToAlarmStateDetails(toAlarmStateDetails.getHydroWarning());
                this.f59792f = vq.j.a(toAlarmStateDetails);
                this.f59791e = 1;
                if (bVarY1.F(toAlarmStateDetails2, this) == objE) {
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
        public final Object w(m.ToAlarmStateDetails toAlarmStateDetails, o.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = f.this.new g(eVar);
            gVar.f59792f = toAlarmStateDetails;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf72/m$a;", "action", "Lk10/c0;", "Lf72/o$b;", "state", "Lk10/l;", "Lf72/o;", "<anonymous>", "(Lf72/m$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<m.ChooseVoivodeship, c0<o.Initialized>, tq.e<? super k10.l<? extends o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f59794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f59796g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.Initialized O(m.ChooseVoivodeship chooseVoivodeship, o.Initialized initialized) {
            return o.Initialized.b(initialized, chooseVoivodeship.getVoivodeship(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m.ChooseVoivodeship chooseVoivodeship = (m.ChooseVoivodeship) this.f59795f;
            c0 c0Var = (c0) this.f59796g;
            uq.b.e();
            if (this.f59794e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: f72.i
                @Override // er.l
                public final Object b(Object obj2) {
                    return f.h.O(chooseVoivodeship, (o.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m.ChooseVoivodeship chooseVoivodeship, c0<o.Initialized> c0Var, tq.e<? super k10.l<? extends o>> eVar) {
            h hVar = new h(eVar);
            hVar.f59795f = chooseVoivodeship;
            hVar.f59796g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public f(yy.a aVar, g72.c cVar, c72.a aVar2, ib4.c cVar2, ac4.a aVar3, FloodAlertAlarmStateNavigationParams floodAlertAlarmStateNavigationParams) {
        this.mapper = cVar;
        this.interactor = aVar2;
        this.genericDomainErrorMapper = cVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.setupData = floodAlertAlarmStateNavigationParams;
        o.a aVar4 = o.a.f59816a;
        this.initialState = aVar4;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: f72.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.u9(this.f59751a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), r9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p.a r9(o state) {
        return this.mapper.b(new g72.c.Params(state, b9(m.b.f59805a), new er.l() { // from class: f72.a
            @Override // er.l
            public final Object b(Object obj) {
                return f.s9(this.f59747a, (HydroWarning) obj);
            }
        }, b9(m.g.f59814a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(f fVar, HydroWarning hydroWarning) {
        fVar.d9(new m.ToAlarmStateDetails(hydroWarning));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final f fVar, k10.v vVar) {
        vVar.c(q0.c(o.class), new er.l() { // from class: f72.b
            @Override // er.l
            public final Object b(Object obj) {
                return f.v9(this.f59748a, (z) obj);
            }
        });
        vVar.c(q0.c(o.a.class), new er.l() { // from class: f72.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.w9(this.f59749a, (z) obj);
            }
        });
        vVar.c(q0.c(o.Initialized.class), new er.l() { // from class: f72.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.x9(this.f59750a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(f fVar, z zVar) {
        b bVar = fVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(m.b.class), oVar, bVar);
        zVar.x(q0.c(m.Error.class), oVar, fVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(f fVar, z zVar) {
        zVar.C(fVar.new d(null));
        e eVar = fVar.new e(null);
        zVar.v(q0.c(m.d.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(f fVar, z zVar) {
        C1347f c1347f = fVar.new C1347f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(m.g.class), oVar, c1347f);
        zVar.x(q0.c(m.ToAlarmStateDetails.class), oVar, fVar.new g(null));
        zVar.v(q0.c(m.ChooseVoivodeship.class), oVar, new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<m.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<o, m> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public void P5(FloodAlertAlarmStateNavigationParams data) {
        String voivodeship = data.getVoivodeship();
        if (voivodeship != null) {
            d9(new m.ChooseVoivodeship(voivodeship));
        }
    }
}
