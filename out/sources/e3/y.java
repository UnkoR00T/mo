package e3;

import p071kotlin.Metadata;
import p2.SlotReader;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Le3/y;", "Le3/b;", "Lp2/j;", "reader", "<init>", "(Lp2/j;)V", "Lm2/b;", "anchor", "Lo2/d;", "h", "(Lm2/b;)Lo2/d;", "", "d", "(Lm2/b;)I", "b", "Lp2/j;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SlotReader reader;

    public y(SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // e3.b
    public int d(p076m2.b anchor) {
        SlotReader slotReader = this.reader;
        return slotReader.D(slotReader.getTable().v(p2.d.a(anchor)));
    }

    @Override // e3.b
    public o2.d h(p076m2.b anchor) {
        return this.reader.getTable().Z(this.reader.getTable().v(p2.d.a(anchor)));
    }
}
