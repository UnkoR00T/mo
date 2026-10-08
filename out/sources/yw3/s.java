package yw3;

import androidx.p016lifecycle.u0;
import fr.q0;
import fx.Rectangle;
import jw3.MaskDefinition;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0099\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0001\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020400H\u0096\u0001¢\u0006\u0004\b5\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR \u0010j\u001a\b\u0012\u0004\u0012\u00020e0d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR&\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030k8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010u¨\u0006v"}, d2 = {"Lyw3/s;", "Ll00/g;", "Lyw3/e;", "Lyw3/c;", "Lyw3/f;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lzw3/a;", "mapper", "Lmx/c;", "labelProvider", "Lac4/a;", "callActionWithLoaderUseCase", "Liw3/f;", "isFaceValidWithPartOfTheRulesUC", "Lsz/d;", "connector", "Loz/q;", "ownerViewLifecycleManager", "Lh14/b;", "isCameraPermissionGrantedUseCase", "Lac4/r;", "Lvx/a;", "scanCameraUseCase", "Lhw3/b;", "capturePhotoUC", "La14/x;", "requestCameraPermissionUseCase", "Lib4/c;", "errorMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lfw3/c;", "scaleFaceDetectorResultToContainerUC", "Lfw3/a;", "calculateTargetPhotoDimensionsUC", "Lyw/b;", "accessibilityTalkBackManager", "Lyw3/d;", "data", "<init>", "(Lyy/a;Lzw3/a;Lmx/c;Lac4/a;Liw3/f;Lsz/d;Loz/q;Lh14/b;Lac4/r;Lhw3/b;La14/x;Lib4/c;La14/m;Lfw3/c;Lfw3/a;Lyw/b;Lyw3/d;)V", "state", "Lyw3/f$a;", "D9", "(Lyw3/e;)Lyw3/f$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lzw3/a;", "c", "Lmx/c;", "d", "Lac4/a;", "e", "Liw3/f;", "f", "Lsz/d;", "g", "Loz/q;", "h", "Lh14/b;", "j", "Lac4/r;", "k", "Lhw3/b;", "l", "La14/x;", "m", "Lib4/c;", "n", "La14/m;", "p", "Lfw3/c;", "q", "Lfw3/a;", "r", "Lyw/b;", "s", "Lyw3/d;", "Lyw3/b;", "t", "Lyw3/b;", "faceValidationVMS", "Lyw3/e$c;", "v", "Lyw3/e$c;", "initialState", "Loz/j;", "w", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lyw3/c$b;", "x", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "y", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<yw3.e, yw3.c> implements yw3.f, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zw3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iw3.f isFaceValidWithPartOfTheRulesUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final sz.d connector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h14.b isCameraPermissionGrantedUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.r<vx.a> scanCameraUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hw3.b capturePhotoUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.x requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final fw3.c scaleFaceDetectorResultToContainerUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final fw3.a calculateTargetPhotoDimensionsUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final SetupData data;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final yw3.b faceValidationVMS = new yw3.b(false, 1, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final yw3.e.Measuring initialState;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yw3.c.b> navAction;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yw3.e, yw3.c> stateMachine;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p0<yw3.f.Data> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230089e;

        /* JADX INFO: renamed from: yw3.s$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C6179a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f230091e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f230092f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ s f230093g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6179a(s sVar, tq.e<? super C6179a> eVar) {
                super(2, eVar);
                this.f230093g = sVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f230092f;
                uq.b.e();
                if (this.f230091e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                if (aVar == nx.a.RESUMED) {
                    this.f230093g.d9(yw3.c.d.f230015a);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C6179a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C6179a c6179a = new C6179a(this.f230093g, eVar);
                c6179a.f230092f = obj;
                return c6179a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230089e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarS = mu.i.S(s.this.x8(), new C6179a(s.this, null));
                this.f230089e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return s.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<yw3.f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f230094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f230095b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f230096a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f230097b;

            /* JADX INFO: renamed from: yw3.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6180a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f230098d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f230099e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f230100f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f230102h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f230103j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f230104k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f230105l;

                public C6180a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f230098d = obj;
                    this.f230099e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f230096a = hVar;
                this.f230097b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6180a c6180a;
                if (eVar instanceof C6180a) {
                    c6180a = (C6180a) eVar;
                    int i15 = c6180a.f230099e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6180a.f230099e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6180a = new C6180a(eVar);
                    }
                } else {
                    c6180a = new C6180a(eVar);
                }
                Object obj2 = c6180a.f230098d;
                Object objE = uq.b.e();
                int i16 = c6180a.f230099e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f230096a;
                    yw3.f.Data dataD9 = this.f230097b.D9((yw3.e) obj);
                    c6180a.f230100f = vq.j.a(obj);
                    c6180a.f230102h = vq.j.a(c6180a);
                    c6180a.f230103j = vq.j.a(obj);
                    c6180a.f230104k = vq.j.a(hVar);
                    c6180a.f230105l = 0;
                    c6180a.f230099e = 1;
                    if (hVar.F(dataD9, c6180a) == objE) {
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

        public b(mu.g gVar, s sVar) {
            this.f230094a = gVar;
            this.f230095b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yw3.f.Data> hVar, tq.e eVar) {
            Object objA = this.f230094a.a(new a(hVar, this.f230095b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyw3/c$a;", "<unused var>", "Lyw3/e;", "Loq/i0;", "<anonymous>", "(Lyw3/c$a;Lyw3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<yw3.c.a, yw3.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230106e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f230106e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yw3.c.a aVar, yw3.e eVar, tq.e<? super i0> eVar2) {
            return s.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyw3/e$c;", "state", "Lk10/l;", "Lyw3/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<yw3.e.Measuring>, tq.e<? super k10.l<? extends yw3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230109f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yw3.e.Measuring O(u04.c cVar, yw3.e.Measuring measuring) {
            return yw3.e.Measuring.e(measuring, fr.t.c(cVar, u04.c.a.f194071a), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f230109f;
            Object objE = uq.b.e();
            int i15 = this.f230108e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.x xVar = s.this.requestCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f230109f = c0Var;
                this.f230108e = 1;
                obj = xVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final u04.c cVar = (u04.c) obj;
            return c0Var.b(new er.l() { // from class: yw3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(cVar, (e.Measuring) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yw3.e.Measuring> c0Var, tq.e<? super k10.l<? extends yw3.e>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f230109f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyw3/c$d;", "<unused var>", "Lk10/c0;", "Lyw3/e$c;", "state", "Lk10/l;", "Lyw3/e;", "<anonymous>", "(Lyw3/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yw3.c.d, k10.c0<yw3.e.Measuring>, tq.e<? super k10.l<? extends yw3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230112f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yw3.e.Measuring O(boolean z15, yw3.e.Measuring measuring) {
            return yw3.e.Measuring.e(measuring, z15, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f230112f;
            Object objE = uq.b.e();
            int i15 = this.f230111e;
            if (i15 == 0) {
                oq.u.b(obj);
                h14.b bVar = s.this.isCameraPermissionGrantedUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f230112f = c0Var;
                this.f230111e = 1;
                obj = bVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            return c0Var.b(new er.l() { // from class: yw3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O(zBooleanValue, (e.Measuring) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yw3.c.d dVar, k10.c0<yw3.e.Measuring> c0Var, tq.e<? super k10.l<? extends yw3.e>> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f230112f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyw3/c$f;", "action", "Lk10/c0;", "Lyw3/e$c;", "state", "Lk10/l;", "Lyw3/e;", "<anonymous>", "(Lyw3/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yw3.c.OnContainerChanged, k10.c0<yw3.e.Measuring>, tq.e<? super k10.l<? extends yw3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230116g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yw3.e.Camera O(yw3.c.OnContainerChanged onContainerChanged, k10.c0 c0Var, s sVar, yw3.e.Measuring measuring) {
            return new yw3.e.Camera(false, new MaskDefinition(onContainerChanged.getContainer(), ((yw3.e.Measuring) c0Var.a()).getMaskType()), sVar.data.getIsUnderGuardianship() ? sx.d.BACK : sx.d.FRONT, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yw3.c.OnContainerChanged onContainerChanged = (yw3.c.OnContainerChanged) this.f230115f;
            final k10.c0 c0Var = (k10.c0) this.f230116g;
            uq.b.e();
            if (this.f230114e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final s sVar = s.this;
            return c0Var.d(new er.l() { // from class: yw3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.f.O(onContainerChanged, c0Var, sVar, (e.Measuring) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yw3.c.OnContainerChanged onContainerChanged, k10.c0<yw3.e.Measuring> c0Var, tq.e<? super k10.l<? extends yw3.e>> eVar) {
            f fVar = s.this.new f(eVar);
            fVar.f230115f = onContainerChanged;
            fVar.f230116g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyw3/c$j;", "action", "Lyw3/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lyw3/c$j;Lyw3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yw3.c.ValidatePhoto, yw3.e.Camera, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230120g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f230121h;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yw3.c.ValidatePhoto validatePhoto = (yw3.c.ValidatePhoto) this.f230120g;
            yw3.e.Camera camera = (yw3.e.Camera) this.f230121h;
            Object objE = uq.b.e();
            int i15 = this.f230119f;
            if (i15 == 0) {
                oq.u.b(obj);
                vx.a aVarB = s.this.scaleFaceDetectorResultToContainerUC.b(new fw3.c.Params(validatePhoto.getResult(), camera.getMaskDefinition().getContainer(), camera.getLensSide() == sx.d.FRONT, camera.getScaleType() == jw3.c.FILL));
                iw3.f fVar = s.this.isFaceValidWithPartOfTheRulesUC;
                iw3.f.Params params = new iw3.f.Params(aVarB, camera.getMaskDefinition());
                this.f230120g = vq.j.a(validatePhoto);
                this.f230121h = vq.j.a(camera);
                this.f230118e = vq.j.a(aVarB);
                this.f230119f = 1;
                obj = fVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            s.this.faceValidationVMS.b(((Boolean) obj).booleanValue());
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yw3.c.ValidatePhoto validatePhoto, yw3.e.Camera camera, tq.e<? super i0> eVar) {
            g gVar = s.this.new g(eVar);
            gVar.f230120g = validatePhoto;
            gVar.f230121h = camera;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyw3/c$h;", "<unused var>", "Lyw3/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lyw3/c$h;Lyw3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<yw3.c.h, yw3.e.Camera, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f230124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230125g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f230127e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f230128f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ s f230129g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ fw3.a.Result f230130h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ yw3.e.Camera f230131j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, fw3.a.Result result, yw3.e.Camera camera, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f230129g = sVar;
                this.f230130h = result;
                this.f230131j = camera;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
            
                if (r1.F(r3, r10) == r0) goto L24;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    r10 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r10.f230128f
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r0 = r10.f230127e
                    hw3.b$b r0 = (hw3.b.InterfaceC2032b) r0
                    oq.u.b(r11)
                    goto Lbe
                L17:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1f:
                    oq.u.b(r11)
                    goto L55
                L23:
                    oq.u.b(r11)
                    yw3.s r11 = r10.f230129g
                    hw3.b r11 = yw3.s.r9(r11)
                    hw3.b$a r1 = new hw3.b$a
                    yw3.s r4 = r10.f230129g
                    yw3.d r4 = yw3.s.s9(r4)
                    cw3.a$b r4 = r4.getRequirements()
                    float r4 = r4.getMaxSize()
                    fw3.a$c r5 = r10.f230130h
                    int r5 = r5.getWidth()
                    fw3.a$c r6 = r10.f230130h
                    int r6 = r6.getHeight()
                    r7 = 0
                    r1.<init>(r4, r5, r6, r7)
                    r10.f230128f = r3
                    java.lang.Object r11 = r11.d(r1, r10)
                    if (r11 != r0) goto L55
                    goto Lb0
                L55:
                    hw3.b$b r11 = (hw3.b.InterfaceC2032b) r11
                    hw3.b$b$a r1 = hw3.b.InterfaceC2032b.a.f86799a
                    boolean r1 = fr.t.c(r11, r1)
                    if (r1 != 0) goto Lbe
                    boolean r1 = r11 instanceof hw3.b.InterfaceC2032b.Error
                    if (r1 != 0) goto Lb7
                    hw3.b$b$c r1 = hw3.b.InterfaceC2032b.c.f86801a
                    boolean r1 = fr.t.c(r11, r1)
                    if (r1 == 0) goto L6c
                    goto Lb7
                L6c:
                    boolean r1 = r11 instanceof hw3.b.InterfaceC2032b.Success
                    if (r1 == 0) goto Lb1
                    yw3.s r1 = r10.f230129g
                    xw.b r1 = r1.Y1()
                    yw3.c$b$d r3 = new yw3.c$b$d
                    ax3.d r4 = new ax3.d
                    r5 = r11
                    hw3.b$b$d r5 = (hw3.b.InterfaceC2032b.Success) r5
                    wx.i$a r5 = r5.getImage()
                    yw3.s r6 = r10.f230129g
                    yw3.d r6 = yw3.s.s9(r6)
                    cw3.a$b r6 = r6.getRequirements()
                    yw3.e$a r7 = r10.f230131j
                    cw3.a$a r7 = r7.getMaskType()
                    yw3.s r8 = r10.f230129g
                    yw3.d r8 = yw3.s.s9(r8)
                    boolean r8 = r8.getIsUnderGuardianship()
                    r9 = 0
                    r4.<init>(r5, r6, r7, r8, r9)
                    r3.<init>(r4)
                    java.lang.Object r11 = vq.j.a(r11)
                    r10.f230127e = r11
                    r10.f230128f = r2
                    java.lang.Object r11 = r1.F(r3, r10)
                    if (r11 != r0) goto Lbe
                Lb0:
                    return r0
                Lb1:
                    oq.p r11 = new oq.p
                    r11.<init>()
                    throw r11
                Lb7:
                    yw3.s r11 = r10.f230129g
                    yw3.c$g r0 = yw3.c.g.f230019a
                    yw3.s.n9(r11, r0)
                Lbe:
                    oq.i0 r11 = oq.i0.f148189a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: yw3.s.h.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f230129g, this.f230130h, this.f230131j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yw3.e.Camera camera = (yw3.e.Camera) this.f230125g;
            Object objE = uq.b.e();
            int i15 = this.f230124f;
            if (i15 == 0) {
                oq.u.b(obj);
                fw3.a.Result resultB = s.this.calculateTargetPhotoDimensionsUC.b(new fw3.a.Params(s.this.data.getRequirements().getMinResolution()));
                ac4.a aVar = s.this.callActionWithLoaderUseCase;
                a aVar2 = new a(s.this, resultB, camera, null);
                this.f230125g = vq.j.a(camera);
                this.f230123e = vq.j.a(resultB);
                this.f230124f = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(yw3.c.h hVar, yw3.e.Camera camera, tq.e<? super i0> eVar) {
            h hVar2 = s.this.new h(eVar);
            hVar2.f230125g = camera;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyw3/c$g;", "<unused var>", "Lyw3/e$a;", "Loq/i0;", "<anonymous>", "(Lyw3/c$g;Lyw3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yw3.c.g, yw3.e.Camera, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230132e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(ib4.c.b bVar) {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230132e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yw3.c.b> bVarY1 = s.this.Y1();
                yw3.c.b.Error error = new yw3.c.b.Error(s.this.errorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: yw3.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.i.O((ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f230132e = 1;
                if (bVarY1.F(error, this) == objE) {
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
        public final Object w(yw3.c.g gVar, yw3.e.Camera camera, tq.e<? super i0> eVar) {
            return s.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyw3/c$f;", "action", "Lk10/c0;", "Lyw3/e$a;", "state", "Lk10/l;", "Lyw3/e;", "<anonymous>", "(Lyw3/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<yw3.c.OnContainerChanged, k10.c0<yw3.e.Camera>, tq.e<? super k10.l<? extends yw3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230136g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yw3.e.Camera O(yw3.c.OnContainerChanged onContainerChanged, yw3.e.Camera camera) {
            return yw3.e.Camera.e(camera, false, new MaskDefinition(onContainerChanged.getContainer(), camera.getMaskType()), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final yw3.c.OnContainerChanged onContainerChanged = (yw3.c.OnContainerChanged) this.f230135f;
            k10.c0 c0Var = (k10.c0) this.f230136g;
            uq.b.e();
            if (this.f230134e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return fr.t.c(onContainerChanged.getContainer(), ((yw3.e.Camera) c0Var.a()).getMaskDefinition().getContainer()) ? c0Var.c() : c0Var.b(new er.l() { // from class: yw3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.j.O(onContainerChanged, (e.Camera) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yw3.c.OnContainerChanged onContainerChanged, k10.c0<yw3.e.Camera> c0Var, tq.e<? super k10.l<? extends yw3.e>> eVar) {
            j jVar = new j(eVar);
            jVar.f230135f = onContainerChanged;
            jVar.f230136g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyw3/c$i;", "<unused var>", "Lk10/c0;", "Lyw3/e$a;", "state", "Lk10/l;", "Lyw3/e;", "<anonymous>", "(Lyw3/c$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<yw3.c.i, k10.c0<yw3.e.Camera>, tq.e<? super k10.l<? extends yw3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230138f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f230139a;

            static {
                int[] iArr = new int[sx.d.values().length];
                try {
                    iArr[sx.d.FRONT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sx.d.BACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f230139a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yw3.e.Camera O(k10.c0 c0Var, yw3.e.Camera camera) {
            sx.d dVar;
            int i15 = a.f230139a[((yw3.e.Camera) c0Var.a()).getLensSide().ordinal()];
            if (i15 == 1) {
                dVar = sx.d.BACK;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                dVar = sx.d.FRONT;
            }
            return yw3.e.Camera.e(camera, false, null, dVar, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f230138f;
            uq.b.e();
            if (this.f230137e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yw3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.k.O(c0Var, (e.Camera) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yw3.c.i iVar, k10.c0<yw3.e.Camera> c0Var, tq.e<? super k10.l<? extends yw3.e>> eVar) {
            k kVar = new k(eVar);
            kVar.f230138f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyw3/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lyw3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<yw3.e.Camera, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230141f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f230143a;

            a(s sVar) {
                this.f230143a = sVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(dx.i<? extends dx.b, ? extends vx.a> iVar, tq.e<? super i0> eVar) {
                s sVar = this.f230143a;
                if (iVar instanceof dx.i.Right) {
                    sVar.d9(new yw3.c.ValidatePhoto((vx.a) ((dx.i.Right) iVar).b()));
                }
                return i0.f148189a;
            }
        }

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yw3.e.Camera camera = (yw3.e.Camera) this.f230141f;
            Object objE = uq.b.e();
            int i15 = this.f230140e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVar = (mu.g) s.this.scanCameraUseCase.a(new sx.b.Analyzer(camera.getLensSide(), camera.getZoom(), sx.e.b.f185177a));
                a aVar = new a(s.this);
                this.f230141f = vq.j.a(camera);
                this.f230140e = 1;
                if (gVar.a(aVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(yw3.e.Camera camera, tq.e<? super i0> eVar) {
            return ((l) v(camera, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            l lVar = s.this.new l(eVar);
            lVar.f230141f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isFaceValid", "Lyw3/e$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(ZLyw3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<Boolean, yw3.e.Camera, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f230145f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15;
            boolean z15 = this.f230145f;
            uq.b.e();
            if (this.f230144e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            yw.b bVar = s.this.accessibilityTalkBackManager;
            mx.c cVar = s.this.labelProvider;
            if (z15) {
                i15 = bw3.a.f21894s;
            } else {
                if (z15) {
                    throw new oq.p();
                }
                i15 = bw3.a.f21892r;
            }
            bVar.a(cVar.c(i15).getText());
            return i0.f148189a;
        }

        public final Object M(boolean z15, yw3.e.Camera camera, tq.e<? super i0> eVar) {
            m mVar = s.this.new m(eVar);
            mVar.f230145f = z15;
            return mVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, yw3.e.Camera camera, tq.e<? super i0> eVar) {
            return M(bool.booleanValue(), camera, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyw3/e$a;", "state", "Lk10/l;", "Lyw3/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<k10.c0<yw3.e.Camera>, tq.e<? super k10.l<? extends yw3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230148f;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yw3.e.Camera O(u04.c cVar, yw3.e.Camera camera) {
            return yw3.e.Camera.e(camera, fr.t.c(cVar, u04.c.a.f194071a), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f230148f;
            Object objE = uq.b.e();
            int i15 = this.f230147e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.x xVar = s.this.requestCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f230148f = c0Var;
                this.f230147e = 1;
                obj = xVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final u04.c cVar = (u04.c) obj;
            return c0Var.b(new er.l() { // from class: yw3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.n.O(cVar, (e.Camera) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yw3.e.Camera> c0Var, tq.e<? super k10.l<? extends yw3.e>> eVar) {
            return ((n) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            n nVar = s.this.new n(eVar);
            nVar.f230148f = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyw3/c$d;", "<unused var>", "Lk10/c0;", "Lyw3/e$a;", "state", "Lk10/l;", "Lyw3/e;", "<anonymous>", "(Lyw3/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<yw3.c.d, k10.c0<yw3.e.Camera>, tq.e<? super k10.l<? extends yw3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230151f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yw3.e.Camera O(boolean z15, yw3.e.Camera camera) {
            return yw3.e.Camera.e(camera, z15, null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f230151f;
            Object objE = uq.b.e();
            int i15 = this.f230150e;
            if (i15 == 0) {
                oq.u.b(obj);
                h14.b bVar = s.this.isCameraPermissionGrantedUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f230151f = c0Var;
                this.f230150e = 1;
                obj = bVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            return c0Var.b(new er.l() { // from class: yw3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.o.O(zBooleanValue, (e.Camera) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yw3.c.d dVar, k10.c0<yw3.e.Camera> c0Var, tq.e<? super k10.l<? extends yw3.e>> eVar) {
            o oVar = s.this.new o(eVar);
            oVar.f230151f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyw3/c$e;", "<unused var>", "Lyw3/e$a;", "Loq/i0;", "<anonymous>", "(Lyw3/c$e;Lyw3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<yw3.c.e, yw3.e.Camera, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230153e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230153e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yw3.c.b> bVarY1 = s.this.Y1();
                yw3.c.b.C6175b c6175b = yw3.c.b.C6175b.f230011a;
                this.f230153e = 1;
                if (bVarY1.F(c6175b, this) == objE) {
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
        public final Object w(yw3.c.e eVar, yw3.e.Camera camera, tq.e<? super i0> eVar2) {
            return s.this.new p(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyw3/c$c;", "<unused var>", "Lyw3/e$a;", "Loq/i0;", "<anonymous>", "(Lyw3/c$c;Lyw3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<yw3.c.C6177c, yw3.e.Camera, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230155e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230155e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yw3.c.b> bVarY1 = s.this.Y1();
                yw3.c.b.a aVar = yw3.c.b.a.f230010a;
                this.f230155e = 1;
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
        public final Object w(yw3.c.C6177c c6177c, yw3.e.Camera camera, tq.e<? super i0> eVar) {
            return s.this.new q(eVar).J(i0.f148189a);
        }
    }

    public s(yy.a aVar, zw3.a aVar2, mx.c cVar, ac4.a aVar3, iw3.f fVar, sz.d dVar, oz.q qVar, h14.b bVar, ac4.r<vx.a> rVar, hw3.b bVar2, a14.x xVar, ib4.c cVar2, a14.m mVar, fw3.c cVar3, fw3.a aVar4, yw.b bVar3, SetupData setupData) {
        this.mapper = aVar2;
        this.labelProvider = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.isFaceValidWithPartOfTheRulesUC = fVar;
        this.connector = dVar;
        this.ownerViewLifecycleManager = qVar;
        this.isCameraPermissionGrantedUseCase = bVar;
        this.scanCameraUseCase = rVar;
        this.capturePhotoUC = bVar2;
        this.requestCameraPermissionUseCase = xVar;
        this.errorMapper = cVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.scaleFaceDetectorResultToContainerUC = cVar3;
        this.calculateTargetPhotoDimensionsUC = aVar4;
        this.accessibilityTalkBackManager = bVar3;
        this.data = setupData;
        yw3.e.Measuring measuring = new yw3.e.Measuring(false, setupData.getMaskType(), 1, null);
        this.initialState = measuring;
        this.lifecycleConnector = qVar;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(measuring, new er.l() { // from class: yw3.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.G9(this.f230066a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), D9(measuring));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yw3.f.Data D9(yw3.e state) {
        zw3.a aVar = this.mapper;
        er.a<i0> aVarB9 = b9(yw3.c.e.f230016a);
        er.a<i0> aVarB10 = b9(yw3.c.h.f230020a);
        sz.d dVar = this.connector;
        yw3.b bVar = this.faceValidationVMS;
        er.a<i0> aVarB11 = b9(yw3.c.a.f230009a);
        er.a<i0> aVarB12 = b9(yw3.c.i.f230021a);
        return aVar.b(new zw3.a.Params(state, new er.l() { // from class: yw3.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.E9(this.f230061a, (Rectangle) obj);
            }
        }, aVarB10, aVarB9, aVarB11, b9(yw3.c.C6177c.f230014a), dVar, bVar, aVarB12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(s sVar, Rectangle rectangle) {
        sVar.d9(new yw3.c.OnContainerChanged(rectangle));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(yw3.e.class), new er.l() { // from class: yw3.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.H9(this.f230062a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(yw3.e.Measuring.class), new er.l() { // from class: yw3.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.I9(this.f230063a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(yw3.e.Camera.class), new er.l() { // from class: yw3.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.J9(this.f230064a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(s sVar, k10.z zVar) {
        c cVar = sVar.new c(null);
        zVar.x(q0.c(yw3.c.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(s sVar, k10.z zVar) {
        zVar.A(sVar.new d(null));
        e eVar = sVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yw3.c.d.class), oVar, eVar);
        zVar.v(q0.c(yw3.c.OnContainerChanged.class), oVar, sVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(final s sVar, k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(yw3.c.OnContainerChanged.class), oVar, jVar);
        zVar.v(q0.c(yw3.c.i.class), oVar, new k(null));
        zVar.N(new er.l() { // from class: yw3.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.K9((e.Camera) obj);
            }
        }, new er.l() { // from class: yw3.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.L9(this.f230065a, (k10.x) obj);
            }
        });
        k10.k.s(zVar, sVar.faceValidationVMS.a(), null, sVar.new m(null), 2, null);
        zVar.A(sVar.new n(null));
        zVar.v(q0.c(yw3.c.d.class), oVar, sVar.new o(null));
        zVar.x(q0.c(yw3.c.e.class), oVar, sVar.new p(null));
        zVar.x(q0.c(yw3.c.C6177c.class), oVar, sVar.new q(null));
        zVar.x(q0.c(yw3.c.ValidatePhoto.class), oVar, sVar.new g(null));
        zVar.x(q0.c(yw3.c.h.class), oVar, sVar.new h(null));
        zVar.x(q0.c(yw3.c.g.class), oVar, sVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K9(yw3.e.Camera camera) {
        return camera.getLensSide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(s sVar, k10.x xVar) {
        xVar.C(sVar.new l(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<yw3.c.b> Y1() {
        return this.navAction;
    }

    @Override // yw3.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<yw3.e, yw3.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yw3.f.Data> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
