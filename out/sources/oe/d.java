package oe;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f144980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b.a f144981b;

    d(Context context, b.a aVar) {
        this.f144980a = context.getApplicationContext();
        this.f144981b = aVar;
    }

    private void k() {
        r.a(this.f144980a).d(this.f144981b);
    }

    private void l() {
        r.a(this.f144980a).e(this.f144981b);
    }

    @Override // oe.l
    public void e() {
        l();
    }

    @Override // oe.l
    public void g() {
    }

    @Override // oe.l
    public void n() {
        k();
    }
}
