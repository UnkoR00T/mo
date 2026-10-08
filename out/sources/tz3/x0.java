package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltz3/x0;", "Ltz3/w0;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "asyncDownloadTasksDataSource", "<init>", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/a;)V", "Ltz3/w0$a;", "params", "Loq/i0;", "d", "(Ltz3/w0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.async.data.storage.a asyncDownloadTasksDataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f193301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f193302g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f193304j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193302g = obj;
            this.f193304j |= PKIFailureInfo.systemUnavail;
            return x0.this.c(null, this);
        }
    }

    public x0(pl.gov.coi.mobywatel.technical.async.data.storage.a aVar) {
        this.asyncDownloadTasksDataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r1.b(r7, r2) == r3) goto L24;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(tz3.w0.Params r17, tq.e<? super oq.i0> r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof tz3.x0.a
            if (r2 == 0) goto L17
            r2 = r1
            tz3.x0$a r2 = (tz3.x0.a) r2
            int r3 = r2.f193304j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f193304j = r3
            goto L1c
        L17:
            tz3.x0$a r2 = new tz3.x0$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f193302g
            java.lang.Object r3 = uq.b.e()
            int r4 = r2.f193304j
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L48
            if (r4 == r6) goto L40
            if (r4 != r5) goto L38
            java.lang.Object r3 = r2.f193300e
            lz3.i r3 = (lz3.DownloadTaskData) r3
            java.lang.Object r2 = r2.f193299d
            tz3.w0$a r2 = (tz3.w0.Params) r2
            oq.u.b(r1)
            goto L95
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            java.lang.Object r4 = r2.f193299d
            tz3.w0$a r4 = (tz3.w0.Params) r4
            oq.u.b(r1)
            goto L62
        L48:
            oq.u.b(r1)
            pl.gov.coi.mobywatel.technical.async.data.storage.a r1 = r0.asyncDownloadTasksDataSource
            java.lang.String r4 = r17.getTaskId()
            java.lang.Object r7 = vq.j.a(r17)
            r2.f193299d = r7
            r2.f193304j = r6
            java.lang.Object r1 = r1.e(r4, r2)
            if (r1 != r3) goto L60
            goto L94
        L60:
            r4 = r17
        L62:
            dx.i r1 = (dx.i) r1
            java.lang.Object r1 = r1.a()
            r6 = r1
            lz3.i r6 = (lz3.DownloadTaskData) r6
            if (r6 == 0) goto L95
            pl.gov.coi.mobywatel.technical.async.data.storage.a r1 = r0.asyncDownloadTasksDataSource
            r14 = 55
            r15 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            lz3.i r7 = lz3.DownloadTaskData.b(r6, r7, r8, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = vq.j.a(r4)
            r2.f193299d = r4
            java.lang.Object r4 = vq.j.a(r6)
            r2.f193300e = r4
            r4 = 0
            r2.f193301f = r4
            r2.f193304j = r5
            java.lang.Object r1 = r1.b(r7, r2)
            if (r1 != r3) goto L95
        L94:
            return r3
        L95:
            oq.i0 r1 = oq.i0.f148189a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.x0.c(tz3.w0$a, tq.e):java.lang.Object");
    }
}
