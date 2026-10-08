package ij;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f93004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2189a f93005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f93006c;

    /* JADX INFO: renamed from: ij.a$a, reason: collision with other inner class name */
    public interface InterfaceC2189a {
        void a(Typeface typeface);
    }

    public a(InterfaceC2189a interfaceC2189a, Typeface typeface) {
        this.f93004a = typeface;
        this.f93005b = interfaceC2189a;
    }

    private void d(Typeface typeface) {
        if (this.f93006c) {
            return;
        }
        this.f93005b.a(typeface);
    }

    @Override // ij.f
    public void a(int i15) {
        d(this.f93004a);
    }

    @Override // ij.f
    public void b(Typeface typeface, boolean z15) {
        d(typeface);
    }

    public void c() {
        this.f93006c = true;
    }
}
