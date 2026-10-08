package ab4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lab4/c;", "", "Lxa4/a;", "platform", "<init>", "(Lxa4/a;)V", "Lza4/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lxa4/a;", "b", "applicationlock"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xa4.a platform;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f5315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f5316e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f5318g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5316e = obj;
            this.f5318g |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    public c(xa4.a aVar) {
        this.platform = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r9.f(0, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r9.f(r2, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tq.e<? super za4.b> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ab4.c.b
            if (r0 == 0) goto L13
            r0 = r9
            ab4.c$b r0 = (ab4.c.b) r0
            int r1 = r0.f5318g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5318g = r1
            goto L18
        L13:
            ab4.c$b r0 = new ab4.c$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f5316e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f5318g
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L44
            if (r2 == r4) goto L3e
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L32
            oq.u.b(r9)
            goto L8f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            oq.u.b(r9)
            goto L7f
        L3e:
            int r2 = r0.f5315d
            oq.u.b(r9)
            goto L71
        L44:
            oq.u.b(r9)
            goto L56
        L48:
            oq.u.b(r9)
            xa4.a r9 = r8.platform
            r0.f5318g = r6
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L56
            goto L8e
        L56:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r2 = r9 + 1
            if (r2 < r5) goto L82
            xa4.a r9 = r8.platform
            long r6 = r9.e()
            r0.f5315d = r2
            r0.f5318g = r4
            java.lang.Object r9 = r9.d(r6, r0)
            if (r9 != r1) goto L71
            goto L8e
        L71:
            xa4.a r9 = r8.platform
            r0.f5315d = r2
            r0.f5318g = r5
            r2 = 0
            java.lang.Object r9 = r9.f(r2, r0)
            if (r9 != r1) goto L7f
            goto L8e
        L7f:
            za4.b r9 = za4.b.EXCEEDED
            return r9
        L82:
            xa4.a r9 = r8.platform
            r0.f5315d = r2
            r0.f5318g = r3
            java.lang.Object r9 = r9.f(r2, r0)
            if (r9 != r1) goto L8f
        L8e:
            return r1
        L8f:
            za4.b r9 = za4.b.WITHIN_RANGE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ab4.c.a(tq.e):java.lang.Object");
    }
}
