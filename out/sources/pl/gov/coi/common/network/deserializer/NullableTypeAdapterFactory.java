package pl.gov.coi.common.network.deserializer;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.p;
import fr.q0;
import fr.t;
import java.lang.annotation.Annotation;
import mr.n;
import nr.d;
import p071kotlin.Metadata;
import zl.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpl/gov/coi/common/network/deserializer/NullableTypeAdapterFactory;", "Lcom/google/gson/b0;", "<init>", "()V", "", "T", "Lcom/google/gson/f;", "gson", "Lcom/google/gson/reflect/a;", "type", "Lcom/google/gson/a0;", "b", "(Lcom/google/gson/f;Lcom/google/gson/reflect/a;)Lcom/google/gson/a0;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NullableTypeAdapterFactory implements b0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/common/network/deserializer/NullableTypeAdapterFactory$a", "Lcom/google/gson/a0;", "Lzl/c;", "out", "value", "Loq/i0;", "d", "(Lzl/c;Ljava/lang/Object;)V", "Lzl/a;", "input", "b", "(Lzl/a;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<T> extends a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0<T> f158103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a<T> f158104b;

        a(a0<T> a0Var, com.google.gson.reflect.a<T> aVar) {
            this.f158103a = a0Var;
            this.f158104b = aVar;
        }

        @Override // com.google.gson.a0
        public T b(zl.a input) {
            T tB = this.f158103a.b(input);
            if (tB != null) {
                for (n nVar : d.a(q0.a(this.f158104b.c()))) {
                    if (!nVar.f().f()) {
                        or.a.b(nVar, true);
                        if (nVar.get(tB) == null) {
                            throw new p("Value of non-nullable member [" + nVar.getName() + "] cannot be null");
                        }
                    }
                }
            }
            return tB;
        }

        @Override // com.google.gson.a0
        public void d(c out, T value) {
            this.f158103a.d(out, value);
        }
    }

    @Override // com.google.gson.b0
    public <T> a0<T> b(f gson, com.google.gson.reflect.a<T> type) {
        a0<T> a0VarN = gson.n(this, type);
        for (Annotation annotation : type.c().getDeclaredAnnotations()) {
            if (t.c(dr.a.a(annotation).C(), "kotlin.Metadata")) {
                return new a(a0VarN, type);
            }
        }
        return null;
    }
}
