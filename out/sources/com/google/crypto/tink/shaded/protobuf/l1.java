package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class l1 {

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f36148a;

        a(h hVar) {
            this.f36148a = hVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l1.b
        public byte a(int i15) {
            return this.f36148a.f(i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.l1.b
        public int size() {
            return this.f36148a.size();
        }
    }

    private interface b {
        byte a(int i15);

        int size();
    }

    static String a(h hVar) {
        return b(new a(hVar));
    }

    static String b(b bVar) {
        StringBuilder sb5 = new StringBuilder(bVar.size());
        for (int i15 = 0; i15 < bVar.size(); i15++) {
            byte bA = bVar.a(i15);
            if (bA == 34) {
                sb5.append("\\\"");
            } else if (bA == 39) {
                sb5.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb5.append("\\a");
                        break;
                    case 8:
                        sb5.append("\\b");
                        break;
                    case 9:
                        sb5.append("\\t");
                        break;
                    case 10:
                        sb5.append("\\n");
                        break;
                    case 11:
                        sb5.append("\\v");
                        break;
                    case 12:
                        sb5.append("\\f");
                        break;
                    case 13:
                        sb5.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb5.append('\\');
                            sb5.append((char) (((bA >>> 6) & 3) + 48));
                            sb5.append((char) (((bA >>> 3) & 7) + 48));
                            sb5.append((char) ((bA & 7) + 48));
                        } else {
                            sb5.append((char) bA);
                        }
                        break;
                }
            } else {
                sb5.append("\\\\");
            }
        }
        return sb5.toString();
    }

    static String c(String str) {
        return a(h.k(str));
    }
}
