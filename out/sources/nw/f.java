package nw;

import fr.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\b\n\u000bJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lnw/f;", "", "Lnw/i;", "tokens", "", "Llr/i;", "rangesToGlue", "Lnw/f$b;", "a", "(Lnw/i;Ljava/util/List;)Lnw/f$b;", "b", "c", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: nw.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnw/f$a;", "", "Llr/i;", "range", "Lyv/a;", "type", "<init>", "(Llr/i;Lyv/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llr/i;", "()Llr/i;", "b", "Lyv/a;", "()Lyv/a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Node {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final lr.i range;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final yv.a type;

        public Node(lr.i iVar, yv.a aVar) {
            this.range = iVar;
            this.type = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final lr.i getRange() {
            return this.range;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final yv.a getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Node)) {
                return false;
            }
            Node node = (Node) other;
            return t.c(this.range, node.range) && t.c(this.type, node.type);
        }

        public int hashCode() {
            return (this.range.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Node(range=" + this.range + ", type=" + this.type + ')';
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\u000b"}, d2 = {"Lnw/f$b;", "", "", "Lnw/f$a;", "b", "()Ljava/util/Collection;", "parsedNodes", "", "Llr/i;", "a", "rangesToProcessFurther", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public interface b {
        Collection<List<lr.i>> a();

        Collection<Node> b();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001a"}, d2 = {"Lnw/f$c;", "Lnw/f$b;", "<init>", "()V", "Lnw/f$a;", "result", "d", "(Lnw/f$a;)Lnw/f$c;", "", "Llr/i;", "ranges", "c", "(Ljava/util/List;)Lnw/f$c;", "parsingResult", "e", "(Lnw/f$b;)Lnw/f$c;", "", "a", "Ljava/util/Collection;", "_parsedNodes", "b", "_rangesToProcessFurther", "", "()Ljava/util/Collection;", "parsedNodes", "rangesToProcessFurther", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Collection<Node> _parsedNodes = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Collection<List<lr.i>> _rangesToProcessFurther = new ArrayList();

        @Override // nw.f.b
        public Collection<List<lr.i>> a() {
            return this._rangesToProcessFurther;
        }

        @Override // nw.f.b
        public Collection<Node> b() {
            return this._parsedNodes;
        }

        public final c c(List<lr.i> ranges) {
            this._rangesToProcessFurther.add(ranges);
            return this;
        }

        public final c d(Node result) {
            this._parsedNodes.add(result);
            return this;
        }

        public final c e(b parsingResult) {
            this._parsedNodes.addAll(parsingResult.b());
            this._rangesToProcessFurther.addAll(parsingResult.a());
            return this;
        }
    }

    b a(i tokens, List<lr.i> rangesToGlue);
}
