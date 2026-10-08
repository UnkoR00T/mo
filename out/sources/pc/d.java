package pc;

import er.l;
import java.io.EOFException;
import java.io.IOException;
import oq.i0;
import p071kotlin.Metadata;
import vv.j0;
import vv.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lpc/d;", "Lvv/j0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "Loq/i0;", "onException", "<init>", "(Lvv/j0;Ler/l;)V", "Lvv/e;", "source", "", "byteCount", "O3", "(Lvv/e;J)V", "flush", "()V", "close", "Lvv/l0;", "R", "()Lvv/l0;", "a", "Lvv/j0;", "b", "Ler/l;", "", "c", "Z", "hasErrors", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<IOException, i0> onException;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasErrors;

    /* JADX WARN: Multi-variable type inference failed */
    public d(j0 j0Var, l<? super IOException, i0> lVar) {
        this.delegate = j0Var;
        this.onException = lVar;
    }

    @Override // vv.j0
    public void O3(vv.e source, long byteCount) throws EOFException {
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            this.delegate.O3(source, byteCount);
        } catch (IOException e15) {
            this.hasErrors = true;
            this.onException.b(e15);
        }
    }

    @Override // vv.j0
    /* JADX INFO: renamed from: R */
    public l0 getF208339a() {
        return this.delegate.getF208339a();
    }

    @Override // vv.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.delegate.close();
        } catch (IOException e15) {
            this.hasErrors = true;
            this.onException.b(e15);
        }
    }

    @Override // vv.j0, java.io.Flushable
    public void flush() {
        try {
            this.delegate.flush();
        } catch (IOException e15) {
            this.hasErrors = true;
            this.onException.b(e15);
        }
    }
}
