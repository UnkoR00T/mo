package z1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: z1.u1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0018B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0014\u0010*\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010)R\u0014\u0010-\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0014\u00100\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010,R\u0014\u00101\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010,¨\u00062"}, d2 = {"Lz1/u1;", "Lz1/e1;", "", "isStartHandle", "", "startSlot", "endSlot", "Lz1/j0;", "previousSelection", "Lz1/h0;", "info", "<init>", "(ZIILz1/j0;Lz1/h0;)V", "Lkotlin/Function1;", "Loq/i0;", "block", "f", "(Ler/l;)V", "other", "g", "(Lz1/e1;)Z", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "I", "k", "()I", "c", "d", "Lz1/j0;", "h", "()Lz1/j0;", "e", "Lz1/h0;", "getSize", "size", "Lz1/p;", "()Lz1/p;", "crossStatus", "j", "()Lz1/h0;", "startInfo", "i", "endInfo", "currentInfo", "firstInfo", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SingleSelectionLayout implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isStartHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startSlot;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endSlot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Selection previousSelection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final h0 info;

    public SingleSelectionLayout(boolean z15, int i15, int i16, Selection selection, h0 h0Var) {
        this.isStartHandle = z15;
        this.startSlot = i15;
        this.endSlot = i16;
        this.previousSelection = selection;
        this.info = h0Var;
    }

    @Override // z1.e1
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // z1.e1
    /* JADX INFO: renamed from: b, reason: from getter */
    public h0 getInfo() {
        return this.info;
    }

    @Override // z1.e1
    public h0 c() {
        return this.info;
    }

    @Override // z1.e1
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // z1.e1
    public p e() {
        if (getStartSlot() < getEndSlot()) {
            return p.NOT_CROSSED;
        }
        return getStartSlot() > getEndSlot() ? p.CROSSED : this.info.d();
    }

    @Override // z1.e1
    public void f(er.l<? super h0, oq.i0> block) {
    }

    @Override // z1.e1
    public boolean g(e1 other) {
        if (getPreviousSelection() == null || other == null || !(other instanceof SingleSelectionLayout)) {
            return true;
        }
        SingleSelectionLayout singleSelectionLayout = (SingleSelectionLayout) other;
        return (getStartSlot() == singleSelectionLayout.getStartSlot() && getEndSlot() == singleSelectionLayout.getEndSlot() && getIsStartHandle() == singleSelectionLayout.getIsStartHandle() && !this.info.m(singleSelectionLayout.info)) ? false : true;
    }

    @Override // z1.e1
    public int getSize() {
        return 1;
    }

    @Override // z1.e1
    /* JADX INFO: renamed from: h, reason: from getter */
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // z1.e1
    public h0 i() {
        return this.info;
    }

    @Override // z1.e1
    public h0 j() {
        return this.info;
    }

    @Override // z1.e1
    /* JADX INFO: renamed from: k, reason: from getter */
    public int getStartSlot() {
        return this.startSlot;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + getIsStartHandle() + ", crossed=" + e() + ", info=\n\t" + this.info + ')';
    }
}
