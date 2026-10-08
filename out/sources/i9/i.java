package i9;

import o8.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f90432b = new i(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f90433c = new i(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90434a;

    private i(boolean z15) {
        this.f90434a = z15;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("IncorrectFragmentation{expected=");
        sb5.append(!this.f90434a);
        sb5.append("}");
        return sb5.toString();
    }
}
