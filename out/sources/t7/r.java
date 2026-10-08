package t7;

import java.util.Objects;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f188421c = o0.u0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f188422d = o0.u0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188424b;

    public r(String str, String str2) {
        this.f188423a = o0.M0(str);
        this.f188424b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r rVar = (r) obj;
            if (Objects.equals(this.f188423a, rVar.f188423a) && Objects.equals(this.f188424b, rVar.f188424b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f188424b.hashCode() * 31;
        String str = this.f188423a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
