package qo3;

import co3.QrCodeData;
import co3.SummaryData;
import fr.q0;
import go3.g0;
import go3.l0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J\u001e\u0010%\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0082@¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020'2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010F\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lqo3/r;", "Ll00/g;", "Lqo3/b;", "Lqo3/a;", "Lqo3/c;", "", "Lyy/a;", "stateMachineFactory", "Lgo3/g0;", "loadWebDataUseCase", "Lgo3/l0;", "sendDataToWebUseCase", "Lib4/c;", "domainErrorMapper", "Lro3/a;", "webScreenMapper", "Lco3/e;", "qrCodeData", "<init>", "(Lyy/a;Lgo3/g0;Lgo3/l0;Lib4/c;Lro3/a;Lco3/e;)V", "Lk10/c0;", "Lqo3/b$c;", "state", "Lk10/l;", "Lqo3/b$b;", "A9", "(Lco3/e;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "D9", "(Lqo3/b$b;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "v9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "", "Lco3/q;", "list", "z9", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lco3/o;", "C9", "(Ljava/util/List;)Lco3/o;", "b", "Lgo3/g0;", "c", "Lgo3/l0;", "d", "Lib4/c;", "e", "Lro3/a;", "f", "Lco3/e;", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lqo3/c$a;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lqo3/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<qo3.b, qo3.a> implements qo3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 loadWebDataUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l0 sendDataToWebUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ro3.a webScreenMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final QrCodeData qrCodeData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<qo3.b, qo3.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<qo3.c.a> state = a9(new c(e9().getState(), this), qo3.c.a.C4230a.f167733a);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qo3.a.c> navAction = new xw.b<>();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f167767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f167768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f167769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f167770g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f167771h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f167772j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f167773k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f167775m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f167773k = obj;
            this.f167775m |= PKIFailureInfo.systemUnavail;
            return r.this.A9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f167776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f167777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f167778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f167779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f167780h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f167781j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f167783l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f167781j = obj;
            this.f167783l |= PKIFailureInfo.systemUnavail;
            return r.this.D9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<qo3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f167784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f167785b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f167786a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f167787b;

            /* JADX INFO: renamed from: qo3.r$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4231a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f167788d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f167789e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f167790f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f167792h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f167793j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f167794k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f167795l;

                public C4231a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f167788d = obj;
                    this.f167789e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f167786a = hVar;
                this.f167787b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4231a c4231a;
                if (eVar instanceof C4231a) {
                    c4231a = (C4231a) eVar;
                    int i15 = c4231a.f167789e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4231a.f167789e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4231a = new C4231a(eVar);
                    }
                } else {
                    c4231a = new C4231a(eVar);
                }
                Object obj2 = c4231a.f167788d;
                Object objE = uq.b.e();
                int i16 = c4231a.f167789e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f167786a;
                    qo3.c.a aVarB = this.f167787b.webScreenMapper.b(new ro3.a.Params((qo3.b) obj, this.f167787b.b9(qo3.a.C4226a.f167715a), this.f167787b.b9(qo3.a.f.f167723a)));
                    c4231a.f167790f = vq.j.a(obj);
                    c4231a.f167792h = vq.j.a(c4231a);
                    c4231a.f167793j = vq.j.a(obj);
                    c4231a.f167794k = vq.j.a(hVar);
                    c4231a.f167795l = 0;
                    c4231a.f167789e = 1;
                    if (hVar.F(aVarB, c4231a) == objE) {
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

        public c(mu.g gVar, r rVar) {
            this.f167784a = gVar;
            this.f167785b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qo3.c.a> hVar, tq.e eVar) {
            Object objA = this.f167784a.a(new a(hVar, this.f167785b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqo3/a$b;", "<unused var>", "Lqo3/b;", "Loq/i0;", "<anonymous>", "(Lqo3/a$b;Lqo3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<qo3.a.b, qo3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167796e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167796e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qo3.a.c> bVarY1 = r.this.Y1();
                qo3.a.c.b bVar = qo3.a.c.b.f167718a;
                this.f167796e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(qo3.a.b bVar, qo3.b bVar2, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqo3/a$a;", "<unused var>", "Lqo3/b;", "Loq/i0;", "<anonymous>", "(Lqo3/a$a;Lqo3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qo3.a.C4226a, qo3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167798e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167798e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qo3.a.c> bVarY1 = r.this.Y1();
                qo3.a.c.C4227a c4227a = qo3.a.c.C4227a.f167717a;
                this.f167798e = 1;
                if (bVarY1.F(c4227a, this) == objE) {
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
        public final Object w(qo3.a.C4226a c4226a, qo3.b bVar, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqo3/b$a;", "state", "Lk10/l;", "Lqo3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<qo3.b.a>, tq.e<? super k10.l<? extends qo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167801f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qo3.b.Loading O(r rVar, qo3.b.a aVar) {
            return new qo3.b.Loading(rVar.qrCodeData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f167801f;
            uq.b.e();
            if (this.f167800e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final r rVar = r.this;
            return c0Var.d(new er.l() { // from class: qo3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O(rVar, (b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<qo3.b.a> c0Var, tq.e<? super k10.l<? extends qo3.b>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f167801f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqo3/b$c;", "state", "Lk10/l;", "Lqo3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<c0<qo3.b.Loading>, tq.e<? super k10.l<? extends qo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167804f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f167804f;
            Object objE = uq.b.e();
            int i15 = this.f167803e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            r rVar = r.this;
            QrCodeData qrCodeData = ((qo3.b.Loading) c0Var.a()).getQrCodeData();
            this.f167804f = vq.j.a(c0Var);
            this.f167803e = 1;
            Object objA9 = rVar.A9(qrCodeData, c0Var, this);
            return objA9 == objE ? objE : objA9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<qo3.b.Loading> c0Var, tq.e<? super k10.l<? extends qo3.b>> eVar) {
            return ((g) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f167804f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqo3/a$e;", "<unused var>", "Lk10/c0;", "Lqo3/b$c;", "state", "Lk10/l;", "Lqo3/b;", "<anonymous>", "(Lqo3/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<qo3.a.e, c0<qo3.b.Loading>, tq.e<? super k10.l<? extends qo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167807f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f167807f;
            Object objE = uq.b.e();
            int i15 = this.f167806e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            r rVar = r.this;
            QrCodeData qrCodeData = ((qo3.b.Loading) c0Var.a()).getQrCodeData();
            this.f167807f = vq.j.a(c0Var);
            this.f167806e = 1;
            Object objA9 = rVar.A9(qrCodeData, c0Var, this);
            return objA9 == objE ? objE : objA9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qo3.a.e eVar, c0<qo3.b.Loading> c0Var, tq.e<? super k10.l<? extends qo3.b>> eVar2) {
            h hVar = r.this.new h(eVar2);
            hVar.f167807f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqo3/a$f;", "<unused var>", "Lqo3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lqo3/a$f;Lqo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qo3.a.f, qo3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167810f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qo3.b.Initialized initialized = (qo3.b.Initialized) this.f167810f;
            Object objE = uq.b.e();
            int i15 = this.f167809e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                this.f167810f = vq.j.a(initialized);
                this.f167809e = 1;
                if (rVar.D9(initialized, this) == objE) {
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
        public final Object w(qo3.a.f fVar, qo3.b.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f167810f = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqo3/a$e;", "<unused var>", "Lqo3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lqo3/a$e;Lqo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<qo3.a.e, qo3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167813f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qo3.b.Initialized initialized = (qo3.b.Initialized) this.f167813f;
            Object objE = uq.b.e();
            int i15 = this.f167812e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                this.f167813f = vq.j.a(initialized);
                this.f167812e = 1;
                if (rVar.D9(initialized, this) == objE) {
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
        public final Object w(qo3.a.e eVar, qo3.b.Initialized initialized, tq.e<? super i0> eVar2) {
            j jVar = r.this.new j(eVar2);
            jVar.f167813f = initialized;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqo3/a$d;", "<unused var>", "Lqo3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lqo3/a$d;Lqo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<qo3.a.d, qo3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167816f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qo3.b.Initialized initialized = (qo3.b.Initialized) this.f167816f;
            Object objE = uq.b.e();
            int i15 = this.f167815e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                List<co3.q> listB = initialized.b();
                this.f167816f = vq.j.a(initialized);
                this.f167815e = 1;
                if (rVar.z9(listB, this) == objE) {
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
        public final Object w(qo3.a.d dVar, qo3.b.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = r.this.new k(eVar);
            kVar.f167816f = initialized;
            return kVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, g0 g0Var, l0 l0Var, ib4.c cVar, ro3.a aVar2, QrCodeData qrCodeData) {
        this.loadWebDataUseCase = g0Var;
        this.sendDataToWebUseCase = l0Var;
        this.domainErrorMapper = cVar;
        this.webScreenMapper = aVar2;
        this.qrCodeData = qrCodeData;
        this.stateMachine = aVar.a(qo3.b.a.f167724a, new er.l() { // from class: qo3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.F9(this.f167758a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A9(final QrCodeData qrCodeData, c0<qo3.b.Loading> c0Var, tq.e<? super k10.l<qo3.b.Initialized>> eVar) throws Throwable {
        a aVar;
        c0<qo3.b.Loading> c0Var2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f167775m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f167775m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objJ = aVar.f167773k;
        Object objE = uq.b.e();
        int i16 = aVar.f167775m;
        if (i16 == 0) {
            oq.u.b(objJ);
            g0 g0Var = this.loadWebDataUseCase;
            g0.Params params = new g0.Params(qrCodeData);
            aVar.f167767d = qrCodeData;
            aVar.f167768e = c0Var;
            aVar.f167775m = 1;
            objJ = g0Var.j(params, aVar);
            if (objJ != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            c0Var = (c0) aVar.f167768e;
            qrCodeData = (QrCodeData) aVar.f167767d;
            oq.u.b(objJ);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var2 = (c0) aVar.f167768e;
            oq.u.b(objJ);
        }
        return c0Var2.c();
        dx.i iVar = (dx.i) objJ;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final g0.Result result = (g0.Result) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: qo3.p
                @Override // er.l
                public final Object b(Object obj) {
                    return r.B9(qrCodeData, result, (b.Loading) obj);
                }
            });
        }
        dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
        aVar.f167767d = vq.j.a(qrCodeData);
        aVar.f167768e = c0Var;
        aVar.f167769f = vq.j.a(iVar);
        aVar.f167770g = vq.j.a(bVar);
        aVar.f167771h = 0;
        aVar.f167772j = 0;
        aVar.f167775m = 2;
        if (v9(bVar, aVar) != objE) {
            c0Var2 = c0Var;
            return c0Var2.c();
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qo3.b.Initialized B9(QrCodeData qrCodeData, g0.Result result, qo3.b.Loading loading) {
        return new qo3.b.Initialized(qrCodeData.getSecurityToken(), result.getEncodedCertificate(), result.d(), result.getDocument(), result.c(), result.getSubDocument(), qrCodeData);
    }

    private final SummaryData C9(List<? extends co3.q> list) {
        return new SummaryData(SummaryData.a.c.f28537a, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (v9(r2, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D9(qo3.b.Initialized r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo3.r.D9(qo3.b$b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(qo3.b.class), new er.l() { // from class: qo3.i
            @Override // er.l
            public final Object b(Object obj) {
                return r.G9(this.f167749a, (z) obj);
            }
        });
        vVar.c(q0.c(qo3.b.a.class), new er.l() { // from class: qo3.j
            @Override // er.l
            public final Object b(Object obj) {
                return r.H9(this.f167750a, (z) obj);
            }
        });
        vVar.c(q0.c(qo3.b.Loading.class), new er.l() { // from class: qo3.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.I9(this.f167751a, (z) obj);
            }
        });
        vVar.c(q0.c(qo3.b.Initialized.class), new er.l() { // from class: qo3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.J9(this.f167752a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(r rVar, z zVar) {
        d dVar = rVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qo3.a.b.class), oVar, dVar);
        zVar.x(q0.c(qo3.a.C4226a.class), oVar, rVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(r rVar, z zVar) {
        zVar.A(rVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(r rVar, z zVar) {
        zVar.A(rVar.new g(null));
        h hVar = rVar.new h(null);
        zVar.v(q0.c(qo3.a.e.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(r rVar, z zVar) {
        i iVar = rVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qo3.a.f.class), oVar, iVar);
        zVar.x(q0.c(qo3.a.e.class), oVar, rVar.new j(null));
        zVar.x(q0.c(qo3.a.d.class), oVar, rVar.new k(null));
        return i0.f148189a;
    }

    private final Object v9(dx.b bVar, tq.e<? super i0> eVar) {
        ib4.c.Params params;
        ib4.c.Params params2 = new ib4.c.Params(bVar, false, new er.l() { // from class: qo3.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f167753a, (ib4.c.b) obj);
            }
        }, 2, null);
        if (bVar instanceof dx.b.Business) {
            dx.b.Business.a type = ((dx.b.Business) bVar).getType();
            if (type == co3.a.EXPIRED_QR) {
                params = new ib4.c.Params(bVar, false, new er.l() { // from class: qo3.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.x9(this.f167754a, (ib4.c.b) obj);
                    }
                }, 2, null);
            } else if (type == co3.a.INVALID_SCOPE) {
                params = new ib4.c.Params(bVar, false, new er.l() { // from class: qo3.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.y9(this.f167755a, (ib4.c.b) obj);
                    }
                }, 2, null);
            }
            params2 = params;
        }
        Object objF = Y1().F(new qo3.a.c.Error(this.domainErrorMapper.b(params2)), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            rVar.d9(qo3.a.e.f167722a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            rVar.d9(qo3.a.b.f167716a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary)) {
            rVar.d9(qo3.a.b.f167716a);
        } else if (bVar instanceof ib4.c.b.a.Primary) {
            rVar.d9(qo3.a.C4226a.f167715a);
        } else if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            throw new oq.p();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, ib4.c.b bVar) {
        if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            throw new oq.p();
        }
        rVar.d9(qo3.a.b.f167716a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z9(List<? extends co3.q> list, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new qo3.a.c.NavigateToWebSummary(C9(list)), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(QrCodeData qrCodeData) {
        super.P5(qrCodeData);
    }

    @Override // zx.b
    public xw.b<qo3.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<qo3.b, qo3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qo3.c.a> getState() {
        return this.state;
    }
}
