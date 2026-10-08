package bv;

import fr.k;
import java.util.List;
import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;
import uu.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\u0006\u0010\r\u001a\u00028\u0000H'¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Lbv/c;", "", "<init>", "()V", "T", "Lmr/c;", "kClass", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "(Lmr/c;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "baseClass", "value", "Luu/o;", "b", "(Lmr/c;Ljava/lang/Object;)Luu/o;", "Lbv/b;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {
    public /* synthetic */ c(k kVar) {
        this();
    }

    public abstract <T> KSerializer<T> a(mr.c<T> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers);

    public abstract <T> o<T> b(mr.c<? super T> baseClass, T value);

    private c() {
    }
}
