package c8;

import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
    }
}
