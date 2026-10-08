package d91;

import cl0.z;
import fr.q0;
import iy.b0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Ld91/p;", "Ll00/g;", "Ld91/c;", "Ld91/a;", "Ld91/d;", "", "Lyy/a;", "stateMachineFactory", "Le91/a;", "mapper", "Lol0/i;", "getPaymentStatus", "Ll61/f;", "afterOnlinePaymentWithTokenUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericErrorMapper", "Ld91/b;", "setupData", "<init>", "(Lyy/a;Le91/a;Lol0/i;Ll61/f;Lhb4/d;Lib4/c;Ld91/b;)V", "state", "Ld91/d$a;", "x9", "(Ld91/c;)Ld91/d$a;", "Ldx/b;", "domainError", "Lhb4/c;", "v9", "(Ldx/b;)Lhb4/c;", "b", "Le91/a;", "c", "Lol0/i;", "d", "Ll61/f;", "e", "Lhb4/d;", "f", "Lib4/c;", "g", "Ld91/b;", "Ld91/c$b;", "h", "Ld91/c$b;", "initialState", "Lxw/b;", "Ld91/a$e;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<d91.c, d91.a> implements d91.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e91.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ol0.i getPaymentStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l61.f afterOnlinePaymentWithTokenUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d91.c.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d91.a.e> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<d91.c, d91.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<d91.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d91.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f40447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f40448b;

        /* JADX INFO: renamed from: d91.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0888a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f40449a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f40450b;

            /* JADX INFO: renamed from: d91.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0889a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f40451d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f40452e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f40453f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f40455h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f40456j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f40457k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f40458l;

                public C0889a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f40451d = obj;
                    this.f40452e |= PKIFailureInfo.systemUnavail;
                    return C0888a.this.F(null, this);
                }
            }

            public C0888a(mu.h hVar, p pVar) {
                this.f40449a = hVar;
                this.f40450b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0889a c0889a;
                if (eVar instanceof C0889a) {
                    c0889a = (C0889a) eVar;
                    int i15 = c0889a.f40452e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0889a.f40452e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0889a = new C0889a(eVar);
                    }
                } else {
                    c0889a = new C0889a(eVar);
                }
                Object obj2 = c0889a.f40451d;
                Object objE = uq.b.e();
                int i16 = c0889a.f40452e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f40449a;
                    d91.d.a aVarX9 = this.f40450b.x9((d91.c) obj);
                    c0889a.f40453f = vq.j.a(obj);
                    c0889a.f40455h = vq.j.a(c0889a);
                    c0889a.f40456j = vq.j.a(obj);
                    c0889a.f40457k = vq.j.a(hVar);
                    c0889a.f40458l = 0;
                    c0889a.f40452e = 1;
                    if (hVar.F(aVarX9, c0889a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f40447a = gVar;
            this.f40448b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d91.d.a> hVar, tq.e eVar) {
            Object objA = this.f40447a.a(new C0888a(hVar, this.f40448b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ld91/a$d;", "<unused var>", "Lk10/c0;", "Ld91/c;", "state", "Lk10/l;", "<anonymous>", "(Ld91/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<d91.a.d, c0<d91.c>, tq.e<? super k10.l<? extends d91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40460f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d91.c.C0886c O(d91.c cVar) {
            return d91.c.C0886c.f40418a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f40460f;
            uq.b.e();
            if (this.f40459e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d91.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.b.O((c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d91.a.d dVar, c0<d91.c> c0Var, tq.e<? super k10.l<? extends d91.c>> eVar) {
            b bVar = new b(eVar);
            bVar.f40460f = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ld91/a$b;", "action", "Lk10/c0;", "Ld91/c;", "state", "Lk10/l;", "<anonymous>", "(Ld91/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<d91.a.Error, c0<d91.c>, tq.e<? super k10.l<? extends d91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40462f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f40463g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d91.c.Error O(p pVar, d91.a.Error error, d91.c cVar) {
            return new d91.c.Error(pVar.v9(error.getDomainError()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final d91.a.Error error = (d91.a.Error) this.f40462f;
            c0 c0Var = (c0) this.f40463g;
            uq.b.e();
            if (this.f40461e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.d(new er.l() { // from class: d91.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(pVar, error, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d91.a.Error error, c0<d91.c> c0Var, tq.e<? super k10.l<? extends d91.c>> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f40462f = error;
            cVar.f40463g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld91/a$a;", "<unused var>", "Ld91/c;", "Loq/i0;", "<anonymous>", "(Ld91/a$a;Ld91/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<d91.a.C0884a, d91.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40465e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40465e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                d91.a.e.C0885a c0885a = d91.a.e.C0885a.f40409a;
                this.f40465e = 1;
                if (pVar.F(c0885a, this) == objE) {
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
        public final Object w(d91.a.C0884a c0884a, d91.c cVar, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ld91/a$h;", "<unused var>", "Lk10/c0;", "Ld91/c;", "state", "Lk10/l;", "<anonymous>", "(Ld91/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<d91.a.h, c0<d91.c>, tq.e<? super k10.l<? extends d91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40468f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d91.c.d O(d91.c cVar) {
            return d91.c.d.f40419a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f40468f;
            uq.b.e();
            if (this.f40467e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d91.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O((c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d91.a.h hVar, c0<d91.c> c0Var, tq.e<? super k10.l<? extends d91.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f40468f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld91/a$g;", "<unused var>", "Ld91/c;", "Loq/i0;", "<anonymous>", "(Ld91/a$g;Ld91/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<d91.a.g, d91.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40469e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40469e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                d91.a.e.c cVar = d91.a.e.c.f40411a;
                this.f40469e = 1;
                if (pVar.F(cVar, this) == objE) {
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
        public final Object w(d91.a.g gVar, d91.c cVar, tq.e<? super i0> eVar) {
            return p.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld91/c$b;", "it", "Loq/i0;", "<anonymous>", "(Ld91/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<d91.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40471e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f40471e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(d91.a.c.f40407a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(d91.c.b bVar, tq.e<? super i0> eVar) {
            return ((g) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld91/a$c;", "<unused var>", "Ld91/c$b;", "Loq/i0;", "<anonymous>", "(Ld91/a$c;Ld91/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<d91.a.c, d91.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f40473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f40474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f40475g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f40476h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f40477j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f40478k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f40479l;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40481a;

            static {
                int[] iArr = new int[z.values().length];
                try {
                    iArr[z.PAYMENT_NOT_STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[z.PAYMENT_ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[z.PAYMENT_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[z.SUBMIT_IN_PROGRESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[z.SUBMITTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f40481a = iArr;
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
        
            if (r8.F(r5, r19) == r1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01ae, code lost:
        
            if (r8.F(r3, r19) == r1) goto L48;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d91.p.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d91.a.c cVar, d91.c.b bVar, tq.e<? super i0> eVar) {
            return p.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld91/c$d;", "it", "Loq/i0;", "<anonymous>", "(Ld91/c$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<d91.c.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f40482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f40483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f40484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f40485h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f40486j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f40487k;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0076  */
        /* JADX WARN: Code duplicated, block: B:20:0x0082  */
        /* JADX WARN: Code duplicated, block: B:21:0x0091  */
        /* JADX WARN: Code duplicated, block: B:23:0x0099  */
        /* JADX WARN: Code duplicated, block: B:24:0x009f  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
        
            if (r3.F(r5, r6) == r0) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d91.p.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(d91.c.d dVar, tq.e<? super i0> eVar) {
            return ((i) v(dVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld91/a$c;", "<unused var>", "Lk10/c0;", "Ld91/c$a;", "state", "Lk10/l;", "Ld91/c;", "<anonymous>", "(Ld91/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<d91.a.c, c0<d91.c.Error>, tq.e<? super k10.l<? extends d91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40490f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d91.c.b O(d91.c.Error error) {
            return d91.c.b.f40417a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f40490f;
            uq.b.e();
            if (this.f40489e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d91.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.j.O((c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d91.a.c cVar, c0<d91.c.Error> c0Var, tq.e<? super k10.l<? extends d91.c>> eVar) {
            j jVar = new j(eVar);
            jVar.f40490f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld91/c$c;", "it", "Loq/i0;", "<anonymous>", "(Ld91/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<d91.c.C0886c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40491e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar, b0 b0Var) {
            pVar.d9(d91.a.f.f40412a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40491e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                final p pVar2 = p.this;
                d91.a.e.ToEdorAuth toEdorAuth = new d91.a.e.ToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: d91.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.k.O(pVar2, (b0) obj2);
                    }
                }, null, 2, null));
                this.f40491e = 1;
                if (pVar.F(toEdorAuth, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(d91.c.C0886c c0886c, tq.e<? super i0> eVar) {
            return ((k) v(c0886c, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld91/a$f;", "<unused var>", "Lk10/c0;", "Ld91/c$c;", "state", "Lk10/l;", "Ld91/c;", "<anonymous>", "(Ld91/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<d91.a.f, c0<d91.c.C0886c>, tq.e<? super k10.l<? extends d91.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f40494f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d91.c.d O(d91.c.C0886c c0886c) {
            return d91.c.d.f40419a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f40494f;
            uq.b.e();
            if (this.f40493e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d91.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.l.O((c.C0886c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d91.a.f fVar, c0<d91.c.C0886c> c0Var, tq.e<? super k10.l<? extends d91.c>> eVar) {
            l lVar = new l(eVar);
            lVar.f40494f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, e91.a aVar2, ol0.i iVar, l61.f fVar, hb4.d dVar, ib4.c cVar, SetupData setupData) {
        this.mapper = aVar2;
        this.getPaymentStatus = iVar;
        this.afterOnlinePaymentWithTokenUC = fVar;
        this.errorVMSFactory = dVar;
        this.genericErrorMapper = cVar;
        this.setupData = setupData;
        d91.c.b bVar = d91.c.b.f40417a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: d91.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f40436a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), x9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, k10.z zVar) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(d91.a.d.class), oVar, bVar);
        zVar.v(q0.c(d91.a.Error.class), oVar, pVar.new c(null));
        zVar.x(q0.c(d91.a.C0884a.class), oVar, pVar.new d(null));
        zVar.v(q0.c(d91.a.h.class), oVar, new e(null));
        zVar.x(q0.c(d91.a.g.class), oVar, pVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(p pVar, k10.z zVar) {
        zVar.C(pVar.new g(null));
        h hVar = pVar.new h(null);
        zVar.x(q0.c(d91.a.c.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, k10.z zVar) {
        zVar.C(pVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(q0.c(d91.a.c.class), k10.o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(p pVar, k10.z zVar) {
        zVar.C(pVar.new k(null));
        l lVar = new l(null);
        zVar.v(q0.c(d91.a.f.class), k10.o.CANCEL_PREVIOUS, lVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c v9(dx.b domainError) {
        hb4.d dVar = this.errorVMSFactory;
        ib4.c cVar = this.genericErrorMapper;
        String strM5 = this.setupData.getContract().m5();
        return dVar.a(cVar.b(new ib4.c.Params(domainError, !(strM5 == null || fu.r.t0(strM5)), new er.l() { // from class: d91.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f40435a, (ib4.c.b) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
            pVar.d9(d91.a.g.f40413a);
        } else if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            pVar.d9(d91.a.c.f40407a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            String strM5 = pVar.setupData.getContract().m5();
            if (strM5 == null || fu.r.t0(strM5)) {
                pVar.d9(d91.a.g.f40413a);
            } else {
                pVar.d9(d91.a.C0884a.f40405a);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d91.d.a x9(d91.c state) {
        return this.mapper.b(new e91.a.Params(state, b9(d91.a.C0884a.f40405a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(d91.c.class), new er.l() { // from class: d91.i
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f40431a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(d91.c.b.class), new er.l() { // from class: d91.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f40432a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(d91.c.d.class), new er.l() { // from class: d91.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f40433a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(d91.c.Error.class), new er.l() { // from class: d91.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.D9((k10.z) obj);
            }
        });
        vVar.c(q0.c(d91.c.C0886c.class), new er.l() { // from class: d91.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.E9(this.f40434a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d91.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<d91.c, d91.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d91.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(d91.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
