package b3;

import java.util.Arrays;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001aU\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0015\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00110\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"", "T", "", "inputs", "Lb3/x;", "saver", "", "key", "Lkotlin/Function0;", "init", "j", "([Ljava/lang/Object;Lb3/x;Ljava/lang/String;Ler/a;Lm2/r;II)Ljava/lang/Object;", "k", "([Ljava/lang/Object;Ler/a;Lm2/r;I)Ljava/lang/Object;", "i", "([Ljava/lang/Object;Lb3/x;Ler/a;Lm2/r;I)Ljava/lang/Object;", "stateSaver", "Lm2/a3;", "l", "([Ljava/lang/Object;Lb3/x;Ler/a;Lm2/r;I)Lm2/a3;", "inner", "f", "(Lb3/x;)Lb3/x;", "Lb3/r;", "value", "Loq/i0;", "n", "(Lb3/r;Ljava/lang/Object;)V", "e", "(Ljava/lang/Object;)Ljava/lang/String;", "", "a", "I", "MaxSupportedRadix", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f16306a = 36;

    public static final String e(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final <T> x<a3<T>, a3<Object>> f(final x<T, ? extends Object> xVar) {
        return a0.e(new er.p() { // from class: b3.c
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return f.g(xVar, (b0) obj, (a3) obj2);
            }
        }, new er.l() { // from class: b3.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.h(xVar, (a3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3 g(x xVar, b0 b0Var, a3 a3Var) {
        if (!(a3Var instanceof c3.b0)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        c3.b0 b0Var2 = (c3.b0) a3Var;
        Object objA = xVar.a(b0Var, b0Var2.getValue());
        if (objA != null) {
            return x5.i(objA, b0Var2.c());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3 h(x xVar, a3 a3Var) {
        if (!(a3Var instanceof c3.b0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c3.b0 b0Var = (c3.b0) a3Var;
        return x5.i(b0Var.getValue() != 0 ? xVar.b(b0Var.getValue()) : null, b0Var.c());
    }

    public static final <T> T i(Object[] objArr, x<T, ? extends Object> xVar, er.a<? extends T> aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(674689872, i15, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:175)");
        }
        T t15 = (T) j(Arrays.copyOf(objArr, objArr.length), xVar, null, aVar, rVar, (i15 & 112) | MLKEMEngine.KyberPolyBytes | ((i15 << 3) & 7168), 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return t15;
    }

    @oq.a
    public static final <T> T j(Object[] objArr, x<T, ? extends Object> xVar, String str, er.a<? extends T> aVar, p076m2.r rVar, int i15, int i16) {
        Object[] objArr2;
        final T t15;
        Object objF;
        if ((i16 & 2) != 0) {
            xVar = a0.f();
        }
        final x<T, ? extends Object> xVar2 = xVar;
        int i17 = i16 & 4;
        T tA = null;
        if (i17 != 0) {
            str = null;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(441892779, i15, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long jB = p076m2.m.b(rVar, 0);
        if (str == null || str.length() == 0) {
            str = Long.toString(jB, fu.a.a(f16306a));
        }
        final String str2 = str;
        final r rVar2 = (r) rVar.N(u.g());
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            if (rVar2 != null && (objF = rVar2.f(str2)) != null) {
                tA = xVar2.b(objF);
            }
            if (tA == null) {
                tA = aVar.a();
            }
            objArr2 = objArr;
            Object hVar = new h(xVar2, rVar2, str2, tA, objArr2);
            rVar.v(hVar);
            objE = hVar;
        } else {
            objArr2 = objArr;
        }
        final h hVar2 = (h) objE;
        Object objF2 = hVar2.f(objArr2);
        if (objF2 == null) {
            objF2 = aVar.a();
        }
        boolean zG = rVar.G(hVar2) | ((((i15 & 112) ^ 48) > 32 && rVar.G(xVar2)) || (i15 & 48) == 32) | rVar.G(rVar2) | rVar.W(str2) | rVar.G(objF2) | rVar.G(objArr2);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            final Object[] objArr3 = objArr2;
            t15 = (T) objF2;
            Object obj = new er.a() { // from class: b3.e
                @Override // er.a
                public final Object a() {
                    return f.m(hVar2, xVar2, rVar2, str2, t15, objArr3);
                }
            };
            rVar.v(obj);
            objE2 = obj;
        } else {
            t15 = (T) objF2;
        }
        Function0.g((er.a) objE2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return t15;
    }

    public static final <T> T k(Object[] objArr, er.a<? extends T> aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1564532345, i15, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        T t15 = (T) j(Arrays.copyOf(objArr, objArr.length), a0.f(), null, aVar, rVar, ((i15 << 6) & 7168) | MLKEMEngine.KyberPolyBytes, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return t15;
    }

    public static final <T> a3<T> l(Object[] objArr, x<T, ? extends Object> xVar, er.a<? extends a3<T>> aVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-746165481, i15, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:203)");
        }
        a3<T> a3Var = (a3) j(Arrays.copyOf(objArr, objArr.length), f(xVar), null, aVar, rVar, ((i15 << 3) & 7168) | MLKEMEngine.KyberPolyBytes, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return a3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(h hVar, x xVar, r rVar, String str, Object obj, Object[] objArr) {
        hVar.h(xVar, rVar, str, obj, objArr);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(r rVar, Object obj) {
        String strE;
        if (obj == null || rVar.b(obj)) {
            return;
        }
        if (obj instanceof c3.b0) {
            c3.b0 b0Var = (c3.b0) obj;
            if (b0Var.c() == x5.k() || b0Var.c() == x5.r() || b0Var.c() == x5.o()) {
                strE = "MutableState containing " + b0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strE = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strE = e(obj);
        }
        throw new IllegalArgumentException(strE);
    }
}
