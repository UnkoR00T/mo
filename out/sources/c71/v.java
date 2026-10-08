package c71;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030;8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lc71/v;", "Ll00/g;", "Lc71/b;", "Lc71/a;", "Lc71/i;", "", "Lyy/a;", "stateMachineFactory", "Ld71/a;", "mapper", "Lib4/c;", "genericErrorMapper", "Lml0/u;", "isAdultUC", "Ljj0/b;", "hasTrustedProfileUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Ll44/e;", "getUserEdorAddressUC", "<init>", "(Lyy/a;Ld71/a;Lib4/c;Lml0/u;Ljj0/b;Lac4/a;Lhb4/d;Ll44/e;)V", "Ldx/b;", "domainError", "retryAction", "Lhb4/c;", "u9", "(Ldx/b;Lc71/a;)Lhb4/c;", "state", "Lc71/i$a;", "w9", "(Lc71/b;)Lc71/i$a;", "b", "Ld71/a;", "c", "Lib4/c;", "d", "Lml0/u;", "e", "Ljj0/b;", "f", "Lac4/a;", "g", "Lhb4/d;", "h", "Ll44/e;", "Lc71/b$a;", "j", "Lc71/b$a;", "initialState", "Lxw/b;", "Lc71/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<c71.b, c71.a> implements c71.i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d71.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ml0.u isAdultUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final jj0.b hasTrustedProfileUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c71.b.a initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c71.a.d> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<c71.b, c71.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<c71.i.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c71.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f23900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f23901b;

        /* JADX INFO: renamed from: c71.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0638a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f23902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f23903b;

            /* JADX INFO: renamed from: c71.v$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0639a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f23904d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f23905e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f23906f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f23908h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f23909j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f23910k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f23911l;

                public C0639a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f23904d = obj;
                    this.f23905e |= PKIFailureInfo.systemUnavail;
                    return C0638a.this.F(null, this);
                }
            }

            public C0638a(mu.h hVar, v vVar) {
                this.f23902a = hVar;
                this.f23903b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0639a c0639a;
                if (eVar instanceof C0639a) {
                    c0639a = (C0639a) eVar;
                    int i15 = c0639a.f23905e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0639a.f23905e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0639a = new C0639a(eVar);
                    }
                } else {
                    c0639a = new C0639a(eVar);
                }
                Object obj2 = c0639a.f23904d;
                Object objE = uq.b.e();
                int i16 = c0639a.f23905e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f23902a;
                    c71.i.a aVarW9 = this.f23903b.w9((c71.b) obj);
                    c0639a.f23906f = vq.j.a(obj);
                    c0639a.f23908h = vq.j.a(c0639a);
                    c0639a.f23909j = vq.j.a(obj);
                    c0639a.f23910k = vq.j.a(hVar);
                    c0639a.f23911l = 0;
                    c0639a.f23905e = 1;
                    if (hVar.F(aVarW9, c0639a) == objE) {
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

        public a(mu.g gVar, v vVar) {
            this.f23900a = gVar;
            this.f23901b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c71.i.a> hVar, tq.e eVar) {
            Object objA = this.f23900a.a(new C0638a(hVar, this.f23901b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc71/a$a;", "<unused var>", "Lk10/c0;", "Lc71/b;", "state", "Lk10/l;", "<anonymous>", "(Lc71/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<c71.a.C0634a, k10.c0<c71.b>, tq.e<? super k10.l<? extends c71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23913f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c71.h O(c71.b bVar) {
            return c71.h.f23860a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f23913f;
            uq.b.e();
            if (this.f23912e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: c71.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.b.O((b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c71.a.C0634a c0634a, k10.c0<c71.b> c0Var, tq.e<? super k10.l<? extends c71.b>> eVar) {
            b bVar = new b(eVar);
            bVar.f23913f = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc71/a$b;", "<unused var>", "Lk10/c0;", "Lc71/b;", "state", "Lk10/l;", "<anonymous>", "(Lc71/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<c71.a.b, k10.c0<c71.b>, tq.e<? super k10.l<? extends c71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23915f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c71.e O(c71.b bVar) {
            return c71.e.f23856a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f23915f;
            uq.b.e();
            if (this.f23914e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: c71.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.c.O((b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c71.a.b bVar, k10.c0<c71.b> c0Var, tq.e<? super k10.l<? extends c71.b>> eVar) {
            c cVar = new c(eVar);
            cVar.f23915f = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc71/a$e;", "<unused var>", "Lc71/b;", "Loq/i0;", "<anonymous>", "(Lc71/a$e;Lc71/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<c71.a.e, c71.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23916e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(v vVar, iy.b0 b0Var) {
            vVar.d9(new c71.a.ToWizard(b0Var));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23916e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                final v vVar2 = v.this;
                c71.a.d.ToEdorAuth toEdorAuth = new c71.a.d.ToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: c71.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.d.O(vVar2, (iy.b0) obj2);
                    }
                }, null, 2, null));
                this.f23916e = 1;
                if (vVar.F(toEdorAuth, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c71.a.e eVar, c71.b bVar, tq.e<? super oq.i0> eVar2) {
            return v.this.new d(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc71/a$d$a;", "<unused var>", "Lc71/b;", "Loq/i0;", "<anonymous>", "(Lc71/a$d$a;Lc71/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<c71.a.d.C0635a, c71.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23918e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23918e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                c71.a.d.C0635a c0635a = c71.a.d.C0635a.f23842a;
                this.f23918e = 1;
                if (vVar.F(c0635a, this) == objE) {
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
        public final Object w(c71.a.d.C0635a c0635a, c71.b bVar, tq.e<? super oq.i0> eVar) {
            return v.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lc71/b$a;", "state", "Lk10/l;", "Lc71/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<c71.b.a>, tq.e<? super k10.l<? extends c71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23921f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c71.h O(c71.b.a aVar) {
            return c71.h.f23860a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f23921f;
            uq.b.e();
            if (this.f23920e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: c71.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.f.O((b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<c71.b.a> c0Var, tq.e<? super k10.l<? extends c71.b>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(eVar);
            fVar.f23921f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lc71/h;", "state", "Lk10/l;", "Lc71/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<c71.h>, tq.e<? super k10.l<? extends c71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23923f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lc71/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends c71.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f23925e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f23926f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<c71.h> f23927g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<c71.h> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f23926f = vVar;
                this.f23927g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Y(v vVar, dx.b bVar, c71.h hVar) {
                return new Error(vVar.u9(bVar, c71.a.C0634a.f23839a));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final c71.e Z(c71.h hVar) {
                return c71.e.f23856a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final c71.g a0(c71.h hVar) {
                return c71.g.f23858a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f23925e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.u uVar = this.f23926f.isAdultUC;
                    ml0.u.Params params = new ml0.u.Params(null, 1, null);
                    this.f23925e = 1;
                    obj = uVar.c(params, this);
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
                k10.c0<c71.h> c0Var = this.f23927g;
                final v vVar = this.f23926f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: c71.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.g.a.Y(vVar, bVar, (h) obj2);
                        }
                    });
                }
                if (iVar instanceof dx.i.Right) {
                    return ((Boolean) ((dx.i.Right) iVar).b()).booleanValue() ? c0Var.d(new er.l() { // from class: c71.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.g.a.Z((h) obj2);
                        }
                    }) : c0Var.d(new er.l() { // from class: c71.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.g.a.a0((h) obj2);
                        }
                    });
                }
                throw new oq.p();
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f23926f, this.f23927g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends c71.b>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f23923f;
            Object objE = uq.b.e();
            int i15 = this.f23922e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(v.this, c0Var, null);
            this.f23923f = vq.j.a(c0Var);
            this.f23922e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<c71.h> c0Var, tq.e<? super k10.l<? extends c71.b>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = v.this.new g(eVar);
            gVar.f23923f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lc71/e;", "state", "Lk10/l;", "Lc71/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<c71.e>, tq.e<? super k10.l<? extends c71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23929f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lc71/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends c71.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f23931e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f23932f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<c71.e> f23933g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<c71.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f23932f = vVar;
                this.f23933g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(v vVar, dx.b bVar, c71.e eVar) {
                return new Error(vVar.u9(bVar, c71.a.b.f23840a));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final c71.d Y(c71.e eVar) {
                return c71.d.f23853a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f23931e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jj0.b bVar = this.f23932f.hasTrustedProfileUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f23931e = 1;
                    obj = bVar.c(c1792a, this);
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
                k10.c0<c71.e> c0Var = this.f23933g;
                final v vVar = this.f23932f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: c71.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.h.a.X(vVar, bVar2, (e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                if (!((Boolean) ((dx.i.Right) iVar).b()).booleanValue()) {
                    return c0Var.d(new er.l() { // from class: c71.e0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.h.a.Y((e) obj2);
                        }
                    });
                }
                vVar.d9(c71.a.c.f23841a);
                return c0Var.c();
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f23932f, this.f23933g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends c71.b>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f23929f;
            Object objE = uq.b.e();
            int i15 = this.f23928e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(v.this, c0Var, null);
            this.f23929f = vq.j.a(c0Var);
            this.f23928e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<c71.e> c0Var, tq.e<? super k10.l<? extends c71.b>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = v.this.new h(eVar);
            hVar.f23929f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc71/a$c;", "<unused var>", "Lc71/e;", "Loq/i0;", "<anonymous>", "(Lc71/a$c;Lc71/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<c71.a.c, c71.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23934e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f23936e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f23937f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f23938g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ v f23939h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f23939h = vVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f23938g;
                if (i15 == 0) {
                    oq.u.b(obj);
                    iy.b0 b0VarA = this.f23939h.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a);
                    if (b0VarA != null) {
                        xw.b<c71.a.d> bVarY1 = this.f23939h.Y1();
                        c71.a.d.ToWizard toWizard = new c71.a.d.ToWizard(b0VarA);
                        this.f23936e = vq.j.a(b0VarA);
                        this.f23937f = 0;
                        this.f23938g = 1;
                        if (bVarY1.F(toWizard, this) == objE) {
                            return objE;
                        }
                    } else {
                        this.f23939h.d9(c71.a.e.f23846a);
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f23939h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23934e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = v.this.callActionWithLoaderUseCase;
                a aVar2 = new a(v.this, null);
                this.f23934e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(c71.a.c cVar, c71.e eVar, tq.e<? super oq.i0> eVar2) {
            return v.this.new i(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc71/a$f;", "action", "Lc71/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lc71/a$f;Lc71/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<c71.a.ToWizard, c71.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23941f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c71.a.ToWizard toWizard = (c71.a.ToWizard) this.f23941f;
            Object objE = uq.b.e();
            int i15 = this.f23940e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<c71.a.d> bVarY1 = v.this.Y1();
                c71.a.d.ToWizard toWizard2 = new c71.a.d.ToWizard(toWizard.getEdorAddress());
                this.f23941f = vq.j.a(toWizard);
                this.f23940e = 1;
                if (bVarY1.F(toWizard2, this) == objE) {
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
        public final Object w(c71.a.ToWizard toWizard, c71.e eVar, tq.e<? super oq.i0> eVar2) {
            j jVar = v.this.new j(eVar2);
            jVar.f23941f = toWizard;
            return jVar.J(oq.i0.f148189a);
        }
    }

    public v(yy.a aVar, d71.a aVar2, ib4.c cVar, ml0.u uVar, jj0.b bVar, ac4.a aVar3, hb4.d dVar, l44.e eVar) {
        this.mapper = aVar2;
        this.genericErrorMapper = cVar;
        this.isAdultUC = uVar;
        this.hasTrustedProfileUseCase = bVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.errorVMSFactory = dVar;
        this.getUserEdorAddressUC = eVar;
        c71.b.a aVar4 = c71.b.a.f23851a;
        this.initialState = aVar4;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: c71.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.y9(this.f23883a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), w9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(k10.z zVar) {
        zVar.A(new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(v vVar, k10.z zVar) {
        zVar.A(vVar.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(v vVar, k10.z zVar) {
        zVar.A(vVar.new h(null));
        i iVar = vVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(c71.a.c.class), oVar, iVar);
        zVar.x(q0.c(c71.a.ToWizard.class), oVar, vVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c u9(dx.b domainError, final c71.a retryAction) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: c71.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.v9(retryAction, this, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(c71.a aVar, v vVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                if (aVar != null) {
                    vVar.d9(aVar);
                }
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                vVar.d9(c71.a.d.C0635a.f23842a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c71.i.a w9(c71.b state) {
        return this.mapper.b(new d71.a.Params(state, b9(c71.a.d.C0635a.f23842a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(c71.b.class), new er.l() { // from class: c71.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.z9(this.f23884a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(c71.b.a.class), new er.l() { // from class: c71.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.A9((k10.z) obj);
            }
        });
        vVar2.c(q0.c(c71.h.class), new er.l() { // from class: c71.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.B9(this.f23885a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(c71.e.class), new er.l() { // from class: c71.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9(this.f23886a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(v vVar, k10.z zVar) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(c71.a.C0634a.class), oVar, bVar);
        zVar.v(q0.c(c71.a.b.class), oVar, new c(null));
        zVar.x(q0.c(c71.a.e.class), oVar, vVar.new d(null));
        zVar.x(q0.c(c71.a.d.C0635a.class), oVar, vVar.new e(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c71.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<c71.b, c71.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c71.i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(c71.a.d dVar, tq.e<? super oq.i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
