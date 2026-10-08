package p076m2;

import er.a;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lm2/b4;", "T", "Lm2/z;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Ler/a;)V", "Lm2/c4;", "value", "Lm2/o6;", "f", "(Lm2/c4;)Lm2/o6;", "c", "(Ljava/lang/Object;)Lm2/c4;", "d", "e", "previous", "b", "(Lm2/c4;Lm2/o6;)Lm2/o6;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b4<T> extends z<T> {
    public b4(a<? extends T> aVar) {
        super(aVar, null);
    }

    private final o6<T> f(c4<T> value) {
        if (!value.getIsDynamic()) {
            if (value.c() != null) {
                return new ComputedValueHolder(value.c());
            }
            return value.f() != null ? new DynamicValueHolder(value.f()) : new StaticValueHolder(value.d());
        }
        a3<T> a3VarF = value.f();
        if (a3VarF == null) {
            T tG = value.g();
            w5<T> w5VarE = value.e();
            if (w5VarE == null) {
                w5VarE = x5.r();
            }
            a3VarF = x5.i(tG, w5VarE);
        }
        return new DynamicValueHolder(a3VarF);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 java.lang.Object) = (r5v5 java.lang.Object), (r5v6 java.lang.Object) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p076m2.z
    public o6<T> b(c4<T> value, o6<T> previous) {
        ComputedValueHolder computedValueHolder;
        StaticValueHolder staticValueHolder;
        DynamicValueHolder dynamicValueHolder = null;
        if (previous instanceof DynamicValueHolder) {
            if (value.getIsDynamic()) {
                dynamicValueHolder = (DynamicValueHolder) previous;
                dynamicValueHolder.b().setValue(value.d());
            }
        } else if (previous instanceof StaticValueHolder) {
            if (value.j()) {
                staticValueHolder = (StaticValueHolder) previous;
                if (t.c(value.d(), staticValueHolder.b())) {
                    Object obj = computedValueHolder;
                    obj = staticValueHolder;
                    dynamicValueHolder = (o6<T>) obj;
                }
            }
        } else if (previous instanceof ComputedValueHolder) {
            computedValueHolder = (ComputedValueHolder) previous;
            if (value.c() == computedValueHolder.b()) {
                Object obj2 = computedValueHolder;
                obj2 = staticValueHolder;
                dynamicValueHolder = (o6<T>) obj2;
            }
        }
        return dynamicValueHolder == null ? f(value) : dynamicValueHolder;
    }

    public abstract c4<T> c(T value);

    public final c4<T> d(T value) {
        return c(value);
    }

    public final c4<T> e(T value) {
        return c(value).h();
    }
}
