package nc2;

import hl0.IdCardInvalidationTheftDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'*\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b(\u0010)J\u0016\u0010,\u001a\u0004\u0018\u00010+*\u00020*H\u0082@¢\u0006\u0004\b,\u0010-J\u001e\u00102\u001a\u0004\u0018\u000101*\u00020.2\u0006\u00100\u001a\u00020/H\u0082@¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u0002H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010[\u001a\b\u0012\u0004\u0012\u00020V0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR&\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\\8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u00104\u001a\b\u0012\u0004\u0012\u0002050b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f¨\u0006g"}, d2 = {"Lnc2/y;", "Ll00/g;", "Lnc2/c;", "Lnc2/b;", "Lnc2/d;", "", "Lyy/a;", "stateMachineFactory", "Lpc2/k;", "mapper", "Lpc2/d;", "filePickerErrorMapper", "Lbc4/k;", "takePhotoWithSizeValidationUseCase", "Ltb2/a;", "generateNewCameraPhotoNameUC", "Lbc4/j;", "pickMultiplePhotosFromGalleryUseCase", "Lbc4/h;", "pickFileUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "La00/b;", "pickedFileToAndroidMapper", "Ltb2/e;", "validateDescriptionContentUC", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lpb2/a;", "createContactDetailsFormDataUC", "Loc2/a;", "contract", "<init>", "(Lyy/a;Lpc2/k;Lpc2/d;Lbc4/k;Ltb2/a;Lbc4/j;Lbc4/h;Lac4/a;La00/b;Ltb2/e;La14/m;Lyw/b;Lpb2/a;Loc2/a;)V", "Lk10/c0;", "Lhl0/d;", "data", "Lk10/l;", "P9", "(Lk10/c0;Lhl0/d;Ltq/e;)Ljava/lang/Object;", "Lwx/i;", "Lzz/h;", "T9", "(Lwx/i;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "Lnc2/b$l;", "fromAction", "Loq/i0;", "G9", "(Ldx/b;Lnc2/b$l;Ltq/e;)Ljava/lang/Object;", "state", "Lnc2/d$a;", "J9", "(Lnc2/c;)Lnc2/d$a;", "b", "Lpc2/k;", "c", "Lpc2/d;", "d", "Lbc4/k;", "e", "Ltb2/a;", "f", "Lbc4/j;", "g", "Lbc4/h;", "h", "Lac4/a;", "j", "La00/b;", "k", "Ltb2/e;", "l", "La14/m;", "m", "Lyw/b;", "n", "Lpb2/a;", "p", "Loc2/a;", "q", "Lnc2/c;", "initialState", "Lxw/b;", "Lnc2/b$b;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "s", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<State, nc2.b> implements nc2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pc2.k mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pc2.d filePickerErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.k takePhotoWithSizeValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final tb2.a generateNewCameraPhotoNameUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bc4.j pickMultiplePhotosFromGalleryUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFileUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final tb2.e validateDescriptionContentUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final pb2.a createContactDetailsFormDataUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oc2.a contract;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<nc2.b.InterfaceC3327b> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, nc2.b> stateMachine;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p0<nc2.d.Data> state;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lk10/l;", "Lnc2/c;", "<anonymous>", "(Lju/p0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f134128f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IdCardInvalidationTheftDescription f134130h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k10.c0<State> f134131j;

        /* JADX INFO: renamed from: nc2.y$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnc2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class C3330a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f134132e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ IdCardInvalidationTheftDescription f134133f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ju.p0 f134134g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ y f134135h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f134136j;

            /* JADX INFO: renamed from: nc2.y$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lzz/h;", "<anonymous>", "(Lju/p0;)Lzz/h;"}, k = 3, mv = {2, 2, 0})
            static final class C3331a extends vq.k implements er.p<ju.p0, tq.e<? super zz.h>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f134137e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ y f134138f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ wx.i f134139g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C3331a(y yVar, wx.i iVar, tq.e<? super C3331a> eVar) {
                    super(2, eVar);
                    this.f134138f = yVar;
                    this.f134139g = iVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f134137e;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                        return obj;
                    }
                    oq.u.b(obj);
                    y yVar = this.f134138f;
                    wx.i iVar = this.f134139g;
                    this.f134137e = 1;
                    Object objT9 = yVar.T9(iVar, this);
                    return objT9 == objE ? objE : objT9;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super zz.h> eVar) {
                    return ((C3331a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C3331a(this.f134138f, this.f134139g, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C3330a(IdCardInvalidationTheftDescription idCardInvalidationTheftDescription, ju.p0 p0Var, y yVar, k10.c0<State> c0Var, tq.e<? super C3330a> eVar) {
                super(1, eVar);
                this.f134133f = idCardInvalidationTheftDescription;
                this.f134134g = p0Var;
                this.f134135h = yVar;
                this.f134136j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(IdCardInvalidationTheftDescription idCardInvalidationTheftDescription, List list, State state) {
                return State.b(state, null, new State.FieldData(idCardInvalidationTheftDescription.getDescription(), null, 2, null), pq.v.i1(list), false, 9, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f134132e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    List<wx.i> listB = this.f134133f.b();
                    ju.p0 p0Var = this.f134134g;
                    y yVar = this.f134135h;
                    ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ju.k.b(p0Var, null, null, new C3331a(yVar, (wx.i) it.next(), null), 3, null));
                    }
                    this.f134132e = 1;
                    obj = ju.f.a(arrayList, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                final List listI0 = pq.v.i0((Iterable) obj);
                k10.c0<State> c0Var = this.f134136j;
                final IdCardInvalidationTheftDescription idCardInvalidationTheftDescription = this.f134133f;
                return c0Var.b(new er.l() { // from class: nc2.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.a.C3330a.V(idCardInvalidationTheftDescription, listI0, (State) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new C3330a(this.f134133f, this.f134134g, this.f134135h, this.f134136j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((C3330a) N(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(IdCardInvalidationTheftDescription idCardInvalidationTheftDescription, k10.c0<State> c0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f134130h = idCardInvalidationTheftDescription;
            this.f134131j = c0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju.p0 p0Var = (ju.p0) this.f134128f;
            Object objE = uq.b.e();
            int i15 = this.f134127e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y.this.callActionWithLoaderUseCase;
            C3330a c3330a = new C3330a(this.f134130h, p0Var, y.this, this.f134131j, null);
            this.f134128f = vq.j.a(p0Var);
            this.f134127e = 1;
            Object objA = ac4.a.a(aVar, null, c3330a, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super k10.l<State>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = y.this.new a(this.f134130h, this.f134131j, eVar);
            aVar.f134128f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<nc2.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f134140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f134141b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f134142a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f134143b;

            /* JADX INFO: renamed from: nc2.y$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3332a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f134144d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f134145e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f134146f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f134148h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f134149j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f134150k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f134151l;

                public C3332a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f134144d = obj;
                    this.f134145e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y yVar) {
                this.f134142a = hVar;
                this.f134143b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3332a c3332a;
                if (eVar instanceof C3332a) {
                    c3332a = (C3332a) eVar;
                    int i15 = c3332a.f134145e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3332a.f134145e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3332a = new C3332a(eVar);
                    }
                } else {
                    c3332a = new C3332a(eVar);
                }
                Object obj2 = c3332a.f134144d;
                Object objE = uq.b.e();
                int i16 = c3332a.f134145e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f134142a;
                    nc2.d.Data dataJ9 = this.f134143b.J9((State) obj);
                    c3332a.f134146f = vq.j.a(obj);
                    c3332a.f134148h = vq.j.a(c3332a);
                    c3332a.f134149j = vq.j.a(obj);
                    c3332a.f134150k = vq.j.a(hVar);
                    c3332a.f134151l = 0;
                    c3332a.f134145e = 1;
                    if (hVar.F(dataJ9, c3332a) == objE) {
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

        public b(mu.g gVar, y yVar) {
            this.f134140a = gVar;
            this.f134141b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super nc2.d.Data> hVar, tq.e eVar) {
            Object objA = this.f134140a.a(new a(hVar, this.f134141b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnc2/b$i;", "<unused var>", "Lnc2/c;", "Loq/i0;", "<anonymous>", "(Lnc2/b$i;Lnc2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<nc2.b.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134152e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f134152e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                nc2.b.InterfaceC3327b.ContactDetails contactDetails = new nc2.b.InterfaceC3327b.ContactDetails(y.this.createContactDetailsFormDataUC.b(new pb2.a.Params(y.this.contract.V())));
                this.f134152e = 1;
                if (yVar.F(contactDetails, this) == objE) {
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
        public final Object w(nc2.b.i iVar, State state, tq.e<? super i0> eVar) {
            return y.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnc2/b$c;", "<unused var>", "Lnc2/c;", "Loq/i0;", "<anonymous>", "(Lnc2/b$c;Lnc2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<nc2.b.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134154e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f134154e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nc2.b.InterfaceC3327b> bVarY1 = y.this.Y1();
                nc2.b.InterfaceC3327b.a aVar = nc2.b.InterfaceC3327b.a.f134029a;
                this.f134154e = 1;
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
        public final Object w(nc2.b.c cVar, State state, tq.e<? super i0> eVar) {
            return y.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnc2/b$m;", "<unused var>", "Lk10/c0;", "Lnc2/c;", "state", "Lk10/l;", "<anonymous>", "(Lnc2/b$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<nc2.b.m, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134157f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f134157f;
            uq.b.e();
            if (this.f134156e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nc2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.e.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nc2.b.m mVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f134157f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnc2/b$e;", "<unused var>", "Lnc2/c;", "Loq/i0;", "<anonymous>", "(Lnc2/b$e;Lnc2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<nc2.b.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134158e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f134158e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nc2.b.InterfaceC3327b> bVarY1 = y.this.Y1();
                nc2.b.InterfaceC3327b.C3328b c3328b = nc2.b.InterfaceC3327b.C3328b.f134030a;
                this.f134158e = 1;
                if (bVarY1.F(c3328b, this) == objE) {
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
        public final Object w(nc2.b.e eVar, State state, tq.e<? super i0> eVar2) {
            return y.this.new f(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lnc2/c;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f134161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f134163h;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f134163h;
            Object objE = uq.b.e();
            int i15 = this.f134162g;
            if (i15 == 0) {
                oq.u.b(obj);
                IdCardInvalidationTheftDescription idCardInvalidationTheftDescriptionT4 = y.this.contract.T4();
                if (idCardInvalidationTheftDescriptionT4 != null) {
                    y yVar = y.this;
                    this.f134163h = c0Var;
                    this.f134160e = vq.j.a(idCardInvalidationTheftDescriptionT4);
                    this.f134161f = 0;
                    this.f134162g = 1;
                    obj = yVar.P9(c0Var, idCardInvalidationTheftDescriptionT4, this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return c0Var.c();
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((g) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = y.this.new g(eVar);
            gVar.f134163h = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnc2/b$a;", "<unused var>", "Lnc2/c;", "Loq/i0;", "<anonymous>", "(Lnc2/b$a;Lnc2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<nc2.b.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134165e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f134165e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nc2.b.a aVar, State state, tq.e<? super i0> eVar) {
            return y.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnc2/b$l;", "action", "Lnc2/c;", "state", "Loq/i0;", "<anonymous>", "(Lnc2/b$l;Lnc2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<nc2.b.OnPickerActionSelected, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f134167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f134168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134169g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f134170h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f134171j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f134172k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f134173l;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f134175a;

            static {
                int[] iArr = new int[nc2.a.values().length];
                try {
                    iArr[nc2.a.PICK_FILE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nc2.a.PICK_PHOTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[nc2.a.TAKE_PHOTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f134175a = iArr;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x009a  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:39:0x017c  */
        /* JADX WARN: Code duplicated, block: B:42:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:44:0x01af  */
        /* JADX WARN: Code duplicated, block: B:45:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:62:0x0237  */
        /* JADX WARN: Code duplicated, block: B:65:0x0265  */
        /* JADX WARN: Code duplicated, block: B:67:0x0269  */
        /* JADX WARN: Code duplicated, block: B:70:0x0280  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
        
            if (r5.G9(r6, r1, r18) == r3) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x01a7, code lost:
        
            if (r6.G9(r8, r1, r18) == r3) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0262, code lost:
        
            if (r5.G9(r8, r1, r18) == r3) goto L64;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 664
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: nc2.y.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nc2.b.OnPickerActionSelected onPickerActionSelected, State state, tq.e<? super i0> eVar) {
            i iVar = y.this.new i(eVar);
            iVar.f134172k = onPickerActionSelected;
            iVar.f134173l = state;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnc2/b$h;", "action", "Lk10/c0;", "Lnc2/c;", "state", "Lk10/l;", "<anonymous>", "(Lnc2/b$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<nc2.b.OnFilesPicked, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134178g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lnc2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f134180e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f134181f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f134182g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f134183h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f134184j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f134185k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f134186l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f134187m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f134188n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f134189p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ nc2.b.OnFilesPicked f134190q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ y f134191r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f134192s;

            /* JADX INFO: renamed from: nc2.y$j$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lzz/h;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
            static final class C3333a extends vq.k implements er.p<ju.p0, tq.e<? super List<? extends zz.h>>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f134193e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f134194f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ nc2.b.OnFilesPicked f134195g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ ex.b<dx.b> f134196h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ y f134197j;

                /* JADX INFO: renamed from: nc2.y$j$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lzz/h;", "<anonymous>", "(Lju/p0;)Lzz/h;"}, k = 3, mv = {2, 2, 0})
                static final class C3334a extends vq.k implements er.p<ju.p0, tq.e<? super zz.h>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f134198e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    int f134199f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ ex.b<dx.b> f134200g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ y f134201h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    final /* synthetic */ wx.i f134202j;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C3334a(ex.b<? super dx.b> bVar, y yVar, wx.i iVar, tq.e<? super C3334a> eVar) {
                        super(2, eVar);
                        this.f134200g = bVar;
                        this.f134201h = yVar;
                        this.f134202j = iVar;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        ex.b<dx.b> bVar;
                        Object objE = uq.b.e();
                        int i15 = this.f134199f;
                        if (i15 == 0) {
                            oq.u.b(obj);
                            ex.b<dx.b> bVar2 = this.f134200g;
                            a00.b bVar3 = this.f134201h.pickedFileToAndroidMapper;
                            a00.b.Params params = new a00.b.Params(this.f134202j);
                            this.f134198e = bVar2;
                            this.f134199f = 1;
                            Object objA = bVar3.a(params, this);
                            if (objA == objE) {
                                return objE;
                            }
                            bVar = bVar2;
                            obj = objA;
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) this.f134198e;
                            oq.u.b(obj);
                        }
                        return bVar.a((dx.i) obj);
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(ju.p0 p0Var, tq.e<? super zz.h> eVar) {
                        return ((C3334a) v(p0Var, eVar)).J(i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                        return new C3334a(this.f134200g, this.f134201h, this.f134202j, eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C3333a(nc2.b.OnFilesPicked onFilesPicked, ex.b<? super dx.b> bVar, y yVar, tq.e<? super C3333a> eVar) {
                    super(2, eVar);
                    this.f134195g = onFilesPicked;
                    this.f134196h = bVar;
                    this.f134197j = yVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    ju.p0 p0Var = (ju.p0) this.f134194f;
                    Object objE = uq.b.e();
                    int i15 = this.f134193e;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                        return obj;
                    }
                    oq.u.b(obj);
                    List<wx.i> listB = this.f134195g.b();
                    ex.b<dx.b> bVar = this.f134196h;
                    y yVar = this.f134197j;
                    ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ju.k.b(p0Var, null, null, new C3334a(bVar, yVar, (wx.i) it.next(), null), 3, null));
                    }
                    this.f134194f = vq.j.a(p0Var);
                    this.f134193e = 1;
                    Object objA = ju.f.a(arrayList, this);
                    return objA == objE ? objE : objA;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super List<? extends zz.h>> eVar) {
                    return ((C3333a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    C3333a c3333a = new C3333a(this.f134195g, this.f134196h, this.f134197j, eVar);
                    c3333a.f134194f = obj;
                    return c3333a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(nc2.b.OnFilesPicked onFilesPicked, y yVar, k10.c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f134190q = onFilesPicked;
                this.f134191r = yVar;
                this.f134192s = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(hz.b bVar, List list, State state) {
                State.FieldData fieldDataB = State.FieldData.b(state.d(), null, bVar, 1, null);
                List<zz.h> listE = state.e();
                listE.addAll(list);
                i0 i0Var = i0.f148189a;
                return State.b(state, null, fieldDataB, listE, false, 9, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v17 */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objB;
                Object left;
                final hz.b validationState;
                Object objE = uq.b.e();
                ?? r15 = this.f134189p;
                try {
                    try {
                        if (r15 == 0) {
                            oq.u.b(obj);
                            nc2.b.OnFilesPicked onFilesPicked = this.f134190q;
                            y yVar = this.f134191r;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                C3333a c3333a = new C3333a(onFilesPicked, aVar, yVar, null);
                                this.f134185k = jVarA;
                                this.f134186l = vq.j.a(aVar);
                                this.f134187m = vq.j.a(aVar);
                                this.f134180e = 0;
                                this.f134181f = 0;
                                this.f134182g = 0;
                                this.f134183h = 0;
                                this.f134184j = 0;
                                this.f134189p = 1;
                                obj = q0.e(c3333a, this);
                                if (obj != objE) {
                                }
                            } catch (ex.c e15) {
                                e = e15;
                                left = new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                dx.i iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                left = new dx.i.Left(objB);
                            }
                            return objE;
                        }
                        if (r15 != 1) {
                            if (r15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            k10.l lVar = (k10.l) this.f134187m;
                            oq.u.b(obj);
                            return lVar;
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                        left = new dx.i.Right((List) obj);
                    } catch (Exception e25) {
                        e = e25;
                    }
                    k10.c0<State> c0Var = this.f134192s;
                    y yVar2 = this.f134191r;
                    nc2.b.OnFilesPicked onFilesPicked2 = this.f134190q;
                    if (!(left instanceof dx.i.Left)) {
                        if (!(left instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        final List list = (List) ((dx.i.Right) left).b();
                        yVar2.accessibilityTalkBackManager.a(c70.a.f23835a.a().q0().getText());
                        State.FieldData<String> fieldDataD = c0Var.a().d();
                        State.FieldData<String> fieldData = fieldDataD.d().length() > 0 ? fieldDataD : null;
                        if (fieldData == null || (validationState = fieldData.getValidationState()) == null) {
                            validationState = hz.b.d.f86848c;
                        }
                        return c0Var.b(new er.l() { // from class: nc2.a0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return y.j.a.V(validationState, list, (State) obj2);
                            }
                        });
                    }
                    dx.b bVar = (dx.b) ((dx.i.Left) left).b();
                    Object objC = c0Var.c();
                    nc2.b.OnPickerActionSelected fromAction = onFilesPicked2.getFromAction();
                    this.f134185k = vq.j.a(left);
                    this.f134186l = vq.j.a(bVar);
                    this.f134187m = objC;
                    this.f134188n = vq.j.a(objC);
                    this.f134180e = 0;
                    this.f134181f = 0;
                    this.f134182g = 0;
                    this.f134189p = 2;
                    if (yVar2.G9(bVar, fromAction, this) != objE) {
                        return objC;
                    }
                    return objE;
                } catch (CancellationException e26) {
                    throw e26;
                }
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f134190q, this.f134191r, this.f134192s, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nc2.b.OnFilesPicked onFilesPicked = (nc2.b.OnFilesPicked) this.f134177f;
            k10.c0 c0Var = (k10.c0) this.f134178g;
            Object objE = uq.b.e();
            int i15 = this.f134176e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            if (onFilesPicked.b().isEmpty()) {
                return c0Var.c();
            }
            ac4.a aVar = y.this.callActionWithLoaderUseCase;
            a aVar2 = new a(onFilesPicked, y.this, c0Var, null);
            this.f134177f = vq.j.a(onFilesPicked);
            this.f134178g = vq.j.a(c0Var);
            this.f134176e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nc2.b.OnFilesPicked onFilesPicked, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = y.this.new j(eVar);
            jVar.f134177f = onFilesPicked;
            jVar.f134178g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnc2/b$j;", "action", "Lnc2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnc2/b$j;Lnc2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<nc2.b.OnImageClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134204f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nc2.b.OnImageClick onImageClick = (nc2.b.OnImageClick) this.f134204f;
            Object objE = uq.b.e();
            int i15 = this.f134203e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<nc2.b.InterfaceC3327b> bVarY1 = y.this.Y1();
                nc2.b.InterfaceC3327b.ShowImagePreview showImagePreview = new nc2.b.InterfaceC3327b.ShowImagePreview(onImageClick.getData());
                this.f134204f = vq.j.a(onImageClick);
                this.f134203e = 1;
                if (bVarY1.F(showImagePreview, this) == objE) {
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
        public final Object w(nc2.b.OnImageClick onImageClick, State state, tq.e<? super i0> eVar) {
            k kVar = y.this.new k(eVar);
            kVar.f134204f = onImageClick;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnc2/b$f;", "action", "Lk10/c0;", "Lnc2/c;", "state", "Lk10/l;", "<anonymous>", "(Lnc2/b$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<nc2.b.OnDeleteFile, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134208g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(nc2.b.OnDeleteFile onDeleteFile, State state) {
            List<zz.h> listE = state.e();
            listE.remove(onDeleteFile.getFile());
            i0 i0Var = i0.f148189a;
            return State.b(state, null, null, listE, false, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nc2.b.OnDeleteFile onDeleteFile = (nc2.b.OnDeleteFile) this.f134207f;
            k10.c0 c0Var = (k10.c0) this.f134208g;
            uq.b.e();
            if (this.f134206e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nc2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.l.O(onDeleteFile, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nc2.b.OnDeleteFile onDeleteFile, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = new l(eVar);
            lVar.f134207f = onDeleteFile;
            lVar.f134208g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnc2/b$g;", "action", "Lk10/c0;", "Lnc2/c;", "state", "Lk10/l;", "<anonymous>", "(Lnc2/b$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<nc2.b.OnDescriptionChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134211g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(nc2.b.OnDescriptionChanged onDescriptionChanged, hz.g gVar, State state) {
            return State.b(state, null, new State.FieldData(onDescriptionChanged.getDescription(), gVar.a()), null, false, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nc2.b.OnDescriptionChanged onDescriptionChanged = (nc2.b.OnDescriptionChanged) this.f134210f;
            k10.c0 c0Var = (k10.c0) this.f134211g;
            Object objE = uq.b.e();
            int i15 = this.f134209e;
            if (i15 == 0) {
                oq.u.b(obj);
                tb2.e eVar = y.this.validateDescriptionContentUC;
                tb2.e.Params params = new tb2.e.Params(onDescriptionChanged.getDescription(), false, false);
                this.f134210f = onDescriptionChanged;
                this.f134211g = c0Var;
                this.f134209e = 1;
                obj = eVar.k(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final hz.g gVar = (hz.g) obj;
            return c0Var.b(new er.l() { // from class: nc2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.m.O(onDescriptionChanged, gVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nc2.b.OnDescriptionChanged onDescriptionChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = y.this.new m(eVar);
            mVar.f134210f = onDescriptionChanged;
            mVar.f134211g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnc2/b$d;", "action", "Lk10/c0;", "Lnc2/c;", "state", "Lk10/l;", "<anonymous>", "(Lnc2/b$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<nc2.b.OnBottomSheetStateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f134215g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(nc2.b.OnBottomSheetStateChanged onBottomSheetStateChanged, State state) {
            return State.b(state, onBottomSheetStateChanged.getValue(), null, null, false, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final nc2.b.OnBottomSheetStateChanged onBottomSheetStateChanged = (nc2.b.OnBottomSheetStateChanged) this.f134214f;
            k10.c0 c0Var = (k10.c0) this.f134215g;
            uq.b.e();
            if (this.f134213e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: nc2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.n.O(onBottomSheetStateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nc2.b.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f134214f = onBottomSheetStateChanged;
            nVar.f134215g = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lnc2/b$k;", "<unused var>", "Lk10/c0;", "Lnc2/c;", "state", "Lk10/l;", "<anonymous>", "(Lnc2/b$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<nc2.b.k, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f134216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f134217f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, State.FieldData.b(state.d(), null, gVar.a(), 1, null), null, true, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f134217f;
            Object objE = uq.b.e();
            int i15 = this.f134216e;
            if (i15 == 0) {
                oq.u.b(obj);
                tb2.e eVar = y.this.validateDescriptionContentUC;
                tb2.e.Params params = new tb2.e.Params(((State) c0Var.a()).d().d(), true, true);
                this.f134217f = c0Var;
                this.f134216e = 1;
                obj = eVar.k(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            y yVar = y.this;
            final hz.g gVar = (hz.g) obj;
            if (!(gVar instanceof hz.g.b)) {
                return c0Var.b(new er.l() { // from class: nc2.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.o.O(gVar, (State) obj2);
                    }
                });
            }
            k10.l lVarC = c0Var.c();
            oc2.a aVar = yVar.contract;
            String strD = ((State) c0Var.a()).d().d();
            List<zz.h> listE = ((State) c0Var.a()).e();
            ArrayList arrayList = new ArrayList(pq.v.y(listE, 10));
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(((zz.h) it.next()).getFile());
            }
            aVar.W6(new IdCardInvalidationTheftDescription(strD, arrayList));
            yVar.d9(nc2.b.i.f134042a);
            return lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(nc2.b.k kVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = y.this.new o(eVar);
            oVar.f134217f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f134219d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f134220e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134222g;

        p(tq.e<? super p> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f134220e = obj;
            this.f134222g |= PKIFailureInfo.systemUnavail;
            return y.this.T9(null, this);
        }
    }

    public y(yy.a aVar, pc2.k kVar, pc2.d dVar, bc4.k kVar2, tb2.a aVar2, bc4.j jVar, bc4.h hVar, ac4.a aVar3, a00.b bVar, tb2.e eVar, a14.m mVar, yw.b bVar2, pb2.a aVar4, oc2.a aVar5) {
        this.mapper = kVar;
        this.filePickerErrorMapper = dVar;
        this.takePhotoWithSizeValidationUseCase = kVar2;
        this.generateNewCameraPhotoNameUC = aVar2;
        this.pickMultiplePhotosFromGalleryUseCase = jVar;
        this.pickFileUseCase = hVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.pickedFileToAndroidMapper = bVar;
        this.validateDescriptionContentUC = eVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar2;
        this.createContactDetailsFormDataUC = aVar4;
        this.contract = aVar5;
        State state = new State(null, null, null, false, 15, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: nc2.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.R9(this.f134107a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), J9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G9(dx.b bVar, final nc2.b.OnPickerActionSelected onPickerActionSelected, tq.e<? super i0> eVar) {
        pc2.d.a fileOrPhotoPicker;
        Object showError;
        pc2.d dVar = this.filePickerErrorMapper;
        boolean z15 = onPickerActionSelected.getPickerAction() == nc2.a.TAKE_PHOTO;
        if (z15) {
            fileOrPhotoPicker = new pc2.d.a.Camera(bVar, new er.a() { // from class: nc2.u
                @Override // er.a
                public final Object a() {
                    return y.H9(this.f134103a, onPickerActionSelected);
                }
            }, b9(nc2.b.a.f134028a));
        } else {
            if (z15) {
                throw new oq.p();
            }
            fileOrPhotoPicker = new pc2.d.a.FileOrPhotoPicker(bVar, new er.a() { // from class: nc2.v
                @Override // er.a
                public final Object a() {
                    return y.I9(this.f134105a, onPickerActionSelected);
                }
            });
        }
        pc2.d.b bVarB = dVar.b(fileOrPhotoPicker);
        if (bVarB == null) {
            return null;
        }
        if (bVarB instanceof pc2.d.b.Dialog) {
            showError = new nc2.b.InterfaceC3327b.ShowDialog(((pc2.d.b.Dialog) bVarB).getData());
        } else {
            if (!(bVarB instanceof pc2.d.b.FullPage)) {
                throw new oq.p();
            }
            showError = new nc2.b.InterfaceC3327b.ShowError(((pc2.d.b.FullPage) bVarB).getData());
        }
        Object objF = F(showError, eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(y yVar, nc2.b.OnPickerActionSelected onPickerActionSelected) {
        yVar.d9(onPickerActionSelected);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(y yVar, nc2.b.OnPickerActionSelected onPickerActionSelected) {
        yVar.d9(onPickerActionSelected);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nc2.d.Data J9(State state) {
        return this.mapper.b(new pc2.k.Params(state, new er.l() { // from class: nc2.o
            @Override // er.l
            public final Object b(Object obj) {
                return y.K9(this.f134097a, (a) obj);
            }
        }, new er.l() { // from class: nc2.p
            @Override // er.l
            public final Object b(Object obj) {
                return y.L9(this.f134098a, (dx3.a) obj);
            }
        }, new er.l() { // from class: nc2.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.M9(this.f134099a, (zz.h) obj);
            }
        }, new er.l() { // from class: nc2.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.N9(this.f134100a, (String) obj);
            }
        }, new er.l() { // from class: nc2.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.O9(this.f134101a, (g30.v) obj);
            }
        }, b9(nc2.b.k.f134044a), b9(nc2.b.c.f134035a), b9(nc2.b.m.f134046a), b9(nc2.b.e.f134037a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(y yVar, nc2.a aVar) {
        yVar.d9(new nc2.b.OnPickerActionSelected(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(y yVar, dx3.a aVar) {
        yVar.d9(new nc2.b.OnImageClick(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(y yVar, zz.h hVar) {
        yVar.d9(new nc2.b.OnDeleteFile(hVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(y yVar, String str) {
        yVar.d9(new nc2.b.OnDescriptionChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(y yVar, g30.v vVar) {
        yVar.d9(new nc2.b.OnBottomSheetStateChanged(vVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P9(k10.c0<State> c0Var, IdCardInvalidationTheftDescription idCardInvalidationTheftDescription, tq.e<? super k10.l<State>> eVar) {
        return q0.e(new a(idCardInvalidationTheftDescription, c0Var, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(final y yVar, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: nc2.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.S9(this.f134102a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(y yVar, k10.z zVar) {
        zVar.A(yVar.new g(null));
        h hVar = yVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(nc2.b.a.class), oVar, hVar);
        zVar.x(fr.q0.c(nc2.b.OnPickerActionSelected.class), oVar, yVar.new i(null));
        zVar.v(fr.q0.c(nc2.b.OnFilesPicked.class), oVar, yVar.new j(null));
        zVar.x(fr.q0.c(nc2.b.OnImageClick.class), oVar, yVar.new k(null));
        zVar.v(fr.q0.c(nc2.b.OnDeleteFile.class), oVar, new l(null));
        zVar.v(fr.q0.c(nc2.b.OnDescriptionChanged.class), oVar, yVar.new m(null));
        zVar.v(fr.q0.c(nc2.b.OnBottomSheetStateChanged.class), oVar, new n(null));
        zVar.v(fr.q0.c(nc2.b.k.class), oVar, yVar.new o(null));
        zVar.x(fr.q0.c(nc2.b.i.class), oVar, yVar.new c(null));
        zVar.x(fr.q0.c(nc2.b.c.class), oVar, yVar.new d(null));
        zVar.v(fr.q0.c(nc2.b.m.class), oVar, new e(null));
        zVar.x(fr.q0.c(nc2.b.e.class), oVar, yVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T9(wx.i iVar, tq.e<? super zz.h> eVar) throws Throwable {
        p pVar;
        if (eVar instanceof p) {
            pVar = (p) eVar;
            int i15 = pVar.f134222g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                pVar.f134222g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                pVar = new p(eVar);
            }
        } else {
            pVar = new p(eVar);
        }
        Object objA = pVar.f134220e;
        Object objE = uq.b.e();
        int i16 = pVar.f134222g;
        if (i16 == 0) {
            oq.u.b(objA);
            a00.b bVar = this.pickedFileToAndroidMapper;
            a00.b.Params params = new a00.b.Params(iVar);
            pVar.f134219d = vq.j.a(iVar);
            pVar.f134222g = 1;
            objA = bVar.a(params, pVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objA);
        }
        return ((dx.i) objA).a();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(nc2.b.InterfaceC3327b interfaceC3327b, tq.e<? super i0> eVar) {
        return super.F(interfaceC3327b, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oc2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<nc2.b.InterfaceC3327b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, nc2.b> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<nc2.d.Data> getState() {
        return this.state;
    }
}
