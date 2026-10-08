package jw2;

import al0.AddPhotoData;
import cw3.IdentityPhotoData;
import fr.q0;
import java.util.Set;
import k10.c0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import wx.FileContent;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 j2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001kBs\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J4\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010(\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)2\u0006\u0010+\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0018\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H\u0096\u0001¢\u0006\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR&\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030T8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010`\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R \u0010*\u001a\b\u0012\u0004\u0012\u00020/0a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0018\u0010i\u001a\u00020$*\u00020f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"Ljw2/p;", "Ll00/g;", "Ljw2/c;", "Ljw2/a;", "Ljw2/d;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Llw2/c;", "mapper", "La14/w;", "openUrlIntentUseCase", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lbc4/d;", "checkPhotoResolutionUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lsv2/a;", "createCorrespondenceAddressDataUC", "globalSnackBarManager", "La00/b;", "pickedFileToAndroidMapper", "Liw2/n;", "filePickerErrorMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Ljw2/b;", "data", "<init>", "(Lyy/a;Llw2/c;La14/w;Lbc4/l;Lbc4/d;Lac4/a;Lsv2/a;Li70/e;La00/b;Liw2/n;Lyw/b;Lmx/c;Ljw2/b;)V", "", "age", "Lcw3/a$a;", "Q9", "(I)Lcw3/a$a;", "Ldx/b;", "domainError", "Lk10/c0;", "state", "retryAction", "Lk10/l;", "G9", "(Ldx/b;Lk10/c0;Ljw2/a;Ltq/e;)Ljava/lang/Object;", "Ljw2/d$a;", "I9", "(Ljw2/c;)Ljw2/d$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Llw2/c;", "c", "La14/w;", "d", "Lbc4/l;", "e", "Lbc4/d;", "f", "Lac4/a;", "g", "Lsv2/a;", "h", "Li70/e;", "j", "La00/b;", "k", "Liw2/n;", "l", "Lyw/b;", "m", "Lmx/c;", "n", "Ljw2/b;", "p", "Ljw2/c;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ljw2/a$c;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "Lal0/g;", "F9", "(Lal0/g;)Lcw3/a$a;", "maskType", "t", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, jw2.a> implements jw2.d, zx.d, i70.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final a f106322t = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f106323v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f106324w = xw.a.b(2500000.0f);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Set<wx.d> f106325x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final IdentityPhotoData.PhotoRequirements.Resolution f106326y;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lw2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bc4.d checkPhotoResolutionUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final sv2.a createCorrespondenceAddressDataUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final iw2.n filePickerErrorMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SetupData data;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, jw2.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<jw2.a.c> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<jw2.d.Data> state;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljw2/p$a;", "", "<init>", "()V", "Lxw/a;", "maxPhotoSize", "F", "b", "()F", "", "Lwx/d;", "allowedExtensions", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "Lcw3/a$b$a;", "minResolution", "Lcw3/a$b$a;", "c", "()Lcw3/a$b$a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final Set<wx.d> a() {
            return p.f106325x;
        }

        public final float b() {
            return p.f106324w;
        }

        public final IdentityPhotoData.PhotoRequirements.Resolution c() {
            return p.f106326y;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f106343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f106346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f106347h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f106348j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f106350l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f106348j = obj;
            this.f106350l |= PKIFailureInfo.systemUnavail;
            return p.this.G9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<jw2.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f106351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f106352b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f106353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f106354b;

            /* JADX INFO: renamed from: jw2.p$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2527a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f106355d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f106356e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f106357f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f106359h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f106360j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f106361k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f106362l;

                public C2527a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f106355d = obj;
                    this.f106356e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f106353a = hVar;
                this.f106354b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2527a c2527a;
                if (eVar instanceof C2527a) {
                    c2527a = (C2527a) eVar;
                    int i15 = c2527a.f106356e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2527a.f106356e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2527a = new C2527a(eVar);
                    }
                } else {
                    c2527a = new C2527a(eVar);
                }
                Object obj2 = c2527a.f106355d;
                Object objE = uq.b.e();
                int i16 = c2527a.f106356e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f106353a;
                    jw2.d.Data dataI9 = this.f106354b.I9((State) obj);
                    c2527a.f106357f = vq.j.a(obj);
                    c2527a.f106359h = vq.j.a(c2527a);
                    c2527a.f106360j = vq.j.a(obj);
                    c2527a.f106361k = vq.j.a(hVar);
                    c2527a.f106362l = 0;
                    c2527a.f106356e = 1;
                    if (hVar.F(dataI9, c2527a) == objE) {
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

        public c(mu.g gVar, p pVar) {
            this.f106351a = gVar;
            this.f106352b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super jw2.d.Data> hVar, tq.e eVar) {
            Object objA = this.f106351a.a(new a(hVar, this.f106352b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljw2/a$g;", "action", "Lk10/c0;", "Ljw2/c;", "state", "Lk10/l;", "<anonymous>", "(Ljw2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<jw2.a.OnImagePicked, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f106365g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f106366h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f106367j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f106368k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f106369l;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lzz/h;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends zz.h>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f106371e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f106372f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ jw2.a.OnImagePicked f106373g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, jw2.a.OnImagePicked onImagePicked, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f106372f = pVar;
                this.f106373g = onImagePicked;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f106371e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                a00.b bVar = this.f106372f.pickedFileToAndroidMapper;
                a00.b.Params params = new a00.b.Params(this.f106373g.getImage());
                this.f106371e = 1;
                Object objA = bVar.a(params, this);
                return objA == objE ? objE : objA;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f106372f, this.f106373g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends zz.h>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(zz.h hVar, State state) {
            return State.b(state, false, (zz.h.Image) hVar, false, false, false, false, 60, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
        
            if (r3.G9(r5, r1, r6, r12) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f106368k
                jw2.a$g r0 = (jw2.a.OnImagePicked) r0
                java.lang.Object r1 = r12.f106369l
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r12.f106367j
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L30
                if (r3 == r5) goto L2b
                if (r3 != r4) goto L23
                java.lang.Object r0 = r12.f106364f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r12.f106363e
                dx.i r0 = (dx.i) r0
                oq.u.b(r13)
                r9 = r12
                goto L8b
            L23:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L2b:
                oq.u.b(r13)
                r9 = r12
                goto L56
            L30:
                oq.u.b(r13)
                jw2.p r13 = jw2.p.this
                ac4.a r6 = jw2.p.q9(r13)
                jw2.p$d$a r8 = new jw2.p$d$a
                jw2.p r13 = jw2.p.this
                r3 = 0
                r8.<init>(r13, r0, r3)
                java.lang.Object r13 = vq.j.a(r0)
                r12.f106368k = r13
                r12.f106369l = r1
                r12.f106367j = r5
                r7 = 0
                r10 = 1
                r11 = 0
                r9 = r12
                java.lang.Object r13 = ac4.a.a(r6, r7, r8, r9, r10, r11)
                if (r13 != r2) goto L56
                goto L8a
            L56:
                dx.i r13 = (dx.i) r13
                jw2.p r3 = jw2.p.this
                boolean r5 = r13 instanceof dx.i.Left
                if (r5 == 0) goto L90
                r5 = r13
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                jw2.a$l r6 = jw2.a.l.f106280a
                java.lang.Object r0 = vq.j.a(r0)
                r9.f106368k = r0
                r9.f106369l = r1
                java.lang.Object r13 = vq.j.a(r13)
                r9.f106363e = r13
                java.lang.Object r13 = vq.j.a(r5)
                r9.f106364f = r13
                r13 = 0
                r9.f106365g = r13
                r9.f106366h = r13
                r9.f106367j = r4
                java.lang.Object r13 = jw2.p.C9(r3, r5, r1, r6, r12)
                if (r13 != r2) goto L8b
            L8a:
                return r2
            L8b:
                k10.l r13 = r1.c()
                return r13
            L90:
                boolean r0 = r13 instanceof dx.i.Right
                if (r0 == 0) goto La6
                dx.i$c r13 = (dx.i.Right) r13
                java.lang.Object r13 = r13.b()
                zz.h r13 = (zz.h) r13
                jw2.q r0 = new jw2.q
                r0.<init>()
                k10.l r13 = r1.b(r0)
                return r13
            La6:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: jw2.p.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.OnImagePicked onImagePicked, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f106368k = onImagePicked;
            dVar.f106369l = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljw2/a$a;", "<unused var>", "Lk10/c0;", "Ljw2/c;", "state", "Lk10/l;", "<anonymous>", "(Ljw2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<jw2.a.C2524a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106375f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, null, false, false, false, false, 61, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f106375f;
            uq.b.e();
            if (this.f106374e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jw2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.C2524a c2524a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f106375f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljw2/a$f;", "action", "Ljw2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljw2/a$f;Ljw2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<jw2.a.OnImageClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106377f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jw2.a.OnImageClick onImageClick = (jw2.a.OnImageClick) this.f106377f;
            Object objE = uq.b.e();
            int i15 = this.f106376e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                jw2.a.c.ShowImagePreview showImagePreview = new jw2.a.c.ShowImagePreview(new dx3.a.Content(onImageClick.getTitle(), onImageClick.getFileContent()));
                this.f106377f = vq.j.a(onImageClick);
                this.f106376e = 1;
                if (pVar.F(showImagePreview, this) == objE) {
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
        public final Object w(jw2.a.OnImageClick onImageClick, State state, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f106377f = onImageClick;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljw2/a$h;", "<unused var>", "Lk10/c0;", "Ljw2/c;", "state", "Lk10/l;", "<anonymous>", "(Ljw2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<jw2.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106380f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, null, false, false, false, false, 59, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f106380f;
            uq.b.e();
            if (this.f106379e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jw2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f106380f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljw2/a$e;", "action", "Ljw2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljw2/a$e;Ljw2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<jw2.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106381e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f106381e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                jw2.a.c.b bVar = jw2.a.c.b.f106262a;
                this.f106381e = 1;
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
        public final Object w(jw2.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return p.this.new h(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljw2/a$i;", "action", "Ljw2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljw2/a$i;Ljw2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<jw2.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106383e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f106383e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                jw2.a.c.C2526c c2526c = jw2.a.c.C2526c.f106263a;
                this.f106383e = 1;
                if (pVar.F(c2526c, this) == objE) {
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
        public final Object w(jw2.a.i iVar, State state, tq.e<? super i0> eVar) {
            return p.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Ljw2/c;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106386f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljw2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f106388e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f106389f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f106390g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ p f106391h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c0<State> f106392j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f106391h = pVar;
                this.f106392j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(zz.h hVar, State state) {
                return State.b(state, false, hVar instanceof zz.h.Image ? (zz.h.Image) hVar : null, false, false, false, false, 61, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final zz.h hVar;
                wx.i.Image file;
                Object objE = uq.b.e();
                int i15 = this.f106390g;
                if (i15 == 0) {
                    oq.u.b(obj);
                    AddPhotoData addPhotoDataU0 = this.f106391h.data.getContract().U0();
                    if (addPhotoDataU0 == null || (file = addPhotoDataU0.getFile()) == null) {
                        hVar = null;
                    } else {
                        a00.b bVar = this.f106391h.pickedFileToAndroidMapper;
                        a00.b.Params params = new a00.b.Params(file);
                        this.f106388e = vq.j.a(file);
                        this.f106389f = 0;
                        this.f106390g = 1;
                        obj = bVar.a(params, this);
                        if (obj == objE) {
                            return objE;
                        }
                    }
                    return this.f106392j.b(new er.l() { // from class: jw2.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.j.a.V(hVar, (State) obj2);
                        }
                    });
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                hVar = (zz.h) ((dx.i) obj).a();
                return this.f106392j.b(new er.l() { // from class: jw2.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.j.a.V(hVar, (State) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f106391h, this.f106392j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f106386f;
            Object objE = uq.b.e();
            int i15 = this.f106385e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p.this, c0Var, null);
            this.f106386f = vq.j.a(c0Var);
            this.f106385e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((j) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            j jVar = p.this.new j(eVar);
            jVar.f106386f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljw2/a$j;", "action", "Ljw2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljw2/a$j;Ljw2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<jw2.a.OpenUrl, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106394f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jw2.a.OpenUrl openUrl = (jw2.a.OpenUrl) this.f106394f;
            Object objE = uq.b.e();
            int i15 = this.f106393e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = p.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f106394f = vq.j.a(openUrl);
                this.f106393e = 1;
                obj = wVar.c(params, this);
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
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                pVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.OpenUrl openUrl, State state, tq.e<? super i0> eVar) {
            k kVar = p.this.new k(eVar);
            kVar.f106394f = openUrl;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljw2/a$d;", "<unused var>", "Lk10/c0;", "Ljw2/c;", "state", "Lk10/l;", "<anonymous>", "(Ljw2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<jw2.a.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f106398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f106399h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f106400j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f106401k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f106402l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f106403m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f106404n;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, true, null, true, false, false, false, 58, null);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0106 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0107 A[RETURN] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f106404n;
            Object objE = uq.b.e();
            int i15 = this.f106403m;
            if (i15 != 0) {
                if (i15 != 1 && i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f106398g;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            State state = (State) c0Var.a();
            zz.h.Image pickedFile = state.getPickedFile();
            if (pickedFile == null) {
                p.this.accessibilityTalkBackManager.a(p.this.labelProvider.c(gv2.a.B).getText());
                return c0Var.b(new er.l() { // from class: jw2.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.l.O((State) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            p pVar = p.this;
            AddPhotoData addPhotoData = new AddPhotoData(pickedFile.a(), state.getIsFaceCoveringPhotoOptionChecked(), state.getIsPhotoWithGlassesOptionChecked());
            pVar.data.getContract().O0(addPhotoData);
            if (addPhotoData.getIsAnyAdditionalPhotoSelected()) {
                jw2.a.c.C2525a c2525a = jw2.a.c.C2525a.f106261a;
                this.f106404n = vq.j.a(c0Var);
                this.f106396e = vq.j.a(state);
                this.f106397f = vq.j.a(pickedFile);
                this.f106398g = lVarC;
                this.f106399h = vq.j.a(lVarC);
                this.f106400j = vq.j.a(addPhotoData);
                this.f106401k = 0;
                this.f106402l = 0;
                this.f106403m = 1;
                if (pVar.F(c2525a, this) == objE) {
                    return objE;
                }
                return lVarC;
            }
            jw2.a.c.CorrespondenceAddress correspondenceAddress = new jw2.a.c.CorrespondenceAddress(pVar.createCorrespondenceAddressDataUC.b(new sv2.a.Params(pVar.data.getContract().k())));
            this.f106404n = vq.j.a(c0Var);
            this.f106396e = vq.j.a(state);
            this.f106397f = vq.j.a(pickedFile);
            this.f106398g = lVarC;
            this.f106399h = vq.j.a(lVarC);
            this.f106400j = vq.j.a(addPhotoData);
            this.f106401k = 0;
            this.f106402l = 0;
            this.f106403m = 2;
            if (pVar.F(correspondenceAddress, this) == objE) {
                return objE;
            }
            return lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = p.this.new l(eVar);
            lVar.f106404n = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljw2/a$b;", "action", "Lk10/c0;", "Ljw2/c;", "state", "Lk10/l;", "<anonymous>", "(Ljw2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<jw2.a.FaceCoveringPhotoOptionChecked, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f106408g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(jw2.a.FaceCoveringPhotoOptionChecked faceCoveringPhotoOptionChecked, State state) {
            return State.b(state, false, null, false, faceCoveringPhotoOptionChecked.getChecked(), false, false, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jw2.a.FaceCoveringPhotoOptionChecked faceCoveringPhotoOptionChecked = (jw2.a.FaceCoveringPhotoOptionChecked) this.f106407f;
            c0 c0Var = (c0) this.f106408g;
            uq.b.e();
            if (this.f106406e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jw2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.m.O(faceCoveringPhotoOptionChecked, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.FaceCoveringPhotoOptionChecked faceCoveringPhotoOptionChecked, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f106407f = faceCoveringPhotoOptionChecked;
            mVar.f106408g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljw2/a$k;", "action", "Lk10/c0;", "Ljw2/c;", "state", "Lk10/l;", "<anonymous>", "(Ljw2/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<jw2.a.PhotoWithGlassesOptionChecked, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f106411g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(jw2.a.PhotoWithGlassesOptionChecked photoWithGlassesOptionChecked, State state) {
            return State.b(state, false, null, false, false, photoWithGlassesOptionChecked.getChecked(), false, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jw2.a.PhotoWithGlassesOptionChecked photoWithGlassesOptionChecked = (jw2.a.PhotoWithGlassesOptionChecked) this.f106410f;
            c0 c0Var = (c0) this.f106411g;
            uq.b.e();
            if (this.f106409e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jw2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.n.O(photoWithGlassesOptionChecked, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.PhotoWithGlassesOptionChecked photoWithGlassesOptionChecked, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f106410f = photoWithGlassesOptionChecked;
            nVar.f106411g = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljw2/a$l;", "action", "Lk10/c0;", "Ljw2/c;", "state", "Lk10/l;", "<anonymous>", "(Ljw2/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<jw2.a.l, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f106414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f106415h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f106416j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f106417k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f106418l;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lzz/h;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends zz.h>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f106420e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f106421f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ bc4.l.Result f106422g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, bc4.l.Result result, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f106421f = pVar;
                this.f106422g = result;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f106420e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                a00.b bVar = this.f106421f.pickedFileToAndroidMapper;
                a00.b.Params params = new a00.b.Params(this.f106422g.getImageFile());
                this.f106420e = 1;
                Object objA = bVar.a(params, this);
                return objA == objE ? objE : objA;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f106421f, this.f106422g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends zz.h>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(zz.h.Image image, State state) {
            return State.b(state, false, image, false, false, false, false, 60, null);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:44:0x0127  */
        /* JADX WARN: Code duplicated, block: B:46:0x012b  */
        /* JADX WARN: Code duplicated, block: B:49:0x0141  */
        /* JADX WARN: Code duplicated, block: B:54:0x0172  */
        /* JADX WARN: Code duplicated, block: B:56:0x0176  */
        /* JADX WARN: Code duplicated, block: B:58:0x019d  */
        /* JADX WARN: Code duplicated, block: B:60:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
        
            if (r0 == r8) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x016c, code lost:
        
            if (r0 == r8) goto L51;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 437
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jw2.p.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.l lVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = p.this.new o(eVar);
            oVar.f106417k = lVar;
            oVar.f106418l = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: jw2.p$p, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljw2/a$m;", "<unused var>", "Ljw2/c;", "Loq/i0;", "<anonymous>", "(Ljw2/a$m;Ljw2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2528p extends vq.k implements er.q<jw2.a.m, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f106424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f106425g;

        C2528p(tq.e<? super C2528p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar, wx.i.Image image) {
            pVar.d9(new jw2.a.OnImagePicked(image));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f106425g;
            if (i15 == 0) {
                oq.u.b(obj);
                IdentityPhotoData.PhotoRequirements photoRequirements = new IdentityPhotoData.PhotoRequirements(p.f106322t.b(), p.f106322t.a(), p.f106322t.c(), null);
                boolean z15 = !(p.this.data.getContract().getRequireOwnerWithAge() instanceof al0.g.b);
                p pVar = p.this;
                IdentityPhotoData.AbstractC0815a abstractC0815aF9 = pVar.F9(pVar.data.getContract().getRequireOwnerWithAge());
                final p pVar2 = p.this;
                jw2.a.c.IdentityPhoto identityPhoto = new jw2.a.c.IdentityPhoto(new IdentityPhotoData(photoRequirements, z15, abstractC0815aF9, new er.l() { // from class: jw2.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.C2528p.O(pVar2, (wx.i.Image) obj2);
                    }
                }));
                xw.b<jw2.a.c> bVarY1 = p.this.Y1();
                this.f106423e = vq.j.a(identityPhoto);
                this.f106424f = 0;
                this.f106425g = 1;
                if (bVarY1.F(identityPhoto, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jw2.a.m mVar, State state, tq.e<? super i0> eVar) {
            return p.this.new C2528p(eVar).J(i0.f148189a);
        }
    }

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        f106325x = e1.i(wx.d.j0(companion.v()), wx.d.j0(companion.u()), wx.d.j0(companion.K()));
        f106326y = new IdentityPhotoData.PhotoRequirements.Resolution(492, 633);
    }

    public p(yy.a aVar, lw2.c cVar, a14.w wVar, bc4.l lVar, bc4.d dVar, ac4.a aVar2, sv2.a aVar3, i70.e eVar, a00.b bVar, iw2.n nVar, yw.b bVar2, mx.c cVar2, SetupData setupData) {
        this.mapper = cVar;
        this.openUrlIntentUseCase = wVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.checkPhotoResolutionUseCase = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.createCorrespondenceAddressDataUC = aVar3;
        this.globalSnackBarManager = eVar;
        this.pickedFileToAndroidMapper = bVar;
        this.filePickerErrorMapper = nVar;
        this.accessibilityTalkBackManager = bVar2;
        this.labelProvider = cVar2;
        this.data = setupData;
        AddPhotoData addPhotoDataU0 = setupData.getContract().U0();
        State state = new State(false, null, false, addPhotoDataU0 != null ? addPhotoDataU0.getIsFaceCoveringPhotoOptionChecked() : false, addPhotoDataU0 != null ? addPhotoDataU0.getIsPhotoWithGlassesOptionChecked() : false, setupData.getIdentityPhotoEnabled(), 4, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: jw2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.O9(this.f106321a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), I9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityPhotoData.AbstractC0815a F9(al0.g gVar) {
        if (gVar instanceof al0.g.Child) {
            return Q9(((al0.g.Child) gVar).getAge());
        }
        if (fr.t.c(gVar, al0.g.b.f7359a)) {
            return IdentityPhotoData.AbstractC0815a.C0816a.f38347a;
        }
        if (gVar instanceof al0.g.Ward) {
            return Q9(((al0.g.Ward) gVar).getAge());
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (F(r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (F(r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G9(dx.b r7, k10.c0<jw2.State> r8, final jw2.a r9, tq.e<? super k10.l<jw2.State>> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof jw2.p.b
            if (r0 == 0) goto L13
            r0 = r10
            jw2.p$b r0 = (jw2.p.b) r0
            int r1 = r0.f106350l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106350l = r1
            goto L18
        L13:
            jw2.p$b r0 = new jw2.p$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f106348j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f106350l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.Object r7 = r0.f106346g
            iw2.n$b r7 = (iw2.n.b) r7
            java.lang.Object r7 = r0.f106345f
            jw2.a r7 = (jw2.a) r7
            java.lang.Object r7 = r0.f106344e
            r8 = r7
            k10.c0 r8 = (k10.c0) r8
            java.lang.Object r7 = r0.f106343d
            dx.b r7 = (dx.b) r7
            oq.u.b(r10)
            goto Lc1
        L47:
            oq.u.b(r10)
            iw2.n r10 = r6.filePickerErrorMapper
            iw2.n$a$b r2 = new iw2.n$a$b
            jw2.n r5 = new jw2.n
            r5.<init>()
            r2.<init>(r7, r5)
            iw2.n$b r10 = r10.b(r2)
            if (r10 == 0) goto Lc1
            boolean r2 = r10 instanceof iw2.n.b.Dialog
            r5 = 0
            if (r2 == 0) goto L8c
            jw2.a$c$h r2 = new jw2.a$c$h
            r3 = r10
            iw2.n$b$a r3 = (iw2.n.b.Dialog) r3
            cb4.d r3 = r3.getDialogData()
            r2.<init>(r3)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f106343d = r7
            r0.f106344e = r8
            java.lang.Object r7 = vq.j.a(r9)
            r0.f106345f = r7
            java.lang.Object r7 = vq.j.a(r10)
            r0.f106346g = r7
            r0.f106347h = r5
            r0.f106350l = r4
            java.lang.Object r7 = r6.F(r2, r0)
            if (r7 != r1) goto Lc1
            goto Lba
        L8c:
            boolean r2 = r10 instanceof iw2.n.b.FullPage
            if (r2 == 0) goto Lbb
            jw2.a$c$f r2 = new jw2.a$c$f
            r4 = r10
            iw2.n$b$b r4 = (iw2.n.b.FullPage) r4
            jb4.b r4 = r4.getData()
            r2.<init>(r4)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f106343d = r7
            r0.f106344e = r8
            java.lang.Object r7 = vq.j.a(r9)
            r0.f106345f = r7
            java.lang.Object r7 = vq.j.a(r10)
            r0.f106346g = r7
            r0.f106347h = r5
            r0.f106350l = r3
            java.lang.Object r7 = r6.F(r2, r0)
            if (r7 != r1) goto Lc1
        Lba:
            return r1
        Lbb:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        Lc1:
            k10.l r7 = r8.c()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jw2.p.G9(dx.b, k10.c0, jw2.a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(p pVar, jw2.a aVar) {
        pVar.d9(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jw2.d.Data I9(State state) {
        lw2.c cVar = this.mapper;
        float f15 = f106324w;
        IdentityPhotoData.PhotoRequirements.Resolution resolution = f106326y;
        return cVar.b(new lw2.c.Params(state, f15, resolution.getLongSide(), resolution.getShortSide(), new er.l() { // from class: jw2.i
            @Override // er.l
            public final Object b(Object obj) {
                return p.J9(this.f106314a, (String) obj);
            }
        }, b9(jw2.a.d.f106269a), new er.l() { // from class: jw2.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.K9(this.f106315a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: jw2.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.L9(this.f106316a, ((Boolean) obj).booleanValue());
            }
        }, b9(jw2.a.l.f106280a), b9(jw2.a.C2524a.f106259a), new er.p() { // from class: jw2.l
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.M9(this.f106317a, (Label) obj, (FileContent) obj2);
            }
        }, b9(jw2.a.h.f106276a), b9(jw2.a.m.f106281a), b9(jw2.a.e.f106270a), b9(jw2.a.i.f106277a), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(p pVar, String str) {
        pVar.d9(new jw2.a.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(p pVar, boolean z15) {
        pVar.d9(new jw2.a.FaceCoveringPhotoOptionChecked(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(p pVar, boolean z15) {
        pVar.d9(new jw2.a.PhotoWithGlassesOptionChecked(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(p pVar, Label label, FileContent fileContent) {
        pVar.d9(new jw2.a.OnImageClick(label, fileContent));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: jw2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.P9(this.f106318a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(p pVar, k10.z zVar) {
        h hVar = pVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(jw2.a.e.class), oVar, hVar);
        zVar.x(q0.c(jw2.a.i.class), oVar, pVar.new i(null));
        zVar.A(pVar.new j(null));
        zVar.x(q0.c(jw2.a.OpenUrl.class), oVar, pVar.new k(null));
        zVar.v(q0.c(jw2.a.d.class), oVar, pVar.new l(null));
        zVar.v(q0.c(jw2.a.FaceCoveringPhotoOptionChecked.class), oVar, new m(null));
        zVar.v(q0.c(jw2.a.PhotoWithGlassesOptionChecked.class), oVar, new n(null));
        zVar.v(q0.c(jw2.a.l.class), oVar, pVar.new o(null));
        zVar.x(q0.c(jw2.a.m.class), oVar, pVar.new C2528p(null));
        zVar.v(q0.c(jw2.a.OnImagePicked.class), oVar, pVar.new d(null));
        zVar.v(q0.c(jw2.a.C2524a.class), oVar, new e(null));
        zVar.x(q0.c(jw2.a.OnImageClick.class), oVar, pVar.new f(null));
        zVar.v(q0.c(jw2.a.h.class), oVar, new g(null));
        return i0.f148189a;
    }

    private final IdentityPhotoData.AbstractC0815a Q9(int age) {
        if (age < 0 || age >= 5) {
            return (5 > age || age >= 11) ? IdentityPhotoData.AbstractC0815a.C0816a.f38347a : IdentityPhotoData.AbstractC0815a.d.f38356a;
        }
        return IdentityPhotoData.AbstractC0815a.b.f38350a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(jw2.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<jw2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, jw2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<jw2.d.Data> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
