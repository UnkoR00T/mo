package fe;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class c implements zd.d<ByteBuffer> {
    @Override // zd.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, File file, zd.h hVar) throws Throwable {
        try {
            ve.a.f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
