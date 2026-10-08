package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "v1", "Lu0/p;", "a", "(F)Lu0/p;", "v2", "Lu0/q;", "b", "(FF)Lu0/q;", "v3", "Lu0/r;", "c", "(FFF)Lu0/r;", "v4", "Lu0/s;", "d", "(FFFF)Lu0/s;", "Lu0/t;", "T", "g", "(Lu0/t;)Lu0/t;", "e", "source", "Loq/i0;", "f", "(Lu0/t;Lu0/t;)V", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    public static final p a(float f15) {
        return new p(f15);
    }

    public static final q b(float f15, float f16) {
        return new q(f15, f16);
    }

    public static final r c(float f15, float f16, float f17) {
        return new r(f15, f16, f17);
    }

    public static final s d(float f15, float f16, float f17, float f18) {
        return new s(f15, f16, f17, f18);
    }

    public static final <T extends t> T e(T t15) {
        T t16 = (T) g(t15);
        int size = t16.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            t16.e(i15, t15.a(i15));
        }
        return t16;
    }

    public static final <T extends t> void f(T t15, T t16) {
        int size = t15.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            t15.e(i15, t16.a(i15));
        }
    }

    public static final <T extends t> T g(T t15) {
        return (T) t15.c();
    }
}
