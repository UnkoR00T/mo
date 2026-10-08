package ch1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lch1/q;", "Lch1/p;", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lpx/d;", "remoteLogger", "<init>", "(Lq34/j0;Lmz3/q;Lpx/d;)V", "Lch1/p$a;", "params", "Llz3/h;", "d", "(Lch1/p$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq34/j0;", "b", "Lmz3/q;", "c", "Lpx/d;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q34.j0 getDocumentValidityStatusUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27011b;

        static {
            int[] iArr = new int[lz3.h.values().length];
            try {
                iArr[lz3.h.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lz3.h.TAKES_TOO_LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lz3.h.CREATING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27010a = iArr;
            int[] iArr2 = new int[er0.h.values().length];
            try {
                iArr2[er0.h.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[er0.h.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[er0.h.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[er0.h.ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f27011b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f27014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f27015g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f27016h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f27017j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f27019l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f27017j = obj;
            this.f27019l |= PKIFailureInfo.systemUnavail;
            return q.this.c(null, this);
        }
    }

    public q(q34.j0 j0Var, mz3.q qVar, px.d dVar) {
        this.getDocumentValidityStatusUseCase = j0Var;
        this.getDocumentDownloadStatusUseCase = qVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r12 == r1) goto L44;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(ch1.p.Params r11, tq.e<? super lz3.h> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.q.c(ch1.p$a, tq.e):java.lang.Object");
    }
}
