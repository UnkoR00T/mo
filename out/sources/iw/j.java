package iw;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import oq.r;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001:\u0002\u0010\rB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0016\u001a\u00020\u0015H$¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019H$¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Liw/j;", "", "Lzv/b;", "nodeBuilder", "Liw/a;", "cancellationToken", "<init>", "(Lzv/b;Liw/a;)V", "(Lzv/b;)V", "", "Lnw/f$a;", "production", "Liw/j$b;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lzv/a;", "a", "(Ljava/util/List;)Lzv/a;", "event", "Liw/j$a;", "currentNodeChildren", "", "isTopmostNode", "c", "(Liw/j$b;Ljava/util/List;Z)Liw/j$a;", "", "Loq/i0;", "d", "(Liw/j$b;Ljava/util/List;)V", "Lzv/b;", "e", "()Lzv/b;", "Liw/a;", "getCancellationToken", "()Liw/a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zv.b nodeBuilder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iw.a cancellationToken;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Liw/j$a;", "", "Lzv/a;", "astNode", "", "startTokenIndex", "endTokenIndex", "<init>", "(Lzv/a;II)V", "a", "Lzv/a;", "()Lzv/a;", "b", "I", "c", "()I", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final zv.a astNode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int startTokenIndex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int endTokenIndex;

        public a(zv.a aVar, int i15, int i16) {
            this.astNode = aVar;
            this.startTokenIndex = i15;
            this.endTokenIndex = i16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final zv.a getAstNode() {
            return this.astNode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getEndTokenIndex() {
            return this.endTokenIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getStartTokenIndex() {
            return this.startTokenIndex;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Liw/j$b;", "", "", "position", "timeClosed", "Lnw/f$a;", "info", "<init>", "(IILnw/f$a;)V", "", "k", "()Z", "j", "other", "b", "(Liw/j$b;)I", "", "toString", "()Ljava/lang/String;", "a", "I", "g", "()I", "getTimeClosed", "c", "Lnw/f$a;", "e", "()Lnw/f$a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    protected static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int position;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int timeClosed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final nw.f.Node info;

        public b(int i15, int i16, nw.f.Node node) {
            this.position = i15;
            this.timeClosed = i16;
            this.info = node;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            int i15 = this.position;
            int i16 = other.position;
            if (i15 != i16) {
                return i15 - i16;
            }
            if (k() != other.k()) {
                return k() ? 1 : -1;
            }
            int first = (this.info.getRange().getFirst() + this.info.getRange().getLast()) - (other.info.getRange().getFirst() + other.info.getRange().getLast());
            if (first != 0) {
                return (j() || other.j()) ? first : -first;
            }
            int i17 = this.timeClosed - other.timeClosed;
            return k() ? -i17 : i17;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final nw.f.Node getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public final boolean j() {
            return this.info.getRange().getFirst() == this.info.getRange().getLast();
        }

        public final boolean k() {
            return this.info.getRange().getLast() != this.position;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(k() ? "Open" : "Close");
            sb5.append(": ");
            sb5.append(this.position);
            sb5.append(" (");
            sb5.append(this.info);
            sb5.append(')');
            return sb5.toString();
        }
    }

    public j(zv.b bVar, iw.a aVar) {
        this.nodeBuilder = bVar;
        this.cancellationToken = aVar;
    }

    private final List<b> b(List<nw.f.Node> production) {
        ArrayList arrayList = new ArrayList();
        int size = production.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.cancellationToken.a();
            nw.f.Node node = production.get(i15);
            int first = node.getRange().getFirst();
            int last = node.getRange().getLast();
            arrayList.add(new b(first, i15, node));
            if (last != first) {
                arrayList.add(new b(last, i15, node));
            }
        }
        v.B(arrayList);
        return arrayList;
    }

    public final zv.a a(List<nw.f.Node> production) {
        List<a> arrayList;
        List<b> listB = b(production);
        hw.e eVar = new hw.e();
        hw.a aVar = hw.a.f86718a;
        List<b> list = listB;
        if (list.isEmpty()) {
            throw new yv.d("nonsense");
        }
        if (!t.c(((b) v.l0(listB)).getInfo(), ((b) v.x0(listB)).getInfo())) {
            throw new yv.d("more than one root?\nfirst: " + ((b) v.l0(listB)).getInfo() + "\nlast: " + ((b) v.x0(listB)).getInfo());
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.cancellationToken.a();
            b bVar = listB.get(i15);
            d(bVar, eVar.isEmpty() ? null : (List) ((r) eVar.peek()).d());
            if (bVar.k()) {
                eVar.push(new r(bVar, new ArrayList()));
            } else {
                if (bVar.j()) {
                    arrayList = new ArrayList<>();
                } else {
                    r rVar = (r) eVar.pop();
                    hw.a aVar2 = hw.a.f86718a;
                    if (!t.c(((b) rVar.c()).getInfo(), bVar.getInfo())) {
                        throw new yv.d("Intersecting parsed nodes detected: " + ((b) rVar.c()).getInfo() + " vs " + bVar.getInfo());
                    }
                    arrayList = (List) rVar.d();
                }
                boolean zIsEmpty = eVar.isEmpty();
                a aVarC = c(bVar, arrayList, zIsEmpty);
                if (zIsEmpty) {
                    hw.a aVar3 = hw.a.f86718a;
                    if (i15 + 1 == listB.size()) {
                        return aVarC.getAstNode();
                    }
                    throw new yv.d("");
                }
                ((List) ((r) eVar.peek()).d()).add(aVarC);
            }
        }
        throw new AssertionError("markers stack should close some time thus would not be here!");
    }

    protected abstract a c(b event, List<a> currentNodeChildren, boolean isTopmostNode);

    protected abstract void d(b event, List<a> currentNodeChildren);

    /* JADX INFO: renamed from: e, reason: from getter */
    protected final zv.b getNodeBuilder() {
        return this.nodeBuilder;
    }

    public j(zv.b bVar) {
        this(bVar, iw.a.C2277a.f97207a);
    }
}
