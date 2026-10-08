package qd;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166069a;

    c(String str) {
        this.f166069a = str;
    }

    public String e() {
        return ".temp" + this.f166069a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f166069a;
    }
}
