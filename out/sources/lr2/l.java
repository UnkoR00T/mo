package lr2;

import er.q;
import fr.q0;
import k10.v;
import k10.z;
import ml0.t;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u0018098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Llr2/l;", "Ll00/g;", "Llr2/b;", "Llr2/a;", "Llr2/c;", "", "Lyy/a;", "stateMachineFactory", "Lnr2/e;", "mapper", "Lnr2/d;", "summaryConfirmDialogMapper", "Lml0/t;", "invalidatePassportUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Ld74/b;", "getWKTokenForMIDUC", "Lmr2/a;", "contract", "<init>", "(Lyy/a;Lnr2/e;Lnr2/d;Lml0/t;Lac4/a;Lib4/c;Ld74/b;Lmr2/a;)V", "Llr2/c$a;", "s9", "(Llr2/b;)Llr2/c$a;", "b", "Lnr2/e;", "c", "Lnr2/d;", "d", "Lml0/t;", "e", "Lac4/a;", "f", "Lib4/c;", "g", "Ld74/b;", "h", "Lmr2/a;", "j", "Llr2/b;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Llr2/a$d;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, lr2.a> implements lr2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nr2.d summaryConfirmDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t invalidatePassportUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d74.b getWKTokenForMIDUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mr2.a contract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, lr2.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lr2.a.d> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<lr2.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<lr2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f119990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f119991b;

        /* JADX INFO: renamed from: lr2.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2925a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f119992a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f119993b;

            /* JADX INFO: renamed from: lr2.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2926a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f119994d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f119995e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f119996f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f119998h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f119999j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f120000k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f120001l;

                public C2926a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f119994d = obj;
                    this.f119995e |= PKIFailureInfo.systemUnavail;
                    return C2925a.this.F(null, this);
                }
            }

            public C2925a(mu.h hVar, l lVar) {
                this.f119992a = hVar;
                this.f119993b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2926a c2926a;
                if (eVar instanceof C2926a) {
                    c2926a = (C2926a) eVar;
                    int i15 = c2926a.f119995e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2926a.f119995e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2926a = new C2926a(eVar);
                    }
                } else {
                    c2926a = new C2926a(eVar);
                }
                Object obj2 = c2926a.f119994d;
                Object objE = uq.b.e();
                int i16 = c2926a.f119995e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f119992a;
                    lr2.c.Data dataS9 = this.f119993b.s9((State) obj);
                    c2926a.f119996f = vq.j.a(obj);
                    c2926a.f119998h = vq.j.a(c2926a);
                    c2926a.f119999j = vq.j.a(obj);
                    c2926a.f120000k = vq.j.a(hVar);
                    c2926a.f120001l = 0;
                    c2926a.f119995e = 1;
                    if (hVar.F(dataS9, c2926a) == objE) {
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
            this.f119990a = gVar;
            this.f119991b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super lr2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f119990a.a(new C2925a(hVar, this.f119991b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llr2/a$a;", "<unused var>", "Llr2/b;", "Loq/i0;", "<anonymous>", "(Llr2/a$a;Llr2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<lr2.a.C2922a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120002e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f120002e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<lr2.a.d> bVarY1 = l.this.Y1();
                lr2.a.d.C2923a c2923a = lr2.a.d.C2923a.f119958a;
                this.f120002e = 1;
                if (bVarY1.F(c2923a, this) == objE) {
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
        public final Object w(lr2.a.C2922a c2922a, State state, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llr2/a$e;", "<unused var>", "Llr2/b;", "Loq/i0;", "<anonymous>", "(Llr2/a$e;Llr2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<lr2.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120004e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f120004e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                lr2.a.d.ShowDialog showDialog = new lr2.a.d.ShowDialog(l.this.summaryConfirmDialogMapper.b(new nr2.d.Params(l.this.b9(lr2.a.c.f119957a), l.this.contract.c().getChooseReasonData().getPassportInvalidationReason())));
                this.f120004e = 1;
                if (lVar.F(showDialog, this) == objE) {
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
        public final Object w(lr2.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return l.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llr2/a$b;", "<unused var>", "Llr2/b;", "Loq/i0;", "<anonymous>", "(Llr2/a$b;Llr2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<lr2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120006e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f120006e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<lr2.a.d> bVarY1 = l.this.Y1();
                lr2.a.d.c cVar = lr2.a.d.c.f119960a;
                this.f120006e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(lr2.a.b bVar, State state, tq.e<? super i0> eVar) {
            return l.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llr2/a$c;", "action", "Llr2/b;", "state", "Loq/i0;", "<anonymous>", "(Llr2/a$c;Llr2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<lr2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f120010g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f120012e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f120013f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f120014g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f120015h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f120016j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ l f120017k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ State f120018l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ lr2.a.c f120019m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, State state, lr2.a.c cVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f120017k = lVar;
                this.f120018l = state;
                this.f120019m = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 V(l lVar, lr2.a.c cVar, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Primary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    lVar.d9(cVar);
                }
                return i0.f148189a;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:29:0x0117  */
            /* JADX WARN: Code duplicated, block: B:31:0x011b  */
            /* JADX WARN: Code duplicated, block: B:34:0x0137  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
            
                if (r15 == r0) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0114, code lost:
            
                if (r4.F(r12, r14) == r0) goto L28;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 323
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: lr2.l.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f120017k, this.f120018l, this.f120019m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lr2.a.c cVar = (lr2.a.c) this.f120009f;
            State state = (State) this.f120010g;
            Object objE = uq.b.e();
            int i15 = this.f120008e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = l.this.callActionWithLoaderUseCase;
                a aVar2 = new a(l.this, state, cVar, null);
                this.f120009f = vq.j.a(cVar);
                this.f120010g = vq.j.a(state);
                this.f120008e = 1;
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
        public final Object w(lr2.a.c cVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = l.this.new e(eVar);
            eVar2.f120009f = cVar;
            eVar2.f120010g = state;
            return eVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, nr2.e eVar, nr2.d dVar, t tVar, ac4.a aVar2, ib4.c cVar, d74.b bVar, mr2.a aVar3) {
        this.mapper = eVar;
        this.summaryConfirmDialogMapper = dVar;
        this.invalidatePassportUC = tVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.getWKTokenForMIDUC = bVar;
        this.contract = aVar3;
        State state = new State(aVar3.c());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: lr2.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.u9(this.f119978a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), s9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lr2.c.Data s9(State state) {
        return this.mapper.b(new nr2.e.Params(state, b9(lr2.a.e.f119962a), b9(lr2.a.C2922a.f119955a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: lr2.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.v9(this.f119977a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lr2.a.C2922a.class), oVar, bVar);
        zVar.x(q0.c(lr2.a.e.class), oVar, lVar.new c(null));
        zVar.x(q0.c(lr2.a.b.class), oVar, lVar.new d(null));
        zVar.x(q0.c(lr2.a.c.class), oVar, lVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<lr2.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, lr2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<lr2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(lr2.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mr2.a aVar) {
        super.P5(aVar);
    }
}
