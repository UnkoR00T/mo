package uu;

import fr.q0;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "T", "Lyu/b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Luu/o;", "a", "(Lyu/b;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Luu/o;", "kotlinx-serialization-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class g {
    public static final <T> o<T> a(yu.b<T> bVar, Encoder encoder, T t15) {
        o<T> oVarB = bVar.b(encoder, t15);
        if (oVarB != null) {
            return oVarB;
        }
        yu.c.b(q0.c(t15.getClass()), bVar.c());
        throw new oq.g();
    }
}
