package b9;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import t7.u;
import t7.v;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17594f;

    public b(int i15, String str, String str2, String str3, boolean z15, int i16) {
        p.d(i16 == -1 || i16 > 0);
        this.f17589a = i15;
        this.f17590b = str;
        this.f17591c = str2;
        this.f17592d = str3;
        this.f17593e = z15;
        this.f17594f = i16;
    }

    public static b d(Map<String, List<String>> map) {
        boolean z15;
        int i15;
        String str;
        String str2;
        boolean zEquals;
        int i16;
        List<String> list = map.get("icy-br");
        boolean z16 = true;
        int i17 = -1;
        if (list != null) {
            String str3 = list.get(0);
            try {
                i16 = Integer.parseInt(str3) * 1000;
                if (i16 > 0) {
                    z15 = true;
                } else {
                    try {
                        t.h("IcyHeaders", "Invalid bitrate: " + str3);
                        z15 = false;
                        i16 = -1;
                    } catch (NumberFormatException unused) {
                        t.h("IcyHeaders", "Invalid bitrate header: " + str3);
                        z15 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i16 = -1;
            }
            i15 = i16;
        } else {
            z15 = false;
            i15 = -1;
        }
        List<String> list2 = map.get("icy-genre");
        String str4 = null;
        if (list2 != null) {
            str4 = list2.get(0);
            z15 = true;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str = list3.get(0);
            z15 = true;
        } else {
            str = str4;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str2 = list4.get(0);
            z15 = true;
        } else {
            str2 = str4;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z15 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i18 = Integer.parseInt(str5);
                if (i18 > 0) {
                    i17 = i18;
                } else {
                    try {
                        t.h("IcyHeaders", "Invalid metadata interval: " + str5);
                        z16 = z15;
                    } catch (NumberFormatException unused3) {
                        i17 = i18;
                        t.h("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z15 = z16;
            } catch (NumberFormatException unused4) {
            }
        }
        return z15 ? new b(i15, str4, str, str2, zEquals, i17) : null;
    }

    @Override // t7.v.a
    public void c(u.b bVar) {
        String str = this.f17591c;
        if (str != null) {
            bVar.o0(str);
        }
        String str2 = this.f17590b;
        if (str2 != null) {
            bVar.e0(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f17589a == bVar.f17589a && Objects.equals(this.f17590b, bVar.f17590b) && Objects.equals(this.f17591c, bVar.f17591c) && Objects.equals(this.f17592d, bVar.f17592d) && this.f17593e == bVar.f17593e && this.f17594f == bVar.f17594f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i15 = (527 + this.f17589a) * 31;
        String str = this.f17590b;
        int iHashCode = (i15 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17591c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17592d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f17593e ? 1 : 0)) * 31) + this.f17594f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f17591c + "\", genre=\"" + this.f17590b + "\", bitrate=" + this.f17589a + ", metadataInterval=" + this.f17594f;
    }
}
