package nw;

import fr.t;
import java.util.Collection;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: nw.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0005¢\u0006\u0004\b\u000b\u0010\fB1\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\u000eB#\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006\""}, d2 = {"Lnw/d;", "Lnw/f$b;", "Lnw/i$a;", "Lnw/i;", "iteratorPosition", "", "Lnw/f$a;", "parsedNodes", "", "Llr/i;", "rangesToProcessFurther", "<init>", "(Lnw/i$a;Ljava/util/Collection;Ljava/util/Collection;)V", "delegateRanges", "(Lnw/i$a;Ljava/util/Collection;Ljava/util/List;)V", "(Lnw/i$a;Ljava/util/Collection;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnw/i$a;", "c", "()Lnw/i$a;", "b", "Ljava/util/Collection;", "()Ljava/util/Collection;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class LocalParsingResult implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.a iteratorPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<f.Node> parsedNodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<List<lr.i>> rangesToProcessFurther;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalParsingResult(i.a aVar, Collection<f.Node> collection, Collection<? extends List<lr.i>> collection2) {
        this.iteratorPosition = aVar;
        this.parsedNodes = collection;
        this.rangesToProcessFurther = collection2;
    }

    @Override // nw.f.b
    public Collection<List<lr.i>> a() {
        return this.rangesToProcessFurther;
    }

    @Override // nw.f.b
    public Collection<f.Node> b() {
        return this.parsedNodes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i.a getIteratorPosition() {
        return this.iteratorPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalParsingResult)) {
            return false;
        }
        LocalParsingResult localParsingResult = (LocalParsingResult) other;
        return t.c(this.iteratorPosition, localParsingResult.iteratorPosition) && t.c(this.parsedNodes, localParsingResult.parsedNodes) && t.c(this.rangesToProcessFurther, localParsingResult.rangesToProcessFurther);
    }

    public int hashCode() {
        return (((this.iteratorPosition.hashCode() * 31) + this.parsedNodes.hashCode()) * 31) + this.rangesToProcessFurther.hashCode();
    }

    public String toString() {
        return "LocalParsingResult(iteratorPosition=" + this.iteratorPosition + ", parsedNodes=" + this.parsedNodes + ", rangesToProcessFurther=" + this.rangesToProcessFurther + ')';
    }

    public LocalParsingResult(i.a aVar, Collection<f.Node> collection, List<lr.i> list) {
        this(aVar, collection, (Collection<? extends List<lr.i>>) v.e(list));
    }

    public LocalParsingResult(i.a aVar, Collection<f.Node> collection) {
        this(aVar, collection, (Collection<? extends List<lr.i>>) v.n());
    }
}
