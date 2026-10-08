package ch1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lch1/a0;", "Lgz/b;", "Lgz/b$a$a;", "Lk34/u;", "Lyg1/a;", "dashboardContainersInteractor", "<init>", "(Lyg1/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lyg1/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements gz.b<gz.b.a.C1792a, k34.u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f26786f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f26788h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26786f = obj;
            this.f26788h |= PKIFailureInfo.systemUnavail;
            return a0.this.a(null, this);
        }
    }

    public a0(yg1.a aVar) {
        this.dashboardContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r7 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r6, tq.e<? super k34.u> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ch1.a0.a
            if (r0 == 0) goto L13
            r0 = r7
            ch1.a0$a r0 = (ch1.a0.a) r0
            int r1 = r0.f26788h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26788h = r1
            goto L18
        L13:
            ch1.a0$a r0 = new ch1.a0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26786f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f26788h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f26785e
            k34.u r6 = (k34.u) r6
            java.lang.Object r6 = r0.f26784d
            gz.b$a$a r6 = (gz.b.a.C1792a) r6
            oq.u.b(r7)
            goto L7c
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f26784d
            gz.b$a$a r6 = (gz.b.a.C1792a) r6
            oq.u.b(r7)
            goto L58
        L44:
            oq.u.b(r7)
            yg1.a r7 = r5.dashboardContainersInteractor
            java.lang.Object r2 = vq.j.a(r6)
            r0.f26784d = r2
            r0.f26788h = r4
            java.lang.Object r7 = r7.a(r4, r0)
            if (r7 != r1) goto L58
            goto L7b
        L58:
            dx.i r7 = (dx.i) r7
            java.lang.Object r7 = r7.a()
            k34.u r7 = (k34.u) r7
            if (r7 == 0) goto L64
            r6 = 0
            return r6
        L64:
            yg1.a r2 = r5.dashboardContainersInteractor
            java.lang.Object r6 = vq.j.a(r6)
            r0.f26784d = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f26785e = r6
            r0.f26788h = r3
            r6 = 0
            java.lang.Object r7 = r2.a(r6, r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            dx.i r7 = (dx.i) r7
            java.lang.Object r6 = r7.a()
            k34.u r6 = (k34.u) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.a0.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
