package xw;

import dx.j;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxw/c;", "", "<init>", "()V", "Ldx/j;", "Ldx/b;", "exceptionParser", "Lpx/b;", "logger", "Loq/i0;", "c", "(Ldx/j;Lpx/b;)V", "b", "Ldx/j;", "a", "()Ldx/j;", "d", "(Ldx/j;)V", "Lpx/b;", "()Lpx/b;", "e", "(Lpx/b;)V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static j<dx.b> exceptionParser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static px.b logger;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f221622a = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f221625d = 8;

    private c() {
    }

    public final j<dx.b> a() {
        j<dx.b> jVar = exceptionParser;
        if (jVar != null) {
            return jVar;
        }
        return null;
    }

    public final px.b b() {
        px.b bVar = logger;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final void c(j<dx.b> exceptionParser2, px.b logger2) {
        d(exceptionParser2);
        e(logger2);
    }

    public final void d(j<dx.b> jVar) {
        exceptionParser = jVar;
    }

    public final void e(px.b bVar) {
        logger = bVar;
    }
}
