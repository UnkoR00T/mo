package pc4;

import cb4.DialogData;
import java.util.concurrent.CancellationException;
import jr0.NipipScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qy2.NipipCardContainerData;
import qy2.NipipCardData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpc4/x6;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/x0;", "getMostImportantUserDocumentDataUseCase", "Lw24/x0;", "getMainDocumentUserDataUC", "Lw24/z0;", "getMidwifeCardDataUC", "Lw24/d1;", "getNurseCardDataUC", "Lq34/a1;", "getPwzNurseCardFromContainerUseCase", "Lw24/k0;", "getDocumentValidityStatusUC", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lk24/a;", "deleteDocumentByIdUC", "Lq34/w;", "deleteDocumentUseCase", "Lj34/d;", "getDocumentDeletionDialogUC", "Lpy2/a;", "a", "(Lc54/b;Lq34/x0;Lw24/x0;Lw24/z0;Lw24/d1;Lq34/a1;Lw24/k0;Lq34/j0;Lk24/a;Lq34/w;Lj34/d;)Lpy2/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x6 f156629a = new x6();

    @Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"pc4/x6$a", "Lpy2/a;", "Ldx/i;", "Ldx/b;", "", "g", "(Ltq/e;)Ljava/lang/Object;", "Lqy2/d$a;", "pwzType", "documentId", "Lqy2/b;", "e", "(Lqy2/d$a;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lqy2/e;", "a", "(Lqy2/d$a;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "(Ljava/lang/String;Lqy2/d$a;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "Lkotlin/Function0;", "onDelete", "Lcb4/d;", "f", "(Lrq0/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements py2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f156630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w24.d1 f156631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w24.z0 f156632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q34.a1 f156633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k24.a f156634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q34.w f156635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j34.d f156636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w24.x0 f156637h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q34.x0 f156638i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ w24.k0 f156639j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ q34.j0 f156640k;

        /* JADX INFO: renamed from: pc4.x6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3882a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f156641a;

            static {
                int[] iArr = new int[NipipCardContainerData.a.values().length];
                try {
                    iArr[NipipCardContainerData.a.NURSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NipipCardContainerData.a.MIDWIFE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f156641a = iArr;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156642d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156643e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156644f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156645g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156646h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156647j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156648k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156649l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156650m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156651n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156652p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156653q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156655s;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156653q = obj;
                this.f156655s |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156656d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156657e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156658f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156659g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156660h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156661j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156662k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156663l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156664m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156665n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156666p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f156667q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156669s;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156667q = obj;
                this.f156669s |= PKIFailureInfo.systemUnavail;
                return a.this.e(null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156670d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156672f;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156670d = obj;
                this.f156672f |= PKIFailureInfo.systemUnavail;
                return a.this.g(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156673d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156674e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156675f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156676g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156677h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156678j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156679k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156680l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156681m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156682n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156683p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156684q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156685r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f156686s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f156687t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f156688v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            /* synthetic */ Object f156689w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f156691y;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156689w = obj;
                this.f156691y |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, this);
            }
        }

        a(c54.b bVar, w24.d1 d1Var, w24.z0 z0Var, q34.a1 a1Var, k24.a aVar, q34.w wVar, j34.d dVar, w24.x0 x0Var, q34.x0 x0Var2, w24.k0 k0Var, q34.j0 j0Var) {
            this.f156630a = bVar;
            this.f156631b = d1Var;
            this.f156632c = z0Var;
            this.f156633d = a1Var;
            this.f156634e = aVar;
            this.f156635f = wVar;
            this.f156636g = dVar;
            this.f156637h = x0Var;
            this.f156638i = x0Var2;
            this.f156639j = k0Var;
            this.f156640k = j0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0157, B:62:0x0174, B:63:0x017a, B:59:0x015e, B:61:0x0162, B:64:0x0180, B:65:0x0185, B:68:0x018c, B:71:0x019a, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00d9 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0157, B:62:0x0174, B:63:0x017a, B:59:0x015e, B:61:0x0162, B:64:0x0180, B:65:0x0185, B:68:0x018c, B:71:0x019a, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00f3 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0157, B:62:0x0174, B:63:0x017a, B:59:0x015e, B:61:0x0162, B:64:0x0180, B:65:0x0185, B:68:0x018c, B:71:0x019a, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x015d  */
        /* JADX WARN: Code duplicated, block: B:59:0x015e A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0157, B:62:0x0174, B:63:0x017a, B:59:0x015e, B:61:0x0162, B:64:0x0180, B:65:0x0185, B:68:0x018c, B:71:0x019a, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0162 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0157, B:62:0x0174, B:63:0x017a, B:59:0x015e, B:61:0x0162, B:64:0x0180, B:65:0x0185, B:68:0x018c, B:71:0x019a, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0180 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:56:0x0157, B:62:0x0174, B:63:0x017a, B:59:0x015e, B:61:0x0162, B:64:0x0180, B:65:0x0185, B:68:0x018c, B:71:0x019a, B:24:0x006e, B:34:0x00ce, B:40:0x00eb, B:37:0x00d5, B:39:0x00d9, B:41:0x00f3, B:42:0x00f8), top: B:86:0x0022 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v7 */
        public final Object e(NipipCardContainerData.a aVar, String str, tq.e<? super dx.i<? extends dx.b, ? extends qy2.b>> eVar) throws Throwable {
            c cVar;
            Object objB;
            ex.b bVar;
            ex.b bVar2;
            dx.i right;
            qy2.b bVar3;
            dx.i right2;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f156669s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f156669s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(eVar);
                }
            } else {
                cVar = new c(eVar);
            }
            Object objC = cVar.f156667q;
            Object objE = uq.b.e();
            int i16 = cVar.f156669s;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(objC);
                            c54.b bVar4 = this.f156630a;
                            w24.k0 k0Var = this.f156639j;
                            q34.j0 j0Var = this.f156640k;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar2 = new ex.a();
                                boolean zBooleanValue = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    if (str == 0) {
                                        aVar2.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                        throw new oq.g();
                                    }
                                    w24.k0.Params params = new w24.k0.Params(str);
                                    cVar.f156656d = vq.j.a(aVar);
                                    cVar.f156657e = vq.j.a(str);
                                    cVar.f156658f = jVarA;
                                    cVar.f156659g = vq.j.a(aVar2);
                                    cVar.f156660h = vq.j.a(aVar2);
                                    cVar.f156661j = aVar2;
                                    cVar.f156662k = 0;
                                    cVar.f156663l = 0;
                                    cVar.f156664m = 0;
                                    cVar.f156665n = 0;
                                    cVar.f156666p = 0;
                                    cVar.f156669s = 1;
                                    objC = k0Var.c(params, cVar);
                                    if (objC != objE) {
                                        bVar2 = aVar2;
                                        right = (dx.i) objC;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right = new dx.i.Right(y6.p((f24.h) ((dx.i.Right) right).b()));
                                        }
                                        bVar3 = (qy2.b) bVar2.a(right);
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(qy2.f.a(aVar), null);
                                    cVar.f156656d = vq.j.a(aVar);
                                    cVar.f156657e = vq.j.a(str);
                                    cVar.f156658f = jVarA;
                                    cVar.f156659g = vq.j.a(aVar2);
                                    cVar.f156660h = vq.j.a(aVar2);
                                    cVar.f156661j = aVar2;
                                    cVar.f156662k = 0;
                                    cVar.f156663l = 0;
                                    cVar.f156664m = 0;
                                    cVar.f156665n = 0;
                                    cVar.f156666p = 0;
                                    cVar.f156669s = 2;
                                    objC = j0Var.c(allDocumentStatus, cVar);
                                    if (objC != objE) {
                                        bVar = aVar2;
                                        right2 = (dx.i) objC;
                                        if (!(right2 instanceof dx.i.Left)) {
                                            if (right2 instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            right2 = new dx.i.Right(y6.o((er0.h) ((dx.i.Right) right2).b()));
                                        }
                                        bVar3 = (qy2.b) bVar.a(right2);
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                str = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(str));
                                dx.i iVarA = str.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            bVar2 = (ex.b) cVar.f156661j;
                            oq.u.b(objC);
                            right = (dx.i) objC;
                            if (!(right instanceof dx.i.Left)) {
                                if (right instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right = new dx.i.Right(y6.p((f24.h) ((dx.i.Right) right).b()));
                            }
                            bVar3 = (qy2.b) bVar2.a(right);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) cVar.f156661j;
                            oq.u.b(objC);
                            right2 = (dx.i) objC;
                            if (!(right2 instanceof dx.i.Left)) {
                                if (right2 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new dx.i.Right(y6.o((er0.h) ((dx.i.Right) right2).b()));
                            }
                            bVar3 = (qy2.b) bVar.a(right2);
                        }
                        return new dx.i.Right(bVar3);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        
            if (r6 == r1) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object g(tq.e<? super dx.i<? extends dx.b, java.lang.String>> r6) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r6 instanceof pc4.x6.a.d
                if (r0 == 0) goto L13
                r0 = r6
                pc4.x6$a$d r0 = (pc4.x6.a.d) r0
                int r1 = r0.f156672f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f156672f = r1
                goto L18
            L13:
                pc4.x6$a$d r0 = new pc4.x6$a$d
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f156670d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f156672f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r6)
                goto L8a
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L34:
                oq.u.b(r6)
                goto L58
            L38:
                oq.u.b(r6)
                c54.b r6 = r5.f156630a
                b54.c r2 = b54.c.MOB_DB_CONTAINERS
                java.lang.Object r6 = r6.a(r2)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L7b
                w24.x0 r6 = r5.f156637h
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f156672f = r4
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L58
                goto L89
            L58:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L5f
                return r6
            L5f:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto L75
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                u24.c r6 = (u24.UserDocumentData) r6
                java.lang.String r6 = r6.getPhoto()
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            L75:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L7b:
                if (r6 != 0) goto Lb1
                q34.x0 r6 = r5.f156638i
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r0.f156672f = r3
                java.lang.Object r6 = r6.c(r2, r0)
                if (r6 != r1) goto L8a
            L89:
                return r1
            L8a:
                dx.i r6 = (dx.i) r6
                boolean r0 = r6 instanceof dx.i.Left
                if (r0 == 0) goto L91
                return r6
            L91:
                boolean r0 = r6 instanceof dx.i.Right
                if (r0 == 0) goto Lab
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                k34.f0 r6 = (k34.UserDocumentData) r6
                iy.b0 r6 = r6.getPhoto()
                java.lang.String r6 = iy.c0.e(r6)
                dx.i$c r0 = new dx.i$c
                r0.<init>(r6)
                return r0
            Lab:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            Lb1:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.x6.a.g(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0316 A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:102:0x0319 A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:104:0x031f A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x034d  */
        /* JADX WARN: Code duplicated, block: B:108:0x034e  */
        /* JADX WARN: Code duplicated, block: B:112:0x035e A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:114:0x0362 A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TRY_LEAVE, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:117:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:122:0x03ce A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TRY_ENTER, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:124:0x03d4 A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:132:0x03f1  */
        /* JADX WARN: Code duplicated, block: B:135:0x0402  */
        /* JADX WARN: Code duplicated, block: B:136:0x0410  */
        /* JADX WARN: Code duplicated, block: B:138:0x0414  */
        /* JADX WARN: Code duplicated, block: B:141:0x0421  */
        /* JADX WARN: Code duplicated, block: B:57:0x01e1 A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:61:0x01ee A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TRY_LEAVE, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x021c  */
        /* JADX WARN: Code duplicated, block: B:67:0x0235 A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TRY_ENTER, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x023b A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TRY_LEAVE, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x0269  */
        /* JADX WARN: Code duplicated, block: B:77:0x027d  */
        /* JADX WARN: Code duplicated, block: B:78:0x027f A[Catch: Exception -> 0x02f4, c -> 0x02f8, CancellationException -> 0x02fc, TryCatch #7 {c -> 0x02f8, CancellationException -> 0x02fc, Exception -> 0x02f4, blocks: (B:75:0x0279, B:78:0x027f, B:80:0x0283, B:94:0x0300, B:95:0x0305), top: B:148:0x0279 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:80:0x0283 A[Catch: Exception -> 0x02f4, c -> 0x02f8, CancellationException -> 0x02fc, TRY_LEAVE, TryCatch #7 {c -> 0x02f8, CancellationException -> 0x02fc, Exception -> 0x02f4, blocks: (B:75:0x0279, B:78:0x027f, B:80:0x0283, B:94:0x0300, B:95:0x0305), top: B:148:0x0279 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x02d2  */
        /* JADX WARN: Code duplicated, block: B:94:0x0300 A[Catch: Exception -> 0x02f4, c -> 0x02f8, CancellationException -> 0x02fc, TRY_ENTER, TryCatch #7 {c -> 0x02f8, CancellationException -> 0x02fc, Exception -> 0x02f4, blocks: (B:75:0x0279, B:78:0x027f, B:80:0x0283, B:94:0x0300, B:95:0x0305), top: B:148:0x0279 }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0306 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:97:0x0308 A[Catch: Exception -> 0x00f0, c -> 0x00f4, CancellationException -> 0x00f8, TRY_ENTER, TryCatch #9 {c -> 0x00f4, CancellationException -> 0x00f8, Exception -> 0x00f0, blocks: (B:109:0x0356, B:112:0x035e, B:114:0x0362, B:122:0x03ce, B:123:0x03d3, B:34:0x00e7, B:44:0x011e, B:48:0x0159, B:55:0x01c8, B:57:0x01e1, B:61:0x01ee, B:67:0x0235, B:68:0x023a, B:69:0x023b, B:97:0x0308, B:101:0x0316, B:105:0x0321, B:102:0x0319, B:103:0x031e, B:104:0x031f, B:124:0x03d4, B:125:0x03d9), top: B:144:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:99:0x0313  */
        /* JADX WARN: Not initialized variable reg: 14, insn: 0x00f1: MOVE (r8 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:38:0x00f1 */
        /* JADX WARN: Not initialized variable reg: 14, insn: 0x00f5: MOVE (r8 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:40:0x00f5 */
        /* JADX WARN: Not initialized variable reg: 14, insn: 0x00f9: MOVE (r8 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:42:0x00f9 */
        @Override // py2.a
        public Object a(NipipCardContainerData.a aVar, tq.e<? super dx.i<? extends dx.b, NipipCardData>> eVar) throws Throwable {
            e eVar2;
            dx.j<dx.b> jVar;
            dx.j<dx.b> jVar2;
            String message;
            dx.i iVarA;
            Object objB;
            c54.b bVar;
            NipipCardContainerData.a aVar2;
            w24.d1 d1Var;
            Object obj;
            dx.j<dx.b> jVar3;
            ex.b bVar2;
            ex.b bVar3;
            q34.a1 a1Var;
            int i15;
            int i16;
            int i17;
            w24.z0 z0Var;
            ex.b bVar4;
            int i18;
            int i19;
            String str;
            boolean zBooleanValue;
            int i25;
            q34.a1.a aVar3;
            Object objC;
            NipipCardContainerData.a aVar4;
            int i26;
            String str2;
            int i27;
            ex.b bVar5;
            ex.b bVar6;
            int i28;
            Object objC2;
            String str3;
            int i29;
            NipipCardContainerData.a aVar5;
            int i35;
            int i36;
            int i37;
            ex.b bVar7;
            ex.b bVar8;
            Object objC3;
            dx.j<dx.b> jVar4;
            dx.i right;
            NipipCardContainerData.a aVar6;
            int i38;
            String str4;
            int i39;
            dx.j<dx.b> jVar5;
            int i45;
            i24.NipipCardData nipipCardData;
            dx.j<dx.b> jVar6;
            ex.b bVar9;
            ex.b bVar10;
            i24.NipipCardData nipipCardData2;
            ex.b bVar11;
            NipipScope nipipScope;
            NipipScope nipipScope2;
            ex.b bVar12;
            ex.b bVar13;
            dx.j<dx.b> jVar7;
            if (eVar instanceof e) {
                eVar2 = (e) eVar;
                int i46 = eVar2.f156691y;
                if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar2.f156691y = i46 - PKIFailureInfo.systemUnavail;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objE = eVar2.f156689w;
            Object objE2 = uq.b.e();
            try {
                try {
                    try {
                        try {
                            switch (eVar2.f156691y) {
                                case 0:
                                    oq.u.b(objE);
                                    bVar = this.f156630a;
                                    w24.d1 d1Var2 = this.f156631b;
                                    w24.z0 z0Var2 = this.f156632c;
                                    q34.a1 a1Var2 = this.f156633d;
                                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                    ex.a aVar7 = new ex.a();
                                    aVar2 = aVar;
                                    eVar2.f156673d = aVar2;
                                    eVar2.f156674e = bVar;
                                    eVar2.f156675f = d1Var2;
                                    eVar2.f156676g = z0Var2;
                                    eVar2.f156677h = a1Var2;
                                    eVar2.f156678j = jVarA;
                                    eVar2.f156679k = vq.j.a(aVar7);
                                    eVar2.f156680l = aVar7;
                                    eVar2.f156681m = aVar7;
                                    eVar2.f156682n = 0;
                                    eVar2.f156683p = 0;
                                    eVar2.f156684q = 0;
                                    eVar2.f156685r = 0;
                                    eVar2.f156686s = 0;
                                    eVar2.f156691y = 1;
                                    Object objG = g(eVar2);
                                    if (objG != objE2) {
                                        d1Var = d1Var2;
                                        obj = objG;
                                        jVar3 = jVarA;
                                        bVar2 = aVar7;
                                        bVar3 = bVar2;
                                        a1Var = a1Var2;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        z0Var = z0Var2;
                                        bVar4 = bVar3;
                                        i18 = 0;
                                        i19 = 0;
                                        str = (String) bVar2.a((dx.i) obj);
                                        zBooleanValue = bVar.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                        if (zBooleanValue) {
                                            i28 = C3882a.f156641a[aVar2.ordinal()];
                                            if (i28 != 1) {
                                                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                                eVar2.f156673d = aVar2;
                                                eVar2.f156674e = jVar3;
                                                eVar2.f156675f = vq.j.a(bVar3);
                                                eVar2.f156676g = bVar4;
                                                eVar2.f156677h = bVar4;
                                                eVar2.f156678j = str;
                                                eVar2.f156679k = null;
                                                eVar2.f156680l = null;
                                                eVar2.f156681m = null;
                                                eVar2.f156682n = i17;
                                                eVar2.f156683p = i19;
                                                eVar2.f156684q = i16;
                                                eVar2.f156685r = i15;
                                                eVar2.f156686s = i18;
                                                eVar2.f156691y = 2;
                                                objC2 = d1Var.c(c1792a, eVar2);
                                                if (objC2 != objE2) {
                                                    int i47 = i16;
                                                    str3 = str;
                                                    i29 = i47;
                                                    aVar5 = aVar2;
                                                    objE = objC2;
                                                    i35 = i18;
                                                    i36 = i15;
                                                    i37 = i17;
                                                    bVar7 = bVar4;
                                                    bVar8 = bVar3;
                                                    jVar4 = jVar3;
                                                    right = (dx.i) objE;
                                                    aVar6 = aVar5;
                                                    i38 = i36;
                                                    str4 = str3;
                                                    i39 = i37;
                                                    jVar5 = jVar4;
                                                    i45 = i29;
                                                    if (!(right instanceof dx.i.Left)) {
                                                        if (right instanceof dx.i.Right) {
                                                            throw new oq.p();
                                                        }
                                                        nipipCardData = (i24.NipipCardData) ((dx.i.Right) right).b();
                                                        ex.b bVar14 = bVar8;
                                                        String documentId = nipipCardData.getDocument().getDocumentId();
                                                        eVar2.f156673d = vq.j.a(aVar6);
                                                        eVar2.f156674e = jVar5;
                                                        eVar2.f156675f = vq.j.a(bVar14);
                                                        eVar2.f156676g = bVar7;
                                                        eVar2.f156677h = bVar4;
                                                        eVar2.f156678j = str4;
                                                        eVar2.f156679k = vq.j.a(right);
                                                        eVar2.f156680l = nipipCardData;
                                                        eVar2.f156681m = bVar7;
                                                        eVar2.f156682n = i39;
                                                        eVar2.f156683p = i19;
                                                        eVar2.f156684q = i45;
                                                        eVar2.f156685r = i38;
                                                        eVar2.f156686s = i35;
                                                        eVar2.f156687t = 0;
                                                        eVar2.f156688v = 0;
                                                        eVar2.f156691y = 4;
                                                        objE = e(aVar6, documentId, eVar2);
                                                        objE2 = objE2;
                                                        if (objE != objE2) {
                                                            jVar6 = jVar5;
                                                            bVar9 = bVar7;
                                                            bVar10 = bVar9;
                                                            nipipCardData2 = nipipCardData;
                                                            bVar11 = bVar4;
                                                            right = new dx.i.Right((NipipCardData) bVar10.a(y6.g(nipipCardData2, str4, (qy2.b) bVar9.a((dx.i) objE))));
                                                            bVar4 = bVar11;
                                                            jVar5 = jVar6;
                                                        }
                                                    }
                                                    return new dx.i.Right((NipipCardData) bVar4.a(right));
                                                }
                                            } else {
                                                if (i28 == 2) {
                                                    throw new oq.p();
                                                }
                                                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                                                eVar2.f156673d = aVar2;
                                                eVar2.f156674e = jVar3;
                                                eVar2.f156675f = vq.j.a(bVar3);
                                                eVar2.f156676g = bVar4;
                                                eVar2.f156677h = bVar4;
                                                eVar2.f156678j = str;
                                                eVar2.f156679k = null;
                                                eVar2.f156680l = null;
                                                eVar2.f156681m = null;
                                                eVar2.f156682n = i17;
                                                eVar2.f156683p = i19;
                                                eVar2.f156684q = i16;
                                                eVar2.f156685r = i15;
                                                eVar2.f156686s = i18;
                                                eVar2.f156691y = 3;
                                                objC3 = z0Var.c(c1792a2, eVar2);
                                                if (objC3 != objE2) {
                                                    int i48 = i16;
                                                    str3 = str;
                                                    i29 = i48;
                                                    aVar5 = aVar2;
                                                    objE = objC3;
                                                    i35 = i18;
                                                    i36 = i15;
                                                    i37 = i17;
                                                    bVar7 = bVar4;
                                                    bVar8 = bVar3;
                                                    jVar4 = jVar3;
                                                    right = (dx.i) objE;
                                                    aVar6 = aVar5;
                                                    i38 = i36;
                                                    str4 = str3;
                                                    i39 = i37;
                                                    jVar5 = jVar4;
                                                    i45 = i29;
                                                    try {
                                                        if (!(right instanceof dx.i.Left)) {
                                                            if (right instanceof dx.i.Right) {
                                                                throw new oq.p();
                                                            }
                                                            nipipCardData = (i24.NipipCardData) ((dx.i.Right) right).b();
                                                            ex.b bVar15 = bVar8;
                                                            String documentId2 = nipipCardData.getDocument().getDocumentId();
                                                            eVar2.f156673d = vq.j.a(aVar6);
                                                            eVar2.f156674e = jVar5;
                                                            eVar2.f156675f = vq.j.a(bVar15);
                                                            eVar2.f156676g = bVar7;
                                                            eVar2.f156677h = bVar4;
                                                            eVar2.f156678j = str4;
                                                            eVar2.f156679k = vq.j.a(right);
                                                            eVar2.f156680l = nipipCardData;
                                                            eVar2.f156681m = bVar7;
                                                            eVar2.f156682n = i39;
                                                            eVar2.f156683p = i19;
                                                            eVar2.f156684q = i45;
                                                            eVar2.f156685r = i38;
                                                            eVar2.f156686s = i35;
                                                            eVar2.f156687t = 0;
                                                            eVar2.f156688v = 0;
                                                            eVar2.f156691y = 4;
                                                            objE = e(aVar6, documentId2, eVar2);
                                                            objE2 = objE2;
                                                            if (objE != objE2) {
                                                                jVar6 = jVar5;
                                                                bVar9 = bVar7;
                                                                bVar10 = bVar9;
                                                                nipipCardData2 = nipipCardData;
                                                                bVar11 = bVar4;
                                                                right = new dx.i.Right((NipipCardData) bVar10.a(y6.g(nipipCardData2, str4, (qy2.b) bVar9.a((dx.i) objE))));
                                                                bVar4 = bVar11;
                                                                jVar5 = jVar6;
                                                            }
                                                        }
                                                        return new dx.i.Right((NipipCardData) bVar4.a(right));
                                                    } catch (ex.c e15) {
                                                        e = e15;
                                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                                    } catch (CancellationException e16) {
                                                        throw e16;
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        jVar2 = jVar5;
                                                        px.f fVar = px.f.f163100a;
                                                        message = e.getMessage();
                                                        if (message == null) {
                                                            message = "";
                                                        }
                                                        fVar.d(message, e, px.c.a(jVar2));
                                                        iVarA = jVar2.a(e);
                                                        if (iVarA instanceof dx.i.Left) {
                                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                        } else {
                                                            if (iVarA instanceof dx.i.Right) {
                                                                throw new oq.p();
                                                            }
                                                            objB = ((dx.i.Right) iVarA).b();
                                                        }
                                                        return new dx.i.Left(objB);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (!zBooleanValue) {
                                                throw new oq.p();
                                            }
                                            i25 = C3882a.f156641a[aVar2.ordinal()];
                                            if (i25 != 1) {
                                                aVar3 = q34.a1.a.NURSE;
                                            } else {
                                                if (i25 == 2) {
                                                    throw new oq.p();
                                                }
                                                aVar3 = q34.a1.a.MIDWIFE;
                                            }
                                            eVar2.f156673d = aVar2;
                                            eVar2.f156674e = jVar3;
                                            eVar2.f156675f = vq.j.a(bVar3);
                                            eVar2.f156676g = bVar4;
                                            eVar2.f156677h = bVar4;
                                            eVar2.f156678j = str;
                                            eVar2.f156679k = null;
                                            eVar2.f156680l = null;
                                            eVar2.f156681m = null;
                                            eVar2.f156682n = i17;
                                            eVar2.f156683p = i19;
                                            eVar2.f156684q = i16;
                                            eVar2.f156685r = i15;
                                            eVar2.f156686s = i18;
                                            eVar2.f156691y = 5;
                                            objC = a1Var.c(aVar3, eVar2);
                                            if (objC == objE2) {
                                                aVar4 = aVar2;
                                                objE = objC;
                                                i26 = i18;
                                                str2 = str;
                                                i27 = i19;
                                                bVar5 = bVar4;
                                                bVar6 = bVar5;
                                                right = (dx.i) objE;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (!(right instanceof dx.i.Right)) {
                                                        throw new oq.p();
                                                    }
                                                    nipipScope = (NipipScope) ((dx.i.Right) right).b();
                                                    eVar2.f156673d = vq.j.a(aVar4);
                                                    eVar2.f156674e = jVar3;
                                                    eVar2.f156675f = vq.j.a(bVar3);
                                                    eVar2.f156676g = bVar6;
                                                    eVar2.f156677h = bVar5;
                                                    eVar2.f156678j = str2;
                                                    eVar2.f156679k = vq.j.a(right);
                                                    eVar2.f156680l = nipipScope;
                                                    eVar2.f156681m = bVar6;
                                                    eVar2.f156682n = i17;
                                                    eVar2.f156683p = i27;
                                                    eVar2.f156684q = i16;
                                                    eVar2.f156685r = i15;
                                                    eVar2.f156686s = i26;
                                                    eVar2.f156687t = 0;
                                                    eVar2.f156688v = 0;
                                                    eVar2.f156691y = 6;
                                                    objE = e(aVar4, null, eVar2);
                                                    if (objE != objE2) {
                                                        nipipScope2 = nipipScope;
                                                        bVar12 = bVar6;
                                                        bVar13 = bVar12;
                                                        jVar7 = jVar3;
                                                        right = new dx.i.Right((NipipCardData) bVar13.a(y6.h(nipipScope2, str2, (qy2.b) bVar12.a((dx.i) objE))));
                                                        jVar3 = jVar7;
                                                    }
                                                }
                                                bVar4 = bVar5;
                                                return new dx.i.Right((NipipCardData) bVar4.a(right));
                                            }
                                        }
                                    }
                                    return objE2;
                                case 1:
                                    int i49 = eVar2.f156686s;
                                    int i55 = eVar2.f156685r;
                                    int i56 = eVar2.f156684q;
                                    int i57 = eVar2.f156683p;
                                    int i58 = eVar2.f156682n;
                                    ex.b bVar16 = (ex.b) eVar2.f156681m;
                                    ex.b bVar17 = (ex.b) eVar2.f156680l;
                                    ex.b bVar18 = (ex.b) eVar2.f156679k;
                                    jVar3 = (dx.j) eVar2.f156678j;
                                    q34.a1 a1Var3 = (q34.a1) eVar2.f156677h;
                                    w24.z0 z0Var3 = (w24.z0) eVar2.f156676g;
                                    w24.d1 d1Var3 = (w24.d1) eVar2.f156675f;
                                    c54.b bVar19 = (c54.b) eVar2.f156674e;
                                    NipipCardContainerData.a aVar8 = (NipipCardContainerData.a) eVar2.f156673d;
                                    oq.u.b(objE);
                                    i18 = i49;
                                    obj = objE;
                                    aVar2 = aVar8;
                                    bVar = bVar19;
                                    bVar3 = bVar18;
                                    bVar2 = bVar16;
                                    i19 = i57;
                                    d1Var = d1Var3;
                                    z0Var = z0Var3;
                                    a1Var = a1Var3;
                                    bVar4 = bVar17;
                                    i17 = i58;
                                    i16 = i56;
                                    i15 = i55;
                                    str = (String) bVar2.a((dx.i) obj);
                                    zBooleanValue = bVar.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                    if (zBooleanValue) {
                                        i28 = C3882a.f156641a[aVar2.ordinal()];
                                        if (i28 != 1) {
                                            gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
                                            eVar2.f156673d = aVar2;
                                            eVar2.f156674e = jVar3;
                                            eVar2.f156675f = vq.j.a(bVar3);
                                            eVar2.f156676g = bVar4;
                                            eVar2.f156677h = bVar4;
                                            eVar2.f156678j = str;
                                            eVar2.f156679k = null;
                                            eVar2.f156680l = null;
                                            eVar2.f156681m = null;
                                            eVar2.f156682n = i17;
                                            eVar2.f156683p = i19;
                                            eVar2.f156684q = i16;
                                            eVar2.f156685r = i15;
                                            eVar2.f156686s = i18;
                                            eVar2.f156691y = 2;
                                            objC2 = d1Var.c(c1792a3, eVar2);
                                            if (objC2 != objE2) {
                                                int i410 = i16;
                                                str3 = str;
                                                i29 = i410;
                                                aVar5 = aVar2;
                                                objE = objC2;
                                                i35 = i18;
                                                i36 = i15;
                                                i37 = i17;
                                                bVar7 = bVar4;
                                                bVar8 = bVar3;
                                                jVar4 = jVar3;
                                                right = (dx.i) objE;
                                                aVar6 = aVar5;
                                                i38 = i36;
                                                str4 = str3;
                                                i39 = i37;
                                                jVar5 = jVar4;
                                                i45 = i29;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (right instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    nipipCardData = (i24.NipipCardData) ((dx.i.Right) right).b();
                                                    ex.b bVar110 = bVar8;
                                                    String documentId3 = nipipCardData.getDocument().getDocumentId();
                                                    eVar2.f156673d = vq.j.a(aVar6);
                                                    eVar2.f156674e = jVar5;
                                                    eVar2.f156675f = vq.j.a(bVar110);
                                                    eVar2.f156676g = bVar7;
                                                    eVar2.f156677h = bVar4;
                                                    eVar2.f156678j = str4;
                                                    eVar2.f156679k = vq.j.a(right);
                                                    eVar2.f156680l = nipipCardData;
                                                    eVar2.f156681m = bVar7;
                                                    eVar2.f156682n = i39;
                                                    eVar2.f156683p = i19;
                                                    eVar2.f156684q = i45;
                                                    eVar2.f156685r = i38;
                                                    eVar2.f156686s = i35;
                                                    eVar2.f156687t = 0;
                                                    eVar2.f156688v = 0;
                                                    eVar2.f156691y = 4;
                                                    objE = e(aVar6, documentId3, eVar2);
                                                    objE2 = objE2;
                                                    if (objE != objE2) {
                                                        jVar6 = jVar5;
                                                        bVar9 = bVar7;
                                                        bVar10 = bVar9;
                                                        nipipCardData2 = nipipCardData;
                                                        bVar11 = bVar4;
                                                        right = new dx.i.Right((NipipCardData) bVar10.a(y6.g(nipipCardData2, str4, (qy2.b) bVar9.a((dx.i) objE))));
                                                        bVar4 = bVar11;
                                                        jVar5 = jVar6;
                                                    }
                                                }
                                                return new dx.i.Right((NipipCardData) bVar4.a(right));
                                            }
                                        } else {
                                            if (i28 == 2) {
                                                throw new oq.p();
                                            }
                                            gz.b.a.C1792a c1792a4 = gz.b.a.C1792a.f78542a;
                                            eVar2.f156673d = aVar2;
                                            eVar2.f156674e = jVar3;
                                            eVar2.f156675f = vq.j.a(bVar3);
                                            eVar2.f156676g = bVar4;
                                            eVar2.f156677h = bVar4;
                                            eVar2.f156678j = str;
                                            eVar2.f156679k = null;
                                            eVar2.f156680l = null;
                                            eVar2.f156681m = null;
                                            eVar2.f156682n = i17;
                                            eVar2.f156683p = i19;
                                            eVar2.f156684q = i16;
                                            eVar2.f156685r = i15;
                                            eVar2.f156686s = i18;
                                            eVar2.f156691y = 3;
                                            objC3 = z0Var.c(c1792a4, eVar2);
                                            if (objC3 != objE2) {
                                                int i411 = i16;
                                                str3 = str;
                                                i29 = i411;
                                                aVar5 = aVar2;
                                                objE = objC3;
                                                i35 = i18;
                                                i36 = i15;
                                                i37 = i17;
                                                bVar7 = bVar4;
                                                bVar8 = bVar3;
                                                jVar4 = jVar3;
                                                right = (dx.i) objE;
                                                aVar6 = aVar5;
                                                i38 = i36;
                                                str4 = str3;
                                                i39 = i37;
                                                jVar5 = jVar4;
                                                i45 = i29;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (right instanceof dx.i.Right) {
                                                        throw new oq.p();
                                                    }
                                                    nipipCardData = (i24.NipipCardData) ((dx.i.Right) right).b();
                                                    ex.b bVar111 = bVar8;
                                                    String documentId4 = nipipCardData.getDocument().getDocumentId();
                                                    eVar2.f156673d = vq.j.a(aVar6);
                                                    eVar2.f156674e = jVar5;
                                                    eVar2.f156675f = vq.j.a(bVar111);
                                                    eVar2.f156676g = bVar7;
                                                    eVar2.f156677h = bVar4;
                                                    eVar2.f156678j = str4;
                                                    eVar2.f156679k = vq.j.a(right);
                                                    eVar2.f156680l = nipipCardData;
                                                    eVar2.f156681m = bVar7;
                                                    eVar2.f156682n = i39;
                                                    eVar2.f156683p = i19;
                                                    eVar2.f156684q = i45;
                                                    eVar2.f156685r = i38;
                                                    eVar2.f156686s = i35;
                                                    eVar2.f156687t = 0;
                                                    eVar2.f156688v = 0;
                                                    eVar2.f156691y = 4;
                                                    objE = e(aVar6, documentId4, eVar2);
                                                    objE2 = objE2;
                                                    if (objE != objE2) {
                                                        jVar6 = jVar5;
                                                        bVar9 = bVar7;
                                                        bVar10 = bVar9;
                                                        nipipCardData2 = nipipCardData;
                                                        bVar11 = bVar4;
                                                        right = new dx.i.Right((NipipCardData) bVar10.a(y6.g(nipipCardData2, str4, (qy2.b) bVar9.a((dx.i) objE))));
                                                        bVar4 = bVar11;
                                                        jVar5 = jVar6;
                                                    }
                                                }
                                                return new dx.i.Right((NipipCardData) bVar4.a(right));
                                            }
                                        }
                                    } else {
                                        if (!zBooleanValue) {
                                            throw new oq.p();
                                        }
                                        i25 = C3882a.f156641a[aVar2.ordinal()];
                                        if (i25 != 1) {
                                            aVar3 = q34.a1.a.NURSE;
                                        } else {
                                            if (i25 == 2) {
                                                throw new oq.p();
                                            }
                                            aVar3 = q34.a1.a.MIDWIFE;
                                        }
                                        eVar2.f156673d = aVar2;
                                        eVar2.f156674e = jVar3;
                                        eVar2.f156675f = vq.j.a(bVar3);
                                        eVar2.f156676g = bVar4;
                                        eVar2.f156677h = bVar4;
                                        eVar2.f156678j = str;
                                        eVar2.f156679k = null;
                                        eVar2.f156680l = null;
                                        eVar2.f156681m = null;
                                        eVar2.f156682n = i17;
                                        eVar2.f156683p = i19;
                                        eVar2.f156684q = i16;
                                        eVar2.f156685r = i15;
                                        eVar2.f156686s = i18;
                                        eVar2.f156691y = 5;
                                        objC = a1Var.c(aVar3, eVar2);
                                        if (objC == objE2) {
                                            aVar4 = aVar2;
                                            objE = objC;
                                            i26 = i18;
                                            str2 = str;
                                            i27 = i19;
                                            bVar5 = bVar4;
                                            bVar6 = bVar5;
                                            right = (dx.i) objE;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (!(right instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                nipipScope = (NipipScope) ((dx.i.Right) right).b();
                                                eVar2.f156673d = vq.j.a(aVar4);
                                                eVar2.f156674e = jVar3;
                                                eVar2.f156675f = vq.j.a(bVar3);
                                                eVar2.f156676g = bVar6;
                                                eVar2.f156677h = bVar5;
                                                eVar2.f156678j = str2;
                                                eVar2.f156679k = vq.j.a(right);
                                                eVar2.f156680l = nipipScope;
                                                eVar2.f156681m = bVar6;
                                                eVar2.f156682n = i17;
                                                eVar2.f156683p = i27;
                                                eVar2.f156684q = i16;
                                                eVar2.f156685r = i15;
                                                eVar2.f156686s = i26;
                                                eVar2.f156687t = 0;
                                                eVar2.f156688v = 0;
                                                eVar2.f156691y = 6;
                                                objE = e(aVar4, null, eVar2);
                                                if (objE != objE2) {
                                                    nipipScope2 = nipipScope;
                                                    bVar12 = bVar6;
                                                    bVar13 = bVar12;
                                                    jVar7 = jVar3;
                                                    right = new dx.i.Right((NipipCardData) bVar13.a(y6.h(nipipScope2, str2, (qy2.b) bVar12.a((dx.i) objE))));
                                                    jVar3 = jVar7;
                                                }
                                            }
                                            bVar4 = bVar5;
                                            return new dx.i.Right((NipipCardData) bVar4.a(right));
                                        }
                                    }
                                    return objE2;
                                case 2:
                                    i35 = eVar2.f156686s;
                                    i36 = eVar2.f156685r;
                                    i29 = eVar2.f156684q;
                                    int i59 = eVar2.f156683p;
                                    i37 = eVar2.f156682n;
                                    str3 = (String) eVar2.f156678j;
                                    ex.b bVar20 = (ex.b) eVar2.f156677h;
                                    bVar7 = (ex.b) eVar2.f156676g;
                                    bVar8 = (ex.b) eVar2.f156675f;
                                    jVar3 = (dx.j) eVar2.f156674e;
                                    NipipCardContainerData.a aVar9 = (NipipCardContainerData.a) eVar2.f156673d;
                                    oq.u.b(objE);
                                    aVar5 = aVar9;
                                    bVar4 = bVar20;
                                    i19 = i59;
                                    jVar4 = jVar3;
                                    right = (dx.i) objE;
                                    aVar6 = aVar5;
                                    i38 = i36;
                                    str4 = str3;
                                    i39 = i37;
                                    jVar5 = jVar4;
                                    i45 = i29;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (right instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        nipipCardData = (i24.NipipCardData) ((dx.i.Right) right).b();
                                        ex.b bVar112 = bVar8;
                                        String documentId5 = nipipCardData.getDocument().getDocumentId();
                                        eVar2.f156673d = vq.j.a(aVar6);
                                        eVar2.f156674e = jVar5;
                                        eVar2.f156675f = vq.j.a(bVar112);
                                        eVar2.f156676g = bVar7;
                                        eVar2.f156677h = bVar4;
                                        eVar2.f156678j = str4;
                                        eVar2.f156679k = vq.j.a(right);
                                        eVar2.f156680l = nipipCardData;
                                        eVar2.f156681m = bVar7;
                                        eVar2.f156682n = i39;
                                        eVar2.f156683p = i19;
                                        eVar2.f156684q = i45;
                                        eVar2.f156685r = i38;
                                        eVar2.f156686s = i35;
                                        eVar2.f156687t = 0;
                                        eVar2.f156688v = 0;
                                        eVar2.f156691y = 4;
                                        objE = e(aVar6, documentId5, eVar2);
                                        objE2 = objE2;
                                        if (objE != objE2) {
                                            jVar6 = jVar5;
                                            bVar9 = bVar7;
                                            bVar10 = bVar9;
                                            nipipCardData2 = nipipCardData;
                                            bVar11 = bVar4;
                                            right = new dx.i.Right((NipipCardData) bVar10.a(y6.g(nipipCardData2, str4, (qy2.b) bVar9.a((dx.i) objE))));
                                            bVar4 = bVar11;
                                            jVar5 = jVar6;
                                        }
                                        return objE2;
                                    }
                                    return new dx.i.Right((NipipCardData) bVar4.a(right));
                                case 3:
                                    i35 = eVar2.f156686s;
                                    i36 = eVar2.f156685r;
                                    i29 = eVar2.f156684q;
                                    int i65 = eVar2.f156683p;
                                    i37 = eVar2.f156682n;
                                    str3 = (String) eVar2.f156678j;
                                    ex.b bVar21 = (ex.b) eVar2.f156677h;
                                    bVar7 = (ex.b) eVar2.f156676g;
                                    bVar8 = (ex.b) eVar2.f156675f;
                                    jVar3 = (dx.j) eVar2.f156674e;
                                    NipipCardContainerData.a aVar10 = (NipipCardContainerData.a) eVar2.f156673d;
                                    oq.u.b(objE);
                                    aVar5 = aVar10;
                                    bVar4 = bVar21;
                                    i19 = i65;
                                    jVar4 = jVar3;
                                    right = (dx.i) objE;
                                    aVar6 = aVar5;
                                    i38 = i36;
                                    str4 = str3;
                                    i39 = i37;
                                    jVar5 = jVar4;
                                    i45 = i29;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (right instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        nipipCardData = (i24.NipipCardData) ((dx.i.Right) right).b();
                                        ex.b bVar113 = bVar8;
                                        String documentId6 = nipipCardData.getDocument().getDocumentId();
                                        eVar2.f156673d = vq.j.a(aVar6);
                                        eVar2.f156674e = jVar5;
                                        eVar2.f156675f = vq.j.a(bVar113);
                                        eVar2.f156676g = bVar7;
                                        eVar2.f156677h = bVar4;
                                        eVar2.f156678j = str4;
                                        eVar2.f156679k = vq.j.a(right);
                                        eVar2.f156680l = nipipCardData;
                                        eVar2.f156681m = bVar7;
                                        eVar2.f156682n = i39;
                                        eVar2.f156683p = i19;
                                        eVar2.f156684q = i45;
                                        eVar2.f156685r = i38;
                                        eVar2.f156686s = i35;
                                        eVar2.f156687t = 0;
                                        eVar2.f156688v = 0;
                                        eVar2.f156691y = 4;
                                        objE = e(aVar6, documentId6, eVar2);
                                        objE2 = objE2;
                                        if (objE != objE2) {
                                            jVar6 = jVar5;
                                            bVar9 = bVar7;
                                            bVar10 = bVar9;
                                            nipipCardData2 = nipipCardData;
                                            bVar11 = bVar4;
                                            right = new dx.i.Right((NipipCardData) bVar10.a(y6.g(nipipCardData2, str4, (qy2.b) bVar9.a((dx.i) objE))));
                                            bVar4 = bVar11;
                                            jVar5 = jVar6;
                                        }
                                        return objE2;
                                    }
                                    return new dx.i.Right((NipipCardData) bVar4.a(right));
                                case 4:
                                    bVar9 = (ex.b) eVar2.f156681m;
                                    nipipCardData2 = (i24.NipipCardData) eVar2.f156680l;
                                    str4 = (String) eVar2.f156678j;
                                    bVar11 = (ex.b) eVar2.f156677h;
                                    bVar10 = (ex.b) eVar2.f156676g;
                                    jVar6 = (dx.j) eVar2.f156674e;
                                    oq.u.b(objE);
                                    right = new dx.i.Right((NipipCardData) bVar10.a(y6.g(nipipCardData2, str4, (qy2.b) bVar9.a((dx.i) objE))));
                                    bVar4 = bVar11;
                                    jVar5 = jVar6;
                                    return new dx.i.Right((NipipCardData) bVar4.a(right));
                                case 5:
                                    i26 = eVar2.f156686s;
                                    int i66 = eVar2.f156685r;
                                    int i67 = eVar2.f156684q;
                                    i27 = eVar2.f156683p;
                                    int i68 = eVar2.f156682n;
                                    String str5 = (String) eVar2.f156678j;
                                    ex.b bVar22 = (ex.b) eVar2.f156677h;
                                    bVar6 = (ex.b) eVar2.f156676g;
                                    ex.b bVar23 = (ex.b) eVar2.f156675f;
                                    dx.j<dx.b> jVar8 = (dx.j) eVar2.f156674e;
                                    aVar4 = (NipipCardContainerData.a) eVar2.f156673d;
                                    try {
                                        oq.u.b(objE);
                                        bVar5 = bVar22;
                                        bVar3 = bVar23;
                                        jVar3 = jVar8;
                                        i17 = i68;
                                        i16 = i67;
                                        i15 = i66;
                                        str2 = str5;
                                        right = (dx.i) objE;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (!(right instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            nipipScope = (NipipScope) ((dx.i.Right) right).b();
                                            eVar2.f156673d = vq.j.a(aVar4);
                                            eVar2.f156674e = jVar3;
                                            eVar2.f156675f = vq.j.a(bVar3);
                                            eVar2.f156676g = bVar6;
                                            eVar2.f156677h = bVar5;
                                            eVar2.f156678j = str2;
                                            eVar2.f156679k = vq.j.a(right);
                                            eVar2.f156680l = nipipScope;
                                            eVar2.f156681m = bVar6;
                                            eVar2.f156682n = i17;
                                            eVar2.f156683p = i27;
                                            eVar2.f156684q = i16;
                                            eVar2.f156685r = i15;
                                            eVar2.f156686s = i26;
                                            eVar2.f156687t = 0;
                                            eVar2.f156688v = 0;
                                            eVar2.f156691y = 6;
                                            objE = e(aVar4, null, eVar2);
                                            if (objE != objE2) {
                                                nipipScope2 = nipipScope;
                                                bVar12 = bVar6;
                                                bVar13 = bVar12;
                                                jVar7 = jVar3;
                                                right = new dx.i.Right((NipipCardData) bVar13.a(y6.h(nipipScope2, str2, (qy2.b) bVar12.a((dx.i) objE))));
                                                jVar3 = jVar7;
                                            }
                                            return objE2;
                                        }
                                        bVar4 = bVar5;
                                        return new dx.i.Right((NipipCardData) bVar4.a(right));
                                    } catch (ex.c e18) {
                                        e = e18;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e19) {
                                        throw e19;
                                    } catch (Exception e25) {
                                        e = e25;
                                        jVar2 = jVar8;
                                        px.f fVar2 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar2.d(message, e, px.c.a(jVar2));
                                        iVarA = jVar2.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 6:
                                    bVar12 = (ex.b) eVar2.f156681m;
                                    nipipScope2 = (NipipScope) eVar2.f156680l;
                                    str2 = (String) eVar2.f156678j;
                                    bVar5 = (ex.b) eVar2.f156677h;
                                    bVar13 = (ex.b) eVar2.f156676g;
                                    jVar7 = (dx.j) eVar2.f156674e;
                                    oq.u.b(objE);
                                    right = new dx.i.Right((NipipCardData) bVar13.a(y6.h(nipipScope2, str2, (qy2.b) bVar12.a((dx.i) objE))));
                                    jVar3 = jVar7;
                                    bVar4 = bVar5;
                                    return new dx.i.Right((NipipCardData) bVar4.a(right));
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (Exception e26) {
                            e = e26;
                        }
                    } catch (CancellationException e27) {
                        throw e27;
                    }
                } catch (ex.c e28) {
                    e = e28;
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (ex.c e35) {
                e = e35;
            } catch (CancellationException e36) {
                throw e36;
            } catch (Exception e37) {
                e = e37;
                jVar2 = jVar;
            }
        }

        /* JADX WARN: Code duplicated, block: B:65:0x0160  */
        /* JADX WARN: Code duplicated, block: B:68:0x0171  */
        /* JADX WARN: Code duplicated, block: B:69:0x017f  */
        /* JADX WARN: Code duplicated, block: B:71:0x0183  */
        /* JADX WARN: Code duplicated, block: B:74:0x018f  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // py2.a
        public Object b(String str, NipipCardContainerData.a aVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            b bVar;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f156655s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f156655s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f156653q;
            Object objE = uq.b.e();
            int i16 = bVar.f156655s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar3 = this.f156630a;
                        k24.a aVar2 = this.f156634e;
                        q34.w wVar = this.f156635f;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar3 = new ex.a();
                            boolean zBooleanValue = bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue) {
                                if (str == 0) {
                                    aVar3.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                    throw new oq.g();
                                }
                                k24.a.Params params = new k24.a.Params(str);
                                bVar.f156642d = vq.j.a(str);
                                bVar.f156643e = vq.j.a(aVar);
                                bVar.f156644f = jVarA;
                                bVar.f156645g = vq.j.a(aVar3);
                                bVar.f156646h = vq.j.a(aVar3);
                                bVar.f156647j = aVar3;
                                bVar.f156648k = 0;
                                bVar.f156649l = 0;
                                bVar.f156650m = 0;
                                bVar.f156651n = 0;
                                bVar.f156652p = 0;
                                bVar.f156655s = 1;
                                objC = aVar2.c(params, bVar);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    bVar2 = aVar3;
                                    bVar2.a((dx.i) objC);
                                }
                            } else {
                                if (zBooleanValue) {
                                    throw new oq.p();
                                }
                                q34.w.Params params2 = new q34.w.Params(qy2.f.a(aVar));
                                bVar.f156642d = vq.j.a(str);
                                bVar.f156643e = vq.j.a(aVar);
                                bVar.f156644f = jVarA;
                                bVar.f156645g = vq.j.a(aVar3);
                                bVar.f156646h = vq.j.a(aVar3);
                                bVar.f156648k = 0;
                                bVar.f156649l = 0;
                                bVar.f156650m = 0;
                                bVar.f156651n = 0;
                                bVar.f156652p = 0;
                                bVar.f156655s = 2;
                                if (wVar.c(params2, bVar) != objE) {
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            str = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(str));
                            iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar2 = (ex.b) bVar.f156647j;
                        jVar = (dx.j) bVar.f156644f;
                        try {
                            oq.u.b(objC);
                            bVar2.a((dx.i) objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            dx.j<dx.b> jVar2 = jVar;
                            e = e25;
                            str = jVar2;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(str));
                            iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        @Override // py2.a
        public Object f(rq0.b bVar, er.a<oq.i0> aVar, tq.e<? super dx.i<? extends dx.b, DialogData>> eVar) {
            return this.f156636g.c(new j34.d.Params(bVar, aVar, null, 4, null), eVar);
        }
    }

    private x6() {
    }

    public final py2.a a(c54.b isFeatureEnabledUseCase, q34.x0 getMostImportantUserDocumentDataUseCase, w24.x0 getMainDocumentUserDataUC, w24.z0 getMidwifeCardDataUC, w24.d1 getNurseCardDataUC, q34.a1 getPwzNurseCardFromContainerUseCase, w24.k0 getDocumentValidityStatusUC, q34.j0 getDocumentValidityStatusUseCase, k24.a deleteDocumentByIdUC, q34.w deleteDocumentUseCase, j34.d getDocumentDeletionDialogUC) {
        return new a(isFeatureEnabledUseCase, getNurseCardDataUC, getMidwifeCardDataUC, getPwzNurseCardFromContainerUseCase, deleteDocumentByIdUC, deleteDocumentUseCase, getDocumentDeletionDialogUC, getMainDocumentUserDataUC, getMostImportantUserDocumentDataUseCase, getDocumentValidityStatusUC, getDocumentValidityStatusUseCase);
    }
}
