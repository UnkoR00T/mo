package l9;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends z7.h<p, q, m> implements l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f117225o;

    class a extends q {
        a() {
        }

        @Override // z7.g
        public void w() {
            j.this.u(this);
        }
    }

    protected j(String str) {
        super(new p[2], new q[2]);
        this.f117225o = str;
        x(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z7.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final q k() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z7.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final m l(Throwable th4) {
        return new m("Unexpected decode error", th4);
    }

    protected abstract k C(byte[] bArr, int i15, boolean z15);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z7.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final m m(p pVar, q qVar, boolean z15) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) zj.p.q(pVar.f233228d);
            qVar.x(pVar.f233230f, C(byteBuffer.array(), byteBuffer.limit(), z15), pVar.f117241k);
            qVar.f233238d = false;
            return null;
        } catch (m e15) {
            return e15;
        }
    }

    @Override // l9.l
    public void c(long j15) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z7.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final p j() {
        return new p();
    }
}
