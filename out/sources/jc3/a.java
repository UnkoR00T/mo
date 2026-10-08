package jc3;

import p071kotlin.Metadata;
import wq.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\r¨\u0006\u0011"}, d2 = {"Ljc3/a;", "", "", "titleResId", "descriptionResId", "iconResId", "<init>", "(Ljava/lang/String;IIII)V", "a", "I", "k", "()I", "b", "e", "c", "j", "d", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    YOUR_TRIPS(r93.a.H1, r93.a.G1, jz.a.f106753d1),
    COUNTRIES_INFO(r93.a.C1, r93.a.B1, jz.a.f106827n1);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f101615g = b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int titleResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int descriptionResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int iconResId;

    a(int i15, int i16, int i17) {
        this.titleResId = i15;
        this.descriptionResId = i16;
        this.iconResId = i17;
    }

    public static wq.a<a> g() {
        return f101615g;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }
}
