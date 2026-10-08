package oe1;

import de1.KrusData;
import de1.SocialInsuranceQuestions;
import f00.j0;
import fr.q0;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001*B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Loe1/t;", "Ll00/g;", "Loe1/m;", "", "Loe1/n;", "Lyy/a;", "stateMachineFactory", "Lpe1/g;", "mapper", "Lce1/a;", "contract", "<init>", "(Lyy/a;Lpe1/g;Lce1/a;)V", "state", "Loe1/n$a;", "n9", "(Loe1/m;)Loe1/n$a;", "b", "Lpe1/g;", "c", "Lce1/a;", "d", "Loe1/m;", "initialState", "Lxw/b;", "Loe1/h;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, Object> implements n, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pe1.g mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ce1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<oe1.h> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<n.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Loe1/t$a;", "Lf00/j0;", "Lce1/a;", "Loe1/t;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ce1.a, t> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<n.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f145085b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145086a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f145087b;

            /* JADX INFO: renamed from: oe1.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3598a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145088d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145089e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145090f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145092h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145093j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145094k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145095l;

                public C3598a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145088d = obj;
                    this.f145089e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f145086a = hVar;
                this.f145087b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3598a c3598a;
                if (eVar instanceof C3598a) {
                    c3598a = (C3598a) eVar;
                    int i15 = c3598a.f145089e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3598a.f145089e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3598a = new C3598a(eVar);
                    }
                } else {
                    c3598a = new C3598a(eVar);
                }
                Object obj2 = c3598a.f145088d;
                Object objE = uq.b.e();
                int i16 = c3598a.f145089e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145086a;
                    n.Data dataN9 = this.f145087b.n9((State) obj);
                    c3598a.f145090f = vq.j.a(obj);
                    c3598a.f145092h = vq.j.a(c3598a);
                    c3598a.f145093j = vq.j.a(obj);
                    c3598a.f145094k = vq.j.a(hVar);
                    c3598a.f145095l = 0;
                    c3598a.f145089e = 1;
                    if (hVar.F(dataN9, c3598a) == objE) {
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
            this.f145084a = gVar;
            this.f145085b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super n.Data> hVar, tq.e eVar) {
            Object objA = this.f145084a.a(new a(hVar, this.f145085b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loe1/g;", "<unused var>", "Loe1/m;", "Loq/i0;", "<anonymous>", "(Loe1/g;Loe1/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<oe1.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145096e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145096e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oe1.h> bVarY1 = t.this.Y1();
                oe1.h.b bVar = oe1.h.b.f145056a;
                this.f145096e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(oe1.g gVar, State state, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loe1/f;", "<unused var>", "Loe1/m;", "Loq/i0;", "<anonymous>", "(Loe1/f;Loe1/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<oe1.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145098e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145098e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oe1.h> bVarY1 = t.this.Y1();
                oe1.h.a aVar = oe1.h.a.f145055a;
                this.f145098e = 1;
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
        public final Object w(oe1.f fVar, State state, tq.e<? super i0> eVar) {
            return t.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loe1/j;", "action", "Lk10/c0;", "Loe1/m;", "state", "Lk10/l;", "<anonymous>", "(Loe1/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SelectFirstAnswer, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145102g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SelectFirstAnswer selectFirstAnswer, c0 c0Var, State state) {
            de1.g answer = selectFirstAnswer.getAnswer();
            SocialInsuranceQuestions socialInsuranceQuestionsAnswer = ((State) c0Var.a()).getSocialInsuranceQuestionsAnswer();
            de1.g secondAnswer = socialInsuranceQuestionsAnswer != null ? socialInsuranceQuestionsAnswer.getSecondAnswer() : null;
            SocialInsuranceQuestions socialInsuranceQuestionsAnswer2 = ((State) c0Var.a()).getSocialInsuranceQuestionsAnswer();
            return state.a(new SocialInsuranceQuestions(answer, secondAnswer, socialInsuranceQuestionsAnswer2 != null ? socialInsuranceQuestionsAnswer2.getThirdAnswer() : null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectFirstAnswer selectFirstAnswer = (SelectFirstAnswer) this.f145101f;
            final c0 c0Var = (c0) this.f145102g;
            uq.b.e();
            if (this.f145100e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: oe1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(selectFirstAnswer, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectFirstAnswer selectFirstAnswer, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f145101f = selectFirstAnswer;
            eVar2.f145102g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loe1/k;", "action", "Lk10/c0;", "Loe1/m;", "state", "Lk10/l;", "<anonymous>", "(Loe1/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SelectSecondAnswer, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145105g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, SelectSecondAnswer selectSecondAnswer, State state) {
            SocialInsuranceQuestions socialInsuranceQuestionsAnswer = ((State) c0Var.a()).getSocialInsuranceQuestionsAnswer();
            de1.g firstAnswer = socialInsuranceQuestionsAnswer != null ? socialInsuranceQuestionsAnswer.getFirstAnswer() : null;
            de1.g answer = selectSecondAnswer.getAnswer();
            SocialInsuranceQuestions socialInsuranceQuestionsAnswer2 = ((State) c0Var.a()).getSocialInsuranceQuestionsAnswer();
            return state.a(new SocialInsuranceQuestions(firstAnswer, answer, socialInsuranceQuestionsAnswer2 != null ? socialInsuranceQuestionsAnswer2.getThirdAnswer() : null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectSecondAnswer selectSecondAnswer = (SelectSecondAnswer) this.f145104f;
            final c0 c0Var = (c0) this.f145105g;
            uq.b.e();
            if (this.f145103e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: oe1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O(c0Var, selectSecondAnswer, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectSecondAnswer selectSecondAnswer, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f145104f = selectSecondAnswer;
            fVar.f145105g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loe1/l;", "action", "Lk10/c0;", "Loe1/m;", "state", "Lk10/l;", "<anonymous>", "(Loe1/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<SelectThirdAnswer, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145108g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, SelectThirdAnswer selectThirdAnswer, State state) {
            SocialInsuranceQuestions socialInsuranceQuestionsAnswer = ((State) c0Var.a()).getSocialInsuranceQuestionsAnswer();
            de1.g firstAnswer = socialInsuranceQuestionsAnswer != null ? socialInsuranceQuestionsAnswer.getFirstAnswer() : null;
            SocialInsuranceQuestions socialInsuranceQuestionsAnswer2 = ((State) c0Var.a()).getSocialInsuranceQuestionsAnswer();
            return state.a(new SocialInsuranceQuestions(firstAnswer, socialInsuranceQuestionsAnswer2 != null ? socialInsuranceQuestionsAnswer2.getSecondAnswer() : null, selectThirdAnswer.getAnswer()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectThirdAnswer selectThirdAnswer = (SelectThirdAnswer) this.f145107f;
            final c0 c0Var = (c0) this.f145108g;
            uq.b.e();
            if (this.f145106e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: oe1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(c0Var, selectThirdAnswer, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectThirdAnswer selectThirdAnswer, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f145107f = selectThirdAnswer;
            gVar.f145108g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loe1/i;", "<unused var>", "Lk10/c0;", "Loe1/m;", "state", "Lk10/l;", "<anonymous>", "(Loe1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<i, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f145110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145111g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f145113a;

            static {
                int[] iArr = new int[de1.g.values().length];
                try {
                    iArr[de1.g.YES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f145113a = iArr;
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return state.a(new SocialInsuranceQuestions((de1.g) pq.v.l0(list), (de1.g) list.get(1), (de1.g) list.get(2)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
        
            if (r2.F(r3, r7) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
        
            if (r2.F(r4, r7) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oe1.t.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i iVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = t.this.new h(eVar);
            hVar.f145111g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, pe1.g gVar, ce1.a aVar2) {
        SocialInsuranceQuestions socialInsuranceQuestions;
        this.mapper = gVar;
        this.contract = aVar2;
        KrusData krusDataM3 = aVar2.m3();
        State state = new State((krusDataM3 == null || (socialInsuranceQuestions = krusDataM3.getSocialInsuranceQuestions()) == null) ? new SocialInsuranceQuestions(null, null, null) : socialInsuranceQuestions);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: oe1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.s9(this.f145077a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n.Data n9(State state) {
        return this.mapper.b(new pe1.g.Params(state, new er.l() { // from class: oe1.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.o9(this.f145073a, (de1.g) obj);
            }
        }, new er.l() { // from class: oe1.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.p9(this.f145074a, (de1.g) obj);
            }
        }, new er.l() { // from class: oe1.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.q9(this.f145075a, (de1.g) obj);
            }
        }, b9(i.f145059a), b9(oe1.f.f145053a), b9(oe1.g.f145054a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(t tVar, de1.g gVar) {
        tVar.d9(new SelectFirstAnswer(gVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(t tVar, de1.g gVar) {
        tVar.d9(new SelectSecondAnswer(gVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(t tVar, de1.g gVar) {
        tVar.d9(new SelectThirdAnswer(gVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: oe1.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f145076a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(t tVar, k10.z zVar) {
        c cVar = tVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(oe1.g.class), oVar, cVar);
        zVar.x(q0.c(oe1.f.class), oVar, tVar.new d(null));
        zVar.v(q0.c(SelectFirstAnswer.class), oVar, new e(null));
        zVar.v(q0.c(SelectSecondAnswer.class), oVar, new f(null));
        zVar.v(q0.c(SelectThirdAnswer.class), oVar, new g(null));
        zVar.v(q0.c(i.class), oVar, tVar.new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<oe1.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<n.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
