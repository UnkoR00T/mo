package gp1;

import fp1.ShortcutsMoreModel;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lgp1/m;", "Ll00/g;", "Lgp1/b;", "Lgp1/a;", "Lgp1/c;", "", "Lyy/a;", "stateMachineFactory", "Lgp1/d;", "mapper", "Li70/e;", "globalSnackBarManager", "<init>", "(Lyy/a;Lgp1/d;Li70/e;)V", "state", "Lgp1/c$a;", "n9", "(Lgp1/b;)Lgp1/c$a;", "b", "Lgp1/d;", "c", "Li70/e;", "d", "Lgp1/b;", "initialState", "Lxw/b;", "Lgp1/a$b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, gp1.a> implements gp1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gp1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gp1.a.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, gp1.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<gp1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<gp1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f75877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f75878b;

        /* JADX INFO: renamed from: gp1.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1714a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f75879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f75880b;

            /* JADX INFO: renamed from: gp1.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1715a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f75881d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f75882e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f75883f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f75885h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f75886j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f75887k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f75888l;

                public C1715a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f75881d = obj;
                    this.f75882e |= PKIFailureInfo.systemUnavail;
                    return C1714a.this.F(null, this);
                }
            }

            public C1714a(mu.h hVar, m mVar) {
                this.f75879a = hVar;
                this.f75880b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1715a c1715a;
                if (eVar instanceof C1715a) {
                    c1715a = (C1715a) eVar;
                    int i15 = c1715a.f75882e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1715a.f75882e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1715a = new C1715a(eVar);
                    }
                } else {
                    c1715a = new C1715a(eVar);
                }
                Object obj2 = c1715a.f75881d;
                Object objE = uq.b.e();
                int i16 = c1715a.f75882e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f75879a;
                    gp1.c.Data dataN9 = this.f75880b.n9((State) obj);
                    c1715a.f75883f = vq.j.a(obj);
                    c1715a.f75885h = vq.j.a(c1715a);
                    c1715a.f75886j = vq.j.a(obj);
                    c1715a.f75887k = vq.j.a(hVar);
                    c1715a.f75888l = 0;
                    c1715a.f75882e = 1;
                    if (hVar.F(dataN9, c1715a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f75877a = gVar;
            this.f75878b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super gp1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f75877a.a(new C1714a(hVar, this.f75878b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgp1/a$g;", "<unused var>", "Lgp1/b;", "Loq/i0;", "<anonymous>", "(Lgp1/a$g;Lgp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<gp1.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75889e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f75889e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.d9(new gp1.a.ShowGlobalSnackbar("Akcja przejścia do Usuń dokument"));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gp1.a.g gVar, State state, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgp1/a$a;", "<unused var>", "Lgp1/b;", "Loq/i0;", "<anonymous>", "(Lgp1/a$a;Lgp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<gp1.a.C1711a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75891e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f75891e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<gp1.a.b> bVarY1 = m.this.Y1();
                gp1.a.b.C1712a c1712a = gp1.a.b.C1712a.f75836a;
                this.f75891e = 1;
                if (bVarY1.F(c1712a, this) == objE) {
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
        public final Object w(gp1.a.C1711a c1711a, State state, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgp1/a$d;", "action", "Lgp1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgp1/a$d;Lgp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<gp1.a.ShowGlobalSnackbar, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75894f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gp1.a.ShowGlobalSnackbar showGlobalSnackbar = (gp1.a.ShowGlobalSnackbar) this.f75894f;
            uq.b.e();
            if (this.f75893e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.globalSnackBarManager.y(new p50.a.Default(mx.b.b(showGlobalSnackbar.getMessage(), ""), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gp1.a.ShowGlobalSnackbar showGlobalSnackbar, State state, tq.e<? super i0> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f75894f = showGlobalSnackbar;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgp1/a$e;", "action", "Lk10/c0;", "Lgp1/b;", "state", "Lk10/l;", "<anonymous>", "(Lgp1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<gp1.a.ShowLocalSnackbar, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f75898g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(gp1.a.ShowLocalSnackbar showLocalSnackbar, State state) {
            return state.a(new i70.p.Visible(new p50.a.Default(mx.b.b(showLocalSnackbar.getMessage(), ""), false, null, 6, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gp1.a.ShowLocalSnackbar showLocalSnackbar = (gp1.a.ShowLocalSnackbar) this.f75897f;
            c0 c0Var = (c0) this.f75898g;
            uq.b.e();
            if (this.f75896e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: gp1.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.e.O(showLocalSnackbar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gp1.a.ShowLocalSnackbar showLocalSnackbar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f75897f = showLocalSnackbar;
            eVar2.f75898g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgp1/a$c;", "action", "Lk10/c0;", "Lgp1/b;", "state", "Lk10/l;", "<anonymous>", "(Lgp1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<gp1.a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75900f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(i70.p.a.f89857a);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f75900f;
            uq.b.e();
            if (this.f75899e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: gp1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gp1.a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f75900f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgp1/a$i;", "action", "Lgp1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgp1/a$i;Lgp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<gp1.a.ToMoreDialog, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75902f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gp1.a.ToMoreDialog toMoreDialog = (gp1.a.ToMoreDialog) this.f75902f;
            Object objE = uq.b.e();
            int i15 = this.f75901e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                gp1.a.b.ToMoreDialog toMoreDialog2 = new gp1.a.b.ToMoreDialog(new ShortcutsMoreModel(toMoreDialog.a()));
                this.f75902f = vq.j.a(toMoreDialog);
                this.f75901e = 1;
                if (mVar.F(toMoreDialog2, this) == objE) {
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
        public final Object w(gp1.a.ToMoreDialog toMoreDialog, State state, tq.e<? super i0> eVar) {
            g gVar = m.this.new g(eVar);
            gVar.f75902f = toMoreDialog;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgp1/a$f;", "<unused var>", "Lgp1/b;", "Loq/i0;", "<anonymous>", "(Lgp1/a$f;Lgp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<gp1.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75904e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f75904e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.d9(new gp1.a.ShowGlobalSnackbar("Akcja przejścia do Potwierdź swoje dane"));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gp1.a.f fVar, State state, tq.e<? super i0> eVar) {
            return m.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgp1/a$h;", "<unused var>", "Lgp1/b;", "Loq/i0;", "<anonymous>", "(Lgp1/a$h;Lgp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<gp1.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75906e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f75906e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.d9(new gp1.a.ShowLocalSnackbar("Akcja przejścia do Firma"));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gp1.a.h hVar, State state, tq.e<? super i0> eVar) {
            return m.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgp1/a$j;", "<unused var>", "Lgp1/b;", "Loq/i0;", "<anonymous>", "(Lgp1/a$j;Lgp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<gp1.a.j, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75908e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f75908e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.d9(new gp1.a.ShowGlobalSnackbar("Akcja przejścia do Zastrzeż pesel"));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gp1.a.j jVar, State state, tq.e<? super i0> eVar) {
            return m.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgp1/a$k;", "<unused var>", "Lgp1/b;", "Loq/i0;", "<anonymous>", "(Lgp1/a$k;Lgp1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<gp1.a.k, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75910e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f75910e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.d9(new gp1.a.ShowGlobalSnackbar("Akcja przejścia do Weryfikacja peselu"));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gp1.a.k kVar, State state, tq.e<? super i0> eVar) {
            return m.this.new k(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, gp1.d dVar, i70.e eVar) {
        this.mapper = dVar;
        this.globalSnackBarManager = eVar;
        State state = new State(null, 1, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: gp1.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f75868a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gp1.c.Data n9(State state) {
        return this.mapper.b(new gp1.d.Params(state, b9(gp1.a.C1711a.f75835a), b9(gp1.a.f.f75841a), b9(gp1.a.h.f75843a), b9(gp1.a.j.f75845a), b9(gp1.a.k.f75846a), b9(gp1.a.g.f75842a), new er.l() { // from class: gp1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f75870a, (List) obj);
            }
        }, b9(gp1.a.c.f75838a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(m mVar, List list) {
        mVar.d9(new gp1.a.ToMoreDialog(list));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: gp1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.r9(this.f75869a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(m mVar, z zVar) {
        c cVar = mVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gp1.a.C1711a.class), oVar, cVar);
        zVar.x(q0.c(gp1.a.ShowGlobalSnackbar.class), oVar, mVar.new d(null));
        zVar.v(q0.c(gp1.a.ShowLocalSnackbar.class), oVar, new e(null));
        zVar.v(q0.c(gp1.a.c.class), oVar, new f(null));
        zVar.x(q0.c(gp1.a.ToMoreDialog.class), oVar, mVar.new g(null));
        zVar.x(q0.c(gp1.a.f.class), oVar, mVar.new h(null));
        zVar.x(q0.c(gp1.a.h.class), oVar, mVar.new i(null));
        zVar.x(q0.c(gp1.a.j.class), oVar, mVar.new j(null));
        zVar.x(q0.c(gp1.a.k.class), oVar, mVar.new k(null));
        zVar.x(q0.c(gp1.a.g.class), oVar, mVar.new b(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<gp1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, gp1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gp1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(gp1.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(gp1.c.Data data) {
        super.P5(data);
    }
}
