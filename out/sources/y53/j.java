package y53;

import a63.RepeatSetNewPinNavResultData;
import a63.RepeatSetNewPinScreenData;
import er.q;
import f00.j0;
import fr.q0;
import iy.b0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Ly53/j;", "Ll00/g;", "Ly53/b;", "Ly53/a;", "Ly53/c;", "", "Lyy/a;", "stateMachineFactory", "Lz53/b;", "mapper", "Lg73/d;", "settingsNavigationDialogMapper", "Lmx/c;", "labelProvider", "Ly53/j$a$a;", "setupData", "<init>", "(Lyy/a;Lz53/b;Lg73/d;Lmx/c;Ly53/j$a$a;)V", "state", "La63/d;", "p9", "(Ly53/b;)La63/d;", "b", "Lz53/b;", "c", "Lg73/d;", "d", "Lmx/c;", "e", "Ly53/j$a$a;", "f", "Ly53/b;", "initialState", "Lxw/b;", "Ly53/a$c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, y53.a> implements y53.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z53.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<y53.a.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<State, y53.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<RepeatSetNewPinScreenData> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ly53/j$a;", "Lf00/j0;", "Ly53/j$a$a;", "Ly53/j;", "a", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<SetupData, j> {

        /* JADX INFO: renamed from: y53.j$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly53/j$a$a;", "", "Liy/b0;", "passwordValue", "La63/a;", "repeatSetNewPinNavResultData", "<init>", "(Liy/b0;La63/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "La63/a;", "()La63/a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f224306c = b0.f97726c;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 passwordValue;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final RepeatSetNewPinNavResultData repeatSetNewPinNavResultData;

            public SetupData(b0 b0Var, RepeatSetNewPinNavResultData repeatSetNewPinNavResultData) {
                this.passwordValue = b0Var;
                this.repeatSetNewPinNavResultData = repeatSetNewPinNavResultData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b0 getPasswordValue() {
                return this.passwordValue;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final RepeatSetNewPinNavResultData getRepeatSetNewPinNavResultData() {
                return this.repeatSetNewPinNavResultData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetupData)) {
                    return false;
                }
                SetupData setupData = (SetupData) other;
                return fr.t.c(this.passwordValue, setupData.passwordValue) && fr.t.c(this.repeatSetNewPinNavResultData, setupData.repeatSetNewPinNavResultData);
            }

            public int hashCode() {
                int iHashCode = this.passwordValue.hashCode() * 31;
                RepeatSetNewPinNavResultData repeatSetNewPinNavResultData = this.repeatSetNewPinNavResultData;
                return iHashCode + (repeatSetNewPinNavResultData == null ? 0 : repeatSetNewPinNavResultData.hashCode());
            }

            public String toString() {
                return "SetupData(passwordValue=" + this.passwordValue + ", repeatSetNewPinNavResultData=" + this.repeatSetNewPinNavResultData + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<RepeatSetNewPinScreenData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f224309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f224310b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f224311a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f224312b;

            /* JADX INFO: renamed from: y53.j$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6009a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f224313d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f224314e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f224315f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f224317h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f224318j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f224319k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f224320l;

                public C6009a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f224313d = obj;
                    this.f224314e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, j jVar) {
                this.f224311a = hVar;
                this.f224312b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6009a c6009a;
                if (eVar instanceof C6009a) {
                    c6009a = (C6009a) eVar;
                    int i15 = c6009a.f224314e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6009a.f224314e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6009a = new C6009a(eVar);
                    }
                } else {
                    c6009a = new C6009a(eVar);
                }
                Object obj2 = c6009a.f224313d;
                Object objE = uq.b.e();
                int i16 = c6009a.f224314e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f224311a;
                    RepeatSetNewPinScreenData repeatSetNewPinScreenDataP9 = this.f224312b.p9((State) obj);
                    c6009a.f224315f = vq.j.a(obj);
                    c6009a.f224317h = vq.j.a(c6009a);
                    c6009a.f224318j = vq.j.a(obj);
                    c6009a.f224319k = vq.j.a(hVar);
                    c6009a.f224320l = 0;
                    c6009a.f224314e = 1;
                    if (hVar.F(repeatSetNewPinScreenDataP9, c6009a) == objE) {
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

        public b(mu.g gVar, j jVar) {
            this.f224309a = gVar;
            this.f224310b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super RepeatSetNewPinScreenData> hVar, tq.e eVar) {
            Object objA = this.f224309a.a(new a(hVar, this.f224310b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly53/a$b;", "<unused var>", "Ly53/b;", "Loq/i0;", "<anonymous>", "(Ly53/a$b;Ly53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<y53.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224321e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224321e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                y53.a.c.b bVar = y53.a.c.b.f224275a;
                this.f224321e = 1;
                if (jVar.F(bVar, this) == objE) {
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
        public final Object w(y53.a.b bVar, State state, tq.e<? super i0> eVar) {
            return j.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly53/a$a;", "<unused var>", "Ly53/b;", "Loq/i0;", "<anonymous>", "(Ly53/a$a;Ly53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<y53.a.C6005a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224323e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224323e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                y53.a.c.C6006a c6006a = y53.a.c.C6006a.f224274a;
                this.f224323e = 1;
                if (jVar.F(c6006a, this) == objE) {
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
        public final Object w(y53.a.C6005a c6005a, State state, tq.e<? super i0> eVar) {
            return j.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly53/a$f;", "<unused var>", "Ly53/b;", "Loq/i0;", "<anonymous>", "(Ly53/a$f;Ly53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<y53.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224325e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224325e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                y53.a.c.d dVar = new y53.a.c.d(j.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(j.this.b9(y53.a.b.f224273a), null, 2, null))));
                this.f224325e = 1;
                if (jVar.F(dVar, this) == objE) {
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
        public final Object w(y53.a.f fVar, State state, tq.e<? super i0> eVar) {
            return j.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly53/a$d;", "action", "Lk10/c0;", "Ly53/b;", "state", "Lk10/l;", "<anonymous>", "(Ly53/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<y53.a.OnPinChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224329g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(y53.a.OnPinChanged onPinChanged, State state) {
            return State.b(state, null, null, onPinChanged.getPinValue(), hz.b.C2039b.f86846c, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final y53.a.OnPinChanged onPinChanged = (y53.a.OnPinChanged) this.f224328f;
            c0 c0Var = (c0) this.f224329g;
            uq.b.e();
            if (this.f224327e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: y53.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.f.O(onPinChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y53.a.OnPinChanged onPinChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f224328f = onPinChanged;
            fVar.f224329g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly53/a$e;", "action", "Ly53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly53/a$e;Ly53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<y53.a.SelectLoginMethod, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224331f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y53.a.SelectLoginMethod selectLoginMethod = (y53.a.SelectLoginMethod) this.f224331f;
            Object objE = uq.b.e();
            int i15 = this.f224330e;
            if (i15 == 0) {
                u.b(obj);
                j jVar = j.this;
                y53.a.c.SelectLoginMethod selectLoginMethod2 = new y53.a.c.SelectLoginMethod(selectLoginMethod.getPin());
                this.f224331f = vq.j.a(selectLoginMethod);
                this.f224330e = 1;
                if (jVar.F(selectLoginMethod2, this) == objE) {
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
        public final Object w(y53.a.SelectLoginMethod selectLoginMethod, State state, tq.e<? super i0> eVar) {
            g gVar = j.this.new g(eVar);
            gVar.f224331f = selectLoginMethod;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly53/a$g;", "<unused var>", "Lk10/c0;", "Ly53/b;", "state", "Lk10/l;", "<anonymous>", "(Ly53/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements q<y53.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224334f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(State state) {
            return State.b(state, null, null, b0.INSTANCE.a(), hz.b.C2039b.f86846c, 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(j jVar, State state) {
            return State.b(state, null, null, b0.INSTANCE.a(), new hz.b.Invalid(jVar.labelProvider.c(c53.a.f23722q1)), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f224334f;
            uq.b.e();
            if (this.f224333e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            boolean zC = ((State) c0Var.a()).getNewPinValue().c(((State) c0Var.a()).getPinValue());
            if (zC) {
                j.this.d9(new y53.a.SelectLoginMethod(((State) c0Var.a()).getPinValue()));
                return c0Var.b(new er.l() { // from class: y53.l
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j.h.V((State) obj2);
                    }
                });
            }
            if (zC) {
                throw new oq.p();
            }
            final j jVar = j.this;
            return c0Var.b(new er.l() { // from class: y53.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.h.X(jVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(y53.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = j.this.new h(eVar);
            hVar.f224334f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, z53.b bVar, g73.d dVar, mx.c cVar, a.SetupData setupData) {
        b0 newPinValue;
        this.mapper = bVar;
        this.settingsNavigationDialogMapper = dVar;
        this.labelProvider = cVar;
        this.setupData = setupData;
        b0 passwordValue = setupData.getPasswordValue();
        RepeatSetNewPinNavResultData repeatSetNewPinNavResultData = setupData.getRepeatSetNewPinNavResultData();
        State state = new State(passwordValue, (repeatSetNewPinNavResultData == null || (newPinValue = repeatSetNewPinNavResultData.getNewPinValue()) == null) ? b0.INSTANCE.a() : newPinValue, b0.INSTANCE.a(), hz.b.C2039b.f86846c);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: y53.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.s9(this.f224297a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RepeatSetNewPinScreenData p9(State state) {
        return this.mapper.b(new z53.b.Params(state, b9(y53.a.f.f224284a), b9(y53.a.C6005a.f224272a), b9(y53.a.g.f224285a), new er.l() { // from class: y53.g
            @Override // er.l
            public final Object b(Object obj) {
                return j.q9(this.f224295a, (b0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(j jVar, b0 b0Var) {
        jVar.d9(new y53.a.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: y53.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.t9(this.f224296a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(j jVar, z zVar) {
        c cVar = jVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(y53.a.b.class), oVar, cVar);
        zVar.x(q0.c(y53.a.C6005a.class), oVar, jVar.new d(null));
        zVar.x(q0.c(y53.a.f.class), oVar, jVar.new e(null));
        zVar.v(q0.c(y53.a.OnPinChanged.class), oVar, new f(null));
        zVar.x(q0.c(y53.a.SelectLoginMethod.class), oVar, jVar.new g(null));
        zVar.v(q0.c(y53.a.g.class), oVar, jVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<y53.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, y53.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<RepeatSetNewPinScreenData> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(y53.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(RepeatSetNewPinNavResultData repeatSetNewPinNavResultData) {
        super.P5(repeatSetNewPinNavResultData);
    }
}
