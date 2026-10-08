package z8;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f233321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f233322b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f233321a = byteArrayOutputStream;
        this.f233322b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f233321a.reset();
        try {
            b(this.f233322b, aVar.f233315a);
            String str = aVar.f233316b;
            if (str == null) {
                str = "";
            }
            b(this.f233322b, str);
            this.f233322b.writeLong(aVar.f233317c);
            this.f233322b.writeLong(aVar.f233318d);
            this.f233322b.write(aVar.f233319e);
            this.f233322b.flush();
            return this.f233321a.toByteArray();
        } catch (IOException e15) {
            throw new RuntimeException(e15);
        }
    }
}
