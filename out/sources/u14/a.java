package u14;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu14/a;", "Le14/a;", "Li14/d;", "isGpsEnabledUseCase", "Li14/a;", "checkGpsPermissionGrantedUseCase", "<init>", "(Li14/d;Li14/a;)V", "Lgz/b$a$a;", "params", "Le14/a$a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Li14/d;", "b", "Li14/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements e14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i14.d isGpsEnabledUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i14.a checkGpsPermissionGrantedUseCase;

    /* JADX INFO: renamed from: u14.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5060a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f194366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f194367e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f194369g;

        C5060a(tq.e<? super C5060a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f194367e = obj;
            this.f194369g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(i14.d dVar, i14.a aVar) {
        this.isGpsEnabledUseCase = dVar;
        this.checkGpsPermissionGrantedUseCase = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r8 == r1) goto L25;
     */
    @Override // e14.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r7, tq.e<? super e14.a.InterfaceC1068a> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof u14.a.C5060a
            if (r0 == 0) goto L13
            r0 = r8
            u14.a$a r0 = (u14.a.C5060a) r0
            int r1 = r0.f194369g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194369g = r1
            goto L18
        L13:
            u14.a$a r0 = new u14.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f194367e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f194369g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f194366d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L74
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f194366d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L56
        L40:
            oq.u.b(r8)
            i14.a r8 = r6.checkGpsPermissionGrantedUseCase
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r5 = vq.j.a(r7)
            r0.f194366d = r5
            r0.f194369g = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L56
            goto L73
        L56:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L61
            e14.a$a$a r7 = e14.a.InterfaceC1068a.EnumC1069a.NO_PERMISSIONS
            return r7
        L61:
            i14.d r8 = r6.isGpsEnabledUseCase
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r7 = vq.j.a(r7)
            r0.f194366d = r7
            r0.f194369g = r3
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L7f
            e14.a$a$a r7 = e14.a.InterfaceC1068a.EnumC1069a.NO_GPS_ENABLED
            return r7
        L7f:
            e14.a$a$b r7 = e14.a.InterfaceC1068a.b.f46876a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u14.a.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
