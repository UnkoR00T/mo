package oc;

import ed.f0;
import oq.i0;
import p071kotlin.Metadata;
import vv.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0018\u0010,\u001a\u00060(j\u0002`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00101¨\u00063"}, d2 = {"Loc/r;", "Loc/s;", "Lvv/b0;", "file", "Lvv/k;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Loc/s$a;", "metadata", "<init>", "(Lvv/b0;Lvv/k;Ljava/lang/String;Ljava/lang/AutoCloseable;Loc/s$a;)V", "Loq/i0;", "b", "()V", "Lvv/g;", "W3", "()Lvv/g;", "h", "()Lvv/b0;", "L3", "close", "a", "Lvv/b0;", "getFile$coil_core", "Lvv/k;", "getFileSystem", "()Lvv/k;", "c", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "d", "Ljava/lang/AutoCloseable;", "e", "Loc/s$a;", "()Loc/s$a;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "f", "Ljava/lang/Object;", "lock", "", "g", "Z", "isClosed", "Lvv/g;", "source", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vv.k fileSystem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String diskCacheKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AutoCloseable closeable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s.a metadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private vv.g source;

    public r(b0 b0Var, vv.k kVar, String str, AutoCloseable autoCloseable, s.a aVar) {
        this.file = b0Var;
        this.fileSystem = kVar;
        this.diskCacheKey = str;
        this.closeable = autoCloseable;
        this.metadata = aVar;
    }

    private final void b() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // oc.s
    public b0 L3() {
        return h();
    }

    @Override // oc.s
    public vv.g W3() {
        synchronized (this.lock) {
            b();
            vv.g gVar = this.source;
            if (gVar != null) {
                return gVar;
            }
            vv.g gVarC = vv.v.c(getFileSystem().O(this.file));
            this.source = gVarC;
            return gVarC;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                this.isClosed = true;
                vv.g gVar = this.source;
                if (gVar != null) {
                    f0.h(gVar);
                }
                AutoCloseable autoCloseable = this.closeable;
                if (autoCloseable != null) {
                    f0.i(autoCloseable);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // oc.s
    /* JADX INFO: renamed from: e, reason: from getter */
    public s.a getMetadata() {
        return this.metadata;
    }

    @Override // oc.s
    public vv.k getFileSystem() {
        return this.fileSystem;
    }

    public b0 h() {
        b0 b0Var;
        synchronized (this.lock) {
            b();
            b0Var = this.file;
        }
        return b0Var;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }
}
