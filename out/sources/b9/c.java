package b9;

import java.util.Arrays;
import t7.u;
import t7.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17597c;

    public c(byte[] bArr, String str, String str2) {
        this.f17595a = bArr;
        this.f17596b = str;
        this.f17597c = str2;
    }

    @Override // t7.v.a
    public void c(u.b bVar) {
        String str = this.f17596b;
        if (str != null) {
            bVar.r0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f17595a, ((c) obj).f17595a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f17595a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f17596b, this.f17597c, Integer.valueOf(this.f17595a.length));
    }
}
