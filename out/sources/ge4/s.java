package ge4;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class s<T> {

    class a extends s<Iterable<T>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ge4.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                s.this.a(vVar, it.next());
            }
        }
    }

    class b extends s<Object> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ge4.s
        void a(v vVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i15 = 0; i15 < length; i15++) {
                s.this.a(vVar, Array.get(obj, i15));
            }
        }
    }

    static final class c<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ge4.h<T, fv.c0> f72375c;

        c(Method method, int i15, ge4.h<T, fv.c0> hVar) {
            this.f72373a = method;
            this.f72374b = i15;
            this.f72375c = hVar;
        }

        @Override // ge4.s
        void a(v vVar, T t15) {
            if (t15 == null) {
                throw c0.p(this.f72373a, this.f72374b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                vVar.l(this.f72375c.a(t15));
            } catch (IOException e15) {
                throw c0.q(this.f72373a, e15, this.f72374b, "Unable to convert " + t15 + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f72376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ge4.h<T, String> f72377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f72378c;

        d(String str, ge4.h<T, String> hVar, boolean z15) {
            Objects.requireNonNull(str, "name == null");
            this.f72376a = str;
            this.f72377b = hVar;
            this.f72378c = z15;
        }

        @Override // ge4.s
        void a(v vVar, T t15) {
            String strA;
            if (t15 == null || (strA = this.f72377b.a(t15)) == null) {
                return;
            }
            vVar.a(this.f72376a, strA, this.f72378c);
        }
    }

    static final class e<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ge4.h<T, String> f72381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f72382d;

        e(Method method, int i15, ge4.h<T, String> hVar, boolean z15) {
            this.f72379a = method;
            this.f72380b = i15;
            this.f72381c = hVar;
            this.f72382d = z15;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ge4.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f72379a, this.f72380b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f72379a, this.f72380b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f72379a, this.f72380b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f72381c.a(value);
                if (strA == null) {
                    throw c0.p(this.f72379a, this.f72380b, "Field map value '" + value + "' converted to null by " + this.f72381c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.a(key, strA, this.f72382d);
            }
        }
    }

    static final class f<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f72383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ge4.h<T, String> f72384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f72385c;

        f(String str, ge4.h<T, String> hVar, boolean z15) {
            Objects.requireNonNull(str, "name == null");
            this.f72383a = str;
            this.f72384b = hVar;
            this.f72385c = z15;
        }

        @Override // ge4.s
        void a(v vVar, T t15) {
            String strA;
            if (t15 == null || (strA = this.f72384b.a(t15)) == null) {
                return;
            }
            vVar.b(this.f72383a, strA, this.f72385c);
        }
    }

    static final class g<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ge4.h<T, String> f72388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f72389d;

        g(Method method, int i15, ge4.h<T, String> hVar, boolean z15) {
            this.f72386a = method;
            this.f72387b = i15;
            this.f72388c = hVar;
            this.f72389d = z15;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ge4.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f72386a, this.f72387b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f72386a, this.f72387b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f72386a, this.f72387b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.b(key, this.f72388c.a(value), this.f72389d);
            }
        }
    }

    static final class h extends s<fv.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72391b;

        h(Method method, int i15) {
            this.f72390a = method;
            this.f72391b = i15;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ge4.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, fv.u uVar) {
            if (uVar == null) {
                throw c0.p(this.f72390a, this.f72391b, "Headers parameter must not be null.", new Object[0]);
            }
            vVar.c(uVar);
        }
    }

    static final class i<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fv.u f72394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ge4.h<T, fv.c0> f72395d;

        i(Method method, int i15, fv.u uVar, ge4.h<T, fv.c0> hVar) {
            this.f72392a = method;
            this.f72393b = i15;
            this.f72394c = uVar;
            this.f72395d = hVar;
        }

        @Override // ge4.s
        void a(v vVar, T t15) {
            if (t15 == null) {
                return;
            }
            try {
                vVar.d(this.f72394c, this.f72395d.a(t15));
            } catch (IOException e15) {
                throw c0.p(this.f72392a, this.f72393b, "Unable to convert " + t15 + " to RequestBody", e15);
            }
        }
    }

    static final class j<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ge4.h<T, fv.c0> f72398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f72399d;

        j(Method method, int i15, ge4.h<T, fv.c0> hVar, String str) {
            this.f72396a = method;
            this.f72397b = i15;
            this.f72398c = hVar;
            this.f72399d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ge4.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f72396a, this.f72397b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f72396a, this.f72397b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f72396a, this.f72397b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                vVar.d(fv.u.h("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f72399d), this.f72398c.a(value));
            }
        }
    }

    static final class k<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f72402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ge4.h<T, String> f72403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f72404e;

        k(Method method, int i15, String str, ge4.h<T, String> hVar, boolean z15) {
            this.f72400a = method;
            this.f72401b = i15;
            Objects.requireNonNull(str, "name == null");
            this.f72402c = str;
            this.f72403d = hVar;
            this.f72404e = z15;
        }

        @Override // ge4.s
        void a(v vVar, T t15) throws EOFException {
            if (t15 != null) {
                vVar.f(this.f72402c, this.f72403d.a(t15), this.f72404e);
                return;
            }
            throw c0.p(this.f72400a, this.f72401b, "Path parameter \"" + this.f72402c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f72405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ge4.h<T, String> f72406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f72407c;

        l(String str, ge4.h<T, String> hVar, boolean z15) {
            Objects.requireNonNull(str, "name == null");
            this.f72405a = str;
            this.f72406b = hVar;
            this.f72407c = z15;
        }

        @Override // ge4.s
        void a(v vVar, T t15) {
            String strA;
            if (t15 == null || (strA = this.f72406b.a(t15)) == null) {
                return;
            }
            vVar.g(this.f72405a, strA, this.f72407c);
        }
    }

    static final class m<T> extends s<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ge4.h<T, String> f72410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f72411d;

        m(Method method, int i15, ge4.h<T, String> hVar, boolean z15) {
            this.f72408a = method;
            this.f72409b = i15;
            this.f72410c = hVar;
            this.f72411d = z15;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ge4.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, Map<String, T> map) {
            if (map == null) {
                throw c0.p(this.f72408a, this.f72409b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw c0.p(this.f72408a, this.f72409b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw c0.p(this.f72408a, this.f72409b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strA = this.f72410c.a(value);
                if (strA == null) {
                    throw c0.p(this.f72408a, this.f72409b, "Query map value '" + value + "' converted to null by " + this.f72410c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                vVar.g(key, strA, this.f72411d);
            }
        }
    }

    static final class n<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ge4.h<T, String> f72412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f72413b;

        n(ge4.h<T, String> hVar, boolean z15) {
            this.f72412a = hVar;
            this.f72413b = z15;
        }

        @Override // ge4.s
        void a(v vVar, T t15) {
            if (t15 == null) {
                return;
            }
            vVar.g(this.f72412a.a(t15), null, this.f72413b);
        }
    }

    static final class o extends s<fv.y.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f72414a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ge4.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(v vVar, fv.y.c cVar) {
            if (cVar != null) {
                vVar.e(cVar);
            }
        }
    }

    static final class p extends s<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f72415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f72416b;

        p(Method method, int i15) {
            this.f72415a = method;
            this.f72416b = i15;
        }

        @Override // ge4.s
        void a(v vVar, Object obj) {
            if (obj == null) {
                throw c0.p(this.f72415a, this.f72416b, "@Url parameter is null.", new Object[0]);
            }
            vVar.m(obj);
        }
    }

    static final class q<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<T> f72417a;

        q(Class<T> cls) {
            this.f72417a = cls;
        }

        @Override // ge4.s
        void a(v vVar, T t15) {
            vVar.h(this.f72417a, t15);
        }
    }

    s() {
    }

    abstract void a(v vVar, T t15);

    final s<Object> b() {
        return new b();
    }

    final s<Iterable<T>> c() {
        return new a();
    }
}
