package uc;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010#\"\u0004\b\u001b\u0010\u0017R\u0014\u0010&\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010#¨\u0006'"}, d2 = {"Luc/f;", "Luc/d;", "Luc/i;", "strongMemoryCache", "Luc/j;", "weakMemoryCache", "<init>", "(Luc/i;Luc/j;)V", "Luc/d$b;", "key", "Luc/d$c;", "a", "(Luc/d$b;)Luc/d$c;", "value", "Loq/i0;", "f", "(Luc/d$b;Luc/d$c;)V", "", "d", "(Luc/d$b;)Z", "", "size", "e", "(J)V", "clear", "()V", "Luc/i;", "b", "Luc/j;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", "getSize", "()J", "getMaxSize", "maxSize", "initialMaxSize", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i strongMemoryCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    public f(i iVar, j jVar) {
        this.strongMemoryCache = iVar;
        this.weakMemoryCache = jVar;
    }

    @Override // uc.d
    public d.Value a(d.Key key) {
        d.Value valueA;
        synchronized (this.lock) {
            try {
                valueA = this.strongMemoryCache.a(key);
                if (valueA == null) {
                    valueA = this.weakMemoryCache.a(key);
                }
                if (valueA != null && !valueA.getImage().getShareable()) {
                    d(key);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return valueA;
    }

    @Override // uc.d
    public void b(long j15) {
        synchronized (this.lock) {
            this.strongMemoryCache.b(j15);
            i0 i0Var = i0.f148189a;
        }
    }

    @Override // uc.d
    public long c() {
        long jC;
        synchronized (this.lock) {
            jC = this.strongMemoryCache.getInitialMaxSize();
        }
        return jC;
    }

    @Override // uc.d
    public void clear() {
        synchronized (this.lock) {
            this.strongMemoryCache.clear();
            this.weakMemoryCache.clear();
            i0 i0Var = i0.f148189a;
        }
    }

    public boolean d(d.Key key) {
        boolean z15;
        synchronized (this.lock) {
            z15 = this.strongMemoryCache.f(key) || this.weakMemoryCache.f(key);
        }
        return z15;
    }

    @Override // uc.d
    public void e(long size) {
        synchronized (this.lock) {
            this.strongMemoryCache.e(size);
            i0 i0Var = i0.f148189a;
        }
    }

    @Override // uc.d
    public void f(d.Key key, d.Value value) {
        synchronized (this.lock) {
            long size = value.getImage().getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.strongMemoryCache.d(key, value.getImage(), value.a(), size);
            i0 i0Var = i0.f148189a;
        }
    }

    @Override // uc.d
    public long getSize() {
        long size;
        synchronized (this.lock) {
            size = this.strongMemoryCache.getSize();
        }
        return size;
    }
}
