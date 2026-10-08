package fe2;

import mx.Label;
import mx.c;
import p071kotlin.Metadata;
import r50.g;
import zp0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzp0/p;", "Lmx/c;", "labelProvider", "", "withBorder", "Lr50/a$b;", "a", "(Lzp0/p;Lmx/c;Z)Lr50/a$b;", "incidentreport_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: fe2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1403a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61737a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.SENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f61737a = iArr;
        }
    }

    public static final r50.a.WithIcon a(p pVar, c cVar, boolean z15) {
        int i15 = C1403a.f61737a[pVar.ordinal()];
        if (i15 == 1) {
            return new r50.a.WithIcon(null, b(cVar, ud2.a.f197730d0), null, 0, z15, g.MINUS, 13, null);
        }
        if (i15 == 2) {
            return new r50.a.WithIcon(null, b(cVar, ud2.a.f197726b0), null, 0, z15, g.POSITIVE, 13, null);
        }
        if (i15 == 3) {
            return new r50.a.WithIcon(null, b(cVar, ud2.a.f197724a0), null, 0, z15, g.NOTICE, 13, null);
        }
        if (i15 == 4) {
            return new r50.a.WithIcon(null, b(cVar, ud2.a.f197728c0), null, 0, z15, g.INFORMATIVE, 13, null);
        }
        throw new oq.p();
    }

    private static final Label b(c cVar, int i15) {
        return cVar.c(i15);
    }
}
