package pl.gov.mc.fringers.mobywatel;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpl/gov/mc/fringers/mobywatel/i;", "Lpl/gov/mc/fringers/mobywatel/j;", "Ln90/a;", "isMJuniorAppActivatedUC", "La14/s;", "launchAppUseCase", "Lyg0/a;", "consumeForceConfigChangeUC", "<init>", "(Ln90/a;La14/s;Lyg0/a;)V", "Landroid/content/Intent;", "intent", "", "a", "(Landroid/content/Intent;Ltq/e;)Ljava/lang/Object;", "Ln90/a;", "b", "La14/s;", "c", "Lyg0/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n90.a isMJuniorAppActivatedUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.s launchAppUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yg0.a consumeForceConfigChangeUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f160759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f160760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f160761f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f160763h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f160761f = obj;
            this.f160763h |= PKIFailureInfo.systemUnavail;
            return i.this.a(null, this);
        }
    }

    public i(n90.a aVar, a14.s sVar, yg0.a aVar2) {
        this.isMJuniorAppActivatedUC = aVar;
        this.launchAppUseCase = sVar;
        this.consumeForceConfigChangeUC = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r2.c(r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r2.c(r7, r0) == r1) goto L27;
     */
    @Override // mz.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.content.Intent r6, tq.e<? super java.lang.Boolean> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pl.gov.mc.fringers.mobywatel.i.a
            if (r0 == 0) goto L13
            r0 = r7
            pl.gov.mc.fringers.mobywatel.i$a r0 = (pl.gov.mc.fringers.mobywatel.i.a) r0
            int r1 = r0.f160763h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160763h = r1
            goto L18
        L13:
            pl.gov.mc.fringers.mobywatel.i$a r0 = new pl.gov.mc.fringers.mobywatel.i$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f160761f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f160763h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f160760e
            a14.s$a r6 = (a14.s.Params) r6
            java.lang.Object r6 = r0.f160759d
            android.content.Intent r6 = (android.content.Intent) r6
            oq.u.b(r7)
            goto La8
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f160760e
            a14.s$a r6 = (a14.s.Params) r6
            java.lang.Object r6 = r0.f160759d
            android.content.Intent r6 = (android.content.Intent) r6
            oq.u.b(r7)
            goto L77
        L48:
            oq.u.b(r7)
            n90.a r7 = r5.isMJuniorAppActivatedUC
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Boolean r7 = r7.b(r2)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            a14.s$a r7 = new a14.s$a
            y70.e4$a r2 = y70.e4.a.f225002a
            r7.<init>(r2, r2, r2)
            a14.s r2 = r5.launchAppUseCase
            java.lang.Object r6 = vq.j.a(r6)
            r0.f160759d = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f160760e = r6
            r0.f160763h = r4
            java.lang.Object r6 = r2.c(r7, r0)
            if (r6 != r1) goto L77
            goto La7
        L77:
            java.lang.Boolean r6 = vq.b.a(r4)
            return r6
        L7c:
            yg0.a r7 = r5.consumeForceConfigChangeUC
            java.lang.Object r7 = r7.a(r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lad
            a14.s$a r7 = new a14.s$a
            y70.e4$a r2 = y70.e4.a.f225002a
            r7.<init>(r2, r2, r2)
            a14.s r2 = r5.launchAppUseCase
            java.lang.Object r6 = vq.j.a(r6)
            r0.f160759d = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f160760e = r6
            r0.f160763h = r3
            java.lang.Object r6 = r2.c(r7, r0)
            if (r6 != r1) goto La8
        La7:
            return r1
        La8:
            java.lang.Boolean r6 = vq.b.a(r4)
            return r6
        Lad:
            r6 = 0
            java.lang.Boolean r6 = vq.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.mc.fringers.mobywatel.i.a(android.content.Intent, tq.e):java.lang.Object");
    }
}
