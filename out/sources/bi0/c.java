package bi0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbi0/c;", "Luh0/c;", "Lai0/e;", "asyncActivationControllerRepository", "Ljx/d;", "deviceInfo", "Liy/a;", "base64Coder", "<init>", "(Lai0/e;Ljx/d;Liy/a;)V", "Luh0/c$a;", "params", "Ldx/i;", "Ldx/b;", "Luh0/c$b;", "d", "(Luh0/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lai0/e;", "b", "Ljx/d;", "c", "Liy/a;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements uh0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ai0.e asyncActivationControllerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jx.d deviceInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f19773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f19774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f19775f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f19776g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f19777h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f19778j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f19779k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f19780l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f19781m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f19782n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f19783p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f19784q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f19786s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f19784q = obj;
            this.f19786s |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(ai0.e eVar, jx.d dVar, iy.a aVar) {
        this.asyncActivationControllerRepository = eVar;
        this.deviceInfo = dVar;
        this.base64Coder = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb A[Catch: Exception -> 0x0106, c -> 0x010c, CancellationException -> 0x0112, TryCatch #5 {c -> 0x010c, CancellationException -> 0x0112, Exception -> 0x0106, blocks: (B:52:0x015b, B:55:0x0162, B:57:0x0166, B:59:0x017d, B:60:0x0182, B:32:0x00e4, B:35:0x00eb, B:37:0x00ef, B:45:0x0118, B:46:0x011d, B:27:0x0083, B:29:0x00ae, B:47:0x011e, B:49:0x0126, B:61:0x0183, B:62:0x0188), top: B:83:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef A[Catch: Exception -> 0x0106, c -> 0x010c, CancellationException -> 0x0112, TryCatch #5 {c -> 0x010c, CancellationException -> 0x0112, Exception -> 0x0106, blocks: (B:52:0x015b, B:55:0x0162, B:57:0x0166, B:59:0x017d, B:60:0x0182, B:32:0x00e4, B:35:0x00eb, B:37:0x00ef, B:45:0x0118, B:46:0x011d, B:27:0x0083, B:29:0x00ae, B:47:0x011e, B:49:0x0126, B:61:0x0183, B:62:0x0188), top: B:83:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0118 A[Catch: Exception -> 0x0106, c -> 0x010c, CancellationException -> 0x0112, TryCatch #5 {c -> 0x010c, CancellationException -> 0x0112, Exception -> 0x0106, blocks: (B:52:0x015b, B:55:0x0162, B:57:0x0166, B:59:0x017d, B:60:0x0182, B:32:0x00e4, B:35:0x00eb, B:37:0x00ef, B:45:0x0118, B:46:0x011d, B:27:0x0083, B:29:0x00ae, B:47:0x011e, B:49:0x0126, B:61:0x0183, B:62:0x0188), top: B:83:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0158, code lost:
    
        if (r0 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, uh0.c$a] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32, types: [uh0.c$a] */
    /* JADX WARN: Type inference failed for: r12v36, types: [uh0.c$a] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(uh0.c.Params r12, tq.e<? super dx.i<? extends dx.b, uh0.c.Result>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.c.c(uh0.c$a, tq.e):java.lang.Object");
    }
}
