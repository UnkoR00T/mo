package l9;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements s.a {
    @Override // l9.s.a
    public boolean a(t7.p pVar) {
        String str = pVar.f188381p;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // l9.s.a
    public s b(t7.p pVar) {
        String str = pVar.f188381p;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new n9.a(pVar.f188384s);
                case "application/pgs":
                    return new o9.a();
                case "application/x-mp4-vtt":
                    return new u9.a();
                case "text/vtt":
                    return new u9.g();
                case "application/x-quicktime-tx3g":
                    return new s9.a(pVar.f188384s);
                case "text/x-ssa":
                    return new p9.b(pVar.f188384s);
                case "application/vobsub":
                    return new t9.a(pVar.f188384s);
                case "application/x-subrip":
                    return new q9.a();
                case "application/ttml+xml":
                    return new r9.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // l9.s.a
    public int c(t7.p pVar) {
        String str = pVar.f188381p;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
