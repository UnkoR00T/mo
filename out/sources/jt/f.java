package jt;

import java.util.Collection;
import java.util.List;
import ms.k;
import pq.v;
import vr.g1;
import yr.k0;

/* JADX INFO: loaded from: classes4.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105213a = a.f105214a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f105214a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final jt.a f105215b = new jt.a(v.n());

        private a() {
        }

        public final jt.a a() {
            return f105215b;
        }
    }

    void a(vr.e eVar, List<vr.d> list, k kVar);

    List<zs.f> b(vr.e eVar, k kVar);

    k0 c(vr.e eVar, k0 k0Var, k kVar);

    List<zs.f> d(vr.e eVar, k kVar);

    void e(vr.e eVar, zs.f fVar, Collection<g1> collection, k kVar);

    void f(vr.e eVar, zs.f fVar, Collection<g1> collection, k kVar);

    List<zs.f> g(vr.e eVar, k kVar);

    void h(vr.e eVar, zs.f fVar, List<vr.e> list, k kVar);
}
