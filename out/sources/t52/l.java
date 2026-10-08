package t52;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y32.UserDocumentData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lt52/l;", "Ll00/g;", "Lt52/b;", "Lt52/a;", "Lt52/c;", "", "Lyy/a;", "stateMachineFactory", "Lu52/a;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lx32/a;", "epaymentsContainersInteractor", "Lw52/f;", "stampDutyPaymentsPersonalDataContract", "<init>", "(Lyy/a;Lu52/a;Lac4/a;Lib4/c;Lx32/a;Lw52/f;)V", "state", "Lt52/c$a;", "s9", "(Lt52/b;)Lt52/c$a;", "Ly32/a;", "Ly52/g$a;", "y9", "(Ly32/a;)Ly52/g$a;", "b", "Lu52/a;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lx32/a;", "f", "Lw52/f;", "Lxw/b;", "Lt52/a$f;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<t52.b, t52.a> implements t52.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u52.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x32.a epaymentsContainersInteractor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w52.f stampDutyPaymentsPersonalDataContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<t52.a.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<t52.b, t52.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<t52.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<t52.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f187781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f187782b;

        /* JADX INFO: renamed from: t52.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4883a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f187783a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f187784b;

            /* JADX INFO: renamed from: t52.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4884a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f187785d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f187786e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f187787f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f187789h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f187790j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f187791k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f187792l;

                public C4884a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f187785d = obj;
                    this.f187786e |= PKIFailureInfo.systemUnavail;
                    return C4883a.this.F(null, this);
                }
            }

            public C4883a(mu.h hVar, l lVar) {
                this.f187783a = hVar;
                this.f187784b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4884a c4884a;
                if (eVar instanceof C4884a) {
                    c4884a = (C4884a) eVar;
                    int i15 = c4884a.f187786e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4884a.f187786e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4884a = new C4884a(eVar);
                    }
                } else {
                    c4884a = new C4884a(eVar);
                }
                Object obj2 = c4884a.f187785d;
                Object objE = uq.b.e();
                int i16 = c4884a.f187786e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f187783a;
                    t52.c.a aVarS9 = this.f187784b.s9((t52.b) obj);
                    c4884a.f187787f = vq.j.a(obj);
                    c4884a.f187789h = vq.j.a(c4884a);
                    c4884a.f187790j = vq.j.a(obj);
                    c4884a.f187791k = vq.j.a(hVar);
                    c4884a.f187792l = 0;
                    c4884a.f187786e = 1;
                    if (hVar.F(aVarS9, c4884a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, l lVar) {
            this.f187781a = gVar;
            this.f187782b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super t52.c.a> hVar, tq.e eVar) {
            Object objA = this.f187781a.a(new C4883a(hVar, this.f187782b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt52/a$b;", "<unused var>", "Lt52/b;", "Loq/i0;", "<anonymous>", "(Lt52/a$b;Lt52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<t52.a.b, t52.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187793e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f187793e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                t52.a.f.b bVar = t52.a.f.b.f187750a;
                this.f187793e = 1;
                if (lVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t52.a.b bVar, t52.b bVar2, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt52/a$c;", "action", "Lt52/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt52/a$c;Lt52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<t52.a.Error, t52.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187796f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(l lVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    lVar.d9(t52.a.C4879a.f187744a);
                } else if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new oq.p();
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t52.a.Error error = (t52.a.Error) this.f187796f;
            Object objE = uq.b.e();
            int i15 = this.f187795e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<t52.a.f> bVarY1 = l.this.Y1();
                ib4.c cVar = l.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final l lVar = l.this;
                t52.a.f.Error error2 = new t52.a.f.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: t52.m
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l.c.O(lVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f187796f = vq.j.a(error);
                this.f187795e = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t52.a.Error error, t52.b bVar, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f187796f = error;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lt52/b$a;", "state", "Lk10/l;", "Lt52/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<t52.b.a>, tq.e<? super k10.l<? extends t52.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187799f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lt52/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends t52.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f187801e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f187802f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<t52.b.a> f187803g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, c0<t52.b.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f187802f = lVar;
                this.f187803g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final t52.b.Initialized V(l lVar, UserDocumentData userDocumentData, t52.b.a aVar) {
                return new t52.b.Initialized(lVar.y9(userDocumentData));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f187801e;
                if (i15 == 0) {
                    u.b(obj);
                    x32.a aVar = this.f187802f.epaymentsContainersInteractor;
                    this.f187801e = 1;
                    obj = aVar.c(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                final l lVar = this.f187802f;
                c0<t52.b.a> c0Var = this.f187803g;
                if (iVar instanceof dx.i.Left) {
                    lVar.d9(new t52.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final UserDocumentData userDocumentData = (UserDocumentData) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: t52.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l.d.a.V(lVar, userDocumentData, (b.a) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f187802f, this.f187803g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends t52.b>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f187799f;
            Object objE = uq.b.e();
            int i15 = this.f187798e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ac4.a aVar = l.this.callActionWithLoaderUseCase;
            a aVar2 = new a(l.this, c0Var, null);
            this.f187799f = vq.j.a(c0Var);
            this.f187798e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<t52.b.a> c0Var, tq.e<? super k10.l<? extends t52.b>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = l.this.new d(eVar);
            dVar.f187799f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt52/a$a;", "<unused var>", "Lt52/b$a;", "Loq/i0;", "<anonymous>", "(Lt52/a$a;Lt52/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<t52.a.C4879a, t52.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187804e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f187804e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                t52.a.f.C4880a c4880a = t52.a.f.C4880a.f187749a;
                this.f187804e = 1;
                if (lVar.F(c4880a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t52.a.C4879a c4879a, t52.b.a aVar, tq.e<? super i0> eVar) {
            return l.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt52/a$e;", "<unused var>", "Lt52/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lt52/a$e;Lt52/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<t52.a.e, t52.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187807f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t52.b.Initialized initialized = (t52.b.Initialized) this.f187807f;
            Object objE = uq.b.e();
            int i15 = this.f187806e;
            if (i15 == 0) {
                u.b(obj);
                l.this.d9(new t52.a.SavePersonData(initialized.getUserData()));
                l lVar = l.this;
                t52.a.f.e eVar = t52.a.f.e.f187753a;
                this.f187807f = vq.j.a(initialized);
                this.f187806e = 1;
                if (lVar.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t52.a.e eVar, t52.b.Initialized initialized, tq.e<? super i0> eVar2) {
            f fVar = l.this.new f(eVar2);
            fVar.f187807f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt52/a$d;", "<unused var>", "Lt52/b$b;", "Loq/i0;", "<anonymous>", "(Lt52/a$d;Lt52/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<t52.a.d, t52.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187809e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f187809e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                t52.a.f.d dVar = t52.a.f.d.f187752a;
                this.f187809e = 1;
                if (lVar.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t52.a.d dVar, t52.b.Initialized initialized, tq.e<? super i0> eVar) {
            return l.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt52/a$g;", "action", "Lt52/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt52/a$g;Lt52/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<t52.a.SavePersonData, t52.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187812f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t52.a.SavePersonData savePersonData = (t52.a.SavePersonData) this.f187812f;
            uq.b.e();
            if (this.f187811e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l.this.stampDutyPaymentsPersonalDataContract.S5(savePersonData.getStampDutyPaymentsPersonData());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t52.a.SavePersonData savePersonData, t52.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = l.this.new h(eVar);
            hVar.f187812f = savePersonData;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt52/a$a;", "<unused var>", "Lt52/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lt52/a$a;Lt52/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<t52.a.C4879a, t52.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187815f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t52.b.Initialized initialized = (t52.b.Initialized) this.f187815f;
            Object objE = uq.b.e();
            int i15 = this.f187814e;
            if (i15 == 0) {
                u.b(obj);
                l.this.d9(new t52.a.SavePersonData(initialized.getUserData()));
                l lVar = l.this;
                t52.a.f.C4880a c4880a = t52.a.f.C4880a.f187749a;
                this.f187815f = vq.j.a(initialized);
                this.f187814e = 1;
                if (lVar.F(c4880a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t52.a.C4879a c4879a, t52.b.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = l.this.new i(eVar);
            iVar.f187815f = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, u52.a aVar2, ac4.a aVar3, ib4.c cVar, x32.a aVar4, w52.f fVar) {
        this.mapper = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.genericDomainErrorMapper = cVar;
        this.epaymentsContainersInteractor = aVar4;
        this.stampDutyPaymentsPersonalDataContract = fVar;
        t52.b.a aVar5 = t52.b.a.f187755a;
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: t52.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.u9(this.f187772a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), s9(aVar5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t52.c.a s9(t52.b state) {
        return this.mapper.b(new u52.a.Params(state, b9(t52.a.e.f187748a), b9(t52.a.d.f187747a), b9(t52.a.b.f187745a), b9(t52.a.C4879a.f187744a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final l lVar, v vVar) {
        vVar.c(q0.c(t52.b.class), new er.l() { // from class: t52.h
            @Override // er.l
            public final Object b(Object obj) {
                return l.v9(this.f187769a, (z) obj);
            }
        });
        vVar.c(q0.c(t52.b.a.class), new er.l() { // from class: t52.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.w9(this.f187770a, (z) obj);
            }
        });
        vVar.c(q0.c(t52.b.Initialized.class), new er.l() { // from class: t52.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.x9(this.f187771a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t52.a.b.class), oVar, bVar);
        zVar.x(q0.c(t52.a.Error.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(l lVar, z zVar) {
        zVar.A(lVar.new d(null));
        e eVar = lVar.new e(null);
        zVar.x(q0.c(t52.a.C4879a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(l lVar, z zVar) {
        f fVar = lVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t52.a.e.class), oVar, fVar);
        zVar.x(q0.c(t52.a.d.class), oVar, lVar.new g(null));
        zVar.x(q0.c(t52.a.SavePersonData.class), oVar, lVar.new h(null));
        zVar.x(q0.c(t52.a.C4879a.class), oVar, lVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y52.g.MyPersonalData y9(UserDocumentData userDocumentData) {
        return new y52.g.MyPersonalData(iy.c0.g(userDocumentData.getFirstName()), iy.c0.g(userDocumentData.getSurname()), xw.g.c(iy.c0.g(userDocumentData.getPesel())), null);
    }

    @Override // zx.b
    public xw.b<t52.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<t52.b, t52.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<t52.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(t52.a.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(w52.f fVar) {
        super.P5(fVar);
    }
}
