package yu;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00028\u0001H$¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lyu/a;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "", "c", "(Ljava/lang/Object;)I", "", "b", "(Ljava/lang/Object;)Ljava/util/Iterator;", "Lyu/n;", "Lyu/q0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ a(fr.k kVar) {
        this();
    }

    protected abstract Iterator<Element> b(Collection collection);

    protected abstract int c(Collection collection);

    private a() {
    }
}
