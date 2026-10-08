package ab4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lab4/a;", "", "Lxa4/a;", "platform", "<init>", "(Lxa4/a;)V", "Lza4/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lxa4/a;", "b", "applicationlock"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xa4.a platform;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f5304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f5305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5306f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5308h;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5306f = obj;
            this.f5308h |= PKIFailureInfo.systemUnavail;
            return a.this.a(this);
        }
    }

    public a(xa4.a aVar) {
        this.platform = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r9.d(r6, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tq.e<? super za4.a> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ab4.a.b
            if (r0 == 0) goto L13
            r0 = r9
            ab4.a$b r0 = (ab4.a.b) r0
            int r1 = r0.f5308h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5308h = r1
            goto L18
        L13:
            ab4.a$b r0 = new ab4.a$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f5306f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f5308h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oq.u.b(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            oq.u.b(r9)
            goto L46
        L38:
            oq.u.b(r9)
            xa4.a r9 = r8.platform
            r0.f5308h = r4
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L46
            goto L64
        L46:
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            xa4.a r9 = r8.platform
            long r6 = r9.e()
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L68
            xa4.a r9 = r8.platform
            r0.f5304d = r4
            r0.f5305e = r6
            r0.f5308h = r3
            java.lang.Object r9 = r9.d(r6, r0)
            if (r9 != r1) goto L65
        L64:
            return r1
        L65:
            za4.a r9 = za4.a.LOCKED
            return r9
        L68:
            r0 = 0
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 == 0) goto L78
            r0 = 300(0x12c, double:1.48E-321)
            long r4 = r4 + r0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto L78
            za4.a r9 = za4.a.LOCKED
            return r9
        L78:
            za4.a r9 = za4.a.UNLOCKED
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ab4.a.a(tq.e):java.lang.Object");
    }
}
