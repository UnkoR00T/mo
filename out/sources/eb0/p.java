package eb0;

import cf0.AsyncDocumentToGenerate;
import cf0.AsyncErrorResponse;
import fr.q0;
import k10.c0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p031db0.DocumentLoaderEntryData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bk\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030A8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010 \u001a\b\u0012\u0004\u0012\u00020!0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Leb0/p;", "Ll00/g;", "Leb0/b;", "Leb0/a;", "Leb0/c;", "", "Lyy/a;", "stateMachineFactory", "Leb0/d;", "mapper", "Lcb4/j;", "dialogVMSFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Ldf0/j;", "observeDocumentToGenerateUC", "Ldf0/q;", "terminateDocumentDownloadUC", "Leg0/o;", "isDocumentAddedByIDUC", "Lmx/c;", "labelProvider", "Ldf0/c;", "deleteDocumentToGenerateUC", "Li70/e;", "snackBarManager", "Ldb0/d;", "setupData", "<init>", "(Lyy/a;Leb0/d;Lcb4/j;Lhb4/d;Lib4/c;Ldf0/j;Ldf0/q;Leg0/o;Lmx/c;Ldf0/c;Li70/e;Ldb0/d;)V", "state", "Leb0/c$a;", "x9", "(Leb0/b;)Leb0/c$a;", "b", "Leb0/d;", "c", "Lcb4/j;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Ldf0/j;", "g", "Ldf0/q;", "h", "Leg0/o;", "j", "Lmx/c;", "k", "Ldf0/c;", "l", "Li70/e;", "m", "Ldb0/d;", "Lxw/b;", "Leb0/a$c;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "documentloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<eb0.b, eb0.a> implements eb0.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eb0.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final df0.j observeDocumentToGenerateUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final df0.q terminateDocumentDownloadUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final eg0.o isDocumentAddedByIDUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final df0.c deleteDocumentToGenerateUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i70.e snackBarManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final DocumentLoaderEntryData setupData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<eb0.b, eb0.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<eb0.a.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<eb0.c.a> state = a9(new a(e9().getState(), this), x9(new eb0.b.Observing(false, null, null, 7, null)));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<eb0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f49144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f49145b;

        /* JADX INFO: renamed from: eb0.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1158a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f49146a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f49147b;

            /* JADX INFO: renamed from: eb0.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1159a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49148d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49149e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49150f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49152h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49153j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49154k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49155l;

                public C1159a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49148d = obj;
                    this.f49149e |= PKIFailureInfo.systemUnavail;
                    return C1158a.this.F(null, this);
                }
            }

            public C1158a(mu.h hVar, p pVar) {
                this.f49146a = hVar;
                this.f49147b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1159a c1159a;
                if (eVar instanceof C1159a) {
                    c1159a = (C1159a) eVar;
                    int i15 = c1159a.f49149e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1159a.f49149e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1159a = new C1159a(eVar);
                    }
                } else {
                    c1159a = new C1159a(eVar);
                }
                Object obj2 = c1159a.f49148d;
                Object objE = uq.b.e();
                int i16 = c1159a.f49149e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f49146a;
                    eb0.c.a aVarX9 = this.f49147b.x9((eb0.b) obj);
                    c1159a.f49150f = vq.j.a(obj);
                    c1159a.f49152h = vq.j.a(c1159a);
                    c1159a.f49153j = vq.j.a(obj);
                    c1159a.f49154k = vq.j.a(hVar);
                    c1159a.f49155l = 0;
                    c1159a.f49149e = 1;
                    if (hVar.F(aVarX9, c1159a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f49144a = gVar;
            this.f49145b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super eb0.c.a> hVar, tq.e eVar) {
            Object objA = this.f49144a.a(new C1158a(hVar, this.f49145b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcf0/b;", "documentInfo", "Lk10/c0;", "Leb0/b$b;", "state", "Lk10/l;", "Leb0/b;", "<anonymous>", "(Lcf0/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<AsyncDocumentToGenerate, c0<eb0.b.Observing>, tq.e<? super k10.l<? extends eb0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49158g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f49161b;

            static {
                int[] iArr = new int[cf0.c.values().length];
                try {
                    iArr[cf0.c.JUNIOR_STUDENT_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[cf0.c.DRIVING_LICENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[cf0.c.FAMILY_CARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[cf0.c.UUT_CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f49160a = iArr;
                int[] iArr2 = new int[cf0.a.values().length];
                try {
                    iArr2[cf0.a.TAKES_TOO_LONG.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[cf0.a.ALREADY_DOWNLOADED.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[cf0.a.CREATING_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[cf0.a.NOT_READY.ordinal()] = 4;
                } catch (NoSuchFieldError unused9) {
                }
                f49161b = iArr2;
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eb0.b.Observing Z(AsyncDocumentToGenerate asyncDocumentToGenerate, eb0.b.Observing observing) {
            return eb0.b.Observing.b(observing, true, null, asyncDocumentToGenerate.getDocumentType(), 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eb0.b.Observing a0(AsyncDocumentToGenerate asyncDocumentToGenerate, eb0.b.Observing observing) {
            return eb0.b.Observing.b(observing, false, null, asyncDocumentToGenerate.getDocumentType(), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eb0.b.Error b0(final p pVar, AsyncDocumentToGenerate asyncDocumentToGenerate, eb0.b.Observing observing) {
            Label labelC;
            Label labelC2;
            String message;
            String title;
            hb4.d dVar = pVar.errorVMSFactory;
            ib4.c cVar = pVar.genericDomainErrorMapper;
            AsyncErrorResponse asyncErrorResponse = asyncDocumentToGenerate.getAsyncErrorResponse();
            if (asyncErrorResponse == null || (title = asyncErrorResponse.getTitle()) == null || (labelC = mx.b.b(title, "")) == null) {
                labelC = pVar.labelProvider.c(cb0.a.f24867g);
            }
            Label label = labelC;
            AsyncErrorResponse asyncErrorResponse2 = asyncDocumentToGenerate.getAsyncErrorResponse();
            if (asyncErrorResponse2 == null || (message = asyncErrorResponse2.getMessage()) == null || (labelC2 = mx.b.b(message, "")) == null) {
                labelC2 = Label.INSTANCE.c();
            }
            return new eb0.b.Error(dVar.a(cVar.b(new ib4.c.Params(new dx.b.Business(null, null, label, labelC2, null, pVar.labelProvider.c(cb0.a.f24863c), null, 83, null), false, new er.l() { // from class: eb0.u
                @Override // er.l
                public final Object b(Object obj) {
                    return p.b.c0(pVar, (ib4.c.b) obj);
                }
            }, 2, null))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 c0(p pVar, ib4.c.b bVar) {
            pVar.d9(eb0.a.C1153a.f49092a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eb0.b.Observing d0(AsyncDocumentToGenerate asyncDocumentToGenerate, eb0.b.Observing observing) {
            return eb0.b.Observing.b(observing, false, null, asyncDocumentToGenerate.getDocumentType(), 3, null);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x02fb  */
        /* JADX WARN: Code duplicated, block: B:105:0x031b  */
        /* JADX WARN: Code duplicated, block: B:35:0x009f  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x00c8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x00ca A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x00cc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:50:0x011b  */
        /* JADX WARN: Code duplicated, block: B:53:0x013e  */
        /* JADX WARN: Code duplicated, block: B:56:0x0161  */
        /* JADX WARN: Code duplicated, block: B:68:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:69:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:71:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:74:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:77:0x020f  */
        /* JADX WARN: Code duplicated, block: B:79:0x0223 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:80:0x0225 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:81:0x0227 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:82:0x0229 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:83:0x022b  */
        /* JADX WARN: Code duplicated, block: B:86:0x0254  */
        /* JADX WARN: Code duplicated, block: B:88:0x025a  */
        /* JADX WARN: Code duplicated, block: B:91:0x0283  */
        /* JADX WARN: Code duplicated, block: B:94:0x02ab  */
        /* JADX WARN: Code duplicated, block: B:97:0x02d3  */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0313, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x013a, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x015d, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0180, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0250, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x027f, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x02a8, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x02d0, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x02f8, code lost:
        
            if (r11.F(r3, r10) == r2) goto L102;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 836
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: eb0.p.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object w(AsyncDocumentToGenerate asyncDocumentToGenerate, c0<eb0.b.Observing> c0Var, tq.e<? super k10.l<? extends eb0.b>> eVar) {
            b bVar = p.this.new b(eVar);
            bVar.f49157f = asyncDocumentToGenerate;
            bVar.f49158g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leb0/a$a;", "<unused var>", "Leb0/b$b;", "Loq/i0;", "<anonymous>", "(Leb0/a$a;Leb0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<eb0.a.C1153a, eb0.b.Observing, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49162e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49162e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eb0.a.c> bVarY1 = p.this.Y1();
                eb0.a.c.C1154a c1154a = eb0.a.c.C1154a.f49094a;
                this.f49162e = 1;
                if (bVarY1.F(c1154a, this) == objE) {
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
        public final Object w(eb0.a.C1153a c1153a, eb0.b.Observing observing, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leb0/a$e;", "<unused var>", "Lk10/c0;", "Leb0/b$b;", "state", "Lk10/l;", "Leb0/b;", "<anonymous>", "(Leb0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<eb0.a.e, c0<eb0.b.Observing>, tq.e<? super k10.l<? extends eb0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49165f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eb0.b.Observing O(eb0.b.Observing observing) {
            return eb0.b.Observing.b(observing, false, null, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49165f;
            Object objE = uq.b.e();
            int i15 = this.f49164e;
            if (i15 == 0) {
                oq.u.b(obj);
                df0.q qVar = p.this.terminateDocumentDownloadUC;
                df0.q.Params params = new df0.q.Params(p.this.setupData.getId());
                this.f49165f = c0Var;
                this.f49164e = 1;
                if (qVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: eb0.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O((b.Observing) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eb0.a.e eVar, c0<eb0.b.Observing> c0Var, tq.e<? super k10.l<? extends eb0.b>> eVar2) {
            d dVar = p.this.new d(eVar2);
            dVar.f49165f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leb0/a$d;", "<unused var>", "Lk10/c0;", "Leb0/b$b;", "state", "Lk10/l;", "Leb0/b;", "<anonymous>", "(Leb0/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<eb0.a.d, c0<eb0.b.Observing>, tq.e<? super k10.l<? extends eb0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49168f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eb0.b.Observing O(p pVar, eb0.b.Observing observing) {
            return eb0.b.Observing.b(observing, false, pVar.dialogVMSFactory.a(pVar.mapper.f(pVar.b9(eb0.a.e.f49101a), pVar.b9(eb0.a.b.f49093a))), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49168f;
            uq.b.e();
            if (this.f49167e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.b(new er.l() { // from class: eb0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(pVar, (b.Observing) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eb0.a.d dVar, c0<eb0.b.Observing> c0Var, tq.e<? super k10.l<? extends eb0.b>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f49168f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Leb0/a$b;", "<unused var>", "Lk10/c0;", "Leb0/b$b;", "state", "Lk10/l;", "Leb0/b;", "<anonymous>", "(Leb0/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<eb0.a.b, c0<eb0.b.Observing>, tq.e<? super k10.l<? extends eb0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49171f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eb0.b.Observing O(eb0.b.Observing observing) {
            return eb0.b.Observing.b(observing, false, null, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49171f;
            uq.b.e();
            if (this.f49170e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: eb0.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.f.O((b.Observing) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(eb0.a.b bVar, c0<eb0.b.Observing> c0Var, tq.e<? super k10.l<? extends eb0.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f49171f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leb0/b$a;", "it", "Loq/i0;", "<anonymous>", "(Leb0/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<eb0.b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49172e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49172e;
            if (i15 == 0) {
                oq.u.b(obj);
                df0.c cVar = p.this.deleteDocumentToGenerateUC;
                df0.c.Params params = new df0.c.Params(p.this.setupData.getId());
                this.f49172e = 1;
                if (cVar.c(params, this) == objE) {
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
        public final Object B(eb0.b.Error error, tq.e<? super i0> eVar) {
            return ((g) v(error, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leb0/a$a;", "<unused var>", "Leb0/b$a;", "Loq/i0;", "<anonymous>", "(Leb0/a$a;Leb0/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<eb0.a.C1153a, eb0.b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49174e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49174e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eb0.a.c> bVarY1 = p.this.Y1();
                eb0.a.c.C1154a c1154a = eb0.a.c.C1154a.f49094a;
                this.f49174e = 1;
                if (bVarY1.F(c1154a, this) == objE) {
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
        public final Object w(eb0.a.C1153a c1153a, eb0.b.Error error, tq.e<? super i0> eVar) {
            return p.this.new h(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, eb0.d dVar, cb4.j jVar, hb4.d dVar2, ib4.c cVar, df0.j jVar2, df0.q qVar, eg0.o oVar, mx.c cVar2, df0.c cVar3, i70.e eVar, DocumentLoaderEntryData documentLoaderEntryData) {
        this.mapper = dVar;
        this.dialogVMSFactory = jVar;
        this.errorVMSFactory = dVar2;
        this.genericDomainErrorMapper = cVar;
        this.observeDocumentToGenerateUC = jVar2;
        this.terminateDocumentDownloadUC = qVar;
        this.isDocumentAddedByIDUC = oVar;
        this.labelProvider = cVar2;
        this.deleteDocumentToGenerateUC = cVar3;
        this.snackBarManager = eVar;
        this.setupData = documentLoaderEntryData;
        this.stateMachine = aVar.a(new eb0.b.Observing(false, null, null, 7, null), new er.l() { // from class: eb0.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f49129a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final p pVar, k10.z zVar) {
        k10.k.l(zVar, new er.l() { // from class: eb0.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f49128a, (b.Observing) obj);
            }
        }, null, pVar.new b(null), 2, null);
        c cVar = pVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(eb0.a.C1153a.class), oVar, cVar);
        zVar.v(q0.c(eb0.a.e.class), oVar, pVar.new d(null));
        zVar.v(q0.c(eb0.a.d.class), oVar, pVar.new e(null));
        zVar.v(q0.c(eb0.a.b.class), oVar, new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g B9(p pVar, eb0.b.Observing observing) {
        return (mu.g) pVar.observeDocumentToGenerateUC.a(new df0.j.Params(pVar.setupData.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, k10.z zVar) {
        zVar.C(pVar.new g(null));
        h hVar = pVar.new h(null);
        zVar.x(q0.c(eb0.a.C1153a.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eb0.c.a x9(eb0.b state) {
        return this.mapper.b(new eb0.d.Params(state, b9(eb0.a.d.f49100a), b9(eb0.a.C1153a.f49092a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(eb0.b.Observing.class), new er.l() { // from class: eb0.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f49126a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(eb0.b.Error.class), new er.l() { // from class: eb0.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f49127a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<eb0.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<eb0.b, eb0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<eb0.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DocumentLoaderEntryData documentLoaderEntryData) {
        super.P5(documentLoaderEntryData);
    }
}
