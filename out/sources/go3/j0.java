package go3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgo3/j0;", "Lxn3/a;", "Lgo3/d;", "fetchQrCodeDataUseCase", "Lgo3/f0;", "loadInstitutionsDataUseCase", "Lgo3/k0;", "sendDataToInstitutionUseCase", "<init>", "(Lgo3/d;Lgo3/f0;Lgo3/k0;)V", "Lxn3/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lxn3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/d;", "b", "Lgo3/f0;", "c", "Lgo3/k0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 implements xn3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d fetchQrCodeDataUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f0 loadInstitutionsDataUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k0 sendDataToInstitutionUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75494f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75495g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75496h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75497j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f75498k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75499l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75500m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75501n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f75503q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75501n = obj;
            this.f75503q |= PKIFailureInfo.systemUnavail;
            return j0.this.c(null, this);
        }
    }

    public j0(d dVar, f0 f0Var, k0 k0Var) {
        this.fetchQrCodeDataUseCase = dVar;
        this.loadInstitutionsDataUseCase = f0Var;
        this.sendDataToInstitutionUseCase = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
    
        if (r15 == r1) goto L37;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(xn3.a.Params r14, tq.e<? super dx.i<? extends dx.b, oq.i0>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.j0.c(xn3.a$a, tq.e):java.lang.Object");
    }
}
