package p046f2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R&\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00028'@fX¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R&\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00028'@fX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\u00020\u00188&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0005\"\u0004\b\u001a\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lf2/jq;", "", "", "value", "h", "()I", "g", "(I)V", "minute", "j", "f", "hour", "k", "c", "hourInput", "a", "e", "minuteInput", "", "i", "()Z", "set24hour", "(Z)V", "is24hour", "Lf2/iq;", "d", "b", "selection", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface jq {
    default int a() {
        return h();
    }

    void b(int i15);

    default void c(int i15) {
        if (i15 < 0 || i15 >= 24) {
            return;
        }
        f(i15);
    }

    int d();

    default void e(int i15) {
        if (i15 < 0 || i15 >= 60) {
            return;
        }
        g(i15);
    }

    void f(int i15);

    void g(int i15);

    int h();

    boolean i();

    int j();

    default int k() {
        return j();
    }
}
