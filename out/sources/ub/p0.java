package ub;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.UUID;
import p071kotlin.Metadata;
import vb.e1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u000bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\tH&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0 2\u0006\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0$2\u0006\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lub/p0;", "", "<init>", "()V", "Lub/q0;", "request", "Lub/a0;", "c", "(Lub/q0;)Lub/a0;", "", "requests", "b", "(Ljava/util/List;)Lub/a0;", "", "uniqueWorkName", "Lub/j;", "existingWorkPolicy", "Lub/z;", "f", "(Ljava/lang/String;Lub/j;Lub/z;)Lub/a0;", "e", "(Ljava/lang/String;Lub/j;Ljava/util/List;)Lub/a0;", "Lub/i;", "existingPeriodicWorkPolicy", "Lub/g0;", "d", "(Ljava/lang/String;Lub/i;Lub/g0;)Lub/a0;", "Ljava/util/UUID;", "id", "a", "(Ljava/util/UUID;)Lub/a0;", "tag", "Lmu/g;", "Lub/o0;", "i", "(Ljava/lang/String;)Lmu/g;", "Lcom/google/common/util/concurrent/q;", "h", "(Ljava/lang/String;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ub.p0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lub/p0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lub/p0;", "a", "(Landroid/content/Context;)Lub/p0;", "Landroidx/work/a;", "configuration", "Loq/i0;", "b", "(Landroid/content/Context;Landroidx/work/a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public p0 a(Context context) {
            return e1.p(context);
        }

        public void b(Context context, androidx.work.a configuration) {
            e1.j(context, configuration);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lub/p0$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f197159e = wq.b.a(b());
    }

    public static p0 g(Context context) {
        return INSTANCE.a(context);
    }

    public static void j(Context context, androidx.work.a aVar) {
        INSTANCE.b(context, aVar);
    }

    public abstract a0 a(UUID id5);

    public abstract a0 b(List<? extends q0> requests);

    public final a0 c(q0 request) {
        return b(pq.v.e(request));
    }

    public abstract a0 d(String uniqueWorkName, i existingPeriodicWorkPolicy, g0 request);

    public abstract a0 e(String uniqueWorkName, j existingWorkPolicy, List<z> requests);

    public a0 f(String uniqueWorkName, j existingWorkPolicy, z request) {
        return e(uniqueWorkName, existingWorkPolicy, pq.v.e(request));
    }

    public abstract com.google.common.util.concurrent.q<List<o0>> h(String tag);

    public abstract mu.g<List<o0>> i(String tag);
}
