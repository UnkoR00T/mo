package n52;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p52.StampDutyPaymentsResultRequiredData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Ln52/m;", "Ll00/g;", "Ln52/d;", "Ln52/c;", "Ln52/e;", "", "Lyy/a;", "stateMachineFactory", "Lp52/a;", "setupData", "Lo52/a;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Les0/c;", "getPaymentDetailsUseCase", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lyy/a;Lp52/a;Lo52/a;Lac4/a;Les0/c;Lib4/c;)V", "state", "Ln52/e$a;", "o9", "(Ln52/d;)Ln52/e$a;", "b", "Lp52/a;", "c", "Lo52/a;", "d", "Lac4/a;", "e", "Les0/c;", "f", "Lib4/c;", "g", "Ln52/d;", "initialState", "Lxw/b;", "Ln52/c$e;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, n52.c> implements n52.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StampDutyPaymentsResultRequiredData setupData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o52.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final es0.c getPaymentDetailsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n52.c.e> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<State, n52.c> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<n52.e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<n52.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f132199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f132200b;

        /* JADX INFO: renamed from: n52.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3280a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f132201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f132202b;

            /* JADX INFO: renamed from: n52.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3281a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f132203d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f132204e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f132205f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f132207h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f132208j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f132209k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f132210l;

                public C3281a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f132203d = obj;
                    this.f132204e |= PKIFailureInfo.systemUnavail;
                    return C3280a.this.F(null, this);
                }
            }

            public C3280a(mu.h hVar, m mVar) {
                this.f132201a = hVar;
                this.f132202b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3281a c3281a;
                if (eVar instanceof C3281a) {
                    c3281a = (C3281a) eVar;
                    int i15 = c3281a.f132204e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3281a.f132204e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3281a = new C3281a(eVar);
                    }
                } else {
                    c3281a = new C3281a(eVar);
                }
                Object obj2 = c3281a.f132203d;
                Object objE = uq.b.e();
                int i16 = c3281a.f132204e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f132201a;
                    n52.e.Data dataO9 = this.f132202b.o9((State) obj);
                    c3281a.f132205f = vq.j.a(obj);
                    c3281a.f132207h = vq.j.a(c3281a);
                    c3281a.f132208j = vq.j.a(obj);
                    c3281a.f132209k = vq.j.a(hVar);
                    c3281a.f132210l = 0;
                    c3281a.f132204e = 1;
                    if (hVar.F(dataO9, c3281a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f132199a = gVar;
            this.f132200b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n52.e.Data> hVar, tq.e eVar) {
            Object objA = this.f132199a.a(new C3280a(hVar, this.f132200b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln52/c$a;", "<unused var>", "Ln52/d;", "Loq/i0;", "<anonymous>", "(Ln52/c$a;Ln52/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<n52.c.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132211e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132211e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n52.c.e> bVarY1 = m.this.Y1();
                n52.c.e.a aVar = n52.c.e.a.f132174a;
                this.f132211e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(n52.c.a aVar, State state, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln52/c$b;", "<unused var>", "Ln52/d;", "Loq/i0;", "<anonymous>", "(Ln52/c$b;Ln52/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<n52.c.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132213e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f132213e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<n52.c.e> bVarY1 = m.this.Y1();
                n52.c.e.b bVar = n52.c.e.b.f132175a;
                this.f132213e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(n52.c.b bVar, State state, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln52/c$d;", "<unused var>", "Ln52/d;", "state", "Loq/i0;", "<anonymous>", "(Ln52/c$d;Ln52/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<n52.c.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132216f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f132218e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f132219f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f132220g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f132221h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f132222j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ m f132223k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ State f132224l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f132223k = mVar;
                this.f132224l = state;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x00fc, code lost:
            
                if (r4.F(r6, r19) == r1) goto L29;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 264
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n52.m.d.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f132223k, this.f132224l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f132216f;
            Object objE = uq.b.e();
            int i15 = this.f132215e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = m.this.callActionWithLoaderUseCase;
                a aVar2 = new a(m.this, state, null);
                this.f132216f = vq.j.a(state);
                this.f132215e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(n52.c.d dVar, State state, tq.e<? super i0> eVar) {
            d dVar2 = m.this.new d(eVar);
            dVar2.f132216f = state;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln52/c$c;", "action", "Ln52/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ln52/c$c;Ln52/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<n52.c.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f132226f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                mVar.d9(n52.c.b.f132171a);
            } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                mVar.d9(n52.c.f.f132178a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                mVar.d9(n52.c.b.f132171a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n52.c.Error error = (n52.c.Error) this.f132226f;
            Object objE = uq.b.e();
            int i15 = this.f132225e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ib4.c cVar = m.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final m mVar2 = m.this;
                n52.c.e.Error error2 = new n52.c.e.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: n52.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.e.O(mVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f132226f = vq.j.a(error);
                this.f132225e = 1;
                if (mVar.F(error2, this) == objE) {
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
        public final Object w(n52.c.Error error, State state, tq.e<? super i0> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f132226f = error;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln52/c$f;", "<unused var>", "Ln52/d;", "Loq/i0;", "<anonymous>", "(Ln52/c$f;Ln52/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<n52.c.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f132228e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f132228e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.d9(n52.c.d.f132173a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n52.c.f fVar, State state, tq.e<? super i0> eVar) {
            return m.this.new f(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, StampDutyPaymentsResultRequiredData stampDutyPaymentsResultRequiredData, o52.a aVar2, ac4.a aVar3, es0.c cVar, ib4.c cVar2) {
        this.setupData = stampDutyPaymentsResultRequiredData;
        this.mapper = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.getPaymentDetailsUseCase = cVar;
        this.genericDomainErrorMapper = cVar2;
        State state = new State(stampDutyPaymentsResultRequiredData.getPaymentId());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: n52.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f132189a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n52.e.Data o9(State state) {
        return this.mapper.b(new o52.a.Params(state, b9(n52.c.f.f132178a), b9(n52.c.b.f132171a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: n52.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.r9(this.f132188a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(n52.c.a.class), oVar, bVar);
        zVar.x(q0.c(n52.c.b.class), oVar, mVar.new c(null));
        zVar.x(q0.c(n52.c.d.class), oVar, mVar.new d(null));
        zVar.x(q0.c(n52.c.Error.class), oVar, mVar.new e(null));
        zVar.x(q0.c(n52.c.f.class), oVar, mVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<n52.c.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, n52.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<n52.e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(n52.c.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(StampDutyPaymentsResultRequiredData stampDutyPaymentsResultRequiredData) {
        super.P5(stampDutyPaymentsResultRequiredData);
    }
}
