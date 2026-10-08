package is3;

import cj0.ZusEVisitDepartment;
import er.l;
import fr.q;
import k10.t;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJL\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u001dH\u0096\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R,\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0011\u001a\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020\u001e0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u0010:\u001a\b\u0012\u0004\u0012\u00020\f048\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010\u0011\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lis3/e;", "Ll00/g;", "Lfs3/b;", "Lfs3/a;", "Lfs3/c;", "", "Lfs3/h;", "stateMachineFactory", "Lgs3/e;", "screenMapper", "<init>", "(Lfs3/h;Lgs3/e;)V", "Lfs3/c$a;", "m9", "(Lfs3/b;)Lfs3/c$a;", "Loq/i0;", "n9", "()V", "o9", "Lcj0/h;", "data", "p9", "(Lcj0/h;)V", "Lhs3/a;", "radioButtonId", "q9", "(Lhs3/a;)V", "Lhs3/b;", "type", "Lkotlin/Function1;", "Lfs3/a$c;", "emitNavAction", "dispatchAction", "Lk10/t;", "o6", "(Lhs3/b;Ler/l;Ler/l;)Lk10/t;", "b", "Lfs3/h;", "c", "Lgs3/e;", "d", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "J0", "()Lfs3/b;", "initialState", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends l00.g<fs3.b, fs3.a> implements fs3.c, zx.d, fs3.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fs3.h stateMachineFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gs3.e screenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<fs3.b, fs3.a> stateMachine = o6(hs3.b.DEPARTMENT, new l() { // from class: is3.c
        @Override // er.l
        public final Object b(Object obj) {
            return e.s9(this.f96921a, (fs3.a.c) obj);
        }
    }, new l() { // from class: is3.d
        @Override // er.l
        public final Object b(Object obj) {
            return e.t9(this.f96922a, (fs3.a) obj);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fs3.a.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<fs3.c.a> state = a9(new d(e9().getState(), this), m9(J0()));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, e.class, "onEnterDepartmentList", "onEnterDepartmentList()V", 0);
        }

        public final void E() {
            ((e) this.f66391b).n9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, e.class, "onNextButtonClick", "onNextButtonClick()V", 0);
        }

        public final void E() {
            ((e) this.f66391b).o9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends q implements l<hs3.a, i0> {
        c(Object obj) {
            super(1, obj, e.class, "onSelectRadioButton", "onSelectRadioButton$zusvisit_release(Lpl/gov/coi/mobywatel/feature/zusvisit/presentation/screens/newvisitwizard/chooseinternational/model/ChooseInternationalRadioButtonId;)V", 0);
        }

        public final void E(hs3.a aVar) {
            ((e) this.f66391b).q9(aVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(hs3.a aVar) {
            E(aVar);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<fs3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f96928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f96929b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f96930a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f96931b;

            /* JADX INFO: renamed from: is3.e$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2264a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f96932d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f96933e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f96934f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f96936h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f96937j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f96938k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f96939l;

                public C2264a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f96932d = obj;
                    this.f96933e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, e eVar) {
                this.f96930a = hVar;
                this.f96931b = eVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2264a c2264a;
                if (eVar instanceof C2264a) {
                    c2264a = (C2264a) eVar;
                    int i15 = c2264a.f96933e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2264a.f96933e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2264a = new C2264a(eVar);
                    }
                } else {
                    c2264a = new C2264a(eVar);
                }
                Object obj2 = c2264a.f96932d;
                Object objE = uq.b.e();
                int i16 = c2264a.f96933e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f96930a;
                    fs3.c.a aVarM9 = this.f96931b.m9((fs3.b) obj);
                    c2264a.f96934f = j.a(obj);
                    c2264a.f96936h = j.a(c2264a);
                    c2264a.f96937j = j.a(obj);
                    c2264a.f96938k = j.a(hVar);
                    c2264a.f96939l = 0;
                    c2264a.f96933e = 1;
                    if (hVar.F(aVarM9, c2264a) == objE) {
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

        public d(mu.g gVar, e eVar) {
            this.f96928a = gVar;
            this.f96929b = eVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fs3.c.a> hVar, tq.e eVar) {
            Object objA = this.f96928a.a(new a(hVar, this.f96929b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: is3.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class C2265e extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96940e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fs3.a.c f96942g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2265e(fs3.a.c cVar, tq.e<? super C2265e> eVar) {
            super(1, eVar);
            this.f96942g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96940e;
            if (i15 == 0) {
                u.b(obj);
                e eVar = e.this;
                fs3.a.c cVar = this.f96942g;
                this.f96940e = 1;
                if (eVar.F(cVar, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return e.this.new C2265e(this.f96942g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((C2265e) M(eVar)).J(i0.f148189a);
        }
    }

    public e(fs3.h hVar, gs3.e eVar) {
        this.stateMachineFactory = hVar;
        this.screenMapper = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fs3.c.a m9(fs3.b bVar) {
        return this.screenMapper.b(new gs3.e.Params(hs3.b.DEPARTMENT, bVar, new a(this), new c(this), new b(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n9() {
        d9(fs3.a.C1493a.f66878a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o9() {
        d9(fs3.a.d.f66887a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(e eVar, fs3.a.c cVar) {
        i00.a.a(eVar, eVar.new C2265e(cVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(e eVar, fs3.a aVar) {
        eVar.d9(aVar);
        return i0.f148189a;
    }

    @Override // fs3.h
    public fs3.b J0() {
        return this.stateMachineFactory.J0();
    }

    @Override // zx.b
    public xw.b<fs3.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<fs3.b, fs3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fs3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(fs3.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // fs3.h
    public t<fs3.b, fs3.a> o6(hs3.b type, l<? super fs3.a.c, i0> emitNavAction, l<? super fs3.a, i0> dispatchAction) {
        return this.stateMachineFactory.o6(type, emitNavAction, dispatchAction);
    }

    public final void p9(ZusEVisitDepartment data) {
        d9(new fs3.a.SelectDepartment(data));
    }

    public final void q9(hs3.a radioButtonId) {
        d9(new fs3.a.SelectRadio(radioButtonId));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
