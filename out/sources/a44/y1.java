package a44;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b \u0010!J.\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0$2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b%\u0010&J(\u0010'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b'\u0010(J$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001d0+2\u0006\u0010*\u001a\u00020)H\u0096B¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"La44/y1;", "Lq34/x1;", "Lpx/d;", "remoteLogger", "Lp34/a;", "documentsRepository", "Lmz3/a0;", "updateDocumentDownloadStatusUseCase", "Ls54/k;", "setLocalNotificationUseCase", "Lq34/a2;", "updateDocumentTimerDataSourceUC", "Lq34/l1;", "isDocumentStoredByIdUC", "<init>", "(Lpx/d;Lp34/a;Lmz3/a0;Ls54/k;Lq34/a2;Lq34/l1;)V", "Lrq0/b;", "documentType", "", "documentIID", "Lfz/b$c;", "documentExpirationDate", "", "documentTypeFirstEvent", "Lk34/k;", "methodType", "Lfr0/i;", "documentStoringMode", "Ldx/i$c;", "Loq/i0;", "l", "(Lrq0/b;Ljava/lang/String;Lfz/b$c;ZLk34/k;Lfr0/i;Ltq/e;)Ljava/lang/Object;", "i", "(Lrq0/b;Ljava/lang/String;Lfz/b$c;ZLfr0/i;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "error", "Ldx/i$b;", "k", "(Lrq0/b;Ldx/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "h", "(Lrq0/b;Lk34/k;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lq34/x1$a;", "params", "Ldx/i;", "j", "(Lq34/x1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpx/d;", "b", "Lp34/a;", "c", "Lmz3/a0;", "d", "Ls54/k;", "e", "Lq34/a2;", "f", "Lq34/l1;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y1 implements q34.x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mz3.a0 updateDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s54.k setLocalNotificationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q34.a2 updateDocumentTimerDataSourceUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q34.l1 isDocumentStoredByIdUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f3381c;

        static {
            int[] iArr = new int[rq0.b.d.values().length];
            try {
                iArr[rq0.b.d.RAILWAY_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rq0.b.d.ADVOCATE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rq0.b.d.DEPUTY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rq0.b.d.DIIA_REFUGEE_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rq0.b.d.ID_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rq0.b.d.DIIA_REFUGEE_CHILD_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rq0.b.d.VEHICLE_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rq0.b.d.FAMILY_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[rq0.b.d.DRIVING_LICENCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f3379a = iArr;
            int[] iArr2 = new int[fr0.i.values().length];
            try {
                iArr2[fr0.i.BY_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            f3380b = iArr2;
            int[] iArr3 = new int[k34.k.values().length];
            try {
                iArr3[k34.k.DOCUMENT_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[k34.k.DOCUMENT_REDOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[k34.k.FIRST_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f3381c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3385g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3387j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3385g = obj;
            this.f3387j |= PKIFailureInfo.systemUnavail;
            return y1.this.h(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f3392h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f3393j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f3395l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3393j = obj;
            this.f3395l |= PKIFailureInfo.systemUnavail;
            return y1.this.i(null, null, null, false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f3400h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f3401j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f3402k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f3403l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f3404m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3405n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f3406p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3407q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3408r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f3409s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3410t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f3412w;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3410t = obj;
            this.f3412w |= PKIFailureInfo.systemUnavail;
            return y1.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3415f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f3416g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3418j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3416g = obj;
            this.f3418j |= PKIFailureInfo.systemUnavail;
            return y1.this.k(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f3420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f3421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f3422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f3423h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f3424j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f3425k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f3426l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3428n;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3426l = obj;
            this.f3428n |= PKIFailureInfo.systemUnavail;
            return y1.this.l(null, null, null, false, null, null, this);
        }
    }

    public y1(px.d dVar, p34.a aVar, mz3.a0 a0Var, s54.k kVar, q34.a2 a2Var, q34.l1 l1Var) {
        this.remoteLogger = dVar;
        this.documentsRepository = aVar;
        this.updateDocumentDownloadStatusUseCase = a0Var;
        this.setLocalNotificationUseCase = kVar;
        this.updateDocumentTimerDataSourceUC = a2Var;
        this.isDocumentStoredByIdUC = l1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(rq0.b bVar, k34.k kVar, String str, tq.e<? super String> eVar) throws Throwable {
        b bVar2;
        if (eVar instanceof b) {
            bVar2 = (b) eVar;
            int i15 = bVar2.f3387j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f3387j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar2 = new b(eVar);
            }
        } else {
            bVar2 = new b(eVar);
        }
        Object objC = bVar2.f3385g;
        Object objE = uq.b.e();
        int i16 = bVar2.f3387j;
        if (i16 == 0) {
            oq.u.b(objC);
            q34.l1 l1Var = this.isDocumentStoredByIdUC;
            q34.l1.Params params = new q34.l1.Params(bVar);
            bVar2.f3382d = bVar;
            bVar2.f3383e = kVar;
            bVar2.f3384f = str;
            bVar2.f3387j = 1;
            objC = l1Var.c(params, bVar2);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar2.f3384f;
            kVar = (k34.k) bVar2.f3383e;
            bVar = (rq0.b) bVar2.f3382d;
            oq.u.b(objC);
        }
        boolean zBooleanValue = ((Boolean) objC).booleanValue();
        if (zBooleanValue) {
            return bVar.getReferenceName() + kVar.name() + str;
        }
        if (zBooleanValue) {
            throw new oq.p();
        }
        return bVar.getReferenceName() + kVar.name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(rq0.b bVar, String str, fz.b.LocalDate localDate, boolean z15, fr0.i iVar, tq.e<? super dx.i.Right<oq.i0>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f3395l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f3395l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f3393j;
        Object objE = uq.b.e();
        int i16 = cVar.f3395l;
        if (i16 == 0) {
            oq.u.b(obj);
            p34.a aVar = this.documentsRepository;
            boolean z16 = false;
            if ((iVar == null ? -1 : a.f3380b[iVar.ordinal()]) != 1 && z15) {
                z16 = true;
            }
            k34.i.Added added = new k34.i.Added(bVar, str, localDate, z16);
            cVar.f3388d = vq.j.a(bVar);
            cVar.f3389e = vq.j.a(str);
            cVar.f3390f = vq.j.a(localDate);
            cVar.f3391g = vq.j.a(iVar);
            cVar.f3392h = z15;
            cVar.f3395l = 1;
            if (aVar.K(added, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return new dx.i.Right(oq.i0.f148189a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(rq0.b bVar, dx.b bVar2, String str, tq.e<? super dx.i.Left<dx.b>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f3418j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f3418j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object obj = eVar2.f3416g;
        Object objE = uq.b.e();
        int i16 = eVar2.f3418j;
        if (i16 == 0) {
            oq.u.b(obj);
            px.d dVar = this.remoteLogger;
            String str2 = "SaveAsyncDocumentsDataUseCase error, onSavedFailure " + bVar;
            List<px.a.Class> listA = px.c.a(this);
            dx.b.Generic generic = bVar2 instanceof dx.b.Generic ? (dx.b.Generic) bVar2 : null;
            dVar.T6(str2, generic != null ? generic.getE() : null, listA);
            mz3.a0 a0Var = this.updateDocumentDownloadStatusUseCase;
            mz3.a0.Params params = new mz3.a0.Params(bVar, lz3.h.CREATING_ERROR, str);
            eVar2.f3413d = vq.j.a(bVar);
            eVar2.f3414e = bVar2;
            eVar2.f3415f = vq.j.a(str);
            eVar2.f3418j = 1;
            if (a0Var.c(params, eVar2) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (dx.b) eVar2.f3414e;
            oq.u.b(obj);
        }
        return new dx.i.Left(bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0117  */
    /* JADX WARN: Code duplicated, block: B:36:0x014a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0184  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e5, code lost:
    
        if (r0.c(r11, r4) == r5) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(rq0.b r18, java.lang.String r19, fz.b.LocalDate r20, boolean r21, k34.k r22, fr0.i r23, tq.e<? super dx.i.Right<oq.i0>> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.y1.l(rq0.b, java.lang.String, fz.b$c, boolean, k34.k, fr0.i, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0684  */
    /* JADX WARN: Code duplicated, block: B:108:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:113:0x0704  */
    /* JADX WARN: Code duplicated, block: B:115:0x0708  */
    /* JADX WARN: Code duplicated, block: B:120:0x0765  */
    /* JADX WARN: Code duplicated, block: B:128:0x079e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0826  */
    /* JADX WARN: Code duplicated, block: B:148:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:150:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:156:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:163:0x0949  */
    /* JADX WARN: Code duplicated, block: B:181:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:186:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:188:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:193:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:218:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:223:0x0bf2  */
    /* JADX WARN: Code duplicated, block: B:225:0x0bf6  */
    /* JADX WARN: Code duplicated, block: B:230:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:247:0x0ce9  */
    /* JADX WARN: Code duplicated, block: B:252:0x0d34  */
    /* JADX WARN: Code duplicated, block: B:254:0x0d38  */
    /* JADX WARN: Code duplicated, block: B:256:0x0d96 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:259:0x0d9a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0488  */
    /* JADX WARN: Code duplicated, block: B:66:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x0542  */
    /* JADX WARN: Code duplicated, block: B:80:0x059e  */
    /* JADX WARN: Code duplicated, block: B:88:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0623  */
    /* JADX WARN: Code duplicated, block: B:95:0x0627  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x06fd, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x075e, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0942, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x09f7, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0a5e, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0aa1, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0b23, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0beb, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0c5f, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0caa, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0d2e, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0d94, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04cd, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x053b, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0597, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x061c, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x067d, code lost:
    
        if (r2 == r8) goto L256;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x08aa, please report this as an issue */
    @Override // gz.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(q34.x1.Params r20, tq.e<? super dx.i<? extends dx.b, oq.i0>> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a44.y1.c(q34.x1$a, tq.e):java.lang.Object");
    }
}
