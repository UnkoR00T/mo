package oc;

import ed.f0;
import oq.i0;
import p071kotlin.Metadata;
import vv.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u00060\u001aj\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Loc/v;", "Loc/s;", "Lvv/g;", "source", "Lvv/k;", "fileSystem", "Loc/s$a;", "metadata", "<init>", "(Lvv/g;Lvv/k;Loc/s$a;)V", "Loq/i0;", "b", "()V", "W3", "()Lvv/g;", "Lvv/b0;", "L3", "()Lvv/b0;", "close", "a", "Lvv/k;", "getFileSystem", "()Lvv/k;", "Loc/s$a;", "e", "()Loc/s$a;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", "", "d", "Z", "isClosed", "Lvv/g;", "f", "Lvv/b0;", "file", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vv.k fileSystem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s.a metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private vv.g source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private b0 file;

    public v(vv.g gVar, vv.k kVar, s.a aVar) {
        this.fileSystem = kVar;
        this.metadata = aVar;
        this.source = gVar;
    }

    private final void b() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // oc.s
    public b0 L3() {
        b0 b0Var;
        synchronized (this.lock) {
            b();
            b0Var = this.file;
        }
        return b0Var;
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
                b0 b0Var = this.file;
                if (b0Var != null) {
                    getFileSystem().C(b0Var);
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
}
