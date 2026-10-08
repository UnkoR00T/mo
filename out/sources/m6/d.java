package m6;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f123821a;

    private static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f123822a;

        a(Object obj) {
            this.f123822a = (InputContentInfo) obj;
        }

        @Override // m6.d.b
        public Object a() {
            return this.f123822a;
        }

        @Override // m6.d.b
        public Uri b() {
            return this.f123822a.getContentUri();
        }

        @Override // m6.d.b
        public void c() {
            this.f123822a.requestPermission();
        }

        @Override // m6.d.b
        public Uri d() {
            return this.f123822a.getLinkUri();
        }

        @Override // m6.d.b
        public ClipDescription getDescription() {
            return this.f123822a.getDescription();
        }
    }

    private interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    private d(b bVar) {
        this.f123821a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f123821a.b();
    }

    public ClipDescription b() {
        return this.f123821a.getDescription();
    }

    public Uri c() {
        return this.f123821a.d();
    }

    public void d() {
        this.f123821a.c();
    }

    public Object e() {
        return this.f123821a.a();
    }
}
