package dc;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldc/j;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", "b", "(II)I", "a", "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WorkDatabase workDatabase;

    public j(WorkDatabase workDatabase) {
        this.workDatabase = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer c(j jVar, int i15, int i16) {
        int iD = k.d(jVar.workDatabase, "next_job_scheduler_id");
        if (i15 > iD || iD > i16) {
            k.e(jVar.workDatabase, "next_job_scheduler_id", i15 + 1);
        } else {
            i15 = iD;
        }
        return Integer.valueOf(i15);
    }

    public final int b(final int minInclusive, final int maxInclusive) {
        return ((Number) this.workDatabase.S(new Callable() { // from class: dc.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j.c(this.f40760a, minInclusive, maxInclusive);
            }
        })).intValue();
    }
}
