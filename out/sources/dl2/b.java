package dl2;

import a14.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ldl2/b;", "Lgz/b;", "Lgz/b$a$a;", "", "Lcl2/a;", "myIkpPrefsRepository", "La14/r;", "isAppInstalledUC", "<init>", "(Lcl2/a;La14/r;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lcl2/a;", "b", "La14/r;", "c", "myikp_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43389d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cl2.a myIkpPrefsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r isAppInstalledUC;

    /* JADX INFO: renamed from: dl2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0967b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f43392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f43393e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f43395g;

        C0967b(e<? super C0967b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f43393e = obj;
            this.f43395g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(cl2.a aVar, r rVar) {
        this.myIkpPrefsRepository = aVar;
        this.isAppInstalledUC = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r7, tq.e<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dl2.b.C0967b
            if (r0 == 0) goto L13
            r0 = r8
            dl2.b$b r0 = (dl2.b.C0967b) r0
            int r1 = r0.f43395g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43395g = r1
            goto L18
        L13:
            dl2.b$b r0 = new dl2.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f43393e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f43395g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f43392d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L74
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f43392d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L54
        L40:
            oq.u.b(r8)
            cl2.a r8 = r6.myIkpPrefsRepository
            java.lang.Object r2 = vq.j.a(r7)
            r0.f43392d = r2
            r0.f43395g = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L54
            goto L73
        L54:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7d
            a14.r r8 = r6.isAppInstalledUC
            a14.r$a r2 = new a14.r$a
            java.lang.String r5 = "pl.gov.cez.mojeikp"
            r2.<init>(r5)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f43392d = r7
            r0.f43395g = r3
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L7d
            goto L7e
        L7d:
            r4 = 0
        L7e:
            java.lang.Boolean r7 = vq.b.a(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dl2.b.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
