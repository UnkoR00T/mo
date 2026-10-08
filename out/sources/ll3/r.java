package ll3;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import kk3.Dictionary;
import kk3.DictionaryResponse;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001CBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lll3/r;", "Ll00/g;", "Lll3/f;", "Lll3/c;", "Lll3/g;", "", "Lyy/a;", "stateMachineFactory", "Lnl3/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ljk3/b;", "interactor", "Lml3/a;", "contract", "<init>", "(Lyy/a;Lnl3/b;Lhb4/d;Lib4/c;Lac4/a;Ljk3/b;Lml3/a;)V", "Ldx/b;", "Lhb4/c;", "A9", "(Ldx/b;)Lhb4/c;", "state", "Lll3/g$a;", "t9", "(Lll3/f;)Lll3/g$a;", "b", "Lnl3/b;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lac4/a;", "f", "Ljk3/b;", "g", "Lml3/a;", "s9", "()Lml3/a;", "Lll3/e;", "h", "Lll3/e;", "initialState", "Lxw/b;", "Lll3/c$a;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "m", "a", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<ll3.f, ll3.c> implements ll3.g, zx.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f118793m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f118794n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nl3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jk3.b interactor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ml3.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ll3.e initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ll3.c.a> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ll3.f, ll3.c> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<ll3.g.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lll3/r$a;", "", "<init>", "()V", "", "DICTIONARY_ID", "Ljava/lang/String;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<kk3.b, i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(kk3.b bVar) {
            c(bVar.getValue());
            return i0.f148189a;
        }

        public final void c(String str) {
            r.this.d9(new ll3.c.OnCardClick(str, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<ll3.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f118806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f118807b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f118808a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f118809b;

            /* JADX INFO: renamed from: ll3.r$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2889a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f118810d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f118811e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f118812f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f118814h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f118815j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f118816k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f118817l;

                public C2889a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f118810d = obj;
                    this.f118811e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f118808a = hVar;
                this.f118809b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2889a c2889a;
                if (eVar instanceof C2889a) {
                    c2889a = (C2889a) eVar;
                    int i15 = c2889a.f118811e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2889a.f118811e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2889a = new C2889a(eVar);
                    }
                } else {
                    c2889a = new C2889a(eVar);
                }
                Object obj2 = c2889a.f118810d;
                Object objE = uq.b.e();
                int i16 = c2889a.f118811e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f118808a;
                    ll3.g.a aVarT9 = this.f118809b.t9((ll3.f) obj);
                    c2889a.f118812f = vq.j.a(obj);
                    c2889a.f118814h = vq.j.a(c2889a);
                    c2889a.f118815j = vq.j.a(obj);
                    c2889a.f118816k = vq.j.a(hVar);
                    c2889a.f118817l = 0;
                    c2889a.f118811e = 1;
                    if (hVar.F(aVarT9, c2889a) == objE) {
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
            this.f118806a = gVar;
            this.f118807b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ll3.g.a> hVar, tq.e eVar) {
            Object objA = this.f118806a.a(new a(hVar, this.f118807b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lll3/c$b;", "<unused var>", "Lll3/f;", "Loq/i0;", "<anonymous>", "(Lll3/c$b;Lll3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ll3.c.b, ll3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118818e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f118818e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                ll3.c.a.C2885a c2885a = ll3.c.a.C2885a.f118765a;
                this.f118818e = 1;
                if (rVar.F(c2885a, this) == objE) {
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
        public final Object w(ll3.c.b bVar, ll3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lll3/c$d;", "<unused var>", "Lll3/f;", "Loq/i0;", "<anonymous>", "(Lll3/c$d;Lll3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ll3.c.d, ll3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118820e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f118820e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                ll3.c.a.b bVar = ll3.c.a.b.f118766a;
                this.f118820e = 1;
                if (rVar.F(bVar, this) == objE) {
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
        public final Object w(ll3.c.d dVar, ll3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lll3/e;", "state", "Lk10/l;", "Lll3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<ll3.e>, tq.e<? super k10.l<? extends ll3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118823f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lll3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ll3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f118825e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f118826f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<ll3.e> f118827g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<ll3.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f118826f = rVar;
                this.f118827g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(r rVar, dx.b bVar, ll3.e eVar) {
                return new Error(rVar.A9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ll3.f Y(DictionaryResponse dictionaryResponse, r rVar, ll3.e eVar) {
                List<Dictionary> listA = dictionaryResponse.a();
                return listA.isEmpty() ? new Error(rVar.A9(new dx.b.Generic(null, 1, null))) : new ll3.f.Initialized(listA);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f118825e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jk3.b bVar = this.f118826f.interactor;
                    this.f118825e = 1;
                    obj = bVar.a("DICT_654", this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                c0<ll3.e> c0Var = this.f118827g;
                final r rVar = this.f118826f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ll3.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.f.a.X(rVar, bVar2, (e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final DictionaryResponse dictionaryResponse = (DictionaryResponse) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ll3.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.f.a.Y(dictionaryResponse, rVar, (e) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f118826f, this.f118827g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ll3.f>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f118823f;
            Object objE = uq.b.e();
            int i15 = this.f118822e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, c0Var, null);
            this.f118823f = vq.j.a(c0Var);
            this.f118822e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ll3.e> c0Var, tq.e<? super k10.l<? extends ll3.f>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f118823f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lll3/b;", "<unused var>", "Lk10/c0;", "Lll3/d;", "state", "Lk10/l;", "Lll3/f;", "<anonymous>", "(Lll3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ll3.b, c0<Error>, tq.e<? super k10.l<? extends ll3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118829f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ll3.e O(Error error) {
            return ll3.e.f118773a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f118829f;
            uq.b.e();
            if (this.f118828e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ll3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.g.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ll3.b bVar, c0<Error> c0Var, tq.e<? super k10.l<? extends ll3.f>> eVar) {
            g gVar = new g(eVar);
            gVar.f118829f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lll3/a;", "<unused var>", "Lll3/d;", "Loq/i0;", "<anonymous>", "(Lll3/a;Lll3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ll3.a, Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118830e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f118830e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                ll3.c.a.d dVar = ll3.c.a.d.f118768a;
                this.f118830e = 1;
                if (rVar.F(dVar, this) == objE) {
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
        public final Object w(ll3.a aVar, Error error, tq.e<? super i0> eVar) {
            return r.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lll3/c$c;", "action", "Lll3/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lll3/c$c;Lll3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ll3.c.OnCardClick, ll3.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118833f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ll3.c.OnCardClick onCardClick = (ll3.c.OnCardClick) this.f118833f;
            Object objE = uq.b.e();
            int i15 = this.f118832e;
            if (i15 == 0) {
                oq.u.b(obj);
                r.this.getContract().g(onCardClick.getCode());
                r rVar = r.this;
                ll3.c.a.C2886c c2886c = ll3.c.a.C2886c.f118767a;
                this.f118833f = vq.j.a(onCardClick);
                this.f118832e = 1;
                if (rVar.F(c2886c, this) == objE) {
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
        public final Object w(ll3.c.OnCardClick onCardClick, ll3.f.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f118833f = onCardClick;
            return iVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, nl3.b bVar, hb4.d dVar, ib4.c cVar, ac4.a aVar2, jk3.b bVar2, ml3.a aVar3) {
        this.mapper = bVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = bVar2;
        this.contract = aVar3;
        ll3.e eVar = ll3.e.f118773a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: ll3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f118792a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), t9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c A9(dx.b bVar) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ll3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f118791a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            rVar.d9(ll3.b.f118764a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            rVar.d9(ll3.a.f118763a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ll3.g.a t9(ll3.f state) {
        return this.mapper.b(new nl3.b.Params(state, b9(ll3.c.b.f118769a), b9(ll3.c.d.f118771a), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(ll3.f.class), new er.l() { // from class: ll3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.w9(this.f118787a, (z) obj);
            }
        });
        vVar.c(q0.c(ll3.e.class), new er.l() { // from class: ll3.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f118788a, (z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: ll3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f118789a, (z) obj);
            }
        });
        vVar.c(q0.c(ll3.f.Initialized.class), new er.l() { // from class: ll3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f118790a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(r rVar, z zVar) {
        d dVar = rVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ll3.c.b.class), oVar, dVar);
        zVar.x(q0.c(ll3.c.d.class), oVar, rVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, z zVar) {
        zVar.A(rVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ll3.b.class), oVar, gVar);
        zVar.x(q0.c(ll3.a.class), oVar, rVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, z zVar) {
        i iVar = rVar.new i(null);
        zVar.x(q0.c(ll3.c.OnCardClick.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ll3.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ll3.f, ll3.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ll3.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ll3.c.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    /* JADX INFO: renamed from: s9, reason: from getter */
    public final ml3.a getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ml3.a aVar) {
        super.P5(aVar);
    }
}
