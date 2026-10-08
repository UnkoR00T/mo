package oa;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Loa/f;", "T", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "a", "(Lya/d;Ljava/lang/Object;)V", "Lya/b;", "connection", "d", "(Lya/b;Ljava/lang/Object;)V", "", "entities", "c", "(Lya/b;Ljava/lang/Iterable;)V", "", "e", "(Lya/b;Ljava/lang/Object;)J", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f<T> {
    protected abstract void a(ya.d statement, T entity);

    protected abstract String b();

    public final void c(ya.b connection, Iterable<? extends T> entities) throws Exception {
        if (entities == null) {
            return;
        }
        ya.d dVarE4 = connection.e4(b());
        try {
            for (T t15 : entities) {
                if (t15 != null) {
                    a(dVarE4, t15);
                    dVarE4.Y3();
                    dVarE4.reset();
                }
            }
            oq.i0 i0Var = oq.i0.f148189a;
            cr.a.a(dVarE4, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    public final void d(ya.b connection, T entity) throws Exception {
        if (entity == null) {
            return;
        }
        ya.d dVarE4 = connection.e4(b());
        try {
            a(dVarE4, entity);
            dVarE4.Y3();
            cr.a.a(dVarE4, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    public final long e(ya.b connection, T entity) throws Exception {
        if (entity == null) {
            return -1L;
        }
        ya.d dVarE4 = connection.e4(b());
        try {
            a(dVarE4, entity);
            dVarE4.Y3();
            cr.a.a(dVarE4, null);
            return ta.l.a(connection);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }
}
