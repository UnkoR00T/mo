package pl.gov.coi.common.network;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "oid", "Lry/n;", "a", "(Ljava/lang/String;)Lry/n;", "network_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ry.n a(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -551630290:
                if (str.equals("1.2.840.113549.1.1.11")) {
                    return ry.n.b.a.f176853d;
                }
                return null;
            case -551630289:
                if (str.equals("1.2.840.113549.1.1.12")) {
                    return ry.n.b.C4515b.f176854d;
                }
                return null;
            case -551630288:
                if (str.equals("1.2.840.113549.1.1.13")) {
                    return ry.n.b.c.f176855d;
                }
                return null;
            default:
                switch (iHashCode) {
                    case 368620366:
                        if (str.equals("1.2.840.10045.4.3.2")) {
                            return ry.n.a.C4514a.f176847d;
                        }
                        return null;
                    case 368620367:
                        if (str.equals("1.2.840.10045.4.3.3")) {
                            return ry.n.a.b.f176848d;
                        }
                        return null;
                    case 368620368:
                        if (str.equals("1.2.840.10045.4.3.4")) {
                            return ry.n.a.c.f176849d;
                        }
                        return null;
                    default:
                        return null;
                }
        }
    }
}
