package ss;

import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public interface x {

    public interface a {
        void a();

        a b(zs.f fVar, zs.b bVar);

        void c(zs.f fVar, zs.b bVar, zs.f fVar2);

        void d(zs.f fVar, Object obj);

        b e(zs.f fVar);

        void f(zs.f fVar, ft.f fVar2);
    }

    public interface b {
        void a();

        void b(zs.b bVar, zs.f fVar);

        a c(zs.b bVar);

        void d(Object obj);

        void e(ft.f fVar);
    }

    public interface c {
        void a();

        a b(zs.b bVar, h1 h1Var);
    }

    public interface d {
        e a(zs.f fVar, String str);

        c b(zs.f fVar, String str, Object obj);
    }

    public interface e extends c {
        a c(int i15, zs.b bVar, h1 h1Var);
    }

    void a(d dVar, byte[] bArr);

    String b();

    void c(c cVar, byte[] bArr);

    ts.a d();

    zs.b i();
}
