package io.sentry;

import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public interface a1 {
    i8 A(f4.b bVar);

    Map<String, String> B();

    List<io.sentry.internal.eventprocessor.a> C();

    io.sentry.protocol.c D();

    String E();

    void F(l1 l1Var);

    List<String> G();

    io.sentry.protocol.g0 H();

    String I();

    void J();

    void K(e1 e1Var);

    b7 L();

    io.sentry.protocol.v M();

    y3 N();

    void O(String str);

    e1 P();

    void Q(r6 r6Var);

    y3 R(f4.a aVar);

    void S(f4.c cVar);

    void T(io.sentry.protocol.v vVar);

    List<e0> U();

    void V(y3 y3Var);

    j1 a();

    io.sentry.protocol.m b();

    void clear();

    /* JADX INFO: renamed from: clone */
    a1 m41clone();

    Map<String, Object> getExtras();

    i8 getSession();

    List<b> h();

    void p(String str, String str2);

    void q(f fVar, j0 j0Var);

    void r(Throwable th4, j1 j1Var, String str);

    q7 s();

    l1 u();

    i8 v();

    void w(io.sentry.protocol.v vVar);

    f4.d x();

    void y(q7 q7Var);

    Queue<f> z();
}
