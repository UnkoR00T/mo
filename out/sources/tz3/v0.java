package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltz3/v0;", "Ltz3/u0;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "asyncDownloadTasksDataSource", "<init>", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/a;)V", "Ltz3/u0$a;", "params", "Loq/i0;", "d", "(Ltz3/u0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.async.data.storage.a asyncDownloadTasksDataSource;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f193292h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f193294k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193292h = obj;
            this.f193294k |= PKIFailureInfo.systemUnavail;
            return v0.this.c(null, this);
        }
    }

    public v0(pl.gov.coi.mobywatel.technical.async.data.storage.a aVar) {
        this.asyncDownloadTasksDataSource = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (r1.b(r7, r2) == r3) goto L27;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(tz3.u0.Params r23, tq.e<? super oq.i0> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz3.v0.c(tz3.u0$a, tq.e):java.lang.Object");
    }
}
