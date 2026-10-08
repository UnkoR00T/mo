package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
interface f1 {
    void A(List<String> list);

    void B(List<Float> list);

    boolean C();

    int D();

    void E(List<g> list);

    void F(List<Double> list);

    long G();

    String H();

    <T> void I(T t15, g1<T> g1Var, o oVar);

    <T> void J(List<T> list, g1<T> g1Var, o oVar);

    <T> T K(Class<T> cls, o oVar);

    @Deprecated
    <T> T L(Class<T> cls, o oVar);

    <K, V> void M(Map<K, V> map, k0.a<K, V> aVar, o oVar);

    <T> void N(T t15, g1<T> g1Var, o oVar);

    @Deprecated
    <T> void O(List<T> list, g1<T> g1Var, o oVar);

    long a();

    void b(List<Integer> list);

    void c(List<Long> list);

    boolean d();

    long e();

    void f(List<Long> list);

    int g();

    int getTag();

    void h(List<Long> list);

    void i(List<Integer> list);

    int j();

    int k();

    void l(List<Boolean> list);

    void m(List<String> list);

    g n();

    int o();

    void p(List<Long> list);

    void q(List<Integer> list);

    long r();

    double readDouble();

    float readFloat();

    void s(List<Integer> list);

    int t();

    void u(List<Long> list);

    void v(List<Integer> list);

    void w(List<Integer> list);

    long x();

    String y();

    int z();
}
