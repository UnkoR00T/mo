package uu;

import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;
import yu.b1;
import yu.c1;
import yu.o1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"", "T", "Lmr/c;", "Lkotlinx/serialization/KSerializer;", "a", "(Lmr/c;)Lkotlinx/serialization/KSerializer;", "b", "kotlinx-serialization-core"}, k = 5, mv = {2, 3, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
final /* synthetic */ class r {
    public static final <T> KSerializer<T> a(mr.c<T> cVar) {
        KSerializer<T> kSerializerD = p.d(cVar);
        if (kSerializerD != null) {
            return kSerializerD;
        }
        c1.e(cVar);
        throw new oq.g();
    }

    public static final <T> KSerializer<T> b(mr.c<T> cVar) {
        KSerializer<T> kSerializerB = b1.b(cVar);
        return kSerializerB == null ? o1.b(cVar) : kSerializerB;
    }
}
