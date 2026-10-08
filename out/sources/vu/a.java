package vu;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.d;
import fr.e;
import fr.s;
import fr.t0;
import fr.v0;
import fr.x;
import gu.b;
import gu.h;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import mr.c;
import oq.a0;
import oq.b0;
import oq.d0;
import oq.g0;
import oq.i0;
import oq.z;
import p071kotlin.Metadata;
import yu.a1;
import yu.a2;
import yu.b2;
import yu.c0;
import yu.c2;
import yu.d2;
import yu.e0;
import yu.e2;
import yu.f;
import yu.f2;
import yu.g;
import yu.g2;
import yu.h0;
import yu.j;
import yu.j0;
import yu.l;
import yu.l0;
import yu.m;
import yu.m0;
import yu.o0;
import yu.p;
import yu.p1;
import yu.q;
import yu.r;
import yu.s1;
import yu.t1;
import yu.u0;
import yu.u1;
import yu.w1;
import yu.x1;
import yu.y;
import yu.y1;
import yu.z1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000à\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\u001aG\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007\u001aa\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00100\u0002\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002H\u0007¢\u0006\u0004\b!\u0010\u0019\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020#0\u0002*\u00020\"¢\u0006\u0004\b\f\u0010$\u001a\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0002¢\u0006\u0004\b&\u0010\u0019\u001a\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0002H\u0007¢\u0006\u0004\b(\u0010\u0019\u001a\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020*0\u0002*\u00020)¢\u0006\u0004\b\n\u0010+\u001a\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0002¢\u0006\u0004\b-\u0010\u0019\u001a\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0002H\u0007¢\u0006\u0004\b/\u0010\u0019\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002010\u0002*\u000200¢\u0006\u0004\b\u000b\u00102\u001a\u0013\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0002¢\u0006\u0004\b4\u0010\u0019\u001a\u0015\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0002H\u0007¢\u0006\u0004\b6\u0010\u0019\u001a\u0017\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0002*\u000207¢\u0006\u0004\b9\u0010:\u001a\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0002¢\u0006\u0004\b<\u0010\u0019\u001a\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0002*\u00020=¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u0002¢\u0006\u0004\bB\u0010\u0019\u001a\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u0002*\u00020C¢\u0006\u0004\bE\u0010F\u001a\u0013\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u0002¢\u0006\u0004\bH\u0010\u0019\u001a\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u0002*\u00020I¢\u0006\u0004\bJ\u0010K\u001a\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u0002*\u00020L¢\u0006\u0004\bN\u0010O\u001aM\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010V0\u0002\"\b\b\u0000\u0010Q*\u00020P\"\n\b\u0001\u0010R*\u0004\u0018\u00018\u00002\f\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000S2\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\bW\u0010X\u001a-\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Y0\u0002\"\u0004\b\u0000\u0010Q2\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bZ\u0010[\u001a-\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\\0\u0002\"\u0004\b\u0000\u0010Q2\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b]\u0010[\u001aG\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010^0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b_\u0010\u0007\u001a\u0017\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u0002*\u00020`¢\u0006\u0004\bb\u0010c\u001a\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u0002*\u00020d¢\u0006\u0004\bf\u0010g\u001a\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\u0002*\u00020h¢\u0006\u0004\bj\u0010k\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020m0\u0002*\u00020l¢\u0006\u0004\b\u0000\u0010n\u001a\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020p0\u0002*\u00020o¢\u0006\u0004\bR\u0010q\u001a\u0019\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u0002*\u00020rH\u0007¢\u0006\u0004\bt\u0010u\u001a\u0019\u0010x\u001a\b\u0012\u0004\u0012\u00020w0\u0002*\u00020vH\u0007¢\u0006\u0004\bx\u0010y\u001a\u0015\u0010{\u001a\b\u0012\u0004\u0012\u00020z0\u0002H\u0007¢\u0006\u0004\b{\u0010\u0019\"3\u0010\u007f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010Q*\u00020P*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\f\u0012\u0004\b}\u0010~\u001a\u0004\b|\u0010[¨\u0006\u0080\u0001"}, d2 = {"K", "V", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "Loq/r;", "m", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "j", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "Loq/x;", "p", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "Lkotlin/Char$Companion;", "", "x", "(Lfr/g;)Lkotlinx/serialization/KSerializer;", "", "d", "()Lkotlinx/serialization/KSerializer;", "Lkotlin/Byte$Companion;", "", "w", "(Lfr/e;)Lkotlinx/serialization/KSerializer;", "", "c", "Loq/a0;", "q", "Lkotlin/Short$Companion;", "", "(Lfr/t0;)Lkotlinx/serialization/KSerializer;", "", "o", "Loq/h0;", "t", "Lkotlin/Int$Companion;", "", "(Lfr/s;)Lkotlinx/serialization/KSerializer;", "", "g", "Loq/c0;", "r", "Lkotlin/Long$Companion;", "", "(Lfr/x;)Lkotlinx/serialization/KSerializer;", "", "i", "Loq/e0;", "s", "Lkotlin/Float$Companion;", "", "z", "(Lfr/m;)Lkotlinx/serialization/KSerializer;", "", "f", "Lkotlin/Double$Companion;", "", "y", "(Lfr/l;)Lkotlinx/serialization/KSerializer;", "", "e", "Lkotlin/Boolean$Companion;", "", "v", "(Lfr/d;)Lkotlinx/serialization/KSerializer;", "", "b", "Loq/i0;", i.f37094u, "(Loq/i0;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", "", ip.a.f96138c, "(Lfr/v0;)Lkotlinx/serialization/KSerializer;", "", "T", "E", "Lmr/c;", "kClass", "elementSerializer", "", "a", "(Lmr/c;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "h", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "", "n", "", "k", "Loq/b0$a;", "Loq/b0;", "I", "(Loq/b0$a;)Lkotlinx/serialization/KSerializer;", "Loq/d0$a;", "Loq/d0;", "J", "(Loq/d0$a;)Lkotlinx/serialization/KSerializer;", "Loq/z$a;", "Loq/z;", i.f37087n, "(Loq/z$a;)Lkotlinx/serialization/KSerializer;", "Loq/g0$a;", "Loq/g0;", "(Loq/g0$a;)Lkotlinx/serialization/KSerializer;", "Lgu/b$a;", "Lgu/b;", "(Lgu/b$a;)Lkotlinx/serialization/KSerializer;", "Lgu/h$a;", "Lgu/h;", "F", "(Lgu/h$a;)Lkotlinx/serialization/KSerializer;", "Lhu/a$a;", "Lhu/a;", "G", "(Lhu/a$a;)Lkotlinx/serialization/KSerializer;", "", "l", "u", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "nullable", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class a {
    public static final KSerializer<Integer> A(s sVar) {
        return e0.f229430a;
    }

    public static final KSerializer<Long> B(x xVar) {
        return m0.f229472a;
    }

    public static final KSerializer<Short> C(t0 t0Var) {
        return t1.f229509a;
    }

    public static final KSerializer<String> D(v0 v0Var) {
        return u1.f229515a;
    }

    public static final KSerializer<b> E(b.Companion companion) {
        return r.f229496a;
    }

    public static final KSerializer<h> F(h.Companion companion) {
        return c0.f229423a;
    }

    public static final KSerializer<hu.a> G(hu.a.Companion companion) {
        return g2.f229443a;
    }

    public static final KSerializer<z> H(z.Companion companion) {
        return y1.f229537a;
    }

    public static final KSerializer<b0> I(b0.Companion companion) {
        return a2.f229419a;
    }

    public static final KSerializer<d0> J(d0.Companion companion) {
        return c2.f229426a;
    }

    public static final KSerializer<g0> K(g0.Companion companion) {
        return e2.f229433a;
    }

    public static final KSerializer<i0> L(i0 i0Var) {
        return f2.f229439b;
    }

    public static final <T, E extends T> KSerializer<E[]> a(c<T> cVar, KSerializer<E> kSerializer) {
        return new p1(cVar, kSerializer);
    }

    public static final KSerializer<boolean[]> b() {
        return g.f229441c;
    }

    public static final KSerializer<byte[]> c() {
        return yu.i.f229459c;
    }

    public static final KSerializer<char[]> d() {
        return l.f229467c;
    }

    public static final KSerializer<double[]> e() {
        return p.f229482c;
    }

    public static final KSerializer<float[]> f() {
        return yu.x.f229529c;
    }

    public static final KSerializer<int[]> g() {
        return yu.d0.f229428c;
    }

    public static final <T> KSerializer<List<T>> h(KSerializer<T> kSerializer) {
        return new f(kSerializer);
    }

    public static final KSerializer<long[]> i() {
        return l0.f229468c;
    }

    public static final <K, V> KSerializer<Map.Entry<K, V>> j(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        return new o0(kSerializer, kSerializer2);
    }

    public static final <K, V> KSerializer<Map<K, V>> k(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        return new h0(kSerializer, kSerializer2);
    }

    public static final KSerializer l() {
        return u0.f229513a;
    }

    public static final <K, V> KSerializer<oq.r<K, V>> m(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        return new a1(kSerializer, kSerializer2);
    }

    public static final <T> KSerializer<Set<T>> n(KSerializer<T> kSerializer) {
        return new j0(kSerializer);
    }

    public static final KSerializer<short[]> o() {
        return s1.f229503c;
    }

    public static final <A, B, C> KSerializer<oq.x<A, B, C>> p(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        return new w1(kSerializer, kSerializer2, kSerializer3);
    }

    public static final KSerializer<a0> q() {
        return x1.f229531c;
    }

    public static final KSerializer<oq.c0> r() {
        return z1.f229541c;
    }

    public static final KSerializer<oq.e0> s() {
        return b2.f229422c;
    }

    public static final KSerializer<oq.h0> t() {
        return d2.f229429c;
    }

    public static final <T> KSerializer<T> u(KSerializer<T> kSerializer) {
        return kSerializer.getDescriptor().o() ? kSerializer : new yu.v0(kSerializer);
    }

    public static final KSerializer<Boolean> v(d dVar) {
        return yu.h.f229445a;
    }

    public static final KSerializer<Byte> w(e eVar) {
        return j.f229461a;
    }

    public static final KSerializer<Character> x(fr.g gVar) {
        return m.f229470a;
    }

    public static final KSerializer<Double> y(fr.l lVar) {
        return q.f229489a;
    }

    public static final KSerializer<Float> z(fr.m mVar) {
        return y.f229532a;
    }
}
