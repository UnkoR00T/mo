package androidx.work.impl;

import ab.i;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import cc.d0;
import cc.j0;
import cc.p;
import cc.t1;
import cc.y;
import fr.k;
import java.util.concurrent.Executor;
import oa.n;
import oa.u;
import p071kotlin.Metadata;
import vb.c;
import vb.f;
import vb.f1;
import vb.g;
import vb.h;
import vb.j;
import vb.l;
import vb.m;
import vb.o;
import vb.t;
import za.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Loa/u;", "<init>", "()V", "Lcc/j0;", "e0", "()Lcc/j0;", "Lcc/b;", "Z", "()Lcc/b;", "Lcc/t1;", "f0", "()Lcc/t1;", "Lcc/p;", "b0", "()Lcc/p;", "Lcc/y;", "c0", "()Lcc/y;", "Lcc/d0;", "d0", "()Lcc/d0;", "Lcc/i;", "a0", "()Lcc/i;", "o", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WorkDatabase extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/WorkDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "Lub/b;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lub/b;Z)Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d c(Context context, d.b bVar) {
            d.b.a aVarA = d.b.INSTANCE.a(context);
            aVarA.d(bVar.name).c(bVar.callback).e(true).a(true);
            return new i().a(aVarA.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, ub.b clock, boolean useTestDatabase) {
            return (WorkDatabase) (useTestDatabase ? n.b(context, WorkDatabase.class).d() : n.a(context, WorkDatabase.class, "androidx.work.workdb").g(new d.c() { // from class: vb.f0
                @Override // za.d.c
                public final za.d a(za.d.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).h(queryExecutor).a(new c(clock)).b(j.f205797c).b(new t(context, 2, 3)).b(vb.k.f205798c).b(l.f205807c).b(new t(context, 5, 6)).b(m.f205808c).b(vb.n.f205810c).b(o.f205815c).b(new f1(context)).b(new t(context, 10, 11)).b(f.f205780c).b(g.f205783c).b(h.f205786c).b(vb.i.f205791c).b(new t(context, 21, 22)).f(true).e();
        }

        private Companion() {
        }
    }

    public abstract cc.b Z();

    public abstract cc.i a0();

    public abstract p b0();

    public abstract y c0();

    public abstract d0 d0();

    public abstract j0 e0();

    public abstract t1 f0();
}
