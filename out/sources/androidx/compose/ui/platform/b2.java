package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/b2;", "Lz2/f;", "Lz2/d;", "delegate", "<init>", "(Lz2/d;)V", "Loq/i0;", "d", "()V", "b", "a", "Lz2/d;", "getDelegate", "()Lz2/d;", "", "c", "()Z", "isRetainingExitedValues", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b2 implements z2.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10408b = z2.d.f232322e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z2.d delegate;

    public b2(z2.d dVar) {
        this.delegate = dVar;
        dVar.d();
    }

    public final void a() {
        this.delegate.b();
    }

    public final void b() {
        this.delegate.d();
    }

    public final boolean c() {
        return this.delegate.c();
    }

    public final void d() {
        this.delegate.e();
    }

    public /* synthetic */ b2(z2.d dVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new z2.d() : dVar);
    }
}
