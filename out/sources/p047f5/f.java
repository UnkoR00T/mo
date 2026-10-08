package p047f5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\rR \u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR \u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0011\u0010\u0018R \u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u0006\u0010\rR \u0010!\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b\u001f\u0010\rR \u0010%\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u0012\u0004\b$\u0010\u000f\u001a\u0004\b#\u0010\u0018R \u0010,\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010\u000f\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lf5/f;", "Lf5/y;", "", "id", "<init>", "(Ljava/lang/Object;)V", "c", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Lf5/i$c;", "d", "Lf5/i$c;", "()Lf5/i$c;", "getStart$annotations", "()V", "start", "e", "getAbsoluteLeft", "getAbsoluteLeft$annotations", "absoluteLeft", "Lf5/i$b;", "f", "Lf5/i$b;", "()Lf5/i$b;", "getTop$annotations", "top", "g", "getEnd$annotations", "end", "h", "getAbsoluteRight", "getAbsoluteRight$annotations", "absoluteRight", "i", "b", "getBottom$annotations", "bottom", "Lf5/i$a;", "j", "Lf5/i$a;", "getBaseline", "()Lf5/i$a;", "getBaseline$annotations", "baseline", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i.VerticalAnchor start;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i.VerticalAnchor absoluteLeft;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i.HorizontalAnchor top;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i.VerticalAnchor end;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i.VerticalAnchor absoluteRight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final i.HorizontalAnchor bottom;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i.BaselineAnchor baseline;

    public f(Object obj) {
        super(obj);
        this.id = obj;
        this.start = new i.VerticalAnchor(getId(), -2, this);
        this.absoluteLeft = new i.VerticalAnchor(getId(), 0, this);
        this.top = new i.HorizontalAnchor(getId(), 0, this);
        this.end = new i.VerticalAnchor(getId(), -1, this);
        this.absoluteRight = new i.VerticalAnchor(getId(), 1, this);
        this.bottom = new i.HorizontalAnchor(getId(), 1, this);
        this.baseline = new i.BaselineAnchor(getId(), this);
    }

    @Override // p047f5.y
    /* JADX INFO: renamed from: a, reason: from getter */
    public Object getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i.VerticalAnchor getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i.VerticalAnchor getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i.HorizontalAnchor getTop() {
        return this.top;
    }
}
