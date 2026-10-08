package cb3;

import a14.w;
import android.text.Spanned;
import eb3.ProfileDisplayable;
import fr.q0;
import java.util.ArrayList;
import java.util.List;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import v93.SubProfile;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcb3/p;", "Ll00/g;", "Lcb3/e;", "", "Lcb3/f;", "Lyy/a;", "stateMachineFactory", "Ldb3/a;", "mapper", "La14/w;", "openUrlUseCase", "Li70/e;", "globalSnackBarManager", "Lu10/d;", "markdownParser", "Lcb3/d;", "data", "<init>", "(Lyy/a;Ldb3/a;La14/w;Li70/e;Lu10/d;Lcb3/d;)V", "state", "Lcb3/f$a;", "m9", "(Lcb3/e;)Lcb3/f$a;", "b", "Ldb3/a;", "c", "La14/w;", "d", "Li70/e;", "e", "Lu10/d;", "f", "Lcb3/e;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lcb3/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final db3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u10.d markdownParser;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cb3.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f24948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f24949b;

        /* JADX INFO: renamed from: cb3.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0666a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f24950a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f24951b;

            /* JADX INFO: renamed from: cb3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0667a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f24952d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f24953e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f24954f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f24956h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f24957j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f24958k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f24959l;

                public C0667a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f24952d = obj;
                    this.f24953e |= PKIFailureInfo.systemUnavail;
                    return C0666a.this.F(null, this);
                }
            }

            public C0666a(mu.h hVar, p pVar) {
                this.f24950a = hVar;
                this.f24951b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0667a c0667a;
                if (eVar instanceof C0667a) {
                    c0667a = (C0667a) eVar;
                    int i15 = c0667a.f24953e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0667a.f24953e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0667a = new C0667a(eVar);
                    }
                } else {
                    c0667a = new C0667a(eVar);
                }
                Object obj2 = c0667a.f24952d;
                Object objE = uq.b.e();
                int i16 = c0667a.f24953e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f24950a;
                    f.Data dataM9 = this.f24951b.m9((State) obj);
                    c0667a.f24954f = vq.j.a(obj);
                    c0667a.f24956h = vq.j.a(c0667a);
                    c0667a.f24957j = vq.j.a(obj);
                    c0667a.f24958k = vq.j.a(hVar);
                    c0667a.f24959l = 0;
                    c0667a.f24953e = 1;
                    if (hVar.F(dataM9, c0667a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f24948a = gVar;
            this.f24949b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f24948a.a(new C0666a(hVar, this.f24949b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcb3/a;", "<unused var>", "Lcb3/e;", "Loq/i0;", "<anonymous>", "(Lcb3/a;Lcb3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<cb3.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24960e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24960e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<cb3.b> bVarY1 = p.this.Y1();
                cb3.b.a aVar = cb3.b.a.f24908a;
                this.f24960e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(cb3.a aVar, State state, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcb3/c;", "action", "Lcb3/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcb3/c;Lcb3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnUrlClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f24963f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnUrlClick onUrlClick = (OnUrlClick) this.f24963f;
            Object objE = uq.b.e();
            int i15 = this.f24962e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = p.this.openUrlUseCase;
                w.Params params = new w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f24963f = vq.j.a(onUrlClick);
                this.f24962e = 1;
                obj = wVar.c(params, this);
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
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                pVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnUrlClick onUrlClick, State state, tq.e<? super i0> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f24963f = onUrlClick;
            return cVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, db3.a aVar2, w wVar, i70.e eVar, u10.d dVar, SetupData setupData) {
        this.mapper = aVar2;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.markdownParser = dVar;
        String title = setupData.getProfile().getTitle();
        Spanned spanned = dVar.parse(setupData.getProfile().getContent());
        List<SubProfile> listB = setupData.getProfile().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        for (SubProfile subProfile : listB) {
            arrayList.add(new ProfileDisplayable.SubProfileDisplayable(subProfile.getTitle(), this.markdownParser.parse(subProfile.getDescription())));
        }
        State state = new State(new ProfileDisplayable(title, spanned, arrayList, this.markdownParser.parse(setupData.getProfile().getSummary())));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: cb3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f24939a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data m9(State state) {
        return this.mapper.b(new db3.a.Params(state, b9(cb3.a.f24907a), new er.l() { // from class: cb3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f24938a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, String str) {
        pVar.d9(new OnUrlClick(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: cb3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f24937a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cb3.a.class), oVar, bVar);
        zVar.x(q0.c(OnUrlClick.class), oVar, pVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<cb3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
