package ug3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R&\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003088\u0014X\u0094\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010D\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020!0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lug3/m;", "Ll00/g;", "Lug3/c;", "Lug3/a;", "Lug3/d;", "", "Lyy/a;", "stateMachineFactory", "Lwg3/a;", "mapper", "Lbe3/e;", "internalConfirmInitialInfoUC", "Lmx/c;", "labelProvider", "Lbe3/g;", "internalRejectInitialInfoUC", "Lib4/c;", "domainErrorMapper", "Lde3/d;", "isWrongStateErrorUC", "Lug3/b;", "setupData", "<init>", "(Lyy/a;Lwg3/a;Lbe3/e;Lmx/c;Lbe3/g;Lib4/c;Lde3/d;Lug3/b;)V", "state", "Loq/i0;", "v9", "(Lug3/c;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "retryAction", "r9", "(Ldx/b;Lug3/a;Ltq/e;)Ljava/lang/Object;", "Lug3/d$a;", "t9", "(Lug3/c;)Lug3/d$a;", "data", "u9", "(Lug3/b;)V", "b", "Lwg3/a;", "c", "Lbe3/e;", "d", "Lmx/c;", "e", "Lbe3/g;", "f", "Lib4/c;", "g", "Lde3/d;", "h", "Lug3/b;", "j", "Lug3/c;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lug3/a$b;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, ug3.a> implements ug3.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wg3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final be3.e internalConfirmInitialInfoUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final be3.g internalRejectInitialInfoUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final de3.d isWrongStateErrorUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<State, ug3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ug3.a.b> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<ug3.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ug3.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f198136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f198137b;

        /* JADX INFO: renamed from: ug3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5154a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f198138a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f198139b;

            /* JADX INFO: renamed from: ug3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5155a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f198140d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f198141e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f198142f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f198144h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f198145j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f198146k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f198147l;

                public C5155a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f198140d = obj;
                    this.f198141e |= PKIFailureInfo.systemUnavail;
                    return C5154a.this.F(null, this);
                }
            }

            public C5154a(mu.h hVar, m mVar) {
                this.f198138a = hVar;
                this.f198139b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5155a c5155a;
                if (eVar instanceof C5155a) {
                    c5155a = (C5155a) eVar;
                    int i15 = c5155a.f198141e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5155a.f198141e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5155a = new C5155a(eVar);
                    }
                } else {
                    c5155a = new C5155a(eVar);
                }
                Object obj2 = c5155a.f198140d;
                Object objE = uq.b.e();
                int i16 = c5155a.f198141e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f198138a;
                    ug3.d.Data dataT9 = this.f198139b.t9((State) obj);
                    c5155a.f198142f = vq.j.a(obj);
                    c5155a.f198144h = vq.j.a(c5155a);
                    c5155a.f198145j = vq.j.a(obj);
                    c5155a.f198146k = vq.j.a(hVar);
                    c5155a.f198147l = 0;
                    c5155a.f198141e = 1;
                    if (hVar.F(dataT9, c5155a) == objE) {
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
            this.f198136a = gVar;
            this.f198137b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ug3.d.Data> hVar, tq.e eVar) {
            Object objA = this.f198136a.a(new C5154a(hVar, this.f198137b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lug3/a$d;", "action", "Lug3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lug3/a$d;Lug3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<ug3.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198148e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198148e;
            if (i15 == 0) {
                u.b(obj);
                vg3.a contract = m.this.setupData.getContract();
                ProcessId processId = m.this.setupData.getConfirmationModel().getProcessId();
                this.f198148e = 1;
                if (contract.k0(processId, this) == objE) {
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
        public final Object w(ug3.a.d dVar, State state, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lug3/a$b;", "action", "Lug3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lug3/a$b;Lug3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ug3.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198151f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ug3.a.b bVar = (ug3.a.b) this.f198151f;
            Object objE = uq.b.e();
            int i15 = this.f198150e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f198151f = vq.j.a(bVar);
                this.f198150e = 1;
                if (mVar.F(bVar, this) == objE) {
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
        public final Object w(ug3.a.b bVar, State state, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f198151f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lug3/a$a;", "action", "Lug3/c;", "state", "Loq/i0;", "<anonymous>", "(Lug3/a$a;Lug3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<ug3.a.C5151a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f198154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f198155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f198156h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f198157j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f198158k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f198159l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f198160m;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007a  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
        
            if (r4.r9(r6, r0, r8) == r2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
        
            if (r9.F(r5, r8) == r2) goto L27;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ug3.m.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ug3.a.C5151a c5151a, State state, tq.e<? super i0> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f198159l = c5151a;
            dVar.f198160m = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lug3/a$c;", "action", "Lug3/c;", "state", "Loq/i0;", "<anonymous>", "(Lug3/a$c;Lug3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<ug3.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f198163f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198164g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f198165h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f198166j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f198167k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f198168l;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
        
            if (r3.r9(r5, r0, r8) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f198167k
                ug3.a$c r0 = (ug3.a.c) r0
                java.lang.Object r1 = r8.f198168l
                ug3.c r1 = (ug3.State) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f198166j
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2e
                if (r3 == r5) goto L2a
                if (r3 != r4) goto L22
                java.lang.Object r0 = r8.f198163f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r8.f198162e
                dx.i r0 = (dx.i) r0
                oq.u.b(r9)
                goto L8a
            L22:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2a:
                oq.u.b(r9)
                goto L57
            L2e:
                oq.u.b(r9)
                ug3.m r9 = ug3.m.this
                be3.g r9 = ug3.m.l9(r9)
                be3.g$a r3 = new be3.g$a
                yd3.a r6 = r1.getConfirmationModel()
                sv0.y r6 = r6.getProcessId()
                sv0.a0 r7 = sv0.a0.IDENTITY_REJECTION
                r3.<init>(r6, r7)
                r8.f198167k = r0
                java.lang.Object r6 = vq.j.a(r1)
                r8.f198168l = r6
                r8.f198166j = r5
                java.lang.Object r9 = r9.c(r3, r8)
                if (r9 != r2) goto L57
                goto L89
            L57:
                dx.i r9 = (dx.i) r9
                ug3.m r3 = ug3.m.this
                boolean r5 = r9 instanceof dx.i.Left
                if (r5 == 0) goto L8a
                r5 = r9
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                java.lang.Object r6 = vq.j.a(r0)
                r8.f198167k = r6
                java.lang.Object r1 = vq.j.a(r1)
                r8.f198168l = r1
                r8.f198162e = r9
                java.lang.Object r9 = vq.j.a(r5)
                r8.f198163f = r9
                r9 = 0
                r8.f198164g = r9
                r8.f198165h = r9
                r8.f198166j = r4
                java.lang.Object r9 = ug3.m.n9(r3, r5, r0, r8)
                if (r9 != r2) goto L8a
            L89:
                return r2
            L8a:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ug3.m.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ug3.a.c cVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = m.this.new e(eVar);
            eVar2.f198167k = cVar;
            eVar2.f198168l = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lug3/a$e;", "<unused var>", "Lug3/c;", "state", "Loq/i0;", "<anonymous>", "(Lug3/a$e;Lug3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<ug3.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198171f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f198171f;
            Object objE = uq.b.e();
            int i15 = this.f198170e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f198171f = vq.j.a(state);
                this.f198170e = 1;
                if (mVar.v9(state, this) == objE) {
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
        public final Object w(ug3.a.e eVar, State state, tq.e<? super i0> eVar2) {
            f fVar = m.this.new f(eVar2);
            fVar.f198171f = state;
            return fVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, wg3.a aVar2, be3.e eVar, mx.c cVar, be3.g gVar, ib4.c cVar2, de3.d dVar, SetupData setupData) {
        this.mapper = aVar2;
        this.internalConfirmInitialInfoUC = eVar;
        this.labelProvider = cVar;
        this.internalRejectInitialInfoUC = gVar;
        this.domainErrorMapper = cVar2;
        this.isWrongStateErrorUC = dVar;
        this.setupData = setupData;
        State state = new State(setupData.getConfirmationModel());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ug3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.x9(this.f198124a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r9(final dx.b bVar, final ug3.a aVar, tq.e<? super i0> eVar) {
        Object objF = F(new ug3.a.b.ShowError(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ug3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.s9(this.f198121a, bVar, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(m mVar, dx.b bVar, ug3.a aVar, ib4.c.b bVar2) {
        if (mVar.isWrongStateErrorUC.c(new de3.d.Params(bVar)).booleanValue()) {
            mVar.d9(ug3.a.b.d.f198098a);
        } else if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar2 instanceof ib4.c.b.a.Primary)) {
            mVar.d9(aVar);
        } else if (!fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar2 instanceof ib4.c.b.a.Secondary) && !(bVar2 instanceof ib4.c.b.a.Close)) {
            throw new oq.p();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ug3.d.Data t9(State state) {
        return this.mapper.b(new wg3.a.Params(state, b9(ug3.a.C5151a.f198094a), b9(ug3.a.e.f198103a), b9(ug3.a.b.C5152a.f198095a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v9(State state, tq.e<? super i0> eVar) {
        int i15;
        Label labelC = this.labelProvider.c(md3.b.R3);
        mx.c cVar = this.labelProvider;
        boolean isAuthor = state.getConfirmationModel().getIsAuthor();
        if (isAuthor) {
            i15 = md3.b.Q3;
        } else {
            if (isAuthor) {
                throw new oq.p();
            }
            i15 = md3.b.P3;
        }
        Object objF = F(new ug3.a.b.ShowRejectionDialog(new DialogData(cb4.h.b.f24985a, labelC, cVar.c(i15), new DialogButtonTextData(this.labelProvider.c(md3.b.S), null, b9(ug3.a.c.f198101a), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.T), null, new er.a() { // from class: ug3.j
            @Override // er.a
            public final Object a() {
                return m.w9();
            }
        }, 2, null), null, null, 96, null)), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ug3.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.y9(this.f198120a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ug3.a.d.class), oVar, bVar);
        zVar.x(q0.c(ug3.a.b.class), oVar, mVar.new c(null));
        zVar.x(q0.c(ug3.a.C5151a.class), oVar, mVar.new d(null));
        zVar.x(q0.c(ug3.a.c.class), oVar, mVar.new e(null));
        zVar.x(q0.c(ug3.a.e.class), oVar, mVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ug3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, ug3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ug3.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ug3.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        d9(ug3.a.d.f198102a);
        super.P5(data);
    }
}
