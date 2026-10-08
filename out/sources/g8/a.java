package g8;

import c9.h;
import t7.p;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f71172a = new C1616a();

    /* JADX INFO: renamed from: g8.a$a, reason: collision with other inner class name */
    class C1616a implements a {
        C1616a() {
        }

        @Override // g8.a
        public boolean a(p pVar) {
            String str = pVar.f188381p;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // g8.a
        public x8.a b(p pVar) {
            String str = pVar.f188381p;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new y8.b();
                    case "application/x-icy":
                        return new b9.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new z8.b();
                    case "application/x-scte35":
                        return new e9.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(p pVar);

    x8.a b(p pVar);
}
