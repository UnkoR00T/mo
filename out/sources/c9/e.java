package c9;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24591d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f24589b = str;
        this.f24590c = str2;
        this.f24591d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f24590c, eVar.f24590c) && Objects.equals(this.f24589b, eVar.f24589b) && Objects.equals(this.f24591d, eVar.f24591d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24589b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24590c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24591d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // c9.i
    public String toString() {
        return this.f24601a + ": language=" + this.f24589b + ", description=" + this.f24590c + ", text=" + this.f24591d;
    }
}
