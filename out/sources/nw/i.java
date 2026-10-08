package nw;

import hw.TokenInfo;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\r\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\n\u0010\u0003R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lnw/i;", "", "<init>", "()V", "", "index", "", "e", "(I)C", "Loq/i0;", "f", "", "Lhw/f;", "a", "()Ljava/util/List;", "cachedTokens", "b", "filteredTokens", "", "c", "()Ljava/lang/CharSequence;", "originalText", "Llr/i;", "d", "()Llr/i;", "originalTextRange", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0096\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00060\u0000R\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001bR\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u001bR\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Lnw/i$a;", "", "", "index", "<init>", "(Lnw/i;I)V", "rawSteps", "Lhw/f;", "i", "(I)Lhw/f;", "Lnw/i;", "a", "()Lnw/i$a;", "steps", "Lyv/a;", "j", "(I)Lyv/a;", "k", "(I)I", "", "b", "(I)C", "", "toString", "()Ljava/lang/String;", "I", "e", "()I", "h", "()Lyv/a;", "type", "d", "()C", "firstChar", "f", "length", "g", "start", "c", "end", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        public a(int i15) {
            this.index = i15;
        }

        private final TokenInfo i(int rawSteps) {
            int i15 = this.index;
            if (i15 < 0) {
                return new TokenInfo(null, i.this.d().getFirst(), i.this.d().getFirst(), 0, 0);
            }
            if (i15 > i.this.b().size()) {
                return new TokenInfo(null, i.this.d().getLast() + 1, i.this.d().getLast() + 1, 0, 0);
            }
            int rawIndex = (this.index < i.this.b().size() ? i.this.b().get(this.index).getRawIndex() : i.this.a().size()) + rawSteps;
            if (rawIndex < 0) {
                return new TokenInfo(null, i.this.d().getFirst(), i.this.d().getFirst(), 0, 0);
            }
            return rawIndex >= i.this.a().size() ? new TokenInfo(null, i.this.d().getLast() + 1, i.this.d().getLast() + 1, 0, 0) : i.this.a().get(rawIndex);
        }

        public a a() {
            return i.this.new a(this.index + 1);
        }

        public char b(int steps) {
            if (steps == 0) {
                return i.this.e(g());
            }
            if (steps == -1) {
                return i.this.e(g() - 1);
            }
            if (steps != 1) {
                return i.this.e(steps > 0 ? k(steps) : k(steps + 1) - 1);
            }
            return i.this.e(c());
        }

        public final int c() {
            return i(0).getTokenEnd();
        }

        public final char d() {
            return i.this.e(i(0).getTokenStart());
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final int f() {
            return i(0).getTokenEnd() - i(0).getTokenStart();
        }

        public final int g() {
            return i(0).getTokenStart();
        }

        public final yv.a h() {
            return i(0).getType();
        }

        public yv.a j(int steps) {
            return i(steps).getType();
        }

        public final int k(int steps) {
            return i(steps).getTokenStart();
        }

        public String toString() {
            return "Iterator: " + this.index + ": " + h();
        }
    }

    public abstract List<TokenInfo> a();

    public abstract List<TokenInfo> b();

    public abstract CharSequence c();

    public abstract lr.i d();

    public final char e(int index) {
        if (index >= d().getFirst() && index <= d().getLast()) {
            return c().charAt(index);
        }
        return (char) 0;
    }

    protected final void f() {
        int size = a().size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                int size2 = b().size();
                int i16 = 0;
                while (i16 < size2) {
                    hw.a aVar = hw.a.f86718a;
                    if (!(b().get(i16).getNormIndex() == i16)) {
                        throw new yv.d("");
                    }
                    i16++;
                }
                return;
            }
            hw.a aVar2 = hw.a.f86718a;
            if (!(a().get(i15).getRawIndex() == i15)) {
                throw new yv.d("");
            }
            i15++;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B'\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\u000bJ\u0013\u0010\f\u001a\u00060\u0000R\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnw/i$b;", "Lnw/i$a;", "Lnw/i;", "", "Llr/i;", "ranges", "", "listIndex", "value", "<init>", "(Lnw/i;Ljava/util/List;II)V", "(Lnw/i;Ljava/util/List;)V", "l", "()Lnw/i$b;", "steps", "Lyv/a;", "j", "(I)Lyv/a;", "c", "Ljava/util/List;", "d", "I", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<lr.i> ranges;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int listIndex;

        private b(List<lr.i> list, int i15, int i16) {
            super(i16);
            this.ranges = list;
            this.listIndex = i15;
        }

        @Override // nw.i.a
        public yv.a j(int steps) {
            lr.i iVar = (lr.i) v.o0(this.ranges, this.listIndex);
            if (iVar == null) {
                return null;
            }
            int first = iVar.getFirst();
            int last = iVar.getLast();
            int index = getIndex() + steps;
            if (first > index || index > last) {
                return null;
            }
            return super.j(steps);
        }

        @Override // nw.i.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b a() {
            if (this.listIndex >= this.ranges.size()) {
                return this;
            }
            if (getIndex() != this.ranges.get(this.listIndex).getLast()) {
                return i.this.new b(this.ranges, this.listIndex, getIndex() + 1);
            }
            i iVar = i.this;
            List<lr.i> list = this.ranges;
            int i15 = this.listIndex;
            int i16 = i15 + 1;
            lr.i iVar2 = (lr.i) v.o0(list, i15 + 1);
            return iVar.new b(list, i16, iVar2 != null ? iVar2.t().intValue() : i.this.b().size());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(i iVar, List<lr.i> list) {
            lr.i iVar2 = (lr.i) v.n0(list);
            this(list, 0, iVar2 != null ? iVar2.t().intValue() : -1);
        }
    }
}
