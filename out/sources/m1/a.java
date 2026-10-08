package m1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lm1/a;", "Lm1/x;", "", "", "", "mask", "defaultValue", "<init>", "(IZ)V", "h", "I", "getMask", "()I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends x<Boolean> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    public /* synthetic */ a(int i15, boolean z15, int i16, fr.k kVar) {
        this(i15, (i16 & 2) != 0 ? false : z15);
    }

    public a(int i15, boolean z15) {
        super(Boolean.valueOf(z15));
        this.mask = i15;
    }
}
