package o42;

import er.l;
import er.p;
import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p024c42.e3;
import p071kotlin.Metadata;
import u42.PaymentResultDestinationData;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lo42/f;", "Ll00/g;", "Lo42/b;", "Lo42/a;", "", "Lyy/a;", "stateMachineFactory", "Lc42/e3;", "paymentsEntryPointData", "<init>", "(Lyy/a;Lc42/e3;)V", "b", "Lc42/e3;", "Lxw/b;", "Lo42/a$a;", "c", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lo42/c;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends l00.g<o42.b, o42.a> implements l00.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e3 paymentsEntryPointData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<o42.b, o42.a> stateMachine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.b<o42.a.InterfaceC3518a> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<o42.c> state = a9(new a(e9().getState()), o42.c.f142336a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<o42.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f142343a;

        /* JADX INFO: renamed from: o42.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3520a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f142344a;

            /* JADX INFO: renamed from: o42.f$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3521a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f142345d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f142346e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f142347f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f142349h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f142350j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f142351k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f142352l;

                public C3521a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f142345d = obj;
                    this.f142346e |= PKIFailureInfo.systemUnavail;
                    return C3520a.this.F(null, this);
                }
            }

            public C3520a(mu.h hVar) {
                this.f142344a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3521a c3521a;
                if (eVar instanceof C3521a) {
                    c3521a = (C3521a) eVar;
                    int i15 = c3521a.f142346e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3521a.f142346e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3521a = new C3521a(eVar);
                    }
                } else {
                    c3521a = new C3521a(eVar);
                }
                Object obj2 = c3521a.f142345d;
                Object objE = uq.b.e();
                int i16 = c3521a.f142346e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f142344a;
                    o42.c cVar = o42.c.f142336a;
                    c3521a.f142347f = j.a(obj);
                    c3521a.f142349h = j.a(c3521a);
                    c3521a.f142350j = j.a(obj);
                    c3521a.f142351k = j.a(hVar);
                    c3521a.f142352l = 0;
                    c3521a.f142346e = 1;
                    if (hVar.F(cVar, c3521a) == objE) {
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

        public a(mu.g gVar) {
            this.f142343a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o42.c> hVar, tq.e eVar) {
            Object objA = this.f142343a.a(new C3520a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo42/b;", "it", "Loq/i0;", "<anonymous>", "(Lo42/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<o42.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142353e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f142353e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            e3 e3Var = f.this.paymentsEntryPointData;
            if (e3Var instanceof e3.Details) {
                f.this.d9(new o42.a.ToPaymentDetails(((e3.Details) f.this.paymentsEntryPointData).getPaymentId()));
            } else {
                if (!fr.t.c(e3Var, e3.b.f23168a) && !fr.t.c(e3Var, e3.c.f23169a)) {
                    throw new oq.p();
                }
                f.this.d9(o42.a.c.f142334a);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(o42.b bVar, tq.e<? super i0> eVar) {
            return ((b) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return f.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo42/a$b;", "action", "Lo42/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo42/a$b;Lo42/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements q<o42.a.ToPaymentDetails, o42.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142356f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o42.a.ToPaymentDetails toPaymentDetails = (o42.a.ToPaymentDetails) this.f142356f;
            Object objE = uq.b.e();
            int i15 = this.f142355e;
            if (i15 == 0) {
                u.b(obj);
                f fVar = f.this;
                o42.a.InterfaceC3518a.ToPaymentDetails toPaymentDetails2 = new o42.a.InterfaceC3518a.ToPaymentDetails(new PaymentResultDestinationData(toPaymentDetails.getPaymentId(), false));
                this.f142356f = j.a(toPaymentDetails);
                this.f142355e = 1;
                if (fVar.F(toPaymentDetails2, this) == objE) {
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
        public final Object w(o42.a.ToPaymentDetails toPaymentDetails, o42.b bVar, tq.e<? super i0> eVar) {
            c cVar = f.this.new c(eVar);
            cVar.f142356f = toPaymentDetails;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo42/a$c;", "<unused var>", "Lo42/b;", "Loq/i0;", "<anonymous>", "(Lo42/a$c;Lo42/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements q<o42.a.c, o42.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142358e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f142358e;
            if (i15 == 0) {
                u.b(obj);
                f fVar = f.this;
                o42.a.InterfaceC3518a.b bVar = o42.a.InterfaceC3518a.b.f142332a;
                this.f142358e = 1;
                if (fVar.F(bVar, this) == objE) {
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
        public final Object w(o42.a.c cVar, o42.b bVar, tq.e<? super i0> eVar) {
            return f.this.new d(eVar).J(i0.f148189a);
        }
    }

    public f(yy.a aVar, e3 e3Var) {
        this.paymentsEntryPointData = e3Var;
        this.stateMachine = aVar.a(o42.b.f142335a, new l() { // from class: o42.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.m9(this.f142337a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final f fVar, v vVar) {
        vVar.c(q0.c(o42.b.class), new l() { // from class: o42.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.n9(this.f142338a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(f fVar, z zVar) {
        zVar.C(fVar.new b(null));
        c cVar = fVar.new c(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o42.a.ToPaymentDetails.class), oVar, cVar);
        zVar.x(q0.c(o42.a.c.class), oVar, fVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<o42.a.InterfaceC3518a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<o42.b, o42.a> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(o42.a.InterfaceC3518a interfaceC3518a, tq.e<? super i0> eVar) {
        return super.F(interfaceC3518a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(e3 e3Var) {
        super.P5(e3Var);
    }
}
