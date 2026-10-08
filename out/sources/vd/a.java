package vd;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class a extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f206141c;

    public a(k kVar) {
        super(kVar);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f206141c != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
