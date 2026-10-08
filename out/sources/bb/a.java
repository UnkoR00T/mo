package bb;

import java.io.IOException;
import oq.g;
import p071kotlin.Metadata;
import ya.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lbb/a;", "Lya/b;", "Lza/c;", "db", "<init>", "(Lza/c;)V", "", "l0", "()Z", "", "sql", "Lya/d;", "e4", "(Ljava/lang/String;)Lya/d;", "Loq/i0;", "close", "()V", "a", "Lza/c;", "b", "()Lza/c;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements ya.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.c db;

    public a(za.c cVar) {
        this.db = cVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final za.c getDb() {
        return this.db;
    }

    @Override // ya.b, java.lang.AutoCloseable
    public void close() throws IOException {
        this.db.close();
    }

    @Override // ya.b
    public d e4(String sql) {
        if (this.db.isOpen()) {
            return c.INSTANCE.a(this.db, sql);
        }
        ya.a.b(21, "connection is closed");
        throw new g();
    }

    @Override // ya.b
    public boolean l0() {
        return this.db.l0();
    }
}
