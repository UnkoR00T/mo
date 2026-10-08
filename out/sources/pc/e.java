package pc;

import p071kotlin.Metadata;
import tq.i;
import vv.b0;
import vv.h;
import vv.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0003\u001a\u0011\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Lpc/e;", "Lpc/a;", "", "maxSize", "Lvv/b0;", "directory", "Lvv/k;", "fileSystem", "Ltq/i;", "cleanupCoroutineContext", "<init>", "(JLvv/b0;Lvv/k;Ltq/i;)V", "", "e", "(Ljava/lang/String;)Ljava/lang/String;", "key", "Lpc/a$c;", "b", "(Ljava/lang/String;)Lpc/a$c;", "Lpc/a$b;", "a", "(Ljava/lang/String;)Lpc/a$b;", "J", "d", "()J", "Lvv/b0;", "c", "()Lvv/b0;", "Lvv/k;", "getFileSystem", "()Lvv/k;", "Lpc/c;", "Lpc/c;", "cache", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long maxSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 directory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k fileSystem;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pc.c cache;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lpc/e$b;", "Lpc/a$b;", "Lpc/c$b;", "Lpc/c;", "editor", "<init>", "(Lpc/c$b;)V", "Lpc/e$c;", "c", "()Lpc/e$c;", "Loq/i0;", "b", "()V", "a", "Lpc/c$b;", "Lvv/b0;", "e", "()Lvv/b0;", "metadata", "getData", "data", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final pc.c.b editor;

        public b(pc.c.b bVar) {
            this.editor = bVar;
        }

        @Override // pc.a.b
        public void b() {
            this.editor.a();
        }

        @Override // pc.a.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a() {
            pc.c.d dVarC = this.editor.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // pc.a.b
        public b0 e() {
            return this.editor.f(0);
        }

        @Override // pc.a.b
        public b0 getData() {
            return this.editor.f(1);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lpc/e$c;", "Lpc/a$c;", "Lpc/c$d;", "Lpc/c;", "snapshot", "<init>", "(Lpc/c$d;)V", "Loq/i0;", "close", "()V", "Lpc/e$b;", "b", "()Lpc/e$b;", "a", "Lpc/c$d;", "Lvv/b0;", "e", "()Lvv/b0;", "metadata", "getData", "data", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final pc.c.d snapshot;

        public c(pc.c.d dVar) {
            this.snapshot = dVar;
        }

        @Override // pc.a.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a3() {
            pc.c.b bVarB = this.snapshot.b();
            if (bVarB != null) {
                return new b(bVarB);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.snapshot.close();
        }

        @Override // pc.a.c
        public b0 e() {
            return this.snapshot.h(0);
        }

        @Override // pc.a.c
        public b0 getData() {
            return this.snapshot.h(1);
        }
    }

    public e(long j15, b0 b0Var, k kVar, i iVar) {
        this.maxSize = j15;
        this.directory = b0Var;
        this.fileSystem = kVar;
        this.cache = new pc.c(getFileSystem(), getDirectory(), iVar, getMaxSize(), 3, 2);
    }

    private final String e(String str) {
        return h.INSTANCE.d(str).O().t();
    }

    @Override // pc.a
    public a.b a(String key) {
        pc.c.b bVarZ = this.cache.Z(e(key));
        if (bVarZ != null) {
            return new b(bVarZ);
        }
        return null;
    }

    @Override // pc.a
    public a.c b(String key) {
        pc.c.d dVarA0 = this.cache.a0(e(key));
        if (dVarA0 != null) {
            return new c(dVarA0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public b0 getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public long getMaxSize() {
        return this.maxSize;
    }

    @Override // pc.a
    public k getFileSystem() {
        return this.fileSystem;
    }
}
