package lg2;

import fr.t;
import oq.p;
import p071kotlin.Metadata;
import tq0.LandRegisterDocument;
import tq0.f;
import tq0.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ltq0/p;", "", "b", "(Ltq0/p;)I", "Ltq0/g;", "a", "(Ltq0/g;)I", "Ltq0/f;", "c", "(Ltq0/f;)I", "d", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118194a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.Transcript.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.FullTranscript.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.Extract.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.ClosingCertificate.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f118194a = iArr;
        }
    }

    public static final int a(g gVar) {
        int i15 = a.f118194a[gVar.ordinal()];
        if (i15 == 1) {
            return xf2.a.J0;
        }
        if (i15 == 2) {
            return xf2.a.G0;
        }
        if (i15 == 3) {
            return xf2.a.F0;
        }
        if (i15 == 4) {
            return xf2.a.E0;
        }
        throw new p();
    }

    public static final int b(LandRegisterDocument landRegisterDocument) {
        return a(landRegisterDocument.getType());
    }

    public static final int c(f fVar) {
        if (t.c(fVar, f.c.f191423a)) {
            return xf2.a.L0;
        }
        if (t.c(fVar, f.b.f191421a)) {
            return xf2.a.M0;
        }
        if (t.c(fVar, f.d.f191425a)) {
            return xf2.a.N0;
        }
        if (t.c(fVar, f.a.f191419a)) {
            return xf2.a.O0;
        }
        throw new p();
    }

    public static final int d(f fVar) {
        if (t.c(fVar, f.c.f191423a)) {
            return xf2.a.f218392q0;
        }
        if (t.c(fVar, f.b.f191421a)) {
            return xf2.a.f218395r0;
        }
        if (t.c(fVar, f.d.f191425a)) {
            return xf2.a.f218398s0;
        }
        if (t.c(fVar, f.a.f191419a)) {
            return xf2.a.f218401t0;
        }
        throw new p();
    }
}
