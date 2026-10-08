package vv;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002«\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020\u000fH\u0087\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b/\u0010\"J\u000f\u00100\u001a\u00020)H\u0016¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u0010\"J\u000f\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u0010\"J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020,2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020C2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020C2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020C2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020CH\u0016¢\u0006\u0004\bN\u0010EJ\u0017\u0010P\u001a\u00020C2\u0006\u0010O\u001a\u00020\u000fH\u0016¢\u0006\u0004\bP\u0010GJ\u000f\u0010Q\u001a\u00020,H\u0016¢\u0006\u0004\bQ\u0010.J\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020R2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00112\u0006\u0010=\u001a\u00020RH\u0016¢\u0006\u0004\bW\u0010XJ'\u0010Y\u001a\u00020,2\u0006\u0010=\u001a\u00020R2\u0006\u0010\u001c\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020,H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010Y\u001a\u00020,2\u0006\u0010=\u001a\u00020[H\u0016¢\u0006\u0004\bY\u0010\\J\r\u0010]\u001a\u00020\u0011¢\u0006\u0004\b]\u0010\u0006J\u0017\u0010^\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b^\u0010\u0013J\u0017\u0010`\u001a\u00020\u00002\u0006\u0010_\u001a\u000204H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u00002\u0006\u0010b\u001a\u00020CH\u0016¢\u0006\u0004\bc\u0010dJ'\u0010g\u001a\u00020\u00002\u0006\u0010b\u001a\u00020C2\u0006\u0010e\u001a\u00020,2\u0006\u0010f\u001a\u00020,H\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020,H\u0016¢\u0006\u0004\bj\u0010kJ/\u0010l\u001a\u00020\u00002\u0006\u0010b\u001a\u00020C2\u0006\u0010e\u001a\u00020,2\u0006\u0010f\u001a\u00020,2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00002\u0006\u0010n\u001a\u00020RH\u0016¢\u0006\u0004\bo\u0010pJ'\u0010q\u001a\u00020\u00002\u0006\u0010n\u001a\u00020R2\u0006\u0010\u001c\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020,H\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020,2\u0006\u0010n\u001a\u00020[H\u0016¢\u0006\u0004\bs\u0010\\J\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020tH\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010w\u001a\u00020\u00002\u0006\u0010]\u001a\u00020,H\u0016¢\u0006\u0004\bw\u0010kJ\u0017\u0010y\u001a\u00020\u00002\u0006\u0010x\u001a\u00020,H\u0016¢\u0006\u0004\by\u0010kJ\u0017\u0010{\u001a\u00020\u00002\u0006\u0010z\u001a\u00020,H\u0016¢\u0006\u0004\b{\u0010kJ\u0017\u0010}\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\u000fH\u0016¢\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010|\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u007f\u0010~J\u001c\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0080\u0001\u001a\u00020,H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J!\u0010\u0084\u0001\u001a\u00020\u00112\u0006\u0010n\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0084\u0001\u0010?J\"\u0010\u0085\u0001\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J,\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010]\u001a\u00020#2\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\u0007\u0010\u0088\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001b\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u000204H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J$\u0010\u008e\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u0002042\u0007\u0010\u0087\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J-\u0010\u0090\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u0002042\u0007\u0010\u0087\u0001\u001a\u00020\u000f2\u0007\u0010\u0088\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u000f2\u0007\u0010\u0092\u0001\u001a\u000204H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u008d\u0001J$\u0010\u0094\u0001\u001a\u00020\u000f2\u0007\u0010\u0092\u0001\u001a\u0002042\u0007\u0010\u0087\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u008f\u0001J#\u0010\u0095\u0001\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u000204H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J4\u0010\u0098\u0001\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u0002042\u0007\u0010\u0097\u0001\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020,H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u009a\u0001\u0010\u0006J\u0011\u0010\u009b\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u009b\u0001\u0010\u000eJ\u0011\u0010\u009c\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u009c\u0001\u0010\u0006J\u0013\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001f\u0010¢\u0001\u001a\u00020\f2\n\u0010¡\u0001\u001a\u0005\u0018\u00010 \u0001H\u0096\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020,H\u0016¢\u0006\u0005\b¤\u0001\u0010.J\u0011\u0010¥\u0001\u001a\u00020CH\u0016¢\u0006\u0005\b¥\u0001\u0010EJ\u000f\u0010¦\u0001\u001a\u00020\u0000¢\u0006\u0005\b¦\u0001\u0010\bJ\u0011\u0010§\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\b§\u0001\u0010\bJ\u000f\u0010¨\u0001\u001a\u000204¢\u0006\u0005\b¨\u0001\u00106J\u0018\u0010©\u0001\u001a\u0002042\u0006\u0010\u0010\u001a\u00020,¢\u0006\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R/\u0010¯\u0001\u001a\u00020\u000f2\u0007\u0010®\u0001\u001a\u00020\u000f8\u0007@@X\u0086\u000e¢\u0006\u0015\n\u0005\b]\u0010\u0089\u0001\u001a\u0005\b¯\u0001\u0010\"\"\u0005\b°\u0001\u0010\u0013R\u0015\u0010±\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010\b¨\u0006²\u0001"}, d2 = {"Lvv/e;", "Lvv/g;", "Lvv/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "y0", "()Lvv/e;", "Ljava/io/OutputStream;", "b4", "()Ljava/io/OutputStream;", "", "K2", "()Z", "", "byteCount", "Loq/i0;", "g2", "(J)V", "request", "(J)Z", "peek", "()Lvv/g;", "Ljava/io/InputStream;", "f4", "()Ljava/io/InputStream;", "out", "offset", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lvv/e;JJ)Lvv/e;", "Q2", "(Ljava/io/OutputStream;J)Lvv/e;", "p", "()J", "", "readByte", "()B", "pos", "I", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "t0", "W1", "B3", "Y1", "d4", "Lvv/h;", "d0", "()Lvv/h;", "r2", "(J)Lvv/h;", "Lvv/z;", "options", "c1", "(Lvv/z;)I", "sink", "h2", "(Lvv/e;J)V", "Lvv/j0;", "A0", "(Lvv/j0;)J", "", "C0", "()Ljava/lang/String;", "n2", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "n3", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "u0", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "N1", "limit", "U0", "T0", "", "F2", "()[B", "R1", "(J)[B", "n0", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "b", "skip", "byteString", "d2", "(Lvv/h;)Lvv/e;", "string", "d3", "(Ljava/lang/String;)Lvv/e;", "beginIndex", "endIndex", "e3", "(Ljava/lang/String;II)Lvv/e;", "codePoint", "i3", "(I)Lvv/e;", "P2", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lvv/e;", "source", "j2", "([B)Lvv/e;", "t2", "([BII)Lvv/e;", "write", "Lvv/k0;", "U1", "(Lvv/k0;)J", "v2", "s", "N2", "i", "I2", "v", "y2", "(J)Lvv/e;", "A2", "minimumCapacity", "Lvv/g0;", "T1", "(I)Lvv/g0;", "O3", "k3", "(Lvv/e;J)J", "fromIndex", "toIndex", "J", "(BJJ)J", "bytes", "P0", "(Lvv/h;)J", "K", "(Lvv/h;J)J", "N", "(Lvv/h;JJ)J", "targetBytes", "v0", "O", "a0", "(JLvv/h;)Z", "bytesOffset", "c0", "(JLvv/h;II)Z", "flush", "isOpen", "close", "Lvv/l0;", "R", "()Lvv/l0;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "y", "m", "C1", "P1", "(I)Lvv/h;", "a", "Lvv/g0;", "head", "value", "size", "i1", "buffer", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public g0 head;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long size;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lvv/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "Loq/i0;", "close", "Lvv/e;", "a", "Lvv/e;", "buffer", "Lvv/g0;", "b", "Lvv/g0;", "getSegment$okio", "()Lvv/g0;", "(Lvv/g0;)V", "segment", "", "c", "J", "offset", "", "d", "[B", "data", "", "e", "I", "start", "f", "end", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public e buffer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private g0 segment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public byte[] data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public long offset = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int start = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int end = -1;

        public final void b(g0 g0Var) {
            this.segment = g0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            b(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vv/e$c", "Ljava/io/OutputStream;", "", "b", "Loq/i0;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b15) {
            e.this.writeByte(b15);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            e.this.write(data, offset, byteCount);
        }
    }

    public static /* synthetic */ e R2(e eVar, OutputStream outputStream, long j15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            j15 = eVar.size;
        }
        return eVar.Q2(outputStream, j15);
    }

    @Override // vv.g
    public long A0(j0 sink) {
        long size = getSize();
        if (size > 0) {
            sink.O3(this, size);
        }
        return size;
    }

    @Override // vv.f
    /* JADX INFO: renamed from: A2, reason: merged with bridge method [inline-methods] */
    public e r3(long v15) {
        if (v15 == 0) {
            return writeByte(48);
        }
        long j15 = (v15 >>> 1) | v15;
        long j16 = j15 | (j15 >>> 2);
        long j17 = j16 | (j16 >>> 4);
        long j18 = j17 | (j17 >>> 8);
        long j19 = j18 | (j18 >>> 16);
        long j25 = j19 | (j19 >>> 32);
        long j26 = j25 - ((j25 >>> 1) & 6148914691236517205L);
        long j27 = ((j26 >>> 2) & 3689348814741910323L) + (j26 & 3689348814741910323L);
        long j28 = ((j27 >>> 4) + j27) & 1085102592571150095L;
        long j29 = j28 + (j28 >>> 8);
        long j35 = j29 + (j29 >>> 16);
        int i15 = (int) ((((j35 & 63) + ((j35 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        g0 g0VarT1 = T1(i15);
        byte[] bArr = g0VarT1.data;
        int i16 = g0VarT1.limit;
        for (int i17 = (i16 + i15) - 1; i17 >= i16; i17--) {
            bArr[i17] = wv.a.e()[(int) (15 & v15)];
            v15 >>>= 4;
        }
        g0VarT1.limit += i15;
        i1(getSize() + ((long) i15));
        return this;
    }

    @Override // vv.g
    public int B3() {
        return vv.b.f(readInt());
    }

    public String C0() {
        return u0(this.size, fu.d.UTF_8);
    }

    public final h C1() {
        if (getSize() <= 2147483647L) {
            return P1((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    @Override // vv.g
    public byte[] F2() {
        return R1(getSize());
    }

    public final e H(e out, long offset, long byteCount) {
        long j15 = offset;
        vv.b.b(getSize(), j15, byteCount);
        if (byteCount != 0) {
            out.i1(out.getSize() + byteCount);
            g0 g0Var = this.head;
            while (true) {
                int i15 = g0Var.limit;
                int i16 = g0Var.pos;
                if (j15 < i15 - i16) {
                    break;
                }
                j15 -= (long) (i15 - i16);
                g0Var = g0Var.next;
            }
            g0 g0Var2 = g0Var;
            long j16 = byteCount;
            while (j16 > 0) {
                g0 g0VarD = g0Var2.d();
                int i17 = g0VarD.pos + ((int) j15);
                g0VarD.pos = i17;
                g0VarD.limit = Math.min(i17 + ((int) j16), g0VarD.limit);
                g0 g0Var3 = out.head;
                if (g0Var3 == null) {
                    g0VarD.prev = g0VarD;
                    g0VarD.next = g0VarD;
                    out.head = g0VarD;
                } else {
                    g0Var3.prev.c(g0VarD);
                }
                j16 -= (long) (g0VarD.limit - g0VarD.pos);
                g0Var2 = g0Var2.next;
                j15 = 0;
            }
        }
        return this;
    }

    public final byte I(long pos) {
        vv.b.b(getSize(), pos, 1L);
        g0 g0Var = this.head;
        g0Var.getClass();
        if (getSize() - pos < pos) {
            long size = getSize();
            while (size > pos) {
                g0Var = g0Var.prev;
                size -= (long) (g0Var.limit - g0Var.pos);
            }
            return g0Var.data[(int) ((((long) g0Var.pos) + pos) - size)];
        }
        long j15 = 0;
        while (true) {
            int i15 = g0Var.limit;
            int i16 = g0Var.pos;
            long j16 = ((long) (i15 - i16)) + j15;
            if (j16 > pos) {
                return g0Var.data[(int) ((((long) i16) + pos) - j15)];
            }
            g0Var = g0Var.next;
            j15 = j16;
        }
    }

    @Override // vv.f
    /* JADX INFO: renamed from: I2, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i15) {
        g0 g0VarT1 = T1(4);
        byte[] bArr = g0VarT1.data;
        int i16 = g0VarT1.limit;
        bArr[i16] = (byte) ((i15 >>> 24) & GF2Field.MASK);
        bArr[i16 + 1] = (byte) ((i15 >>> 16) & GF2Field.MASK);
        bArr[i16 + 2] = (byte) ((i15 >>> 8) & GF2Field.MASK);
        bArr[i16 + 3] = (byte) (i15 & GF2Field.MASK);
        g0VarT1.limit = i16 + 4;
        i1(getSize() + 4);
        return this;
    }

    public long J(byte b15, long fromIndex, long toIndex) {
        g0 g0Var;
        int i15;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (g0Var = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                g0Var = g0Var.prev;
                size -= (long) (g0Var.limit - g0Var.pos);
            }
            while (size < toIndex) {
                byte[] bArr = g0Var.data;
                int iMin = (int) Math.min(g0Var.limit, (((long) g0Var.pos) + toIndex) - size);
                i15 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                while (i15 < iMin) {
                    if (bArr[i15] != b15) {
                        i15++;
                    }
                }
                size += (long) (g0Var.limit - g0Var.pos);
                g0Var = g0Var.next;
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j15 = ((long) (g0Var.limit - g0Var.pos)) + size;
            if (j15 > fromIndex) {
                break;
            }
            g0Var = g0Var.next;
            size = j15;
        }
        while (size < toIndex) {
            byte[] bArr2 = g0Var.data;
            int iMin2 = (int) Math.min(g0Var.limit, (((long) g0Var.pos) + toIndex) - size);
            i15 = (int) ((((long) g0Var.pos) + fromIndex) - size);
            while (i15 < iMin2) {
                if (bArr2[i15] != b15) {
                    i15++;
                }
            }
            size += (long) (g0Var.limit - g0Var.pos);
            g0Var = g0Var.next;
            fromIndex = size;
        }
        return -1L;
        return ((long) (i15 - g0Var.pos)) + size;
    }

    public long K(h bytes, long fromIndex) {
        return N(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // vv.g
    public boolean K2() {
        return this.size == 0;
    }

    public long N(h bytes, long fromIndex, long toIndex) {
        return wv.a.c(this, bytes, fromIndex, toIndex, 0, 0, 24, null);
    }

    @Override // vv.g
    public String N1() {
        return U0(Long.MAX_VALUE);
    }

    @Override // vv.f
    /* JADX INFO: renamed from: N2, reason: merged with bridge method [inline-methods] */
    public e writeShort(int s15) {
        g0 g0VarT1 = T1(2);
        byte[] bArr = g0VarT1.data;
        int i15 = g0VarT1.limit;
        bArr[i15] = (byte) ((s15 >>> 8) & GF2Field.MASK);
        bArr[i15 + 1] = (byte) (s15 & GF2Field.MASK);
        g0VarT1.limit = i15 + 2;
        i1(getSize() + 2);
        return this;
    }

    public long O(h targetBytes, long fromIndex) {
        int i15;
        int i16;
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        g0 g0Var = this.head;
        if (g0Var == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                g0Var = g0Var.prev;
                size -= (long) (g0Var.limit - g0Var.pos);
            }
            if (targetBytes.Q() == 2) {
                byte bN = targetBytes.n(0);
                byte bN2 = targetBytes.n(1);
                while (size < getSize()) {
                    byte[] bArr = g0Var.data;
                    i15 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                    int i17 = g0Var.limit;
                    while (true) {
                        if (i15 >= i17) {
                            size += (long) (g0Var.limit - g0Var.pos);
                            g0Var = g0Var.next;
                            fromIndex = size;
                        } else {
                            byte b15 = bArr[i15];
                            if (b15 == bN || b15 == bN2) {
                                i16 = g0Var.pos;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrA = targetBytes.A();
                while (size < getSize()) {
                    byte[] bArr2 = g0Var.data;
                    i15 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                    int i18 = g0Var.limit;
                    while (true) {
                        if (i15 < i18) {
                            byte b16 = bArr2[i15];
                            int length = bArrA.length;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= length) {
                                    i15++;
                                } else if (b16 == bArrA[i19]) {
                                    i16 = g0Var.pos;
                                } else {
                                    i19++;
                                }
                            }
                        } else {
                            size += (long) (g0Var.limit - g0Var.pos);
                            g0Var = g0Var.next;
                            fromIndex = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j15 = ((long) (g0Var.limit - g0Var.pos)) + size;
            if (j15 > fromIndex) {
                break;
            }
            g0Var = g0Var.next;
            size = j15;
        }
        if (targetBytes.Q() == 2) {
            byte bN3 = targetBytes.n(0);
            byte bN4 = targetBytes.n(1);
            while (size < getSize()) {
                byte[] bArr3 = g0Var.data;
                i15 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                int i25 = g0Var.limit;
                while (true) {
                    if (i15 >= i25) {
                        size += (long) (g0Var.limit - g0Var.pos);
                        g0Var = g0Var.next;
                        fromIndex = size;
                    } else {
                        byte b17 = bArr3[i15];
                        if (b17 == bN3 || b17 == bN4) {
                            i16 = g0Var.pos;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrA2 = targetBytes.A();
            while (size < getSize()) {
                byte[] bArr4 = g0Var.data;
                i15 = (int) ((((long) g0Var.pos) + fromIndex) - size);
                int i26 = g0Var.limit;
                while (true) {
                    if (i15 < i26) {
                        byte b18 = bArr4[i15];
                        int length2 = bArrA2.length;
                        int i27 = 0;
                        while (true) {
                            if (i27 >= length2) {
                                i15++;
                            } else if (b18 == bArrA2[i27]) {
                                i16 = g0Var.pos;
                            } else {
                                i27++;
                            }
                        }
                    } else {
                        size += (long) (g0Var.limit - g0Var.pos);
                        g0Var = g0Var.next;
                        fromIndex = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i15 - i16)) + size;
    }

    @Override // vv.j0
    public void O3(e source, long byteCount) {
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        vv.b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            g0 g0Var = source.head;
            if (byteCount < g0Var.limit - g0Var.pos) {
                g0 g0Var2 = this.head;
                g0 g0Var3 = g0Var2 != null ? g0Var2.prev : null;
                if (g0Var3 != null && g0Var3.owner) {
                    if ((((long) g0Var3.limit) + byteCount) - ((long) (g0Var3.shared ? 0 : g0Var3.pos)) <= 8192) {
                        g0Var.f(g0Var3, (int) byteCount);
                        source.i1(source.getSize() - byteCount);
                        i1(getSize() + byteCount);
                        return;
                    }
                }
                source.head = g0Var.e((int) byteCount);
            }
            g0 g0Var4 = source.head;
            long j15 = g0Var4.limit - g0Var4.pos;
            source.head = g0Var4.b();
            g0 g0Var5 = this.head;
            if (g0Var5 == null) {
                this.head = g0Var4;
                g0Var4.prev = g0Var4;
                g0Var4.next = g0Var4;
            } else {
                g0Var5.prev.c(g0Var4).a();
            }
            source.i1(source.getSize() - j15);
            i1(getSize() + j15);
            byteCount -= j15;
        }
    }

    @Override // vv.g
    public long P0(h bytes) {
        return K(bytes, 0L);
    }

    public final h P1(int byteCount) {
        if (byteCount == 0) {
            return h.f208378e;
        }
        vv.b.b(getSize(), 0L, byteCount);
        g0 g0Var = this.head;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < byteCount) {
            int i18 = g0Var.limit;
            int i19 = g0Var.pos;
            if (i18 == i19) {
                throw new AssertionError("s.limit == s.pos");
            }
            i16 += i18 - i19;
            i17++;
            g0Var = g0Var.next;
        }
        byte[][] bArr = new byte[i17][];
        int[] iArr = new int[i17 * 2];
        g0 g0Var2 = this.head;
        int i25 = 0;
        while (i15 < byteCount) {
            bArr[i25] = g0Var2.data;
            i15 += g0Var2.limit - g0Var2.pos;
            iArr[i25] = Math.min(i15, byteCount);
            iArr[i25 + i17] = g0Var2.pos;
            g0Var2.shared = true;
            i25++;
            g0Var2 = g0Var2.next;
        }
        return new i0(bArr, iArr);
    }

    public e P2(String string, int beginIndex, int endIndex, Charset charset) {
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex <= string.length()) {
            if (fr.t.c(charset, fu.d.UTF_8)) {
                return v1(string, beginIndex, endIndex);
            }
            byte[] bytes = string.substring(beginIndex, endIndex).getBytes(charset);
            return write(bytes, 0, bytes.length);
        }
        throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
    }

    public final e Q2(OutputStream out, long byteCount) throws IOException {
        vv.b.b(this.size, 0L, byteCount);
        g0 g0Var = this.head;
        long j15 = byteCount;
        while (j15 > 0) {
            int iMin = (int) Math.min(j15, g0Var.limit - g0Var.pos);
            out.write(g0Var.data, g0Var.pos, iMin);
            int i15 = g0Var.pos + iMin;
            g0Var.pos = i15;
            long j16 = iMin;
            this.size -= j16;
            j15 -= j16;
            if (i15 == g0Var.limit) {
                g0 g0VarB = g0Var.b();
                this.head = g0VarB;
                h0.b(g0Var);
                g0Var = g0VarB;
            }
        }
        return this;
    }

    @Override // vv.k0
    /* JADX INFO: renamed from: R */
    public l0 getF208341a() {
        return l0.f208410e;
    }

    @Override // vv.g
    public byte[] R1(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        n0(bArr);
        return bArr;
    }

    public int T0() throws EOFException {
        int i15;
        int i16;
        int i17;
        if (getSize() == 0) {
            throw new EOFException();
        }
        byte bI = I(0L);
        if ((bI & 128) == 0) {
            i15 = bI & 127;
            i17 = 0;
            i16 = 1;
        } else if ((bI & 224) == 192) {
            i15 = bI & 31;
            i16 = 2;
            i17 = 128;
        } else if ((bI & 240) == 224) {
            i15 = bI & 15;
            i16 = 3;
            i17 = 2048;
        } else {
            if ((bI & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i15 = bI & 7;
            i16 = 4;
            i17 = PKIFailureInfo.notAuthorized;
        }
        long j15 = i16;
        if (getSize() < j15) {
            throw new EOFException("size < " + i16 + ": " + getSize() + " (to read code point prefixed 0x" + vv.b.i(bI) + ')');
        }
        for (int i18 = 1; i18 < i16; i18++) {
            long j16 = i18;
            byte bI2 = I(j16);
            if ((bI2 & 192) != 128) {
                skip(j16);
                return 65533;
            }
            i15 = (i15 << 6) | (bI2 & 63);
        }
        skip(j15);
        if (i15 > 1114111) {
            return 65533;
        }
        if ((55296 > i15 || i15 >= 57344) && i15 >= i17) {
            return i15;
        }
        return 65533;
    }

    public final g0 T1(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        g0 g0Var = this.head;
        if (g0Var != null) {
            g0 g0Var2 = g0Var.prev;
            return (g0Var2.limit + minimumCapacity > 8192 || !g0Var2.owner) ? g0Var2.c(h0.c()) : g0Var2;
        }
        g0 g0VarC = h0.c();
        this.head = g0VarC;
        g0VarC.prev = g0VarC;
        g0VarC.next = g0VarC;
        return g0VarC;
    }

    @Override // vv.g
    public String U0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j15 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long J = J((byte) 10, 0L, j15);
        if (J != -1) {
            return wv.a.g(this, J);
        }
        if (j15 < getSize() && I(j15 - 1) == 13 && I(j15) == 10) {
            return wv.a.g(this, j15);
        }
        e eVar = new e();
        H(eVar, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + eVar.d0().t() + (char) 8230);
    }

    @Override // vv.f
    public long U1(k0 source) {
        long j15 = 0;
        while (true) {
            long jK3 = source.k3(this, 8192L);
            if (jK3 == -1) {
                return j15;
            }
            j15 += jK3;
        }
    }

    @Override // vv.g
    public short W1() {
        return vv.b.h(readShort());
    }

    @Override // vv.g
    public long Y1() {
        return vv.b.g(t0());
    }

    public boolean a0(long offset, h bytes) {
        return c0(offset, bytes, 0, bytes.Q());
    }

    public final void b() throws EOFException {
        skip(getSize());
    }

    @Override // vv.f
    public OutputStream b4() {
        return new c();
    }

    public boolean c0(long offset, h bytes, int bytesOffset, int byteCount) {
        return byteCount >= 0 && offset >= 0 && ((long) byteCount) + offset <= getSize() && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.Q() && (byteCount == 0 || wv.a.b(this, bytes, offset, offset + 1, bytesOffset, byteCount) != -1);
    }

    @Override // vv.g
    public int c1(z options) throws EOFException {
        int i15 = wv.a.i(this, options, false, 2, null);
        if (i15 == -1) {
            return -1;
        }
        skip(options.getByteStrings()[i15].Q());
        return i15;
    }

    @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public h d0() {
        return r2(getSize());
    }

    @Override // vv.f
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public e M0(h byteString) {
        byteString.a0(this, 0, byteString.Q());
        return this;
    }

    @Override // vv.f
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public e k1(String string) {
        return v1(string, 0, string.length());
    }

    @Override // vv.g
    public long d4() throws EOFException {
        int i15;
        if (getSize() == 0) {
            throw new EOFException();
        }
        int i16 = 0;
        boolean z15 = false;
        long j15 = 0;
        do {
            g0 g0Var = this.head;
            byte[] bArr = g0Var.data;
            int i17 = g0Var.pos;
            int i18 = g0Var.limit;
            while (i17 < i18) {
                byte b15 = bArr[i17];
                if (b15 >= 48 && b15 <= 57) {
                    i15 = b15 - 48;
                } else if (b15 >= 97 && b15 <= 102) {
                    i15 = b15 - 87;
                } else {
                    if (b15 < 65 || b15 > 70) {
                        if (i16 != 0) {
                            z15 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + vv.b.i(b15));
                    }
                    i15 = b15 - 55;
                }
                if (((-1152921504606846976L) & j15) != 0) {
                    throw new NumberFormatException("Number too large: " + new e().r3(j15).writeByte(b15).C0());
                }
                j15 = (j15 << 4) | ((long) i15);
                i17++;
                i16++;
            }
            if (i17 == i18) {
                this.head = g0Var.b();
                h0.b(g0Var);
            } else {
                g0Var.pos = i17;
            }
            if (z15) {
                break;
            }
        } while (this.head != null);
        i1(getSize() - ((long) i16));
        return j15;
    }

    @Override // vv.f
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public e v1(String string, int beginIndex, int endIndex) {
        char cCharAt;
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char cCharAt2 = string.charAt(beginIndex);
            if (cCharAt2 < 128) {
                g0 g0VarT1 = T1(1);
                byte[] bArr = g0VarT1.data;
                int i15 = g0VarT1.limit - beginIndex;
                int iMin = Math.min(endIndex, 8192 - i15);
                int i16 = beginIndex + 1;
                bArr[beginIndex + i15] = (byte) cCharAt2;
                while (true) {
                    beginIndex = i16;
                    if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i16 = beginIndex + 1;
                    bArr[beginIndex + i15] = (byte) cCharAt;
                }
                int i17 = g0VarT1.limit;
                int i18 = (i15 + beginIndex) - i17;
                g0VarT1.limit = i17 + i18;
                i1(getSize() + ((long) i18));
            } else {
                if (cCharAt2 < 2048) {
                    g0 g0VarT2 = T1(2);
                    byte[] bArr2 = g0VarT2.data;
                    int i19 = g0VarT2.limit;
                    bArr2[i19] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i19 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    g0VarT2.limit = i19 + 2;
                    i1(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    g0 g0VarT3 = T1(3);
                    byte[] bArr3 = g0VarT3.data;
                    int i25 = g0VarT3.limit;
                    bArr3[i25] = (byte) ((cCharAt2 >> '\f') | BERTags.FLAGS);
                    bArr3[i25 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i25 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    g0VarT3.limit = i25 + 3;
                    i1(getSize() + 3);
                } else {
                    int i26 = beginIndex + 1;
                    char cCharAt3 = i26 < endIndex ? string.charAt(i26) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i26;
                    } else {
                        int i27 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + PKIFailureInfo.notAuthorized;
                        g0 g0VarT4 = T1(4);
                        byte[] bArr4 = g0VarT4.data;
                        int i28 = g0VarT4.limit;
                        bArr4[i28] = (byte) ((i27 >> 18) | 240);
                        bArr4[i28 + 1] = (byte) (((i27 >> 12) & 63) | 128);
                        bArr4[i28 + 2] = (byte) (((i27 >> 6) & 63) | 128);
                        bArr4[i28 + 3] = (byte) ((i27 & 63) | 128);
                        g0VarT4.limit = i28 + 4;
                        i1(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        if (getSize() != eVar.getSize()) {
            return false;
        }
        if (getSize() == 0) {
            return true;
        }
        g0 g0Var = this.head;
        g0 g0Var2 = eVar.head;
        int i15 = g0Var.pos;
        int i16 = g0Var2.pos;
        long j15 = 0;
        while (j15 < getSize()) {
            long jMin = Math.min(g0Var.limit - i15, g0Var2.limit - i16);
            long j16 = 0;
            while (j16 < jMin) {
                int i17 = i15 + 1;
                int i18 = i16 + 1;
                if (g0Var.data[i15] != g0Var2.data[i16]) {
                    return false;
                }
                j16++;
                i15 = i17;
                i16 = i18;
            }
            if (i15 == g0Var.limit) {
                g0Var = g0Var.next;
                i15 = g0Var.pos;
            }
            if (i16 == g0Var2.limit) {
                g0Var2 = g0Var2.next;
                i16 = g0Var2.pos;
            }
            j15 += jMin;
        }
        return true;
    }

    @Override // vv.g
    public InputStream f4() {
        return new b();
    }

    @Override // vv.f, vv.j0, java.io.Flushable
    public void flush() {
    }

    @Override // vv.g
    public void g2(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // vv.g
    public void h2(e sink, long byteCount) throws EOFException {
        if (getSize() >= byteCount) {
            sink.O3(this, byteCount);
        } else {
            sink.O3(this, getSize());
            throw new EOFException();
        }
    }

    public int hashCode() {
        g0 g0Var = this.head;
        if (g0Var == null) {
            return 0;
        }
        int i15 = 1;
        do {
            int i16 = g0Var.limit;
            for (int i17 = g0Var.pos; i17 < i16; i17++) {
                i15 = (i15 * 31) + g0Var.data[i17];
            }
            g0Var = g0Var.next;
        } while (g0Var != this.head);
        return i15;
    }

    public final void i1(long j15) {
        this.size = j15;
    }

    public e i3(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            g0 g0VarT1 = T1(2);
            byte[] bArr = g0VarT1.data;
            int i15 = g0VarT1.limit;
            bArr[i15] = (byte) ((codePoint >> 6) | 192);
            bArr[i15 + 1] = (byte) ((codePoint & 63) | 128);
            g0VarT1.limit = i15 + 2;
            i1(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            g0 g0VarT2 = T1(3);
            byte[] bArr2 = g0VarT2.data;
            int i16 = g0VarT2.limit;
            bArr2[i16] = (byte) ((codePoint >> 12) | BERTags.FLAGS);
            bArr2[i16 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i16 + 2] = (byte) ((codePoint & 63) | 128);
            g0VarT2.limit = i16 + 3;
            i1(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + vv.b.j(codePoint));
        }
        g0 g0VarT3 = T1(4);
        byte[] bArr3 = g0VarT3.data;
        int i17 = g0VarT3.limit;
        bArr3[i17] = (byte) ((codePoint >> 18) | 240);
        bArr3[i17 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i17 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i17 + 3] = (byte) ((codePoint & 63) | 128);
        g0VarT3.limit = i17 + 4;
        i1(getSize() + 4);
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // vv.f
    /* JADX INFO: renamed from: j2, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source) {
        return write(source, 0, source.length);
    }

    @Override // vv.k0
    public long k3(e sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (byteCount > getSize()) {
            byteCount = getSize();
        }
        sink.O3(this, byteCount);
        return byteCount;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return y();
    }

    public void n0(byte[] sink) throws EOFException {
        int i15 = 0;
        while (i15 < sink.length) {
            int i16 = read(sink, i15, sink.length - i15);
            if (i16 == -1) {
                throw new EOFException();
            }
            i15 += i16;
        }
    }

    @Override // vv.g
    public String n2(long byteCount) throws EOFException {
        return u0(byteCount, fu.d.UTF_8);
    }

    @Override // vv.g
    public String n3(Charset charset) {
        return u0(this.size, charset);
    }

    public final long p() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        g0 g0Var = this.head.prev;
        int i15 = g0Var.limit;
        return (i15 >= 8192 || !g0Var.owner) ? size : size - ((long) (i15 - g0Var.pos));
    }

    @Override // vv.g
    public g peek() {
        return v.c(new c0(this));
    }

    @Override // vv.g
    public h r2(long byteCount) {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new h(R1(byteCount));
        }
        h hVarP1 = P1((int) byteCount);
        skip(byteCount);
        return hVarP1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        g0 g0Var = this.head;
        if (g0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), g0Var.limit - g0Var.pos);
        sink.put(g0Var.data, g0Var.pos, iMin);
        int i15 = g0Var.pos + iMin;
        g0Var.pos = i15;
        this.size -= (long) iMin;
        if (i15 == g0Var.limit) {
            this.head = g0Var.b();
            h0.b(g0Var);
        }
        return iMin;
    }

    @Override // vv.g
    public byte readByte() {
        if (getSize() == 0) {
            throw new EOFException();
        }
        g0 g0Var = this.head;
        int i15 = g0Var.pos;
        int i16 = g0Var.limit;
        int i17 = i15 + 1;
        byte b15 = g0Var.data[i15];
        i1(getSize() - 1);
        if (i17 != i16) {
            g0Var.pos = i17;
            return b15;
        }
        this.head = g0Var.b();
        h0.b(g0Var);
        return b15;
    }

    @Override // vv.g
    public int readInt() throws EOFException {
        if (getSize() < 4) {
            throw new EOFException();
        }
        g0 g0Var = this.head;
        int i15 = g0Var.pos;
        int i16 = g0Var.limit;
        if (i16 - i15 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = g0Var.data;
        int i17 = i15 + 3;
        int i18 = ((bArr[i15 + 1] & 255) << 16) | ((bArr[i15] & 255) << 24) | ((bArr[i15 + 2] & 255) << 8);
        int i19 = i15 + 4;
        int i25 = (bArr[i17] & 255) | i18;
        i1(getSize() - 4);
        if (i19 != i16) {
            g0Var.pos = i19;
            return i25;
        }
        this.head = g0Var.b();
        h0.b(g0Var);
        return i25;
    }

    @Override // vv.g
    public short readShort() throws EOFException {
        if (getSize() < 2) {
            throw new EOFException();
        }
        g0 g0Var = this.head;
        int i15 = g0Var.pos;
        int i16 = g0Var.limit;
        if (i16 - i15 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = g0Var.data;
        int i17 = i15 + 1;
        int i18 = (bArr[i15] & 255) << 8;
        int i19 = i15 + 2;
        int i25 = (bArr[i17] & 255) | i18;
        i1(getSize() - 2);
        if (i19 == i16) {
            this.head = g0Var.b();
            h0.b(g0Var);
        } else {
            g0Var.pos = i19;
        }
        return (short) i25;
    }

    @Override // vv.g
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // vv.g
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            g0 g0Var = this.head;
            if (g0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, g0Var.limit - g0Var.pos);
            long j15 = iMin;
            i1(getSize() - j15);
            byteCount -= j15;
            int i15 = g0Var.pos + iMin;
            g0Var.pos = i15;
            if (i15 == g0Var.limit) {
                this.head = g0Var.b();
                h0.b(g0Var);
            }
        }
    }

    public long t0() throws EOFException {
        if (getSize() < 8) {
            throw new EOFException();
        }
        g0 g0Var = this.head;
        int i15 = g0Var.pos;
        int i16 = g0Var.limit;
        if (i16 - i15 < 8) {
            return ((((long) readInt()) & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & ((long) readInt()));
        }
        byte[] bArr = g0Var.data;
        int i17 = i15 + 7;
        long j15 = ((((long) bArr[i15]) & 255) << 56) | ((((long) bArr[i15 + 1]) & 255) << 48) | ((((long) bArr[i15 + 2]) & 255) << 40) | ((((long) bArr[i15 + 3]) & 255) << 32) | ((((long) bArr[i15 + 4]) & 255) << 24) | ((((long) bArr[i15 + 5]) & 255) << 16) | ((((long) bArr[i15 + 6]) & 255) << 8);
        int i18 = i15 + 8;
        long j16 = j15 | (((long) bArr[i17]) & 255);
        i1(getSize() - 8);
        if (i18 != i16) {
            g0Var.pos = i18;
            return j16;
        }
        this.head = g0Var.b();
        h0.b(g0Var);
        return j16;
    }

    @Override // vv.f
    /* JADX INFO: renamed from: t2, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source, int offset, int byteCount) {
        long j15 = byteCount;
        vv.b.b(source.length, offset, j15);
        int i15 = byteCount + offset;
        while (offset < i15) {
            g0 g0VarT1 = T1(1);
            int iMin = Math.min(i15 - offset, 8192 - g0VarT1.limit);
            int i16 = offset + iMin;
            pq.n.i(source, g0VarT1.data, g0VarT1.limit, offset, i16);
            g0VarT1.limit += iMin;
            offset = i16;
        }
        i1(getSize() + j15);
        return this;
    }

    public String toString() {
        return C1().toString();
    }

    public String u0(long byteCount, Charset charset) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        g0 g0Var = this.head;
        int i15 = g0Var.pos;
        if (((long) i15) + byteCount > g0Var.limit) {
            return new String(R1(byteCount), charset);
        }
        int i16 = (int) byteCount;
        String str = new String(g0Var.data, i15, i16, charset);
        int i17 = g0Var.pos + i16;
        g0Var.pos = i17;
        this.size -= byteCount;
        if (i17 == g0Var.limit) {
            this.head = g0Var.b();
            h0.b(g0Var);
        }
        return str;
    }

    @Override // vv.g, vv.f
    public e v() {
        return this;
    }

    @Override // vv.g
    public long v0(h targetBytes) {
        return O(targetBytes, 0L);
    }

    @Override // vv.f
    /* JADX INFO: renamed from: v2, reason: merged with bridge method [inline-methods] */
    public e writeByte(int b15) {
        g0 g0VarT1 = T1(1);
        byte[] bArr = g0VarT1.data;
        int i15 = g0VarT1.limit;
        g0VarT1.limit = i15 + 1;
        bArr[i15] = (byte) b15;
        i1(getSize() + 1);
        return this;
    }

    public final e y() {
        e eVar = new e();
        if (getSize() == 0) {
            return eVar;
        }
        g0 g0Var = this.head;
        g0 g0VarD = g0Var.d();
        eVar.head = g0VarD;
        g0VarD.prev = g0VarD;
        g0VarD.next = g0VarD;
        for (g0 g0Var2 = g0Var.next; g0Var2 != g0Var; g0Var2 = g0Var2.next) {
            g0VarD.prev.c(g0Var2.d());
        }
        eVar.i1(getSize());
        return eVar;
    }

    @Override // vv.g
    public e y0() {
        return this;
    }

    @Override // vv.f
    /* JADX INFO: renamed from: y2, reason: merged with bridge method [inline-methods] */
    public e k2(long v15) {
        boolean z15;
        if (v15 == 0) {
            return writeByte(48);
        }
        if (v15 < 0) {
            v15 = -v15;
            if (v15 < 0) {
                return k1("-9223372036854775808");
            }
            z15 = true;
        } else {
            z15 = false;
        }
        int iD = wv.a.d(v15);
        if (z15) {
            iD++;
        }
        g0 g0VarT1 = T1(iD);
        byte[] bArr = g0VarT1.data;
        int i15 = g0VarT1.limit + iD;
        while (v15 != 0) {
            long j15 = 10;
            i15--;
            bArr[i15] = wv.a.e()[(int) (v15 % j15)];
            v15 /= j15;
        }
        if (z15) {
            bArr[i15 - 1] = 45;
        }
        g0VarT1.limit += iD;
        i1(getSize() + ((long) iD));
        return this;
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"vv/e$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "Loq/i0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (e.this.getSize() > 0) {
                return e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            return e.this.read(sink, offset, byteCount);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        int iRemaining = source.remaining();
        int i15 = iRemaining;
        while (i15 > 0) {
            g0 g0VarT1 = T1(1);
            int iMin = Math.min(i15, 8192 - g0VarT1.limit);
            source.get(g0VarT1.data, g0VarT1.limit, iMin);
            i15 -= iMin;
            g0VarT1.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] sink, int offset, int byteCount) {
        vv.b.b(sink.length, offset, byteCount);
        g0 g0Var = this.head;
        if (g0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, g0Var.limit - g0Var.pos);
        byte[] bArr = g0Var.data;
        int i15 = g0Var.pos;
        pq.n.i(bArr, sink, offset, i15, i15 + iMin);
        g0Var.pos += iMin;
        i1(getSize() - ((long) iMin));
        if (g0Var.pos == g0Var.limit) {
            this.head = g0Var.b();
            h0.b(g0Var);
        }
        return iMin;
    }
}
