package r21;

import fr.q0;
import j21.SetupData;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lr21/q;", "Ll00/g;", "Lr21/f;", "", "Lr21/g;", "Lyy/a;", "stateMachineFactory", "Ls21/a;", "mapper", "Lh21/m;", "isChatbotDisclaimerEnabledUC", "<init>", "(Lyy/a;Ls21/a;Lh21/m;)V", "state", "Lr21/g$a;", "n9", "(Lr21/f;)Lr21/g$a;", "b", "Ls21/a;", "c", "Lh21/m;", "Lr21/f$b;", "d", "Lr21/f$b;", "initialState", "Lxw/b;", "Lr21/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<r21.f, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s21.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h21.m isChatbotDisclaimerEnabledUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r21.f.b initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r21.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<r21.f, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f170906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f170907b;

        /* JADX INFO: renamed from: r21.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4333a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f170908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f170909b;

            /* JADX INFO: renamed from: r21.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4334a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f170910d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f170911e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f170912f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f170914h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f170915j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f170916k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f170917l;

                public C4334a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f170910d = obj;
                    this.f170911e |= PKIFailureInfo.systemUnavail;
                    return C4333a.this.F(null, this);
                }
            }

            public C4333a(mu.h hVar, q qVar) {
                this.f170908a = hVar;
                this.f170909b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4334a c4334a;
                if (eVar instanceof C4334a) {
                    c4334a = (C4334a) eVar;
                    int i15 = c4334a.f170911e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4334a.f170911e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4334a = new C4334a(eVar);
                    }
                } else {
                    c4334a = new C4334a(eVar);
                }
                Object obj2 = c4334a.f170910d;
                Object objE = uq.b.e();
                int i16 = c4334a.f170911e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f170908a;
                    g.a aVarN9 = this.f170909b.n9((r21.f) obj);
                    c4334a.f170912f = vq.j.a(obj);
                    c4334a.f170914h = vq.j.a(c4334a);
                    c4334a.f170915j = vq.j.a(obj);
                    c4334a.f170916k = vq.j.a(hVar);
                    c4334a.f170917l = 0;
                    c4334a.f170911e = 1;
                    if (hVar.F(aVarN9, c4334a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f170906a = gVar;
            this.f170907b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.a> hVar, tq.e eVar) {
            Object objA = this.f170906a.a(new C4333a(hVar, this.f170907b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lr21/f$b;", "state", "Lk10/l;", "Lr21/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<r21.f.b>, tq.e<? super k10.l<? extends r21.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f170920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f170921h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f170922j;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r21.f.Initialized O(r21.f.b bVar) {
            return new r21.f.Initialized(false, false, false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f170922j;
            Object objE = uq.b.e();
            int i15 = this.f170921h;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f170918e;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            boolean zBooleanValue = q.this.isChatbotDisclaimerEnabledUC.b(gz.b.a.C1792a.f78542a).booleanValue();
            if (zBooleanValue) {
                return c0Var.d(new er.l() { // from class: r21.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.b.O((f.b) obj2);
                    }
                });
            }
            if (zBooleanValue) {
                throw new oq.p();
            }
            k10.l lVarC = c0Var.c();
            q qVar = q.this;
            r21.a.Next next = new r21.a.Next(new SetupData(false));
            this.f170922j = vq.j.a(c0Var);
            this.f170918e = lVarC;
            this.f170919f = vq.j.a(lVarC);
            this.f170920g = 0;
            this.f170921h = 1;
            return qVar.F(next, this) == objE ? objE : lVarC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<r21.f.b> c0Var, tq.e<? super k10.l<? extends r21.f>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = q.this.new b(eVar);
            bVar.f170922j = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr21/b;", "action", "Lk10/c0;", "Lr21/f$a;", "state", "Lk10/l;", "Lr21/f;", "<anonymous>", "(Lr21/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnAgreementAccepted, c0<r21.f.Initialized>, tq.e<? super k10.l<? extends r21.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170925f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f170926g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r21.f.Initialized O(OnAgreementAccepted onAgreementAccepted, r21.f.Initialized initialized) {
            return r21.f.Initialized.b(initialized, onAgreementAccepted.getAccepted(), false, false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnAgreementAccepted onAgreementAccepted = (OnAgreementAccepted) this.f170925f;
            c0 c0Var = (c0) this.f170926g;
            uq.b.e();
            if (this.f170924e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r21.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O(onAgreementAccepted, (f.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnAgreementAccepted onAgreementAccepted, c0<r21.f.Initialized> c0Var, tq.e<? super k10.l<? extends r21.f>> eVar) {
            c cVar = new c(eVar);
            cVar.f170925f = onAgreementAccepted;
            cVar.f170926g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr21/e;", "<unused var>", "Lk10/c0;", "Lr21/f$a;", "state", "Lk10/l;", "Lr21/f;", "<anonymous>", "(Lr21/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<r21.e, c0<r21.f.Initialized>, tq.e<? super k10.l<? extends r21.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f170928f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r21.f.Initialized O(r21.f.Initialized initialized) {
            return r21.f.Initialized.b(initialized, false, false, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f170928f;
            uq.b.e();
            if (this.f170927e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r21.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O((f.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r21.e eVar, c0<r21.f.Initialized> c0Var, tq.e<? super k10.l<? extends r21.f>> eVar2) {
            d dVar = new d(eVar2);
            dVar.f170928f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr21/d;", "<unused var>", "Lk10/c0;", "Lr21/f$a;", "state", "Lk10/l;", "Lr21/f;", "<anonymous>", "(Lr21/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<r21.d, c0<r21.f.Initialized>, tq.e<? super k10.l<? extends r21.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f170931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f170932h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f170933j;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r21.f.Initialized O(r21.f.Initialized initialized) {
            return r21.f.Initialized.b(initialized, false, true, true, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f170933j;
            Object objE = uq.b.e();
            int i15 = this.f170932h;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f170929e;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            boolean isAgreementAccepted = ((r21.f.Initialized) c0Var.a()).getIsAgreementAccepted();
            if (!isAgreementAccepted) {
                if (isAgreementAccepted) {
                    throw new oq.p();
                }
                return c0Var.b(new er.l() { // from class: r21.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.e.O((f.Initialized) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            q qVar = q.this;
            r21.a.Next next = new r21.a.Next(new SetupData(true));
            this.f170933j = vq.j.a(c0Var);
            this.f170929e = lVarC;
            this.f170930f = vq.j.a(lVarC);
            this.f170931g = 0;
            this.f170932h = 1;
            return qVar.F(next, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r21.d dVar, c0<r21.f.Initialized> c0Var, tq.e<? super k10.l<? extends r21.f>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f170933j = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr21/c;", "<unused var>", "Lr21/f$a;", "Loq/i0;", "<anonymous>", "(Lr21/c;Lr21/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<r21.c, r21.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170935e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f170935e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                r21.a.C4330a c4330a = r21.a.C4330a.f170863a;
                this.f170935e = 1;
                if (qVar.F(c4330a, this) == objE) {
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
        public final Object w(r21.c cVar, r21.f.Initialized initialized, tq.e<? super i0> eVar) {
            return q.this.new f(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, s21.a aVar2, h21.m mVar) {
        this.mapper = aVar2;
        this.isChatbotDisclaimerEnabledUC = mVar;
        r21.f.b bVar = r21.f.b.f170872a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: r21.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f170896a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.a n9(r21.f state) {
        return this.mapper.b(new s21.a.Params(state, new er.l() { // from class: r21.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f170899a, ((Boolean) obj).booleanValue());
            }
        }, b9(r21.e.f170868a), b9(r21.c.f170866a), b9(r21.d.f170867a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(q qVar, boolean z15) {
        qVar.d9(new OnAgreementAccepted(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(r21.f.b.class), new er.l() { // from class: r21.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f170897a, (z) obj);
            }
        });
        vVar.c(q0.c(r21.f.Initialized.class), new er.l() { // from class: r21.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f170898a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, z zVar) {
        zVar.A(qVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnAgreementAccepted.class), oVar, cVar);
        zVar.v(q0.c(r21.e.class), oVar, new d(null));
        zVar.v(q0.c(r21.d.class), oVar, qVar.new e(null));
        zVar.x(q0.c(r21.c.class), oVar, qVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<r21.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<r21.f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(r21.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
