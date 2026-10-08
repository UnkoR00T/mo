package p056h1;

import fr.k;
import lr.i;
import lr.m;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.f6;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\r¨\u0006\u001a"}, d2 = {"Lh1/f1;", "Lm2/f6;", "Llr/i;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "Loq/i0;", "t", "(I)V", "a", "I", "b", "<set-?>", "c", "Lm2/a3;", "k", "()Llr/i;", "l", "(Llr/i;)V", "value", "d", "lastFirstVisibleItem", "e", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 implements f6<i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f79393e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int slidingWindowSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int extraItemCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastFirstVisibleItem;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh1/f1$a;", "", "<init>", "()V", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "Llr/i;", "b", "(III)Llr/i;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i b(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            int i15 = (firstVisibleItem / slidingWindowSize) * slidingWindowSize;
            return m.w(Math.max(i15 - extraItemCount, 0), i15 + slidingWindowSize + extraItemCount);
        }

        private a() {
        }
    }

    public f1(int i15, int i16, int i17) {
        this.slidingWindowSize = i16;
        this.extraItemCount = i17;
        this.value = x5.i(f79393e.b(i15, i16, i17), x5.r());
        this.lastFirstVisibleItem = i15;
    }

    private void l(i iVar) {
        this.value.setValue(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p076m2.f6
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public i getValue() {
        return (i) this.value.getValue();
    }

    public final void t(int firstVisibleItem) {
        if (firstVisibleItem != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = firstVisibleItem;
            l(f79393e.b(firstVisibleItem, this.slidingWindowSize, this.extraItemCount));
        }
    }
}
