package c9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f24583g;

    public c(String str, int i15, int i16, long j15, long j16, i[] iVarArr) {
        super("CHAP");
        this.f24578b = str;
        this.f24579c = i15;
        this.f24580d = i16;
        this.f24581e = j15;
        this.f24582f = j16;
        this.f24583g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f24579c == cVar.f24579c && this.f24580d == cVar.f24580d && this.f24581e == cVar.f24581e && this.f24582f == cVar.f24582f && Objects.equals(this.f24578b, cVar.f24578b) && Arrays.equals(this.f24583g, cVar.f24583g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i15 = (((((((527 + this.f24579c) * 31) + this.f24580d) * 31) + ((int) this.f24581e)) * 31) + ((int) this.f24582f)) * 31;
        String str = this.f24578b;
        return i15 + (str != null ? str.hashCode() : 0);
    }
}
