package px;

import java.util.List;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\u000bJ1\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lpx/f;", "", "<init>", "()V", "", "message", "", "Lpx/a;", "tags", "Loq/i0;", "b", "(Ljava/lang/String;Ljava/util/List;)V", "g", "", "throwable", "d", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;)V", "Lpx/b;", "Loq/k;", "f", "()Lpx/b;", "logger", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f163100a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final k logger = l.a(new er.a() { // from class: px.e
        @Override // er.a
        public final Object a() {
            return f.i();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f163102c = 8;

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(f fVar, String str, List list, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            list = v.n();
        }
        fVar.b(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(f fVar, String str, Throwable th4, List list, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            th4 = null;
        }
        if ((i15 & 4) != 0) {
            list = v.n();
        }
        fVar.d(str, th4, list);
    }

    private final b f() {
        return (b) logger.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(f fVar, String str, List list, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            list = v.n();
        }
        fVar.g(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b i() {
        return xw.c.f221622a.b();
    }

    public final void b(String message, List<? extends a> tags) {
        f().n7(message, tags);
    }

    public final void d(String message, Throwable throwable, List<? extends a> tags) {
        f().T6(message, throwable, tags);
    }

    public final void g(String message, List<? extends a> tags) {
        f().u6(message, tags);
    }
}
