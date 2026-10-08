package me;

import android.util.Log;
import be.v;
import com.bumptech.glide.load.ImageHeaderParser;
import io.sentry.android.core.c2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class j implements zd.j<InputStream, c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f125946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.j<ByteBuffer, c> f125947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ce.b f125948c;

    public j(List<ImageHeaderParser> list, zd.j<ByteBuffer, c> jVar, ce.b bVar) {
        this.f125946a = list;
        this.f125947b = jVar;
        this.f125948c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i15 = inputStream.read(bArr);
                if (i15 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i15);
            }
        } catch (IOException e15) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            c2.h("StreamGifDecoder", "Error reading data from stream", e15);
            return null;
        }
    }

    @Override // zd.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<c> b(InputStream inputStream, int i15, int i16, zd.h hVar) {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f125947b.b(ByteBuffer.wrap(bArrE), i15, i16, hVar);
    }

    @Override // zd.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, zd.h hVar) {
        return !((Boolean) hVar.c(i.f125945b)).booleanValue() && com.bumptech.glide.load.a.f(this.f125946a, inputStream, this.f125948c) == ImageHeaderParser.ImageType.GIF;
    }
}
