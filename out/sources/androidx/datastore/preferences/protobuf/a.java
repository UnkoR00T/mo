package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0256a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0256a<MessageType, BuilderType>> implements r0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0256a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0256a<MessageType, BuilderType>> implements r0.a {
        protected static <T> void n(Iterable<T> iterable, List<? super T> list) {
            z.a(iterable);
            if (!(iterable instanceof e0)) {
                if (iterable instanceof a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    o(iterable, list);
                    return;
                }
            }
            List<?> listY = ((e0) iterable).y();
            e0 e0Var = (e0) list;
            int size = list.size();
            for (Object obj : listY) {
                if (obj == null) {
                    String str = "Element at index " + (e0Var.size() - size) + " is null.";
                    for (int size2 = e0Var.size() - 1; size2 >= size; size2--) {
                        e0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof g) {
                    e0Var.R2((g) obj);
                } else if (obj instanceof byte[]) {
                    e0Var.R2(g.i((byte[]) obj));
                } else {
                    e0Var.add((String) obj);
                }
            }
        }

        private static <T> void o(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t15 : iterable) {
                if (t15 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t15);
            }
        }

        protected static m1 s(r0 r0Var) {
            return new m1(r0Var);
        }

        protected abstract BuilderType p(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public BuilderType V(r0 r0Var) {
            if (i().getClass().isInstance(r0Var)) {
                return (BuilderType) p((a) r0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        AbstractC0256a.n(iterable, list);
    }

    private String h(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int d() {
        throw new UnsupportedOperationException();
    }

    int f(g1 g1Var) {
        int iD = d();
        if (iD != -1) {
            return iD;
        }
        int iG = g1Var.g(this);
        n(iG);
        return iG;
    }

    m1 k() {
        return new m1(this);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public g l() {
        try {
            g.h hVarT = g.t(e());
            m(hVarT.b());
            return hVarT.a();
        } catch (IOException e15) {
            throw new RuntimeException(h("ByteString"), e15);
        }
    }

    void n(int i15) {
        throw new UnsupportedOperationException();
    }

    public void o(OutputStream outputStream) {
        j jVarE0 = j.e0(outputStream, j.I(e()));
        m(jVarE0);
        jVarE0.b0();
    }
}
