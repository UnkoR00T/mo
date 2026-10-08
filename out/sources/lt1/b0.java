package lt1;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Llt1/b0;", "Ll00/g;", "Llt1/b;", "Llt1/a;", "Llt1/i;", "", "Lyy/a;", "stateMachineFactory", "Lml0/z;", "undoRestrictionsUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorHandler", "Llt1/j;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lmt1/a;", "setupData", "<init>", "(Lyy/a;Lml0/z;Lac4/a;Lib4/c;Llt1/j;Lhb4/d;Lmt1/a;)V", "state", "Llt1/i$a;", "B9", "(Llt1/b;)Llt1/i$a;", "Ldx/b;", "domainError", "Lhb4/c;", "z9", "(Ldx/b;)Lhb4/c;", "b", "Lml0/z;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Llt1/j;", "f", "Lhb4/d;", "g", "Lmt1/a;", "h", "Llt1/b;", "initialState", "Lxw/b;", "Llt1/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<lt1.b, lt1.a> implements lt1.i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ml0.z undoRestrictionsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lt1.j mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mt1.a setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final lt1.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lt1.a.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<lt1.b, lt1.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<lt1.i.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<lt1.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f120180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f120181b;

        /* JADX INFO: renamed from: lt1.b0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2936a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f120182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f120183b;

            /* JADX INFO: renamed from: lt1.b0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2937a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f120184d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f120185e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f120186f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f120188h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f120189j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f120190k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f120191l;

                public C2937a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f120184d = obj;
                    this.f120185e |= PKIFailureInfo.systemUnavail;
                    return C2936a.this.F(null, this);
                }
            }

            public C2936a(mu.h hVar, b0 b0Var) {
                this.f120182a = hVar;
                this.f120183b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2937a c2937a;
                if (eVar instanceof C2937a) {
                    c2937a = (C2937a) eVar;
                    int i15 = c2937a.f120185e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2937a.f120185e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2937a = new C2937a(eVar);
                    }
                } else {
                    c2937a = new C2937a(eVar);
                }
                Object obj2 = c2937a.f120184d;
                Object objE = uq.b.e();
                int i16 = c2937a.f120185e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f120182a;
                    lt1.i.a aVarB9 = this.f120183b.B9((lt1.b) obj);
                    c2937a.f120186f = vq.j.a(obj);
                    c2937a.f120188h = vq.j.a(c2937a);
                    c2937a.f120189j = vq.j.a(obj);
                    c2937a.f120190k = vq.j.a(hVar);
                    c2937a.f120191l = 0;
                    c2937a.f120185e = 1;
                    if (hVar.F(aVarB9, c2937a) == objE) {
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

        public a(mu.g gVar, b0 b0Var) {
            this.f120180a = gVar;
            this.f120181b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super lt1.i.a> hVar, tq.e eVar) {
            Object objA = this.f120180a.a(new C2936a(hVar, this.f120181b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llt1/a$a;", "<unused var>", "Llt1/b;", "Loq/i0;", "<anonymous>", "(Llt1/a$a;Llt1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<lt1.a.C2932a, lt1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120192e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f120192e;
            if (i15 == 0) {
                oq.u.b(obj);
                b0 b0Var = b0.this;
                lt1.a.c.C2933a c2933a = lt1.a.c.C2933a.f120158a;
                this.f120192e = 1;
                if (b0Var.F(c2933a, this) == objE) {
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
        public final Object w(lt1.a.C2932a c2932a, lt1.b bVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llt1/a$b;", "<unused var>", "Llt1/d;", "Loq/i0;", "<anonymous>", "(Llt1/a$b;Llt1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<lt1.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120194e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f120194e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(lt1.a.C2932a.f120156a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return b0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$d;", "<unused var>", "Lk10/c0;", "Llt1/d;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<lt1.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120197f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cancelling O(k10.c0 c0Var, Error error) {
            return new Cancelling(((Error) c0Var.a()).getDrivingLicence());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f120197f;
            uq.b.e();
            if (this.f120196e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lt1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.d.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar) {
            d dVar2 = new d(eVar);
            dVar2.f120197f = c0Var;
            return dVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$e;", "<unused var>", "Lk10/c0;", "Llt1/b$b$a;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<lt1.a.e, k10.c0<lt1.b.InterfaceC2935b.Initialized>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120199f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cancelling O(k10.c0 c0Var, String str, lt1.b.InterfaceC2935b.Initialized initialized) {
            return new Cancelling(((lt1.b.InterfaceC2935b.Initialized) c0Var.a()).getPhysicalIdCardRestrictions(), str);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            final k10.c0 c0Var = (k10.c0) this.f120199f;
            uq.b.e();
            if (this.f120198e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String documentId = ((lt1.b.InterfaceC2935b.Initialized) c0Var.a()).getPhysicalIdCardRestrictions().getDocumentId();
            return (documentId == null || (lVarD = c0Var.d(new er.l() { // from class: lt1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.e.O(c0Var, documentId, (b.InterfaceC2935b.Initialized) obj2);
                }
            })) == null) ? c0Var.c() : lVarD;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.e eVar, k10.c0<lt1.b.InterfaceC2935b.Initialized> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar2) {
            e eVar3 = new e(eVar2);
            eVar3.f120199f = c0Var;
            return eVar3.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt1/e;", "it", "Loq/i0;", "<anonymous>", "(Llt1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<Cancelling, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120200e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f120200e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(lt1.a.e.f120164a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Cancelling cancelling, tq.e<? super oq.i0> eVar) {
            return ((f) v(cancelling, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$e;", "<unused var>", "Lk10/c0;", "Llt1/e;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<lt1.a.e, k10.c0<Cancelling>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120202e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120203f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Llt1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends lt1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f120205e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f120206f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f120207g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f120208h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f120209j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f120210k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ b0 f120211l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Cancelling> f120212m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<Cancelling> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f120211l = b0Var;
                this.f120212m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(k10.c0 c0Var, b0 b0Var, dx.b bVar, Cancelling cancelling) {
                return new Error(((Cancelling) c0Var.a()).getPhysicalIdCardRestrictions(), ((Cancelling) c0Var.a()).getDocumentId(), b0Var.z9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<Cancelling> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f120210k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.z zVar = this.f120211l.undoRestrictionsUseCase;
                    ml0.z.Params params = new ml0.z.Params(this.f120212m.a().getDocumentId());
                    this.f120210k = 1;
                    obj = zVar.c(params, this);
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
                    c0Var = (k10.c0) this.f120206f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<Cancelling> c0Var2 = this.f120212m;
                final b0 b0Var = this.f120211l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: lt1.e0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.g.a.V(c0Var2, b0Var, bVar, (Cancelling) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                lt1.a.c.Success success = new lt1.a.c.Success(b0Var.mapper.l(c0Var2.a()), b0Var.mapper.i(c0Var2.a()), kt1.c.ID_CARD, null);
                this.f120205e = vq.j.a(iVar);
                this.f120206f = c0Var2;
                this.f120207g = vq.j.a(i0Var);
                this.f120208h = 0;
                this.f120209j = 0;
                this.f120210k = 2;
                if (b0Var.F(success, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f120211l, this.f120212m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends lt1.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f120203f;
            Object objE = uq.b.e();
            int i15 = this.f120202e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f120203f = vq.j.a(c0Var);
            this.f120202e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.e eVar, k10.c0<Cancelling> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar2) {
            g gVar = b0.this.new g(eVar2);
            gVar.f120203f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llt1/a$b;", "<unused var>", "Llt1/f;", "Loq/i0;", "<anonymous>", "(Llt1/a$b;Llt1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<lt1.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120213e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f120213e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(lt1.a.C2932a.f120156a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return b0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$d;", "<unused var>", "Lk10/c0;", "Llt1/f;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<lt1.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120216f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cancelling O(k10.c0 c0Var, Error error) {
            return new Cancelling(error.getPhysicalIdCardRestrictions(), ((Error) c0Var.a()).getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f120216f;
            uq.b.e();
            if (this.f120215e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lt1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.i.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f120216f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$e;", "<unused var>", "Lk10/c0;", "Llt1/b$c$a;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<lt1.a.e, k10.c0<lt1.b.c.Initialized>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120218f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cancelling O(k10.c0 c0Var, String str, lt1.b.c.Initialized initialized) {
            return new Cancelling(((lt1.b.c.Initialized) c0Var.a()).getPassportRestriction(), ((lt1.b.c.Initialized) c0Var.a()).getPassport(), str);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            final k10.c0 c0Var = (k10.c0) this.f120218f;
            uq.b.e();
            if (this.f120217e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String documentId = ((lt1.b.c.Initialized) c0Var.a()).getPassportRestriction().getDocumentId();
            return (documentId == null || (lVarD = c0Var.d(new er.l() { // from class: lt1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.j.O(c0Var, documentId, (b.c.Initialized) obj2);
                }
            })) == null) ? c0Var.c() : lVarD;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.e eVar, k10.c0<lt1.b.c.Initialized> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar2) {
            j jVar = new j(eVar2);
            jVar.f120218f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt1/g;", "it", "Loq/i0;", "<anonymous>", "(Llt1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<Cancelling, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120219e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f120219e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(lt1.a.e.f120164a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Cancelling cancelling, tq.e<? super oq.i0> eVar) {
            return ((k) v(cancelling, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$e;", "<unused var>", "Lk10/c0;", "Llt1/g;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<lt1.a.e, k10.c0<Cancelling>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120222f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Llt1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends lt1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f120224e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f120225f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f120226g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f120227h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f120228j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f120229k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ b0 f120230l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Cancelling> f120231m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<Cancelling> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f120230l = b0Var;
                this.f120231m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(k10.c0 c0Var, b0 b0Var, dx.b bVar, Cancelling cancelling) {
                return new Error(((Cancelling) c0Var.a()).getPassportRestriction(), ((Cancelling) c0Var.a()).getPassport(), ((Cancelling) c0Var.a()).getDocumentId(), b0Var.z9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<Cancelling> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f120229k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.z zVar = this.f120230l.undoRestrictionsUseCase;
                    ml0.z.Params params = new ml0.z.Params(this.f120231m.a().getDocumentId());
                    this.f120229k = 1;
                    obj = zVar.c(params, this);
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
                    c0Var = (k10.c0) this.f120225f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<Cancelling> c0Var2 = this.f120231m;
                final b0 b0Var = this.f120230l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: lt1.h0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.l.a.V(c0Var2, b0Var, bVar, (Cancelling) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                lt1.a.c.Success success = new lt1.a.c.Success(b0Var.mapper.l(c0Var2.a()), b0Var.mapper.i(c0Var2.a()), kt1.c.PASSPORT, c0Var2.a().getPassport());
                this.f120224e = vq.j.a(iVar);
                this.f120225f = c0Var2;
                this.f120226g = vq.j.a(i0Var);
                this.f120227h = 0;
                this.f120228j = 0;
                this.f120229k = 2;
                if (b0Var.F(success, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f120230l, this.f120231m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends lt1.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f120222f;
            Object objE = uq.b.e();
            int i15 = this.f120221e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f120222f = vq.j.a(c0Var);
            this.f120221e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.e eVar, k10.c0<Cancelling> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar2) {
            l lVar = b0.this.new l(eVar2);
            lVar.f120222f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llt1/a$b;", "<unused var>", "Llt1/h;", "Loq/i0;", "<anonymous>", "(Llt1/a$b;Llt1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<lt1.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120232e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f120232e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(lt1.a.C2932a.f120156a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return b0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$d;", "<unused var>", "Lk10/c0;", "Llt1/h;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<lt1.a.d, k10.c0<Error>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120235f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cancelling O(k10.c0 c0Var, Error error) {
            return new Cancelling(((Error) c0Var.a()).getPassportRestriction(), ((Error) c0Var.a()).getPassport(), ((Error) c0Var.a()).getDocumentId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f120235f;
            uq.b.e();
            if (this.f120234e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lt1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.n.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f120235f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$e;", "<unused var>", "Lk10/c0;", "Llt1/b$a$a;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<lt1.a.e, k10.c0<lt1.b.a.Initialized>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120237f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cancelling O(k10.c0 c0Var, lt1.b.a.Initialized initialized) {
            return new Cancelling(((lt1.b.a.Initialized) c0Var.a()).getDrivingLicence());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f120237f;
            uq.b.e();
            if (this.f120236e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: lt1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.o.O(c0Var, (b.a.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.e eVar, k10.c0<lt1.b.a.Initialized> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar2) {
            o oVar = new o(eVar2);
            oVar.f120237f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt1/c;", "it", "Loq/i0;", "<anonymous>", "(Llt1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<Cancelling, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120238e;

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f120238e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(lt1.a.e.f120164a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Cancelling cancelling, tq.e<? super oq.i0> eVar) {
            return ((p) v(cancelling, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new p(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Llt1/a$e;", "<unused var>", "Lk10/c0;", "Llt1/c;", "state", "Lk10/l;", "Llt1/b;", "<anonymous>", "(Llt1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<lt1.a.e, k10.c0<Cancelling>, tq.e<? super k10.l<? extends lt1.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f120241f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Llt1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends lt1.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f120243e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f120244f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f120245g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f120246h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f120247j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f120248k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ b0 f120249l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Cancelling> f120250m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<Cancelling> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f120249l = b0Var;
                this.f120250m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(k10.c0 c0Var, b0 b0Var, dx.b bVar, Cancelling cancelling) {
                return new Error(((Cancelling) c0Var.a()).getDrivingLicence(), b0Var.z9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<Cancelling> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f120248k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.z zVar = this.f120249l.undoRestrictionsUseCase;
                    ml0.z.Params params = new ml0.z.Params(this.f120250m.a().getDrivingLicence().getDocumentId());
                    this.f120248k = 1;
                    obj = zVar.c(params, this);
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
                    c0Var = (k10.c0) this.f120244f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final k10.c0<Cancelling> c0Var2 = this.f120250m;
                final b0 b0Var = this.f120249l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: lt1.k0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.q.a.V(c0Var2, b0Var, bVar, (Cancelling) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                lt1.a.c.Success success = new lt1.a.c.Success(b0Var.mapper.l(c0Var2.a()), b0Var.mapper.i(c0Var2.a()), kt1.c.DRIVING_LICENCE, null);
                this.f120243e = vq.j.a(iVar);
                this.f120244f = c0Var2;
                this.f120245g = vq.j.a(i0Var);
                this.f120246h = 0;
                this.f120247j = 0;
                this.f120248k = 2;
                if (b0Var.F(success, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f120249l, this.f120250m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends lt1.b>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f120241f;
            Object objE = uq.b.e();
            int i15 = this.f120240e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f120241f = vq.j.a(c0Var);
            this.f120240e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(lt1.a.e eVar, k10.c0<Cancelling> c0Var, tq.e<? super k10.l<? extends lt1.b>> eVar2) {
            q qVar = b0.this.new q(eVar2);
            qVar.f120241f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public b0(yy.a aVar, ml0.z zVar, ac4.a aVar2, ib4.c cVar, lt1.j jVar, hb4.d dVar, mt1.a aVar3) {
        lt1.b initialized;
        this.undoRestrictionsUseCase = zVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorHandler = cVar;
        this.mapper = jVar;
        this.errorVMSFactory = dVar;
        this.setupData = aVar3;
        if (aVar3 instanceof mt1.a.IdSetupData) {
            initialized = new lt1.b.InterfaceC2935b.Initialized(((mt1.a.IdSetupData) aVar3).getPhysicalIdCardRestrictions());
        } else if (aVar3 instanceof mt1.a.PassportSetupData) {
            initialized = new lt1.b.c.Initialized(((mt1.a.PassportSetupData) aVar3).getPassportRestriction(), ((mt1.a.PassportSetupData) aVar3).getPassport());
        } else {
            if (!(aVar3 instanceof mt1.a.DrivingLicenceSetupData)) {
                throw new oq.p();
            }
            initialized = new lt1.b.a.Initialized(((mt1.a.DrivingLicenceSetupData) aVar3).getDrivingLicence());
        }
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: lt1.r
            @Override // er.l
            public final Object b(Object obj) {
                return b0.D9(this.f120307a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), B9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(b0 b0Var, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close)) {
            b0Var.d9(lt1.a.b.f120157a);
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            b0Var.d9(lt1.a.d.f120163a);
        } else if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            throw new oq.p();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lt1.i.a B9(lt1.b state) {
        return this.mapper.b(new lt1.j.Params(state, b9(lt1.a.e.f120164a), b9(lt1.a.C2932a.f120156a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(final b0 b0Var, k10.v vVar) {
        vVar.c(q0.c(lt1.b.class), new er.l() { // from class: lt1.p
            @Override // er.l
            public final Object b(Object obj) {
                return b0.E9(this.f120305a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(lt1.b.InterfaceC2935b.Initialized.class), new er.l() { // from class: lt1.s
            @Override // er.l
            public final Object b(Object obj) {
                return b0.F9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Cancelling.class), new er.l() { // from class: lt1.t
            @Override // er.l
            public final Object b(Object obj) {
                return b0.G9(this.f120308a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: lt1.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.H9(this.f120309a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(lt1.b.c.Initialized.class), new er.l() { // from class: lt1.v
            @Override // er.l
            public final Object b(Object obj) {
                return b0.I9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Cancelling.class), new er.l() { // from class: lt1.w
            @Override // er.l
            public final Object b(Object obj) {
                return b0.J9(this.f120310a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: lt1.x
            @Override // er.l
            public final Object b(Object obj) {
                return b0.K9(this.f120311a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(lt1.b.a.Initialized.class), new er.l() { // from class: lt1.y
            @Override // er.l
            public final Object b(Object obj) {
                return b0.L9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Cancelling.class), new er.l() { // from class: lt1.z
            @Override // er.l
            public final Object b(Object obj) {
                return b0.M9(this.f120312a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: lt1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return b0.N9(this.f120165a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(b0 b0Var, k10.z zVar) {
        b bVar = b0Var.new b(null);
        zVar.x(q0.c(lt1.a.C2932a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(k10.z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(lt1.a.e.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(b0 b0Var, k10.z zVar) {
        zVar.C(b0Var.new f(null));
        g gVar = b0Var.new g(null);
        zVar.v(q0.c(lt1.a.e.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(b0 b0Var, k10.z zVar) {
        h hVar = b0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lt1.a.b.class), oVar, hVar);
        zVar.v(q0.c(lt1.a.d.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(q0.c(lt1.a.e.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(b0 b0Var, k10.z zVar) {
        zVar.C(b0Var.new k(null));
        l lVar = b0Var.new l(null);
        zVar.v(q0.c(lt1.a.e.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(b0 b0Var, k10.z zVar) {
        m mVar = b0Var.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lt1.a.b.class), oVar, mVar);
        zVar.v(q0.c(lt1.a.d.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(k10.z zVar) {
        o oVar = new o(null);
        zVar.v(q0.c(lt1.a.e.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(b0 b0Var, k10.z zVar) {
        zVar.C(b0Var.new p(null));
        q qVar = b0Var.new q(null);
        zVar.v(q0.c(lt1.a.e.class), k10.o.CANCEL_PREVIOUS, qVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(b0 b0Var, k10.z zVar) {
        c cVar = b0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lt1.a.b.class), oVar, cVar);
        zVar.v(q0.c(lt1.a.d.class), oVar, new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c z9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorHandler.b(new ib4.c.Params(domainError, false, new er.l() { // from class: lt1.q
            @Override // er.l
            public final Object b(Object obj) {
                return b0.A9(this.f120306a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mt1.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<lt1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<lt1.b, lt1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<lt1.i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(lt1.a.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }
}
