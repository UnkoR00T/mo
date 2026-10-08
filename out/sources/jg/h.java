package jg;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h<T extends IInterface> extends c<T> implements hg.a.f {
    private static volatile Executor K;
    private final e H;
    private final Set I;
    private final Account J;

    @Deprecated
    protected h(Context context, Looper looper, int i15, e eVar, hg.f.a aVar, hg.f.b bVar) {
        this(context, looper, i15, eVar, (ig.d) aVar, (ig.m) bVar);
    }

    private final Set h0(Set set) {
        Set<Scope> setG0 = g0(set);
        Iterator<Scope> it = setG0.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setG0;
    }

    public static void i0(Executor executor) {
        K = executor;
    }

    protected Set<Scope> g0(Set<Scope> set) {
        return set;
    }

    @Override // hg.a.f
    public Set<Scope> k() {
        return i() ? this.I : Collections.EMPTY_SET;
    }

    @Override // jg.c
    public final Account r() {
        return this.J;
    }

    @Override // jg.c
    protected Executor t() {
        return K;
    }

    @Override // jg.c
    protected final Set<Scope> z() {
        return this.I;
    }

    protected h(Context context, Looper looper, int i15, e eVar, ig.d dVar, ig.m mVar) {
        this(context, looper, j.a(context), gg.d.n(), i15, eVar, (ig.d) s.l(dVar), (ig.m) s.l(mVar));
    }

    protected h(Context context, Looper looper, j jVar, gg.d dVar, int i15, e eVar, ig.d dVar2, ig.m mVar) {
        super(context, looper, jVar, dVar, i15, dVar2 == null ? null : new h0(dVar2), mVar != null ? new i0(mVar) : null, eVar.f());
        this.H = eVar;
        this.J = eVar.a();
        this.I = h0(eVar.c());
    }
}
