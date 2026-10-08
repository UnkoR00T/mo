package tn1;

import al0.BEGenerateXmlResponse;
import fr.q0;
import iy.b0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u0019088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Ltn1/l;", "Ll00/g;", "Ltn1/b;", "Ltn1/a;", "Ltn1/c;", "", "Lyy/a;", "stateMachineFactory", "Lvn1/g;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lpm1/a;", "generateXmlUC", "Lwz3/j;", "signBase64XmlUC", "Lpm1/b;", "submitXmlUC", "Lib4/c;", "genericDomainErrorMapper", "Lun1/a;", "contract", "<init>", "(Lyy/a;Lvn1/g;Lac4/a;Lpm1/a;Lwz3/j;Lpm1/b;Lib4/c;Lun1/a;)V", "state", "Ltn1/c$a;", "q9", "(Ltn1/b;)Ltn1/c$a;", "b", "Lvn1/g;", "c", "Lac4/a;", "d", "Lpm1/a;", "e", "Lwz3/j;", "f", "Lpm1/b;", "g", "Lib4/c;", "h", "Ltn1/b;", "initialState", "Lxw/b;", "Ltn1/a$a;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, tn1.a> implements tn1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vn1.g mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pm1.a generateXmlUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wz3.j signBase64XmlUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pm1.b submitXmlUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<tn1.a.InterfaceC4990a> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<State, tn1.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<tn1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<tn1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f191042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f191043b;

        /* JADX INFO: renamed from: tn1.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4993a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f191044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f191045b;

            /* JADX INFO: renamed from: tn1.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4994a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f191046d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f191047e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f191048f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f191050h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f191051j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f191052k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f191053l;

                public C4994a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f191046d = obj;
                    this.f191047e |= PKIFailureInfo.systemUnavail;
                    return C4993a.this.F(null, this);
                }
            }

            public C4993a(mu.h hVar, l lVar) {
                this.f191044a = hVar;
                this.f191045b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4994a c4994a;
                if (eVar instanceof C4994a) {
                    c4994a = (C4994a) eVar;
                    int i15 = c4994a.f191047e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4994a.f191047e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4994a = new C4994a(eVar);
                    }
                } else {
                    c4994a = new C4994a(eVar);
                }
                Object obj2 = c4994a.f191046d;
                Object objE = uq.b.e();
                int i16 = c4994a.f191047e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f191044a;
                    tn1.c.Data dataQ9 = this.f191045b.q9((State) obj);
                    c4994a.f191048f = vq.j.a(obj);
                    c4994a.f191050h = vq.j.a(c4994a);
                    c4994a.f191051j = vq.j.a(obj);
                    c4994a.f191052k = vq.j.a(hVar);
                    c4994a.f191053l = 0;
                    c4994a.f191047e = 1;
                    if (hVar.F(dataQ9, c4994a) == objE) {
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
            this.f191042a = gVar;
            this.f191043b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super tn1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f191042a.a(new C4993a(hVar, this.f191043b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltn1/a$b;", "<unused var>", "Ltn1/b;", "Loq/i0;", "<anonymous>", "(Ltn1/a$b;Ltn1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<tn1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191054e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191054e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                tn1.a.InterfaceC4990a.C4991a c4991a = tn1.a.InterfaceC4990a.C4991a.f191000a;
                this.f191054e = 1;
                if (lVar.F(c4991a, this) == objE) {
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
        public final Object w(tn1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltn1/a$c;", "<unused var>", "Ltn1/b;", "Loq/i0;", "<anonymous>", "(Ltn1/a$c;Ltn1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<tn1.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191056e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191056e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                tn1.a.InterfaceC4990a.b bVar = tn1.a.InterfaceC4990a.b.f191001a;
                this.f191056e = 1;
                if (lVar.F(bVar, this) == objE) {
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
        public final Object w(tn1.a.c cVar, State state, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltn1/a$e;", "action", "Ltn1/b;", "state", "Loq/i0;", "<anonymous>", "(Ltn1/a$e;Ltn1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<tn1.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f191060g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f191062e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f191063f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ State f191064g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ tn1.a.e f191065h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, State state, tn1.a.e eVar, tq.e<? super a> eVar2) {
                super(1, eVar2);
                this.f191063f = lVar;
                this.f191064g = state;
                this.f191065h = eVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f191062e;
                if (i15 == 0) {
                    u.b(obj);
                    pm1.a aVar = this.f191063f.generateXmlUC;
                    pm1.a.Params params = new pm1.a.Params(this.f191064g.getData());
                    this.f191062e = 1;
                    obj = aVar.e(params, this);
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
                l lVar = this.f191063f;
                tn1.a.e eVar = this.f191065h;
                if (iVar instanceof dx.i.Left) {
                    lVar.d9(new tn1.a.OnError((k44.a) ((dx.i.Left) iVar).b(), eVar));
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    lVar.d9(new tn1.a.OnSubmitXml((BEGenerateXmlResponse) ((dx.i.Right) iVar).b()));
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f191063f, this.f191064g, this.f191065h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            tn1.a.e eVar = (tn1.a.e) this.f191059f;
            State state = (State) this.f191060g;
            Object objE = uq.b.e();
            int i15 = this.f191058e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = l.this.callActionWithLoaderUseCase;
                a aVar2 = new a(l.this, state, eVar, null);
                this.f191059f = vq.j.a(eVar);
                this.f191060g = vq.j.a(state);
                this.f191058e = 1;
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
        public final Object w(tn1.a.e eVar, State state, tq.e<? super i0> eVar2) {
            d dVar = l.this.new d(eVar2);
            dVar.f191059f = eVar;
            dVar.f191060g = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltn1/a$d;", "action", "Ltn1/b;", "state", "Loq/i0;", "<anonymous>", "(Ltn1/a$d;Ltn1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<tn1.a.OnError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f191066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f191068g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(l lVar, tn1.a.OnError onError, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                lVar.d9(onError.getRetryAction());
            }
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(l lVar, tn1.a.OnError onError, b0 b0Var) {
            lVar.d9(onError.getRetryAction());
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
        
            if (r2.F(r4, r12) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
        
            if (r2.F(r3, r12) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f191068g
                tn1.a$d r0 = (tn1.a.OnError) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r12.f191067f
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L24
                if (r2 == r3) goto L1b
                if (r2 != r4) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                java.lang.Object r0 = r12.f191066e
                k44.a r0 = (k44.a) r0
                oq.u.b(r13)
                goto L9e
            L24:
                oq.u.b(r13)
                k44.a r13 = r0.getError()
                boolean r2 = r13 instanceof k44.a.Domain
                if (r2 == 0) goto L6d
                tn1.l r2 = tn1.l.this
                tn1.a$a$d r4 = new tn1.a$a$d
                tn1.l r5 = tn1.l.this
                ib4.c r5 = tn1.l.l9(r5)
                ib4.c$a r6 = new ib4.c$a
                r7 = r13
                k44.a$a r7 = (k44.a.Domain) r7
                dx.b r7 = r7.getDomain()
                tn1.l r8 = tn1.l.this
                tn1.m r9 = new tn1.m
                r9.<init>()
                r10 = 2
                r11 = 0
                r8 = 0
                r6.<init>(r7, r8, r9, r10, r11)
                java.lang.Object r5 = r5.b(r6)
                jb4.b r5 = (jb4.b) r5
                r4.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r12.f191068g = r0
                java.lang.Object r13 = vq.j.a(r13)
                r12.f191066e = r13
                r12.f191067f = r3
                java.lang.Object r13 = r2.F(r4, r12)
                if (r13 != r1) goto L9e
                goto L9d
            L6d:
                k44.a$b r2 = k44.a.b.f108417a
                boolean r2 = fr.t.c(r13, r2)
                if (r2 == 0) goto La1
                tn1.l r2 = tn1.l.this
                tn1.a$a$c r3 = new tn1.a$a$c
                mv3.a$b r5 = new mv3.a$b
                tn1.l r6 = tn1.l.this
                tn1.n r7 = new tn1.n
                r7.<init>()
                r6 = 0
                r5.<init>(r7, r6, r4, r6)
                r3.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r12.f191068g = r0
                java.lang.Object r13 = vq.j.a(r13)
                r12.f191066e = r13
                r12.f191067f = r4
                java.lang.Object r13 = r2.F(r3, r12)
                if (r13 != r1) goto L9e
            L9d:
                return r1
            L9e:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            La1:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: tn1.l.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(tn1.a.OnError onError, State state, tq.e<? super i0> eVar) {
            e eVar2 = l.this.new e(eVar);
            eVar2.f191068g = onError;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltn1/a$f;", "action", "Ltn1/b;", "state", "Loq/i0;", "<anonymous>", "(Ltn1/a$f;Ltn1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<tn1.a.OnSubmitXml, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f191071f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f191072g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f191074e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f191075f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f191076g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f191077h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f191078j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ l f191079k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ tn1.a.OnSubmitXml f191080l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ State f191081m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, tn1.a.OnSubmitXml onSubmitXml, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f191079k = lVar;
                this.f191080l = onSubmitXml;
                this.f191081m = state;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
            /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:39:0x0108  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
            
                if (r11 == r0) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
            
                if (r1.F(r4, r10) == r0) goto L36;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 282
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: tn1.l.f.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f191079k, this.f191080l, this.f191081m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            tn1.a.OnSubmitXml onSubmitXml = (tn1.a.OnSubmitXml) this.f191071f;
            State state = (State) this.f191072g;
            Object objE = uq.b.e();
            int i15 = this.f191070e;
            if (i15 == 0) {
                u.b(obj);
                ac4.a aVar = l.this.callActionWithLoaderUseCase;
                a aVar2 = new a(l.this, onSubmitXml, state, null);
                this.f191071f = vq.j.a(onSubmitXml);
                this.f191072g = vq.j.a(state);
                this.f191070e = 1;
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
        public final Object w(tn1.a.OnSubmitXml onSubmitXml, State state, tq.e<? super i0> eVar) {
            f fVar = l.this.new f(eVar);
            fVar.f191071f = onSubmitXml;
            fVar.f191072g = state;
            return fVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, vn1.g gVar, ac4.a aVar2, pm1.a aVar3, wz3.j jVar, pm1.b bVar, ib4.c cVar, un1.a aVar4) {
        this.mapper = gVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.generateXmlUC = aVar3;
        this.signBase64XmlUC = jVar;
        this.submitXmlUC = bVar;
        this.genericDomainErrorMapper = cVar;
        State state = new State(aVar4.getType(), aVar4.c());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: tn1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.s9(this.f191031a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), q9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tn1.c.Data q9(State state) {
        return this.mapper.b(new vn1.g.Params(state, b9(tn1.a.b.f191005a), b9(tn1.a.c.f191006a), b9(tn1.a.e.f191009a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: tn1.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.t9(this.f191030a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(tn1.a.b.class), oVar, bVar);
        zVar.x(q0.c(tn1.a.c.class), oVar, lVar.new c(null));
        zVar.x(q0.c(tn1.a.e.class), oVar, lVar.new d(null));
        zVar.x(q0.c(tn1.a.OnError.class), oVar, lVar.new e(null));
        zVar.x(q0.c(tn1.a.OnSubmitXml.class), oVar, lVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<tn1.a.InterfaceC4990a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, tn1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<tn1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(tn1.a.InterfaceC4990a interfaceC4990a, tq.e<? super i0> eVar) {
        return super.F(interfaceC4990a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(un1.a aVar) {
        super.P5(aVar);
    }
}
