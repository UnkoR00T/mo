package wq2;

import p071kotlin.Metadata;
import p127vq2.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lwq2/b;", "Lwq2/a;", "Lwq2/c;", "dataSource", "<init>", "(Lwq2/c;)V", "Lmr2/a$b;", "c", "()Lmr2/a$b;", "Ljr2/a$a;", "t4", "()Ljr2/a$a;", "Ldr2/a$a;", "data", "Loq/i0;", "N1", "(Ldr2/a$a;)V", "Lgr2/a$a;", "G7", "(Lgr2/a$a;)V", "Lar2/a$a;", "W7", "(Lar2/a$a;)V", "Lmr2/a$a;", "t6", "(Lmr2/a$a;)V", "a", "Lwq2/c;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f214403b = h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c dataSource;

    public b(c cVar) {
        this.dataSource = cVar;
    }

    @Override // gr2.a
    public void G7(gr2.a.Data data) {
        this.dataSource.a(e0.c.f207924a, new PassportInvalidationResult(data));
    }

    @Override // dr2.a
    public void N1(dr2.a.Data data) {
        this.dataSource.a(e0.b.f207922a, new PassportInvalidationResult(data));
    }

    @Override // ar2.a
    public void W7(ar2.a.Data data) {
        this.dataSource.a(e0.a.f207920a, new PassportInvalidationResult(data));
    }

    @Override // mr2.a
    public mr2.a.SummaryData c() {
        return this.dataSource.i();
    }

    @Override // jr2.a
    public jr2.a.SuccessData t4() {
        return this.dataSource.h();
    }

    @Override // mr2.a
    public void t6(mr2.a.InvalidateData data) {
        this.dataSource.a(e0.e.f207928a, new PassportInvalidationResult(data));
    }
}
