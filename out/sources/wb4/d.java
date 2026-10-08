package wb4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwb4/d;", "Lqb4/d;", "Lvb4/a;", "biometricRepository", "Lub4/a;", "biometricUserInteractor", "<init>", "(Lvb4/a;Lub4/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lvb4/a;", "b", "Lub4/a;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements qb4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vb4.a biometricRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ub4.a biometricUserInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f211985e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f211987g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211985e = obj;
            this.f211987g |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    public d(vb4.a aVar, ub4.a aVar2) {
        this.biometricRepository = aVar;
        this.biometricUserInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r8.b(r2, r0) == r1) goto L21;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof wb4.d.a
            if (r0 == 0) goto L13
            r0 = r8
            wb4.d$a r0 = (wb4.d.a) r0
            int r1 = r0.f211987g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211987g = r1
            goto L18
        L13:
            wb4.d$a r0 = new wb4.d$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f211985e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f211987g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f211984d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L71
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f211984d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L56
        L40:
            oq.u.b(r8)
            vb4.a r8 = r6.biometricRepository
            pb4.d r2 = pb4.d.DISABLED
            java.lang.Object r5 = vq.j.a(r7)
            r0.f211984d = r5
            r0.f211987g = r4
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L56
            goto L70
        L56:
            ub4.a r8 = r6.biometricUserInteractor
            iy.a0$a r2 = iy.a0.INSTANCE
            iy.a0 r2 = r2.a()
            iy.a0 r2 = qy.b.b(r2)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f211984d = r7
            r0.f211987g = r3
            java.lang.Object r7 = r8.b(r2, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wb4.d.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
