package cj2;

import pl.gov.coi.mobywatel.feature.legacy.storage.ContainerManagerNew;
import pl.gov.coi.mobywatel.feature.legacy.storage.d;

/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @vl.c("id")
    private int f27458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @vl.c("ct")
    private int f27459b;

    public int a() {
        return this.f27458a;
    }

    public d b() {
        return d.values()[this.f27459b];
    }

    public void c() {
        ContainerManagerNew.u().F(this);
    }

    public void d(int i15) {
        this.f27458a = i15;
    }

    public void e(d dVar) {
        this.f27459b = dVar.ordinal();
    }
}
