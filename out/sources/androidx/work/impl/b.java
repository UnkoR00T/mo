package androidx.work.impl;

import ac.n;
import android.content.Context;
import ec.c;
import er.t;
import fr.q;
import java.util.List;
import ju.p0;
import ju.q0;
import p071kotlin.Metadata;
import pq.v;
import ub.i0;
import vb.c1;
import vb.e1;
import vb.s;
import vb.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2<\b\u0002\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0002`\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019*j\u0010\u001a\"2\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f22\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Lec/b;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lac/n;", "trackers", "Lvb/s;", "processor", "Lkotlin/Function6;", "", "Lvb/u;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Lvb/e1;", "d", "(Landroid/content/Context;Landroidx/work/a;Lec/b;Landroidx/work/impl/WorkDatabase;Lac/n;Lvb/s;Ler/t;)Lvb/e1;", "b", "(Landroid/content/Context;Landroidx/work/a;Lec/b;Landroidx/work/impl/WorkDatabase;Lac/n;Lvb/s;)Ljava/util/List;", "taskExecutor", "Lju/p0;", "f", "(Lec/b;)Lju/p0;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements t<Context, androidx.work.a, ec.b, WorkDatabase, n, s, List<? extends u>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f13843j = new a();

        a() {
            super(6, b.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // er.t
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final List<u> o(Context context, androidx.work.a aVar, ec.b bVar, WorkDatabase workDatabase, n nVar, s sVar) {
            return b.b(context, aVar, bVar, workDatabase, nVar, sVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<u> b(Context context, androidx.work.a aVar, ec.b bVar, WorkDatabase workDatabase, n nVar, s sVar) {
        return v.q(androidx.work.impl.a.c(context, workDatabase, aVar), new wb.b(context, aVar, nVar, sVar, new c1(sVar, bVar), bVar));
    }

    public static final e1 c(Context context, androidx.work.a aVar) {
        return e(context, aVar, null, null, null, null, null, 124, null);
    }

    public static final e1 d(Context context, androidx.work.a aVar, ec.b bVar, WorkDatabase workDatabase, n nVar, s sVar, t<? super Context, ? super androidx.work.a, ? super ec.b, ? super WorkDatabase, ? super n, ? super s, ? extends List<? extends u>> tVar) {
        return new e1(context.getApplicationContext(), aVar, bVar, workDatabase, tVar.o(context, aVar, bVar, workDatabase, nVar, sVar), sVar, nVar);
    }

    public static /* synthetic */ e1 e(Context context, androidx.work.a aVar, ec.b bVar, WorkDatabase workDatabase, n nVar, s sVar, t tVar, int i15, Object obj) {
        n nVar2;
        if ((i15 & 4) != 0) {
            bVar = new c(aVar.getTaskExecutor());
        }
        ec.b bVar2 = bVar;
        if ((i15 & 8) != 0) {
            workDatabase = WorkDatabase.INSTANCE.b(context.getApplicationContext(), bVar2.c(), aVar.getClock(), context.getResources().getBoolean(i0.f197117a));
        }
        if ((i15 & 16) != 0) {
            nVar2 = new n(context.getApplicationContext(), bVar2, null, null, null, null, 60, null);
        } else {
            nVar2 = nVar;
        }
        return d(context, aVar, bVar2, workDatabase, nVar2, (i15 & 32) != 0 ? new s(context.getApplicationContext(), aVar, bVar2, workDatabase) : sVar, (i15 & 64) != 0 ? a.f13843j : tVar);
    }

    public static final p0 f(ec.b bVar) {
        return q0.a(bVar.b());
    }
}
