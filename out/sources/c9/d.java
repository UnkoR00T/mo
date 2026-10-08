package c9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f24587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f24588f;

    public d(String str, boolean z15, boolean z16, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f24584b = str;
        this.f24585c = z15;
        this.f24586d = z16;
        this.f24587e = strArr;
        this.f24588f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f24585c == dVar.f24585c && this.f24586d == dVar.f24586d && Objects.equals(this.f24584b, dVar.f24584b) && Arrays.equals(this.f24587e, dVar.f24587e) && Arrays.equals(this.f24588f, dVar.f24588f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i15 = (((527 + (this.f24585c ? 1 : 0)) * 31) + (this.f24586d ? 1 : 0)) * 31;
        String str = this.f24584b;
        return i15 + (str != null ? str.hashCode() : 0);
    }
}
