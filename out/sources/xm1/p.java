package xm1;

import al0.IdCardSuspensionChildData;
import fr.q0;
import iy.b0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import pu3.ConfirmationDocumentResult;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lxm1/p;", "Ll00/g;", "Lxm1/b;", "Lxm1/a;", "Lxm1/c;", "", "Lyy/a;", "stateMachineFactory", "Lzm1/f;", "mapper", "Ljm1/a;", "isChildDataCorrectUC", "Lkm1/a;", "createConfirmationDocumentDataUC", "Lym1/a;", "contract", "<init>", "(Lyy/a;Lzm1/f;Ljm1/a;Lkm1/a;Lym1/a;)V", "state", "Lxm1/c$a;", "s9", "(Lxm1/b;)Lxm1/c$a;", "b", "Lzm1/f;", "c", "Ljm1/a;", "d", "Lkm1/a;", "e", "Lym1/a;", "r9", "()Lym1/a;", "f", "Lxm1/b;", "initialState", "Lxw/b;", "Lxm1/a$a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, xm1.a> implements xm1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zm1.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jm1.a isChildDataCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final km1.a createConfirmationDocumentDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ym1.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xm1.a.InterfaceC5865a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, xm1.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<xm1.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<xw.g, i0> {
        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(xw.g gVar) {
            c(gVar.getValue());
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            p.this.d9(new xm1.a.OnPeselChanged(b0Var, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<xm1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f219780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f219781b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f219782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f219783b;

            /* JADX INFO: renamed from: xm1.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5867a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f219784d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f219785e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f219786f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f219788h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f219789j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f219790k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f219791l;

                public C5867a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f219784d = obj;
                    this.f219785e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f219782a = hVar;
                this.f219783b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5867a c5867a;
                if (eVar instanceof C5867a) {
                    c5867a = (C5867a) eVar;
                    int i15 = c5867a.f219785e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5867a.f219785e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5867a = new C5867a(eVar);
                    }
                } else {
                    c5867a = new C5867a(eVar);
                }
                Object obj2 = c5867a.f219784d;
                Object objE = uq.b.e();
                int i16 = c5867a.f219785e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f219782a;
                    xm1.c.Data dataS9 = this.f219783b.s9((State) obj);
                    c5867a.f219786f = vq.j.a(obj);
                    c5867a.f219788h = vq.j.a(c5867a);
                    c5867a.f219789j = vq.j.a(obj);
                    c5867a.f219790k = vq.j.a(hVar);
                    c5867a.f219791l = 0;
                    c5867a.f219785e = 1;
                    if (hVar.F(dataS9, c5867a) == objE) {
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

        public b(mu.g gVar, p pVar) {
            this.f219780a = gVar;
            this.f219781b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super xm1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f219780a.a(new a(hVar, this.f219781b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxm1/a$d;", "action", "Lk10/c0;", "Lxm1/b;", "state", "Lk10/l;", "<anonymous>", "(Lxm1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<xm1.a.OnFirstNameChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f219793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f219794g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(xm1.a.OnFirstNameChanged onFirstNameChanged, State state) {
            return State.b(state, null, state.c().a(hz.b.d.f86848c, onFirstNameChanged.getFirstName()), null, null, null, null, null, 125, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xm1.a.OnFirstNameChanged onFirstNameChanged = (xm1.a.OnFirstNameChanged) this.f219793f;
            c0 c0Var = (c0) this.f219794g;
            uq.b.e();
            if (this.f219792e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xm1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(onFirstNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xm1.a.OnFirstNameChanged onFirstNameChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f219793f = onFirstNameChanged;
            cVar.f219794g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxm1/a$i;", "action", "Lk10/c0;", "Lxm1/b;", "state", "Lk10/l;", "<anonymous>", "(Lxm1/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<xm1.a.OnSecondNameChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f219796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f219797g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(xm1.a.OnSecondNameChanged onSecondNameChanged, State state) {
            return State.b(state, null, null, state.g().a(hz.b.d.f86848c, onSecondNameChanged.getSecondName()), null, null, null, null, 123, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xm1.a.OnSecondNameChanged onSecondNameChanged = (xm1.a.OnSecondNameChanged) this.f219796f;
            c0 c0Var = (c0) this.f219797g;
            uq.b.e();
            if (this.f219795e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xm1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(onSecondNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xm1.a.OnSecondNameChanged onSecondNameChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f219796f = onSecondNameChanged;
            dVar.f219797g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxm1/a$j;", "action", "Lk10/c0;", "Lxm1/b;", "state", "Lk10/l;", "<anonymous>", "(Lxm1/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xm1.a.OnSurnameChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f219799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f219800g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(xm1.a.OnSurnameChanged onSurnameChanged, State state) {
            return State.b(state, null, null, null, state.h().a(hz.b.d.f86848c, onSurnameChanged.getSurname()), null, null, null, 119, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xm1.a.OnSurnameChanged onSurnameChanged = (xm1.a.OnSurnameChanged) this.f219799f;
            c0 c0Var = (c0) this.f219800g;
            uq.b.e();
            if (this.f219798e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xm1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(onSurnameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xm1.a.OnSurnameChanged onSurnameChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f219799f = onSurnameChanged;
            eVar2.f219800g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxm1/a$g;", "action", "Lk10/c0;", "Lxm1/b;", "state", "Lk10/l;", "<anonymous>", "(Lxm1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<xm1.a.OnPeselChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f219802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f219803g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(b0 b0Var, State state) {
            return State.b(state, null, null, null, null, state.e().a(hz.b.d.f86848c, xw.g.b(b0Var)), null, null, 111, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xm1.a.OnPeselChanged onPeselChanged = (xm1.a.OnPeselChanged) this.f219802f;
            c0 c0Var = (c0) this.f219803g;
            uq.b.e();
            if (this.f219801e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String strE = iy.c0.e(onPeselChanged.getPesel());
            StringBuilder sb5 = new StringBuilder();
            int length = strE.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = strE.charAt(i15);
                if (Character.isDigit(cCharAt)) {
                    sb5.append(cCharAt);
                }
            }
            final b0 b0VarC = xw.g.c(iy.c0.g(sb5.toString()));
            return c0Var.b(new er.l() { // from class: xm1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O(b0VarC, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xm1.a.OnPeselChanged onPeselChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f219802f = onPeselChanged;
            fVar.f219803g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxm1/a$e;", "action", "Lk10/c0;", "Lxm1/b;", "state", "Lk10/l;", "<anonymous>", "(Lxm1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<xm1.a.OnIdSeriesAndNumberChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f219805f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f219806g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(b0 b0Var, State state) {
            return State.b(state, null, null, null, null, null, state.d().a(hz.b.d.f86848c, b0Var), null, 95, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xm1.a.OnIdSeriesAndNumberChanged onIdSeriesAndNumberChanged = (xm1.a.OnIdSeriesAndNumberChanged) this.f219805f;
            c0 c0Var = (c0) this.f219806g;
            uq.b.e();
            if (this.f219804e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String strE = iy.c0.e(onIdSeriesAndNumberChanged.getIdSeriesAndNumber());
            StringBuilder sb5 = new StringBuilder();
            for (int i15 = 0; i15 < strE.length(); i15++) {
                char cCharAt = strE.charAt(i15);
                if (!fu.a.c(cCharAt)) {
                    sb5.append(cCharAt);
                }
            }
            final b0 b0VarG = iy.c0.g(sb5.toString().toUpperCase(Locale.ROOT));
            return c0Var.b(new er.l() { // from class: xm1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O(b0VarG, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xm1.a.OnIdSeriesAndNumberChanged onIdSeriesAndNumberChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f219805f = onIdSeriesAndNumberChanged;
            gVar.f219806g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxm1/a$f;", "<unused var>", "Lk10/c0;", "Lxm1/b;", "state", "Lk10/l;", "<anonymous>", "(Lxm1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<xm1.a.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f219807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f219808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f219809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f219810h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f219811j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f219812k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f219813l;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            Object next;
            State.Field fieldB = State.Field.b(state.c(), (hz.b) v0.j(map, im1.a.FIRST_NAME), null, 2, null);
            State.Field fieldB2 = State.Field.b(state.g(), (hz.b) v0.j(map, im1.a.SECOND_NAME), null, 2, null);
            State.Field fieldB3 = State.Field.b(state.h(), (hz.b) v0.j(map, im1.a.SURNAME), null, 2, null);
            State.Field fieldB4 = State.Field.b(state.e(), (hz.b) v0.j(map, im1.a.PESEL), null, 2, null);
            State.Field fieldB5 = State.Field.b(state.d(), (hz.b) v0.j(map, im1.a.ID_SERIES_AND_NUMBER), null, 2, null);
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.b.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return State.b(state, null, fieldB, fieldB2, fieldB3, fieldB4, fieldB5, entry != null ? (im1.a) entry.getKey() : null, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f219813l;
            Object objE = uq.b.e();
            int i15 = this.f219812k;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f219808f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            final Map<im1.a, hz.b> mapB = p.this.isChildDataCorrectUC.b(new jm1.a.Params(((State) c0Var.a()).getType(), ((State) c0Var.a()).c().d(), ((State) c0Var.a()).g().d(), ((State) c0Var.a()).h().d(), ((State) c0Var.a()).e().d().getValue(), ((State) c0Var.a()).d().d(), null));
            p pVar = p.this;
            if (!mapB.isEmpty()) {
                Iterator<Map.Entry<im1.a, hz.b>> it = mapB.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() instanceof hz.b.Invalid) {
                        return c0Var.b(new er.l() { // from class: xm1.v
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return p.h.O(mapB, (State) obj2);
                            }
                        });
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            pVar.getContract().h(new IdCardSuspensionChildData(((State) c0Var.a()).c().d(), ((State) c0Var.a()).e().d().getValue(), ((State) c0Var.a()).h().d(), ((State) c0Var.a()).g().d(), ((State) c0Var.a()).d().d(), null));
            km1.a aVar = pVar.createConfirmationDocumentDataUC;
            mm1.a type = pVar.getContract().getType();
            ConfirmationDocumentResult confirmationDocumentResultD = pVar.getContract().d();
            xm1.a.InterfaceC5865a.Next next = new xm1.a.InterfaceC5865a.Next(aVar.b(new km1.a.Params(type, confirmationDocumentResultD != null ? confirmationDocumentResultD.getDocument() : null)));
            this.f219813l = vq.j.a(c0Var);
            this.f219807e = vq.j.a(mapB);
            this.f219808f = lVarC;
            this.f219809g = vq.j.a(lVarC);
            this.f219810h = 0;
            this.f219811j = 0;
            this.f219812k = 1;
            return pVar.F(next, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xm1.a.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f219813l = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxm1/a$h;", "<unused var>", "Lk10/c0;", "Lxm1/b;", "state", "Lk10/l;", "<anonymous>", "(Lxm1/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<xm1.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f219816f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, null, 63, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f219816f;
            uq.b.e();
            if (this.f219815e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xm1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.i.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xm1.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = new i(eVar);
            iVar.f219816f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxm1/a$b;", "<unused var>", "Lxm1/b;", "Loq/i0;", "<anonymous>", "(Lxm1/a$b;Lxm1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<xm1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219817e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f219817e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                xm1.a.InterfaceC5865a.C5866a c5866a = xm1.a.InterfaceC5865a.C5866a.f219711a;
                this.f219817e = 1;
                if (pVar.F(c5866a, this) == objE) {
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
        public final Object w(xm1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return p.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxm1/a$c;", "<unused var>", "Lxm1/b;", "Loq/i0;", "<anonymous>", "(Lxm1/a$c;Lxm1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<xm1.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f219819e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f219819e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                xm1.a.InterfaceC5865a.b bVar = xm1.a.InterfaceC5865a.b.f219712a;
                this.f219819e = 1;
                if (pVar.F(bVar, this) == objE) {
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
        public final Object w(xm1.a.c cVar, State state, tq.e<? super i0> eVar) {
            return p.this.new k(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, zm1.f fVar, jm1.a aVar2, km1.a aVar3, ym1.a aVar4) {
        b0 seriesAndNumber;
        b0 surname;
        b0 secondName;
        b0 firstName;
        this.mapper = fVar;
        this.isChildDataCorrectUC = aVar2;
        this.createConfirmationDocumentDataUC = aVar3;
        this.contract = aVar4;
        IdCardSuspensionChildData idCardSuspensionChildDataA = aVar4.a();
        State state = new State(aVar4.getType(), new State.Field(null, (idCardSuspensionChildDataA == null || (firstName = idCardSuspensionChildDataA.getFirstName()) == null) ? b0.INSTANCE.a() : firstName, 1, null), new State.Field(null, (idCardSuspensionChildDataA == null || (secondName = idCardSuspensionChildDataA.getSecondName()) == null) ? b0.INSTANCE.a() : secondName, 1, null), new State.Field(null, (idCardSuspensionChildDataA == null || (surname = idCardSuspensionChildDataA.getSurname()) == null) ? b0.INSTANCE.a() : surname, 1, null), new State.Field(null, xw.g.b(idCardSuspensionChildDataA != null ? idCardSuspensionChildDataA.getPesel() : xw.g.INSTANCE.a()), 1, null), new State.Field(null, (idCardSuspensionChildDataA == null || (seriesAndNumber = idCardSuspensionChildDataA.getSeriesAndNumber()) == null) ? b0.INSTANCE.a() : seriesAndNumber, 1, null), null, 64, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: xm1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f219770a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), s9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xm1.c.Data s9(State state) {
        return this.mapper.b(new zm1.f.Params(state, new er.l() { // from class: xm1.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f219765a, (b0) obj);
            }
        }, new er.l() { // from class: xm1.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f219766a, (b0) obj);
            }
        }, new er.l() { // from class: xm1.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f219767a, (b0) obj);
            }
        }, new a(), new er.l() { // from class: xm1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f219768a, (b0) obj);
            }
        }, b9(xm1.a.h.f219723a), b9(xm1.a.b.f219714a), b9(xm1.a.c.f219715a), b9(xm1.a.f.f219720a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, b0 b0Var) {
        pVar.d9(new xm1.a.OnFirstNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(p pVar, b0 b0Var) {
        pVar.d9(new xm1.a.OnSecondNameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(p pVar, b0 b0Var) {
        pVar.d9(new xm1.a.OnSurnameChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, b0 b0Var) {
        pVar.d9(new xm1.a.OnIdSeriesAndNumberChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: xm1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f219769a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(p pVar, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(xm1.a.OnFirstNameChanged.class), oVar, cVar);
        zVar.v(q0.c(xm1.a.OnSecondNameChanged.class), oVar, new d(null));
        zVar.v(q0.c(xm1.a.OnSurnameChanged.class), oVar, new e(null));
        zVar.v(q0.c(xm1.a.OnPeselChanged.class), oVar, new f(null));
        zVar.v(q0.c(xm1.a.OnIdSeriesAndNumberChanged.class), oVar, new g(null));
        zVar.v(q0.c(xm1.a.f.class), oVar, pVar.new h(null));
        zVar.v(q0.c(xm1.a.h.class), oVar, new i(null));
        zVar.x(q0.c(xm1.a.b.class), oVar, pVar.new j(null));
        zVar.x(q0.c(xm1.a.c.class), oVar, pVar.new k(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<xm1.a.InterfaceC5865a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, xm1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<xm1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xm1.a.InterfaceC5865a interfaceC5865a, tq.e<? super i0> eVar) {
        return super.F(interfaceC5865a, eVar);
    }

    /* JADX INFO: renamed from: r9, reason: from getter */
    public final ym1.a getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ym1.a aVar) {
        super.P5(aVar);
    }
}
