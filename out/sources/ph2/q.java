package ph2;

import fr.q0;
import j30.ButtonTextData;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vw.NavigationDialogModel;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lph2/q;", "Ll00/g;", "Lph2/b;", "Lph2/a;", "Lph2/c;", "", "Lyy/a;", "stateMachineFactory", "Lqh2/d;", "mapper", "Lkh2/b;", "setAppLanguageUseCase", "Lkh2/a;", "getAppLanguageUseCase", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lyy/a;Lqh2/d;Lkh2/b;Lkh2/a;Lmx/c;Lib4/c;)V", "Ldx/b;", "domainError", "Ljb4/b;", "y9", "(Ldx/b;)Ljb4/b;", "state", "Lph2/c$a;", "A9", "(Lph2/b;)Lph2/c$a;", "Lph2/a$c$c;", "u9", "()Lph2/a$c$c;", "b", "Lqh2/d;", "c", "Lkh2/b;", "d", "Lkh2/a;", "e", "Lmx/c;", "f", "Lib4/c;", "Lph2/b$a;", "g", "Lph2/b$a;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lph2/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "langswitch_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<ph2.b, ph2.a> implements ph2.c, zx.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f157727l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qh2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kh2.b setAppLanguageUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kh2.a getAppLanguageUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ph2.b.Initialized initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ph2.b, ph2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ph2.a.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<ph2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ph2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f157737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f157738b;

        /* JADX INFO: renamed from: ph2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3910a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f157739a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f157740b;

            /* JADX INFO: renamed from: ph2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3911a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f157741d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f157742e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f157743f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f157745h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f157746j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f157747k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f157748l;

                public C3911a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f157741d = obj;
                    this.f157742e |= PKIFailureInfo.systemUnavail;
                    return C3910a.this.F(null, this);
                }
            }

            public C3910a(mu.h hVar, q qVar) {
                this.f157739a = hVar;
                this.f157740b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3911a c3911a;
                if (eVar instanceof C3911a) {
                    c3911a = (C3911a) eVar;
                    int i15 = c3911a.f157742e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3911a.f157742e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3911a = new C3911a(eVar);
                    }
                } else {
                    c3911a = new C3911a(eVar);
                }
                Object obj2 = c3911a.f157741d;
                Object objE = uq.b.e();
                int i16 = c3911a.f157742e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f157739a;
                    ph2.c.a aVarA9 = this.f157740b.A9((ph2.b) obj);
                    c3911a.f157743f = vq.j.a(obj);
                    c3911a.f157745h = vq.j.a(c3911a);
                    c3911a.f157746j = vq.j.a(obj);
                    c3911a.f157747k = vq.j.a(hVar);
                    c3911a.f157748l = 0;
                    c3911a.f157742e = 1;
                    if (hVar.F(aVarA9, c3911a) == objE) {
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
            this.f157737a = gVar;
            this.f157738b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ph2.c.a> hVar, tq.e eVar) {
            Object objA = this.f157737a.a(new C3910a(hVar, this.f157738b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lph2/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lph2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ph2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157749e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f157749e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.d9(ph2.a.b.f157695a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ph2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return ((b) v(initialized, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return q.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lph2/a$b;", "<unused var>", "Lk10/c0;", "Lph2/b$a;", "state", "Lk10/l;", "Lph2/b;", "<anonymous>", "(Lph2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ph2.a.b, c0<ph2.b.Initialized>, tq.e<? super k10.l<? extends ph2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157752f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ph2.b.Initialized O(jx.e eVar, ph2.b.Initialized initialized) {
            return initialized.a(lh2.b.INSTANCE.a(eVar.getIsoCode()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f157752f;
            Object objE = uq.b.e();
            int i15 = this.f157751e;
            if (i15 == 0) {
                oq.u.b(obj);
                kh2.a aVar = q.this.getAppLanguageUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f157752f = c0Var;
                this.f157751e = 1;
                obj = aVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final jx.e eVar = (jx.e) obj;
            return c0Var.b(new er.l() { // from class: ph2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O(eVar, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ph2.a.b bVar, c0<ph2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ph2.b>> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f157752f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lph2/a$h;", "action", "Lk10/c0;", "Lph2/b$a;", "state", "Lk10/l;", "Lph2/b;", "<anonymous>", "(Lph2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ph2.a.StartSettingLanguage, c0<ph2.b.Initialized>, tq.e<? super k10.l<? extends ph2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157755f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f157756g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ph2.b.Initialized O(ph2.a.StartSettingLanguage startSettingLanguage, ph2.b.Initialized initialized) {
            return initialized.a(startSettingLanguage.getLanguage());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ph2.a.StartSettingLanguage startSettingLanguage = (ph2.a.StartSettingLanguage) this.f157755f;
            c0 c0Var = (c0) this.f157756g;
            uq.b.e();
            if (this.f157754e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVarB = c0Var.b(new er.l() { // from class: ph2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(startSettingLanguage, (b.Initialized) obj2);
                }
            });
            q.this.d9(ph2.a.f.f157703a);
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ph2.a.StartSettingLanguage startSettingLanguage, c0<ph2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ph2.b>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f157755f = startSettingLanguage;
            dVar.f157756g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lph2/a$e;", "<unused var>", "Lph2/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lph2/a$e;Lph2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ph2.a.e, ph2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f157758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f157759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f157760g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f157761h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f157762j;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q qVar;
            ph2.b.Initialized initialized = (ph2.b.Initialized) this.f157762j;
            Object objE = uq.b.e();
            int i15 = this.f157761h;
            if (i15 == 0) {
                oq.u.b(obj);
                lh2.b selectedLanguage = initialized.getSelectedLanguage();
                if (selectedLanguage != null) {
                    q qVar2 = q.this;
                    kh2.b bVar = qVar2.setAppLanguageUseCase;
                    kh2.b.Params params = new kh2.b.Params(selectedLanguage.getLang());
                    this.f157762j = vq.j.a(initialized);
                    this.f157758e = qVar2;
                    this.f157759f = vq.j.a(selectedLanguage);
                    this.f157760g = 0;
                    this.f157761h = 1;
                    obj = bVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                    qVar = qVar2;
                } else {
                    q.this.d9(new ph2.a.ShowError(new dx.b.Generic(null, 1, null)));
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (q) this.f157758e;
            oq.u.b(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                qVar.d9(ph2.a.d.f157701a);
            } else {
                if (zBooleanValue) {
                    throw new oq.p();
                }
                qVar.d9(new ph2.a.ShowError(new dx.b.Generic(null, 1, null)));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ph2.a.e eVar, ph2.b.Initialized initialized, tq.e<? super i0> eVar2) {
            e eVar3 = q.this.new e(eVar2);
            eVar3.f157762j = initialized;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lph2/a$g;", "<destruct>", "Lph2/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lph2/a$g;Lph2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ph2.a.ShowError, ph2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f157764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f157765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f157766g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ph2.a.ShowError showError = (ph2.a.ShowError) this.f157766g;
            Object objE = uq.b.e();
            int i15 = this.f157765f;
            if (i15 == 0) {
                oq.u.b(obj);
                dx.b domainError = showError.getDomainError();
                xw.b<ph2.a.c> bVarY1 = q.this.Y1();
                ph2.a.c.ShowError showError2 = new ph2.a.c.ShowError(q.this.y9(domainError));
                this.f157766g = vq.j.a(showError);
                this.f157764e = vq.j.a(domainError);
                this.f157765f = 1;
                if (bVarY1.F(showError2, this) == objE) {
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
        public final Object w(ph2.a.ShowError showError, ph2.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f157766g = showError;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lph2/a$f;", "<unused var>", "Lph2/b$a;", "Loq/i0;", "<anonymous>", "(Lph2/a$f;Lph2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ph2.a.f, ph2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157768e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157768e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ph2.a.c> bVarY1 = q.this.Y1();
                ph2.a.c.ShowDialog showDialogU9 = q.this.u9();
                this.f157768e = 1;
                if (bVarY1.F(showDialogU9, this) == objE) {
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
        public final Object w(ph2.a.f fVar, ph2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return q.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lph2/a$d;", "<unused var>", "Lph2/b$a;", "Loq/i0;", "<anonymous>", "(Lph2/a$d;Lph2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ph2.a.d, ph2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157770e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157770e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ph2.a.c> bVarY1 = q.this.Y1();
                ph2.a.c.b bVar = ph2.a.c.b.f157697a;
                this.f157770e = 1;
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
        public final Object w(ph2.a.d dVar, ph2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return q.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lph2/a$a;", "<unused var>", "Lph2/b$a;", "Loq/i0;", "<anonymous>", "(Lph2/a$a;Lph2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ph2.a.C3906a, ph2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157772e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157772e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ph2.a.c> bVarY1 = q.this.Y1();
                ph2.a.c.C3907a c3907a = ph2.a.c.C3907a.f157696a;
                this.f157772e = 1;
                if (bVarY1.F(c3907a, this) == objE) {
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
        public final Object w(ph2.a.C3906a c3906a, ph2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return q.this.new i(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, qh2.d dVar, kh2.b bVar, kh2.a aVar2, mx.c cVar, ib4.c cVar2) {
        this.mapper = dVar;
        this.setAppLanguageUseCase = bVar;
        this.getAppLanguageUseCase = aVar2;
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
        ph2.b.Initialized initialized = new ph2.b.Initialized(null);
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: ph2.i
            @Override // er.l
            public final Object b(Object obj) {
                return q.E9(this.f157719a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), A9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ph2.c.a A9(ph2.b state) {
        return this.mapper.b(new qh2.d.Params(state, new er.l() { // from class: ph2.j
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9(this.f157720a, (lh2.b) obj);
            }
        }, new er.a() { // from class: ph2.k
            @Override // er.a
            public final Object a() {
                return q.C9(this.f157721a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(q qVar, lh2.b bVar) {
        qVar.d9(new ph2.a.StartSettingLanguage(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(q qVar) {
        qVar.d9(ph2.a.C3906a.f157694a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(ph2.b.Initialized.class), new er.l() { // from class: ph2.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.F9(this.f157722a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(q qVar, z zVar) {
        zVar.C(qVar.new b(null));
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ph2.a.b.class), oVar, cVar);
        zVar.v(q0.c(ph2.a.StartSettingLanguage.class), oVar, qVar.new d(null));
        zVar.x(q0.c(ph2.a.e.class), oVar, qVar.new e(null));
        zVar.x(q0.c(ph2.a.ShowError.class), oVar, qVar.new f(null));
        zVar.x(q0.c(ph2.a.f.class), oVar, qVar.new g(null));
        zVar.x(q0.c(ph2.a.d.class), oVar, qVar.new h(null));
        zVar.x(q0.c(ph2.a.C3906a.class), oVar, qVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ph2.a.c.ShowDialog u9() {
        return new ph2.a.c.ShowDialog(new NavigationDialogModel(this.labelProvider.c(jh2.a.f103008e), this.labelProvider.c(jh2.a.f103007d), null, null, null, new er.a() { // from class: ph2.m
            @Override // er.a
            public final Object a() {
                return q.v9(this.f157723a);
            }
        }, new ButtonTextData(null, this.labelProvider.c(jh2.a.f103005b), null, null, new er.a() { // from class: ph2.n
            @Override // er.a
            public final Object a() {
                return q.w9(this.f157724a);
            }
        }, 13, null), new ButtonTextData(null, this.labelProvider.c(jh2.a.f103004a), null, null, new er.a() { // from class: ph2.o
            @Override // er.a
            public final Object a() {
                return q.x9(this.f157725a);
            }
        }, 13, null), 16, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(q qVar) {
        qVar.d9(ph2.a.b.f157695a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar) {
        qVar.d9(ph2.a.e.f157702a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar) {
        qVar.d9(ph2.a.b.f157695a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b y9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ph2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f157726a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close)) {
            qVar.d9(ph2.a.C3906a.f157694a);
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            qVar.d9(ph2.a.b.f157695a);
        } else if (!(bVar instanceof ib4.c.b.a.Secondary)) {
            throw new oq.p();
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<ph2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ph2.b, ph2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ph2.c.a> getState() {
        return this.state;
    }
}
