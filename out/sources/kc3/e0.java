package kc3;

import ba3.ContactDetails;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vb3.ChosenParticipantsData;
import xw.PhoneNumber;
import y93.TripDetailsEditableData;
import z93.PhoneContactDetails;
import z93.Travel;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0018\u0010<\u001a\u000209*\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lkc3/e0;", "Ll00/g;", "Lkc3/f;", "Lkc3/e;", "Lkc3/k;", "", "Lyy/a;", "stateMachineFactory", "Llc3/d;", "mapper", "Lac4/a;", "callActionWithLoaderUC", "Lx93/d;", "interactor", "Llc3/b;", "errorMapper", "Lhb4/d;", "errorVmsFactory", "<init>", "(Lyy/a;Llc3/d;Lac4/a;Lx93/d;Llc3/b;Lhb4/d;)V", "state", "Lkc3/k$a;", "x9", "(Lkc3/f;)Lkc3/k$a;", "b", "Llc3/d;", "c", "Lac4/a;", "d", "Lx93/d;", "e", "Llc3/b;", "f", "Lhb4/d;", "Lkc3/h;", "g", "Lkc3/h;", "initialState", "Lxw/b;", "Lkc3/e$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Ldx/b;", "Llc3/b$c;", "w9", "(Ldx/b;)Llc3/b$c;", "asErrorResult", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 extends l00.g<kc3.f, kc3.e> implements kc3.k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lc3.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x93.d interactor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lc3.b errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVmsFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final kc3.h initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kc3.e.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<kc3.f, kc3.e> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<kc3.k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<kc3.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f110021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f110022b;

        /* JADX INFO: renamed from: kc3.e0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2628a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f110023a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f110024b;

            /* JADX INFO: renamed from: kc3.e0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2629a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f110025d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f110026e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f110027f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f110029h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f110030j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f110031k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f110032l;

                public C2629a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f110025d = obj;
                    this.f110026e |= PKIFailureInfo.systemUnavail;
                    return C2628a.this.F(null, this);
                }
            }

            public C2628a(mu.h hVar, e0 e0Var) {
                this.f110023a = hVar;
                this.f110024b = e0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2629a c2629a;
                if (eVar instanceof C2629a) {
                    c2629a = (C2629a) eVar;
                    int i15 = c2629a.f110026e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2629a.f110026e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2629a = new C2629a(eVar);
                    }
                } else {
                    c2629a = new C2629a(eVar);
                }
                Object obj2 = c2629a.f110025d;
                Object objE = uq.b.e();
                int i16 = c2629a.f110026e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f110023a;
                    kc3.k.a aVarX9 = this.f110024b.x9((kc3.f) obj);
                    c2629a.f110027f = vq.j.a(obj);
                    c2629a.f110029h = vq.j.a(c2629a);
                    c2629a.f110030j = vq.j.a(obj);
                    c2629a.f110031k = vq.j.a(hVar);
                    c2629a.f110032l = 0;
                    c2629a.f110026e = 1;
                    if (hVar.F(aVarX9, c2629a) == objE) {
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

        public a(mu.g gVar, e0 e0Var) {
            this.f110021a = gVar;
            this.f110022b = e0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super kc3.k.a> hVar, tq.e eVar) {
            Object objA = this.f110021a.a(new C2628a(hVar, this.f110022b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkc3/e$b;", "<unused var>", "Lkc3/f;", "Loq/i0;", "<anonymous>", "(Lkc3/e$b;Lkc3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<kc3.e.b, kc3.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110033e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110033e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                kc3.e.a.C2627a c2627a = kc3.e.a.C2627a.f110004a;
                this.f110033e = 1;
                if (e0Var.F(c2627a, this) == objE) {
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
        public final Object w(kc3.e.b bVar, kc3.f fVar, tq.e<? super oq.i0> eVar) {
            return e0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkc3/h;", "state", "Lk10/l;", "Lkc3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<kc3.h>, tq.e<? super k10.l<? extends kc3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110036f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lkc3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends kc3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f110038e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e0 f110039f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<kc3.h> f110040g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, k10.c0<kc3.h> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f110039f = e0Var;
                this.f110040g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(e0 e0Var, dx.b bVar, kc3.h hVar) {
                return new Error(e0Var.errorVmsFactory.a(((lc3.b.c.Error) e0Var.w9(bVar)).getData()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final kc3.f Y(Map map, kc3.h hVar) {
                return map.isEmpty() ? kc3.f.a.C2630a.f110070a : new kc3.f.Initialized(map);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f110038e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.d dVar = this.f110039f.interactor;
                    this.f110038e = 1;
                    obj = dVar.d(this);
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
                k10.c0<kc3.h> c0Var = this.f110040g;
                final e0 e0Var = this.f110039f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: kc3.f0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return e0.c.a.X(e0Var, bVar, (h) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final Map map = (Map) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: kc3.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e0.c.a.Y(map, (h) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f110039f, this.f110040g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends kc3.f>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110036f;
            Object objE = uq.b.e();
            int i15 = this.f110035e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = e0.this.callActionWithLoaderUC;
            a aVar2 = new a(e0.this, c0Var, null);
            this.f110036f = vq.j.a(c0Var);
            this.f110035e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kc3.h> c0Var, tq.e<? super k10.l<? extends kc3.f>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = e0.this.new c(eVar);
            cVar.f110036f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkc3/c;", "<unused var>", "Lkc3/g;", "Loq/i0;", "<anonymous>", "(Lkc3/c;Lkc3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<kc3.c, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110041e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f110041e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.d9(kc3.e.b.f110008a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kc3.c cVar, Error error, tq.e<? super oq.i0> eVar) {
            return e0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkc3/d;", "<unused var>", "Lk10/c0;", "Lkc3/g;", "state", "Lk10/l;", "Lkc3/f;", "<anonymous>", "(Lkc3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kc3.d, k10.c0<Error>, tq.e<? super k10.l<? extends kc3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110044f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kc3.h O(Error error) {
            return kc3.h.f110078a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110044f;
            uq.b.e();
            if (this.f110043e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: kc3.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.e.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kc3.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends kc3.f>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f110044f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkc3/j;", "state", "Lk10/l;", "Lkc3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends kc3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110046f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lkc3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends kc3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f110048e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f110049f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f110050g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f110051h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f110052j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f110053k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f110054l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f110055m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ e0 f110056n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<Fetching> f110057p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, k10.c0<Fetching> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f110056n = e0Var;
                this.f110057p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Y(e0 e0Var, lc3.b.c cVar, Fetching fetching) {
                return new Error(e0Var.errorVmsFactory.a(((lc3.b.c.Error) cVar).getData()), fetching.b());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final kc3.f.a.ProhibitedAccess Z(lc3.b.c cVar, Fetching fetching) {
                lc3.b.c.ProhibitedAccess prohibitedAccess = (lc3.b.c.ProhibitedAccess) cVar;
                return new kc3.f.a.ProhibitedAccess(prohibitedAccess.getTitle(), prohibitedAccess.getMessage());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final kc3.f a0(Fetching fetching) {
                boolean zIsEmpty = fetching.b().isEmpty();
                if (zIsEmpty) {
                    return kc3.f.a.C2630a.f110070a;
                }
                if (zIsEmpty) {
                    throw new oq.p();
                }
                return new kc3.f.Initialized(fetching.b());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f110055m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.d dVar = this.f110056n.interactor;
                    this.f110055m = 1;
                    obj = dVar.c(this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f110050g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                final e0 e0Var = this.f110056n;
                k10.c0<Fetching> c0Var = this.f110057p;
                if (iVar instanceof dx.i.Left) {
                    final lc3.b.c cVarW9 = e0Var.w9((dx.b) ((dx.i.Left) iVar).b());
                    if (cVarW9 instanceof lc3.b.c.Error) {
                        return c0Var.d(new er.l() { // from class: kc3.i0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return e0.f.a.Y(e0Var, cVarW9, (Fetching) obj2);
                            }
                        });
                    }
                    if (cVarW9 instanceof lc3.b.c.ProhibitedAccess) {
                        return c0Var.d(new er.l() { // from class: kc3.j0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return e0.f.a.Z(cVarW9, (Fetching) obj2);
                            }
                        });
                    }
                    throw new oq.p();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                TravelPersonalData travelPersonalData = (TravelPersonalData) ((dx.i.Right) iVar).b();
                Object objD = c0Var.d(new er.l() { // from class: kc3.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e0.f.a.a0((Fetching) obj2);
                    }
                });
                kc3.e.a.ToRegisterNewTravel toRegisterNewTravel = new kc3.e.a.ToRegisterNewTravel(travelPersonalData);
                this.f110048e = vq.j.a(iVar);
                this.f110049f = vq.j.a(travelPersonalData);
                this.f110050g = objD;
                this.f110051h = vq.j.a(objD);
                this.f110052j = 0;
                this.f110053k = 0;
                this.f110054l = 0;
                this.f110055m = 2;
                return e0Var.F(toRegisterNewTravel, this) == objE ? objE : objD;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f110056n, this.f110057p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends kc3.f>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110046f;
            Object objE = uq.b.e();
            int i15 = this.f110045e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = e0.this.callActionWithLoaderUC;
            a aVar2 = new a(e0.this, c0Var, null);
            this.f110046f = vq.j.a(c0Var);
            this.f110045e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends kc3.f>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = e0.this.new f(eVar);
            fVar.f110046f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkc3/c;", "<unused var>", "Lkc3/i;", "Loq/i0;", "<anonymous>", "(Lkc3/c;Lkc3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<kc3.c, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110058e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f110058e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.d9(kc3.e.b.f110008a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kc3.c cVar, Error error, tq.e<? super oq.i0> eVar) {
            return e0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkc3/d;", "<unused var>", "Lk10/c0;", "Lkc3/i;", "state", "Lk10/l;", "Lkc3/f;", "<anonymous>", "(Lkc3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<kc3.d, k10.c0<Error>, tq.e<? super k10.l<? extends kc3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110061f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.b());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110061f;
            uq.b.e();
            if (this.f110060e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: kc3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.h.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kc3.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends kc3.f>> eVar) {
            h hVar = new h(eVar);
            hVar.f110061f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkc3/e$c;", "<unused var>", "Lk10/c0;", "Lkc3/f$c;", "state", "Lk10/l;", "Lkc3/f;", "<anonymous>", "(Lkc3/e$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<kc3.e.c, k10.c0<kc3.f.Initialized>, tq.e<? super k10.l<? extends kc3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110063f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(k10.c0 c0Var, kc3.f.Initialized initialized) {
            return new Fetching(((kc3.f.Initialized) c0Var.a()).b());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f110063f;
            uq.b.e();
            if (this.f110062e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: kc3.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.i.O(c0Var, (f.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kc3.e.c cVar, k10.c0<kc3.f.Initialized> c0Var, tq.e<? super k10.l<? extends kc3.f>> eVar) {
            i iVar = new i(eVar);
            iVar.f110063f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkc3/e$d;", "action", "Lkc3/f$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkc3/e$d;Lkc3/f$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<kc3.e.OnTripDetails, kc3.f.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f110064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f110065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110066g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            PhoneNumber phoneNumberA;
            kc3.e.OnTripDetails onTripDetails = (kc3.e.OnTripDetails) this.f110066g;
            Object objE = uq.b.e();
            int i15 = this.f110065f;
            if (i15 == 0) {
                oq.u.b(obj);
                String uuid = onTripDetails.getTrip().getUuid();
                z93.r tripType = onTripDetails.getTripType();
                TravelPersonalData travelPersonalData = new TravelPersonalData(onTripDetails.getTrip().getApplicant().getFirstName(), onTripDetails.getTrip().getApplicant().getPesel(), onTripDetails.getTrip().getApplicant().getSurname(), null);
                String email = onTripDetails.getTrip().getApplicant().getEmail();
                if (email == null) {
                    email = "";
                }
                boolean z15 = onTripDetails.getTrip().getApplicant().getEmail() != null;
                PhoneContactDetails phone = onTripDetails.getTrip().getApplicant().getPhone();
                if (phone != null) {
                    String prefix = phone.getPrefix();
                    if (prefix == null) {
                        prefix = "";
                    }
                    iy.b0 b0VarC = PhoneNumber.c.c(iy.c0.g(prefix));
                    String phoneNumber = phone.getPhoneNumber();
                    phoneNumberA = new PhoneNumber(b0VarC, PhoneNumber.b.c(iy.c0.g(phoneNumber != null ? phoneNumber : "")), null);
                } else {
                    phoneNumberA = PhoneNumber.INSTANCE.a();
                }
                TripDetailsEditableData tripDetailsEditableData = new TripDetailsEditableData(uuid, tripType, travelPersonalData, new ContactDetails(email, z15, phoneNumberA, onTripDetails.getTrip().getApplicant().getPhone() != null), new ChosenParticipantsData(onTripDetails.getTrip().getApplicant().getIsParticipant(), onTripDetails.getTrip().e()), onTripDetails.getTrip().d(), null);
                e0 e0Var = e0.this;
                kc3.e.a.ToTripDetails toTripDetails = new kc3.e.a.ToTripDetails(tripDetailsEditableData);
                this.f110066g = vq.j.a(onTripDetails);
                this.f110064e = vq.j.a(tripDetailsEditableData);
                this.f110065f = 1;
                if (e0Var.F(toTripDetails, this) == objE) {
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
        public final Object w(kc3.e.OnTripDetails onTripDetails, kc3.f.Initialized initialized, tq.e<? super oq.i0> eVar) {
            j jVar = e0.this.new j(eVar);
            jVar.f110066g = onTripDetails;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkc3/e$c;", "<unused var>", "Lk10/c0;", "Lkc3/f$a$a;", "state", "Lk10/l;", "Lkc3/f;", "<anonymous>", "(Lkc3/e$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<kc3.e.c, k10.c0<kc3.f.a.C2630a>, tq.e<? super k10.l<? extends kc3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110069f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(kc3.f.a.C2630a c2630a) {
            return new Fetching(null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f110069f;
            uq.b.e();
            if (this.f110068e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: kc3.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.k.O((f.a.C2630a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kc3.e.c cVar, k10.c0<kc3.f.a.C2630a> c0Var, tq.e<? super k10.l<? extends kc3.f>> eVar) {
            k kVar = new k(eVar);
            kVar.f110069f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    public e0(yy.a aVar, lc3.d dVar, ac4.a aVar2, x93.d dVar2, lc3.b bVar, hb4.d dVar3) {
        this.mapper = dVar;
        this.callActionWithLoaderUC = aVar2;
        this.interactor = dVar2;
        this.errorMapper = bVar;
        this.errorVmsFactory = dVar3;
        kc3.h hVar = kc3.h.f110078a;
        this.initialState = hVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(hVar, new er.l() { // from class: kc3.v
            @Override // er.l
            public final Object b(Object obj) {
                return e0.A9(this.f110117a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), x9(hVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(final e0 e0Var, k10.v vVar) {
        vVar.c(fr.q0.c(kc3.f.class), new er.l() { // from class: kc3.x
            @Override // er.l
            public final Object b(Object obj) {
                return e0.B9(this.f110119a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kc3.h.class), new er.l() { // from class: kc3.y
            @Override // er.l
            public final Object b(Object obj) {
                return e0.C9(this.f110120a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: kc3.z
            @Override // er.l
            public final Object b(Object obj) {
                return e0.D9(this.f110121a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: kc3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.E9(this.f109997a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: kc3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.F9(this.f110000a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kc3.f.Initialized.class), new er.l() { // from class: kc3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.G9(this.f110002a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(kc3.f.a.C2630a.class), new er.l() { // from class: kc3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.H9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(e0 e0Var, k10.z zVar) {
        b bVar = e0Var.new b(null);
        zVar.x(fr.q0.c(kc3.e.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(e0 e0Var, k10.z zVar) {
        zVar.A(e0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(e0 e0Var, k10.z zVar) {
        d dVar = e0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(kc3.c.class), oVar, dVar);
        zVar.v(fr.q0.c(kc3.d.class), oVar, new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(e0 e0Var, k10.z zVar) {
        zVar.A(e0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(e0 e0Var, k10.z zVar) {
        g gVar = e0Var.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(kc3.c.class), oVar, gVar);
        zVar.v(fr.q0.c(kc3.d.class), oVar, new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(e0 e0Var, k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(kc3.e.c.class), oVar, iVar);
        zVar.x(fr.q0.c(kc3.e.OnTripDetails.class), oVar, e0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(k10.z zVar) {
        k kVar = new k(null);
        zVar.v(fr.q0.c(kc3.e.c.class), k10.o.CANCEL_PREVIOUS, kVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lc3.b.c w9(dx.b bVar) {
        return this.errorMapper.b(new lc3.b.Params(bVar, b9(kc3.d.f110003a), b9(kc3.c.f110001a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kc3.k.a x9(kc3.f state) {
        return this.mapper.b(new lc3.d.Params(state, new er.p() { // from class: kc3.w
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return e0.y9(this.f110118a, (z93.r) obj, (Travel) obj2);
            }
        }, b9(kc3.e.b.f110008a), b9(kc3.e.c.f110009a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(e0 e0Var, z93.r rVar, Travel travel) {
        e0Var.d9(new kc3.e.OnTripDetails(rVar, travel));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<kc3.e.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<kc3.f, kc3.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<kc3.k.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(kc3.e.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
