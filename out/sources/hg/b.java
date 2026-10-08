package hg;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final Status f84299a;

    public b(Status status) {
        int iP = status.p();
        String strR = status.r() != null ? status.r() : "";
        StringBuilder sb5 = new StringBuilder(String.valueOf(iP).length() + 2 + String.valueOf(strR).length());
        sb5.append(iP);
        sb5.append(": ");
        sb5.append(strR);
        super(sb5.toString());
        this.f84299a = status;
    }

    public Status a() {
        return this.f84299a;
    }

    public int b() {
        return this.f84299a.p();
    }
}
