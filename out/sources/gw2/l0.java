package gw2;

import al0.AdditionalAttachmentsData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003Bs\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"*\b\u0012\u0004\u0012\u00020\u00020!H\u0082@¢\u0006\u0004\b#\u0010$J\"\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u0004\u0018\u00010)*\u00020,2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b-\u0010.J\"\u0010/\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b/\u0010+J\"\u00100\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b0\u0010+J \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\"*\b\u0012\u0004\u0012\u00020\u00020!H\u0082@¢\u0006\u0004\b1\u0010$J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010W\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR&\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030X8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u00102\u001a\b\u0012\u0004\u0012\u0002030^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lgw2/l0;", "Ll00/g;", "Lgw2/m;", "", "Lgw2/p;", "Lyy/a;", "stateMachineFactory", "Liw2/j;", "mapper", "Lbc4/k;", "takePhotoWithSizeValidationUseCase", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lsv2/a;", "createCorrespondenceAddressDataUC", "Lbc4/h;", "pickFileUseCase", "Liw2/n;", "filePickerErrorMapper", "Lmx/c;", "labelProvider", "La00/b;", "pickedFileToAndroidMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lhw2/a;", "contract", "<init>", "(Lyy/a;Liw2/j;Lbc4/k;Lbc4/l;Lac4/a;Lsv2/a;Lbc4/h;Liw2/n;Lmx/c;La00/b;La14/m;Lyw/b;Lhw2/a;)V", "Lk10/c0;", "Lk10/l;", "Q9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lgw2/o;", "type", "Lgw2/j;", "fromAction", "Loq/i0;", "U9", "(Lgw2/o;Lgw2/j;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "D9", "(Ldx/b;Lgw2/j;Ltq/e;)Ljava/lang/Object;", "P9", "O9", "M9", "state", "Lgw2/p$a;", "G9", "(Lgw2/m;)Lgw2/p$a;", "b", "Liw2/j;", "c", "Lbc4/k;", "d", "Lbc4/l;", "e", "Lac4/a;", "f", "Lsv2/a;", "g", "Lbc4/h;", "h", "Liw2/n;", "j", "Lmx/c;", "k", "La00/b;", "l", "La14/m;", "m", "Lyw/b;", "n", "Lhw2/a;", "p", "Lgw2/m;", "initialState", "Lxw/b;", "Lgw2/c;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 extends l00.g<State, Object> implements gw2.p, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iw2.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bc4.k takePhotoWithSizeValidationUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final sv2.a createCorrespondenceAddressDataUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFileUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final iw2.n filePickerErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final hw2.a contract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gw2.c> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<gw2.p.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f78023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f78025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f78026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f78027h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f78028j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f78029k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f78030l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f78031m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78033p;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78031m = obj;
            this.f78033p |= PKIFailureInfo.systemUnavail;
            return l0.this.M9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f78034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f78036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f78037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f78038h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f78039j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f78040k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f78042m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78040k = obj;
            this.f78042m |= PKIFailureInfo.systemUnavail;
            return l0.this.O9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f78043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f78045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f78046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f78047h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f78048j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f78049k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f78051m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78049k = obj;
            this.f78051m |= PKIFailureInfo.systemUnavail;
            return l0.this.P9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lgw2/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f78053f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f78054g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f78055h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f78056j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ k10.c0<State> f78058l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k10.c0<State> c0Var, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f78058l = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(zz.h hVar, zz.h hVar2, State state) {
            return State.b(state, UploaderState.b(state.getCoveringFaceState(), hVar, false, false, false, 14, null), UploaderState.b(state.getGlassesState(), hVar2, false, false, false, 14, null), null, 4, null);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x009e  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        
            if (r9 == r0) goto L24;
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
                int r1 = r8.f78056j
                r2 = 0
                r3 = 0
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L29
                if (r1 != r4) goto L21
                java.lang.Object r0 = r8.f78054g
                wx.i r0 = (wx.i) r0
                java.lang.Object r0 = r8.f78053f
                zz.h r0 = (zz.h) r0
                java.lang.Object r1 = r8.f78052e
                al0.c r1 = (al0.AdditionalAttachmentsData) r1
                oq.u.b(r9)
                goto La0
            L21:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L29:
                java.lang.Object r1 = r8.f78053f
                wx.i r1 = (wx.i) r1
                java.lang.Object r1 = r8.f78052e
                al0.c r1 = (al0.AdditionalAttachmentsData) r1
                oq.u.b(r9)
                goto L68
            L35:
                oq.u.b(r9)
                gw2.l0 r9 = gw2.l0.this
                hw2.a r9 = gw2.l0.s9(r9)
                al0.c r1 = r9.v()
                if (r1 == 0) goto L71
                wx.i r9 = r1.getCoveringFaceFile()
                if (r9 == 0) goto L71
                gw2.l0 r6 = gw2.l0.this
                a00.b r6 = gw2.l0.u9(r6)
                a00.b$a r7 = new a00.b$a
                r7.<init>(r9)
                r8.f78052e = r1
                java.lang.Object r9 = vq.j.a(r9)
                r8.f78053f = r9
                r8.f78055h = r3
                r8.f78056j = r5
                java.lang.Object r9 = r6.a(r7, r8)
                if (r9 != r0) goto L68
                goto L9d
            L68:
                dx.i r9 = (dx.i) r9
                java.lang.Object r9 = r9.a()
                zz.h r9 = (zz.h) r9
                goto L72
            L71:
                r9 = r2
            L72:
                if (r1 == 0) goto Laa
                wx.i r5 = r1.getGlassesFile()
                if (r5 == 0) goto Laa
                gw2.l0 r2 = gw2.l0.this
                a00.b r2 = gw2.l0.u9(r2)
                a00.b$a r6 = new a00.b$a
                r6.<init>(r5)
                java.lang.Object r1 = vq.j.a(r1)
                r8.f78052e = r1
                r8.f78053f = r9
                java.lang.Object r1 = vq.j.a(r5)
                r8.f78054g = r1
                r8.f78055h = r3
                r8.f78056j = r4
                java.lang.Object r1 = r2.a(r6, r8)
                if (r1 != r0) goto L9e
            L9d:
                return r0
            L9e:
                r0 = r9
                r9 = r1
            La0:
                dx.i r9 = (dx.i) r9
                java.lang.Object r9 = r9.a()
                r2 = r9
                zz.h r2 = (zz.h) r2
                r9 = r0
            Laa:
                k10.c0<gw2.m> r0 = r8.f78058l
                gw2.m0 r1 = new gw2.m0
                r1.<init>()
                k10.l r9 = r0.b(r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: gw2.l0.d.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> N(tq.e<?> eVar) {
            return l0.this.new d(this.f78058l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<State>> eVar) {
            return ((d) N(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<gw2.p.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f78059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f78060b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f78061a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f78062b;

            /* JADX INFO: renamed from: gw2.l0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1769a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f78063d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f78064e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f78065f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f78067h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f78068j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f78069k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f78070l;

                public C1769a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f78063d = obj;
                    this.f78064e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, l0 l0Var) {
                this.f78061a = hVar;
                this.f78062b = l0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1769a c1769a;
                if (eVar instanceof C1769a) {
                    c1769a = (C1769a) eVar;
                    int i15 = c1769a.f78064e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1769a.f78064e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1769a = new C1769a(eVar);
                    }
                } else {
                    c1769a = new C1769a(eVar);
                }
                Object obj2 = c1769a.f78063d;
                Object objE = uq.b.e();
                int i16 = c1769a.f78064e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f78061a;
                    gw2.p.Data dataG9 = this.f78062b.G9((State) obj);
                    c1769a.f78065f = vq.j.a(obj);
                    c1769a.f78067h = vq.j.a(c1769a);
                    c1769a.f78068j = vq.j.a(obj);
                    c1769a.f78069k = vq.j.a(hVar);
                    c1769a.f78070l = 0;
                    c1769a.f78064e = 1;
                    if (hVar.F(dataG9, c1769a) == objE) {
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

        public e(mu.g gVar, l0 l0Var) {
            this.f78059a = gVar;
            this.f78060b = l0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super gw2.p.Data> hVar, tq.e eVar) {
            Object objA = this.f78059a.a(new a(hVar, this.f78060b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgw2/a;", "action", "Lk10/c0;", "Lgw2/m;", "state", "Lk10/l;", "<anonymous>", "(Lgw2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ClearRequestToBringIntoView, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78073g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f78074a;

            static {
                int[] iArr = new int[gw2.o.values().length];
                try {
                    iArr[gw2.o.COVERING_FACE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[gw2.o.GLASSES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f78074a = iArr;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ClearRequestToBringIntoView clearRequestToBringIntoView, State state) {
            int i15 = a.f78074a[clearRequestToBringIntoView.getType().ordinal()];
            if (i15 == 1) {
                return State.b(state, UploaderState.b(state.getCoveringFaceState(), null, false, false, false, 7, null), null, null, 6, null);
            }
            if (i15 == 2) {
                return State.b(state, null, UploaderState.b(state.getGlassesState(), null, false, false, false, 7, null), null, 5, null);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ClearRequestToBringIntoView clearRequestToBringIntoView = (ClearRequestToBringIntoView) this.f78072f;
            k10.c0 c0Var = (k10.c0) this.f78073g;
            uq.b.e();
            if (this.f78071e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gw2.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.f.O(clearRequestToBringIntoView, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ClearRequestToBringIntoView clearRequestToBringIntoView, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f78072f = clearRequestToBringIntoView;
            fVar.f78073g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw2/h;", "action", "Lgw2/m;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgw2/h;Lgw2/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnImageClick, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78076f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnImageClick onImageClick = (OnImageClick) this.f78076f;
            Object objE = uq.b.e();
            int i15 = this.f78075e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = l0.this;
                gw2.c.ShowImagePreview showImagePreview = new gw2.c.ShowImagePreview(new dx3.a.Content(onImageClick.getTitle(), onImageClick.getFileContent()));
                this.f78076f = vq.j.a(onImageClick);
                this.f78075e = 1;
                if (l0Var.F(showImagePreview, this) == objE) {
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
        public final Object w(OnImageClick onImageClick, State state, tq.e<? super oq.i0> eVar) {
            g gVar = l0.this.new g(eVar);
            gVar.f78076f = onImageClick;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgw2/d;", "<unused var>", "Lk10/c0;", "Lgw2/m;", "state", "Lk10/l;", "<anonymous>", "(Lgw2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<gw2.d, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f78079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f78080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f78081h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f78082j;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, gw2.l.a.f78005a, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f78082j;
            Object objE = uq.b.e();
            int i15 = this.f78081h;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f78078e;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            gw2.l bottomSheetState = ((State) c0Var.a()).getBottomSheetState();
            if (bottomSheetState instanceof gw2.l.Visible) {
                return c0Var.b(new er.l() { // from class: gw2.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return l0.h.O((State) obj2);
                    }
                });
            }
            if (!fr.t.c(bottomSheetState, gw2.l.a.f78005a)) {
                throw new oq.p();
            }
            k10.l lVarC = c0Var.c();
            l0 l0Var = l0.this;
            gw2.c.a aVar = gw2.c.a.f77974a;
            this.f78082j = vq.j.a(c0Var);
            this.f78078e = lVarC;
            this.f78079f = vq.j.a(lVarC);
            this.f78080g = 0;
            this.f78081h = 1;
            return l0Var.F(aVar, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gw2.d dVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = l0.this.new h(eVar);
            hVar.f78082j = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgw2/k;", "<unused var>", "Lgw2/m;", "Loq/i0;", "<anonymous>", "(Lgw2/k;Lgw2/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<gw2.k, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78084e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78084e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = l0.this;
                gw2.c.b bVar = gw2.c.b.f77975a;
                this.f78084e = 1;
                if (l0Var.F(bVar, this) == objE) {
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
        public final Object w(gw2.k kVar, State state, tq.e<? super oq.i0> eVar) {
            return l0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lgw2/m;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78087f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f78087f;
            Object objE = uq.b.e();
            int i15 = this.f78086e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            l0 l0Var = l0.this;
            this.f78087f = vq.j.a(c0Var);
            this.f78086e = 1;
            Object objQ9 = l0Var.Q9(c0Var, this);
            return objQ9 == objE ? objE : objQ9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = l0.this.new j(eVar);
            jVar.f78087f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgw2/b;", "<unused var>", "Lgw2/m;", "Loq/i0;", "<anonymous>", "(Lgw2/b;Lgw2/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<gw2.b, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78089e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f78089e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            l0.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw2.b bVar, State state, tq.e<? super oq.i0> eVar) {
            return l0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgw2/e;", "action", "Lk10/c0;", "Lgw2/m;", "state", "Lk10/l;", "<anonymous>", "(Lgw2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<OnBottomSheetStateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78093g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnBottomSheetStateChanged onBottomSheetStateChanged, State state) {
            return State.b(state, null, null, onBottomSheetStateChanged.getState(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnBottomSheetStateChanged onBottomSheetStateChanged = (OnBottomSheetStateChanged) this.f78092f;
            k10.c0 c0Var = (k10.c0) this.f78093g;
            uq.b.e();
            if (this.f78091e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gw2.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.l.O(onBottomSheetStateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f78092f = onBottomSheetStateChanged;
            lVar.f78093g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgw2/j;", "action", "Lgw2/m;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgw2/j;Lgw2/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<OnPickerActionSelected, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78095f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f78097a;

            static {
                int[] iArr = new int[cx2.a.values().length];
                try {
                    iArr[cx2.a.TAKE_PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[cx2.a.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[cx2.a.PICK_FILE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f78097a = iArr;
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            if (r7 == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        
            if (r7 == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
        
            if (r7 == r1) goto L28;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f78095f
                gw2.j r0 = (gw2.OnPickerActionSelected) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f78094e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L29
                if (r2 == r5) goto L25
                if (r2 == r4) goto L21
                if (r2 != r3) goto L19
                oq.u.b(r7)
                goto L53
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                oq.u.b(r7)
                goto L71
            L25:
                oq.u.b(r7)
                goto L89
            L29:
                oq.u.b(r7)
                cx2.a r7 = r0.getSelectedOption()
                int[] r2 = gw2.l0.m.a.f78097a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 == r5) goto L74
                if (r7 == r4) goto L5c
                if (r7 != r3) goto L56
                gw2.l0 r7 = gw2.l0.this
                gw2.o r2 = r0.getType()
                java.lang.Object r4 = vq.j.a(r0)
                r6.f78095f = r4
                r6.f78094e = r3
                java.lang.Object r7 = gw2.l0.y9(r7, r2, r0, r6)
                if (r7 != r1) goto L53
                goto L88
            L53:
                oq.i0 r7 = (oq.i0) r7
                goto L8b
            L56:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L5c:
                gw2.l0 r7 = gw2.l0.this
                gw2.o r2 = r0.getType()
                java.lang.Object r3 = vq.j.a(r0)
                r6.f78095f = r3
                r6.f78094e = r4
                java.lang.Object r7 = gw2.l0.z9(r7, r2, r0, r6)
                if (r7 != r1) goto L71
                goto L88
            L71:
                oq.i0 r7 = (oq.i0) r7
                goto L8b
            L74:
                gw2.l0 r7 = gw2.l0.this
                gw2.o r2 = r0.getType()
                java.lang.Object r3 = vq.j.a(r0)
                r6.f78095f = r3
                r6.f78094e = r5
                java.lang.Object r7 = gw2.l0.B9(r7, r2, r0, r6)
                if (r7 != r1) goto L89
            L88:
                return r1
            L89:
                oq.i0 r7 = (oq.i0) r7
            L8b:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: gw2.l0.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPickerActionSelected onPickerActionSelected, State state, tq.e<? super oq.i0> eVar) {
            m mVar = l0.this.new m(eVar);
            mVar.f78095f = onPickerActionSelected;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgw2/g;", "action", "Lk10/c0;", "Lgw2/m;", "state", "Lk10/l;", "<anonymous>", "(Lgw2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<OnFilePicked, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78100g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lgw2/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f78102e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f78103f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f78104g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f78105h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f78106j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f78107k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f78108l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f78109m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ l0 f78110n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ OnFilePicked f78111p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f78112q;

            /* JADX INFO: renamed from: gw2.l0$n$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1770a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f78113a;

                static {
                    int[] iArr = new int[gw2.o.values().length];
                    try {
                        iArr[gw2.o.COVERING_FACE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[gw2.o.GLASSES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f78113a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, OnFilePicked onFilePicked, k10.c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f78110n = l0Var;
                this.f78111p = onFilePicked;
                this.f78112q = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(OnFilePicked onFilePicked, zz.h hVar, State state) {
                int i15 = C1770a.f78113a[onFilePicked.getType().ordinal()];
                if (i15 == 1) {
                    return State.b(state, UploaderState.b(state.getCoveringFaceState(), hVar, false, true, false, 10, null), null, null, 6, null);
                }
                if (i15 == 2) {
                    return State.b(state, null, UploaderState.b(state.getGlassesState(), hVar, false, true, false, 10, null), null, 5, null);
                }
                throw new oq.p();
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f78109m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    a00.b bVar = this.f78110n.pickedFileToAndroidMapper;
                    a00.b.Params params = new a00.b.Params(this.f78111p.getPickedFile());
                    this.f78109m = 1;
                    obj = bVar.a(params, this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f78104g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                k10.c0<State> c0Var = this.f78112q;
                l0 l0Var = this.f78110n;
                final OnFilePicked onFilePicked = this.f78111p;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final zz.h hVar = (zz.h) ((dx.i.Right) iVar).b();
                    l0Var.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
                    return c0Var.b(new er.l() { // from class: gw2.q0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l0.n.a.V(onFilePicked, hVar, (State) obj2);
                        }
                    });
                }
                dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                Object objC = c0Var.c();
                OnPickerActionSelected fromAction = onFilePicked.getFromAction();
                this.f78102e = vq.j.a(iVar);
                this.f78103f = vq.j.a(bVar2);
                this.f78104g = objC;
                this.f78105h = vq.j.a(objC);
                this.f78106j = 0;
                this.f78107k = 0;
                this.f78108l = 0;
                this.f78109m = 2;
                return l0Var.D9(bVar2, fromAction, this) == objE ? objE : objC;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f78110n, this.f78111p, this.f78112q, eVar);
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
            OnFilePicked onFilePicked = (OnFilePicked) this.f78099f;
            k10.c0 c0Var = (k10.c0) this.f78100g;
            Object objE = uq.b.e();
            int i15 = this.f78098e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = l0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(l0.this, onFilePicked, c0Var, null);
            this.f78099f = vq.j.a(onFilePicked);
            this.f78100g = vq.j.a(c0Var);
            this.f78098e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnFilePicked onFilePicked, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = l0.this.new n(eVar);
            nVar.f78099f = onFilePicked;
            nVar.f78100g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgw2/f;", "action", "Lk10/c0;", "Lgw2/m;", "state", "Lk10/l;", "<anonymous>", "(Lgw2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<OnDeleteFileClick, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78116g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f78117a;

            static {
                int[] iArr = new int[gw2.o.values().length];
                try {
                    iArr[gw2.o.COVERING_FACE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[gw2.o.GLASSES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f78117a = iArr;
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnDeleteFileClick onDeleteFileClick, State state) {
            int i15 = a.f78117a[onDeleteFileClick.getType().ordinal()];
            if (i15 == 1) {
                return State.b(state, UploaderState.b(state.getCoveringFaceState(), null, false, false, false, 14, null), null, null, 6, null);
            }
            if (i15 == 2) {
                return State.b(state, null, UploaderState.b(state.getGlassesState(), null, false, false, false, 14, null), null, 5, null);
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnDeleteFileClick onDeleteFileClick = (OnDeleteFileClick) this.f78115f;
            k10.c0 c0Var = (k10.c0) this.f78116g;
            uq.b.e();
            if (this.f78114e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gw2.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.o.O(onDeleteFileClick, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnDeleteFileClick onDeleteFileClick, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = new o(eVar);
            oVar.f78115f = onDeleteFileClick;
            oVar.f78116g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgw2/i;", "<unused var>", "Lk10/c0;", "Lgw2/m;", "state", "Lk10/l;", "<anonymous>", "(Lgw2/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<gw2.i, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78119f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f78119f;
            Object objE = uq.b.e();
            int i15 = this.f78118e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            l0 l0Var = l0.this;
            this.f78119f = vq.j.a(c0Var);
            this.f78118e = 1;
            Object objM9 = l0Var.M9(c0Var, this);
            return objM9 == objE ? objE : objM9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(gw2.i iVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            p pVar = l0.this.new p(eVar);
            pVar.f78119f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f78121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f78123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f78124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f78125h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f78126j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f78127k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f78129m;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78127k = obj;
            this.f78129m |= PKIFailureInfo.systemUnavail;
            return l0.this.U9(null, null, this);
        }
    }

    public l0(yy.a aVar, iw2.j jVar, bc4.k kVar, bc4.l lVar, ac4.a aVar2, sv2.a aVar3, bc4.h hVar, iw2.n nVar, mx.c cVar, a00.b bVar, a14.m mVar, yw.b bVar2, hw2.a aVar4) {
        this.mapper = jVar;
        this.takePhotoWithSizeValidationUseCase = kVar;
        this.pickPhotoFromGalleryUseCase = lVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.createCorrespondenceAddressDataUC = aVar3;
        this.pickFileUseCase = hVar;
        this.filePickerErrorMapper = nVar;
        this.labelProvider = cVar;
        this.pickedFileToAndroidMapper = bVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar2;
        this.contract = aVar4;
        AdditionalAttachmentsConfigurationData additionalAttachmentsConfigurationDataT = aVar4.t();
        State state = new State(new UploaderState(null, additionalAttachmentsConfigurationDataT.getIsCoveringFaceEnabled(), false, false, 13, null), new UploaderState(null, additionalAttachmentsConfigurationDataT.getAreGlassesEnabled(), false, false, 13, null), null, 4, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: gw2.k0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.S9(this.f78004a, (k10.v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), G9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D9(dx.b bVar, final OnPickerActionSelected onPickerActionSelected, tq.e<? super oq.i0> eVar) {
        iw2.n.a fileOrPhotoPicker;
        iw2.n nVar = this.filePickerErrorMapper;
        boolean z15 = onPickerActionSelected.getSelectedOption() == cx2.a.TAKE_PHOTO;
        if (z15) {
            fileOrPhotoPicker = new iw2.n.a.Camera(bVar, new er.a() { // from class: gw2.i0
                @Override // er.a
                public final Object a() {
                    return l0.E9(this.f77997a, onPickerActionSelected);
                }
            }, b9(gw2.b.f77972a));
        } else {
            if (z15) {
                throw new oq.p();
            }
            fileOrPhotoPicker = new iw2.n.a.FileOrPhotoPicker(bVar, new er.a() { // from class: gw2.j0
                @Override // er.a
                public final Object a() {
                    return l0.F9(this.f78001a, onPickerActionSelected);
                }
            });
        }
        iw2.n.b bVarB = nVar.b(fileOrPhotoPicker);
        if (bVarB == null) {
            return null;
        }
        if (bVarB instanceof iw2.n.b.Dialog) {
            Object objF = F(new gw2.c.ShowDialog(((iw2.n.b.Dialog) bVarB).getDialogData()), eVar);
            if (objF == uq.b.e()) {
                return objF;
            }
        } else {
            if (!(bVarB instanceof iw2.n.b.FullPage)) {
                throw new oq.p();
            }
            Object objF2 = F(new gw2.c.ShowError(((iw2.n.b.FullPage) bVarB).getData()), eVar);
            if (objF2 == uq.b.e()) {
                return objF2;
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(l0 l0Var, OnPickerActionSelected onPickerActionSelected) {
        l0Var.d9(onPickerActionSelected);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(l0 l0Var, OnPickerActionSelected onPickerActionSelected) {
        l0Var.d9(onPickerActionSelected);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gw2.p.Data G9(State state) {
        return this.mapper.b(new iw2.j.Params(state, new er.p() { // from class: gw2.c0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return l0.H9(this.f77980a, (Label) obj, (FileContent) obj2);
            }
        }, new er.l() { // from class: gw2.d0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.I9(this.f77982a, (o) obj);
            }
        }, b9(gw2.i.f77996a), new er.l() { // from class: gw2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.J9(this.f77984a, (o) obj);
            }
        }, new er.l() { // from class: gw2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.K9(this.f77986a, (l) obj);
            }
        }, new er.p() { // from class: gw2.g0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return l0.L9(this.f77990a, (o) obj, (cx2.a) obj2);
            }
        }, b9(gw2.d.f77981a), b9(gw2.k.f78003a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(l0 l0Var, Label label, FileContent fileContent) {
        l0Var.d9(new OnImageClick(label, fileContent));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(l0 l0Var, gw2.o oVar) {
        l0Var.d9(new OnDeleteFileClick(oVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(l0 l0Var, gw2.o oVar) {
        l0Var.d9(new ClearRequestToBringIntoView(oVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(l0 l0Var, gw2.l lVar) {
        l0Var.d9(new OnBottomSheetStateChanged(lVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(l0 l0Var, gw2.o oVar, cx2.a aVar) {
        l0Var.d9(new OnPickerActionSelected(oVar, aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final Object M9(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        a aVar;
        zz.h pickedFile;
        zz.h pickedFile2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f78033p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f78033p = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f78031m;
        Object objE = uq.b.e();
        int i16 = aVar.f78033p;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar = (k10.l) aVar.f78025f;
            oq.u.b(obj);
            return lVar;
        }
        oq.u.b(obj);
        State stateA = c0Var.a();
        final ?? r15 = (stateA.getCoveringFaceState().getIsEnabled() && stateA.getCoveringFaceState().getPickedFile() == null) ? 0 : 1;
        final ?? r16 = (stateA.getGlassesState().getIsEnabled() && stateA.getGlassesState().getPickedFile() == null) ? 0 : 1;
        if (r15 == 0 || r16 == 0) {
            this.accessibilityTalkBackManager.a(this.labelProvider.c(gv2.a.B).getText());
            return c0Var.b(new er.l() { // from class: gw2.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.N9(r15, r16, (State) obj2);
                }
            });
        }
        Object objC = c0Var.c();
        hw2.a aVar2 = this.contract;
        UploaderState coveringFaceState = stateA.getCoveringFaceState();
        wx.i file = null;
        if (!coveringFaceState.getIsEnabled()) {
            coveringFaceState = null;
        }
        wx.i file2 = (coveringFaceState == null || (pickedFile2 = coveringFaceState.getPickedFile()) == null) ? null : pickedFile2.getFile();
        UploaderState glassesState = stateA.getGlassesState();
        if (!glassesState.getIsEnabled()) {
            glassesState = null;
        }
        if (glassesState != null && (pickedFile = glassesState.getPickedFile()) != null) {
            file = pickedFile.getFile();
        }
        aVar2.s(new AdditionalAttachmentsData(file2, file));
        Object goToNextScreen = new gw2.c.GoToNextScreen(this.createCorrespondenceAddressDataUC.b(new sv2.a.Params(this.contract.k())));
        aVar.f78023d = vq.j.a(c0Var);
        aVar.f78024e = vq.j.a(stateA);
        aVar.f78025f = objC;
        aVar.f78026g = vq.j.a(objC);
        aVar.f78027h = 0;
        aVar.f78028j = r15;
        aVar.f78029k = r16;
        aVar.f78030l = 0;
        aVar.f78033p = 1;
        return F(goToNextScreen, aVar) == objE ? objE : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State N9(boolean z15, boolean z16, State state) {
        return State.b(state, UploaderState.b(state.getCoveringFaceState(), null, false, z15, !z15, 3, null), UploaderState.b(state.getGlassesState(), null, false, z16, !z16 && z15, 3, null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r14 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O9(gw2.o r12, gw2.OnPickerActionSelected r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gw2.l0.O9(gw2.o, gw2.j, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (r14 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P9(gw2.o r12, gw2.OnPickerActionSelected r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gw2.l0.P9(gw2.o, gw2.j, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q9(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new d(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(final l0 l0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: gw2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.T9(this.f77973a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(l0 l0Var, k10.z zVar) {
        h hVar = l0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(gw2.d.class), oVar, hVar);
        zVar.x(fr.q0.c(gw2.k.class), oVar, l0Var.new i(null));
        zVar.A(l0Var.new j(null));
        zVar.x(fr.q0.c(gw2.b.class), oVar, l0Var.new k(null));
        zVar.v(fr.q0.c(OnBottomSheetStateChanged.class), oVar, new l(null));
        zVar.x(fr.q0.c(OnPickerActionSelected.class), oVar, l0Var.new m(null));
        zVar.v(fr.q0.c(OnFilePicked.class), oVar, l0Var.new n(null));
        zVar.v(fr.q0.c(OnDeleteFileClick.class), oVar, new o(null));
        zVar.v(fr.q0.c(gw2.i.class), oVar, l0Var.new p(null));
        zVar.v(fr.q0.c(ClearRequestToBringIntoView.class), oVar, new f(null));
        zVar.x(fr.q0.c(OnImageClick.class), oVar, l0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
    
        if (r1 == r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U9(gw2.o r17, gw2.OnPickerActionSelected r18, tq.e<? super oq.i0> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gw2.l0.U9(gw2.o, gw2.j, tq.e):java.lang.Object");
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(gw2.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: R9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(hw2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<gw2.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<gw2.p.Data> getState() {
        return this.state;
    }
}
