package z7;

import java.nio.ByteBuffer;
import t7.p;
import t7.t;

/* JADX INFO: loaded from: classes3.dex */
public class f extends z7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f233226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f233227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f233228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f233229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f233230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f233231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f233232h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f233233j;

    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f233234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f233235b;

        public a(int i15, int i16) {
            super("Buffer too small (" + i15 + " < " + i16 + ")");
            this.f233234a = i15;
            this.f233235b = i16;
        }
    }

    static {
        t.a("media3.decoder");
    }

    public f(int i15) {
        this(i15, 0);
    }

    public static f A() {
        return new f(0);
    }

    private ByteBuffer w(int i15) {
        int i16 = this.f233232h;
        if (i16 == 1) {
            return ByteBuffer.allocate(i15);
        }
        if (i16 == 2) {
            return ByteBuffer.allocateDirect(i15);
        }
        ByteBuffer byteBuffer = this.f233228d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i15);
    }

    public void B(int i15) {
        ByteBuffer byteBuffer = this.f233231g;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            this.f233231g = ByteBuffer.allocate(i15);
        } else {
            this.f233231g.clear();
        }
    }

    @Override // z7.a
    public void l() {
        super.l();
        ByteBuffer byteBuffer = this.f233228d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f233231g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f233229e = false;
    }

    public void x(int i15) {
        int i16 = i15 + this.f233233j;
        ByteBuffer byteBuffer = this.f233228d;
        if (byteBuffer == null) {
            this.f233228d = w(i16);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i17 = i16 + iPosition;
        if (iCapacity >= i17) {
            this.f233228d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferW = w(i17);
        byteBufferW.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferW.put(byteBuffer);
        }
        this.f233228d = byteBufferW;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.f233228d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f233231g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean z() {
        return n(1073741824);
    }

    public f(int i15, int i16) {
        this.f233227c = new c();
        this.f233232h = i15;
        this.f233233j = i16;
    }
}
