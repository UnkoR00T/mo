package s02;

import go0.a0;
import go0.c0;
import go0.d0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p02.i0;
import p02.q;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ls02/g;", "", "Lgz/b$a$a;", "Loq/i0;", "Ls02/c;", "getOwRefreshTokenUseCase", "Lgo0/d0;", "refreshOwTokensUseCase", "Lgo0/c0;", "beRefreshNativeOwTokenUC", "Lp02/q;", "getEdorAddressUseCase", "Ls02/j;", "saveOwRefreshTokenUseCase", "Ls02/i;", "saveOwAccessTokenUseCase", "Lgo0/a0;", "getOAuthConfigurationUseCase", "Lp02/i0;", "isElectronicDeliveryNativeOAuthActivatedUC", "<init>", "(Ls02/c;Lgo0/d0;Lgo0/c0;Lp02/q;Ls02/j;Ls02/i;Lgo0/a0;Lp02/i0;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ls02/c;", "b", "Lgo0/d0;", "c", "Lgo0/c0;", "d", "Lp02/q;", "e", "Ls02/j;", "f", "Ls02/i;", "g", "Lgo0/a0;", "h", "Lp02/i0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c getOwRefreshTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 refreshOwTokensUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c0 beRefreshNativeOwTokenUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q getEdorAddressUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j saveOwRefreshTokenUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i saveOwAccessTokenUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a0 getOAuthConfigurationUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i0 isElectronicDeliveryNativeOAuthActivatedUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f177133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f177134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f177135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f177136h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f177137j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f177138k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f177139l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f177140m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f177141n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f177142p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f177143q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f177145s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177143q = obj;
            this.f177145s |= PKIFailureInfo.systemUnavail;
            return g.this.a(null, this);
        }
    }

    public g(c cVar, d0 d0Var, c0 c0Var, q qVar, j jVar, i iVar, a0 a0Var, i0 i0Var) {
        this.getOwRefreshTokenUseCase = cVar;
        this.refreshOwTokensUseCase = d0Var;
        this.beRefreshNativeOwTokenUC = c0Var;
        this.getEdorAddressUseCase = qVar;
        this.saveOwRefreshTokenUseCase = jVar;
        this.saveOwAccessTokenUseCase = iVar;
        this.getOAuthConfigurationUseCase = a0Var;
        this.isElectronicDeliveryNativeOAuthActivatedUC = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0109  */
    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0137  */
    /* JADX WARN: Code duplicated, block: B:34:0x014d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0153  */
    /* JADX WARN: Code duplicated, block: B:40:0x0181  */
    /* JADX WARN: Code duplicated, block: B:42:0x0192  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0216  */
    /* JADX WARN: Code duplicated, block: B:56:0x0222 A[PHI: r1 r4 r7 r8 r9 r10 r11
      0x0222: PHI (r1v31 dx.i) = (r1v15 dx.i), (r1v33 dx.i) binds: [B:47:0x01bf, B:55:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r4v14 int) = (r4v11 int), (r4v15 int) binds: [B:47:0x01bf, B:55:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r7v20 int) = (r7v16 int), (r7v22 int) binds: [B:47:0x01bf, B:55:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r8v16 iy.b0) = (r8v10 iy.b0), (r8v18 iy.b0) binds: [B:47:0x01bf, B:55:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r9v15 eo0.i0$c) = (r9v10 eo0.i0$c), (r9v18 eo0.i0$c) binds: [B:47:0x01bf, B:55:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r10v17 dx.i) = (r10v12 dx.i), (r10v20 dx.i) binds: [B:47:0x01bf, B:55:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r11v12 gz.b$a$a) = (r11v8 gz.b$a$a), (r11v14 gz.b$a$a) binds: [B:47:0x01bf, B:55:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x022d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x022e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0232  */
    /* JADX WARN: Code duplicated, block: B:65:0x027a  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02bf, code lost:
    
        if (r14.d(r15, r2) == r3) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r18, tq.e<? super dx.i<? extends dx.b, oq.i0>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s02.g.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
