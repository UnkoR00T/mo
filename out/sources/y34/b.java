package y34;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.h;
import dx.i;
import dx.j;
import java.util.concurrent.CancellationException;
import k34.g;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import q34.i0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly34/b;", "Lj34/d;", "Lmx/c;", "labelProvider", "Lq34/i0;", "getDocumentInfoUC", "Lx34/a;", "documentsInteractor", "<init>", "(Lmx/c;Lq34/i0;Lx34/a;)V", "Lk34/g;", "document", "Lj34/d$a;", "params", "", "descriptionId", "Lcb4/d;", "d", "(Lk34/g;Lj34/d$a;I)Lcb4/d;", "Ldx/i;", "Ldx/b;", "f", "(Lj34/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lq34/i0;", "c", "Lx34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements j34.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 getDocumentInfoUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x34.a documentsInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f223781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f223782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f223783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f223784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f223785h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f223786j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f223787k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f223788l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f223789m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f223790n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f223791p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f223792q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f223793r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f223795t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f223793r = obj;
            this.f223795t |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(mx.c cVar, i0 i0Var, x34.a aVar) {
        this.labelProvider = cVar;
        this.getDocumentInfoUC = i0Var;
        this.documentsInteractor = aVar;
    }

    private final DialogData d(g document, j34.d.Params params, int descriptionId) {
        h.b bVar = h.b.f24985a;
        mx.c cVar = this.labelProvider;
        return new DialogData(bVar, cVar.e(f34.a.f59020j, cVar.c(document.getName()).getText()).n("DeleteDocumentTitle"), this.labelProvider.c(descriptionId).n("DeleteDocumentBody"), new DialogButtonTextData(this.labelProvider.c(f34.a.f59006c), null, params.d(), 2, null), new DialogButtonTextData(this.labelProvider.c(f34.a.f59002a), null, params.c(), 2, null), null, params.c(), 32, null);
    }

    static /* synthetic */ DialogData e(b bVar, g gVar, j34.d.Params params, int i15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            i15 = f34.a.f59018i;
        }
        return bVar.d(gVar, params, i15);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0208 A[Catch: Exception -> 0x01ee, c -> 0x01f2, CancellationException -> 0x01f6, TryCatch #18 {c -> 0x01f2, CancellationException -> 0x01f6, Exception -> 0x01ee, blocks: (B:97:0x01e8, B:112:0x0208, B:114:0x020d, B:113:0x020b, B:125:0x0223, B:126:0x0228), top: B:171:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x020b A[Catch: Exception -> 0x01ee, c -> 0x01f2, CancellationException -> 0x01f6, TryCatch #18 {c -> 0x01f2, CancellationException -> 0x01f6, Exception -> 0x01ee, blocks: (B:97:0x01e8, B:112:0x0208, B:114:0x020d, B:113:0x020b, B:125:0x0223, B:126:0x0228), top: B:171:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0222  */
    /* JADX WARN: Code duplicated, block: B:127:0x0229 A[Catch: Exception -> 0x01d2, c -> 0x01d5, CancellationException -> 0x01d8, TRY_ENTER, TryCatch #22 {Exception -> 0x01d2, blocks: (B:84:0x01c7, B:86:0x01cf, B:94:0x01dd, B:141:0x0266, B:144:0x0275, B:93:0x01db, B:52:0x0113, B:54:0x0117, B:127:0x0229, B:128:0x0250), top: B:163:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x027e  */
    /* JADX WARN: Code duplicated, block: B:150:0x028f  */
    /* JADX WARN: Code duplicated, block: B:151:0x029d  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:176:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0117 A[Catch: Exception -> 0x01d2, c -> 0x01d5, CancellationException -> 0x01d8, TRY_LEAVE, TryCatch #22 {Exception -> 0x01d2, blocks: (B:84:0x01c7, B:86:0x01cf, B:94:0x01dd, B:141:0x0266, B:144:0x0275, B:93:0x01db, B:52:0x0113, B:54:0x0117, B:127:0x0229, B:128:0x0250), top: B:163:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
    /* JADX WARN: Code duplicated, block: B:68:0x016b A[Catch: Exception -> 0x01fa, c -> 0x01fe, CancellationException -> 0x0202, TRY_ENTER, TryCatch #16 {c -> 0x01fe, CancellationException -> 0x0202, Exception -> 0x01fa, blocks: (B:58:0x014f, B:71:0x0175, B:73:0x0185, B:75:0x0189, B:78:0x0191, B:68:0x016b, B:70:0x016f), top: B:174:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x016f A[Catch: Exception -> 0x01fa, c -> 0x01fe, CancellationException -> 0x0202, TryCatch #16 {c -> 0x01fe, CancellationException -> 0x0202, Exception -> 0x01fa, blocks: (B:58:0x014f, B:71:0x0175, B:73:0x0185, B:75:0x0189, B:78:0x0191, B:68:0x016b, B:70:0x016f), top: B:174:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0185 A[Catch: Exception -> 0x01fa, c -> 0x01fe, CancellationException -> 0x0202, TryCatch #16 {c -> 0x01fe, CancellationException -> 0x0202, Exception -> 0x01fa, blocks: (B:58:0x014f, B:71:0x0175, B:73:0x0185, B:75:0x0189, B:78:0x0191, B:68:0x016b, B:70:0x016f), top: B:174:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:77:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cf A[Catch: Exception -> 0x01d2, c -> 0x01d5, CancellationException -> 0x01d8, TryCatch #22 {Exception -> 0x01d2, blocks: (B:84:0x01c7, B:86:0x01cf, B:94:0x01dd, B:141:0x0266, B:144:0x0275, B:93:0x01db, B:52:0x0113, B:54:0x0117, B:127:0x0229, B:128:0x0250), top: B:163:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01db A[Catch: Exception -> 0x01d2, c -> 0x01d5, CancellationException -> 0x01d8, TryCatch #22 {Exception -> 0x01d2, blocks: (B:84:0x01c7, B:86:0x01cf, B:94:0x01dd, B:141:0x0266, B:144:0x0275, B:93:0x01db, B:52:0x0113, B:54:0x0117, B:127:0x0229, B:128:0x0250), top: B:163:0x0027 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x0229, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:158:0x02b2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [j34.d$a] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [j34.d$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, y34.b] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [j34.d$a] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [j34.d$a] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [j34.d$a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(j34.d.Params params, tq.e<? super i<? extends dx.b, DialogData>> eVar) throws Throwable {
        a aVar;
        ?? r15;
        ?? r16;
        String message;
        i iVarA;
        Object objB;
        Object left;
        ?? r17;
        ?? r18;
        j34.d.Params params2;
        ?? r19;
        int i15;
        ex.b bVar;
        ex.b bVar2;
        j34.d.Params params3;
        int i16;
        int i17;
        int i18;
        int i19;
        j<dx.b> jVar;
        g gVar;
        Object objB2;
        j<dx.b> jVar2;
        int i25;
        int i26;
        g gVar2;
        int i27;
        ex.b bVar3;
        g gVar3;
        ?? r110;
        CancellationException e15;
        i iVar;
        Object objA;
        boolean zBooleanValue;
        rq0.b documentType;
        int i28;
        DialogData dialogDataD;
        ?? r25;
        j<dx.b> jVar3;
        g gVar4;
        j<dx.b> jVar4;
        ?? r26;
        ?? r111;
        int i29;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i35 = aVar.f223795t;
            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f223795t = i35 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f223793r;
        Object objE = uq.b.e();
        int i36 = aVar.f223795t;
        try {
            try {
                if (i36 != 0) {
                    if (i36 == 1) {
                        int i37 = aVar.f223791p;
                        i16 = aVar.f223790n;
                        i17 = aVar.f223789m;
                        i18 = aVar.f223788l;
                        int i38 = aVar.f223787k;
                        ex.b bVar4 = (ex.b) aVar.f223784g;
                        bVar = (ex.b) aVar.f223783f;
                        j<dx.b> jVar5 = (j) aVar.f223782e;
                        j34.d.Params params4 = (j34.d.Params) aVar.f223781d;
                        try {
                            u.b(objC);
                            i15 = i37;
                            jVar = jVar5;
                            bVar2 = bVar4;
                            i19 = i38;
                            params3 = params4;
                            try {
                                gVar = (g) objC;
                                if (gVar != null) {
                                    bVar2.b(new dx.b.Generic(new Error("getDocumentInfoUC returned null for " + params3.getDocumentType())));
                                    throw new oq.g();
                                }
                                x34.a aVar2 = this.documentsInteractor;
                                aVar.f223781d = params3;
                                aVar.f223782e = jVar;
                                aVar.f223783f = vq.j.a(bVar);
                                aVar.f223784g = vq.j.a(bVar2);
                                aVar.f223785h = vq.j.a(gVar);
                                aVar.f223786j = gVar;
                                aVar.f223787k = i19;
                                aVar.f223788l = i18;
                                aVar.f223789m = i17;
                                aVar.f223790n = i16;
                                aVar.f223791p = i15;
                                aVar.f223795t = 2;
                                objB2 = aVar2.b(aVar);
                                if (objB2 != objE) {
                                    jVar2 = jVar;
                                    i25 = i15;
                                    i26 = i19;
                                    gVar2 = gVar;
                                    objC = objB2;
                                    i27 = i16;
                                    bVar3 = bVar;
                                    gVar3 = gVar2;
                                    r110 = params3;
                                    iVar = (i) objC;
                                    if (iVar instanceof i.Left) {
                                        objA = vq.b.a(true);
                                    } else {
                                        if (!(iVar instanceof i.Right)) {
                                            throw new p();
                                        }
                                        objA = ((i.Right) iVar).b();
                                    }
                                    zBooleanValue = ((Boolean) objA).booleanValue();
                                    documentType = r110.getDocumentType();
                                    ex.b bVar5 = bVar3;
                                    if (documentType != rq0.b.d.ID_CARD) {
                                        g gVar5 = gVar2;
                                        ?? r27 = r110;
                                        if (zBooleanValue) {
                                            i28 = f34.a.f59016h;
                                        } else {
                                            i28 = f34.a.f59018i;
                                        }
                                        dialogDataD = d(gVar5, r27, i28);
                                        r25 = r27;
                                    } else {
                                        g gVar6 = gVar2;
                                        ?? r28 = r110;
                                        if (zBooleanValue) {
                                            i28 = f34.a.f59016h;
                                        } else {
                                            i28 = f34.a.f59018i;
                                        }
                                        dialogDataD = d(gVar6, r28, i28);
                                        r25 = r28;
                                    }
                                    jVar3 = jVar2;
                                    r26 = r25;
                                    left = new i.Right(dialogDataD);
                                    r18 = r26;
                                }
                                return objE;
                            } catch (ex.c e16) {
                                e = e16;
                                r19 = params3;
                                left = new i.Left((dx.b) ex.d.a(e));
                                r17 = r19;
                                r18 = r17;
                                if (left instanceof i.Left) {
                                    dx.b bVar6 = (dx.b) ((i.Left) left).b();
                                    f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar6, null, px.c.a(this), 2, null);
                                }
                                return left;
                            } catch (CancellationException e17) {
                                throw e17;
                            }
                        } catch (ex.c e18) {
                            e = e18;
                            r19 = params4;
                            left = new i.Left((dx.b) ex.d.a(e));
                            r17 = r19;
                            r18 = r17;
                            if (left instanceof i.Left) {
                                dx.b bVar7 = (dx.b) ((i.Left) left).b();
                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar7, null, px.c.a(this), 2, null);
                            }
                            return left;
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r16 = jVar5;
                            r15 = params4;
                            f fVar = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            left = new i.Left(objB);
                            r17 = r15;
                            r18 = r17;
                            if (left instanceof i.Left) {
                                dx.b bVar8 = (dx.b) ((i.Left) left).b();
                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar8, null, px.c.a(this), 2, null);
                            }
                            return left;
                        }
                    }
                    if (i36 == 2) {
                        i25 = aVar.f223791p;
                        i27 = aVar.f223790n;
                        i17 = aVar.f223789m;
                        i18 = aVar.f223788l;
                        i26 = aVar.f223787k;
                        gVar2 = (g) aVar.f223786j;
                        gVar3 = (g) aVar.f223785h;
                        bVar2 = (ex.b) aVar.f223784g;
                        ex.b bVar9 = (ex.b) aVar.f223783f;
                        jVar2 = (j) aVar.f223782e;
                        j34.d.Params params5 = (j34.d.Params) aVar.f223781d;
                        try {
                            u.b(objC);
                            r110 = params5;
                            bVar3 = bVar9;
                            jVar2 = jVar2;
                            try {
                                iVar = (i) objC;
                                try {
                                    if (iVar instanceof i.Left) {
                                        try {
                                            objA = vq.b.a(true);
                                        } catch (ex.c e26) {
                                            e = e26;
                                            r19 = r110;
                                            left = new i.Left((dx.b) ex.d.a(e));
                                            r17 = r19;
                                            r18 = r17;
                                            if (left instanceof i.Left) {
                                                dx.b bVar10 = (dx.b) ((i.Left) left).b();
                                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar10, null, px.c.a(this), 2, null);
                                            }
                                            return left;
                                        } catch (CancellationException e27) {
                                            e15 = e27;
                                            throw e15;
                                        } catch (Exception e28) {
                                            e = e28;
                                            r16 = jVar2;
                                            r15 = r110;
                                            f fVar2 = f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar2.d(message, e, px.c.a(r16));
                                            iVarA = r16.a(e);
                                            if (iVarA instanceof i.Left) {
                                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof i.Right) {
                                                    throw new p();
                                                }
                                                objB = ((i.Right) iVarA).b();
                                            }
                                            left = new i.Left(objB);
                                            r17 = r15;
                                            r18 = r17;
                                            if (left instanceof i.Left) {
                                                dx.b bVar11 = (dx.b) ((i.Left) left).b();
                                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar11, null, px.c.a(this), 2, null);
                                            }
                                            return left;
                                        }
                                    } else {
                                        if (!(iVar instanceof i.Right)) {
                                            throw new p();
                                        }
                                        objA = ((i.Right) iVar).b();
                                    }
                                    zBooleanValue = ((Boolean) objA).booleanValue();
                                    documentType = r110.getDocumentType();
                                    ex.b bVar12 = bVar3;
                                    if (documentType != rq0.b.d.ID_CARD || documentType == rq0.b.d.STUDENT_CARD || documentType == rq0.b.d.DIIA_REFUGEE_CARD) {
                                        g gVar7 = gVar2;
                                        ?? r29 = r110;
                                        if (zBooleanValue) {
                                            i28 = f34.a.f59016h;
                                        } else {
                                            i28 = f34.a.f59018i;
                                        }
                                        dialogDataD = d(gVar7, r29, i28);
                                        r25 = r29;
                                    } else {
                                        if (documentType == rq0.b.d.VEHICLE_CARD) {
                                            x34.a aVar3 = this.documentsInteractor;
                                            aVar.f223781d = r110;
                                            aVar.f223782e = jVar2;
                                            aVar.f223783f = vq.j.a(bVar12);
                                            aVar.f223784g = vq.j.a(bVar2);
                                            aVar.f223785h = vq.j.a(gVar3);
                                            aVar.f223786j = gVar2;
                                            aVar.f223787k = i26;
                                            aVar.f223788l = i18;
                                            aVar.f223789m = i17;
                                            aVar.f223790n = i27;
                                            aVar.f223791p = i25;
                                            aVar.f223792q = zBooleanValue;
                                            aVar.f223795t = 3;
                                            objC = aVar3.c(aVar);
                                            if (objC != objE) {
                                                gVar4 = gVar2;
                                                jVar4 = jVar2;
                                                r111 = r110;
                                                if (((Boolean) objC).booleanValue()) {
                                                    i29 = f34.a.f59018i;
                                                } else {
                                                    i29 = f34.a.f59022k;
                                                }
                                                dialogDataD = d(gVar4, r111, i29);
                                                r26 = r111;
                                                jVar3 = jVar4;
                                                left = new i.Right(dialogDataD);
                                                r18 = r26;
                                            }
                                            return objE;
                                        }
                                        ?? r35 = r110;
                                        dialogDataD = e(this, gVar2, r35, 0, 4, null);
                                        r25 = r35;
                                    }
                                    jVar3 = jVar2;
                                    r26 = r25;
                                    left = new i.Right(dialogDataD);
                                    r18 = r26;
                                } catch (ex.c e29) {
                                    e = e29;
                                    r110 = objE;
                                } catch (CancellationException e35) {
                                    e15 = e35;
                                } catch (Exception e36) {
                                    e = e36;
                                    r110 = objE;
                                }
                            } catch (ex.c e37) {
                                e = e37;
                            } catch (CancellationException e38) {
                                e15 = e38;
                            } catch (Exception e39) {
                                e = e39;
                            }
                        } catch (ex.c e45) {
                            e = e45;
                            r110 = params5;
                            r19 = r110;
                            left = new i.Left((dx.b) ex.d.a(e));
                            r17 = r19;
                            r18 = r17;
                            if (left instanceof i.Left) {
                                dx.b bVar13 = (dx.b) ((i.Left) left).b();
                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar13, null, px.c.a(this), 2, null);
                            }
                            return left;
                        } catch (CancellationException e46) {
                            e15 = e46;
                            throw e15;
                        } catch (Exception e47) {
                            e = e47;
                            r110 = params5;
                            r16 = jVar2;
                            r15 = r110;
                            f fVar3 = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            left = new i.Left(objB);
                            r17 = r15;
                            r18 = r17;
                            if (left instanceof i.Left) {
                                dx.b bVar14 = (dx.b) ((i.Left) left).b();
                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar14, null, px.c.a(this), 2, null);
                            }
                            return left;
                        }
                    } else {
                        if (i36 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gVar4 = (g) aVar.f223786j;
                        j<dx.b> jVar6 = (j) aVar.f223782e;
                        j34.d.Params params6 = (j34.d.Params) aVar.f223781d;
                        try {
                            u.b(objC);
                            r111 = params6;
                            jVar4 = jVar6;
                            if (((Boolean) objC).booleanValue()) {
                                i29 = f34.a.f59018i;
                            } else {
                                i29 = f34.a.f59022k;
                            }
                            dialogDataD = d(gVar4, r111, i29);
                            r26 = r111;
                            jVar3 = jVar4;
                            try {
                                left = new i.Right(dialogDataD);
                                r18 = r26;
                            } catch (ex.c e48) {
                                e = e48;
                                r19 = r26;
                                left = new i.Left((dx.b) ex.d.a(e));
                                r17 = r19;
                                r18 = r17;
                            } catch (CancellationException e49) {
                                throw e49;
                            } catch (Exception e55) {
                                e = e55;
                                r15 = r26;
                                r16 = jVar3;
                                f fVar4 = f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar4.d(message, e, px.c.a(r16));
                                iVarA = r16.a(e);
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof i.Right) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                left = new i.Left(objB);
                                r17 = r15;
                                r18 = r17;
                            }
                        } catch (ex.c e56) {
                            e = e56;
                            r19 = params6;
                            left = new i.Left((dx.b) ex.d.a(e));
                            r17 = r19;
                            r18 = r17;
                            if (left instanceof i.Left) {
                                dx.b bVar15 = (dx.b) ((i.Left) left).b();
                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar15, null, px.c.a(this), 2, null);
                            }
                            return left;
                        } catch (CancellationException e57) {
                            throw e57;
                        } catch (Exception e58) {
                            e = e58;
                            r15 = params6;
                            r16 = jVar6;
                            f fVar5 = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar5.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            left = new i.Left(objB);
                            r17 = r15;
                            r18 = r17;
                            if (left instanceof i.Left) {
                                dx.b bVar16 = (dx.b) ((i.Left) left).b();
                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar16, null, px.c.a(this), 2, null);
                            }
                            return left;
                        }
                    }
                    r18 = r17;
                } else {
                    u.b(objC);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar4 = new ex.a();
                        i0 i0Var = this.getDocumentInfoUC;
                        i0.Params params7 = new i0.Params(params.getDocumentType());
                        params2 = params;
                        try {
                            aVar.f223781d = params2;
                            aVar.f223782e = jVarA;
                            aVar.f223783f = vq.j.a(aVar4);
                            aVar.f223784g = aVar4;
                            i15 = 0;
                            aVar.f223787k = 0;
                            aVar.f223788l = 0;
                            aVar.f223789m = 0;
                            aVar.f223790n = 0;
                            aVar.f223791p = 0;
                            aVar.f223795t = 1;
                            Object objC2 = i0Var.c(params7, aVar);
                            if (objC2 != objE) {
                                bVar = aVar4;
                                bVar2 = bVar;
                                objC = objC2;
                                params3 = params2;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                jVar = jVarA;
                                gVar = (g) objC;
                                if (gVar != null) {
                                    bVar2.b(new dx.b.Generic(new Error("getDocumentInfoUC returned null for " + params3.getDocumentType())));
                                    throw new oq.g();
                                }
                                x34.a aVar5 = this.documentsInteractor;
                                aVar.f223781d = params3;
                                aVar.f223782e = jVar;
                                aVar.f223783f = vq.j.a(bVar);
                                aVar.f223784g = vq.j.a(bVar2);
                                aVar.f223785h = vq.j.a(gVar);
                                aVar.f223786j = gVar;
                                aVar.f223787k = i19;
                                aVar.f223788l = i18;
                                aVar.f223789m = i17;
                                aVar.f223790n = i16;
                                aVar.f223791p = i15;
                                aVar.f223795t = 2;
                                objB2 = aVar5.b(aVar);
                                if (objB2 != objE) {
                                    jVar2 = jVar;
                                    i25 = i15;
                                    i26 = i19;
                                    gVar2 = gVar;
                                    objC = objB2;
                                    i27 = i16;
                                    bVar3 = bVar;
                                    gVar3 = gVar2;
                                    r110 = params3;
                                    iVar = (i) objC;
                                    if (iVar instanceof i.Left) {
                                        objA = vq.b.a(true);
                                    } else {
                                        if (!(iVar instanceof i.Right)) {
                                            throw new p();
                                        }
                                        objA = ((i.Right) iVar).b();
                                    }
                                    zBooleanValue = ((Boolean) objA).booleanValue();
                                    documentType = r110.getDocumentType();
                                    ex.b bVar17 = bVar3;
                                    if (documentType != rq0.b.d.ID_CARD) {
                                        g gVar8 = gVar2;
                                        ?? r210 = r110;
                                        if (zBooleanValue) {
                                            i28 = f34.a.f59016h;
                                        } else {
                                            i28 = f34.a.f59018i;
                                        }
                                        dialogDataD = d(gVar8, r210, i28);
                                        r25 = r210;
                                    } else {
                                        g gVar9 = gVar2;
                                        ?? r211 = r110;
                                        if (zBooleanValue) {
                                            i28 = f34.a.f59016h;
                                        } else {
                                            i28 = f34.a.f59018i;
                                        }
                                        dialogDataD = d(gVar9, r211, i28);
                                        r25 = r211;
                                    }
                                    jVar3 = jVar2;
                                    r26 = r25;
                                    left = new i.Right(dialogDataD);
                                    r18 = r26;
                                }
                            }
                            return objE;
                        } catch (ex.c e59) {
                            e = e59;
                            r19 = params2;
                            left = new i.Left((dx.b) ex.d.a(e));
                            r17 = r19;
                            r18 = r17;
                            if (left instanceof i.Left) {
                                dx.b bVar18 = (dx.b) ((i.Left) left).b();
                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar18, null, px.c.a(this), 2, null);
                            }
                            return left;
                        } catch (CancellationException e65) {
                            e = e65;
                            throw e;
                        } catch (Exception e66) {
                            e = e66;
                            r15 = params2;
                            r16 = jVarA;
                            f fVar6 = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar6.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            left = new i.Left(objB);
                            r17 = r15;
                            r18 = r17;
                            if (left instanceof i.Left) {
                                dx.b bVar19 = (dx.b) ((i.Left) left).b();
                                f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar19, null, px.c.a(this), 2, null);
                            }
                            return left;
                        }
                    } catch (ex.c e67) {
                        e = e67;
                        params2 = params;
                    } catch (CancellationException e68) {
                        e = e68;
                        params2 = params;
                    } catch (Exception e69) {
                        e = e69;
                        params2 = params;
                    }
                }
            } catch (CancellationException e75) {
                throw e75;
            }
        } catch (Exception e76) {
            e = e76;
            r16 = i36;
        }
        if (left instanceof i.Left) {
            dx.b bVar110 = (dx.b) ((i.Left) left).b();
            f.e(f.f163100a, "Failed to create " + r18.getDocumentType() + " deletion dialog: " + bVar110, null, px.c.a(this), 2, null);
        }
        return left;
    }
}
