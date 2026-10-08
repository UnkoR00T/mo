package androidx.p016lifecycle;

import java.io.Closeable;
import oq.a;
import p071kotlin.Metadata;
import r7.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0011*\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/t0;", "", "<init>", "()V", "Loq/i0;", "Y8", "W8", "", "key", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "V8", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "U8", "(Ljava/io/Closeable;)V", "T", "X8", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Lr7/g;", "a", "Lr7/g;", "impl", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g impl = new g();

    @a
    public /* synthetic */ void U8(Closeable closeable) {
        g gVar = this.impl;
        if (gVar != null) {
            gVar.d(closeable);
        }
    }

    public final void V8(String key, AutoCloseable closeable) {
        g gVar = this.impl;
        if (gVar != null) {
            gVar.e(key, closeable);
        }
    }

    public final void W8() {
        g gVar = this.impl;
        if (gVar != null) {
            gVar.f();
        }
        Y8();
    }

    public final <T extends AutoCloseable> T X8(String key) {
        g gVar = this.impl;
        if (gVar != null) {
            return (T) gVar.h(key);
        }
        return null;
    }

    protected void Y8() {
    }
}
