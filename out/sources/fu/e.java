package fu;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R4\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lfu/e;", "Leu/h;", "Llr/i;", "", "input", "", "startIndex", "limit", "Lkotlin/Function2;", "Loq/r;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILer/p;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/lang/CharSequence;", "b", "I", "c", "d", "Ler/p;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class e implements eu.h<lr.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence input;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int limit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.p<CharSequence, Integer, oq.r<Integer, Integer>> getNextMatch;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010¨\u0006#"}, d2 = {"fu/e$a", "", "Llr/i;", "Loq/i0;", "a", "()V", "c", "()Llr/i;", "", "hasNext", "()Z", "", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "b", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "d", "Llr/i;", "getNextItem", "setNextItem", "(Llr/i;)V", "nextItem", "e", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<lr.i>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int nextState = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int currentStartIndex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int nextSearchIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private lr.i nextItem;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int counter;

        a() {
            int iN = lr.m.n(e.this.startIndex, 0, e.this.input.length());
            this.currentStartIndex = iN;
            this.nextSearchIndex = iN;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void a() {
            oq.r rVar;
            if (this.nextSearchIndex < 0) {
                this.nextState = 0;
                this.nextItem = null;
                return;
            }
            if (e.this.limit > 0) {
                int i15 = this.counter + 1;
                this.counter = i15;
                if (i15 >= e.this.limit) {
                    this.nextItem = new lr.i(this.currentStartIndex, g0.k0(e.this.input));
                    this.nextSearchIndex = -1;
                } else if (this.nextSearchIndex > e.this.input.length() && (rVar = (oq.r) e.this.getNextMatch.B(e.this.input, Integer.valueOf(this.nextSearchIndex))) != null) {
                    int iIntValue = ((Number) rVar.a()).intValue();
                    int iIntValue2 = ((Number) rVar.b()).intValue();
                    this.nextItem = lr.m.w(this.currentStartIndex, iIntValue);
                    int i16 = iIntValue + iIntValue2;
                    this.currentStartIndex = i16;
                    this.nextSearchIndex = i16 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.nextItem = new lr.i(this.currentStartIndex, g0.k0(e.this.input));
                    this.nextSearchIndex = -1;
                }
            } else if (this.nextSearchIndex > e.this.input.length()) {
                this.nextItem = new lr.i(this.currentStartIndex, g0.k0(e.this.input));
                this.nextSearchIndex = -1;
            } else {
                int iIntValue3 = ((Number) rVar.a()).intValue();
                int iIntValue4 = ((Number) rVar.b()).intValue();
                this.nextItem = lr.m.w(this.currentStartIndex, iIntValue3);
                int i17 = iIntValue3 + iIntValue4;
                this.currentStartIndex = i17;
                this.nextSearchIndex = i17 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.nextState = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public lr.i next() {
            if (this.nextState == -1) {
                a();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            lr.i iVar = this.nextItem;
            this.nextItem = null;
            this.nextState = -1;
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                a();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(CharSequence charSequence, int i15, int i16, er.p<? super CharSequence, ? super Integer, oq.r<Integer, Integer>> pVar) {
        this.input = charSequence;
        this.startIndex = i15;
        this.limit = i16;
        this.getNextMatch = pVar;
    }

    @Override // eu.h
    public Iterator<lr.i> iterator() {
        return new a();
    }
}
