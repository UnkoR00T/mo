package mr;

import java.util.Collection;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00012\u00020\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00018\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR(\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00000\u001a8&X§\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001dR\u001a\u0010'\u001a\u00020\u00068&X§\u0004¢\u0006\f\u0012\u0004\b&\u0010\u001f\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lmr/c;", "", "T", "Lmr/f;", "Lmr/e;", "value", "", "A", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", ip.a.f96138c, "()Ljava/lang/String;", "simpleName", "C", "qualifiedName", "", "Lmr/b;", "B", "()Ljava/util/Collection;", "members", "z", "()Ljava/lang/Object;", "objectInstance", "", "Lmr/q;", "getTypeParameters", "()Ljava/util/List;", "getTypeParameters$annotations", "()V", "typeParameters", "y", "getSealedSubclasses$annotations", "sealedSubclasses", "x", "()Z", "isValue$annotations", "isValue", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c<T> extends f, e {
    boolean A(Object value);

    Collection<b<?>> B();

    String C();

    String D();

    List<q> getTypeParameters();

    int hashCode();

    boolean x();

    List<c<? extends T>> y();

    T z();
}
