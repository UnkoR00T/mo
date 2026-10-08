package cc;

import android.annotation.SuppressLint;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0014H'¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000e2\u0006\u0010)\u001a\u00020\u0007H'¢\u0006\u0004\b+\u0010\u0011J#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u000e0,2\u0006\u0010)\u001a\u00020\u0007H'¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b/\u0010\u0011J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b0\u0010\u0011J\u0015\u00102\u001a\b\u0012\u0004\u0012\u0002010,H'¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u001eH'¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H'¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u00109\u001a\u00020\u0014H'¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010>\u001a\u00020\u0014H'¢\u0006\u0004\b?\u0010;J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b@\u0010=J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bA\u0010=J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010B\u001a\u00020\u001eH'¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bE\u0010\u0006J\u000f\u0010F\u001a\u00020\u0014H'¢\u0006\u0004\bF\u00108J\u001f\u0010H\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u0014H'¢\u0006\u0004\bH\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0001"}, d2 = {"Lcc/j0;", "", "Lcc/i0;", "workSpec", "Loq/i0;", "e", "(Lcc/i0;)V", "", "id", "a", "(Ljava/lang/String;)V", "i", "(Ljava/lang/String;)Lcc/i0;", "name", "", "Lcc/i0$b;", "p", "(Ljava/lang/String;)Ljava/util/List;", "Lub/o0$c;", "state", "", "w", "(Lub/o0$c;Ljava/lang/String;)I", "j", "(Ljava/lang/String;)I", "b", "Landroidx/work/b;", "output", "s", "(Ljava/lang/String;Landroidx/work/b;)V", "", "enqueueTime", "t", "(Ljava/lang/String;J)V", "A", "x", "overrideGeneration", "C", "(Ljava/lang/String;I)V", "h", "(Ljava/lang/String;)Lub/o0$c;", "tag", "Lcc/i0$c;", "y", "Lmu/g;", "n", "(Ljava/lang/String;)Lmu/g;", "k", "g", "", "q", "()Lmu/g;", "startTime", "o", "(Ljava/lang/String;J)I", "m", "()I", "schedulerLimit", "r", "(I)Ljava/util/List;", "v", "()Ljava/util/List;", "maxLimit", "l", "f", "u", "startingAt", "c", "(J)Ljava/util/List;", "z", "B", "stopReason", "d", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UnknownNullness"})
public interface j0 {
    int A(String id5);

    int B();

    void C(String id5, int overrideGeneration);

    void a(String id5);

    void b(String id5);

    List<i0> c(long startingAt);

    void d(String id5, int stopReason);

    void e(i0 workSpec);

    List<i0> f();

    List<String> g(String name);

    ub.o0.c h(String id5);

    i0 i(String id5);

    int j(String id5);

    List<androidx.work.b> k(String id5);

    List<i0> l(int maxLimit);

    int m();

    mu.g<List<i0.WorkInfoPojo>> n(String tag);

    int o(String id5, long startTime);

    List<i0.IdAndState> p(String name);

    mu.g<Boolean> q();

    List<i0> r(int schedulerLimit);

    void s(String id5, androidx.work.b output);

    void t(String id5, long enqueueTime);

    List<i0> u();

    List<i0> v();

    int w(ub.o0.c state, String id5);

    int x(String id5);

    List<i0.WorkInfoPojo> y(String tag);

    void z(i0 workSpec);
}
