package kc;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkc/d0$a;", "a", "Lkc/d0$a;", "DefaultSingletonImageLoaderFactory", "Lkc/l$c;", "Loq/i0;", "b", "Lkc/l$c;", "DefaultSingletonImageLoaderKey", "coil"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0.a f109802a = new d0.a() { // from class: kc.e0
        @Override // kc.d0.a
        public final s a(Context context) {
            return f0.b(context);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<oq.i0> f109803b = new Extras.c<>(oq.i0.f148189a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final s b(Context context) {
        s.a aVar = new s.a(context);
        aVar.getExtras().b(f109803b, oq.i0.f148189a);
        return aVar.d();
    }
}
