package sf1;

import f00.j0;
import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001/B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lsf1/t;", "Ll00/g;", "Lsf1/l;", "", "Lsf1/m;", "Lyy/a;", "stateMachineFactory", "Luf1/a;", "mapper", "Lj14/a;", "checkEmailCorrectUC", "Ltf1/a;", "contract", "<init>", "(Lyy/a;Luf1/a;Lj14/a;Ltf1/a;)V", "state", "Lsf1/m$a;", "p9", "(Lsf1/l;)Lsf1/m$a;", "b", "Luf1/a;", "c", "Lj14/a;", "d", "Ltf1/a;", "Lsf1/l$b;", "e", "Lsf1/l$b;", "initialState", "Lxw/b;", "Lsf1/g;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<l, Object> implements m, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uf1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tf1.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l.Initialized initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sf1.g> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<l, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<m.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsf1/t$a;", "Lf00/j0;", "Ltf1/a;", "Lsf1/t;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<tf1.a, t> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<m.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f181184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f181185b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f181186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f181187b;

            /* JADX INFO: renamed from: sf1.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4656a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f181188d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f181189e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f181190f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f181192h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f181193j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f181194k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f181195l;

                public C4656a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f181188d = obj;
                    this.f181189e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f181186a = hVar;
                this.f181187b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4656a c4656a;
                if (eVar instanceof C4656a) {
                    c4656a = (C4656a) eVar;
                    int i15 = c4656a.f181189e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4656a.f181189e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4656a = new C4656a(eVar);
                    }
                } else {
                    c4656a = new C4656a(eVar);
                }
                Object obj2 = c4656a.f181188d;
                Object objE = uq.b.e();
                int i16 = c4656a.f181189e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f181186a;
                    m.a aVarP9 = this.f181187b.p9((l) obj);
                    c4656a.f181190f = vq.j.a(obj);
                    c4656a.f181192h = vq.j.a(c4656a);
                    c4656a.f181193j = vq.j.a(obj);
                    c4656a.f181194k = vq.j.a(hVar);
                    c4656a.f181195l = 0;
                    c4656a.f181189e = 1;
                    if (hVar.F(aVarP9, c4656a) == objE) {
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

        public b(mu.g gVar, t tVar) {
            this.f181184a = gVar;
            this.f181185b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m.a> hVar, tq.e eVar) {
            Object objA = this.f181184a.a(new a(hVar, this.f181185b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsf1/f;", "<unused var>", "Lsf1/l;", "Loq/i0;", "<anonymous>", "(Lsf1/f;Lsf1/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sf1.f, l, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181196e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181196e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sf1.g> bVarY1 = t.this.Y1();
                sf1.g.a aVar = sf1.g.a.f181149a;
                this.f181196e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(sf1.f fVar, l lVar, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsf1/l$b;", "state", "Lk10/l;", "Lsf1/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181199f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(tf1.b bVar, l.Initialized initialized) {
            if (bVar instanceof tf1.b.a) {
                tf1.b.a aVar = (tf1.b.a) bVar;
                return l.Initialized.b(initialized, new l.Field(hz.b.C2039b.f86846c, aVar.getEmail()), aVar.getCeidgConsent(), false, null, 12, null);
            }
            if (bVar instanceof tf1.b.C4950b) {
                return l.Initialized.b(initialized, null, false, ((tf1.b.C4950b) bVar).getHasNoEmail(), null, 11, null);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarB;
            c0 c0Var = (c0) this.f181199f;
            uq.b.e();
            if (this.f181198e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final tf1.b bVarN0 = t.this.contract.N0();
            return (bVarN0 == null || (lVarB = c0Var.b(new er.l() { // from class: sf1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(bVarN0, (l.Initialized) obj2);
                }
            })) == null) ? c0Var.c() : lVarB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = t.this.new d(eVar);
            dVar.f181199f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf1/j;", "action", "Lk10/c0;", "Lsf1/l$b;", "state", "Lk10/l;", "Lsf1/l;", "<anonymous>", "(Lsf1/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnEmailChanged, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181203g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(OnEmailChanged onEmailChanged, l.Initialized initialized) {
            return l.Initialized.b(initialized, new l.Field(null, iy.c0.g(onEmailChanged.getEmail()), 1, null), false, false, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnEmailChanged onEmailChanged = (OnEmailChanged) this.f181202f;
            c0 c0Var = (c0) this.f181203g;
            uq.b.e();
            if (this.f181201e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sf1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(onEmailChanged, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnEmailChanged onEmailChanged, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f181202f = onEmailChanged;
            eVar2.f181203g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf1/k;", "action", "Lk10/c0;", "Lsf1/l$b;", "state", "Lk10/l;", "Lsf1/l;", "<anonymous>", "(Lsf1/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnHasNoEmailChanged, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181206g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(OnHasNoEmailChanged onHasNoEmailChanged, l.Initialized initialized) {
            return l.Initialized.b(initialized, new l.Field(null, null, 3, null), false, onHasNoEmailChanged.getHasNoEmail(), null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnHasNoEmailChanged onHasNoEmailChanged = (OnHasNoEmailChanged) this.f181205f;
            c0 c0Var = (c0) this.f181206g;
            uq.b.e();
            if (this.f181204e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sf1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O(onHasNoEmailChanged, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnHasNoEmailChanged onHasNoEmailChanged, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            f fVar = new f(eVar);
            fVar.f181205f = onHasNoEmailChanged;
            fVar.f181206g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf1/i;", "action", "Lk10/c0;", "Lsf1/l$b;", "state", "Lk10/l;", "Lsf1/l;", "<anonymous>", "(Lsf1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnCeidgConsentChanged, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181209g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(OnCeidgConsentChanged onCeidgConsentChanged, l.Initialized initialized) {
            return l.Initialized.b(initialized, null, onCeidgConsentChanged.getConsent(), false, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCeidgConsentChanged onCeidgConsentChanged = (OnCeidgConsentChanged) this.f181208f;
            c0 c0Var = (c0) this.f181209g;
            uq.b.e();
            if (this.f181207e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sf1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(onCeidgConsentChanged, (l.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCeidgConsentChanged onCeidgConsentChanged, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            g gVar = new g(eVar);
            gVar.f181208f = onCeidgConsentChanged;
            gVar.f181209g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsf1/h;", "<unused var>", "Lk10/c0;", "Lsf1/l$b;", "state", "Lk10/l;", "Lsf1/l;", "<anonymous>", "(Lsf1/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sf1.h, c0<l.Initialized>, tq.e<? super k10.l<? extends l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f181211f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f181212g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f181213h;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l.Initialized O(hz.g gVar, l.Initialized initialized) {
            return l.Initialized.b(initialized, l.Field.b(initialized.getEmail(), gVar.a(), null, 2, null), false, false, null, 14, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
        
            if (r4.F(r5, r11) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sf1.t.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sf1.h hVar, c0<l.Initialized> c0Var, tq.e<? super k10.l<? extends l>> eVar) {
            h hVar2 = t.this.new h(eVar);
            hVar2.f181213h = c0Var;
            return hVar2.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, uf1.a aVar2, j14.a aVar3, tf1.a aVar4) {
        this.mapper = aVar2;
        this.checkEmailCorrectUC = aVar3;
        this.contract = aVar4;
        l.Initialized initialized = new l.Initialized(new l.Field(hz.b.C2039b.f86846c, iy.c0.g("")), false, false, null, 8, null);
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: sf1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f181176a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), p9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m.a p9(l state) {
        return this.mapper.b(new uf1.a.Params(state, new er.l() { // from class: sf1.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.q9(this.f181171a, (String) obj);
            }
        }, new er.l() { // from class: sf1.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.r9(this.f181172a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: sf1.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.s9(this.f181173a, ((Boolean) obj).booleanValue());
            }
        }, b9(sf1.h.f181151a), b9(sf1.f.f181148a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(t tVar, String str) {
        tVar.d9(new OnEmailChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(t tVar, boolean z15) {
        tVar.d9(new OnHasNoEmailChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(t tVar, boolean z15) {
        tVar.d9(new OnCeidgConsentChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(l.class), new er.l() { // from class: sf1.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.u9(this.f181174a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(l.Initialized.class), new er.l() { // from class: sf1.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.v9(this.f181175a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(t tVar, k10.z zVar) {
        c cVar = tVar.new c(null);
        zVar.x(q0.c(sf1.f.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(t tVar, k10.z zVar) {
        zVar.A(tVar.new d(null));
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnEmailChanged.class), oVar, eVar);
        zVar.v(q0.c(OnHasNoEmailChanged.class), oVar, new f(null));
        zVar.v(q0.c(OnCeidgConsentChanged.class), oVar, new g(null));
        zVar.v(q0.c(sf1.h.class), oVar, tVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<sf1.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<l, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m.a> getState() {
        return this.state;
    }
}
