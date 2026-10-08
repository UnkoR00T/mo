package eb2;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001/B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Leb2/r;", "Ll00/g;", "Leb2/f;", "", "Leb2/g;", "Lyy/a;", "stateMachineFactory", "Lbb2/b;", "formatIdCardApplicationNumberUC", "Lbb2/a;", "checkIdCollectingNumberIsCorrectUC", "Leb2/i;", "mapper", "<init>", "(Lyy/a;Lbb2/b;Lbb2/a;Leb2/i;)V", "state", "Leb2/g$a;", "n9", "(Leb2/f;)Leb2/g$a;", "b", "Lbb2/b;", "c", "Lbb2/a;", "d", "Leb2/i;", "e", "Leb2/f;", "initialState", "Lxw/b;", "Leb2/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "j", "a", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f49235k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bb2.b formatIdCardApplicationNumberUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bb2.a checkIdCollectingNumberIsCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f49243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f49244b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f49245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f49246b;

            /* JADX INFO: renamed from: eb2.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1162a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49247d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49248e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49249f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49251h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49252j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49253k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49254l;

                public C1162a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49247d = obj;
                    this.f49248e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f49245a = hVar;
                this.f49246b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1162a c1162a;
                if (eVar instanceof C1162a) {
                    c1162a = (C1162a) eVar;
                    int i15 = c1162a.f49248e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1162a.f49248e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1162a = new C1162a(eVar);
                    }
                } else {
                    c1162a = new C1162a(eVar);
                }
                Object obj2 = c1162a.f49247d;
                Object objE = uq.b.e();
                int i16 = c1162a.f49248e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f49245a;
                    g.Data dataN9 = this.f49246b.n9((State) obj);
                    c1162a.f49249f = vq.j.a(obj);
                    c1162a.f49251h = vq.j.a(c1162a);
                    c1162a.f49252j = vq.j.a(obj);
                    c1162a.f49253k = vq.j.a(hVar);
                    c1162a.f49254l = 0;
                    c1162a.f49248e = 1;
                    if (hVar.F(dataN9, c1162a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f49243a = gVar;
            this.f49244b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f49243a.a(new a(hVar, this.f49244b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leb2/c;", "action", "Lk10/c0;", "Leb2/f;", "state", "Lk10/l;", "<anonymous>", "(Leb2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnFieldChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49257g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(b0 b0Var, State state) {
            return State.b(state, b0Var, hz.b.d.f86848c, false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnFieldChanged onFieldChanged = (OnFieldChanged) this.f49256f;
            c0 c0Var = (c0) this.f49257g;
            uq.b.e();
            if (this.f49255e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String strE = iy.c0.e(onFieldChanged.getValue());
            StringBuilder sb5 = new StringBuilder();
            int length = strE.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = strE.charAt(i15);
                if (Character.isDigit(cCharAt)) {
                    sb5.append(cCharAt);
                }
            }
            final b0 b0VarG = iy.c0.g(fu.r.H1(sb5.toString(), 20));
            return c0Var.b(new er.l() { // from class: eb2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c.O(b0VarG, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnFieldChanged onFieldChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f49256f = onFieldChanged;
            cVar.f49257g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leb2/e;", "<unused var>", "Lk10/c0;", "Leb2/f;", "state", "Lk10/l;", "<anonymous>", "(Leb2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<eb2.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49259f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49259f;
            uq.b.e();
            if (this.f49258e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: eb2.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.d.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eb2.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            d dVar = new d(eVar2);
            dVar.f49259f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leb2/d;", "<unused var>", "Lk10/c0;", "Leb2/f;", "state", "Lk10/l;", "<anonymous>", "(Leb2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<eb2.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f49260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f49261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f49262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f49263h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f49264j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f49265k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f49266l;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage()), true, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00f1 A[RETURN] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.g gVar;
            k10.l lVarC;
            r rVar;
            k10.l lVar;
            int i15;
            a.Next next;
            c0 c0Var = (c0) this.f49266l;
            Object objE = uq.b.e();
            int i16 = this.f49265k;
            if (i16 == 0) {
                oq.u.b(obj);
                bb2.a aVar = r.this.checkIdCollectingNumberIsCorrectUC;
                bb2.a.Params params = new bb2.a.Params(iy.c0.e(((State) c0Var.a()).getApplicationNumber()));
                this.f49266l = c0Var;
                this.f49265k = 1;
                obj = aVar.d(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i16 == 1) {
                oq.u.b(obj);
            } else {
                if (i16 != 2) {
                    if (i16 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar2 = (k10.l) this.f49261f;
                    oq.u.b(obj);
                    return lVar2;
                }
                i15 = this.f49264j;
                rVar = (r) this.f49263h;
                lVarC = (k10.l) this.f49262g;
                lVar = (k10.l) this.f49261f;
                gVar = (hz.g) this.f49260e;
                oq.u.b(obj);
            }
            next = new a.Next((b0) obj);
            this.f49266l = vq.j.a(c0Var);
            this.f49260e = vq.j.a(gVar);
            this.f49261f = lVar;
            this.f49262g = vq.j.a(lVarC);
            this.f49263h = null;
            this.f49264j = i15;
            this.f49265k = 3;
            if (rVar.F(next, this) != objE) {
                return objE;
            }
            return lVar;
            gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                return c0Var.b(new er.l() { // from class: eb2.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.e.O(gVar, (State) obj2);
                    }
                });
            }
            if (!fr.t.c(gVar, hz.g.b.f86853b)) {
                throw new oq.p();
            }
            lVarC = c0Var.c();
            r rVar2 = r.this;
            bb2.b bVar = rVar2.formatIdCardApplicationNumberUC;
            bb2.b.Params params2 = new bb2.b.Params(((State) c0Var.a()).getApplicationNumber());
            this.f49266l = vq.j.a(c0Var);
            this.f49260e = vq.j.a(gVar);
            this.f49261f = lVarC;
            this.f49262g = vq.j.a(lVarC);
            this.f49263h = rVar2;
            this.f49264j = 0;
            this.f49265k = 2;
            Object objD = bVar.d(params2, this);
            if (objD != objE) {
                rVar = rVar2;
                obj = objD;
                lVar = lVarC;
                i15 = 0;
                next = new a.Next((b0) obj);
                this.f49266l = vq.j.a(c0Var);
                this.f49260e = vq.j.a(gVar);
                this.f49261f = lVar;
                this.f49262g = vq.j.a(lVarC);
                this.f49263h = null;
                this.f49264j = i15;
                this.f49265k = 3;
                if (rVar.F(next, this) != objE) {
                    return lVar;
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eb2.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f49266l = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leb2/b;", "<unused var>", "Leb2/f;", "Loq/i0;", "<anonymous>", "(Leb2/b;Leb2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<eb2.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49268e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49268e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                a.C1161a c1161a = a.C1161a.f49193a;
                this.f49268e = 1;
                if (rVar.F(c1161a, this) == objE) {
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
        public final Object w(eb2.b bVar, State state, tq.e<? super i0> eVar) {
            return r.this.new f(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, bb2.b bVar, bb2.a aVar2, i iVar) {
        this.formatIdCardApplicationNumberUC = bVar;
        this.checkIdCollectingNumberIsCorrectUC = aVar2;
        this.mapper = iVar;
        State state = new State(null, null, false, 7, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: eb2.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.q9(this.f49231a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data n9(State state) {
        i iVar = this.mapper;
        er.a<i0> aVarB9 = b9(eb2.e.f49200a);
        er.a<i0> aVarB10 = b9(eb2.b.f49196a);
        return iVar.b(new i.Params(state, new er.l() { // from class: eb2.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.o9(this.f49233a, (b0) obj);
            }
        }, aVarB9, b9(eb2.d.f49199a), aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(r rVar, b0 b0Var) {
        rVar.d9(new OnFieldChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: eb2.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.r9(this.f49232a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(r rVar, z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnFieldChanged.class), oVar, cVar);
        zVar.v(q0.c(eb2.e.class), oVar, new d(null));
        zVar.v(q0.c(eb2.d.class), oVar, rVar.new e(null));
        zVar.x(q0.c(eb2.b.class), oVar, rVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
