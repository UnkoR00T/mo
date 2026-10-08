package yu3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lyu3/q0;", "", "", "iconResId", "labelResId", "<init>", "(Ljava/lang/String;III)V", "a", "I", "g", "()I", "b", "j", "c", "d", "e", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum q0 {
    TAKE_PHOTO(jz.a.f106818m, ou3.a.f150174g),
    PICK_PHOTO(jz.a.f106760e0, ou3.a.f150171d),
    PICK_FILE(jz.a.f106760e0, ou3.a.f150169b);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f229878g = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int iconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int labelResId;

    q0(int i15, int i16) {
        this.iconResId = i15;
        this.labelResId = i16;
    }

    public static wq.a<q0> e() {
        return f229878g;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getLabelResId() {
        return this.labelResId;
    }
}
