package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltz3/t0;", "Ltz3/s0;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "asyncDownloadTasksDataSource", "<init>", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/a;)V", "Ltz3/s0$a;", "params", "Loq/i0;", "d", "(Ltz3/s0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.async.data.storage.a asyncDownloadTasksDataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f193279e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193281g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193279e = obj;
            this.f193281g |= PKIFailureInfo.systemUnavail;
            return t0.this.c(null, this);
        }
    }

    public t0(pl.gov.coi.mobywatel.technical.async.data.storage.a aVar) {
        this.asyncDownloadTasksDataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r7.b(r2, r0) == r1) goto L23;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(tz3.s0.Params r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tz3.t0.a
            if (r0 == 0) goto L13
            r0 = r7
            tz3.t0$a r0 = (tz3.t0.a) r0
            int r1 = r0.f193281g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193281g = r1
            goto L18
        L13:
            tz3.t0$a r0 = new tz3.t0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f193279e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f193281g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f193278d
            tz3.s0$a r6 = (tz3.s0.Params) r6
            oq.u.b(r7)
            goto L75
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f193278d
            tz3.s0$a r6 = (tz3.s0.Params) r6
            oq.u.b(r7)
            goto L58
        L40:
            oq.u.b(r7)
            pl.gov.coi.mobywatel.technical.async.data.storage.a r7 = r5.asyncDownloadTasksDataSource
            lz3.i r2 = r6.getDownloadTaskData()
            java.lang.String r2 = r2.getTaskId()
            r0.f193278d = r6
            r0.f193281g = r4
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L58
            goto L74
        L58:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L78
            pl.gov.coi.mobywatel.technical.async.data.storage.a r7 = r5.asyncDownloadTasksDataSource
            lz3.i r2 = r6.getDownloadTaskData()
            java.lang.Object r6 = vq.j.a(r6)
            r0.f193278d = r6
            r0.f193281g = r3
            java.lang.Object r6 = r7.b(r2, r0)
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        L78:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.t0.c(tz3.s0$a, tq.e):java.lang.Object");
    }
}
