package we0;

import android.graphics.Bitmap;
import f00.j0;
import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pe0.DocumentPhotoData;
import ye0.SecondDocumentInfo;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001KBS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010!\u001a\u00020 *\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010C\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lwe0/v;", "Ll00/g;", "Lwe0/b;", "Lwe0/a;", "Lwe0/c;", "", "Lyy/a;", "stateMachineFactory", "Lxe0/e;", "mapper", "Lxe0/d;", "errorMapper", "Lb00/c;", "imageConverter", "Lre0/g;", "verifyUserDataUC", "Lre0/b;", "getVerificationStatusUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lwe0/d;", "setupContract", "<init>", "(Lyy/a;Lxe0/e;Lxe0/d;Lb00/c;Lre0/g;Lre0/b;Lac4/a;Lhb4/d;Lwe0/d;)V", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "goToQrScanner", "Ljb4/b;", "v9", "(Ldx/b;Ler/a;Ler/a;Ler/a;)Ljb4/b;", "b", "Lxe0/e;", "c", "Lxe0/d;", "d", "Lb00/c;", "e", "Lre0/g;", "f", "Lre0/b;", "g", "Lac4/a;", "h", "Lhb4/d;", "j", "Lwe0/d;", "Lwe0/b$b;", "k", "Lwe0/b$b;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwe0/a$e;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lwe0/c$a;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<we0.b, we0.a> implements we0.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xe0.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xe0.d errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final re0.g verifyUserDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final re0.b getVerificationStatusUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final we0.d setupContract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final we0.b.Initial initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<we0.b, we0.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<we0.a.e> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<we0.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwe0/v$a;", "Lf00/j0;", "Lwe0/d;", "Lwe0/v;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<we0.d, v> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<we0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f212633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f212634b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f212635a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f212636b;

            /* JADX INFO: renamed from: we0.v$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5613a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f212637d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f212638e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f212639f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f212641h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f212642j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f212643k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f212644l;

                public C5613a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f212637d = obj;
                    this.f212638e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f212635a = hVar;
                this.f212636b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5613a c5613a;
                if (eVar instanceof C5613a) {
                    c5613a = (C5613a) eVar;
                    int i15 = c5613a.f212638e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5613a.f212638e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5613a = new C5613a(eVar);
                    }
                } else {
                    c5613a = new C5613a(eVar);
                }
                Object obj2 = c5613a.f212637d;
                Object objE = uq.b.e();
                int i16 = c5613a.f212638e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f212635a;
                    we0.c.a aVarB = this.f212636b.mapper.b(new xe0.e.Params((we0.b) obj, this.f212636b.b9(we0.a.i.f212561a), this.f212636b.b9(we0.a.C5606a.f212549a), this.f212636b.b9(we0.a.b.f212550a)));
                    c5613a.f212639f = vq.j.a(obj);
                    c5613a.f212641h = vq.j.a(c5613a);
                    c5613a.f212642j = vq.j.a(obj);
                    c5613a.f212643k = vq.j.a(hVar);
                    c5613a.f212644l = 0;
                    c5613a.f212638e = 1;
                    if (hVar.F(aVarB, c5613a) == objE) {
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

        public b(mu.g gVar, v vVar) {
            this.f212633a = gVar;
            this.f212634b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super we0.c.a> hVar, tq.e eVar) {
            Object objA = this.f212633a.a(new a(hVar, this.f212634b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwe0/a$b;", "<unused var>", "Lwe0/b;", "Loq/i0;", "<anonymous>", "(Lwe0/a$b;Lwe0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<we0.a.b, we0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212645e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212645e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<we0.a.e> bVarY1 = v.this.Y1();
                we0.a.e.b bVar = we0.a.e.b.f212555a;
                this.f212645e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(we0.a.b bVar, we0.b bVar2, tq.e<? super oq.i0> eVar) {
            return v.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwe0/a$c;", "<unused var>", "Lwe0/b;", "Loq/i0;", "<anonymous>", "(Lwe0/a$c;Lwe0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<we0.a.c, we0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212647e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212647e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<we0.a.e> bVarY1 = v.this.Y1();
                we0.a.e.c cVar = we0.a.e.c.f212556a;
                this.f212647e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(we0.a.c cVar, we0.b bVar, tq.e<? super oq.i0> eVar) {
            return v.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwe0/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lwe0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<we0.b.Initial, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212650f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            we0.b.Initial initial = (we0.b.Initial) this.f212650f;
            uq.b.e();
            if (this.f212649e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean z15 = initial.getDocumentData() == null || initial.getData() == null;
            if (z15) {
                v.this.d9(new we0.a.ShowError(new dx.b.Generic(new Exception("Missing required data for verification process")), we0.a.b.f212550a));
            } else {
                if (z15) {
                    throw new oq.p();
                }
                v.this.d9(new we0.a.LoadUserData(initial.getData(), initial.getDocumentData()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(we0.b.Initial initial, tq.e<? super oq.i0> eVar) {
            return ((e) v(initial, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = v.this.new e(eVar);
            eVar2.f212650f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe0/a$d;", "action", "Lk10/c0;", "Lwe0/b$b;", "state", "Lk10/l;", "Lwe0/b;", "<anonymous>", "(Lwe0/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<we0.a.LoadUserData, k10.c0<we0.b.Initial>, tq.e<? super k10.l<? extends we0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f212653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f212655h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f212656j;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we0.b.c.Initialized O(we0.a.LoadUserData loadUserData, Bitmap bitmap, we0.b.Initial initial) {
            String documentId = loadUserData.getDocumentData().getDocumentId();
            VerificationDataModel data = loadUserData.getData();
            DocumentPhotoData photoData = loadUserData.getDocumentData().getPhotoData();
            SecondDocumentInfo secondDocumentInfo = null;
            if (photoData != null) {
                SecondDocumentInfo secondDocumentInfo2 = new SecondDocumentInfo(photoData.getDocumentId(), photoData.getScopeName());
                if (!fr.t.c(loadUserData.getDocumentData().getDocumentId(), photoData.getDocumentId())) {
                    secondDocumentInfo = secondDocumentInfo2;
                }
            }
            return new we0.b.c.Initialized(new we0.b.c.StateData(documentId, data, bitmap, secondDocumentInfo, loadUserData.getDocumentData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Bitmap bitmap;
            String photo;
            final we0.a.LoadUserData loadUserData = (we0.a.LoadUserData) this.f212655h;
            k10.c0 c0Var = (k10.c0) this.f212656j;
            Object objE = uq.b.e();
            int i15 = this.f212654g;
            if (i15 == 0) {
                oq.u.b(obj);
                DocumentPhotoData photoData = loadUserData.getDocumentData().getPhotoData();
                if (photoData == null || (photo = photoData.getPhoto()) == null) {
                    bitmap = null;
                } else {
                    b00.c cVar = v.this.imageConverter;
                    this.f212655h = loadUserData;
                    this.f212656j = c0Var;
                    this.f212652e = vq.j.a(photo);
                    this.f212653f = 0;
                    this.f212654g = 1;
                    obj = cVar.b(photo, this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return c0Var.d(new er.l() { // from class: we0.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.f.O(loadUserData, bitmap, (b.Initial) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            bitmap = (Bitmap) ((dx.i) obj).a();
            return c0Var.d(new er.l() { // from class: we0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.f.O(loadUserData, bitmap, (b.Initial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we0.a.LoadUserData loadUserData, k10.c0<we0.b.Initial> c0Var, tq.e<? super k10.l<? extends we0.b>> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f212655h = loadUserData;
            fVar.f212656j = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe0/a$h;", "action", "Lk10/c0;", "Lwe0/b$b;", "state", "Lk10/l;", "Lwe0/b;", "<anonymous>", "(Lwe0/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<we0.a.ShowError, k10.c0<we0.b.Initial>, tq.e<? super k10.l<? extends we0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f212660g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we0.b.InitError O(v vVar, we0.a.ShowError showError, we0.b.Initial initial) {
            return new we0.b.InitError(vVar.errorVMSFactory.a(v.w9(vVar, showError.getError(), vVar.b9(showError.getRetryAction()), null, null, 6, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final we0.a.ShowError showError = (we0.a.ShowError) this.f212659f;
            k10.c0 c0Var = (k10.c0) this.f212660g;
            uq.b.e();
            if (this.f212658e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.d(new er.l() { // from class: we0.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.g.O(vVar, showError, (b.Initial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we0.a.ShowError showError, k10.c0<we0.b.Initial> c0Var, tq.e<? super k10.l<? extends we0.b>> eVar) {
            g gVar = v.this.new g(eVar);
            gVar.f212659f = showError;
            gVar.f212660g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwe0/a$a;", "<unused var>", "Lwe0/b$c$c;", "Loq/i0;", "<anonymous>", "(Lwe0/a$a;Lwe0/b$c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<we0.a.C5606a, we0.b.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212662e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f212662e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<we0.a.e> bVarY1 = v.this.Y1();
                we0.a.e.C5607a c5607a = we0.a.e.C5607a.f212554a;
                this.f212662e = 1;
                if (bVarY1.F(c5607a, this) == objE) {
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
        public final Object w(we0.a.C5606a c5606a, we0.b.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return v.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe0/a$i;", "<unused var>", "Lk10/c0;", "Lwe0/b$c$c;", "state", "Lk10/l;", "Lwe0/b;", "<anonymous>", "(Lwe0/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<we0.a.i, k10.c0<we0.b.c.Initialized>, tq.e<? super k10.l<? extends we0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212665f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we0.b.c.VerifyData O(k10.c0 c0Var, we0.b.c.Initialized initialized) {
            return new we0.b.c.VerifyData(we0.b.c.StateData.b(((we0.b.c.Initialized) c0Var.a()).getData(), null, null, null, null, null, 31, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f212665f;
            uq.b.e();
            if (this.f212664e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: we0.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.i.O(c0Var, (b.c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we0.a.i iVar, k10.c0<we0.b.c.Initialized> c0Var, tq.e<? super k10.l<? extends we0.b>> eVar) {
            i iVar2 = new i(eVar);
            iVar2.f212665f = c0Var;
            return iVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwe0/b$c$e;", "state", "Lk10/l;", "Lwe0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<we0.b.c.VerifyData>, tq.e<? super k10.l<? extends we0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212667f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwe0/b$c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends we0.b.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f212669e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f212670f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<we0.b.c.VerifyData> f212671g;

            /* JADX INFO: renamed from: we0.v$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C5614a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f212672a;

                static {
                    int[] iArr = new int[pe0.e.values().length];
                    try {
                        iArr[pe0.e.SCHOOL_CARD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[pe0.e.DRIVING_LICENCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[pe0.e.FAMILY_CARD.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[pe0.e.UUT_CARD.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[pe0.e.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f212672a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<we0.b.c.VerifyData> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f212670f = vVar;
                this.f212671g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final we0.b.c.Error X(k10.c0 c0Var, v vVar, dx.b bVar, we0.b.c.VerifyData verifyData) {
                return new we0.b.c.Error(((we0.b.c.VerifyData) c0Var.a()).getData(), vVar.errorVMSFactory.a(v.w9(vVar, bVar, vVar.b9(we0.a.g.f212558a), null, null, 6, null)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final we0.b.c.CheckVerificationStatus Y(k10.c0 c0Var, we0.b.c.VerifyData verifyData) {
                return new we0.b.c.CheckVerificationStatus(((we0.b.c.VerifyData) c0Var.a()).getData());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                vf0.d dVar;
                Object objE = uq.b.e();
                int i15 = this.f212669e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    re0.g gVar = this.f212670f.verifyUserDataUC;
                    String documentId = this.f212671g.a().getData().getDocumentData().getDocumentId();
                    String scopeName = this.f212671g.a().getData().getDocumentData().getScopeName();
                    int i16 = C5614a.f212672a[this.f212671g.a().getData().getDocumentData().getDocumentType().ordinal()];
                    if (i16 == 1) {
                        dVar = vf0.d.SCHOOL_CARD;
                    } else if (i16 == 2) {
                        dVar = vf0.d.DRIVING_LICENCE;
                    } else if (i16 == 3) {
                        dVar = vf0.d.FAMILY_CARD;
                    } else if (i16 == 4) {
                        dVar = vf0.d.UUT_CARD;
                    } else {
                        if (i16 != 5) {
                            throw new oq.p();
                        }
                        dVar = vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD;
                    }
                    re0.g.Params params = new re0.g.Params(documentId, scopeName, dVar, this.f212671g.a().getData().getData().getQrCodeData(), this.f212671g.a().getData().getData().getVerificationCertificate().getCertificate(), this.f212671g.a().getData().getSecondDocumentInfo(), this.f212671g.a().getData().getDocumentData().getSchemaId());
                    this.f212669e = 1;
                    obj = gVar.d(params, this);
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
                final k10.c0<we0.b.c.VerifyData> c0Var = this.f212671g;
                final v vVar = this.f212670f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: we0.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.j.a.X(c0Var, vVar, bVar, (b.c.VerifyData) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: we0.a0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.j.a.Y(c0Var, (b.c.VerifyData) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f212670f, this.f212671g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends we0.b.c>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f212667f;
            Object objE = uq.b.e();
            int i15 = this.f212666e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(v.this, c0Var, null);
            this.f212667f = vq.j.a(c0Var);
            this.f212666e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<we0.b.c.VerifyData> c0Var, tq.e<? super k10.l<? extends we0.b>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = v.this.new j(eVar);
            jVar.f212667f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwe0/b$c$a;", "state", "Lk10/l;", "Lwe0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<we0.b.c.CheckVerificationStatus>, tq.e<? super k10.l<? extends we0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212674f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwe0/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends we0.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f212676e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f212677f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<we0.b.c.CheckVerificationStatus> f212678g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<we0.b.c.CheckVerificationStatus> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f212677f = vVar;
                this.f212678g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final we0.b.c.Error X(k10.c0 c0Var, v vVar, dx.b bVar, we0.b.c.CheckVerificationStatus checkVerificationStatus) {
                return new we0.b.c.Error(((we0.b.c.CheckVerificationStatus) c0Var.a()).getData(), vVar.errorVMSFactory.a(v.w9(vVar, bVar, vVar.b9(we0.a.f.f212557a), null, null, 6, null)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final we0.b.d Y(we0.b.c.CheckVerificationStatus checkVerificationStatus) {
                return we0.b.d.f212577a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f212676e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    re0.b bVar = this.f212677f.getVerificationStatusUC;
                    re0.b.Params params = new re0.b.Params(this.f212678g.a().getData().getData().getQrCodeData().getSecurityToken());
                    this.f212676e = 1;
                    obj = bVar.g(params, this);
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
                final k10.c0<we0.b.c.CheckVerificationStatus> c0Var = this.f212678g;
                final v vVar = this.f212677f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: we0.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.k.a.X(c0Var, vVar, bVar2, (b.c.CheckVerificationStatus) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: we0.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.k.a.Y((b.c.CheckVerificationStatus) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f212677f, this.f212678g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends we0.b>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f212674f;
            Object objE = uq.b.e();
            int i15 = this.f212673e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(v.this, c0Var, null);
            this.f212674f = vq.j.a(c0Var);
            this.f212673e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<we0.b.c.CheckVerificationStatus> c0Var, tq.e<? super k10.l<? extends we0.b>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f212674f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe0/a$g;", "<unused var>", "Lk10/c0;", "Lwe0/b$c$b;", "state", "Lk10/l;", "Lwe0/b;", "<anonymous>", "(Lwe0/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<we0.a.g, k10.c0<we0.b.c.Error>, tq.e<? super k10.l<? extends we0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212680f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we0.b.c.VerifyData O(k10.c0 c0Var, we0.b.c.Error error) {
            return new we0.b.c.VerifyData(((we0.b.c.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f212680f;
            uq.b.e();
            if (this.f212679e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: we0.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.l.O(c0Var, (b.c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we0.a.g gVar, k10.c0<we0.b.c.Error> c0Var, tq.e<? super k10.l<? extends we0.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f212680f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwe0/a$f;", "<unused var>", "Lk10/c0;", "Lwe0/b$c$b;", "state", "Lk10/l;", "Lwe0/b;", "<anonymous>", "(Lwe0/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<we0.a.f, k10.c0<we0.b.c.Error>, tq.e<? super k10.l<? extends we0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212682f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final we0.b.c.CheckVerificationStatus O(k10.c0 c0Var, we0.b.c.Error error) {
            return new we0.b.c.CheckVerificationStatus(((we0.b.c.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f212682f;
            uq.b.e();
            if (this.f212681e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: we0.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.m.O(c0Var, (b.c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(we0.a.f fVar, k10.c0<we0.b.c.Error> c0Var, tq.e<? super k10.l<? extends we0.b>> eVar) {
            m mVar = new m(eVar);
            mVar.f212682f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    public v(yy.a aVar, xe0.e eVar, xe0.d dVar, b00.c cVar, re0.g gVar, re0.b bVar, ac4.a aVar2, hb4.d dVar2, we0.d dVar3) {
        this.mapper = eVar;
        this.errorMapper = dVar;
        this.imageConverter = cVar;
        this.verifyUserDataUC = gVar;
        this.getVerificationStatusUC = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.errorVMSFactory = dVar2;
        this.setupContract = dVar3;
        we0.b.Initial initial = new we0.b.Initial(dVar3.getData(), dVar3.g0());
        this.initialState = initial;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: we0.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.y9(this.f212620a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), we0.c.a.b.f212582a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(v vVar, k10.z zVar) {
        zVar.C(vVar.new e(null));
        f fVar = vVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(we0.a.LoadUserData.class), oVar, fVar);
        zVar.v(q0.c(we0.a.ShowError.class), oVar, vVar.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(v vVar, k10.z zVar) {
        h hVar = vVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(we0.a.C5606a.class), oVar, hVar);
        zVar.v(q0.c(we0.a.i.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(v vVar, k10.z zVar) {
        zVar.A(vVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(v vVar, k10.z zVar) {
        zVar.A(vVar.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(we0.a.g.class), oVar, lVar);
        zVar.v(q0.c(we0.a.f.class), oVar, new m(null));
        return oq.i0.f148189a;
    }

    private final jb4.b v9(dx.b bVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3) {
        return this.errorMapper.b(new xe0.d.Params(bVar, aVar2, aVar, aVar3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ jb4.b w9(v vVar, dx.b bVar, er.a aVar, er.a aVar2, er.a aVar3, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar2 = vVar.b9(we0.a.b.f212550a);
        }
        if ((i15 & 4) != 0) {
            aVar3 = vVar.b9(we0.a.c.f212551a);
        }
        return vVar.v9(bVar, aVar, aVar2, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(we0.b.class), new er.l() { // from class: we0.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.z9(this.f212615a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(we0.b.Initial.class), new er.l() { // from class: we0.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.A9(this.f212616a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(we0.b.c.Initialized.class), new er.l() { // from class: we0.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.B9(this.f212617a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(we0.b.c.VerifyData.class), new er.l() { // from class: we0.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9(this.f212618a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(we0.b.c.CheckVerificationStatus.class), new er.l() { // from class: we0.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.D9(this.f212619a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(we0.b.c.Error.class), new er.l() { // from class: we0.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.E9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(v vVar, k10.z zVar) {
        c cVar = vVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(we0.a.b.class), oVar, cVar);
        zVar.x(q0.c(we0.a.c.class), oVar, vVar.new d(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<we0.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<we0.b, we0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<we0.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
