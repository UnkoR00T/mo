package r22;

import cb4.DialogData;
import d12.OAuthWebViewData;
import eo0.EpuapApplicationType;
import eo0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o02.Epuap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import pq.v0;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B³\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u001b\u00105\u001a\u000204*\u0002022\u0006\u00103\u001a\u00020\u0003H\u0002¢\u0006\u0004\b5\u00106J\u001e\u00109\u001a\u0004\u0018\u000104*\u0002022\u0006\u00108\u001a\u000207H\u0082@¢\u0006\u0004\b9\u0010:J\u0013\u0010<\u001a\u00020;*\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u000204*\u00020;H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\u0002H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR \u0010u\u001a\b\u0012\u0004\u0012\u00020p0o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR&\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030v8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR!\u0010@\u001a\b\u0012\u0004\u0012\u00020A0|8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0081\u0001"}, d2 = {"Lr22/c0;", "Ll00/g;", "Lr22/c;", "Lr22/a;", "Lr22/d;", "", "Lyy/a;", "stateMachineFactory", "Ls22/g;", "mapper", "Lc12/g;", "dialogMapper", "Ls22/b;", "applicationTypesMapper", "Lt02/h;", "formValidationUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lb12/c;", "electronicDeliveryErrorMapper", "Lp02/g;", "fetchApplicationTypeLabelsUC", "Lr02/e;", "pickPhotoFromGalleryUC", "Lr02/f;", "takePhotoWithSizeValidationUC", "Lr02/c;", "generateNewCameraPhotoNameUC", "Ls22/k;", "filePickerErrorMapper", "Lr02/d;", "pickFileUseCase", "Lr02/a;", "checkFileNameUseCase", "Lp02/o0;", "sendEpuapAttachmentUC", "Lp02/k0;", "removeEpuapAttachmentUC", "Lx02/d;", "getMessageServiceTypeUC", "Ls22/c;", "epuapMessageFormInitialStateMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lm22/h;", "contract", "<init>", "(Lyy/a;Ls22/g;Lc12/g;Ls22/b;Lt02/h;Lac4/a;Lb12/c;Lp02/g;Lr02/e;Lr02/f;Lr02/c;Ls22/k;Lr02/d;Lr02/a;Lp02/o0;Lp02/k0;Lx02/d;Ls22/c;La14/m;Lyw/b;Lm22/h;)V", "Ldx/b;", "retryAction", "Loq/i0;", "R9", "(Ldx/b;Lr22/a;)V", "Lr22/a$n;", "fromAction", "U9", "(Ldx/b;Lr22/a$n;Ltq/e;)Ljava/lang/Object;", "Lo02/d;", "Q9", "(Lr22/c;)Lo02/d;", "ea", "(Lo02/d;)V", "state", "Lr22/d$a;", "X9", "(Lr22/c;)Lr22/d$a;", "b", "Ls22/g;", "c", "Lc12/g;", "d", "Ls22/b;", "e", "Lt02/h;", "f", "Lac4/a;", "g", "Lb12/c;", "h", "Lp02/g;", "j", "Lr02/e;", "k", "Lr02/f;", "l", "Lr02/c;", "m", "Ls22/k;", "n", "Lr02/d;", "p", "Lr02/a;", "q", "Lp02/o0;", "r", "Lp02/k0;", "s", "Lx02/d;", "t", "Ls22/c;", "v", "La14/m;", "w", "Lyw/b;", "x", "Lm22/h;", "y", "Lr22/c;", "initialState", "Lxw/b;", "Lr22/a$j;", "z", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "A", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "B", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<State, r22.a> implements r22.d, zx.d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final k10.t<State, r22.a> stateMachine;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final mu.p0<r22.d.Data> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s22.g mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c12.g dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s22.b applicationTypesMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t02.h formValidationUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b12.c electronicDeliveryErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p02.g fetchApplicationTypeLabelsUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final r02.e pickPhotoFromGalleryUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final r02.f takePhotoWithSizeValidationUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final r02.c generateNewCameraPhotoNameUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final s22.k filePickerErrorMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final r02.d pickFileUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final r02.a checkFileNameUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p02.o0 sendEpuapAttachmentUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p02.k0 removeEpuapAttachmentUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final x02.d getMessageServiceTypeUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final s22.c epuapMessageFormInitialStateMapper;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final m22.h contract;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r22.a.j> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<r22.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f171013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f171014b;

        /* JADX INFO: renamed from: r22.c0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4337a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f171015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f171016b;

            /* JADX INFO: renamed from: r22.c0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4338a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f171017d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f171018e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f171019f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f171021h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f171022j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f171023k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f171024l;

                public C4338a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f171017d = obj;
                    this.f171018e |= PKIFailureInfo.systemUnavail;
                    return C4337a.this.F(null, this);
                }
            }

            public C4337a(mu.h hVar, c0 c0Var) {
                this.f171015a = hVar;
                this.f171016b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4338a c4338a;
                if (eVar instanceof C4338a) {
                    c4338a = (C4338a) eVar;
                    int i15 = c4338a.f171018e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4338a.f171018e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4338a = new C4338a(eVar);
                    }
                } else {
                    c4338a = new C4338a(eVar);
                }
                Object obj2 = c4338a.f171017d;
                Object objE = uq.b.e();
                int i16 = c4338a.f171018e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f171015a;
                    r22.d.Data dataX9 = this.f171016b.X9((State) obj);
                    c4338a.f171019f = vq.j.a(obj);
                    c4338a.f171021h = vq.j.a(c4338a);
                    c4338a.f171022j = vq.j.a(obj);
                    c4338a.f171023k = vq.j.a(hVar);
                    c4338a.f171024l = 0;
                    c4338a.f171018e = 1;
                    if (hVar.F(dataX9, c4338a) == objE) {
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
            this.f171013a = gVar;
            this.f171014b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super r22.d.Data> hVar, tq.e eVar) {
            Object objA = this.f171013a.a(new C4337a(hVar, this.f171014b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$d;", "action", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<r22.a.ContentChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171027g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r22.a.ContentChanged contentChanged, c0 c0Var, State state) {
            State.Field<String> fieldE = state.e();
            String value = contentChanged.getValue();
            for (t02.h.Results.a aVar : c0Var.formValidationUseCase.b(new t02.h.Params(e1.d(new t02.h.Params.InterfaceC4834a.b(contentChanged.getValue())))).a()) {
                if (aVar instanceof t02.h.Results.a.c) {
                    return State.b(state, null, null, null, null, null, fieldE.a(value, aVar.getValue()), null, null, 223, null);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r22.a.ContentChanged contentChanged = (r22.a.ContentChanged) this.f171026f;
            k10.c0 c0Var = (k10.c0) this.f171027g;
            uq.b.e();
            if (this.f171025e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final c0 c0Var2 = c0.this;
            return c0Var.b(new er.l() { // from class: r22.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.b.O(contentChanged, c0Var2, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.ContentChanged contentChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = c0.this.new b(eVar);
            bVar.f171026f = contentChanged;
            bVar.f171027g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$b;", "action", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<r22.a.ApplicationTypeChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171031g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r22.a.ApplicationTypeChanged applicationTypeChanged, c0 c0Var, k10.c0 c0Var2, State state) {
            State.Field<EpuapApplicationType> fieldG = state.g();
            EpuapApplicationType value = applicationTypeChanged.getValue();
            t02.h hVar = c0Var.formValidationUseCase;
            EpuapApplicationType value2 = applicationTypeChanged.getValue();
            State.Field<String> fieldC = ((State) c0Var2.a()).c();
            for (t02.h.Results.a aVar : hVar.b(new t02.h.Params(e1.d(new t02.h.Params.InterfaceC4834a.C4835a(value2, fieldC != null ? fieldC.d() : null)))).a()) {
                if (aVar instanceof t02.h.Results.a.C4837b) {
                    return State.b(state, null, null, fieldG.a(value, aVar.getValue()), applicationTypeChanged.getValue().getCode() == EpuapApplicationType.a.OTHER ? new State.Field("", null, 2, null) : null, null, null, null, null, 243, null);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r22.a.ApplicationTypeChanged applicationTypeChanged = (r22.a.ApplicationTypeChanged) this.f171030f;
            final k10.c0 c0Var = (k10.c0) this.f171031g;
            uq.b.e();
            if (this.f171029e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final c0 c0Var2 = c0.this;
            return c0Var.b(new er.l() { // from class: r22.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.c.O(applicationTypeChanged, c0Var2, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.ApplicationTypeChanged applicationTypeChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = c0.this.new c(eVar);
            cVar.f171030f = applicationTypeChanged;
            cVar.f171031g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$a;", "action", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<r22.a.ApplicationNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171035g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r22.a.ApplicationNameChanged applicationNameChanged, c0 c0Var, k10.c0 c0Var2, State state) {
            State.Field<String> fieldA;
            State.Field<String> fieldC = state.c();
            if (fieldC != null) {
                String value = applicationNameChanged.getValue();
                for (t02.h.Results.a aVar : c0Var.formValidationUseCase.b(new t02.h.Params(e1.d(new t02.h.Params.InterfaceC4834a.C4835a(((State) c0Var2.a()).g().d(), applicationNameChanged.getValue())))).a()) {
                    if (aVar instanceof t02.h.Results.a.C4836a) {
                        fieldA = fieldC.a(value, aVar.getValue());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            fieldA = null;
            return State.b(state, null, null, null, fieldA, null, null, null, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r22.a.ApplicationNameChanged applicationNameChanged = (r22.a.ApplicationNameChanged) this.f171034f;
            final k10.c0 c0Var = (k10.c0) this.f171035g;
            uq.b.e();
            if (this.f171033e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final c0 c0Var2 = c0.this;
            return c0Var.b(new er.l() { // from class: r22.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.d.O(applicationNameChanged, c0Var2, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.ApplicationNameChanged applicationNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = c0.this.new d(eVar);
            dVar.f171034f = applicationNameChanged;
            dVar.f171035g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$x;", "<unused var>", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$x;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<r22.a.x, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171038f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:18:0x0039  */
        public static final State O(Map map, Map.Entry entry, State state) {
            State.Field<EpuapApplicationType> fieldG;
            State.Field<String> fieldC;
            State.Field<String> fieldJ;
            State.Field<String> fieldE;
            hz.b bVar = (hz.b) map.get(r22.b.APPLICATION_TYPE);
            if (bVar == null || (fieldG = State.Field.b(state.g(), null, bVar, 1, null)) == null) {
                fieldG = state.g();
            }
            State.Field<EpuapApplicationType> field = fieldG;
            hz.b bVar2 = (hz.b) map.get(r22.b.APPLICATION_NAME);
            if (bVar2 == null) {
                fieldC = state.c();
            } else {
                State.Field<String> fieldC2 = state.c();
                fieldC = fieldC2 != null ? State.Field.b(fieldC2, null, bVar2, 1, null) : null;
                if (fieldC == null) {
                    fieldC = state.c();
                }
            }
            State.Field<String> field2 = fieldC;
            hz.b bVar3 = (hz.b) map.get(r22.b.TITLE);
            if (bVar3 == null || (fieldJ = State.Field.b(state.j(), null, bVar3, 1, null)) == null) {
                fieldJ = state.j();
            }
            State.Field<String> field3 = fieldJ;
            hz.b bVar4 = (hz.b) map.get(r22.b.CONTENT_TEXT);
            if (bVar4 == null || (fieldE = State.Field.b(state.e(), null, bVar4, 1, null)) == null) {
                fieldE = state.e();
            }
            return State.b(state, null, null, field, field2, field3, fieldE, entry != null ? (r22.b) entry.getKey() : null, null, 131, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oq.r rVarA;
            k10.c0 c0Var = (k10.c0) this.f171038f;
            uq.b.e();
            if (this.f171037e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t02.h hVar = c0.this.formValidationUseCase;
            EpuapApplicationType epuapApplicationTypeD = ((State) c0Var.a()).g().d();
            State.Field<String> fieldC = ((State) c0Var.a()).c();
            Object obj2 = null;
            List<t02.h.Results.a> listA = hVar.b(new t02.h.Params(e1.i(new t02.h.Params.InterfaceC4834a.C4835a(epuapApplicationTypeD, fieldC != null ? fieldC.d() : null), new t02.h.Params.InterfaceC4834a.c(((State) c0Var.a()).j().d()), new t02.h.Params.InterfaceC4834a.b(((State) c0Var.a()).e().d())))).a();
            final LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(listA, 10)), 16));
            for (t02.h.Results.a aVar : listA) {
                if (aVar instanceof t02.h.Results.a.d) {
                    rVarA = oq.y.a(r22.b.TITLE, ((t02.h.Results.a.d) aVar).getValue());
                } else if (aVar instanceof t02.h.Results.a.c) {
                    rVarA = oq.y.a(r22.b.CONTENT_TEXT, ((t02.h.Results.a.c) aVar).getValue());
                } else if (aVar instanceof t02.h.Results.a.C4837b) {
                    rVarA = oq.y.a(r22.b.APPLICATION_TYPE, ((t02.h.Results.a.C4837b) aVar).getValue());
                } else {
                    if (!(aVar instanceof t02.h.Results.a.C4836a)) {
                        throw new oq.p();
                    }
                    rVarA = oq.y.a(r22.b.APPLICATION_NAME, ((t02.h.Results.a.C4836a) aVar).getValue());
                }
                linkedHashMap.put(rVarA.c(), rVarA.d());
            }
            for (Object obj3 : linkedHashMap.entrySet()) {
                if (((Map.Entry) obj3).getValue() instanceof hz.b.Invalid) {
                    obj2 = obj3;
                    break;
                }
            }
            final Map.Entry entry = (Map.Entry) obj2;
            if (entry == null) {
                c0.this.d9(r22.a.f.f170945a);
            }
            return c0Var.b(new er.l() { // from class: r22.g0
                @Override // er.l
                public final Object b(Object obj4) {
                    return c0.e.O(linkedHashMap, entry, (State) obj4);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.x xVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = c0.this.new e(eVar);
            eVar2.f171038f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$k;", "action", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<r22.a.OnBottomSheetStateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171042g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r22.a.OnBottomSheetStateChanged onBottomSheetStateChanged, State state) {
            return State.b(state, onBottomSheetStateChanged.getValue(), null, null, null, null, null, null, null, 254, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r22.a.OnBottomSheetStateChanged onBottomSheetStateChanged = (r22.a.OnBottomSheetStateChanged) this.f171041f;
            k10.c0 c0Var = (k10.c0) this.f171042g;
            uq.b.e();
            if (this.f171040e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r22.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.f.O(onBottomSheetStateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f171041f = onBottomSheetStateChanged;
            fVar.f171042g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$n;", "action", "Lr22/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr22/a$n;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<r22.a.OnPickerActionSelected, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171044f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f171046a;

            static {
                int[] iArr = new int[t22.a.values().length];
                try {
                    iArr[t22.a.PICK_FILE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t22.a.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[t22.a.TAKE_PHOTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f171046a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.OnPickerActionSelected onPickerActionSelected = (r22.a.OnPickerActionSelected) this.f171044f;
            uq.b.e();
            if (this.f171043e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f171046a[onPickerActionSelected.getPickerAction().ordinal()];
            if (i15 == 1) {
                c0.this.d9(new r22.a.PickFile(onPickerActionSelected));
            } else if (i15 == 2) {
                c0.this.d9(new r22.a.PickPhoto(onPickerActionSelected));
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                c0.this.d9(new r22.a.TakePhoto(onPickerActionSelected));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.OnPickerActionSelected onPickerActionSelected, State state, tq.e<? super oq.i0> eVar) {
            g gVar = c0.this.new g(eVar);
            gVar.f171044f = onPickerActionSelected;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$p;", "action", "Lr22/c;", "state", "Loq/i0;", "<anonymous>", "(Lr22/a$p;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<r22.a.PickFile, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171049g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f171051e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f171052f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f171053g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f171054h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f171055j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c0 f171056k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ State f171057l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ r22.a.PickFile f171058m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, State state, r22.a.PickFile pickFile, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171056k = c0Var;
                this.f171057l = state;
                this.f171058m = pickFile;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
            
                if (r1.U9(r4, r3, r7) == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f171055j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r7.f171052f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r7.f171051e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto L9d
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    oq.u.b(r8)
                    goto L50
                L27:
                    oq.u.b(r8)
                    r22.c0 r8 = r7.f171056k
                    r02.d r8 = r22.c0.F9(r8)
                    r22.c r1 = r7.f171057l
                    r22.c$a r1 = r1.i()
                    java.lang.Object r1 = r1.d()
                    java.util.List r1 = (java.util.List) r1
                    r02.d$a r4 = new r02.d$a
                    r5 = 1307470632(0x4dee6b28, float:5.0E8)
                    r6 = 1279179808(0x4c3ebc20, float:5.0E7)
                    r4.<init>(r5, r6, r1)
                    r7.f171055j = r3
                    java.lang.Object r8 = r8.i(r4, r7)
                    if (r8 != r0) goto L50
                    goto L80
                L50:
                    dx.i r8 = (dx.i) r8
                    r22.c0 r1 = r7.f171056k
                    r22.a$p r3 = r7.f171058m
                    boolean r4 = r8 instanceof dx.i.Left
                    if (r4 == 0) goto L81
                    r4 = r8
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    r22.a$n r3 = r3.getFromAction()
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f171051e = r8
                    java.lang.Object r8 = vq.j.a(r4)
                    r7.f171052f = r8
                    r8 = 0
                    r7.f171053g = r8
                    r7.f171054h = r8
                    r7.f171055j = r2
                    java.lang.Object r8 = r22.c0.M9(r1, r4, r3, r7)
                    if (r8 != r0) goto L9d
                L80:
                    return r0
                L81:
                    boolean r0 = r8 instanceof dx.i.Right
                    if (r0 == 0) goto La0
                    dx.i$c r8 = (dx.i.Right) r8
                    java.lang.Object r8 = r8.b()
                    r02.d$b r8 = (r02.d.Result) r8
                    r22.a$w r0 = new r22.a$w
                    zz.a r8 = r8.getFile()
                    r22.a$n r2 = r3.getFromAction()
                    r0.<init>(r8, r2)
                    r22.c0.t9(r1, r0)
                L9d:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                La0:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: r22.c0.h.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f171056k, this.f171057l, this.f171058m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.PickFile pickFile = (r22.a.PickFile) this.f171048f;
            State state = (State) this.f171049g;
            Object objE = uq.b.e();
            int i15 = this.f171047e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = c0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(c0.this, state, pickFile, null);
                this.f171048f = vq.j.a(pickFile);
                this.f171049g = vq.j.a(state);
                this.f171047e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(r22.a.PickFile pickFile, State state, tq.e<? super oq.i0> eVar) {
            h hVar = c0.this.new h(eVar);
            hVar.f171048f = pickFile;
            hVar.f171049g = state;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$q;", "action", "Lr22/c;", "state", "Loq/i0;", "<anonymous>", "(Lr22/a$q;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<r22.a.PickPhoto, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171060f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171061g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f171063e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f171064f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f171065g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f171066h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f171067j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c0 f171068k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ State f171069l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ r22.a.PickPhoto f171070m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, State state, r22.a.PickPhoto pickPhoto, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171068k = c0Var;
                this.f171069l = state;
                this.f171070m = pickPhoto;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
            
                if (r1.U9(r4, r3, r7) == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f171067j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r7.f171064f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r7.f171063e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto L9d
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    oq.u.b(r8)
                    goto L50
                L27:
                    oq.u.b(r8)
                    r22.c0 r8 = r7.f171068k
                    r02.e r8 = r22.c0.G9(r8)
                    r02.e$b r1 = new r02.e$b
                    r22.c r4 = r7.f171069l
                    r22.c$a r4 = r4.i()
                    java.lang.Object r4 = r4.d()
                    java.util.List r4 = (java.util.List) r4
                    r5 = 1279179808(0x4c3ebc20, float:5.0E7)
                    r6 = 1307470632(0x4dee6b28, float:5.0E8)
                    r1.<init>(r5, r6, r4)
                    r7.f171067j = r3
                    java.lang.Object r8 = r8.g(r1, r7)
                    if (r8 != r0) goto L50
                    goto L80
                L50:
                    dx.i r8 = (dx.i) r8
                    r22.c0 r1 = r7.f171068k
                    r22.a$q r3 = r7.f171070m
                    boolean r4 = r8 instanceof dx.i.Left
                    if (r4 == 0) goto L81
                    r4 = r8
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    r22.a$n r3 = r3.getFromAction()
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f171063e = r8
                    java.lang.Object r8 = vq.j.a(r4)
                    r7.f171064f = r8
                    r8 = 0
                    r7.f171065g = r8
                    r7.f171066h = r8
                    r7.f171067j = r2
                    java.lang.Object r8 = r22.c0.M9(r1, r4, r3, r7)
                    if (r8 != r0) goto L9d
                L80:
                    return r0
                L81:
                    boolean r0 = r8 instanceof dx.i.Right
                    if (r0 == 0) goto La0
                    dx.i$c r8 = (dx.i.Right) r8
                    java.lang.Object r8 = r8.b()
                    r02.e$c r8 = (r02.e.Result) r8
                    r22.a$w r0 = new r22.a$w
                    zz.a r8 = r8.getImageFile()
                    r22.a$n r2 = r3.getFromAction()
                    r0.<init>(r8, r2)
                    r22.c0.t9(r1, r0)
                L9d:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                La0:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: r22.c0.i.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f171068k, this.f171069l, this.f171070m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.PickPhoto pickPhoto = (r22.a.PickPhoto) this.f171060f;
            State state = (State) this.f171061g;
            Object objE = uq.b.e();
            int i15 = this.f171059e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = c0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(c0.this, state, pickPhoto, null);
                this.f171060f = vq.j.a(pickPhoto);
                this.f171061g = vq.j.a(state);
                this.f171059e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(r22.a.PickPhoto pickPhoto, State state, tq.e<? super oq.i0> eVar) {
            i iVar = c0.this.new i(eVar);
            iVar.f171060f = pickPhoto;
            iVar.f171061g = state;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$u;", "action", "Lr22/c;", "state", "Loq/i0;", "<anonymous>", "(Lr22/a$u;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<r22.a.TakePhoto, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171073g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f171075e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f171076f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f171077g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f171078h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f171079j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c0 f171080k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ State f171081l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ r22.a.TakePhoto f171082m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, State state, r22.a.TakePhoto takePhoto, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171080k = c0Var;
                this.f171081l = state;
                this.f171082m = takePhoto;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
            
                if (r1.U9(r4, r3, r8) == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r8.f171079j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r0 = r8.f171076f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r8.f171075e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r9)
                    goto Lb2
                L1b:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L23:
                    oq.u.b(r9)
                    goto L65
                L27:
                    oq.u.b(r9)
                    r22.c0 r9 = r8.f171080k
                    r02.f r9 = r22.c0.K9(r9)
                    r02.f$a r1 = new r02.f$a
                    r22.c0 r4 = r8.f171080k
                    r02.c r4 = r22.c0.C9(r4)
                    gz.b$a$a r5 = gz.b.a.C1792a.f78542a
                    java.lang.String r4 = r4.b(r5)
                    r22.c r5 = r8.f171081l
                    r22.c$a r5 = r5.i()
                    java.lang.Object r5 = r5.d()
                    java.util.List r5 = (java.util.List) r5
                    float r5 = m02.d.c(r5)
                    zb4.a r6 = new zb4.a
                    r7 = 1307470632(0x4dee6b28, float:5.0E8)
                    r6.<init>(r5, r7)
                    r5 = 1279179808(0x4c3ebc20, float:5.0E7)
                    r1.<init>(r4, r5, r6)
                    r8.f171079j = r3
                    java.lang.Object r9 = r9.d(r1, r8)
                    if (r9 != r0) goto L65
                    goto L95
                L65:
                    dx.i r9 = (dx.i) r9
                    r22.c0 r1 = r8.f171080k
                    r22.a$u r3 = r8.f171082m
                    boolean r4 = r9 instanceof dx.i.Left
                    if (r4 == 0) goto L96
                    r4 = r9
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    r22.a$n r3 = r3.getFromAction()
                    java.lang.Object r9 = vq.j.a(r9)
                    r8.f171075e = r9
                    java.lang.Object r9 = vq.j.a(r4)
                    r8.f171076f = r9
                    r9 = 0
                    r8.f171077g = r9
                    r8.f171078h = r9
                    r8.f171079j = r2
                    java.lang.Object r9 = r22.c0.M9(r1, r4, r3, r8)
                    if (r9 != r0) goto Lb2
                L95:
                    return r0
                L96:
                    boolean r0 = r9 instanceof dx.i.Right
                    if (r0 == 0) goto Lb5
                    dx.i$c r9 = (dx.i.Right) r9
                    java.lang.Object r9 = r9.b()
                    r02.f$b r9 = (r02.f.Result) r9
                    r22.a$w r0 = new r22.a$w
                    zz.a r9 = r9.getImageFile()
                    r22.a$n r2 = r3.getFromAction()
                    r0.<init>(r9, r2)
                    r22.c0.t9(r1, r0)
                Lb2:
                    oq.i0 r9 = oq.i0.f148189a
                    return r9
                Lb5:
                    oq.p r9 = new oq.p
                    r9.<init>()
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: r22.c0.j.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f171080k, this.f171081l, this.f171082m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.TakePhoto takePhoto = (r22.a.TakePhoto) this.f171072f;
            State state = (State) this.f171073g;
            Object objE = uq.b.e();
            int i15 = this.f171071e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = c0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(c0.this, state, takePhoto, null);
                this.f171072f = vq.j.a(takePhoto);
                this.f171073g = vq.j.a(state);
                this.f171071e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(r22.a.TakePhoto takePhoto, State state, tq.e<? super oq.i0> eVar) {
            j jVar = c0.this.new j(eVar);
            jVar.f171072f = takePhoto;
            jVar.f171073g = state;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$w;", "action", "Lr22/c;", "state", "Loq/i0;", "<anonymous>", "(Lr22/a$w;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<r22.a.ValidateFileName, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171085g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f171087e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f171088f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f171089g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f171090h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f171091j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c0 f171092k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ r22.a.ValidateFileName f171093l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ State f171094m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, r22.a.ValidateFileName validateFileName, State state, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171092k = c0Var;
                this.f171093l = validateFileName;
                this.f171094m = state;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f171091j;
                if (i15 == 0) {
                    oq.u.b(obj);
                    r02.a aVar = this.f171092k.checkFileNameUseCase;
                    y0 y0Var = y0.E_PUAP;
                    FilePickerMetadata metadata = this.f171093l.getPickedFile().getMetadata();
                    List<m02.c> listD = this.f171094m.i().d();
                    ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
                    Iterator<T> it = listD.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((m02.c) it.next()).getMetadata().getName());
                    }
                    dx.i<dx.b, oq.i0> iVarI = aVar.i(new r02.a.Params(y0Var, metadata, arrayList));
                    c0 c0Var = this.f171092k;
                    r22.a.ValidateFileName validateFileName = this.f171093l;
                    if (iVarI instanceof dx.i.Left) {
                        dx.b bVar = (dx.b) ((dx.i.Left) iVarI).b();
                        r22.a.OnPickerActionSelected fromAction = validateFileName.getFromAction();
                        this.f171087e = vq.j.a(iVarI);
                        this.f171088f = vq.j.a(bVar);
                        this.f171089g = 0;
                        this.f171090h = 0;
                        this.f171091j = 1;
                        if (c0Var.U9(bVar, fromAction, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (!(iVarI instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        c0Var.d9(new r22.a.OnFilePicked(validateFileName.getPickedFile(), validateFileName.getFromAction()));
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f171092k, this.f171093l, this.f171094m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.ValidateFileName validateFileName = (r22.a.ValidateFileName) this.f171084f;
            State state = (State) this.f171085g;
            Object objE = uq.b.e();
            int i15 = this.f171083e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = c0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(c0.this, validateFileName, state, null);
                this.f171084f = vq.j.a(validateFileName);
                this.f171085g = vq.j.a(state);
                this.f171083e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(r22.a.ValidateFileName validateFileName, State state, tq.e<? super oq.i0> eVar) {
            k kVar = c0.this.new k(eVar);
            kVar.f171084f = validateFileName;
            kVar.f171085g = state;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$c;", "<unused var>", "Lr22/c;", "state", "Loq/i0;", "<anonymous>", "(Lr22/a$c;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<r22.a.c, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171096f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f171096f;
            Object objE = uq.b.e();
            int i15 = this.f171095e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                c0Var.ea(c0Var.Q9(state));
                xw.b<r22.a.j> bVarY1 = c0.this.Y1();
                r22.a.j.C4336a c4336a = r22.a.j.C4336a.f170949a;
                this.f171096f = vq.j.a(state);
                this.f171095e = 1;
                if (bVarY1.F(c4336a, this) == objE) {
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
        public final Object w(r22.a.c cVar, State state, tq.e<? super oq.i0> eVar) {
            l lVar = c0.this.new l(eVar);
            lVar.f171096f = state;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$m;", "action", "Lr22/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr22/a$m;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<r22.a.OnFilePicked, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171099f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f171101e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c0 f171102f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r22.a.OnFilePicked f171103g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, r22.a.OnFilePicked onFilePicked, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171102f = c0Var;
                this.f171103g = onFilePicked;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f171101e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f171102f.d9(new r22.a.SendFile(this.f171103g.getPickedFile()));
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f171102f, this.f171103g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.OnFilePicked onFilePicked = (r22.a.OnFilePicked) this.f171099f;
            Object objE = uq.b.e();
            int i15 = this.f171098e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = c0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(c0.this, onFilePicked, null);
                this.f171099f = vq.j.a(onFilePicked);
                this.f171098e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(r22.a.OnFilePicked onFilePicked, State state, tq.e<? super oq.i0> eVar) {
            m mVar = c0.this.new m(eVar);
            mVar.f171099f = onFilePicked;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$s;", "action", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<r22.a.SendFile, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171105f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171106g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lr22/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f171108e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c0 f171109f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r22.a.SendFile f171110g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f171111h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, r22.a.SendFile sendFile, k10.c0<State> c0Var2, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171109f = c0Var;
                this.f171110g = sendFile;
                this.f171111h = c0Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(r22.a.SendFile sendFile, String str, State state) {
                return State.b(state, null, new State.Field(pq.v.M0(state.i().d(), new m02.c.PickedFileData(sendFile.getPickedFile(), eo0.y.b(str), null)), null, 2, null), null, null, null, null, null, null, 253, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f171108e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p02.o0 o0Var = this.f171109f.sendEpuapAttachmentUC;
                    p02.o0.Params params = new p02.o0.Params(this.f171110g.getPickedFile());
                    this.f171108e = 1;
                    obj = o0Var.e(params, this);
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
                k10.c0<State> c0Var = this.f171111h;
                c0 c0Var2 = this.f171109f;
                final r22.a.SendFile sendFile = this.f171110g;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    Object objC = c0Var.c();
                    c0Var2.R9(bVar, sendFile);
                    return objC;
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final String str = (String) ((dx.i.Right) iVar).b();
                c0Var2.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
                return c0Var.b(new er.l() { // from class: r22.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.n.a.V(sendFile, str, (State) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f171109f, this.f171110g, this.f171111h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.SendFile sendFile = (r22.a.SendFile) this.f171105f;
            k10.c0 c0Var = (k10.c0) this.f171106g;
            Object objE = uq.b.e();
            int i15 = this.f171104e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = c0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(c0.this, sendFile, c0Var, null);
            this.f171105f = vq.j.a(sendFile);
            this.f171106g = vq.j.a(c0Var);
            this.f171104e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.SendFile sendFile, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = c0.this.new n(eVar);
            nVar.f171105f = sendFile;
            nVar.f171106g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$l;", "action", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<r22.a.OnDeleteFile, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171114g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lr22/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f171116e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c0 f171117f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r22.a.OnDeleteFile f171118g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f171119h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, r22.a.OnDeleteFile onDeleteFile, k10.c0<State> c0Var2, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171117f = c0Var;
                this.f171118g = onDeleteFile;
                this.f171119h = c0Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(r22.a.OnDeleteFile onDeleteFile, State state) {
                List<m02.c> listD = state.i().d();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (!eo0.y.d(((m02.c) obj).getAttachmentId(), ((m02.c.PickedFileData) onDeleteFile.getFile()).getAttachmentId())) {
                        arrayList.add(obj);
                    }
                }
                return State.b(state, null, new State.Field(arrayList, null, 2, null), null, null, null, null, null, null, 253, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f171116e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p02.k0 k0Var = this.f171117f.removeEpuapAttachmentUC;
                    p02.k0.Params params = new p02.k0.Params(((m02.c.PickedFileData) this.f171118g.getFile()).getAttachmentId(), null);
                    this.f171116e = 1;
                    obj = k0Var.e(params, this);
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
                c0 c0Var = this.f171117f;
                final r22.a.OnDeleteFile onDeleteFile = this.f171118g;
                k10.c0<State> c0Var2 = this.f171119h;
                if (iVar instanceof dx.i.Left) {
                    c0Var.R9((dx.b) ((dx.i.Left) iVar).b(), onDeleteFile);
                    return c0Var2.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                return c0Var2.b(new er.l() { // from class: r22.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.o.a.V(onDeleteFile, (State) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f171117f, this.f171118g, this.f171119h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r22.a.OnDeleteFile onDeleteFile, State state) {
            List<m02.c> listD = state.i().d();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                if (!eo0.y.d(((m02.c) obj).getAttachmentId(), ((m02.c.UploadedFilePlaceholder) onDeleteFile.getFile()).getAttachmentId())) {
                    arrayList.add(obj);
                }
            }
            return State.b(state, null, new State.Field(arrayList, null, 2, null), null, null, null, null, null, null, 253, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r22.a.OnDeleteFile onDeleteFile = (r22.a.OnDeleteFile) this.f171113f;
            k10.c0 c0Var = (k10.c0) this.f171114g;
            Object objE = uq.b.e();
            int i15 = this.f171112e;
            if (i15 == 0) {
                oq.u.b(obj);
                m02.c file = onDeleteFile.getFile();
                if (file instanceof m02.c.UploadedFilePlaceholder) {
                    return c0Var.b(new er.l() { // from class: r22.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.o.O(onDeleteFile, (State) obj2);
                        }
                    });
                }
                if (!(file instanceof m02.c.PickedFileData)) {
                    throw new oq.p();
                }
                ac4.a aVar = c0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(c0.this, onDeleteFile, c0Var, null);
                this.f171113f = vq.j.a(onDeleteFile);
                this.f171114g = vq.j.a(c0Var);
                this.f171112e = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.OnDeleteFile onDeleteFile, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = c0.this.new o(eVar);
            oVar.f171113f = onDeleteFile;
            oVar.f171114g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$i;", "action", "Lr22/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr22/a$i;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<r22.a.GoToAuthorization, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171121f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(c0 c0Var, r22.a.GoToAuthorization goToAuthorization) {
            c0Var.d9(goToAuthorization.getAction());
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r22.a.GoToAuthorization goToAuthorization = (r22.a.GoToAuthorization) this.f171121f;
            Object objE = uq.b.e();
            int i15 = this.f171120e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r22.a.j> bVarY1 = c0.this.Y1();
                final c0 c0Var = c0.this;
                r22.a.j.GoToAuthorization goToAuthorization2 = new r22.a.j.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: r22.l0
                    @Override // er.a
                    public final Object a() {
                        return c0.p.O(c0Var, goToAuthorization);
                    }
                }));
                this.f171121f = vq.j.a(goToAuthorization);
                this.f171120e = 1;
                if (bVarY1.F(goToAuthorization2, this) == objE) {
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
        public final Object w(r22.a.GoToAuthorization goToAuthorization, State state, tq.e<? super oq.i0> eVar) {
            p pVar = c0.this.new p(eVar);
            pVar.f171121f = goToAuthorization;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$e;", "action", "Lr22/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr22/a$e;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<r22.a.Error, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171124f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.Error error = (r22.a.Error) this.f171124f;
            Object objE = uq.b.e();
            int i15 = this.f171123e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r22.a.j> bVarY1 = c0.this.Y1();
                r22.a.j.GoToError goToError = new r22.a.j.GoToError(error.getErrorData());
                this.f171124f = vq.j.a(error);
                this.f171123e = 1;
                if (bVarY1.F(goToError, this) == objE) {
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
        public final Object w(r22.a.Error error, State state, tq.e<? super oq.i0> eVar) {
            q qVar = c0.this.new q(eVar);
            qVar.f171124f = error;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr22/a$g;", "<unused var>", "Lr22/c;", "Loq/i0;", "<anonymous>", "(Lr22/a$g;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<r22.a.g, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171126e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f171126e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.g gVar, State state, tq.e<? super oq.i0> eVar) {
            return c0.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$o;", "<unused var>", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<r22.a.o, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171129f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, null, null, 191, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f171129f;
            uq.b.e();
            if (this.f171128e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r22.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.s.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.o oVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            s sVar = new s(eVar);
            sVar.f171129f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr22/a$r;", "<unused var>", "Lr22/c;", "Loq/i0;", "<anonymous>", "(Lr22/a$r;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<r22.a.r, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171130e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f171130e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r22.a.j> bVarY1 = c0.this.Y1();
                r22.a.j.f fVar = r22.a.j.f.f170954a;
                this.f171130e = 1;
                if (bVarY1.F(fVar, this) == objE) {
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
        public final Object w(r22.a.r rVar, State state, tq.e<? super oq.i0> eVar) {
            return c0.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$h;", "action", "Lr22/c;", "state", "Loq/i0;", "<anonymous>", "(Lr22/a$h;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<r22.a.h, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171134g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f171136e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f171137f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f171138g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f171139h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f171140j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c0 f171141k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ State f171142l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ r22.a.h f171143m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, State state, r22.a.h hVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171141k = c0Var;
                this.f171142l = state;
                this.f171143m = hVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 V(c0 c0Var, EpuapApplicationType epuapApplicationType) {
                c0Var.d9(new r22.a.ApplicationTypeChanged(epuapApplicationType));
                return oq.i0.f148189a;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x009b  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                dx.i iVar2;
                c0 c0Var;
                r22.a.h hVar;
                Object objE = uq.b.e();
                int i15 = this.f171140j;
                if (i15 == 0) {
                    oq.u.b(obj);
                    p02.g gVar = this.f171141k.fetchApplicationTypeLabelsUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f171140j = 1;
                    obj = gVar.a(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar2 = (dx.i) this.f171136e;
                    oq.u.b(obj);
                }
                iVar = iVar2;
                c0Var = this.f171141k;
                hVar = this.f171143m;
                if (iVar instanceof dx.i.Left) {
                    c0Var.R9((dx.b) ((dx.i.Left) iVar).b(), hVar);
                }
                return oq.i0.f148189a;
                iVar = (dx.i) obj;
                final c0 c0Var2 = this.f171141k;
                State state = this.f171142l;
                if (iVar instanceof dx.i.Right) {
                    Set set = (Set) ((dx.i.Right) iVar).b();
                    xw.b<r22.a.j> bVarY1 = c0Var2.Y1();
                    s22.b bVar = c0Var2.applicationTypesMapper;
                    EpuapApplicationType epuapApplicationTypeD = state.g().d();
                    r22.a.j.GoToSearch goToSearch = new r22.a.j.GoToSearch(bVar.b(new s22.b.Params(epuapApplicationTypeD != null ? epuapApplicationTypeD.getCode() : null, set, new er.l() { // from class: r22.n0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.u.a.V(c0Var2, (EpuapApplicationType) obj2);
                        }
                    })));
                    this.f171136e = iVar;
                    this.f171137f = vq.j.a(set);
                    this.f171138g = 0;
                    this.f171139h = 0;
                    this.f171140j = 2;
                    if (bVarY1.F(goToSearch, this) != objE) {
                        iVar2 = iVar;
                        iVar = iVar2;
                    }
                    return objE;
                }
                c0Var = this.f171141k;
                hVar = this.f171143m;
                if (iVar instanceof dx.i.Left) {
                    c0Var.R9((dx.b) ((dx.i.Left) iVar).b(), hVar);
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f171141k, this.f171142l, this.f171143m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r22.a.h hVar = (r22.a.h) this.f171133f;
            State state = (State) this.f171134g;
            Object objE = uq.b.e();
            int i15 = this.f171132e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = c0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(c0.this, state, hVar, null);
                this.f171133f = vq.j.a(hVar);
                this.f171134g = vq.j.a(state);
                this.f171132e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(r22.a.h hVar, State state, tq.e<? super oq.i0> eVar) {
            u uVar = c0.this.new u(eVar);
            uVar.f171133f = hVar;
            uVar.f171134g = state;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr22/a$f;", "<unused var>", "Lr22/c;", "state", "Loq/i0;", "<anonymous>", "(Lr22/a$f;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<r22.a.f, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171145f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f171145f;
            Object objE = uq.b.e();
            int i15 = this.f171144e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                c0Var.ea(c0Var.Q9(state));
                xw.b<r22.a.j> bVarY1 = c0.this.Y1();
                r22.a.j.e eVar = r22.a.j.e.f170953a;
                this.f171145f = vq.j.a(state);
                this.f171144e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(r22.a.f fVar, State state, tq.e<? super oq.i0> eVar) {
            v vVar = c0.this.new v(eVar);
            vVar.f171145f = state;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr22/a$t;", "<unused var>", "Lr22/c;", "Loq/i0;", "<anonymous>", "(Lr22/a$t;Lr22/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<r22.a.t, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f171147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f171148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f171149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f171150h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f171151j;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f171151j;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0VarB = c0.this.getMessageServiceTypeUC.b(new x02.d.Params(c0.this.contract, c0.this.contract));
                c0 c0Var = c0.this;
                DialogData dialogDataB = c0Var.dialogMapper.b(new c12.g.Params(c0Var.b9(r22.a.r.f170964a), y0VarB, null, 4, null));
                xw.b<r22.a.j> bVarY1 = c0Var.Y1();
                r22.a.j.ShowDialog showDialog = new r22.a.j.ShowDialog(dialogDataB);
                this.f171147e = vq.j.a(y0VarB);
                this.f171148f = vq.j.a(dialogDataB);
                this.f171149g = 0;
                this.f171150h = 0;
                this.f171151j = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(r22.a.t tVar, State state, tq.e<? super oq.i0> eVar) {
            return c0.this.new w(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr22/a$v;", "action", "Lk10/c0;", "Lr22/c;", "state", "Lk10/l;", "<anonymous>", "(Lr22/a$v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<r22.a.TitleChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171155g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(r22.a.TitleChanged titleChanged, c0 c0Var, State state) {
            State.Field<String> fieldJ = state.j();
            String value = titleChanged.getValue();
            for (t02.h.Results.a aVar : c0Var.formValidationUseCase.b(new t02.h.Params(e1.d(new t02.h.Params.InterfaceC4834a.c(titleChanged.getValue())))).a()) {
                if (aVar instanceof t02.h.Results.a.d) {
                    return State.b(state, null, null, null, null, fieldJ.a(value, aVar.getValue()), null, null, null, 239, null);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r22.a.TitleChanged titleChanged = (r22.a.TitleChanged) this.f171154f;
            k10.c0 c0Var = (k10.c0) this.f171155g;
            uq.b.e();
            if (this.f171153e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final c0 c0Var2 = c0.this;
            return c0Var.b(new er.l() { // from class: r22.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.x.O(titleChanged, c0Var2, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r22.a.TitleChanged titleChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            x xVar = c0.this.new x(eVar);
            xVar.f171154f = titleChanged;
            xVar.f171155g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    public c0(yy.a aVar, s22.g gVar, c12.g gVar2, s22.b bVar, t02.h hVar, ac4.a aVar2, b12.c cVar, p02.g gVar3, r02.e eVar, r02.f fVar, r02.c cVar2, s22.k kVar, r02.d dVar, r02.a aVar3, p02.o0 o0Var, p02.k0 k0Var, x02.d dVar2, s22.c cVar3, a14.m mVar, yw.b bVar2, m22.h hVar2) {
        this.mapper = gVar;
        this.dialogMapper = gVar2;
        this.applicationTypesMapper = bVar;
        this.formValidationUseCase = hVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.electronicDeliveryErrorMapper = cVar;
        this.fetchApplicationTypeLabelsUC = gVar3;
        this.pickPhotoFromGalleryUC = eVar;
        this.takePhotoWithSizeValidationUC = fVar;
        this.generateNewCameraPhotoNameUC = cVar2;
        this.filePickerErrorMapper = kVar;
        this.pickFileUseCase = dVar;
        this.checkFileNameUseCase = aVar3;
        this.sendEpuapAttachmentUC = o0Var;
        this.removeEpuapAttachmentUC = k0Var;
        this.getMessageServiceTypeUC = dVar2;
        this.epuapMessageFormInitialStateMapper = cVar3;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar2;
        this.contract = hVar2;
        State stateB = cVar3.b(new s22.c.Params(hVar2.v6().getEntryPoint(), hVar2.p1()));
        this.initialState = stateB;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(stateB, new er.l() { // from class: r22.s
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ga(this.f171225a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), X9(stateB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Epuap Q9(State state) {
        String strD = state.j().d();
        String strD2 = state.e().d();
        EpuapApplicationType epuapApplicationTypeD = state.g().d();
        State.Field<String> fieldC = state.c();
        return new Epuap(state.i().d(), strD, strD2, epuapApplicationTypeD, fieldC != null ? fieldC.d() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R9(dx.b bVar, r22.a aVar) {
        this.electronicDeliveryErrorMapper.c(new b12.c.Params(bVar, b9(new r22.a.GoToAuthorization(aVar)), new er.a() { // from class: r22.b0
            @Override // er.a
            public final Object a() {
                return c0.S9();
            }
        }, b9(aVar), new er.l() { // from class: r22.r
            @Override // er.l
            public final Object b(Object obj) {
                return c0.T9(this.f171223a, (jb4.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(c0 c0Var, jb4.b bVar) {
        c0Var.d9(new r22.a.Error(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U9(dx.b bVar, final r22.a.OnPickerActionSelected onPickerActionSelected, tq.e<? super oq.i0> eVar) {
        s22.k.a fileOrPhotoPicker;
        Object goToError;
        if ((bVar instanceof dx.b.Business) && ((dx.b.Business) bVar).getType() == n02.a.REFRESH_TOKEN_EXPIRED) {
            d9(new r22.a.GoToAuthorization(onPickerActionSelected));
            return oq.i0.f148189a;
        }
        s22.k kVar = this.filePickerErrorMapper;
        boolean z15 = onPickerActionSelected.getPickerAction() == t22.a.TAKE_PHOTO;
        if (z15) {
            fileOrPhotoPicker = new s22.k.a.Camera(bVar, new er.a() { // from class: r22.z
                @Override // er.a
                public final Object a() {
                    return c0.V9(this.f171232a, onPickerActionSelected);
                }
            }, b9(r22.a.g.f170946a));
        } else {
            if (z15) {
                throw new oq.p();
            }
            fileOrPhotoPicker = new s22.k.a.FileOrPhotoPicker(bVar, new er.a() { // from class: r22.a0
                @Override // er.a
                public final Object a() {
                    return c0.W9(this.f170972a, onPickerActionSelected);
                }
            });
        }
        s22.k.b bVarB = kVar.b(fileOrPhotoPicker);
        if (bVarB == null) {
            return null;
        }
        if (bVarB instanceof s22.k.b.Dialog) {
            goToError = new r22.a.j.ShowDialog(((s22.k.b.Dialog) bVarB).getData());
        } else {
            if (!(bVarB instanceof s22.k.b.FullPage)) {
                throw new oq.p();
            }
            goToError = new r22.a.j.GoToError(((s22.k.b.FullPage) bVarB).getData());
        }
        Object objF = F(goToError, eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(c0 c0Var, r22.a.OnPickerActionSelected onPickerActionSelected) {
        c0Var.d9(onPickerActionSelected);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(c0 c0Var, r22.a.OnPickerActionSelected onPickerActionSelected) {
        c0Var.d9(onPickerActionSelected);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r22.d.Data X9(State state) {
        return this.mapper.b(new s22.g.Params(state, b9(r22.a.c.f170942a), b9(r22.a.t.f170966a), new er.l() { // from class: r22.q
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Y9(this.f171221a, (String) obj);
            }
        }, new er.l() { // from class: r22.t
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Z9(this.f171226a, (String) obj);
            }
        }, new er.l() { // from class: r22.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.aa(this.f171227a, (String) obj);
            }
        }, b9(r22.a.h.f170947a), b9(r22.a.x.f170971a), b9(r22.a.o.f170961a), new er.l() { // from class: r22.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ba(this.f171228a, (m02.c) obj);
            }
        }, new er.l() { // from class: r22.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ca(this.f171229a, (g30.v) obj);
            }
        }, new er.l() { // from class: r22.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.da(this.f171230a, (t22.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(c0 c0Var, String str) {
        c0Var.d9(new r22.a.TitleChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(c0 c0Var, String str) {
        c0Var.d9(new r22.a.ContentChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(c0 c0Var, String str) {
        c0Var.d9(new r22.a.ApplicationNameChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(c0 c0Var, m02.c cVar) {
        c0Var.d9(new r22.a.OnDeleteFile(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(c0 c0Var, g30.v vVar) {
        c0Var.d9(new r22.a.OnBottomSheetStateChanged(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(c0 c0Var, t22.a aVar) {
        c0Var.d9(new r22.a.OnPickerActionSelected(aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ea(Epuap epuap) {
        this.contract.j3(epuap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(final c0 c0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: r22.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.ha(this.f171231a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(c0 c0Var, k10.z zVar) {
        l lVar = c0Var.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(r22.a.c.class), oVar, lVar);
        zVar.x(fr.q0.c(r22.a.Error.class), oVar, c0Var.new q(null));
        zVar.x(fr.q0.c(r22.a.g.class), oVar, c0Var.new r(null));
        zVar.v(fr.q0.c(r22.a.o.class), oVar, new s(null));
        zVar.x(fr.q0.c(r22.a.r.class), oVar, c0Var.new t(null));
        zVar.x(fr.q0.c(r22.a.h.class), oVar, c0Var.new u(null));
        zVar.x(fr.q0.c(r22.a.f.class), oVar, c0Var.new v(null));
        zVar.x(fr.q0.c(r22.a.t.class), oVar, c0Var.new w(null));
        zVar.v(fr.q0.c(r22.a.TitleChanged.class), oVar, c0Var.new x(null));
        zVar.v(fr.q0.c(r22.a.ContentChanged.class), oVar, c0Var.new b(null));
        zVar.v(fr.q0.c(r22.a.ApplicationTypeChanged.class), oVar, c0Var.new c(null));
        zVar.v(fr.q0.c(r22.a.ApplicationNameChanged.class), oVar, c0Var.new d(null));
        zVar.v(fr.q0.c(r22.a.x.class), oVar, c0Var.new e(null));
        zVar.v(fr.q0.c(r22.a.OnBottomSheetStateChanged.class), oVar, new f(null));
        zVar.x(fr.q0.c(r22.a.OnPickerActionSelected.class), oVar, c0Var.new g(null));
        zVar.x(fr.q0.c(r22.a.PickFile.class), oVar, c0Var.new h(null));
        zVar.x(fr.q0.c(r22.a.PickPhoto.class), oVar, c0Var.new i(null));
        zVar.x(fr.q0.c(r22.a.TakePhoto.class), oVar, c0Var.new j(null));
        zVar.x(fr.q0.c(r22.a.ValidateFileName.class), oVar, c0Var.new k(null));
        zVar.x(fr.q0.c(r22.a.OnFilePicked.class), oVar, c0Var.new m(null));
        zVar.v(fr.q0.c(r22.a.SendFile.class), oVar, c0Var.new n(null));
        zVar.v(fr.q0.c(r22.a.OnDeleteFile.class), oVar, c0Var.new o(null));
        zVar.x(fr.q0.c(r22.a.GoToAuthorization.class), oVar, c0Var.new p(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(r22.a.j jVar, tq.e<? super oq.i0> eVar) {
        return super.F(jVar, eVar);
    }

    @Override // zx.b
    public xw.b<r22.a.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, r22.a> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: fa, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(m22.h hVar) {
        super.P5(hVar);
    }

    @Override // l00.e
    public mu.p0<r22.d.Data> getState() {
        return this.state;
    }
}
