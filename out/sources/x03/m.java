package x03;

import a14.x;
import fr.q0;
import java.util.Locale;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import z03.SafeBusPlatePayload;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bs\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.J\u0018\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u000201H\u0096\u0001¢\u0006\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR&\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030Q8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010]\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010&\u001a\b\u0012\u0004\u0012\u00020'0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lx03/m;", "Ll00/g;", "Lx03/c;", "Lx03/a;", "Lx03/d;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "La14/x;", "requestCameraPermissionUseCase", "Ln03/a;", "checkPlateNumberCorrectUC", "Lzv0/a;", "getBusUseCase", "Lib4/c;", "genericDomainErrorMapper", "globalSnackBarManager", "Lc54/b;", "isFeatureEnabledUseCase", "Ly03/d;", "safeBusPlateScreenMapper", "Ly03/b;", "cameraPermissionDialogMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lx03/b;", "setupData", "<init>", "(Lyy/a;Lmx/c;La14/x;Ln03/a;Lzv0/a;Lib4/c;Li70/e;Lc54/b;Ly03/d;Ly03/b;La14/m;Lac4/a;Lx03/b;)V", "Ldx/b;", "", "x9", "(Ldx/b;)Z", "state", "Lx03/d$a;", "y9", "(Lx03/c;)Lx03/d$a;", "error", "retryAction", "Ljb4/b;", "v9", "(Ldx/b;Lx03/a;)Ljb4/b;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "La14/x;", "d", "Ln03/a;", "e", "Lzv0/a;", "f", "Lib4/c;", "g", "Li70/e;", "h", "Lc54/b;", "j", "Ly03/d;", "k", "Ly03/b;", "l", "La14/m;", "m", "Lac4/a;", "n", "Lx03/b;", "p", "Lx03/c;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lx03/a$d;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, x03.a> implements x03.d, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n03.a checkPlateNumberCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zv0.a getBusUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final y03.d safeBusPlateScreenMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final y03.b cameraPermissionDialogMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, x03.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<x03.a.d> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<x03.d.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<uv0.d, i0> {
        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(uv0.d dVar) {
            c(dVar.getValue());
            return i0.f148189a;
        }

        public final void c(String str) {
            m.this.d9(new x03.a.CheckPlateAction(uv0.d.c(str.toUpperCase(Locale.ROOT)), null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<x03.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f216249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f216250b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f216251a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f216252b;

            /* JADX INFO: renamed from: x03.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5757a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f216253d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f216254e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f216255f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f216257h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f216258j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f216259k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f216260l;

                public C5757a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f216253d = obj;
                    this.f216254e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f216251a = hVar;
                this.f216252b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5757a c5757a;
                if (eVar instanceof C5757a) {
                    c5757a = (C5757a) eVar;
                    int i15 = c5757a.f216254e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5757a.f216254e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5757a = new C5757a(eVar);
                    }
                } else {
                    c5757a = new C5757a(eVar);
                }
                Object obj2 = c5757a.f216253d;
                Object objE = uq.b.e();
                int i16 = c5757a.f216254e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f216251a;
                    x03.d.Data dataY9 = this.f216252b.y9((State) obj);
                    c5757a.f216255f = vq.j.a(obj);
                    c5757a.f216257h = vq.j.a(c5757a);
                    c5757a.f216258j = vq.j.a(obj);
                    c5757a.f216259k = vq.j.a(hVar);
                    c5757a.f216260l = 0;
                    c5757a.f216254e = 1;
                    if (hVar.F(dataY9, c5757a) == objE) {
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

        public b(mu.g gVar, m mVar) {
            this.f216249a = gVar;
            this.f216250b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super x03.d.Data> hVar, tq.e eVar) {
            Object objA = this.f216249a.a(new a(hVar, this.f216250b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx03/a$a;", "<unused var>", "Lx03/c;", "Loq/i0;", "<anonymous>", "(Lx03/a$a;Lx03/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<x03.a.C5754a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216261e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f216261e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<x03.a.d> bVarY1 = m.this.Y1();
                x03.a.d.C5755a c5755a = x03.a.d.C5755a.f216205a;
                this.f216261e = 1;
                if (bVarY1.F(c5755a, this) == objE) {
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
        public final Object w(x03.a.C5754a c5754a, State state, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx03/a$c;", "<unused var>", "Lx03/c;", "Loq/i0;", "<anonymous>", "(Lx03/a$c;Lx03/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<x03.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216263e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f216263e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = m.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            m mVar = m.this;
            if (iVarA instanceof dx.i.Left) {
                mVar.y(new p50.a.DefaultWithIcon(mVar.labelProvider.c(k03.a.f107244z), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x03.a.c cVar, State state, tq.e<? super i0> eVar) {
            return m.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx03/a$e;", "<unused var>", "Lx03/c;", "Loq/i0;", "<anonymous>", "(Lx03/a$e;Lx03/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<x03.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216265e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f216265e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<x03.a.d> bVarY1 = m.this.Y1();
                x03.a.d.ShowNavigationDialog showNavigationDialog = new x03.a.d.ShowNavigationDialog(m.this.cameraPermissionDialogMapper.b(new y03.b.Params(m.this.b9(x03.a.c.f216204a))));
                this.f216265e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        public final Object w(x03.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return m.this.new e(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx03/a$f;", "<unused var>", "Lx03/c;", "Loq/i0;", "<anonymous>", "(Lx03/a$f;Lx03/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<x03.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216267e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r5.F(r1, r4) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f216267e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L58
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                x03.m r5 = x03.m.this
                a14.x r5 = x03.m.s9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f216267e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L4c
            L32:
                u04.c r5 = (u04.c) r5
                u04.c$a r1 = u04.c.a.f194071a
                boolean r1 = fr.t.c(r5, r1)
                if (r1 == 0) goto L4d
                x03.m r5 = x03.m.this
                xw.b r5 = r5.Y1()
                x03.a$d$d r1 = x03.a.d.C5756d.f216208a
                r4.f216267e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L58
            L4c:
                return r0
            L4d:
                boolean r5 = r5 instanceof u04.c.b
                if (r5 == 0) goto L5b
                x03.m r5 = x03.m.this
                x03.a$e r0 = x03.a.e.f216211a
                x03.m.l9(r5, r0)
            L58:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            L5b:
                oq.p r5 = new oq.p
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: x03.m.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x03.a.f fVar, State state, tq.e<? super i0> eVar) {
            return m.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lx03/a$b;", "action", "Lk10/c0;", "Lx03/c;", "state", "Lk10/l;", "<anonymous>", "(Lx03/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<x03.a.CheckPlateAction, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f216271g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(m03.a aVar, x03.a.CheckPlateAction checkPlateAction, State state) {
            return State.b(state, checkPlateAction.getPlateNumber(), !aVar.e() || state.getWasPlateVerified(), null, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final x03.a.CheckPlateAction checkPlateAction = (x03.a.CheckPlateAction) this.f216270f;
            c0 c0Var = (c0) this.f216271g;
            Object objE = uq.b.e();
            int i15 = this.f216269e;
            if (i15 == 0) {
                u.b(obj);
                n03.a aVar = m.this.checkPlateNumberCorrectUC;
                n03.a.Params params = new n03.a.Params(p03.a.a(checkPlateAction.getPlateNumber()), ((State) c0Var.a()).getWasPlateVerified(), null);
                this.f216270f = checkPlateAction;
                this.f216271g = c0Var;
                this.f216269e = 1;
                obj = aVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final m03.a aVar2 = (m03.a) obj;
            return c0Var.b(new er.l() { // from class: x03.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.g.O(aVar2, checkPlateAction, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x03.a.CheckPlateAction checkPlateAction, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = m.this.new g(eVar);
            gVar.f216270f = checkPlateAction;
            gVar.f216271g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lx03/a$g;", "action", "Lk10/c0;", "Lx03/c;", "state", "Lk10/l;", "<anonymous>", "(Lx03/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<x03.a.VerifyPlate, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f216273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f216274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f216275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f216276h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f216277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f216278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f216279l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f216280m;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lrv0/c;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends rv0.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f216282e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f216283f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ x03.a.VerifyPlate f216284g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, x03.a.VerifyPlate verifyPlate, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f216283f = mVar;
                this.f216284g = verifyPlate;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f216282e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                zv0.a aVar = this.f216283f.getBusUseCase;
                zv0.a.Params params = new zv0.a.Params(this.f216284g.getPlateNumber(), null);
                this.f216282e = 1;
                Object objC = aVar.c(params, this);
                return objC == objE ? objE : objC;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f216283f, this.f216284g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, rv0.c>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(x03.a.VerifyPlate verifyPlate, m03.a aVar, State state) {
            return state.a(verifyPlate.getPlateNumber(), true, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State Y(m03.a aVar, State state) {
            return State.b(state, null, false, aVar, 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State Z(m03.a aVar, State state) {
            return state.a(uv0.d.INSTANCE.a(), false, aVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:36:0x0106  */
        /* JADX WARN: Code duplicated, block: B:38:0x010a  */
        /* JADX WARN: Code duplicated, block: B:41:0x013f  */
        /* JADX WARN: Code duplicated, block: B:44:0x014a  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objC;
            final m03.a aVar;
            Object objA;
            dx.i iVar;
            m mVar;
            xw.b<x03.a.d> bVarY1;
            x03.a.d.Verified verified;
            final m03.a aVar2;
            dx.b bVar;
            xw.b<x03.a.d> bVarY2;
            x03.a.d error;
            final m03.a aVar3;
            final x03.a.VerifyPlate verifyPlate = (x03.a.VerifyPlate) this.f216279l;
            c0 c0Var = (c0) this.f216280m;
            Object objE = uq.b.e();
            int i15 = this.f216278k;
            if (i15 == 0) {
                u.b(obj);
                n03.a aVar4 = m.this.checkPlateNumberCorrectUC;
                n03.a.Params params = new n03.a.Params(p03.a.a(verifyPlate.getPlateNumber()), true, null);
                this.f216279l = verifyPlate;
                this.f216280m = c0Var;
                this.f216278k = 1;
                objC = aVar4.c(params, this);
                if (objC != objE) {
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        aVar3 = (m03.a) this.f216273e;
                        u.b(obj);
                        return c0Var.b(new er.l() { // from class: x03.p
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.h.Y(aVar3, (State) obj2);
                            }
                        });
                    }
                    if (i15 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (m03.a) this.f216273e;
                    u.b(obj);
                    return c0Var.b(new er.l() { // from class: x03.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return m.h.Z(aVar2, (State) obj2);
                        }
                    });
                }
                m03.a aVar5 = (m03.a) this.f216273e;
                u.b(obj);
                aVar = aVar5;
                objA = obj;
                iVar = (dx.i) objA;
                mVar = m.this;
                if (iVar instanceof dx.i.Left) {
                    bVar = (dx.b) ((dx.i.Left) iVar).b();
                    bVarY2 = mVar.Y1();
                    if (mVar.x9(bVar)) {
                        error = x03.a.d.c.f216207a;
                    } else {
                        error = new x03.a.d.Error(mVar.v9(bVar, verifyPlate));
                    }
                    this.f216279l = vq.j.a(verifyPlate);
                    this.f216280m = c0Var;
                    this.f216273e = aVar;
                    this.f216274f = vq.j.a(iVar);
                    this.f216275g = vq.j.a(bVar);
                    this.f216276h = 0;
                    this.f216277j = 0;
                    this.f216278k = 3;
                    if (bVarY2.F(error, this) != objE) {
                        aVar3 = aVar;
                        return c0Var.b(new er.l() { // from class: x03.p
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.h.Y(aVar3, (State) obj2);
                            }
                        });
                    }
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    rv0.c cVar = (rv0.c) ((dx.i.Right) iVar).b();
                    bVarY1 = mVar.Y1();
                    verified = new x03.a.d.Verified(cVar);
                    this.f216279l = vq.j.a(verifyPlate);
                    this.f216280m = c0Var;
                    this.f216273e = aVar;
                    this.f216274f = vq.j.a(iVar);
                    this.f216275g = vq.j.a(cVar);
                    this.f216276h = 0;
                    this.f216277j = 0;
                    this.f216278k = 4;
                    if (bVarY1.F(verified, this) != objE) {
                        aVar2 = aVar;
                        return c0Var.b(new er.l() { // from class: x03.q
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.h.Z(aVar2, (State) obj2);
                            }
                        });
                    }
                }
                return objE;
            }
            u.b(obj);
            objC = obj;
            aVar = (m03.a) objC;
            if (aVar != m03.a.CORRECT) {
                return c0Var.b(new er.l() { // from class: x03.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.h.X(verifyPlate, aVar, (State) obj2);
                    }
                });
            }
            ac4.a aVar6 = m.this.callActionWithLoaderUseCase;
            a aVar7 = new a(m.this, verifyPlate, null);
            this.f216279l = verifyPlate;
            this.f216280m = c0Var;
            this.f216273e = aVar;
            this.f216278k = 2;
            objA = ac4.a.a(aVar6, null, aVar7, this, 1, null);
            if (objA != objE) {
                iVar = (dx.i) objA;
                mVar = m.this;
                if (iVar instanceof dx.i.Left) {
                    bVar = (dx.b) ((dx.i.Left) iVar).b();
                    bVarY2 = mVar.Y1();
                    if (mVar.x9(bVar)) {
                        error = x03.a.d.c.f216207a;
                    } else {
                        error = new x03.a.d.Error(mVar.v9(bVar, verifyPlate));
                    }
                    this.f216279l = vq.j.a(verifyPlate);
                    this.f216280m = c0Var;
                    this.f216273e = aVar;
                    this.f216274f = vq.j.a(iVar);
                    this.f216275g = vq.j.a(bVar);
                    this.f216276h = 0;
                    this.f216277j = 0;
                    this.f216278k = 3;
                    if (bVarY2.F(error, this) != objE) {
                        aVar3 = aVar;
                        return c0Var.b(new er.l() { // from class: x03.p
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.h.Y(aVar3, (State) obj2);
                            }
                        });
                    }
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    rv0.c cVar2 = (rv0.c) ((dx.i.Right) iVar).b();
                    bVarY1 = mVar.Y1();
                    verified = new x03.a.d.Verified(cVar2);
                    this.f216279l = vq.j.a(verifyPlate);
                    this.f216280m = c0Var;
                    this.f216273e = aVar;
                    this.f216274f = vq.j.a(iVar);
                    this.f216275g = vq.j.a(cVar2);
                    this.f216276h = 0;
                    this.f216277j = 0;
                    this.f216278k = 4;
                    if (bVarY1.F(verified, this) != objE) {
                        aVar2 = aVar;
                        return c0Var.b(new er.l() { // from class: x03.q
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.h.Z(aVar2, (State) obj2);
                            }
                        });
                    }
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(x03.a.VerifyPlate verifyPlate, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = m.this.new h(eVar);
            hVar.f216279l = verifyPlate;
            hVar.f216280m = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    public m(yy.a aVar, mx.c cVar, x xVar, n03.a aVar2, zv0.a aVar3, ib4.c cVar2, i70.e eVar, c54.b bVar, y03.d dVar, y03.b bVar2, a14.m mVar, ac4.a aVar4, SetupData setupData) {
        String strA;
        this.labelProvider = cVar;
        this.requestCameraPermissionUseCase = xVar;
        this.checkPlateNumberCorrectUC = aVar2;
        this.getBusUseCase = aVar3;
        this.genericDomainErrorMapper = cVar2;
        this.globalSnackBarManager = eVar;
        this.isFeatureEnabledUseCase = bVar;
        this.safeBusPlateScreenMapper = dVar;
        this.cameraPermissionDialogMapper = bVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.callActionWithLoaderUseCase = aVar4;
        this.setupData = setupData;
        SafeBusPlatePayload payload = setupData.getPayload();
        if (payload != null) {
            uv0.d dVarB = uv0.d.b(payload.getPlate());
            dVarB = uv0.d.g(dVarB.getValue()) ? dVarB : null;
            strA = dVarB != null ? dVarB.getValue() : null;
            strA = strA == null ? uv0.d.INSTANCE.a() : strA;
        }
        State state = new State(strA, false, null, 6, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: x03.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.A9(this.f216231a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), y9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: x03.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.B9(this.f216228a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(m mVar, z zVar) {
        c cVar = mVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(x03.a.C5754a.class), oVar, cVar);
        zVar.x(q0.c(x03.a.c.class), oVar, mVar.new d(null));
        zVar.x(q0.c(x03.a.e.class), oVar, mVar.new e(null));
        zVar.x(q0.c(x03.a.f.class), oVar, mVar.new f(null));
        zVar.v(q0.c(x03.a.CheckPlateAction.class), oVar, mVar.new g(null));
        zVar.v(q0.c(x03.a.VerifyPlate.class), oVar, mVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b v9(dx.b error, final x03.a retryAction) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: x03.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.w9(this.f216229a, retryAction, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(m mVar, x03.a aVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            mVar.d9(aVar);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x9(dx.b bVar) {
        return (bVar instanceof dx.b.g.Http) && ((dx.b.g.Http) bVar).getCode() == dx.b.g.Http.a.BAD_REQUEST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x03.d.Data y9(State state) {
        return this.safeBusPlateScreenMapper.b(new y03.d.Params(state, this.isFeatureEnabledUseCase.a(b54.c.SAFE_BUS_OCR).booleanValue(), b9(x03.a.C5754a.f216202a), new a(), b9(x03.a.f.f216212a), b9(new x03.a.VerifyPlate(uv0.d.c(state.getPlate().toUpperCase(Locale.ROOT)), null))));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<x03.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, x03.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<x03.d.Data> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
