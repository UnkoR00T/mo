package vv;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020&2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010+\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H&¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002012\u0006\u00106\u001a\u00020\tH&¢\u0006\u0004\b7\u00103J\u0017\u0010:\u001a\u0002012\u0006\u00109\u001a\u000208H&¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u001fH&¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u001fH&¢\u0006\u0004\b@\u0010>J\u000f\u0010A\u001a\u00020\u0000H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH&¢\u0006\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0005\u0082\u0001\u0002\u0003Hø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0001"}, d2 = {"Lvv/g;", "Lvv/k0;", "Ljava/nio/channels/ReadableByteChannel;", "Lvv/e;", "y0", "()Lvv/e;", "", "K2", "()Z", "", "byteCount", "Loq/i0;", "g2", "(J)V", "request", "(J)Z", "", "readByte", "()B", "", "readShort", "()S", "W1", "", "readInt", "()I", "B3", "Y1", "()J", "d4", "skip", "Lvv/h;", "r2", "(J)Lvv/h;", "Lvv/z;", "options", "c1", "(Lvv/z;)I", "", "F2", "()[B", "R1", "(J)[B", "sink", "h2", "(Lvv/e;J)V", "Lvv/j0;", "A0", "(Lvv/j0;)J", "", "n2", "(J)Ljava/lang/String;", "N1", "()Ljava/lang/String;", "limit", "U0", "Ljava/nio/charset/Charset;", "charset", "n3", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "bytes", "P0", "(Lvv/h;)J", "targetBytes", "v0", "peek", "()Lvv/g;", "Ljava/io/InputStream;", "f4", "()Ljava/io/InputStream;", "v", "buffer", "Lvv/f0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends k0, ReadableByteChannel {
    long A0(j0 sink);

    int B3();

    byte[] F2();

    boolean K2();

    String N1();

    long P0(h bytes);

    byte[] R1(long byteCount);

    String U0(long limit);

    short W1();

    long Y1();

    int c1(z options);

    long d4();

    InputStream f4();

    void g2(long byteCount);

    void h2(e sink, long byteCount);

    String n2(long byteCount);

    String n3(Charset charset);

    g peek();

    h r2(long byteCount);

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long byteCount);

    void skip(long byteCount);

    e v();

    long v0(h targetBytes);

    @oq.a
    e y0();
}
