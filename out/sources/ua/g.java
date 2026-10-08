package ua;

import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0011\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006\u001e"}, d2 = {"Lua/g;", "", "Lwa/b;", "impl", "<init>", "(Lwa/b;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lua/g$b;", "provider", "Loq/i0;", "c", "(Ljava/lang/String;Lua/g$b;)V", "b", "(Ljava/lang/String;)Lua/g$b;", "e", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Lua/g$a;", "clazz", "d", "(Ljava/lang/Class;)V", "Lwa/b;", "Lua/b$b;", "Lua/b$b;", "recreatorProvider", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wa.b impl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ua.b.C5116b recreatorProvider;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lua/g$a;", "", "Lua/j;", "owner", "Loq/i0;", "a", "(Lua/j;)V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void a(j owner);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lua/g$b;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        Bundle a();
    }

    public g(wa.b bVar) {
        this.impl = bVar;
    }

    public final Bundle a(String key) {
        return this.impl.c(key);
    }

    public final b b(String key) {
        return this.impl.d(key);
    }

    public final void c(String key, b provider) {
        this.impl.j(key, provider);
    }

    public final void d(Class<? extends a> clazz) {
        if (!this.impl.getIsAllowingSavingState()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        ua.b.C5116b c5116b = this.recreatorProvider;
        if (c5116b == null) {
            c5116b = new ua.b.C5116b(this);
        }
        this.recreatorProvider = c5116b;
        try {
            clazz.getDeclaredConstructor(null);
            ua.b.C5116b c5116b2 = this.recreatorProvider;
            if (c5116b2 != null) {
                c5116b2.b(clazz.getName());
            }
        } catch (NoSuchMethodException e15) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e15);
        }
    }

    public final void e(String key) {
        this.impl.k(key);
    }
}
