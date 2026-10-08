package a8;

/* JADX INFO: loaded from: classes3.dex */
public interface z2 extends x2.b {

    public interface a {
        void a();

        void b();
    }

    void B();

    boolean E();

    default boolean F(long j15) {
        return false;
    }

    void G(b3 b3Var, t7.p[] pVarArr, h8.z0 z0Var, long j15, boolean z15, boolean z16, long j16, long j17, h8.c0.b bVar);

    default long J(long j15, long j16) {
        if (getState() == 1) {
            return (f() || e()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void L(long j15, boolean z15);

    a3 M();

    default void N(float f15, float f16) {
    }

    void P(int i15, b8.e2 e2Var, w7.h hVar);

    long R();

    c2 S();

    default void b() {
    }

    void c();

    boolean e();

    boolean f();

    int g();

    String getName();

    int getState();

    void h(long j15, long j16);

    h8.z0 j();

    void l(t7.e0 e0Var);

    boolean n();

    void q(t7.p[] pVarArr, h8.z0 z0Var, long j15, long j16, h8.c0.b bVar);

    default void r() {
    }

    void reset();

    void s();

    void start();

    void stop();
}
