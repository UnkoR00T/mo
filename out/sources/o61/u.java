package o61;

import al0.AddPhotoData;
import cw3.IdentityPhotoData;
import fr.q0;
import java.util.Set;
import mu.p0;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import wx.FileContent;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 i2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001jB{\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b'\u0010(J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0018\u00104\u001a\u00020,2\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR&\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030V8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u0010b\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010h\u001a\b\u0012\u0004\u0012\u00020/0c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g¨\u0006k"}, d2 = {"Lo61/u;", "Ll00/g;", "Lo61/c;", "Lo61/a;", "Lo61/d;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lq61/b;", "mapper", "La14/w;", "openUrlIntentUseCase", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lbc4/d;", "checkPhotoResolutionUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "globalSnackBarManager", "Lib4/c;", "genericErrorMapper", "Lhb4/d;", "errorVMSFactory", "La00/b;", "pickedFileToAndroidMapper", "Lq61/f;", "filePickerErrorMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lo61/b;", "setupData", "<init>", "(Lyy/a;Lq61/b;La14/w;Lbc4/l;Lbc4/d;Lac4/a;Li70/e;Lib4/c;Lhb4/d;La00/b;Lq61/f;Lyw/b;Lmx/c;Lo61/b;)V", "", "age", "Lcw3/a$a;", "U9", "(Ljava/lang/Integer;)Lcw3/a$a;", "Ldx/b;", "domainError", "retryAction", "Loq/i0;", "I9", "(Ldx/b;Lo61/a;Ltq/e;)Ljava/lang/Object;", "Lo61/d$a;", "K9", "(Lo61/c;)Lo61/d$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lq61/b;", "c", "La14/w;", "d", "Lbc4/l;", "e", "Lbc4/d;", "f", "Lac4/a;", "g", "Li70/e;", "h", "Lib4/c;", "j", "Lhb4/d;", "k", "La00/b;", "l", "Lq61/f;", "m", "Lyw/b;", "n", "Lmx/c;", "p", "Lo61/b;", "Lo61/c$c;", "q", "Lo61/c$c;", "initialState", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lo61/a$g;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "v", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<o61.c, o61.a> implements o61.d, zx.d, i70.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final a f142628v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f142629w = 8;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f142630x = xw.a.b(2500000.0f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final bc4.l.a.Limited f142631y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final IdentityPhotoData.PhotoRequirements.Resolution f142632z;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q61.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bc4.d checkPhotoResolutionUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final q61.f filePickerErrorMapper;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final o61.c.Presenting initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<o61.c, o61.a> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<o61.a.g> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<o61.d.a> state;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lo61/u$a;", "", "<init>", "()V", "Lxw/a;", "maxPhotoSize", "F", "b", "()F", "Lbc4/l$a$b;", "allowedExtensions", "Lbc4/l$a$b;", "a", "()Lbc4/l$a$b;", "Lcw3/a$b$a;", "minResolution", "Lcw3/a$b$a;", "c", "()Lcw3/a$b$a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final bc4.l.a.Limited a() {
            return u.f142631y;
        }

        public final float b() {
            return u.f142630x;
        }

        public final IdentityPhotoData.PhotoRequirements.Resolution c() {
            return u.f142632z;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<o61.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f142650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f142651b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f142652a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f142653b;

            /* JADX INFO: renamed from: o61.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3534a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f142654d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f142655e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f142656f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f142658h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f142659j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f142660k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f142661l;

                public C3534a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f142654d = obj;
                    this.f142655e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f142652a = hVar;
                this.f142653b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3534a c3534a;
                if (eVar instanceof C3534a) {
                    c3534a = (C3534a) eVar;
                    int i15 = c3534a.f142655e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3534a.f142655e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3534a = new C3534a(eVar);
                    }
                } else {
                    c3534a = new C3534a(eVar);
                }
                Object obj2 = c3534a.f142654d;
                Object objE = uq.b.e();
                int i16 = c3534a.f142655e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f142652a;
                    o61.d.a aVarK9 = this.f142653b.K9((o61.c) obj);
                    c3534a.f142656f = vq.j.a(obj);
                    c3534a.f142658h = vq.j.a(c3534a);
                    c3534a.f142659j = vq.j.a(obj);
                    c3534a.f142660k = vq.j.a(hVar);
                    c3534a.f142661l = 0;
                    c3534a.f142655e = 1;
                    if (hVar.F(aVarK9, c3534a) == objE) {
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

        public b(mu.g gVar, u uVar) {
            this.f142650a = gVar;
            this.f142651b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o61.d.a> hVar, tq.e eVar) {
            Object objA = this.f142650a.a(new a(hVar, this.f142651b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo61/a$p;", "<unused var>", "Lo61/c;", "state", "Loq/i0;", "<anonymous>", "(Lo61/a$p;Lo61/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<o61.a.p, o61.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142663f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o61.c cVar = (o61.c) this.f142663f;
            uq.b.e();
            if (this.f142662e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            zz.h.Image pickedFile = cVar.getData().getPickedFile();
            if (pickedFile != null) {
                u.this.setupData.getContract().O0(new AddPhotoData(pickedFile.a(), cVar.getData().getIsFaceCoveringPhotoOptionChecked(), cVar.getData().getIsPhotoWithGlassesOptionChecked()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.p pVar, o61.c cVar, tq.e<? super oq.i0> eVar) {
            c cVar2 = u.this.new c(eVar);
            cVar2.f142663f = cVar;
            return cVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$k;", "action", "Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<o61.a.OnImagePicked, k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f142665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f142666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f142667g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f142668h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f142669j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f142670k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f142671l;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lzz/h;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends zz.h>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f142673e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f142674f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ o61.a.OnImagePicked f142675g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, o61.a.OnImagePicked onImagePicked, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f142674f = uVar;
                this.f142675g = onImagePicked;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f142673e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                a00.b bVar = this.f142674f.pickedFileToAndroidMapper;
                a00.b.Params params = new a00.b.Params(this.f142675g.getImage());
                this.f142673e = 1;
                Object objA = bVar.a(params, this);
                return objA == objE ? objE : objA;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f142674f, this.f142675g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends zz.h>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Presenting O(zz.h hVar, o61.c.Presenting presenting) {
            return presenting.a(o61.c.Data.b(presenting.getData(), false, (zz.h.Image) hVar, false, false, false, 28, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
        
            if (r3.I9(r5, r6, r12) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f142670k
                o61.a$k r0 = (o61.a.OnImagePicked) r0
                java.lang.Object r1 = r12.f142671l
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r12.f142669j
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L30
                if (r3 == r5) goto L2b
                if (r3 != r4) goto L23
                java.lang.Object r0 = r12.f142666f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r12.f142665e
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
                o61.u r13 = o61.u.this
                ac4.a r6 = o61.u.s9(r13)
                o61.u$d$a r8 = new o61.u$d$a
                o61.u r13 = o61.u.this
                r3 = 0
                r8.<init>(r13, r0, r3)
                java.lang.Object r13 = vq.j.a(r0)
                r12.f142670k = r13
                r12.f142671l = r1
                r12.f142669j = r5
                r7 = 0
                r10 = 1
                r11 = 0
                r9 = r12
                java.lang.Object r13 = ac4.a.a(r6, r7, r8, r9, r10, r11)
                if (r13 != r2) goto L56
                goto L8a
            L56:
                dx.i r13 = (dx.i) r13
                o61.u r3 = o61.u.this
                boolean r5 = r13 instanceof dx.i.Left
                if (r5 == 0) goto L90
                r5 = r13
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                o61.a$o r6 = o61.a.o.f142572a
                java.lang.Object r0 = vq.j.a(r0)
                r9.f142670k = r0
                r9.f142671l = r1
                java.lang.Object r13 = vq.j.a(r13)
                r9.f142665e = r13
                java.lang.Object r13 = vq.j.a(r5)
                r9.f142666f = r13
                r13 = 0
                r9.f142667g = r13
                r9.f142668h = r13
                r9.f142669j = r4
                java.lang.Object r13 = o61.u.E9(r3, r5, r6, r12)
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
                o61.v r0 = new o61.v
                r0.<init>()
                k10.l r13 = r1.b(r0)
                return r13
            La6:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o61.u.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.OnImagePicked onImagePicked, k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            d dVar = u.this.new d(eVar);
            dVar.f142670k = onImagePicked;
            dVar.f142671l = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$d;", "<unused var>", "Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<o61.a.d, k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142677f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Presenting O(o61.c.Presenting presenting) {
            return presenting.a(o61.c.Data.b(presenting.getData(), false, null, false, false, false, 29, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f142677f;
            uq.b.e();
            if (this.f142676e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o61.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O((c.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.d dVar, k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f142677f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo61/a$j;", "action", "Lo61/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo61/a$j;Lo61/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<o61.a.OnImageClick, o61.c.Presenting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142679f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o61.a.OnImageClick onImageClick = (o61.a.OnImageClick) this.f142679f;
            Object objE = uq.b.e();
            int i15 = this.f142678e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                o61.a.g.ShowImagePreview showImagePreview = new o61.a.g.ShowImagePreview(new dx3.a.Content(onImageClick.getTitle(), onImageClick.getFileContent()));
                this.f142679f = vq.j.a(onImageClick);
                this.f142678e = 1;
                if (uVar.F(showImagePreview, this) == objE) {
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
        public final Object w(o61.a.OnImageClick onImageClick, o61.c.Presenting presenting, tq.e<? super oq.i0> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f142679f = onImageClick;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$l;", "<unused var>", "Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<o61.a.l, k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142682f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Presenting O(o61.c.Presenting presenting) {
            return presenting.a(o61.c.Data.b(presenting.getData(), false, null, false, false, false, 27, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f142682f;
            uq.b.e();
            if (this.f142681e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o61.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.O((c.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.l lVar, k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            g gVar = new g(eVar);
            gVar.f142682f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo61/a$a;", "<unused var>", "Lo61/c$c;", "state", "Loq/i0;", "<anonymous>", "(Lo61/a$a;Lo61/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<o61.a.C3529a, o61.c.Presenting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142683e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f142683e;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.d9(o61.a.p.f142573a);
                u uVar = u.this;
                o61.a.g.b bVar = o61.a.g.b.f142555a;
                this.f142683e = 1;
                if (uVar.F(bVar, this) == objE) {
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
        public final Object w(o61.a.C3529a c3529a, o61.c.Presenting presenting, tq.e<? super oq.i0> eVar) {
            return u.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$e;", "action", "Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<o61.a.Error, k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142687g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Error V(k10.c0 c0Var, final u uVar, final o61.a.Error error, o61.c.Presenting presenting) {
            return new o61.c.Error(((o61.c.Presenting) c0Var.a()).getData(), uVar.errorVMSFactory.a(uVar.genericErrorMapper.b(new ib4.c.Params(error.getDomainError(), false, new er.l() { // from class: o61.z
                @Override // er.l
                public final Object b(Object obj) {
                    return u.i.X(uVar, error, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(u uVar, o61.a.Error error, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
                uVar.d9(o61.a.c.f142549a);
            } else if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                uVar.d9(o61.a.c.f142549a);
                uVar.d9(error.getRetryAction());
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                uVar.d9(o61.a.c.f142549a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o61.a.Error error = (o61.a.Error) this.f142686f;
            final k10.c0 c0Var = (k10.c0) this.f142687g;
            uq.b.e();
            if (this.f142685e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final u uVar = u.this;
            return c0Var.d(new er.l() { // from class: o61.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.i.V(c0Var, uVar, error, (c.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.Error error, k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f142686f = error;
            iVar.f142687g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo61/a$b;", "<unused var>", "Lo61/c$c;", "Loq/i0;", "<anonymous>", "(Lo61/a$b;Lo61/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<o61.a.b, o61.c.Presenting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142689e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f142689e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(o61.a.p.f142573a);
            u.this.d9(o61.a.g.c.f142556a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.b bVar, o61.c.Presenting presenting, tq.e<? super oq.i0> eVar) {
            return u.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo61/a$g;", "action", "Lo61/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo61/a$g;Lo61/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<o61.a.g, o61.c.Presenting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142692f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o61.a.g gVar = (o61.a.g) this.f142692f;
            Object objE = uq.b.e();
            int i15 = this.f142691e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                this.f142692f = vq.j.a(gVar);
                this.f142691e = 1;
                if (uVar.F(gVar, this) == objE) {
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
        public final Object w(o61.a.g gVar, o61.c.Presenting presenting, tq.e<? super oq.i0> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f142692f = gVar;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142695f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lo61/c$c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends o61.c.Presenting>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f142697e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f142698f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f142699g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ u f142700h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<o61.c.Presenting> f142701j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, k10.c0<o61.c.Presenting> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f142700h = uVar;
                this.f142701j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o61.c.Presenting V(zz.h hVar, o61.c.Presenting presenting) {
                return presenting.a(o61.c.Data.b(presenting.getData(), false, hVar instanceof zz.h.Image ? (zz.h.Image) hVar : null, false, false, false, 29, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final zz.h hVar;
                wx.i.Image file;
                Object objE = uq.b.e();
                int i15 = this.f142699g;
                if (i15 == 0) {
                    oq.u.b(obj);
                    AddPhotoData addPhotoDataU0 = this.f142700h.setupData.getContract().U0();
                    if (addPhotoDataU0 == null || (file = addPhotoDataU0.getFile()) == null) {
                        hVar = null;
                    } else {
                        a00.b bVar = this.f142700h.pickedFileToAndroidMapper;
                        a00.b.Params params = new a00.b.Params(file);
                        this.f142697e = vq.j.a(file);
                        this.f142698f = 0;
                        this.f142699g = 1;
                        obj = bVar.a(params, this);
                        if (obj == objE) {
                            return objE;
                        }
                    }
                    return this.f142701j.b(new er.l() { // from class: o61.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.l.a.V(hVar, (c.Presenting) obj2);
                        }
                    });
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                hVar = (zz.h) ((dx.i) obj).a();
                return this.f142701j.b(new er.l() { // from class: o61.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.l.a.V(hVar, (c.Presenting) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f142700h, this.f142701j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<o61.c.Presenting>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f142695f;
            Object objE = uq.b.e();
            int i15 = this.f142694e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = u.this.callActionWithLoaderUseCase;
            a aVar2 = new a(u.this, c0Var, null);
            this.f142695f = vq.j.a(c0Var);
            this.f142694e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            return ((l) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l lVar = u.this.new l(eVar);
            lVar.f142695f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo61/a$m;", "action", "Lo61/c$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo61/a$m;Lo61/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<o61.a.OpenUrl, o61.c.Presenting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142703f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o61.a.OpenUrl openUrl = (o61.a.OpenUrl) this.f142703f;
            Object objE = uq.b.e();
            int i15 = this.f142702e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = u.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f142703f = vq.j.a(openUrl);
                this.f142702e = 1;
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.OpenUrl openUrl, o61.c.Presenting presenting, tq.e<? super oq.i0> eVar) {
            m mVar = u.this.new m(eVar);
            mVar.f142703f = openUrl;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$h;", "<unused var>", "Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<o61.a.h, k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142706f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Presenting O(o61.c.Presenting presenting) {
            return presenting.a(o61.c.Data.b(presenting.getData(), true, null, true, false, false, 26, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f142706f;
            uq.b.e();
            if (this.f142705e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o61.c.Presenting presenting = (o61.c.Presenting) c0Var.a();
            zz.h.Image pickedFile = presenting.getData().getPickedFile();
            if (pickedFile == null) {
                u.this.accessibilityTalkBackManager.a(u.this.labelProvider.c(w51.a.f210302b4).getText());
                return c0Var.b(new er.l() { // from class: o61.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.n.O((c.Presenting) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            u uVar = u.this;
            AddPhotoData addPhotoData = new AddPhotoData(pickedFile.a(), presenting.getData().getIsFaceCoveringPhotoOptionChecked(), presenting.getData().getIsPhotoWithGlassesOptionChecked());
            uVar.d9(o61.a.p.f142573a);
            boolean isAnyAdditionalPhotoSelected = addPhotoData.getIsAnyAdditionalPhotoSelected();
            if (isAnyAdditionalPhotoSelected) {
                uVar.d9(o61.a.g.C3530a.f142554a);
                return lVarC;
            }
            if (isAnyAdditionalPhotoSelected) {
                throw new oq.p();
            }
            if (uVar.setupData.getContract().M5()) {
                uVar.d9(o61.a.g.i.f142561a);
                return lVarC;
            }
            uVar.d9(o61.a.g.h.f142560a);
            return lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.h hVar, k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            n nVar = u.this.new n(eVar);
            nVar.f142706f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$f;", "action", "Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<o61.a.FaceCoveringPhotoOptionChecked, k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142709f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142710g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Presenting O(o61.a.FaceCoveringPhotoOptionChecked faceCoveringPhotoOptionChecked, o61.c.Presenting presenting) {
            return presenting.a(o61.c.Data.b(presenting.getData(), false, null, false, faceCoveringPhotoOptionChecked.getChecked(), false, 23, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o61.a.FaceCoveringPhotoOptionChecked faceCoveringPhotoOptionChecked = (o61.a.FaceCoveringPhotoOptionChecked) this.f142709f;
            k10.c0 c0Var = (k10.c0) this.f142710g;
            uq.b.e();
            if (this.f142708e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o61.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.o.O(faceCoveringPhotoOptionChecked, (c.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.FaceCoveringPhotoOptionChecked faceCoveringPhotoOptionChecked, k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            o oVar = new o(eVar);
            oVar.f142709f = faceCoveringPhotoOptionChecked;
            oVar.f142710g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$n;", "action", "Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<o61.a.PhotoWithGlassesOptionChecked, k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142713g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Presenting O(o61.a.PhotoWithGlassesOptionChecked photoWithGlassesOptionChecked, o61.c.Presenting presenting) {
            return presenting.a(o61.c.Data.b(presenting.getData(), false, null, false, false, photoWithGlassesOptionChecked.getChecked(), 15, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o61.a.PhotoWithGlassesOptionChecked photoWithGlassesOptionChecked = (o61.a.PhotoWithGlassesOptionChecked) this.f142712f;
            k10.c0 c0Var = (k10.c0) this.f142713g;
            uq.b.e();
            if (this.f142711e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: o61.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.p.O(photoWithGlassesOptionChecked, (c.Presenting) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.PhotoWithGlassesOptionChecked photoWithGlassesOptionChecked, k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            p pVar = new p(eVar);
            pVar.f142712f = photoWithGlassesOptionChecked;
            pVar.f142713g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$o;", "action", "Lk10/c0;", "Lo61/c$c;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<o61.a.o, k10.c0<o61.c.Presenting>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f142714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f142715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f142716g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f142717h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f142718j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f142719k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f142720l;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lzz/h;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends zz.h>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f142722e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f142723f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ bc4.l.Result f142724g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, bc4.l.Result result, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f142723f = uVar;
                this.f142724g = result;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f142722e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                a00.b bVar = this.f142723f.pickedFileToAndroidMapper;
                a00.b.Params params = new a00.b.Params(this.f142724g.getImageFile());
                this.f142722e = 1;
                Object objA = bVar.a(params, this);
                return objA == objE ? objE : objA;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f142723f, this.f142724g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends zz.h>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Presenting O(zz.h.Image image, o61.c.Presenting presenting) {
            return presenting.a(o61.c.Data.b(presenting.getData(), false, image, false, false, false, 28, null));
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:44:0x0120  */
        /* JADX WARN: Code duplicated, block: B:46:0x0124  */
        /* JADX WARN: Code duplicated, block: B:49:0x013a  */
        /* JADX WARN: Code duplicated, block: B:54:0x0169  */
        /* JADX WARN: Code duplicated, block: B:56:0x016d  */
        /* JADX WARN: Code duplicated, block: B:58:0x0194  */
        /* JADX WARN: Code duplicated, block: B:60:0x019a  */
        /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
        
            if (r0 == r8) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0161, code lost:
        
            if (r1.I9(r2, r6, r18) == r8) goto L51;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o61.u.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.o oVar, k10.c0<o61.c.Presenting> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            q qVar = u.this.new q(eVar);
            qVar.f142719k = oVar;
            qVar.f142720l = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo61/a$q;", "<unused var>", "Lo61/c$c;", "Loq/i0;", "<anonymous>", "(Lo61/a$q;Lo61/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<o61.a.q, o61.c.Presenting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f142725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f142726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f142727g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(u uVar, wx.i.Image image) {
            uVar.d9(new o61.a.OnImagePicked(image));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f142727g;
            if (i15 == 0) {
                oq.u.b(obj);
                IdentityPhotoData.PhotoRequirements photoRequirements = new IdentityPhotoData.PhotoRequirements(u.f142628v.b(), u.f142628v.a().a(), u.f142628v.c(), null);
                u uVar = u.this;
                IdentityPhotoData.AbstractC0815a abstractC0815aU9 = uVar.U9(uVar.setupData.getContract().i7());
                final u uVar2 = u.this;
                o61.a.g.IdentityPhoto identityPhoto = new o61.a.g.IdentityPhoto(new IdentityPhotoData(photoRequirements, true, abstractC0815aU9, new er.l() { // from class: o61.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.r.O(uVar2, (wx.i.Image) obj2);
                    }
                }));
                xw.b<o61.a.g> bVarY1 = u.this.Y1();
                this.f142725e = vq.j.a(identityPhoto);
                this.f142726f = 0;
                this.f142727g = 1;
                if (bVarY1.F(identityPhoto, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.q qVar, o61.c.Presenting presenting, tq.e<? super oq.i0> eVar) {
            return u.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo61/a$i;", "<unused var>", "Lo61/c$c;", "Loq/i0;", "<anonymous>", "(Lo61/a$i;Lo61/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<o61.a.i, o61.c.Presenting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142729e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f142729e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean identityPhotoEnabled = u.this.setupData.getIdentityPhotoEnabled();
            if (identityPhotoEnabled) {
                u.this.d9(o61.a.q.f142574a);
            } else {
                if (identityPhotoEnabled) {
                    throw new oq.p();
                }
                u.this.d9(o61.a.o.f142572a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.i iVar, o61.c.Presenting presenting, tq.e<? super oq.i0> eVar) {
            return u.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo61/a$g;", "action", "Lo61/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo61/a$g;Lo61/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<o61.a.g, o61.c.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142732f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o61.a.g gVar = (o61.a.g) this.f142732f;
            Object objE = uq.b.e();
            int i15 = this.f142731e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                this.f142732f = vq.j.a(gVar);
                this.f142731e = 1;
                if (uVar.F(gVar, this) == objE) {
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
        public final Object w(o61.a.g gVar, o61.c.Error error, tq.e<? super oq.i0> eVar) {
            t tVar = u.this.new t(eVar);
            tVar.f142732f = gVar;
            return tVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: o61.u$u, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo61/a$c;", "<unused var>", "Lk10/c0;", "Lo61/c$b;", "state", "Lk10/l;", "Lo61/c;", "<anonymous>", "(Lo61/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C3535u extends vq.k implements er.q<o61.a.c, k10.c0<o61.c.Error>, tq.e<? super k10.l<? extends o61.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142735f;

        C3535u(tq.e<? super C3535u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o61.c.Presenting O(k10.c0 c0Var, o61.c.Error error) {
            return new o61.c.Presenting(((o61.c.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f142735f;
            uq.b.e();
            if (this.f142734e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: o61.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.C3535u.O(c0Var, (c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o61.a.c cVar, k10.c0<o61.c.Error> c0Var, tq.e<? super k10.l<? extends o61.c>> eVar) {
            C3535u c3535u = new C3535u(eVar);
            c3535u.f142735f = c0Var;
            return c3535u.J(oq.i0.f148189a);
        }
    }

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        f142631y = new bc4.l.a.Limited(e1.i(wx.d.j0(companion.v()), wx.d.j0(companion.u()), wx.d.j0(companion.K())));
        f142632z = new IdentityPhotoData.PhotoRequirements.Resolution(768, 1004);
    }

    public u(yy.a aVar, q61.b bVar, a14.w wVar, bc4.l lVar, bc4.d dVar, ac4.a aVar2, i70.e eVar, ib4.c cVar, hb4.d dVar2, a00.b bVar2, q61.f fVar, yw.b bVar3, mx.c cVar2, SetupData setupData) {
        this.mapper = bVar;
        this.openUrlIntentUseCase = wVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.checkPhotoResolutionUseCase = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.globalSnackBarManager = eVar;
        this.genericErrorMapper = cVar;
        this.errorVMSFactory = dVar2;
        this.pickedFileToAndroidMapper = bVar2;
        this.filePickerErrorMapper = fVar;
        this.accessibilityTalkBackManager = bVar3;
        this.labelProvider = cVar2;
        this.setupData = setupData;
        AddPhotoData addPhotoDataU0 = setupData.getContract().U0();
        o61.c.Presenting presenting = new o61.c.Presenting(new o61.c.Data(false, null, false, addPhotoDataU0 != null ? addPhotoDataU0.getIsFaceCoveringPhotoOptionChecked() : false, addPhotoDataU0 != null ? addPhotoDataU0.getIsPhotoWithGlassesOptionChecked() : false, 4, null));
        this.initialState = presenting;
        this.stateMachine = aVar.a(presenting, new er.l() { // from class: o61.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.Q9(this.f142627a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), K9(presenting));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I9(dx.b bVar, final o61.a aVar, tq.e<? super oq.i0> eVar) {
        q61.f.b bVarB = this.filePickerErrorMapper.b(new q61.f.a.FileOrPhotoPicker(bVar, new er.a() { // from class: o61.s
            @Override // er.a
            public final Object a() {
                return u.J9(this.f142625a, aVar);
            }
        }));
        if (bVarB != null) {
            if (bVarB instanceof q61.f.b.Dialog) {
                Object objF = F(new o61.a.g.ShowNavigationDialog(((q61.f.b.Dialog) bVarB).getDialogData()), eVar);
                if (objF == uq.b.e()) {
                    return objF;
                }
            } else {
                if (!(bVarB instanceof q61.f.b.FullPage)) {
                    throw new oq.p();
                }
                d9(new o61.a.Error(bVar, aVar));
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(u uVar, o61.a aVar) {
        uVar.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o61.d.a K9(o61.c cVar) {
        q61.b bVar = this.mapper;
        float f15 = f142630x;
        Set<wx.d> setA = f142631y.a();
        IdentityPhotoData.PhotoRequirements.Resolution resolution = f142632z;
        return bVar.b(new q61.b.Params(cVar, f15, setA, resolution.getLongSide(), resolution.getShortSide(), new er.l() { // from class: o61.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f142618a, (String) obj);
            }
        }, b9(o61.a.h.f142562a), new er.l() { // from class: o61.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.M9(this.f142619a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: o61.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.N9(this.f142620a, ((Boolean) obj).booleanValue());
            }
        }, b9(o61.a.d.f142550a), new er.p() { // from class: o61.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return u.O9(this.f142621a, (Label) obj, (FileContent) obj2);
            }
        }, b9(o61.a.l.f142569a), b9(o61.a.i.f142563a), b9(o61.a.C3529a.f142547a), b9(o61.a.b.f142548a), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(u uVar, String str) {
        uVar.d9(new o61.a.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(u uVar, boolean z15) {
        uVar.d9(new o61.a.FaceCoveringPhotoOptionChecked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(u uVar, boolean z15) {
        uVar.d9(new o61.a.PhotoWithGlassesOptionChecked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(u uVar, Label label, FileContent fileContent) {
        uVar.d9(new o61.a.OnImageClick(label, fileContent));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(o61.c.class), new er.l() { // from class: o61.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.R9(this.f142622a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o61.c.Presenting.class), new er.l() { // from class: o61.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.S9(this.f142623a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o61.c.Error.class), new er.l() { // from class: o61.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.T9(this.f142624a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        zVar.x(q0.c(o61.a.p.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(u uVar, k10.z zVar) {
        k kVar = uVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o61.a.g.class), oVar, kVar);
        zVar.A(uVar.new l(null));
        zVar.x(q0.c(o61.a.OpenUrl.class), oVar, uVar.new m(null));
        zVar.v(q0.c(o61.a.h.class), oVar, uVar.new n(null));
        zVar.v(q0.c(o61.a.FaceCoveringPhotoOptionChecked.class), oVar, new o(null));
        zVar.v(q0.c(o61.a.PhotoWithGlassesOptionChecked.class), oVar, new p(null));
        zVar.v(q0.c(o61.a.o.class), oVar, uVar.new q(null));
        zVar.x(q0.c(o61.a.q.class), oVar, uVar.new r(null));
        zVar.x(q0.c(o61.a.i.class), oVar, uVar.new s(null));
        zVar.v(q0.c(o61.a.OnImagePicked.class), oVar, uVar.new d(null));
        zVar.v(q0.c(o61.a.d.class), oVar, new e(null));
        zVar.x(q0.c(o61.a.OnImageClick.class), oVar, uVar.new f(null));
        zVar.v(q0.c(o61.a.l.class), oVar, new g(null));
        zVar.x(q0.c(o61.a.C3529a.class), oVar, uVar.new h(null));
        zVar.v(q0.c(o61.a.Error.class), oVar, uVar.new i(null));
        zVar.x(q0.c(o61.a.b.class), oVar, uVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(u uVar, k10.z zVar) {
        t tVar = uVar.new t(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o61.a.g.class), oVar, tVar);
        zVar.v(q0.c(o61.a.c.class), oVar, new C3535u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityPhotoData.AbstractC0815a U9(Integer age) {
        lr.i iVarW = lr.m.w(0, 5);
        if (age == null || !iVarW.q(age.intValue())) {
            return (age == null || !new lr.i(5, 10).q(age.intValue())) ? IdentityPhotoData.AbstractC0815a.C0816a.f38347a : IdentityPhotoData.AbstractC0815a.d.f38356a;
        }
        return IdentityPhotoData.AbstractC0815a.b.f38350a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(o61.a.g gVar, tq.e<? super oq.i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<o61.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<o61.c, o61.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<o61.d.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
