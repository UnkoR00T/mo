package rl;

import com.google.firebase.messaging.k0;
import gl.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f174821b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl.a f174822a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private rl.a f174823a = null;

        a() {
        }

        public b a() {
            return new b(this.f174823a);
        }

        public a b(rl.a aVar) {
            this.f174823a = aVar;
            return this;
        }
    }

    b(rl.a aVar) {
        this.f174822a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public rl.a a() {
        return this.f174822a;
    }

    public byte[] c() {
        return k0.a(this);
    }
}
