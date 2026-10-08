package hq0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lhq0/g;", "Laq0/g;", "Lhq0/j;", "signUnregisterForDefenceTrainingUC", "Lgq0/a;", "repository", "<init>", "(Lhq0/j;Lgq0/a;)V", "Laq0/g$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Laq0/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lhq0/j;", "b", "Lgq0/a;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements aq0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j signUnregisterForDefenceTrainingUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gq0.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f86308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f86309h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f86310j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f86312l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86310j = obj;
            this.f86312l |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(j jVar, gq0.a aVar) {
        this.signUnregisterForDefenceTrainingUC = jVar;
        this.repository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        if (r10 == r1) goto L26;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(aq0.g.Params r9, tq.e<? super dx.i<? extends dx.b, oq.i0>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof hq0.g.a
            if (r0 == 0) goto L13
            r0 = r10
            hq0.g$a r0 = (hq0.g.a) r0
            int r1 = r0.f86312l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f86312l = r1
            goto L18
        L13:
            hq0.g$a r0 = new hq0.g$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f86310j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f86312l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.f86307f
            iy.b0 r9 = (iy.b0) r9
            java.lang.Object r9 = r0.f86306e
            dx.i r9 = (dx.i) r9
            java.lang.Object r9 = r0.f86305d
            aq0.g$a r9 = (aq0.g.Params) r9
            oq.u.b(r10)
            goto La7
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            java.lang.Object r9 = r0.f86305d
            aq0.g$a r9 = (aq0.g.Params) r9
            oq.u.b(r10)
            goto L6d
        L48:
            oq.u.b(r10)
            hq0.j r10 = r8.signUnregisterForDefenceTrainingUC
            hq0.j$a r2 = new hq0.j$a
            int r5 = r9.getTrainingId()
            ay.c r6 = r9.getChallenge()
            er.p r7 = r9.b()
            r2.<init>(r5, r6, r7)
            java.lang.Object r5 = vq.j.a(r9)
            r0.f86305d = r5
            r0.f86312l = r4
            java.lang.Object r10 = r10.c(r2, r0)
            if (r10 != r1) goto L6d
            goto La6
        L6d:
            dx.i r10 = (dx.i) r10
            boolean r2 = r10 instanceof dx.i.Left
            if (r2 == 0) goto L74
            return r10
        L74:
            boolean r2 = r10 instanceof dx.i.Right
            if (r2 == 0) goto Laa
            r2 = r10
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            ry.a r2 = (ry.a) r2
            iy.b0 r2 = r2.getData()
            gq0.a r4 = r8.repository
            java.lang.Object r9 = vq.j.a(r9)
            r0.f86305d = r9
            java.lang.Object r9 = vq.j.a(r10)
            r0.f86306e = r9
            java.lang.Object r9 = vq.j.a(r2)
            r0.f86307f = r9
            r9 = 0
            r0.f86308g = r9
            r0.f86309h = r9
            r0.f86312l = r3
            java.lang.Object r10 = r4.b(r2, r0)
            if (r10 != r1) goto La7
        La6:
            return r1
        La7:
            dx.i r10 = (dx.i) r10
            return r10
        Laa:
            oq.p r9 = new oq.p
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hq0.g.c(aq0.g$a, tq.e):java.lang.Object");
    }
}
