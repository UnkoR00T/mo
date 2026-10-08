package wb4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lwb4/i;", "Lqb4/i;", "Lvb4/a;", "biometricRepository", "Lub4/a;", "biometricUserInteractor", "<init>", "(Lvb4/a;Lub4/a;)V", "Lqb4/i$a;", "params", "Loq/i0;", "d", "(Lqb4/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lvb4/a;", "b", "Lub4/a;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements qb4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vb4.a biometricRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ub4.a biometricUserInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f212034e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212036g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212034e = obj;
            this.f212036g |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    public i(vb4.a aVar, ub4.a aVar2) {
        this.biometricRepository = aVar;
        this.biometricUserInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r7.b(r2, r0) == r1) goto L21;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(qb4.i.Params r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wb4.i.a
            if (r0 == 0) goto L13
            r0 = r7
            wb4.i$a r0 = (wb4.i.a) r0
            int r1 = r0.f212036g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212036g = r1
            goto L18
        L13:
            wb4.i$a r0 = new wb4.i$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f212034e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f212036g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f212033d
            qb4.i$a r6 = (qb4.i.Params) r6
            oq.u.b(r7)
            goto L69
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f212033d
            qb4.i$a r6 = (qb4.i.Params) r6
            oq.u.b(r7)
            goto L54
        L40:
            oq.u.b(r7)
            vb4.a r7 = r5.biometricRepository
            pb4.d r2 = r6.getBiometricInAppStatus()
            r0.f212033d = r6
            r0.f212036g = r4
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L54
            goto L68
        L54:
            ub4.a r7 = r5.biometricUserInteractor
            iy.a0 r2 = r6.getWrappedMasterKey()
            java.lang.Object r6 = vq.j.a(r6)
            r0.f212033d = r6
            r0.f212036g = r3
            java.lang.Object r6 = r7.b(r2, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wb4.i.c(qb4.i$a, tq.e):java.lang.Object");
    }
}
