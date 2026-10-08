package ak;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes4.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collector<Object, ?, n0<Object>> f7004a = Collector.of(new Supplier() { // from class: ak.l
        @Override // java.util.function.Supplier
        public final Object get() {
            return n0.s();
        }
    }, new BiConsumer() { // from class: ak.q
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((n0.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: ak.r
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((n0.a) obj).m((n0.a) obj2);
        }
    }, new Function() { // from class: ak.s
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((n0.a) obj).k();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Collector<Object, ?, u0<Object>> f7005b = Collector.of(new Supplier() { // from class: ak.t
        @Override // java.util.function.Supplier
        public final Object get() {
            return u0.s();
        }
    }, new BiConsumer() { // from class: ak.u
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((u0.a) obj).a(obj2);
        }
    }, new BinaryOperator() { // from class: ak.v
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((u0.a) obj).l((u0.a) obj2);
        }
    }, new Function() { // from class: ak.w
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((u0.a) obj).k();
        }
    }, new Collector.Characteristics[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collector<q1<Comparable<?>>, ?, t0<Comparable<?>>> f7006c = Collector.of(new Supplier() { // from class: ak.m
        @Override // java.util.function.Supplier
        public final Object get() {
            return t0.d();
        }
    }, new BiConsumer() { // from class: ak.n
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((t0.a) obj).a((q1) obj2);
        }
    }, new BinaryOperator() { // from class: ak.o
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((t0.a) obj).d((t0.a) obj2);
        }
    }, new Function() { // from class: ak.p
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((t0.a) obj).c();
        }
    }, new Collector.Characteristics[0]);

    static <E> Collector<E, ?, n0<E>> a() {
        return (Collector<E, ?, n0<E>>) f7004a;
    }
}
