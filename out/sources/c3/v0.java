package c3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lc3/v0;", "Lc3/u0;", "<init>", "()V", "Lc3/h;", "reader", "Loq/i0;", "z", "(I)V", "", "y", "(I)Z", "Ly2/c;", "a", "Ly2/c;", "readerKind", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class v0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y2.c readerKind = new y2.c(0);

    public final boolean y(int reader) {
        return (reader & h.a(this.readerKind.get())) != 0;
    }

    public final void z(int reader) {
        int iA;
        do {
            iA = h.a(this.readerKind.get());
            if ((iA & reader) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(iA, h.a(iA | reader)));
    }
}
