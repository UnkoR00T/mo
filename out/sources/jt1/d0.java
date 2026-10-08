package jt1;

import fr.q0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Ljt1/d0;", "Ll00/g;", "Ljt1/b;", "Ljt1/a;", "Ljt1/i;", "", "Lyy/a;", "stateMachineFactory", "Ljt1/j;", "mapper", "Lib4/c;", "genericDomainErrorHandler", "Lac4/a;", "callActionWithLoaderUseCase", "Lml0/x;", "restrictDocumentUC", "Lhb4/d;", "errorVMSFactory", "Lkt1/a;", "setupData", "<init>", "(Lyy/a;Ljt1/j;Lib4/c;Lac4/a;Lml0/x;Lhb4/d;Lkt1/a;)V", "state", "Ljt1/i$a;", "B9", "(Ljt1/b;)Ljt1/i$a;", "Ldx/b;", "domainError", "Lhb4/c;", "z9", "(Ldx/b;)Lhb4/c;", "b", "Ljt1/j;", "c", "Lib4/c;", "d", "Lac4/a;", "e", "Lml0/x;", "f", "Lhb4/d;", "g", "Lkt1/a;", "h", "Ljt1/b;", "initialState", "Lxw/b;", "Ljt1/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<jt1.b, jt1.a> implements jt1.i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jt1.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ml0.x restrictDocumentUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final kt1.a setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final jt1.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<jt1.a.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<jt1.b, jt1.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<jt1.i.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<jt1.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f105260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f105261b;

        /* JADX INFO: renamed from: jt1.d0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2500a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f105262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f105263b;

            /* JADX INFO: renamed from: jt1.d0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2501a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f105264d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f105265e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f105266f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f105268h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f105269j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f105270k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f105271l;

                public C2501a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f105264d = obj;
                    this.f105265e |= PKIFailureInfo.systemUnavail;
                    return C2500a.this.F(null, this);
                }
            }

            public C2500a(mu.h hVar, d0 d0Var) {
                this.f105262a = hVar;
                this.f105263b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2501a c2501a;
                if (eVar instanceof C2501a) {
                    c2501a = (C2501a) eVar;
                    int i15 = c2501a.f105265e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2501a.f105265e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2501a = new C2501a(eVar);
                    }
                } else {
                    c2501a = new C2501a(eVar);
                }
                Object obj2 = c2501a.f105264d;
                Object objE = uq.b.e();
                int i16 = c2501a.f105265e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f105262a;
                    jt1.i.a aVarB9 = this.f105263b.B9((jt1.b) obj);
                    c2501a.f105266f = vq.j.a(obj);
                    c2501a.f105268h = vq.j.a(c2501a);
                    c2501a.f105269j = vq.j.a(obj);
                    c2501a.f105270k = vq.j.a(hVar);
                    c2501a.f105271l = 0;
                    c2501a.f105265e = 1;
                    if (hVar.F(aVarB9, c2501a) == objE) {
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

        public a(mu.g gVar, d0 d0Var) {
            this.f105260a = gVar;
            this.f105261b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super jt1.i.a> hVar, tq.e eVar) {
            Object objA = this.f105260a.a(new C2500a(hVar, this.f105261b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljt1/a$a;", "<unused var>", "Ljt1/b;", "Loq/i0;", "<anonymous>", "(Ljt1/a$a;Ljt1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<jt1.a.C2496a, jt1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105272e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105272e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                jt1.a.c.C2497a c2497a = jt1.a.c.C2497a.f105234a;
                this.f105272e = 1;
                if (d0Var.F(c2497a, this) == objE) {
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
        public final Object w(jt1.a.C2496a c2496a, jt1.b bVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljt1/a$b;", "<unused var>", "Ljt1/c;", "Loq/i0;", "<anonymous>", "(Ljt1/a$b;Ljt1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<jt1.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105274e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f105274e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(jt1.a.C2496a.f105232a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return d0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$e;", "<unused var>", "Lk10/c0;", "Ljt1/c;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<jt1.a.e, k10.c0<Error>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105277f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Restricting O(k10.c0 c0Var, Error error) {
            return new Restricting(((Error) c0Var.a()).getDrivingLicenceRestrictionData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f105277f;
            uq.b.e();
            if (this.f105276e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jt1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.d.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar2) {
            d dVar = new d(eVar2);
            dVar.f105277f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$d;", "<unused var>", "Lk10/c0;", "Ljt1/b$b$a;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<jt1.a.d, k10.c0<jt1.b.InterfaceC2499b.Initialized>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105279f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Restricting O(String str, jt1.b.InterfaceC2499b.Initialized initialized) {
            return new Restricting(initialized.getPhysicalIdCardRestrictions(), str);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            k10.c0 c0Var = (k10.c0) this.f105279f;
            uq.b.e();
            if (this.f105278e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String documentId = ((jt1.b.InterfaceC2499b.Initialized) c0Var.a()).getPhysicalIdCardRestrictions().getDocumentId();
            return (documentId == null || (lVarD = c0Var.d(new er.l() { // from class: jt1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.e.O(documentId, (b.InterfaceC2499b.Initialized) obj2);
                }
            })) == null) ? c0Var.c() : lVarD;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.d dVar, k10.c0<jt1.b.InterfaceC2499b.Initialized> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f105279f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljt1/f;", "it", "Loq/i0;", "<anonymous>", "(Ljt1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<Restricting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105280e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f105280e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(jt1.a.d.f105239a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Restricting restricting, tq.e<? super oq.i0> eVar) {
            return ((f) v(restricting, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$d;", "<unused var>", "Lk10/c0;", "Ljt1/f;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<jt1.a.d, k10.c0<Restricting>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105283f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljt1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends jt1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f105285e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f105286f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f105287g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f105288h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f105289j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f105290k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ d0 f105291l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Restricting> f105292m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<Restricting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f105291l = d0Var;
                this.f105292m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(k10.c0 c0Var, d0 d0Var, dx.b bVar, Restricting restricting) {
                return new Error(((Restricting) c0Var.a()).getPhysicalIdCardRestrictions(), ((Restricting) c0Var.a()).getDocumentId(), d0Var.z9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<Restricting> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f105290k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.x xVar = this.f105291l.restrictDocumentUC;
                    ml0.x.Params params = new ml0.x.Params(this.f105292m.a().getDocumentId());
                    this.f105290k = 1;
                    obj = xVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f105286f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<Restricting> c0Var2 = this.f105292m;
                final d0 d0Var = this.f105291l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: jt1.g0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.g.a.V(c0Var2, d0Var, bVar, (Restricting) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                jt1.j jVar = d0Var.mapper;
                kt1.c cVar = kt1.c.ID_CARD;
                jt1.a.c.Success success = new jt1.a.c.Success(jVar.q(cVar), d0Var.mapper.m(cVar), cVar, null);
                this.f105285e = vq.j.a(iVar);
                this.f105286f = c0Var2;
                this.f105287g = vq.j.a(i0Var);
                this.f105288h = 0;
                this.f105289j = 0;
                this.f105290k = 2;
                if (d0Var.F(success, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f105291l, this.f105292m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends jt1.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f105283f;
            Object objE = uq.b.e();
            int i15 = this.f105282e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, c0Var, null);
            this.f105283f = vq.j.a(c0Var);
            this.f105282e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.d dVar, k10.c0<Restricting> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar) {
            g gVar = d0.this.new g(eVar);
            gVar.f105283f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljt1/a$b;", "<unused var>", "Ljt1/e;", "Loq/i0;", "<anonymous>", "(Ljt1/a$b;Ljt1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<jt1.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105293e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f105293e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(jt1.a.C2496a.f105232a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return d0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$e;", "<unused var>", "Lk10/c0;", "Ljt1/e;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<jt1.a.e, k10.c0<Error>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105296f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Restricting O(k10.c0 c0Var, Error error) {
            return new Restricting(error.getPhysicalIdCardRestrictions(), ((Error) c0Var.a()).getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f105296f;
            uq.b.e();
            if (this.f105295e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jt1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.i.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar2) {
            i iVar = new i(eVar2);
            iVar.f105296f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$d;", "<unused var>", "Lk10/c0;", "Ljt1/b$c$a;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<jt1.a.d, k10.c0<jt1.b.c.Initialized>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105298f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Restricting O(k10.c0 c0Var, String str, jt1.b.c.Initialized initialized) {
            return new Restricting(((jt1.b.c.Initialized) c0Var.a()).getPassportRestriction(), ((jt1.b.c.Initialized) c0Var.a()).getPassport(), str);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            final k10.c0 c0Var = (k10.c0) this.f105298f;
            uq.b.e();
            if (this.f105297e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String documentId = ((jt1.b.c.Initialized) c0Var.a()).getPassportRestriction().getDocumentId();
            return (documentId == null || (lVarD = c0Var.d(new er.l() { // from class: jt1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.j.O(c0Var, documentId, (b.c.Initialized) obj2);
                }
            })) == null) ? c0Var.c() : lVarD;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.d dVar, k10.c0<jt1.b.c.Initialized> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f105298f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljt1/h;", "it", "Loq/i0;", "<anonymous>", "(Ljt1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<Restricting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105299e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f105299e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(jt1.a.d.f105239a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Restricting restricting, tq.e<? super oq.i0> eVar) {
            return ((k) v(restricting, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$d;", "<unused var>", "Lk10/c0;", "Ljt1/h;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<jt1.a.d, k10.c0<Restricting>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105302f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljt1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends jt1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f105304e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f105305f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f105306g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f105307h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f105308j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f105309k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ d0 f105310l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Restricting> f105311m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<Restricting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f105310l = d0Var;
                this.f105311m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(k10.c0 c0Var, d0 d0Var, dx.b bVar, Restricting restricting) {
                return new Error(((Restricting) c0Var.a()).getPassportRestriction(), ((Restricting) c0Var.a()).getPassport(), ((Restricting) c0Var.a()).getDocumentId(), d0Var.z9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<Restricting> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f105309k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.x xVar = this.f105310l.restrictDocumentUC;
                    ml0.x.Params params = new ml0.x.Params(this.f105311m.a().getDocumentId());
                    this.f105309k = 1;
                    obj = xVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f105305f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<Restricting> c0Var2 = this.f105311m;
                final d0 d0Var = this.f105310l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: jt1.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.l.a.V(c0Var2, d0Var, bVar, (Restricting) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                jt1.j jVar = d0Var.mapper;
                kt1.c cVar = kt1.c.PASSPORT;
                jt1.a.c.Success success = new jt1.a.c.Success(jVar.q(cVar), d0Var.mapper.m(cVar), cVar, c0Var2.a().getPassport());
                this.f105304e = vq.j.a(iVar);
                this.f105305f = c0Var2;
                this.f105306g = vq.j.a(i0Var);
                this.f105307h = 0;
                this.f105308j = 0;
                this.f105309k = 2;
                if (d0Var.F(success, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f105310l, this.f105311m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends jt1.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f105302f;
            Object objE = uq.b.e();
            int i15 = this.f105301e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, c0Var, null);
            this.f105302f = vq.j.a(c0Var);
            this.f105301e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.d dVar, k10.c0<Restricting> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar) {
            l lVar = d0.this.new l(eVar);
            lVar.f105302f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljt1/a$b;", "<unused var>", "Ljt1/g;", "Loq/i0;", "<anonymous>", "(Ljt1/a$b;Ljt1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<jt1.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105312e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f105312e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(jt1.a.C2496a.f105232a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return d0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$e;", "<unused var>", "Lk10/c0;", "Ljt1/g;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<jt1.a.e, k10.c0<Error>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105315f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Restricting O(k10.c0 c0Var, Error error) {
            return new Restricting(((Error) c0Var.a()).getPassportRestriction(), ((Error) c0Var.a()).getPassport(), ((Error) c0Var.a()).getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f105315f;
            uq.b.e();
            if (this.f105314e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jt1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.n.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar2) {
            n nVar = new n(eVar2);
            nVar.f105315f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$d;", "<unused var>", "Lk10/c0;", "Ljt1/b$a$a;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<jt1.a.d, k10.c0<jt1.b.a.Initialized>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105317f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Restricting O(k10.c0 c0Var, jt1.b.a.Initialized initialized) {
            return new Restricting(((jt1.b.a.Initialized) c0Var.a()).getDrivingLicenceRestrictionData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f105317f;
            uq.b.e();
            if (this.f105316e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jt1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.o.O(c0Var, (b.a.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.d dVar, k10.c0<jt1.b.a.Initialized> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar) {
            o oVar = new o(eVar);
            oVar.f105317f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljt1/d;", "it", "Loq/i0;", "<anonymous>", "(Ljt1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<Restricting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105318e;

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f105318e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(jt1.a.d.f105239a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Restricting restricting, tq.e<? super oq.i0> eVar) {
            return ((p) v(restricting, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new p(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljt1/a$d;", "<unused var>", "Lk10/c0;", "Ljt1/d;", "state", "Lk10/l;", "Ljt1/b;", "<anonymous>", "(Ljt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<jt1.a.d, k10.c0<Restricting>, tq.e<? super k10.l<? extends jt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105321f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljt1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends jt1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f105323e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f105324f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f105325g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f105326h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f105327j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f105328k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ d0 f105329l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Restricting> f105330m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<Restricting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f105329l = d0Var;
                this.f105330m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(k10.c0 c0Var, d0 d0Var, dx.b bVar, Restricting restricting) {
                return new Error(((Restricting) c0Var.a()).getDrivingLicenceRestrictionData(), d0Var.z9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<Restricting> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f105328k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.x xVar = this.f105329l.restrictDocumentUC;
                    ml0.x.Params params = new ml0.x.Params(this.f105330m.a().getDrivingLicenceRestrictionData().getDocumentId());
                    this.f105328k = 1;
                    obj = xVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f105324f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<Restricting> c0Var2 = this.f105330m;
                final d0 d0Var = this.f105329l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: jt1.m0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.q.a.V(c0Var2, d0Var, bVar, (Restricting) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                jt1.j jVar = d0Var.mapper;
                kt1.c cVar = kt1.c.DRIVING_LICENCE;
                jt1.a.c.Success success = new jt1.a.c.Success(jVar.q(cVar), d0Var.mapper.m(cVar), cVar, null);
                this.f105323e = vq.j.a(iVar);
                this.f105324f = c0Var2;
                this.f105325g = vq.j.a(i0Var);
                this.f105326h = 0;
                this.f105327j = 0;
                this.f105328k = 2;
                if (d0Var.F(success, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f105329l, this.f105330m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends jt1.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f105321f;
            Object objE = uq.b.e();
            int i15 = this.f105320e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, c0Var, null);
            this.f105321f = vq.j.a(c0Var);
            this.f105320e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jt1.a.d dVar, k10.c0<Restricting> c0Var, tq.e<? super k10.l<? extends jt1.b>> eVar) {
            q qVar = d0.this.new q(eVar);
            qVar.f105321f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public d0(yy.a aVar, jt1.j jVar, ib4.c cVar, ac4.a aVar2, ml0.x xVar, hb4.d dVar, kt1.a aVar3) {
        jt1.b initialized;
        this.mapper = jVar;
        this.genericDomainErrorHandler = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.restrictDocumentUC = xVar;
        this.errorVMSFactory = dVar;
        this.setupData = aVar3;
        if (aVar3 instanceof kt1.a.IdSetupData) {
            initialized = new jt1.b.InterfaceC2499b.Initialized(((kt1.a.IdSetupData) aVar3).getPhysicalIdCardRestrictions());
        } else if (aVar3 instanceof kt1.a.PassportSetupData) {
            initialized = new jt1.b.c.Initialized(((kt1.a.PassportSetupData) aVar3).getPassport(), ((kt1.a.PassportSetupData) aVar3).getPassportRestriction());
        } else {
            if (!(aVar3 instanceof kt1.a.DrivingLicenceSetupData)) {
                throw new oq.p();
            }
            initialized = new jt1.b.a.Initialized(((kt1.a.DrivingLicenceSetupData) aVar3).getDrivingLicenceRestrictionConfirmationData());
        }
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: jt1.t
            @Override // er.l
            public final Object b(Object obj) {
                return d0.D9(this.f105386a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), B9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(d0 d0Var, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close)) {
            d0Var.d9(jt1.a.b.f105233a);
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            d0Var.d9(jt1.a.e.f105240a);
        } else if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            throw new oq.p();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jt1.i.a B9(jt1.b state) {
        return this.mapper.b(new jt1.j.Params(state, b9(jt1.a.d.f105239a), b9(jt1.a.C2496a.f105232a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(final d0 d0Var, k10.v vVar) {
        vVar.c(q0.c(jt1.b.class), new er.l() { // from class: jt1.r
            @Override // er.l
            public final Object b(Object obj) {
                return d0.E9(this.f105384a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(jt1.b.InterfaceC2499b.Initialized.class), new er.l() { // from class: jt1.u
            @Override // er.l
            public final Object b(Object obj) {
                return d0.F9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Restricting.class), new er.l() { // from class: jt1.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.G9(this.f105387a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: jt1.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.H9(this.f105388a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(jt1.b.c.Initialized.class), new er.l() { // from class: jt1.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.I9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Restricting.class), new er.l() { // from class: jt1.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.J9(this.f105389a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: jt1.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.K9(this.f105390a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(jt1.b.a.Initialized.class), new er.l() { // from class: jt1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.L9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Restricting.class), new er.l() { // from class: jt1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.M9(this.f105245a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: jt1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.N9(this.f105248a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(d0 d0Var, k10.z zVar) {
        b bVar = d0Var.new b(null);
        zVar.x(q0.c(jt1.a.C2496a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(k10.z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(jt1.a.d.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new f(null));
        g gVar = d0Var.new g(null);
        zVar.v(q0.c(jt1.a.d.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(d0 d0Var, k10.z zVar) {
        h hVar = d0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(jt1.a.b.class), oVar, hVar);
        zVar.v(q0.c(jt1.a.e.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(q0.c(jt1.a.d.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new k(null));
        l lVar = d0Var.new l(null);
        zVar.v(q0.c(jt1.a.d.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(d0 d0Var, k10.z zVar) {
        m mVar = d0Var.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(jt1.a.b.class), oVar, mVar);
        zVar.v(q0.c(jt1.a.e.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(k10.z zVar) {
        o oVar = new o(null);
        zVar.v(q0.c(jt1.a.d.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new p(null));
        q qVar = d0Var.new q(null);
        zVar.v(q0.c(jt1.a.d.class), k10.o.CANCEL_PREVIOUS, qVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(d0 d0Var, k10.z zVar) {
        c cVar = d0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(jt1.a.b.class), oVar, cVar);
        zVar.v(q0.c(jt1.a.e.class), oVar, new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c z9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorHandler.b(new ib4.c.Params(domainError, false, new er.l() { // from class: jt1.s
            @Override // er.l
            public final Object b(Object obj) {
                return d0.A9(this.f105385a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(kt1.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<jt1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<jt1.b, jt1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<jt1.i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(jt1.a.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }
}
