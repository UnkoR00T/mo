package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t2 f95716b = new t2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.r<q7> f95717a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.s2
        @Override // io.sentry.util.r.a
        public final Object a() {
            return q7.empty();
        }
    });

    private t2() {
    }

    public static t2 d() {
        return f95716b;
    }

    @Override // io.sentry.a1
    public i8 A(f4.b bVar) {
        return null;
    }

    @Override // io.sentry.a1
    public Map<String, String> B() {
        return new HashMap();
    }

    @Override // io.sentry.a1
    public List<io.sentry.internal.eventprocessor.a> C() {
        return new ArrayList();
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.c D() {
        return new io.sentry.protocol.c();
    }

    @Override // io.sentry.a1
    public String E() {
        return null;
    }

    @Override // io.sentry.a1
    public void F(l1 l1Var) {
    }

    @Override // io.sentry.a1
    public List<String> G() {
        return new ArrayList();
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.g0 H() {
        return null;
    }

    @Override // io.sentry.a1
    public String I() {
        return null;
    }

    @Override // io.sentry.a1
    public void J() {
    }

    @Override // io.sentry.a1
    public void K(e1 e1Var) {
    }

    @Override // io.sentry.a1
    public b7 L() {
        return null;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.v M() {
        return io.sentry.protocol.v.f95495b;
    }

    @Override // io.sentry.a1
    public y3 N() {
        return new y3();
    }

    @Override // io.sentry.a1
    public void O(String str) {
    }

    @Override // io.sentry.a1
    public e1 P() {
        return y2.j();
    }

    @Override // io.sentry.a1
    public void Q(r6 r6Var) {
    }

    @Override // io.sentry.a1
    public y3 R(f4.a aVar) {
        return new y3();
    }

    @Override // io.sentry.a1
    public void S(f4.c cVar) {
    }

    @Override // io.sentry.a1
    public void T(io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.a1
    public List<e0> U() {
        return new ArrayList();
    }

    @Override // io.sentry.a1
    public void V(y3 y3Var) {
    }

    @Override // io.sentry.a1
    public j1 a() {
        return null;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.m b() {
        return null;
    }

    @Override // io.sentry.a1
    public void clear() {
    }

    @Override // io.sentry.a1
    public Map<String, Object> getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.a1
    public i8 getSession() {
        return null;
    }

    @Override // io.sentry.a1
    public List<b> h() {
        return new ArrayList();
    }

    @Override // io.sentry.a1
    public void p(String str, String str2) {
    }

    @Override // io.sentry.a1
    public void q(f fVar, j0 j0Var) {
    }

    @Override // io.sentry.a1
    public void r(Throwable th4, j1 j1Var, String str) {
    }

    @Override // io.sentry.a1
    public q7 s() {
        return this.f95717a.a();
    }

    @Override // io.sentry.a1
    public l1 u() {
        return null;
    }

    @Override // io.sentry.a1
    public i8 v() {
        return null;
    }

    @Override // io.sentry.a1
    public void w(io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.a1
    public f4.d x() {
        return null;
    }

    @Override // io.sentry.a1
    public void y(q7 q7Var) {
    }

    @Override // io.sentry.a1
    public Queue<f> z() {
        return new ArrayDeque();
    }

    @Override // io.sentry.a1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public a1 m47clone() {
        return d();
    }
}
