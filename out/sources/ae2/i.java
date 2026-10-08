package ae2;

import a14.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lae2/i;", "Lgz/b;", "Lgz/b$a$a;", "Lae2/i$a;", "Li14/d;", "isGpsEnabledUseCase", "La14/y;", "requestPermissionUseCase", "<init>", "(Li14/d;La14/y;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Li14/d;", "b", "La14/y;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b<gz.b.a.C1792a, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i14.d isGpsEnabledUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y requestPermissionUseCase;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lae2/i$a;", "", "c", "b", "a", "Lae2/i$a$a;", "Lae2/i$a$b;", "Lae2/i$a$c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ae2.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lae2/i$a$a;", "Lae2/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0117a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0117a f5589a = new C0117a();

            private C0117a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0117a);
            }

            public int hashCode() {
                return -1173339446;
            }

            public String toString() {
                return "NoGpsEnabled";
            }
        }

        /* JADX INFO: renamed from: ae2.i$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lae2/i$a$b;", "Lae2/i$a;", "", "shouldShowRationale", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NoPermissions implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldShowRationale;

            public NoPermissions(boolean z15) {
                this.shouldShowRationale = z15;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getShouldShowRationale() {
                return this.shouldShowRationale;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoPermissions) && this.shouldShowRationale == ((NoPermissions) other).shouldShowRationale;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldShowRationale);
            }

            public String toString() {
                return "NoPermissions(shouldShowRationale=" + this.shouldShowRationale + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lae2/i$a$c;", "Lae2/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f5591a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1438395182;
            }

            public String toString() {
                return "OK";
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f5594f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5596h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5594f = obj;
            this.f5596h |= PKIFailureInfo.systemUnavail;
            return i.this.a(null, this);
        }
    }

    public i(i14.d dVar, y yVar) {
        this.isGpsEnabledUseCase = dVar;
        this.requestPermissionUseCase = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r8 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r7, tq.e<? super ae2.i.a> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ae2.i.b
            if (r0 == 0) goto L13
            r0 = r8
            ae2.i$b r0 = (ae2.i.b) r0
            int r1 = r0.f5596h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5596h = r1
            goto L18
        L13:
            ae2.i$b r0 = new ae2.i$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5594f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f5596h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f5593e
            u04.c r7 = (u04.c) r7
            java.lang.Object r7 = r0.f5592d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L8a
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f5592d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L5f
        L44:
            oq.u.b(r8)
            a14.y r8 = r6.requestPermissionUseCase
            a14.y$a r2 = new a14.y$a
            gy.d r5 = gy.d.GPS
            r2.<init>(r5)
            java.lang.Object r5 = vq.j.a(r7)
            r0.f5592d = r5
            r0.f5596h = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L5f
            goto L89
        L5f:
            u04.c r8 = (u04.c) r8
            boolean r2 = r8 instanceof u04.c.b
            if (r2 == 0) goto L71
            ae2.i$a$b r7 = new ae2.i$a$b
            u04.c$b r8 = (u04.c.b) r8
            boolean r8 = r8.getShouldShowRationale()
            r7.<init>(r8)
            return r7
        L71:
            i14.d r2 = r6.isGpsEnabledUseCase
            gz.b$a$a r4 = gz.b.a.C1792a.f78542a
            java.lang.Object r7 = vq.j.a(r7)
            r0.f5592d = r7
            java.lang.Object r7 = vq.j.a(r8)
            r0.f5593e = r7
            r0.f5596h = r3
            java.lang.Object r8 = r2.c(r4, r0)
            if (r8 != r1) goto L8a
        L89:
            return r1
        L8a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L95
            ae2.i$a$a r7 = ae2.i.a.C0117a.f5589a
            return r7
        L95:
            ae2.i$a$c r7 = ae2.i.a.c.f5591a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ae2.i.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
