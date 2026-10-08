package yu;

import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0001H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyu/o;", "E", "", "C", "B", "Lyu/n;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "f", "(Ljava/util/Collection;)I", "", "e", "(Ljava/util/Collection;)Ljava/util/Iterator;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o<E, C extends Collection<? extends E>, B> extends n<E, C, B> {
    public o(KSerializer<E> kSerializer) {
        super(kSerializer, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Iterator<E> b(C c15) {
        return c15.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int c(C c15) {
        return c15.size();
    }
}
