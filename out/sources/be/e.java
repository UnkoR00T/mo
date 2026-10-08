package be;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class e<DataType> implements de.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.d<DataType> f18651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataType f18652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.h f18653c;

    e(zd.d<DataType> dVar, DataType datatype, zd.h hVar) {
        this.f18651a = dVar;
        this.f18652b = datatype;
        this.f18653c = hVar;
    }

    @Override // de.a.b
    public boolean a(File file) {
        return this.f18651a.a(this.f18652b, file, this.f18653c);
    }
}
