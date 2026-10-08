package o14;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lo14/c;", "La14/c;", "Liz/a;", "webViewManager", "<init>", "(Liz/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Liz/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a14.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iz.a webViewManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f140574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f140575e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f140577g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f140575e = obj;
            this.f140577g |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(iz.a aVar) {
        this.webViewManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r7.a(r0) == r1) goto L21;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o14.c.a
            if (r0 == 0) goto L13
            r0 = r7
            o14.c$a r0 = (o14.c.a) r0
            int r1 = r0.f140577g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140577g = r1
            goto L18
        L13:
            o14.c$a r0 = new o14.c$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f140575e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f140577g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f140574d
            gz.b$a$a r6 = (gz.b.a.C1792a) r6
            oq.u.b(r7)
            goto L65
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f140574d
            gz.b$a$a r6 = (gz.b.a.C1792a) r6
            oq.u.b(r7)
            goto L54
        L40:
            oq.u.b(r7)
            iz.a r7 = r5.webViewManager
            java.lang.Object r2 = vq.j.a(r6)
            r0.f140574d = r2
            r0.f140577g = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L54
            goto L64
        L54:
            iz.a r7 = r5.webViewManager
            java.lang.Object r6 = vq.j.a(r6)
            r0.f140574d = r6
            r0.f140577g = r3
            java.lang.Object r6 = r7.a(r0)
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o14.c.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
