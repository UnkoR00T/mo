package d8;

import android.os.Looper;
import b8.e2;

/* JADX INFO: loaded from: classes3.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f40327a = new a();

    class a implements u {
        a() {
        }

        @Override // d8.u
        public int c(t7.p pVar) {
            return pVar.f188385t != null ? 1 : 0;
        }

        @Override // d8.u
        public void d(Looper looper, e2 e2Var) {
        }

        @Override // d8.u
        public m f(t.a aVar, t7.p pVar) {
            if (pVar.f188385t == null) {
                return null;
            }
            return new z(new m.a(new l0(1), 6001));
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40328a = new b() { // from class: d8.v
            @Override // d8.u.b
            public final void b() {
                u.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void b();
    }

    default void a() {
    }

    default void b() {
    }

    int c(t7.p pVar);

    void d(Looper looper, e2 e2Var);

    default b e(t.a aVar, t7.p pVar) {
        return b.f40328a;
    }

    m f(t.a aVar, t7.p pVar);
}
