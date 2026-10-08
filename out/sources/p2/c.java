package p2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"Lp2/c;", "Lm2/b;", "", "loc", "<init>", "(I)V", "Lp2/l;", "slots", "d", "(Lp2/l;)I", "Lp2/o;", "writer", "e", "(Lp2/o;)I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "()I", "c", "location", "", "()Z", "valid", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements p076m2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int location;

    public c(int i15) {
        this.location = i15;
    }

    @Override // p076m2.b
    public boolean a() {
        return this.location != Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final void c(int i15) {
        this.location = i15;
    }

    public final int d(l slots) {
        return slots.v(this);
    }

    public final int e(SlotWriter writer) {
        return writer.C(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.location + " }";
    }
}
