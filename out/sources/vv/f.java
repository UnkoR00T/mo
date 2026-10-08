package vv;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000bH&¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0010H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0010H&¢\u0006\u0004\b%\u0010$J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010-\u0082\u0001\u0002,/ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lvv/f;", "Lvv/j0;", "Ljava/nio/channels/WritableByteChannel;", "Lvv/h;", "byteString", "M0", "(Lvv/h;)Lvv/f;", "", "source", "write", "([B)Lvv/f;", "", "offset", "byteCount", "([BII)Lvv/f;", "Lvv/k0;", "", "U1", "(Lvv/k0;)J", "", "string", "k1", "(Ljava/lang/String;)Lvv/f;", "beginIndex", "endIndex", "v1", "(Ljava/lang/String;II)Lvv/f;", "b", "writeByte", "(I)Lvv/f;", "s", "writeShort", "i", "writeInt", "v", "k2", "(J)Lvv/f;", "r3", "Loq/i0;", "flush", "()V", "Ljava/io/OutputStream;", "b4", "()Ljava/io/OutputStream;", "Lvv/e;", "()Lvv/e;", "buffer", "Lvv/e0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends j0, WritableByteChannel {
    f M0(h byteString);

    long U1(k0 source);

    OutputStream b4();

    @Override // vv.j0, java.io.Flushable
    void flush();

    f k1(String string);

    f k2(long v15);

    f r3(long v15);

    e v();

    f v1(String string, int beginIndex, int endIndex);

    f write(byte[] source);

    f write(byte[] source, int offset, int byteCount);

    f writeByte(int b15);

    f writeInt(int i15);

    f writeShort(int s15);
}
