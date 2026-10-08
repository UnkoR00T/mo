package ev0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lev0/b;", "Lev0/a;", "Ldv0/c;", "repository", "<init>", "(Ldv0/c;)V", "Lev0/a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lev0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Ldv0/c;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ev0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dv0.c repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f53773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f53774e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f53776g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f53774e = obj;
            this.f53776g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(dv0.c cVar) {
        this.repository = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r7 == r1) goto L26;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(ev0.a.Params r6, tq.e<? super dx.i<? extends dx.b, oq.i0>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ev0.b.a
            if (r0 == 0) goto L13
            r0 = r7
            ev0.b$a r0 = (ev0.b.a) r0
            int r1 = r0.f53776g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53776g = r1
            goto L18
        L13:
            ev0.b$a r0 = new ev0.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53774e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f53776g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f53773d
            ev0.a$a r6 = (ev0.a.Params) r6
            oq.u.b(r7)
            goto L76
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f53773d
            ev0.a$a r6 = (ev0.a.Params) r6
            oq.u.b(r7)
            return r7
        L40:
            oq.u.b(r7)
            boolean r7 = r6.getSubscribe()
            if (r7 != r4) goto L5f
            dv0.c r7 = r5.repository
            java.lang.String r2 = r6.getIsoCode()
            java.lang.Object r6 = vq.j.a(r6)
            r0.f53773d = r6
            r0.f53776g = r4
            java.lang.Object r6 = r7.d(r2, r0)
            if (r6 != r1) goto L5e
            goto L75
        L5e:
            return r6
        L5f:
            if (r7 != 0) goto L90
            dv0.c r7 = r5.repository
            java.lang.String r2 = r6.getIsoCode()
            java.lang.Object r6 = vq.j.a(r6)
            r0.f53773d = r6
            r0.f53776g = r3
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            dx.i r7 = (dx.i) r7
            boolean r6 = r7 instanceof dx.i.Left
            if (r6 == 0) goto L8f
            r6 = r7
            dx.i$b r6 = (dx.i.Left) r6
            java.lang.Object r6 = r6.b()
            boolean r6 = r6 instanceof dx.b.g.c
            if (r6 == 0) goto L8f
            dx.i$c r6 = new dx.i$c
            oq.i0 r7 = oq.i0.f148189a
            r6.<init>(r7)
            return r6
        L8f:
            return r7
        L90:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ev0.b.c(ev0.a$a, tq.e):java.lang.Object");
    }
}
