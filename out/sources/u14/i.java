package u14;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu14/i;", "Le14/g;", "Luy/d;", "gpsManager", "Lgy/a;", "permissionManager", "<init>", "(Luy/d;Lgy/a;)V", "Lgz/b$a$a;", "params", "Lw04/a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Luy/d;", "b", "Lgy/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements e14.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f194385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f194386e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f194388g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f194386e = obj;
            this.f194388g |= PKIFailureInfo.systemUnavail;
            return i.this.a(null, this);
        }
    }

    public i(uy.d dVar, gy.a aVar) {
        this.gpsManager = dVar;
        this.permissionManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r9 == r1) goto L23;
     */
    @Override // e14.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r8, tq.e<? super w04.LocationCoordinates> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof u14.i.a
            if (r0 == 0) goto L13
            r0 = r9
            u14.i$a r0 = (u14.i.a) r0
            int r1 = r0.f194388g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194388g = r1
            goto L18
        L13:
            u14.i$a r0 = new u14.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f194386e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f194388g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f194385d
            gz.b$a$a r8 = (gz.b.a.C1792a) r8
            oq.u.b(r9)
            goto L76
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f194385d
            gz.b$a$a r8 = (gz.b.a.C1792a) r8
            oq.u.b(r9)
            goto L57
        L41:
            oq.u.b(r9)
            gy.a r9 = r7.permissionManager
            gy.d r2 = gy.d.GPS
            java.lang.Object r6 = vq.j.a(r8)
            r0.f194385d = r6
            r0.f194388g = r5
            java.lang.Object r9 = r9.d(r2, r0)
            if (r9 != r1) goto L57
            goto L75
        L57:
            gy.c r9 = (gy.c) r9
            gy.c$a r2 = gy.c.a.f78236a
            boolean r9 = fr.t.c(r9, r2)
            if (r9 == 0) goto Lb3
            uy.d r9 = r7.gpsManager
            mu.g r9 = r9.g()
            java.lang.Object r8 = vq.j.a(r8)
            r0.f194385d = r8
            r0.f194388g = r3
            java.lang.Object r9 = mu.i.z(r9, r0)
            if (r9 != r1) goto L76
        L75:
            return r1
        L76:
            dx.i r9 = (dx.i) r9
            boolean r8 = r9 instanceof dx.i.Right
            if (r8 == 0) goto L9d
            vy.c r8 = new vy.c
            dx.i$c r9 = (dx.i.Right) r9
            java.lang.Object r0 = r9.b()
            vy.c r0 = (vy.Coordinates) r0
            double r0 = r0.getLatitude()
            java.lang.Object r9 = r9.b()
            vy.c r9 = (vy.Coordinates) r9
            double r2 = r9.getLongitude()
            r8.<init>(r0, r2)
            w04.a r9 = new w04.a
            r9.<init>(r8, r5, r5)
            return r9
        L9d:
            boolean r8 = r9 instanceof dx.i.Left
            if (r8 == 0) goto Lad
            t04.b r8 = t04.b.f186822a
            vy.c r8 = r8.b()
            w04.a r9 = new w04.a
            r9.<init>(r8, r4, r5)
            return r9
        Lad:
            oq.p r8 = new oq.p
            r8.<init>()
            throw r8
        Lb3:
            t04.b r8 = t04.b.f186822a
            vy.c r8 = r8.b()
            w04.a r9 = new w04.a
            r9.<init>(r8, r4, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u14.i.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
