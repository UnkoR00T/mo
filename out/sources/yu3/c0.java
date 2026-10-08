package yu3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pu3.ConfirmationDocumentData;
import pu3.ConfirmationDocumentResult;
import pu3.ImagePreviewData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J/\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020**\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010W\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR&\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030X8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010-\u001a\b\u0012\u0004\u0012\u00020.0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lyu3/c0;", "Ll00/g;", "Lyu3/g;", "Lyu3/d;", "Lyu3/h;", "Lpu3/c;", "Lyy/a;", "stateMachineFactory", "Lzu3/e;", "mapper", "Lmx/c;", "labelProvider", "Lbc4/k;", "takePhotoWithSizeValidationUseCase", "Lzu3/g;", "filePickerErrorMapper", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lbc4/h;", "pickFileUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "La00/b;", "pickedFileToAndroidMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lcb4/j;", "dialogVMSFactory", "Lhb4/d;", "errorVMSFactory", "Lpu3/a;", "data", "<init>", "(Lyy/a;Lzu3/e;Lmx/c;Lbc4/k;Lzu3/g;Lbc4/l;Lbc4/h;Lac4/a;La00/b;La14/m;Lyw/b;Lcb4/j;Lhb4/d;Lpu3/a;)V", "Lk10/c0;", "Lyu3/f;", "Ldx/b;", "error", "Lyu3/q0;", "action", "Lk10/l;", "E9", "(Lk10/c0;Ldx/b;Lyu3/q0;)Lk10/l;", "state", "Lyu3/h$a;", "I9", "(Lyu3/g;)Lyu3/h$a;", "b", "Lzu3/e;", "c", "Lmx/c;", "d", "Lbc4/k;", "e", "Lzu3/g;", "f", "Lbc4/l;", "g", "Lbc4/h;", "h", "Lac4/a;", "j", "La00/b;", "k", "La14/m;", "l", "Lyw/b;", "m", "Lcb4/j;", "n", "Lhb4/d;", "p", "Lpu3/a;", "D9", "()Lpu3/a;", "Lyu3/g$a;", "q", "Lyu3/g$a;", "initialState", "Lxw/b;", "Lpu3/c$a;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<yu3.g, yu3.d> implements yu3.h, pu3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zu3.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.k takePhotoWithSizeValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zu3.g filePickerErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFileUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ConfirmationDocumentData data;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final yu3.g.Initial initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pu3.c.a> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yu3.g, yu3.d> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<yu3.h.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<yu3.h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f229732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f229733b;

        /* JADX INFO: renamed from: yu3.c0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6168a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f229734a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f229735b;

            /* JADX INFO: renamed from: yu3.c0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6169a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f229736d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f229737e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f229738f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f229740h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f229741j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f229742k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f229743l;

                public C6169a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f229736d = obj;
                    this.f229737e |= PKIFailureInfo.systemUnavail;
                    return C6168a.this.F(null, this);
                }
            }

            public C6168a(mu.h hVar, c0 c0Var) {
                this.f229734a = hVar;
                this.f229735b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6169a c6169a;
                if (eVar instanceof C6169a) {
                    c6169a = (C6169a) eVar;
                    int i15 = c6169a.f229737e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6169a.f229737e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6169a = new C6169a(eVar);
                    }
                } else {
                    c6169a = new C6169a(eVar);
                }
                Object obj2 = c6169a.f229736d;
                Object objE = uq.b.e();
                int i16 = c6169a.f229737e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f229734a;
                    yu3.h.a aVarI9 = this.f229735b.I9((yu3.g) obj);
                    c6169a.f229738f = vq.j.a(obj);
                    c6169a.f229740h = vq.j.a(c6169a);
                    c6169a.f229741j = vq.j.a(obj);
                    c6169a.f229742k = vq.j.a(hVar);
                    c6169a.f229743l = 0;
                    c6169a.f229737e = 1;
                    if (hVar.F(aVarI9, c6169a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, c0 c0Var) {
            this.f229732a = gVar;
            this.f229733b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super yu3.h.a> hVar, tq.e eVar) {
            Object objA = this.f229732a.a(new C6168a(hVar, this.f229733b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyu3/g$a;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<yu3.g.Initial>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229745f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyu3/g$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yu3.g.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f229747e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f229748f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f229749g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0 f229750h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<yu3.g.Initial> f229751j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, k10.c0<yu3.g.Initial> c0Var2, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f229750h = c0Var;
                this.f229751j = c0Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final yu3.g.Initialized V(zz.h hVar, yu3.g.Initial initial) {
                return new yu3.g.Initialized(initial.getConfirmationDocumentData(), hVar, false, false, null, 28, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final zz.h hVar;
                Object objE = uq.b.e();
                int i15 = this.f229749g;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wx.i document = this.f229750h.getData().getDocument();
                    if (document != null) {
                        a00.b bVar = this.f229750h.pickedFileToAndroidMapper;
                        a00.b.Params params = new a00.b.Params(document);
                        this.f229747e = vq.j.a(document);
                        this.f229748f = 0;
                        this.f229749g = 1;
                        obj = bVar.a(params, this);
                        if (obj == objE) {
                            return objE;
                        }
                    } else {
                        hVar = null;
                    }
                    return this.f229751j.d(new er.l() { // from class: yu3.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.b.a.V(hVar, (g.Initial) obj2);
                        }
                    });
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                hVar = (zz.h) ((dx.i) obj).a();
                return this.f229751j.d(new er.l() { // from class: yu3.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.b.a.V(hVar, (g.Initial) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f229750h, this.f229751j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<yu3.g.Initialized>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f229745f;
            Object objE = uq.b.e();
            int i15 = this.f229744e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = c0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0.this, c0Var, null);
            this.f229745f = vq.j.a(c0Var);
            this.f229744e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yu3.g.Initial> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            return ((b) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = c0.this.new b(eVar);
            bVar.f229745f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/d$i;", "action", "Lk10/c0;", "Lyu3/g$b;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/d$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yu3.d.OnToggleBottomSheet, k10.c0<yu3.g.Initialized>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229754g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yu3.g.Initialized O(yu3.d.OnToggleBottomSheet onToggleBottomSheet, yu3.g.Initialized initialized) {
            return yu3.g.Initialized.g(initialized, null, null, false, false, onToggleBottomSheet.getValue(), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yu3.d.OnToggleBottomSheet onToggleBottomSheet = (yu3.d.OnToggleBottomSheet) this.f229753f;
            k10.c0 c0Var = (k10.c0) this.f229754g;
            uq.b.e();
            if (this.f229752e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu3.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.c.O(onToggleBottomSheet, (g.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.OnToggleBottomSheet onToggleBottomSheet, k10.c0<yu3.g.Initialized> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            c cVar = new c(eVar);
            cVar.f229753f = onToggleBottomSheet;
            cVar.f229754g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/d$g;", "action", "Lk10/c0;", "Lyu3/g$b;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/d$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yu3.d.OnPickerAction, k10.c0<yu3.g.Initialized>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229757g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(yu3.d.OnPickerAction onPickerAction, yu3.g.Initialized initialized) {
            return new Loading(initialized.getConfirmationDocumentData(), initialized.getIsValid(), onPickerAction.getSelectedOption());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yu3.d.OnPickerAction onPickerAction = (yu3.d.OnPickerAction) this.f229756f;
            k10.c0 c0Var = (k10.c0) this.f229757g;
            uq.b.e();
            if (this.f229755e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yu3.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.d.O(onPickerAction, (g.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.OnPickerAction onPickerAction, k10.c0<yu3.g.Initialized> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            d dVar = new d(eVar);
            dVar.f229756f = onPickerAction;
            dVar.f229757g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/d$c;", "<unused var>", "Lk10/c0;", "Lyu3/g$b;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/d$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yu3.d.c, k10.c0<yu3.g.Initialized>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229759f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yu3.g.Initialized O(yu3.g.Initialized initialized) {
            return yu3.g.Initialized.g(initialized, null, null, true, false, null, 25, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f229759f;
            uq.b.e();
            if (this.f229758e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.e.O((g.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.c cVar, k10.c0<yu3.g.Initialized> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f229759f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/d$f;", "<unused var>", "Lk10/c0;", "Lyu3/g$b;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/d$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yu3.d.f, k10.c0<yu3.g.Initialized>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f229761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f229762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f229763h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f229764j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f229765k;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yu3.g.Initialized O(yu3.g.Initialized initialized) {
            return yu3.g.Initialized.g(initialized, null, null, false, true, null, 19, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f229765k;
            Object objE = uq.b.e();
            int i15 = this.f229764j;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f229760e;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            int i16 = (c0.this.getData().getIsRequired() && ((yu3.g.Initialized) c0Var.a()).getPickedFile() == null) ? 0 : 1;
            if (i16 != 1) {
                c0.this.accessibilityTalkBackManager.a(c0.this.labelProvider.c(ou3.a.f150172e).getText());
                return c0Var.b(new er.l() { // from class: yu3.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.f.O((g.Initialized) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            c0 c0Var2 = c0.this;
            zz.h pickedFile = ((yu3.g.Initialized) c0Var.a()).getPickedFile();
            pu3.c.a.Next next = new pu3.c.a.Next(new ConfirmationDocumentResult(pickedFile != null ? pickedFile.getFile() : null));
            this.f229765k = vq.j.a(c0Var);
            this.f229760e = lVarC;
            this.f229761f = vq.j.a(lVarC);
            this.f229762g = i16;
            this.f229763h = 0;
            this.f229764j = 1;
            return c0Var2.F(next, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.f fVar, k10.c0<yu3.g.Initialized> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            f fVar2 = c0.this.new f(eVar);
            fVar2.f229765k = c0Var;
            return fVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/d$h;", "<unused var>", "Lk10/c0;", "Lyu3/g$b;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/d$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yu3.d.h, k10.c0<yu3.g.Initialized>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229768f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yu3.g.Initialized O(yu3.g.Initialized initialized) {
            return yu3.g.Initialized.g(initialized, null, null, false, false, null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f229768f;
            uq.b.e();
            if (this.f229767e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yu3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.g.O((g.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.h hVar, k10.c0<yu3.g.Initialized> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            g gVar = new g(eVar);
            gVar.f229768f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyu3/d$e;", "action", "Lyu3/g$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyu3/d$e;Lyu3/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<yu3.d.OnImageClick, yu3.g.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229770f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yu3.d.OnImageClick onImageClick = (yu3.d.OnImageClick) this.f229770f;
            Object objE = uq.b.e();
            int i15 = this.f229769e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                pu3.c.a.ImagePreview imagePreview = new pu3.c.a.ImagePreview(onImageClick.getData());
                this.f229770f = vq.j.a(onImageClick);
                this.f229769e = 1;
                if (c0Var.F(imagePreview, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.OnImageClick onImageClick, yu3.g.Initialized initialized, tq.e<? super oq.i0> eVar) {
            h hVar = c0.this.new h(eVar);
            hVar.f229770f = onImageClick;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyu3/d$a;", "<unused var>", "Lyu3/g$b;", "state", "Loq/i0;", "<anonymous>", "(Lyu3/d$a;Lyu3/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yu3.d.a, yu3.g.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229773f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yu3.g.Initialized initialized = (yu3.g.Initialized) this.f229773f;
            Object objE = uq.b.e();
            int i15 = this.f229772e;
            if (i15 == 0) {
                oq.u.b(obj);
                g30.v bottomSheetValue = initialized.getBottomSheetValue();
                g30.v vVar = g30.v.HIDDEN;
                if (bottomSheetValue != vVar) {
                    c0.this.d9(new yu3.d.OnToggleBottomSheet(vVar));
                } else {
                    c0 c0Var = c0.this;
                    pu3.c.a.C4017a c4017a = pu3.c.a.C4017a.f162800a;
                    this.f229773f = vq.j.a(initialized);
                    this.f229772e = 1;
                    if (c0Var.F(c4017a, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.a aVar, yu3.g.Initialized initialized, tq.e<? super oq.i0> eVar) {
            i iVar = c0.this.new i(eVar);
            iVar.f229773f = initialized;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyu3/d$b;", "<unused var>", "Lyu3/g$b;", "Loq/i0;", "<anonymous>", "(Lyu3/d$b;Lyu3/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<yu3.d.b, yu3.g.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229775e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229775e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                pu3.c.a.b bVar = pu3.c.a.b.f162801a;
                this.f229775e = 1;
                if (c0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.b bVar, yu3.g.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return c0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyu3/f;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229778f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyu3/g;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yu3.g>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f229780e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f229781f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f229782g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f229783h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f229784j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f229785k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ c0 f229786l;

            /* JADX INFO: renamed from: yu3.c0$k$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C6170a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f229787a;

                static {
                    int[] iArr = new int[q0.values().length];
                    try {
                        iArr[q0.TAKE_PHOTO.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[q0.PICK_PHOTO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[q0.PICK_FILE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f229787a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k10.c0<Loading> c0Var, c0 c0Var2, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f229785k = c0Var;
                this.f229786l = c0Var2;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x00c5  */
            /* JADX WARN: Code duplicated, block: B:24:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
            /* JADX WARN: Code duplicated, block: B:38:0x014a  */
            /* JADX WARN: Code duplicated, block: B:40:0x0157  */
            /* JADX WARN: Code duplicated, block: B:42:0x015b  */
            /* JADX WARN: Code duplicated, block: B:44:0x0174  */
            /* JADX WARN: Code duplicated, block: B:52:0x01c5  */
            /* JADX WARN: Code duplicated, block: B:54:0x01d2  */
            /* JADX WARN: Code duplicated, block: B:56:0x01d6  */
            /* JADX WARN: Code duplicated, block: B:58:0x01ef  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0 c0Var;
                Object objC;
                q0 q0Var;
                k10.c0<Loading> c0Var2;
                Object objC2;
                q0 q0Var2;
                k10.c0<Loading> c0Var3;
                Object objC3;
                q0 q0Var3;
                k10.c0<Loading> c0Var4;
                dx.i iVar;
                dx.i iVar2;
                dx.i iVar3;
                Object objE = uq.b.e();
                int i15 = this.f229784j;
                if (i15 != 0) {
                    if (i15 == 1) {
                        q0Var = (q0) this.f229782g;
                        c0Var2 = (k10.c0) this.f229781f;
                        c0 c0Var5 = (c0) this.f229780e;
                        oq.u.b(obj);
                        c0Var = c0Var5;
                        objC = obj;
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Left) {
                            return c0Var.E9(c0Var2, (dx.b) ((dx.i.Left) iVar).b(), q0Var);
                        }
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        bc4.k.Result result = (bc4.k.Result) ((dx.i.Right) iVar).b();
                        Object objC4 = c0Var2.c();
                        c0Var.d9(new yu3.d.OnFilePicked(result.getImageFile(), q0Var));
                        return objC4;
                    }
                    if (i15 == 2) {
                        q0Var2 = (q0) this.f229782g;
                        c0Var3 = (k10.c0) this.f229781f;
                        c0 c0Var6 = (c0) this.f229780e;
                        oq.u.b(obj);
                        c0Var = c0Var6;
                        objC2 = obj;
                        iVar2 = (dx.i) objC2;
                        if (iVar2 instanceof dx.i.Left) {
                            return c0Var.E9(c0Var3, (dx.b) ((dx.i.Left) iVar2).b(), q0Var2);
                        }
                        if (iVar2 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        bc4.l.Result result2 = (bc4.l.Result) ((dx.i.Right) iVar2).b();
                        Object objC5 = c0Var3.c();
                        c0Var.d9(new yu3.d.OnFilePicked(result2.getImageFile(), q0Var2));
                        return objC5;
                    }
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q0Var3 = (q0) this.f229782g;
                    c0Var4 = (k10.c0) this.f229781f;
                    c0 c0Var7 = (c0) this.f229780e;
                    oq.u.b(obj);
                    c0Var = c0Var7;
                    objC3 = obj;
                    iVar3 = (dx.i) objC3;
                    if (iVar3 instanceof dx.i.Left) {
                        return c0Var.E9(c0Var4, (dx.b) ((dx.i.Left) iVar3).b(), q0Var3);
                    }
                    if (iVar3 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    bc4.h.Result result3 = (bc4.h.Result) ((dx.i.Right) iVar3).b();
                    Object objC6 = c0Var4.c();
                    c0Var.d9(new yu3.d.OnFilePicked(result3.getFile(), q0Var3));
                    return objC6;
                }
                oq.u.b(obj);
                q0 action = this.f229785k.a().getAction();
                c0Var = this.f229786l;
                k10.c0<Loading> c0Var8 = this.f229785k;
                int i16 = C6170a.f229787a[action.ordinal()];
                if (i16 == 1) {
                    bc4.k kVar = c0Var.takePhotoWithSizeValidationUseCase;
                    bc4.k.Params params = new bc4.k.Params(c0Var.labelProvider.c(ou3.a.f150170c).getText(), null, null, vq.b.d(c0Var8.a().getConfirmationDocumentData().getMaxSize()), false, null, 54, null);
                    this.f229780e = c0Var;
                    this.f229781f = c0Var8;
                    this.f229782g = action;
                    this.f229783h = 0;
                    this.f229784j = 1;
                    objC = kVar.c(params, this);
                    if (objC != objE) {
                        q0Var = action;
                        c0Var2 = c0Var8;
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Left) {
                            return c0Var.E9(c0Var2, (dx.b) ((dx.i.Left) iVar).b(), q0Var);
                        }
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        bc4.k.Result result4 = (bc4.k.Result) ((dx.i.Right) iVar).b();
                        Object objC7 = c0Var2.c();
                        c0Var.d9(new yu3.d.OnFilePicked(result4.getImageFile(), q0Var));
                        return objC7;
                    }
                } else if (i16 == 2) {
                    bc4.l lVar = c0Var.pickPhotoFromGalleryUseCase;
                    bc4.l.Params params2 = new bc4.l.Params(vq.b.d(c0Var8.a().getConfirmationDocumentData().getMaxSize()), null, new bc4.l.a.Limited(c0Var8.a().getConfirmationDocumentData().getFormats().b()), 2, null);
                    this.f229780e = c0Var;
                    this.f229781f = c0Var8;
                    this.f229782g = action;
                    this.f229783h = 0;
                    this.f229784j = 2;
                    objC2 = lVar.c(params2, this);
                    if (objC2 != objE) {
                        q0Var2 = action;
                        c0Var3 = c0Var8;
                        iVar2 = (dx.i) objC2;
                        if (iVar2 instanceof dx.i.Left) {
                            return c0Var.E9(c0Var3, (dx.b) ((dx.i.Left) iVar2).b(), q0Var2);
                        }
                        if (iVar2 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        bc4.l.Result result5 = (bc4.l.Result) ((dx.i.Right) iVar2).b();
                        Object objC8 = c0Var3.c();
                        c0Var.d9(new yu3.d.OnFilePicked(result5.getImageFile(), q0Var2));
                        return objC8;
                    }
                } else {
                    if (i16 != 3) {
                        throw new oq.p();
                    }
                    bc4.h hVar = c0Var.pickFileUseCase;
                    bc4.h.Params params3 = new bc4.h.Params(pq.v.f1(c0Var8.a().getConfirmationDocumentData().getFormats().a()), c0Var8.a().getConfirmationDocumentData().getMaxSize(), null, 4, null);
                    this.f229780e = c0Var;
                    this.f229781f = c0Var8;
                    this.f229782g = action;
                    this.f229783h = 0;
                    this.f229784j = 3;
                    objC3 = hVar.c(params3, this);
                    if (objC3 != objE) {
                        q0Var3 = action;
                        c0Var4 = c0Var8;
                        iVar3 = (dx.i) objC3;
                        if (iVar3 instanceof dx.i.Left) {
                            return c0Var.E9(c0Var4, (dx.b) ((dx.i.Left) iVar3).b(), q0Var3);
                        }
                        if (iVar3 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        bc4.h.Result result6 = (bc4.h.Result) ((dx.i.Right) iVar3).b();
                        Object objC9 = c0Var4.c();
                        c0Var.d9(new yu3.d.OnFilePicked(result6.getFile(), q0Var3));
                        return objC9;
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f229785k, this.f229786l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends yu3.g>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f229778f;
            Object objE = uq.b.e();
            int i15 = this.f229777e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = c0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0Var, c0.this, null);
            this.f229778f = vq.j.a(c0Var);
            this.f229777e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = c0.this.new k(eVar);
            kVar.f229778f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/d$d;", "action", "Lk10/c0;", "Lyu3/f;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/d$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<yu3.d.OnFilePicked, k10.c0<Loading>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f229790g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyu3/g;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yu3.g>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f229792e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c0 f229793f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ yu3.d.OnFilePicked f229794g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f229795h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, yu3.d.OnFilePicked onFilePicked, k10.c0<Loading> c0Var2, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f229793f = c0Var;
                this.f229794g = onFilePicked;
                this.f229795h = c0Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final yu3.g.Initialized V(zz.h hVar, Loading loading) {
                return new yu3.g.Initialized(loading.getConfirmationDocumentData(), hVar, false, false, null, 28, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f229792e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a00.b bVar = this.f229793f.pickedFileToAndroidMapper;
                    a00.b.Params params = new a00.b.Params(this.f229794g.getPickedFile());
                    this.f229792e = 1;
                    obj = bVar.a(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                c0 c0Var = this.f229793f;
                k10.c0<Loading> c0Var2 = this.f229795h;
                yu3.d.OnFilePicked onFilePicked = this.f229794g;
                if (iVar instanceof dx.i.Left) {
                    return c0Var.E9(c0Var2, (dx.b) ((dx.i.Left) iVar).b(), onFilePicked.getAction());
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final zz.h hVar = (zz.h) ((dx.i.Right) iVar).b();
                c0Var.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
                return c0Var2.d(new er.l() { // from class: yu3.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.l.a.V(hVar, (Loading) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f229793f, this.f229794g, this.f229795h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends yu3.g>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yu3.d.OnFilePicked onFilePicked = (yu3.d.OnFilePicked) this.f229789f;
            k10.c0 c0Var = (k10.c0) this.f229790g;
            Object objE = uq.b.e();
            int i15 = this.f229788e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = c0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0.this, onFilePicked, c0Var, null);
            this.f229789f = vq.j.a(onFilePicked);
            this.f229790g = vq.j.a(c0Var);
            this.f229788e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.d.OnFilePicked onFilePicked, k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            l lVar = c0.this.new l(eVar);
            lVar.f229789f = onFilePicked;
            lVar.f229790g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/b;", "<unused var>", "Lk10/c0;", "Lyu3/e;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<yu3.b, k10.c0<yu3.e>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229797f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(yu3.e eVar) {
            return new Loading(eVar.getConfirmationDocumentData(), eVar.getIsValid(), eVar.getAction());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f229797f;
            uq.b.e();
            if (this.f229796e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yu3.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.m.O((e) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.b bVar, k10.c0<yu3.e> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            m mVar = new m(eVar);
            mVar.f229797f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/a;", "<unused var>", "Lk10/c0;", "Lyu3/e;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<yu3.a, k10.c0<yu3.e>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229799f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yu3.g.Initialized O(yu3.e eVar) {
            return new yu3.g.Initialized(eVar.getConfirmationDocumentData(), null, eVar.getIsValid(), false, null, 26, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f229799f;
            uq.b.e();
            if (this.f229798e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: yu3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.n.O((e) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.a aVar, k10.c0<yu3.e> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            n nVar = new n(eVar);
            nVar.f229799f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyu3/c;", "<unused var>", "Lk10/c0;", "Lyu3/e;", "state", "Lk10/l;", "Lyu3/g;", "<anonymous>", "(Lyu3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<yu3.c, k10.c0<yu3.e>, tq.e<? super k10.l<? extends yu3.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229801f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yu3.g.Initialized O(yu3.e eVar) {
            return new yu3.g.Initialized(eVar.getConfirmationDocumentData(), null, eVar.getIsValid(), false, null, 26, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f229801f;
            uq.b.e();
            if (this.f229800e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return c0Var.d(new er.l() { // from class: yu3.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.o.O((e) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yu3.c cVar, k10.c0<yu3.e> c0Var, tq.e<? super k10.l<? extends yu3.g>> eVar) {
            o oVar = c0.this.new o(eVar);
            oVar.f229801f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    public c0(yy.a aVar, zu3.e eVar, mx.c cVar, bc4.k kVar, zu3.g gVar, bc4.l lVar, bc4.h hVar, ac4.a aVar2, a00.b bVar, a14.m mVar, yw.b bVar2, cb4.j jVar, hb4.d dVar, ConfirmationDocumentData confirmationDocumentData) {
        this.mapper = eVar;
        this.labelProvider = cVar;
        this.takePhotoWithSizeValidationUseCase = kVar;
        this.filePickerErrorMapper = gVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.pickFileUseCase = hVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.pickedFileToAndroidMapper = bVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar2;
        this.dialogVMSFactory = jVar;
        this.errorVMSFactory = dVar;
        this.data = confirmationDocumentData;
        yu3.g.Initial initial = new yu3.g.Initial(confirmationDocumentData);
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initial, new er.l() { // from class: yu3.s
            @Override // er.l
            public final Object b(Object obj) {
                return c0.N9(this.f229882a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), I9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<yu3.g> E9(k10.c0<Loading> c0Var, dx.b bVar, final q0 q0Var) {
        zu3.g.a fileOrPhotoPicker;
        zu3.g gVar = this.filePickerErrorMapper;
        boolean z15 = q0Var == q0.TAKE_PHOTO;
        if (z15) {
            fileOrPhotoPicker = new zu3.g.a.Camera(bVar, b9(yu3.b.f229713a), b9(yu3.a.f229709a), b9(yu3.c.f229714a));
        } else {
            if (z15) {
                throw new oq.p();
            }
            fileOrPhotoPicker = new zu3.g.a.FileOrPhotoPicker(bVar, b9(yu3.b.f229713a), b9(yu3.a.f229709a));
        }
        final zu3.g.b bVarB = gVar.b(fileOrPhotoPicker);
        if (bVarB instanceof zu3.g.b.Dialog) {
            return c0Var.d(new er.l() { // from class: yu3.z
                @Override // er.l
                public final Object b(Object obj) {
                    return c0.F9(this.f229889a, bVarB, q0Var, (Loading) obj);
                }
            });
        }
        if (bVarB instanceof zu3.g.b.FullPage) {
            return c0Var.d(new er.l() { // from class: yu3.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return c0.G9(this.f229710a, bVarB, q0Var, (Loading) obj);
                }
            });
        }
        if (bVarB == null) {
            return c0Var.d(new er.l() { // from class: yu3.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return c0.H9((Loading) obj);
                }
            });
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yu3.e.Dialog F9(c0 c0Var, zu3.g.b bVar, q0 q0Var, Loading loading) {
        return new yu3.e.Dialog(loading.getConfirmationDocumentData(), q0Var, loading.getIsValid(), c0Var.dialogVMSFactory.a(((zu3.g.b.Dialog) bVar).getDialogData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yu3.e.FullScreen G9(c0 c0Var, zu3.g.b bVar, q0 q0Var, Loading loading) {
        return new yu3.e.FullScreen(loading.getConfirmationDocumentData(), q0Var, loading.getIsValid(), c0Var.errorVMSFactory.a(((zu3.g.b.FullPage) bVar).getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yu3.g.Initialized H9(Loading loading) {
        return new yu3.g.Initialized(loading.getConfirmationDocumentData(), null, loading.getIsValid(), false, null, 26, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yu3.h.a I9(yu3.g state) {
        return this.mapper.b(new zu3.e.Params(state, new er.l() { // from class: yu3.r
            @Override // er.l
            public final Object b(Object obj) {
                return c0.J9(this.f229881a, (g30.v) obj);
            }
        }, new er.l() { // from class: yu3.t
            @Override // er.l
            public final Object b(Object obj) {
                return c0.K9(this.f229883a, (q0) obj);
            }
        }, new er.l() { // from class: yu3.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.L9(this.f229884a, (ImagePreviewData) obj);
            }
        }, b9(yu3.d.c.f229805a), b9(yu3.d.h.f229811a), b9(yu3.d.a.f229803a), b9(yu3.d.b.f229804a), b9(yu3.d.f.f229809a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(c0 c0Var, g30.v vVar) {
        c0Var.d9(new yu3.d.OnToggleBottomSheet(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(c0 c0Var, q0 q0Var) {
        c0Var.d9(new yu3.d.OnPickerAction(q0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(c0 c0Var, ImagePreviewData imagePreviewData) {
        c0Var.d9(new yu3.d.OnImageClick(imagePreviewData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(final c0 c0Var, k10.v vVar) {
        vVar.c(fr.q0.c(yu3.g.Initial.class), new er.l() { // from class: yu3.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.O9(this.f229885a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yu3.g.Initialized.class), new er.l() { // from class: yu3.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.P9(this.f229886a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Loading.class), new er.l() { // from class: yu3.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Q9(this.f229887a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yu3.e.class), new er.l() { // from class: yu3.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.R9(this.f229888a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(c0 c0Var, k10.z zVar) {
        zVar.A(c0Var.new b(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(c0 c0Var, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(yu3.d.OnToggleBottomSheet.class), oVar, cVar);
        zVar.v(fr.q0.c(yu3.d.OnPickerAction.class), oVar, new d(null));
        zVar.v(fr.q0.c(yu3.d.c.class), oVar, new e(null));
        zVar.v(fr.q0.c(yu3.d.f.class), oVar, c0Var.new f(null));
        zVar.v(fr.q0.c(yu3.d.h.class), oVar, new g(null));
        zVar.x(fr.q0.c(yu3.d.OnImageClick.class), oVar, c0Var.new h(null));
        zVar.x(fr.q0.c(yu3.d.a.class), oVar, c0Var.new i(null));
        zVar.x(fr.q0.c(yu3.d.b.class), oVar, c0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(c0 c0Var, k10.z zVar) {
        zVar.A(c0Var.new k(null));
        l lVar = c0Var.new l(null);
        zVar.v(fr.q0.c(yu3.d.OnFilePicked.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(c0 c0Var, k10.z zVar) {
        m mVar = new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(yu3.b.class), oVar, mVar);
        zVar.v(fr.q0.c(yu3.a.class), oVar, new n(null));
        zVar.v(fr.q0.c(yu3.c.class), oVar, c0Var.new o(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(pu3.c.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    /* JADX INFO: renamed from: D9, reason: from getter */
    public final ConfirmationDocumentData getData() {
        return this.data;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ConfirmationDocumentData confirmationDocumentData) {
        super.P5(confirmationDocumentData);
    }

    @Override // zx.b
    public xw.b<pu3.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yu3.g, yu3.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<yu3.h.a> getState() {
        return this.state;
    }
}
