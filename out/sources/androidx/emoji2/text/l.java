package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes3.dex */
class l {

    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f12316a;

        a(ByteBuffer byteBuffer) {
            this.f12316a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public void b(int i15) {
            ByteBuffer byteBuffer = this.f12316a;
            byteBuffer.position(byteBuffer.position() + i15);
        }

        @Override // androidx.emoji2.text.l.c
        public int c() {
            return this.f12316a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public long d() {
            return l.c(this.f12316a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f12316a.position();
        }

        @Override // androidx.emoji2.text.l.c
        public int readUnsignedShort() {
            return l.d(this.f12316a.getShort());
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f12317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f12318b;

        b(long j15, long j16) {
            this.f12317a = j15;
            this.f12318b = j16;
        }

        long a() {
            return this.f12317a;
        }
    }

    private interface c {
        void b(int i15);

        int c();

        long d();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) throws IOException {
        long jD;
        cVar.b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i15 = 0;
        while (true) {
            if (i15 >= unsignedShort) {
                jD = -1;
                break;
            }
            int iC = cVar.c();
            cVar.b(4);
            jD = cVar.d();
            cVar.b(4);
            if (1835365473 == iC) {
                break;
            }
            i15++;
        }
        if (jD != -1) {
            cVar.b((int) (jD - cVar.getPosition()));
            cVar.b(12);
            long jD2 = cVar.d();
            for (int i16 = 0; i16 < jD2; i16++) {
                int iC2 = cVar.c();
                long jD3 = cVar.d();
                long jD4 = cVar.d();
                if (1164798569 == iC2 || 1701669481 == iC2) {
                    return new b(jD3 + jD, jD4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static a7.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return a7.b.h(byteBufferDuplicate);
    }

    static long c(int i15) {
        return ((long) i15) & BodyPartID.bodyIdMax;
    }

    static int d(short s15) {
        return s15 & HPKE.aead_EXPORT_ONLY;
    }
}
