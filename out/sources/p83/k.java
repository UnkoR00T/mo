package p83;

import a14.w;
import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lp83/k;", "Ll00/g;", "Lp83/b;", "Lp83/a;", "Lp83/c;", "", "Lyy/a;", "stateMachineFactory", "Lu04/a;", "commonEndpoints", "Lq83/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "La14/g;", "dialIntentUseCase", "Lib4/c;", "errorMapper", "<init>", "(Lyy/a;Lu04/a;Lq83/a;La14/w;La14/g;Lib4/c;)V", "Lp83/c$a;", "p9", "()Lp83/c$a;", "b", "Lu04/a;", "c", "Lq83/a;", "d", "La14/w;", "e", "La14/g;", "f", "Lib4/c;", "Lxw/b;", "Lp83/a$d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<p83.b, p83.a> implements p83.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q83.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.g dialIntentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<p83.b, p83.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p83.a.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<p83.c.Data> state = a9(new a(e9().getState(), this), p9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<p83.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f153497b;

        /* JADX INFO: renamed from: p83.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3790a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f153499b;

            /* JADX INFO: renamed from: p83.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3791a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153500d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153501e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153502f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153504h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153505j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153506k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153507l;

                public C3791a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153500d = obj;
                    this.f153501e |= PKIFailureInfo.systemUnavail;
                    return C3790a.this.F(null, this);
                }
            }

            public C3790a(mu.h hVar, k kVar) {
                this.f153498a = hVar;
                this.f153499b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3791a c3791a;
                if (eVar instanceof C3791a) {
                    c3791a = (C3791a) eVar;
                    int i15 = c3791a.f153501e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3791a.f153501e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3791a = new C3791a(eVar);
                    }
                } else {
                    c3791a = new C3791a(eVar);
                }
                Object obj2 = c3791a.f153500d;
                Object objE = uq.b.e();
                int i16 = c3791a.f153501e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f153498a;
                    p83.c.Data dataP9 = this.f153499b.p9();
                    c3791a.f153502f = vq.j.a(obj);
                    c3791a.f153504h = vq.j.a(c3791a);
                    c3791a.f153505j = vq.j.a(obj);
                    c3791a.f153506k = vq.j.a(hVar);
                    c3791a.f153507l = 0;
                    c3791a.f153501e = 1;
                    if (hVar.F(dataP9, c3791a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f153496a = gVar;
            this.f153497b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p83.c.Data> hVar, tq.e eVar) {
            Object objA = this.f153496a.a(new C3790a(hVar, this.f153497b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp83/a$a;", "<unused var>", "Lp83/b;", "Loq/i0;", "<anonymous>", "(Lp83/a$a;Lp83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<p83.a.C3788a, p83.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153508e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153508e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                p83.a.d.C3789a c3789a = p83.a.d.C3789a.f153468a;
                this.f153508e = 1;
                if (kVar.F(c3789a, this) == objE) {
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
        public final Object w(p83.a.C3788a c3788a, p83.b bVar, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp83/a$c;", "<unused var>", "Lp83/b;", "Loq/i0;", "<anonymous>", "(Lp83/a$c;Lp83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<p83.a.c, p83.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153510e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153510e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                p83.a.d.b bVar = p83.a.d.b.f153469a;
                this.f153510e = 1;
                if (kVar.F(bVar, this) == objE) {
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
        public final Object w(p83.a.c cVar, p83.b bVar, tq.e<? super i0> eVar) {
            return k.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp83/a$e;", "action", "Lp83/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp83/a$e;Lp83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<p83.a.OnError, p83.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153513f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(ib4.c.b bVar) {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p83.a.OnError onError = (p83.a.OnError) this.f153513f;
            Object objE = uq.b.e();
            int i15 = this.f153512e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                p83.a.d.OnError onError2 = new p83.a.d.OnError(k.this.errorMapper.b(new ib4.c.Params(onError.getDomainError(), false, new er.l() { // from class: p83.l
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return k.d.O((ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f153513f = vq.j.a(onError);
                this.f153512e = 1;
                if (kVar.F(onError2, this) == objE) {
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
        public final Object w(p83.a.OnError onError, p83.b bVar, tq.e<? super i0> eVar) {
            d dVar = k.this.new d(eVar);
            dVar.f153513f = onError;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp83/a$b;", "<unused var>", "Lp83/b;", "Loq/i0;", "<anonymous>", "(Lp83/a$b;Lp83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<p83.a.b, p83.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153515e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153515e;
            if (i15 == 0) {
                u.b(obj);
                a14.g gVar = k.this.dialIntentUseCase;
                a14.g.Params params = new a14.g.Params("+48 42 253 54 74");
                this.f153515e = 1;
                obj = gVar.c(params, this);
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
            k kVar = k.this;
            if (iVar instanceof dx.i.Left) {
                kVar.d9(new p83.a.OnError((dx.b.Business) ((dx.i.Left) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p83.a.b bVar, p83.b bVar2, tq.e<? super i0> eVar) {
            return k.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp83/a$f;", "<unused var>", "Lp83/b;", "Loq/i0;", "<anonymous>", "(Lp83/a$f;Lp83/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<p83.a.f, p83.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153517e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f153517e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = k.this.openUrlIntentUseCase;
                w.Params params = new w.Params(k.this.commonEndpoints.s0(), false, 2, null);
                this.f153517e = 1;
                obj = wVar.c(params, this);
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
            k kVar = k.this;
            if (iVar instanceof dx.i.Left) {
                kVar.d9(new p83.a.OnError((dx.b.Business) ((dx.i.Left) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p83.a.f fVar, p83.b bVar, tq.e<? super i0> eVar) {
            return k.this.new f(eVar).J(i0.f148189a);
        }
    }

    public k(yy.a aVar, u04.a aVar2, q83.a aVar3, w wVar, a14.g gVar, ib4.c cVar) {
        this.commonEndpoints = aVar2;
        this.mapper = aVar3;
        this.openUrlIntentUseCase = wVar;
        this.dialIntentUseCase = gVar;
        this.errorMapper = cVar;
        this.stateMachine = aVar.a(p83.b.f153473a, new er.l() { // from class: p83.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.r9(this.f153486a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p83.c.Data p9() {
        return this.mapper.b(new q83.a.Params(b9(p83.a.C3788a.f153465a), b9(p83.a.f.f153472a), b9(p83.a.c.f153467a), b9(p83.a.b.f153466a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final k kVar, v vVar) {
        vVar.c(q0.c(p83.b.class), new er.l() { // from class: p83.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.s9(this.f153487a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(p83.a.C3788a.class), oVar, bVar);
        zVar.x(q0.c(p83.a.c.class), oVar, kVar.new c(null));
        zVar.x(q0.c(p83.a.OnError.class), oVar, kVar.new d(null));
        zVar.x(q0.c(p83.a.b.class), oVar, kVar.new e(null));
        zVar.x(q0.c(p83.a.f.class), oVar, kVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p83.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<p83.b, p83.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p83.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p83.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
