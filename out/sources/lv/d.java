package lv;

import fv.b0;
import fv.d0;
import p071kotlin.Metadata;
import vv.j0;
import vv.k0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Llv/d;", "", "Lfv/b0;", "request", "", "contentLength", "Lvv/j0;", "a", "(Lfv/b0;J)Lvv/j0;", "Loq/i0;", "e", "(Lfv/b0;)V", "h", "()V", "c", "", "expectContinue", "Lfv/d0$a;", "g", "(Z)Lfv/d0$a;", "Lfv/d0;", "response", "f", "(Lfv/d0;)J", "Lvv/k0;", "b", "(Lfv/d0;)Lvv/k0;", "cancel", "Lkv/f;", "d", "()Lkv/f;", "connection", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d {
    j0 a(b0 request, long contentLength);

    k0 b(d0 response);

    void c();

    void cancel();

    /* JADX INFO: renamed from: d */
    kv.f getConnection();

    void e(b0 request);

    long f(d0 response);

    d0.a g(boolean expectContinue);

    void h();
}
