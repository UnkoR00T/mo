package ch1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lch1/j0;", "Lgz/b;", "Lgz/b$a$a;", "Loq/i0;", "Lbh1/d;", "servicesDataStoreRepository", "Lbh1/c;", "serviceListDataRepository", "<init>", "(Lbh1/d;Lbh1/c;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lbh1/d;", "b", "Lbh1/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 implements gz.b<gz.b.a.C1792a, oq.i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bh1.d servicesDataStoreRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bh1.c serviceListDataRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f26868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f26869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f26870h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f26872k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26870h = obj;
            this.f26872k |= PKIFailureInfo.systemUnavail;
            return j0.this.a(null, this);
        }
    }

    public j0(bh1.d dVar, bh1.c cVar) {
        this.servicesDataStoreRepository = dVar;
        this.serviceListDataRepository = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[PHI: r8
      0x00cc: PHI (r8v2 gz.b$a$a) = (r8v1 gz.b$a$a), (r8v1 gz.b$a$a), (r8v1 gz.b$a$a), (r8v1 gz.b$a$a), (r8v14 gz.b$a$a) binds: [B:22:0x006c, B:24:0x0072, B:26:0x007b, B:32:0x00c9, B:16:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        if (r9.b(r2, r0) == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.j0.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
