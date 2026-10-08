package zj;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f235404a;

    class a extends i {
        a(i iVar) {
            super(iVar, null);
        }

        @Override // zj.i
        public <A extends Appendable> A b(A a15, Iterator<? extends Object> it) throws IOException {
            p.r(a15, "appendable");
            p.r(it, "parts");
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    a15.append(i.this.j(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a15.append(i.this.f235404a);
                    a15.append(i.this.j(next2));
                }
            }
            return a15;
        }

        @Override // zj.i
        public b k(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f235406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f235407b;

        /* synthetic */ b(i iVar, String str, h hVar) {
            this(iVar, str);
        }

        public <A extends Appendable> A a(A a15, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            p.q(a15);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a15.append(this.f235406a.j(next.getKey()));
                a15.append(this.f235407b);
                a15.append(this.f235406a.j(next.getValue()));
                while (it.hasNext()) {
                    a15.append(this.f235406a.f235404a);
                    Map.Entry<?, ?> next2 = it.next();
                    a15.append(this.f235406a.j(next2.getKey()));
                    a15.append(this.f235407b);
                    a15.append(this.f235406a.j(next2.getValue()));
                }
            }
            return a15;
        }

        public StringBuilder b(StringBuilder sb5, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return c(sb5, iterable.iterator());
        }

        public StringBuilder c(StringBuilder sb5, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                a(sb5, it);
                return sb5;
            } catch (IOException e15) {
                throw new AssertionError(e15);
            }
        }

        public String d(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return e(iterable.iterator());
        }

        public String e(Iterator<? extends Map.Entry<?, ?>> it) {
            return c(new StringBuilder(), it).toString();
        }

        public String f(Map<?, ?> map) {
            return d(map.entrySet());
        }

        private b(i iVar, String str) {
            this.f235406a = iVar;
            this.f235407b = (String) p.q(str);
        }
    }

    /* synthetic */ i(i iVar, h hVar) {
        this(iVar);
    }

    public static i g(char c15) {
        return new i(String.valueOf(c15));
    }

    public static i h(String str) {
        return new i(str);
    }

    public <A extends Appendable> A b(A a15, Iterator<? extends Object> it) throws IOException {
        p.q(a15);
        if (it.hasNext()) {
            a15.append(j(it.next()));
            while (it.hasNext()) {
                a15.append(this.f235404a);
                a15.append(j(it.next()));
            }
        }
        return a15;
    }

    public final StringBuilder c(StringBuilder sb5, Iterable<? extends Object> iterable) {
        return d(sb5, iterable.iterator());
    }

    public final StringBuilder d(StringBuilder sb5, Iterator<? extends Object> it) {
        try {
            b(sb5, it);
            return sb5;
        } catch (IOException e15) {
            throw new AssertionError(e15);
        }
    }

    public final String e(Iterable<? extends Object> iterable) {
        return f(iterable.iterator());
    }

    public final String f(Iterator<? extends Object> it) {
        return d(new StringBuilder(), it).toString();
    }

    public i i() {
        return new a(this);
    }

    CharSequence j(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public b k(String str) {
        return new b(this, str, null);
    }

    private i(String str) {
        this.f235404a = (String) p.q(str);
    }

    private i(i iVar) {
        this.f235404a = iVar.f235404a;
    }
}
