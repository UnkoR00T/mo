package dc;

import androidx.work.impl.WorkDatabase;
import cc.i0;
import java.util.List;
import p071kotlin.Metadata;
import ub.o0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lec/b;", "executor", "", "tag", "Lcom/google/common/util/concurrent/q;", "", "Lub/o0;", "c", "(Landroidx/work/impl/WorkDatabase;Lec/b;Ljava/lang/String;)Lcom/google/common/util/concurrent/q;", "T", "Lkotlin/Function1;", "block", "e", "(Landroidx/work/impl/WorkDatabase;Lec/b;Ler/l;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final com.google.common.util.concurrent.q<List<o0>> c(WorkDatabase workDatabase, ec.b bVar, final String str) {
        return e(workDatabase, bVar, new er.l() { // from class: dc.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.d(str, (WorkDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(String str, WorkDatabase workDatabase) {
        return i0.B.apply(workDatabase.e0().y(str));
    }

    private static final <T> com.google.common.util.concurrent.q<T> e(final WorkDatabase workDatabase, ec.b bVar, final er.l<? super WorkDatabase, ? extends T> lVar) {
        return ub.u.f(bVar.c(), "loadStatusFuture", new er.a() { // from class: dc.w
            @Override // er.a
            public final Object a() {
                return x.f(lVar, workDatabase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(er.l lVar, WorkDatabase workDatabase) {
        return lVar.b(workDatabase);
    }
}
