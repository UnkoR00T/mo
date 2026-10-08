package de;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class d implements de.a.InterfaceC0916a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f41097b;

    public interface a {
        File a();
    }

    public d(a aVar, long j15) {
        this.f41096a = j15;
        this.f41097b = aVar;
    }

    @Override // de.a.InterfaceC0916a
    public de.a build() {
        File fileA = this.f41097b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f41096a);
        }
        return null;
    }
}
