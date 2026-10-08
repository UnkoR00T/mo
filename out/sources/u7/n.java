package u7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected l.a f195971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected l.a f195972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l.a f195973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l.a f195974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f195975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f195976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f195977h;

    public n() {
        ByteBuffer byteBuffer = l.f195962a;
        this.f195975f = byteBuffer;
        this.f195976g = byteBuffer;
        l.a aVar = l.a.f195963e;
        this.f195973d = aVar;
        this.f195974e = aVar;
        this.f195971b = aVar;
        this.f195972c = aVar;
    }

    @Override // u7.l
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f195976g;
        this.f195976g = l.f195962a;
        return byteBuffer;
    }

    @Override // u7.l
    public final void b(l.b bVar) {
        this.f195976g = l.f195962a;
        this.f195977h = false;
        this.f195971b = this.f195973d;
        this.f195972c = this.f195974e;
        l(bVar);
    }

    @Override // u7.l
    public final void d() {
        this.f195977h = true;
        m();
    }

    @Override // u7.l
    public boolean e() {
        return this.f195977h && this.f195976g == l.f195962a;
    }

    @Override // u7.l
    @Deprecated
    public final void flush() {
        b(l.b.f195968b);
    }

    @Override // u7.l
    public final l.a g(l.a aVar) {
        this.f195973d = aVar;
        this.f195974e = j(aVar);
        return h() ? this.f195974e : l.a.f195963e;
    }

    @Override // u7.l
    public boolean h() {
        return this.f195974e != l.a.f195963e;
    }

    protected final boolean i() {
        return this.f195976g.hasRemaining();
    }

    protected abstract l.a j(l.a aVar);

    @Deprecated
    protected void k() {
    }

    protected void l(l.b bVar) {
        k();
    }

    protected void m() {
    }

    protected void n() {
    }

    protected final ByteBuffer o(int i15) {
        if (this.f195975f.capacity() < i15) {
            this.f195975f = ByteBuffer.allocateDirect(i15).order(ByteOrder.nativeOrder());
        } else {
            this.f195975f.clear();
        }
        ByteBuffer byteBuffer = this.f195975f;
        this.f195976g = byteBuffer;
        return byteBuffer;
    }

    @Override // u7.l
    public final void reset() {
        ByteBuffer byteBuffer = l.f195962a;
        this.f195976g = byteBuffer;
        this.f195977h = false;
        this.f195975f = byteBuffer;
        l.a aVar = l.a.f195963e;
        this.f195973d = aVar;
        this.f195974e = aVar;
        this.f195971b = aVar;
        this.f195972c = aVar;
        n();
    }
}
