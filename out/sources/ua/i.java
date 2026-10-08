package ua;

import android.os.Bundle;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lua/i;", "", "Lwa/b;", "impl", "<init>", "(Lwa/b;)V", "Loq/i0;", "c", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "d", "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "Lwa/b;", "Lua/g;", "b", "Lua/g;", "()Lua/g;", "savedStateRegistry", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wa.b impl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g savedStateRegistry;

    /* JADX INFO: renamed from: ua.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lua/i$a;", "", "<init>", "()V", "Lua/j;", "owner", "Lua/i;", "b", "(Lua/j;)Lua/i;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 c(j jVar) {
            jVar.getLifecycleRegistry().a(new b(jVar));
            return i0.f148189a;
        }

        public final i b(final j owner) {
            return new i(new wa.b(owner, new er.a() { // from class: ua.h
                @Override // er.a
                public final Object a() {
                    return i.Companion.c(owner);
                }
            }), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ i(wa.b bVar, fr.k kVar) {
        this(bVar);
    }

    public static final i a(j jVar) {
        return INSTANCE.b(jVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void c() {
        this.impl.f();
    }

    public final void d(Bundle savedState) {
        this.impl.h(savedState);
    }

    public final void e(Bundle outBundle) {
        this.impl.i(outBundle);
    }

    private i(wa.b bVar) {
        this.impl = bVar;
        this.savedStateRegistry = new g(bVar);
    }
}
